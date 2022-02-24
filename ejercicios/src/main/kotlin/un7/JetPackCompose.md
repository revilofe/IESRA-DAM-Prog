# Introducción a Jetpack Compose

Jetpack Compose es la nueva forma de programar interfaces de usuario propuesta por Google en 2019.

Google liberó su versión Beta en Febrero de 2021. Podemos empezar ya a incluir Jetpack Compose en nuestras apps ya que Google ha anunciado que la especificación del API no variará.

Esta tecnología sigue la misma dirección que Swift UI o Flutter usando un paradigma declarativo. Esto es un buen síntoma ya que diferentes plataformas siguen una misma dirección.

Jetpack Compose se convertirá este año en el nuevo estándar de desarrollo de interfaces de usuario en Android.

Las ventajas principales de Jetpack Compose son:

* Menos código para construir interfaces.
* Código mucho más intuitivo.
* Facilidad a la hora de reutilizar componentes.
* Programación de vistas en Kotlin.

## Imperativa:

Se define paso a paso la casuistica de la aplicación, es decir, cuando se pinta algo, cuando cambia de color, etc.... Se indica a través del código lo que tiene que hacer y como tiene que hacerlo.

Manipular las vistas de forma manual

- Aumenta la probabilidad de errores:
- Es fácil olvidarse de actualizar estados de vistas.
- Es fácil crear estados ilegales (conflicto de actualizaciones)
- El mantenimiento de los estados de las vistas se hace complejo.

## Declarativa:

La mayoría de las veces usamos un paradigma imperativo a la hora de programar aplicaciones, aunque la industria está migrando a un modelo de UI declarativo:

Con Jetpack Compose tenemos que cambiar nuestra mentalidad para empezar a utilizar un **paradigma declarativo** :

* Nuestra interfaz de usuario estará controlada por distintos **estados** que se irán actualizando.
* Cada vez que un estado cambie, la interfaz se refrescará y se producirá una  **recomposición** .
* Para lidiar con la  **recomposición** , tendremos que contemplar todos los posibles estados con anterioridad.
* Es costoso en términos computacionales: **Recomposición**.
* Aunque al principio parezca más complicado, este paradigma reduce la inconsistencia de estados, favorece la legibilidad del código y la reutilización de los componentes.
*

## Composición:

Las funciones etiquetadas con una anotación `@composable`

- Funciones que reciben datos y emiten elementos de UI
- Puedes usar for, if, etc para genera la potencia del lenguaje.

Todas las funciones que admiten composición deben ser anotadas con @Composable.

- Las funciones que admiten composición pueden aceptar parámetros. La lógica de la aplicación describe la UI.
- `Text()` es también una función que admite composición y que se encarga de crear el elemento en la UI.

## Modo Preview

De igual forma que teníamos una vista previa para los ficheros XML de Android, también la tenemos para el código que construimos con Jetpack Compose  *[@Preview](https://github.com/Preview "@Preview")* .

Tenemos tres tipos de modo de maquetación:  *Code* , *Split* (vista recomendada) y  *Design* .

*Split* y *Design* incorporan un modo interactivo (Interactive) que permite al desarrollador interactuar con la interfaz al igual que si estuviese interactuando con la aplicación móvil en un emulador.

Para que nuestra interfaz aparezca en el modo interactivo tenemos que crear una función `@Composable` y anotarla con la anotación `@Preview`.

```kotlin
@Preview(showBackground = true)  
@Composable  
fun DefaultPreview() {  
    MyApplicationTheme {  
      Greeting("mates!!")
    }  
}
```

Recuerda intentar indicar en la sección de `@Preview` el mismo codigo que le pasas a la función `setContent`. De esta forma siempre podrás ver en la previsualización el contenido final de la pantalla.

```kotlin
setContent {  
  MyApplicationTheme {  
      Surface(color = MaterialTheme.colors.background) {  
          Greeting("mates!!")  
      }  
  }
}
```

Si la pantalla de preview desaparece, recuerda cerrar la clase y volver a abrirla. Android Studio realiza un análisis de código sobre la clase en busca de una función *[@Preview](https://github.com/Preview "@Preview")* para lanzar la previsualización.

Hablaremos más adelante sobre el parámetro  *showBackground* .

# Primeros componentes

## Mostrar etiquetas:

Como se puede observar en el codigo de abajo, la función `Greeting` contiene un elemento  `Text`, y esta tambien es una funcion etiquetada con `@Composable`.

```kotlin
@Composable  
fun Greeting(name: String) {  
    Text(text = "Hello $name!")  
}
```

`Text` es una función propia del SDK de Android que admite composición.

`Text` admite por parámetro argumentos como  `text`, `modifier`, `color`, `fontSize` , etc.

Dichos parámetros pueden ser requeridos (como en el caso de  *text* ) o no requeridos con valores por defecto ( *color* , *modifier* ). Consulta los parametros de la funcion `Text`.

Siempre que cambiemos valores de la interfaz, recuerda usar la opción *Build Refresh* para actualizar los valores en la Preview.

Se pueden incluir funciones Compose definidas en el SDK de Android directamente en la función  `setContent` :

```kotlin
class MainActivity : ComponentActivity() {  
    override fun onCreate(savedInstanceState: Bundle?) {  
        super.onCreate(savedInstanceState)  
        setContent {  
          Text(text = "Hello mates!!")  
        }  
    }  
}
```

El nombre de las funciones que admiten composición ¿¿¿¿no????? empieza por letra mayúscula, ya que estas funciones actúan como widgets.

Las funciones *[@Composable](https://github.com/Composable "@Composable")* *no están ligadas* a ninguna clase, pueden ser definidas en cualquier sitio.

## Creación de un botón y manejo de eventos

Al igual que `Text()` , `Button()` es otra función composable ofrecida por el SDK de Android.

```kotlin
@Composable  
fun GreetingButton() {  
    Button(onClick = {  
        // Do something  
    }) {

    }  
}
```

Uno de los parámetros que recibe la función `Button()` es la función bajo el argumento  `onClick` , que actúa como callback, y que será notificado cada vez que se produzca un evento click sobre el botón.

Button tiene como argumento una función lambda, que admite composición, llamada  `RowScope`. Mediante esta función podemos añadir textos, iconos, imágenes, etc, ya que `Button()` no tiene ningún contenido por defecto.

```kotlin
@Composable  
fun GreetingButton() {  
    Button(onClick = {  
      // Do something  
    }) {  
      GreetingText(name = "mates!")  
    }  
}
```

`RowScope` es un contenedor de elementos de forma horizontal. Si añadimos más componentes al `RowScope` del componente `Button()` éstos se alinearán consecutivamente de forma horizontal.

# Modificar componentes

## Modifiers

Todos los elementos Composable que ofrece el SDK de Android aceptan un parámetro llamado  *Modifier* .

`Modifier` es una clase estática a la que se puede acceder sin necesidad de ser instanciada y desde cualquier lugar de nuestra aplicación. Tiene funciones para especificar parámetros como la anchura, altura, el tamaño total, padding, etc, de un componente.

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello $name!",  
      modifier = Modifier.width(80.dp))  
}
```

Los métodos de `Modifier()` implementan **method chaining pattern** de forma que permiten concatenar varias llamadas a métodos en la misma cadena pudiendo establecer varios parámetros en una única expresión.

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello $name!",  
      modifier = Modifier  
            .width(80.dp)  
            .height(240.dp))  
}
```

Los valores para `width()`, `height()`, y otras funciones, se establece en `DP`. Los `DP` son objetos de la inline class `DP`.

Como alternativa, usando el método `size()` podemos establecer valores para la anchura y para la altura de un componente, pasándole valores DP.

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello $name!",  
      modifier = Modifier  
            .size(width = 80.dp, height = 240.dp))  
}
```

Si no se indican los parámetros de `width()`, `height()`, el mismo valor será aplicado para ambos parámetros haciendo que el componente sea cuadrado.

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello $name!",  
      modifier = Modifier  
            .size(80.dp))  
}
```

`fillMaxSize` permite al componente ocupar todo el espacio que ocupa su componente padre.

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello $name!",  
      modifier = Modifier  
            .fillMaxSize())  
}
```

`fillMaxHeight` permite al componente ocupar todo el espacio en altura que ocupa su componente padre. La anchura se mantiene como `wrap_content`.

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello $name!",  
      modifier = Modifier  
            .fillMaxHeight())  
}
```

`fillMaxWidth` permite al componente ocupar todo el espacio en anchura que ocupa su componente padre. La altura se mantiene como `wrap_content`.

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello $name!",  
      modifier = Modifier  
            .fillMaxWidth())  
}
```

`fillMaxWidth()` y `fillMaxHeight()` aceptan como argumento fracciones (de `0` a `1`) que indican el máximo espacio que queremos que ocupe nuestro componente dentro de su componente padre.

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello $name!",  
      modifier = Modifier  
            .fillMaxWidth(0.5f))  
}
```

## Eventos de click, padding y orden de modificadores

La clase `Modifier` permite hacer cualquier componente Compose clickable. Al igual que en el caso del componente  `Button()` , `Modifier` acepta una función como parámetro del método `clickeable()` que se invocará cada vez que se produzca un evento de click sobre el componente.

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello $name!",  
        modifier = Modifier  
            .width(80.dp)  
            .height(240.dp)  
            .clickable {  
              //Do something  
            })  
}
```

Recuerda que activando la opción **Interactive Mode** de la preview de Compose (en la ruta: `File -> Settings -> Experimental`, al ser experimental puede no aparecer o fallar) podrás ver cómo tu elemento ahora se resalta cuando es seleccionado indicando que se puede hacer click sobre él.

Puedes añadir padding (El padding es un espacio situado entre los bordes de la vista y su contenido) a tu componente usando el método `padding()` del `Modifier`. El valor se establece en `DP`.

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello $name!",  
          modifier = Modifier  
            .padding(all = 20.dp)  
    )  
}
```

El método `padding()` puede ser aplicado a todos los lados del componente usando **all** o indicar el lado o los lados específicos:  **top** ,  **start** , **bottom** y **end** donde se desee aplicar.

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello $name!",  
        modifier = Modifier  
            .width(80.dp)  
            .height(240.dp)  
            .clickable {  
              //Do something  
            })
            .padding(top = 20.dp)
}
```

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello $name!",  
        modifier = Modifier  
            .width(80.dp)  
            .height(240.dp)  
            .clickable {  
              //Do something  
            })
            .padding(top = 20.dp, bottom = 20.dp)
}
```

**El orden de los modificadores importa**. Si se aplica el método `padding()` como último elemento de la cadena el componente `Text()`* será clickable en su totalidad, incluyendo las dimensiones del padding. Si el método es aplicado antes que el método `clickeable()` la zona clickable del componente excluirá el padding indicado.

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello $name!",  
        modifier = Modifier  
            .width(80.dp)  
            .height(240.dp)
            .padding(top = 20.dp, bottom = 20.dp)  
            .clickable {  
                  //Do something  
                })
}
```

# Customizar un componente

## TextStyle

La clase `TextStyle` permite customizar aspectos de un componente Composable:

* Color del texto.
* Tamaño del texto.
* Tipografía.
* Espacio entre letras.
* Indentación.
* etc.

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello: $name",  
        style = TextStyle(  
            color = Color.Red,  
            fontWeight = FontWeight.SemiBold,  
            fontSize = 18.sp)  
    )  
}
```

Jetpack Compose ya provee de estilos, llamados [Material Design](https://material.io/design) (consulta la URL), y como hemos comentado ya están predefinidos para poder usar en nuestros componentes a través de la clase `MatherialTheme`. Los siguientes estilos son de la clase `TextStyle`:

* `h1`.
* `h2`.
* `button`.
* `caption`.
* `body`.
* etc.

Podemos aplicar un `style` de tipo `TextStyle` predefinido como por ejemplo `MaterialTheme.typography.h5` y sobrescribir algún parámetro concreto por ejempo el `fontWeight` haciendo uso de los valores ya predefinidos como `FontWeight.SemiBold`

```kotlin
@Composable  
fun GreetingText(name: String) {  
    Text(text = "Hello: $name",  
        style = MaterialTheme.typography.h5,  
        fontWeight = FontWeight.SemiBold  
    )  
}
```

`FontWeight` y `MatherialTheme` son una clase companion object de Kotlin, en las que todos sus componentes son estáticos y accesible desde los componentes.

# Contenedores

## Layouts: El componente `Surface`

El componente `Surface()` es un componente `@componsable` que representa un bloque de UI que podemos añadir a nuestra interfaz y que puede tener color, modificadores, etc. y contener otros componentes, en concreto uno, a través de una lamda.
Si no le aplicamos modificadores no tendrá dimensiones y no podrá verse en la pantalla, por tanto aplicamos `fillMaxWidth()`.
Este componente puede formar nuestro componente principal `MainScreen` `@componsable` en la que ir colocando otros componentes.

```kotlin
@Composable  
fun MainScreen() {  
    Surface(  
        color = Color.LightGray,  
        modifier = Modifier.fillMaxSize()  
    ) {
        //Aquçi un componente
    }  
}
```

Podemos añadir otros componentes dentro de `Surface()`.

```kotlin
@Composable  
fun MainScreen() {  
    Surface(  
        color = Color.LightGray,  
        modifier = Modifier.fillMaxSize()  
    ) {  
        Text(  
            text = "Hi mates!!",  
            style = MaterialTheme.typography.h5,  
            modifier = Modifier.wrapContentSize()  
        )  
    }  
}
```

`Text()` utiliza el método `wrapContentSize()` como modificador que indica que use solo el espacio necesario para pintar su contenido, en este caso `Hi mates!`. `wrapContentSize()` aplicará una alineación automatica en `Surface()`, Alignment.Center, y situará el componente `Text()` en el centro del componente. Aunque esto se puede cambiar haciendo uso de la clase `Alignment`, ya que tiene multitud de valores para posicionar un componente dentro de su componente padre.

También podemos anidar componentes `Surface()`.

```kotlin
@Composable  
fun MainScreen() {  
    Surface(  
        color = Color.LightGray,  
        modifier = Modifier.fillMaxSize()  
    ) {  
          Surface(  
              color = Color.Green,  
              modifier = Modifier.wrapContentSize(Alignment.TopEnd)  
          ) {  
              Text(  
                  text = "Hi mates!!",  
                  style = MaterialTheme.typography.h5,
                  modifier = Modifier.padding(20.dp)
              )  
          }  
    }
}
```

Anidando componentes de esta forma se puede establecer un background para el componente `Text()`. El modificador `wrapContentSize()` puede moverse ahora al componente padre `Surface()`, y por tanto, este componente `Surface()` ocupará solo lo que ocupe el componente `Text()` que contiene.

El componente `Surface()` acepta un solo componente hijo. Más adelante veremos cómo añadir varios componentes dentro de un componente padre.

## Otros contenedores

Para situaciones en las que se tengan más de un componente hijo, Jetpack Compose ofrece los componentes: **Row** , **Column** y  **Box** :

* **Row** : Componente que puede albergar contenido de forma horizontal.
* **Column** : Componente que puede albergar contenido de forma vertical.
* **Box** : Componente que permite tener componentes encima o debajo de otros componentes de forma sencilla.

### Row

Al igual que  **Button** , **Row** contiene un **RowScope** que nos indica que podemos añadir componentes que admiten composición en su interior. Como indicamos anteriormente, dichos componentes se alinearán de forma horizontal.

A continuación, se muestra un ejemplo de componente **Row** con dos componentes **Surface** cuadrados que se alinean horizontalmente:

```kotlin
@Composable  
fun MainScreen() {  
    Surface(  
        color = Color.LightGray,  
        modifier = Modifier.fillMaxSize()  
    ) {  
      Row {  
        Surface(  
            color = Color.Green,  
            modifier = Modifier.size(60.dp)  
        ) {}  
        Surface(  
            color = Color.Black,  
            modifier = Modifier.size(60.dp)  
        ) {}  
 } }}
```

Si vemos los argumentos que acepta el componente **Row** podemos observar dos muy interesantes: **verticalAlignment** y  **horizontalArrangement** .

#### verticalAlignment

Mediante este argumento podemos indicar cómo queremos posicionar los hijos de nuestro componente **Row** con respecto a la línea vertical. Este argumento solo acepta parámetros del tipo **Alignment.Vertical** (valores como:  **Top** , **CenterVertically** y  **Bottom** ).

En el código que se muestra a continuación los hijos de posicionan centrados verticalmente con  **CenterVertically** :

```kotlin
@Composable  
fun MainScreen() {  
    Surface(  
        color = Color.LightGray,  
        modifier = Modifier.fillMaxSize()  
    ) {  
        Row(verticalAlignment = Alignment.CenterVertically) {  
            Surface(  
                color = Color.Green,  
                modifier = Modifier.size(60.dp)  
            ) {}  
            Surface(  
                color = Color.Black,  
                modifier = Modifier.size(60.dp)  
            ) {}  
        }
    }
}
```

#### horizontalArrangement

Este argumento nos permite indicar cómo disponer los elementos hijos en la línea horizontal. Acepta valores de la clase **Arrangement.Horizontal** (valores como:  **Start** , **End** o  **Center** ).

En el código que se muestra a continuación los hijos de posicionan centrados verticalmente y horizontalmente con  **Arrangement.Center** :

```kotlin
@Composable  
fun MainScreen() {  
    Surface(  
        color = Color.LightGray,  
        modifier = Modifier.fillMaxSize()  
    ) {  
        Row(  
            verticalAlignment = Alignment.CenterVertically,      
            horizontalArrangement = Arrangement.Center  
        ) {  
            Surface(  
                color = Color.Green,  
                modifier = Modifier.size(60.dp)  
            ) {}  
            Surface(  
                color = Color.Black,  
                modifier = Modifier.size(60.dp)  
            ) {}  
        }
    }
}
```

### Column

Como indicamos anteriormente, el componente Column alberga hijos de forma vertical.

A continuación, se muestra un ejemplo de componente **Column** con dos componentes **Surface** cuadrados que se alinean verticalmente:

```kotlin
@Composable  
fun MainScreen() {  
    Surface(  
        color = Color.LightGray,  
        modifier = Modifier.fillMaxSize()  
    ) {  
        Column {  
            Surface(  
                color = Color.Green,  
                modifier = Modifier.size(60.dp)  
            ) {}  
            Surface(  
                color = Color.Black,  
                modifier = Modifier.size(60.dp)  
            ) {}  
        } 
    }
}
```

De forma similar al componente  **Row** , **Column** acepta los siguientes argumentos: **horizontalAlignment** y  **verticalArrangement** .

#### horizontalAlignment

Mediante este argumento podemos indicar cómo queremos posicionar los hijos de nuestro componente **Column** con respecto a la línea horizontal. Este argumento solo acepta parámetros del tipo **Alignment.Horizontal** (valores como:  **Start** , **CenterHorizontally** y  **End** ).

En el código que se muestra a continuación los hijos de posicionan centrados horizontalmente con  **CenterHorizontally** :

```kotlin
@Composable  
fun MainScreen() {  
    Surface(  
        color = Color.LightGray,  
        modifier = Modifier.fillMaxSize()  
    ) {  
        Column(  
            horizontalAlignment = Alignment.CenterHorizontally  
        ) {  
            Surface(  
                color = Color.Green,  
                modifier = Modifier.size(60.dp)  
            ) {}  
            Surface(  
                color = Color.Black,  
                modifier = Modifier.size(60.dp)  
            ) {}  
         } 
    }
}
```

#### verticalArrangement

Este argumento permite indicar cómo disponer los elementos hijos en la línea vertical. Acepta valores de la clase **Arrangement.Vertical** (valores como:  **Top** , **Bottom** o  **Center** ).

En el código que se muestra a continuación los hijos de posicionan centrados verticalmente y horizontalmente con **Arrangement.Center**

```kotlin
@Composable  
fun MainScreen() {  
    Surface(  
        color = Color.LightGray,  
        modifier = Modifier.fillMaxSize()  
    ) {  
        Column(  
            horizontalAlignment = Alignment.CenterHorizontally,  
            verticalArrangement = Arrangement.Center  
        ) {  
            Surface(  
                color = Color.Green,  
                modifier = Modifier.size(60.dp)  
            ) {}  
            Surface(   
                color = Color.Black,  
                modifier = Modifier.size(60.dp)  
            ) {}  
        }
    }
}
```
