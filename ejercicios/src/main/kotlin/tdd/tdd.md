# Prólogo

## Cómo usar este libro

No hay una forma correcta, o incorrecta si vamos a eso, de leer este libro. Todo depende de tus intereses.

Para empezar, se estructura en cuatro partes principales que pueden leerse separadamente:

En la primera se introducen los conceptos básicos de TDD, así como algunas estrategias para aprender a usar e introducir esta disciplina en tu práctica.

En la segunda, se presenta una selección de katas o ejercicios de código con la que se explican en profundidad los conceptos y técnicas de Test Driven Development en su definición clásica. Van desde las que son muy conocidas hasta algunas propias.

Cada una de las katas se organiza de la siguiente forma:

* Un capítulo teórico dedicado a un aspecto destacado de TDD puesto de relieve por esa kata y sobre el que he incidido especialmente al resolverla.
* Una introducción a la kata, su origen si es conocido, su enunciado y una serie de recomendaciones o puntos de interés sobre la misma.
* Una solución desarrollada en un lenguaje de programación diferente y explicada en detalle. Hay un repositorio con soluciones a las katas en varios lenguajes.

La tercera parte introduce la metodología *outside-in* TDD. *Outside-in* TDD es una propuesta en la que se busca potenciar la fase de diseño, y que se puede aplicar al desarrollo en proyectos reales.

La cuarta parte está orientada a mostrar un ejemplo de un proyecto realista y cómo se puede incorporar TDD en las distintas etapas de desarrollo y mantenimiento, desde la creación de un producto mínimo viable (MVP) a la resolución de defectos y la incorporación de nuevas características.

Si estás buscando un manual para aprender TDD desde cero, mi recomendación sería leerlo en orden. Los ejercicios de código están dispuestos para introducir los conceptos en una progresión determinada, a la que he llegado por experiencia personal y cuando he enseñado a otras personas a usar TDD.

Al principio, puede parecerte que los ejercicios de TDD son muy triviales y poco realistas. Ten presente que el nombre de *Kata* no es casual. Una Kata, en artes marciales, es un ejercicio repetitivo que se ejecuta hasta automatizar sus movimientos y más allá. Si practicas algún deporte habrás realizado decenas de ejercicios destinados a ganar flexibilidad, fuerza, movilidad y automatismos, sin que tengan una aplicación directa en ese deporte concreto. Las Katas de TDD tienen esa misma función: preparan tu cerebro para automatizar ciertas rutinas, generar determinados hábitos y conseguir detectar patrones particulares en el proceso de desarrollo.

Posiblemente, el enfoque *outside-in* te parezca mucho más aplicable a tu trabajo diario. De hecho, es una forma de desarrollar proyectos usando TDD. Sin embargo, una base sólida en TDD clásico es fundamental para tener éxito usando este enfoque. *Outside-in* está muy próximo al  *Behavior Driven Development* .

Como se ha mencionado antes, las distintas partes y ejercicios son relativamente independientes. Si ya tienes cierta experiencia con la disciplina del Test Driven Development, puedes ir directamente a los apartados o ejercicios que te interesen. Con frecuencia descubrirás algo nuevo. Una de las cosas que me he encontrado es que siempre acaba apareciendo alguna idea nueva aunque hayas realizado el mismo ejercicio decenas de veces.

Si buscas cómo introducir TDD en tu proceso de trabajo o en el de tu equipo, es posible que vayas directamente a la parte sobre  *TDD en la vida real* . Es la que tiene, por así decir, más dependencia en conocimientos y experiencia previa. En ese caso, si consideras que te falta soltura en TDD posiblemente debas echar un vistazo a otras partes del libro.

Para alcanzar un buen nivel de desempeño en TDD deberías practicar los ejercicios muchas veces. No hablo de tres ó cuatro, estoy hablando de decenas de veces, en distintos momentos de tu vida profesional e, idealmente, en distintos lenguajes. Existen varios repositorios de katas en los que encontrar ejercicios, y puedes inventar o descubrir los tuyos propios.

También es recomendable ver cómo otras personas realizan estos ejercicios. En la web están disponibles montones de ejemplos de Katas realizadas en una variedad de lenguajes de programación, y es una gran forma de contrastar tus soluciones y tu proceso.

Y, por supuesto, pero no en último lugar, una de las mejores formas de aprender es practicar con otras personas. Ya sea en proyectos de trabajo, formaciones o comunidades de práctica. Debatir en vivo las soluciones, el tamaño de los pasos, el comportamiento a testear, contribuirá a pulir y fortalecer vuestro proceso de desarrollo.

### Asunciones

Para este libro se asumen algunos supuestos:

* Que tienes cierta experiencia en algún lenguaje de programación y un entorno de testing de ese lenguaje. En otras palabras: sabes escribir y ejecutar tests. No importa que tu lenguaje preferido no esté contemplado en este libro.
* Los ejemplos del libro están en varios lenguajes y en la medida de lo posible se evita usar características muy específicas. De hecho, soy novato en muchos de ellos, por lo que el código puede parecer muy simplón. Por otro lado, esto es algo deseable en TDD, como verás a lo largo del libro.
* Tienes claro que el objetivo de los ejercicios de código no es tanto resolver el problema planteado como tal, que finalmente se resuelve, sino el proceso por el que llegamos a esa solución.
* Entiendes que no existe una solución única, ni un camino preciso en la resolución de las katas. Si tu solución no coincide con la planteada en este libro, no es ningún problema.

## Disclaimer

Las soluciones propuestas a las katas se proporcionan como ejemplos explicados de los procesos de razonamiento que se podrían seguir. No son soluciones ideales. Cuando realices tu versión podrías seguir un proceso completamente diferente que podría ser tan válido o más que el presentado aquí.

Por otra parte, sucesivas ejecuciones de una misma kata por la misma persona podrían llevarla a soluciones y recorridos diferentes. Ese es uno de sus beneficios: al acostumbrarnos a ciertos patrones de pensamiento y automatizarlos podemos prestar atención a más detalles cada vez y encontrar puntos de intervención más interesantes.

Igualmente, a medida que se incrementa nuestra fluidez en un lenguaje de programación, las implementaciones que logramos pueden ser mejores y más elegantes.

Al preparar las katas presentadas en este libro he realizado varias versiones, incluso en distintos lenguajes a fin de encontrar los recorridos más interesantes o incluso provocar algunos problemas que me interesaba poner de manifiesto. La solución que he decidido publicar en cada caso está cargada hacia algún punto que me interesaba acentuar del proceso de TDD por lo que podría no ser la óptima.

Es decir, en cierto modo las katas tienen trampa, se trata de forzar las cosas hasta cierto punto para lograr un objetivo didáctico.

En otro orden de cosas, he aprovechado este proyecto para forzarme a experimentar con lenguajes de programación diferentes. En algunos casos, son lenguajes nuevos para mi o con los que no estoy acostumbrado a trabajar, por lo que es posible que las implementaciones sean especialmente toscas o que no incluyan algunas de sus características más específicas y óptimas.

# Conceptos básicos de TDD

En esta primera parte, introduciremos los conceptos básicos para entender qué es Test Driven Development y en qué se diferencia de otras disciplinas y metodologías que utilizan tests. También hablaremos de cómo puedes aprender TDD, ya sea individualmente o en un equipo o comunidad de práctica.

En el primer capítulo se hace una introducción general al proceso de test driven development.

El capítulo sobre conceptos básicos es un glosario de términos que usaremos a lo largo del libro.

Finalmente, el capítulo sobre coding-dojo y katas propone algunas ideas sencillas para empezar a practicar en equipo o individualmente.

# 1 ¿Qué es TDD y por qué debería importarme?

Test Driven Development es una metodología de desarrollo de software en la que se escriben tests para guiar la escritura del código de producción.

Los tests especifican de manera formal, ejecutable y mediante ejemplos, los comportamientos que debe realizar el software que estamos programando, definiendo pequeños objetivos que, al ser superados, nos permiten construir el software de forma progresiva, segura y estructurada.

Aunque hablemos de tests, no estamos hablando de *Quality Assurance* (en adelante:  **QA** ), aunque al trabajar con metodología TDD conseguimos el efecto secundario de hacernos con una suite de tests unitarios que es válida y que tiene la máxima cobertura posible. De hecho, lo normal es que una parte de los tests creados en TDD sean innecesarios para una batería comprensiva de tests de regresión, por lo que es habitual eliminarlos a medida que nuevos tests los convierten en redundantes.

Es decir: tanto **TDD** como **QA** se basan en la utilización de los  **tests como herramientas** , pero este uso se diferencia en varios aspectos. Específicamente, en TDD:

* El test se escribe antes de que el software que ejecuta siquiera exista.
* Los tests son muy pequeños y su objetivo es forzar la escriture del código de producción mínimo necesario para que el test pase, que tiene el efecto de implementar el comportamiento definido por el test.
* Los tests guían el desarrollo del código y el proceso contribuye al diseño del sistema.

En TDD los tests se definen como *especificaciones* ejecutables del comportamiento de la unidad de software considerada, mientras que en QA el test es una herramienta de *verificación* de ese mismo comportamiento. Expresado de manera más sencilla:

* Cuando hacemos QA pretendemos comprobar que el software que hemos escrito se comporta según los requisitos definidos.
* Cuando hacemos TDD escribimos software para que cumpla los requisitos definidos, uno por uno, de modo que terminamos con un producto que los cumple.

## La metodología Test Driven Development

Aunque a lo largo del libro vamos a desarrollar este apartado en profundidad presentaremos brevemente lo esencial de la metodología.

En TDD los tests se escriben en una forma que podríamos considerar como de **diálogo** con el código de producción. Este diálogo, las normas que lo regulan y los ciclos que esta forma de interactuar con el código genera los practicaremos con la primera kata del libro: [FizzBuzz](https://leanpub.com/tddcourse/read#fizzbuzz).

Básicamente se trata de:

* Escribir un test que falla
* Escribir código que haga que el test pase
* Mejorar la estructura del código (y del test)

### Escribir un test que falle

Una vez que tenemos claro la pieza de software en la que vamos a trabajar y la funcionalidad que queremos implementar, lo primero es definir un primer test muy pequeño que fallará sin remedio porque ni siquiera existe un archivo que contenga el código de producción necesario para que se pueda ejecutar. Aunque es algo que trataremos en todas las katas, en la kata [NIF](https://leanpub.com/tddcourse/read#nif) profundizaremos en estrategias que nos servirán para decidir los primeros tests.

He aquí un ejemplo en Go:

```
 1 // roman/roman_test.go
 2 package roman
 3
 4 import "testing"
 5
 6 func
 
TestRomanNumeralsConversion
(
t
 
*
testing
.
T
)
 
{


 7 

roman
 
:=
 
decToRoman
(
1
)


 8 


 9 

if
 
roman
 
!=
 
"I"
 
{


10 

t
.
Errorf
(


11 
	
"Decimal %d should convert to %s, but found %s"
,


12 
			 
1
,


13 
			 
"I"
,
 

14 
			 
roman


15 
		 
)


16 

}


17 
}

```

Aunque podemos predecir que el test ni siquiera podrá compilarse o interpretarse, lo intentaremos ejecutar igualmente. En TDD es fundamental  **ver que los tests fallan** , no basta con suponerlo. Nuestro trabajo es hacer que el test falle por la razón correcta y luego hacerlo pasar escribiendo código de producción.

```

1 
# tddbook-go/roman [tddbook-go/roman.test]

2 
./roman_test.go:6:11: undefined: decToRoman

3 


4 
Compilation finished with exit code 2
```

El mensaje de error nos indicará qué es lo que tenemos que hacer a continuación. Nuestro objetivo a corto plazo es hacer desaparecer ese mensaje de error y los que puedan venir después, uno por uno.

```

 1 
package
 
roman


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestRomanNumeralsConversion
(
t
 
*
testing
.
T
)
 
{


 6 

roman
 
:=
 
decToRoman
(
1
)


 7 


 8 

if
 
roman
 
!=
 
"I"
 
{


 9 

t
.
Errorf
(


10 
	
"Decimal %d should convert to %s, but found %s"
,


11 
	
1
,


12 
	
"I"
,


13 
	
roman


14 

)


15 

}


16 
}


17 


18 
func
 
decToRoman
(
decimal
 
int
)
 
string
 
{


19 


20 
}

```

Por ejemplo, al introducir la función `decToRoman`, el error cambiará. Ahora nos dice que debería devolver un valor:

```

1 
# tddbook-go/roman [tddbook-go/roman.test]

2 
./roman_test.go:16:1: missing return at end of function

3 


4 
Compilation finished with exit code 2
```

Podría ocurrir incluso que sea un mensaje inesperado, como que hemos querido cargar la clase `Book` y resulta que hemos creado un archivo `brok` por error. Por eso es tan importante lanzar el test y ver si falla y cómo falla exactamente.

```

 1 
package
 
roman


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestRomanNumeralsConversion
(
t
 
*
testing
.
T
)
 
{


 6 

roman
 
:=
 
decToRoman
(
1
)


 7 


 8 

if
 
roman
 
!=
 
"I"
 
{


 9 

t
.
Errorf
(


10 
	
"Decimal %d should convert to %s, but found %s"
,


11 
	
1
,


12 
	
"I"
,


13 
	
roman


14 

)


15 

}


16 
}


17 


18 
func
 
decToroman
(
decimal
 
int
)
 
string
 
{


19 


20 
}

```

Este código da lugar al siguiente mensaje:

```

1 
# tddbook-go/roman [tddbook-go/roman.test]

2 
./roman_test.go:6:11: undefined: decToRoman

3 
./roman_test.go:16:1: missing return at end of function

4 


5 
Compilation finished with exit code 2
```

Este error nos indica que hemos escrito incorrectamente el nombre de la función, así que primero lo corregimos:

```

 1 
package
 
roman


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestRomanNumeralsConversion
(
t
 
*
testing
.
T
)
 
{


 6 

roman
 
:=
 
decToRoman
(
1
)


 7 


 8 

if
 
roman
 
!=
 
"I"
 
{


 9 

t
.
Errorf
(


10 
	
"Decimal %d should convert to %s, but found %s"
,
 

11 
	
1
,
 

12 
	
"I"
,
 

13 
	
roman


14 

)


15 

}


16 
}


17 


18 
func
 
decToRoman
(
decimal
 
int
)
 
string
 
{


19 


20 
}

```

Y podemos continuar. Como el test dice que espera que al pasar 1 a la función nos devuelva “I”, el test fallido debería indicarnos que no coincide el resultado recibido con el esperado. Pero, de momento, el test nos está diciendo que la función no devuelve nada. Todavía es un fallo de compilación y todavía no es la razón correcta para fallar.

```

1 
# tddbook-go/roman [tddbook-go/roman.test]

2 
./roman_test.go:16:1: missing return at end of function

3 


4 
Compilation finished with exit code 2
```

Para conseguir que el test falle por la razón que esperamos, tenemos que hacer que la función devuelva un `string`, aunque sea vacío:

```

 1 
package
 
roman


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestRomanNumeralsConversion
(
t
 
*
testing
.
T
)
 
{


 6 

roman
 
:=
 
decToRoman
(
1
)


 7 


 8 

if
 
roman
 
!=
 
"I"
 
{


 9 

t
.
Errorf
(


10 
	
"Decimal %d should convert to %s, but found %s"
,


11 
	
1
,
 

12 
	
"I"
,
 

13 
	
roman


14 

)


15 

}


16 
}


17 


18 
func
 
decToRoman
(
decimal
 
int
)
 
string
 
{


19 

return
 
""


20 
}

```

Y este cambio hace que el error ahora sea uno relacionado con que el test no pasa, pues no obtiene el resultado que espera. Esta es la razón correcta para fallar, la que nos forzará a escribir código de producción que haga pasar el test:

```

1 
=== RUN   TestRomanNumeralsConversion

2 
--- FAIL: TestRomanNumeralsConversion (0.00s)

3 
    roman_test.go:9: Decimal 1 should convert to I, but found 

4 
FAIL

5 


6 
Process finished with exit code 1
```

Y así estaríamos listas para dar el siguiente paso:

### Escribir código que haga que el test pase

Como respuesta al resultado anerior, se escribe el código de producción necesario para que el test pase, pero nada más. Siguiendo con nuestro ejemplo:

```

 1 
package
 
roman


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestRomanNumeralsConversion
(
t
 
*
testing
.
T
)
 
{


 6 

roman
 
:=
 
decToRoman
(
1
)


 7 


 8 

if
 
roman
 
!=
 
"I"
 
{


 9 

t
.
Errorf
(


10 
	
"Decimal %d should convert to %s, but found %s"
,
 

11 
	
1
,
 

12 
	
"I"
,
 

13 
	
roman


14 

)


15 

}


16 
}


17 


18 
func
 
decToRoman
(
decimal
 
int
)
 
string
 
{


19 

return
 
"I"


20 
}

```

Tras hacer pasar el primer test podemos empezar creando el archivo que contendrá la unidad bajo test. Podríamos incluso volver a lanzar el test ahora, lo cual seguramente provocará que el compilador o intérprete nos devuelva un mensaje de error distinto. Aquí ya dependemos un poco de circunstancias, como las convenciones del lenguaje en que estamos desarrollando, el IDE con el que trabajamos, etc.

En todo caso, se trata de ir dando pequeños pasos hasta que el compilador o intérprete quede conforme y pueda ejecutar el test. En principio, el test debería ejecutarse y fallar indicando que el resultado recibido de la unidad de software no coincide con el esperado.

En este punto hay que hacer una salvedad porque dependiendo del lenguaje, del *framework* y de algunas prácticas en testing, la forma concreta de este primer test puede ser un poco distinta. Por ejemplo, hay *frameworks* de test en los que basta con que la ejecución del test no arroje errores o excepciones para considerar que pasa, por lo que un test que simplemente instancia un objeto o invoca uno de sus métodos sería suficiente. En otros casos, es necesario que el test incluya una aserción y si no se hace ninguna considera que el test no pasa.

En cualquier caso, el objetivo de esta fase es lograr que el test se ejecute con éxito.

Con la kata [Prime Factors](https://leanpub.com/tddcourse/read#primefactors) estudiaremos el modo en que puede cambiar el código de producción para incorporar nueva funcionalidad.

### Mejorar la estructura del código (y del test)

Cuando se ha logrado hacer pasar cada test debemos examinar el trabajo realizado hasta el momento y comprobar si es posible refactorizar tanto el código de producción como el de test. Aquí aplicamos los principios habituales: si detectamos cualquier  *smell* , dificultad para entender lo que ocurre, duplicación de conocimiento, etc. debemos refactorizar el código para ponerlo en mejor estado antes de continuar.

En el fondo, las preguntas en este momento son:

* ¿Hay alguna manera mejor de organizar el código que he escrito?
* ¿Hay alguna manera mejor de expresar lo que que este código hace y que sea más fácil de entender?
* ¿Puedo encontrar alguna regularidad y hacer que el algoritmo sea más general?

Para ello debemos mantener todos los tests que hayamos escrito pasando. Si alguno de los tests se pone en rojo tendríamos una regresión y habríamos estropeado, por así decir, la funcionalidad ya creada.

Tras el primer ciclo es normal no encontrar muchas oportunidades de refactor, pero no te fíes: siempre hay otra manera de ver y hacer las cosas. Por regla general, cuanto antes detectes oportunidades de reorganizar y limpiar el código y lo hagas, más fácil será el desarrollo.

Por ejemplo, nosotros hemos creado la función bajo test en el mismo archivo del test.

```

 1 
package
 
roman


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestRomanNumeralsConversion
(
t
 
*
testing
.
T
)
 
{


 6 

roman
 
:=
 
decToRoman
(
1
)


 7 


 8 

if
 
roman
 
!=
 
"I"
 
{


 9 

t
.
Errorf
(


10 
	
"Decimal %d should convert to %s, but found %s"
,
 

11 
	
1
,
 

12 
	
"I"
,
 

13 
	
roman


14 

)


15 

}


16 
}


17 


18 
func
 
decToRoman
(
decimal
 
int
)
 
string
 
{


19 

return
 
"I"


20 
}

```

Resulta que hay una forma mejor de organizar ese código y es crear un archivo que contenga la función. De hecho, es una práctica recomendada en casi todos los lenguajes de programación. Sin embargo, al principio nos la podemos saltar.

```

1 
//roman/roman.go


2 


3 
package
 
roman


4 


5 
func
 
decToRoman
(
decimal
 
int
)
 
string
 
{


6 

return
 
"I"


7 
}

```

Y, en el caso de Go, podemos convertirla en una función *exportable* si su nombre comienza con mayúsculas.

```

1 
package
 
roman


2 


3 
func
 
DecToRoman
(
decimal
 
int
)
 
string
 
{


4 

return
 
"I"


5 
}

```

Para profundizar en todo lo que tiene que ver con el refactor al trabajar tendremos la kata [Bowling Game](https://leanpub.com/tddcourse/read#bowling).

### Repetir el ciclo hasta terminar

Una vez que el código de producción hace pasar el test y está lo mejor organizado posible en esa fase, es el turno de escoger otro aspecto de la funcionalidad y crear un nuevo test que falle para describirlo.

Este nuevo test falla porque el código existente no cubre la funcionalidad deseada y es necesario introducir un cambio. Por tanto, nuestra misión ahora es poner este nuevo test en verde haciendo las transformaciones necesarias en el código, las cuales serán pequeñas si hemos sabido dimensionar correctamente nuestros tests anteriores.

Tras conseguir que el nuevo test pase, buscamos las oportunidades de refactor para tener un mejor diseño del código. A medida que avancemos en el desarrollo de la pieza de software veremos que los refactors posibles van siendo más significativos.

En los primeros ciclos comenzaremos con cambios de nombres, extracción de constantes y variables, etc. Luego pasaremos a introducir métodos privados o extraer ciertos aspectos a funciones. En algún momento descubriremos la necesidad de extraer funcionalidad a clases colaboradoras, etc.

Cuando estemos satisfechas con el estado del código repetimos el ciclo mientras nos queda funcionalidad por añadir.

### ¿Cuándo termina el desarrollo en TDD?

La respuesta obvia podría ser: cuando toda la funcionalidad está implementada.

Pero, ¿cómo sabemos esto?

Kent Beck proponía hacer una lista con todos los aspectos que habría que conseguir para considerar completa la funcionalidad. Cada vez que se consigue alguno se tacha de la lista. A veces, al progresar en el desarrollo nos damos cuenta de la necesidad de añadir, quitar, o mover, elementos en la lista. Es una buena recomendación.

Existe una manera más formal de asegurarnos de que una funcionalidad está completa. Básicamente consiste en **no ser capaz** de crear un nuevo test que falle. En efecto, si un algoritmo está completamente implementado será imposible crear un test nuevo que pueda fallar.

## Qué no es Test Driven Development

El resultado o `outcome` de Test Driven Development no es crear un software libre de defectos, aunque se previenen muchos de ellos; ni generar una suite de tests unitarios, aunque en la práctica se obtiene una con gran cobertura que puede llegar al 100%, con la contrapartida de que puede presentar redundancia. Pero nada de esto es el objetivo de TDD, en todo caso es un efecto colateral ciertamente beneficioso.

### TDD no es Quality Assurance

Aunque usamos las mismas herramientas (tests), las usamos para finalidades distintas. Los tests en TDD guían el desarrollo, estableciendo objetivos específicos para alcanzar añadiendo código o aplicando cambios en él. El resultado de TDD es una suite de tests que puede utilizarse en QA como tests de regresión, aunque es frecuente que tengamos que retocar esos tests de una manera u otra. En unos casos para eliminar tests redundantes y en otros para asegurar que las casuísticas están bien cubiertas.

En cualquier caso, TDD ayuda enormemente el proceso de QA porque previene muchos de los defectos más comunes y contribuye a construir un código bien estructurado y con bajo acoplamiento, aspectos que incrementan la fiabilidad del software, nuestra capacidad para intervenir en caso de errores e incluso la posibilidad de crear nuevos tests en un future.

### TDD no reemplaza el diseño

TDD es una herramienta para contribuir al diseño de software, pero no lo reemplaza.

Cuando desarrollamos unidades pequeñas y con una funcionalidad muy bien definida, TDD nos ayuda a establecer el diseño del algoritmo gracias a la red de seguridad proporcionada por los tests que vamos creando.

Pero cuando la unidad considerada es mayor, un análisis previo que nos lleve a un “boceto” de los elementos principales de la solución nos permite tener un marco de desarrollo.

El enfoque *outside-in* intenta integrar el proceso de diseño en el desarrollo, usando lo que Sandro Mancuso etiqueta como  *Just-in-time design* : partimos de una idea general de cómo se estructura y de cómo funcionará el sistema y diseñamos en el ámbito de la iteración en la que nos encontremos.

### En qué nos ayuda TDD

Lo que TDD nos proporciona es una herramienta que:

* Guía el desarrollo del software de una forma sistemática y progresiva.
* Nos permite realizar afirmaciones contrastables sobre si la funcionalidad requerida ha sido implementada o no.
* Nos ayuda a evitar la necesidad de diseñar todos los detalles de implementación anticipadamente, ya que en sí misma es una herramienta de ayuda al diseño de los componentes del software.
* Nos permite posponer decisiones a varios niveles.
* Nos permite centrarnos en problemas muy concretos, avanzando en pasos pequeños y fáciles de revertir si introducimos errores.

## Beneficios

Varios estudios han mostrado evidencias que apuntan a favor de que la aplicación de TDD tiene beneficios en los equipos de desarrollo. No son evidencias concluyentes, pero las investigaciones realizadas tienden a coincidir en que con TDD:

* Se escribe una mayor cantidad de tests
* El software tiene menos defectos
* La productividad no se ve disminuida, incluso puede aumentar

Es bastante difícil cuantificar el beneficio de usar TDD en cuanto a productividad o velocidad, sin embargo subjetivamente se pueden experimentar varios beneficios.

Uno de ellos es que la metodología TDD puede bajar la cargar cognitiva del desarrollo. Esto es así porque favorece dividir el problema en tareas pequeñas con un foco muy definido, lo que nos permite ahorrar la limitada capacidad de nuestra memoria de trabajo.

La evidencia anecdótica apunta a que las desarrolladoras y equipos que introducen TDD reducen los defectos, reducen el tiempo dedicado a bugs, aumentan la confianza a la hora de desplegar y la productividad no se ve afectada negativamente.

## Referencias

* [Test Driven Development](https://en.wikipedia.org/wiki/Test-driven_development)^[1](https://leanpub.com/tddcourse/read#fn-fn1)^
* [Why Test-driven Development](http://derekbarber.ca/blog/2012/03/27/why-test-driven-development/)^[2](https://leanpub.com/tddcourse/read#fn-fn2)^
* [Test driven development: empirical body of evidence](https://pdfs.semanticscholar.org/ad0f/dd36aa09d25b739b1649bfa5e20c9e46eb65.pdf)^[3](https://leanpub.com/tddcourse/read#fn-fn3)^
* [Does Test-Driven Development Really Improve Software Design Quality](https://digitalcommons.calpoly.edu/cgi/viewcontent.cgi?referer=&httpsredir=1&article=1027&context=csse_fac)^[4](https://leanpub.com/tddcourse/read#fn-fn4)^
* [6 Misconceptions about TDD – Part 1. TDD Brings Little Business Value and Isn’t Worth it](https://www.thedroidsonroids.com/blog/pros-of-tdd-test-driven-development-for-business)^[5](https://leanpub.com/tddcourse/read#fn-fn5)^
* [TDD is about design, not testing](https://medium.com/@philborlin/tdd-is-about-design-not-testing-e42af0b28475)^[6](https://leanpub.com/tddcourse/read#fn-fn6)^
* [Does TDD really lead to good design?](https://codurance.com/2015/05/12/does-tdd-lead-to-good-design/)^[7](https://leanpub.com/tddcourse/read#fn-fn7)^
* [Using TDD to influence design](https://www.thoughtworks.com/insights/blog/using-tdd-influence-design)^[8](https://leanpub.com/tddcourse/read#fn-fn8)^

# 2 Conceptos básicos

A continuación definiremos algunos conceptos que se usan a lo largo del libro. Hay que entenderlos en el contexto de Test Driven Development.

## Test

Un test es una pequeña pieza de software, normalmente una función, que ejecuta otra pieza de software y verifica si produce un resultado o efecto que esperamos. Un test es básicamente un ejemplo de uso de la unidad bajo test en el que se define un escenario y se ejecuta la unidad probada para ver si el resultado es que el que hemos previsto.

Muchos lenguajes utilizan la noción de TestCase, una clase que agrupa un cierto número de tests relacionados entre sí. En ese caso, cada método es un test, aunque es frecuente llamar test al test case.

### Test como especificación

Un test como especificación utiliza ejemplos de uso de la pieza de software probada para describir cómo debería funcionar. Se utilizan, sobre todo, ejemplos que sean significativos, pero no siempre se hace de manera formal.

Se opone al test como verificación, propio de la QA, en el que se prueba la pieza de software eligiendo los casos de prueba de manera sistemática para verificar que cumple lo que se espera de ella.

### Test que falla

Un test que falla es una especificación que no se cumple todavía porque no se ha añadido el software de producción que permite hacerlo pasar. Típicamente los *frameworks* de testing lo representan en color rojo.

### Test que pasa

Un test que pasa es una especificación que ejecuta un código de producción que genera el efecto o respuesta esperado. Los *frameworks* de testing los suelen representar en color verde.

## Tipos de tests

### Unitarios

Son tests que prueban una unidad de software en aislamiento, sus dependencias se doblan para mantener controlada su influencia en el resultado.

### De integración

Los tests de integración habitualmente pruebas conjuntos de unidades de software, de modo que podemos verificar su comunicación y su acción combinada.

### De aceptación

Los tests de aceptación son tests de integración que prueban un sistema de software como un consumidor más del mismo. Normalmente los escribimos en función de los intereses del negocio.

## Test Case

Es una clase que agrupa varios tests.

## Test Suite

Es un conjunto de test y/o test cases, que habitualmente se pueden ejecutar juntos.

## Código de producción

En TDD nos referimos con el nombre de código de producción al código que escribimos para pasar los tests y que, eventualmente, acabará siendo ejecutado en un sistema en producción.

## Unidad de software

Unidad de software es un concepto bastante flexible y que hay que interpretar en un contexto, pero se refiere normalmente a una pieza de software que se puede ejecutar de forma unitaria y aislada, incluso aunque esté compuesta de varios elementos.

## Subject under test

La unidad de software que es ejercitada en un test. Existe una discusión sobre cuál es el alcance de una unidad. En un extremo se encuentran quienes consideran que una unidad es una función, un método o incluso una clase. Sin embargo, también podemos considerar como unidad bajo test un conjunto de funciones o clases que son testeadas a través de la interfaz pública de una de ellas.

## Refactor

Refactor es un cambio en el código que no altera su comportamiento ni su interfaz. La mejor manera de asegurar esto es que exista al menos un test que ejercita el fragmento de código que se está modificando, de modo que tras cada cambio nos aseguremos de que el test sigue pasando, lo que demostraría que no ha cambiado el comportamiento aunque se haya modificado la implementación.

Algunas técnicas o patrones de refactor están descritos en recopilaciones como esta de [Refactoring Guru](https://refactoring.guru/refactoring/catalog) o el libro clásico de [Martin Fowler](https://martinfowler.com/books/refactoring.html)

### Refactor automático

Precisamente porque algunos refactors están muy bien identificados y caracterizados ha sido posible desarrollar herramientas capaces de ejecutarlos automáticamente. Estas herramientas están disponibles en los IDE.

# 3 Coding-dojo y katas

## Kata

En el mundo del software llamamos *katas* a ejercicios de diseño y programación que plantean problemas relativamente sencillos y acotados con los que practicar metodologías de desarrollo.

El término es un préstamo de la palabra japonesa que designa los ejercicios de entrenamiento característicos de las artes marciales. Se atribuye su introducción a Dave Thomas ([The Pragmatic Programmer](https://pragprog.com/titles/tpp20/the-pragmatic-programmer-20th-anniversary-edition/)) ^[1](https://leanpub.com/tddcourse/read#fn-fn9)^ , refiriéndose a la realización de pequeños ejercicios de código, repetidos una y otra vez hasta alcanzar un alto grado de fluidez o automatización.

Aplicado a TDD, las katas persiguen entrenar los ciclos de test-producción-refactor y la capacidad de añadir comportamiento mediante pequeños incrementos de código. Estos ejercicios te ayudarán a dividir una funcionalidad en partes pequeñas, a escoger ejemplos, a proceder paso a paso en el proyecto, a cambiar prioridades según la información que nos proporcionan los tests, etc.

La idea es repetir una misma kata muchas veces. Además de adquirir soltura con el proceso, en cada una de las repeticiones existe la posibilidad de descubrir nuevas estrategias. Con la práctica repetida, podremos favorecer el desarrollo de ciertos hábitos y el reconocimiento de patrones, automatizando hasta cierto punto nuestro proceso de desarrollo.

Puedes ejercitarte con katas de forma individual o con otras personas. Una forma sistemática de hacerlo es mediante un  *Coding Dojo* .

## Coding-dojo

Un *coding dojo* es un taller en el que un grupo de personas, con independencia de su nivel de conocimiento, realiza una kata de forma colaborativa y no competitiva.

La idea de *Coding Dojo* o *Coder’s Dojo* fue presentada en la conferencia XP2005 por Laurent Bossavit y Emmanuel Gaillot.

La estructura básica de un coding-dojo es bastante sencilla:

* Presentación del problema, organización del ejercicio (5-10 min)
* Sesión de código (30-40 min)
* Puesta en común sobre el estado del ejercicio (5-10 min)
* Continua la sesión de código (30-40 min)
* Puesta en común de las soluciones alcanzadas

La sesión de código puede desarrollarse de varias formas:

* **Prepared kata.** Un presentador explica cómo resolver el ejercicio, pero contando con el feedback de las personas presentes. No se avanza hasta que se consigue un consenso. Es una forma muy adecuada de trabajar cuando el grupo se está iniciando y pocas personas están acostumbradas a la metodología.
* **Randori kata.** La kata se realiza en pairing usando algún sistema para alternar entre la conductora (al teclado) y la copiloto. Las demás presentes colaboran haciendo sugerencias.
* **Hands-on workshop.** Una alternativa es que las participantes formen parejas y trabajen colaborativamente en la kata. A mitad del ejercicio se hace una parada para comentar sobre lo realizado unos minutos. Al final de la sesión se presentan las distintas soluciones en el punto donde hayan llegado. Cada pareja puede elegir el lenguaje de programación preferido, por lo que es una gran oportunidad para quienes quieran iniciarse en uno nuevo. También puede ser una buena forma para quienes se inician si se forman parejas con distinto nivel de experiencia.

## Consejos para realizar las katas individualmente

Al principio puede ser buena idea asistir a katas dirigidas. Básicamente se trata de una kata que hace una persona experta en forma de *live coding* mientras explica o comenta con la audiencia los distintos pasos, de modo que puedes ver la dinámica en acción. Si no tienes esta posibilidad, que puede ser lo más habitual, es buena idea ver alguna kata en vídeo. En los capítulos dedicados a cada kata puedes encontrar algunos enlaces.

Ante todo, el objetivo de las katas es ejercitar la disciplina TDD, la aplicación de las tres leyes y el ciclo red-green-refactor. El código de producción es lo de menos en el sentido de que no es el objeto del aprendizaje, aunque siempre será correcto si los tests pasan. Sin embargo, cada ejecución de la kata nos puede llevar a descubrir detalles nuevos y formas diferentes de afrontar cada fase.

Es decir, las katas están diseñadas para aprender a desarrollar software usando los tests como guía y para entrenar el *mindset* y los procesos de razonamiento y análisis que nos ayudan en esa tarea. Por lo general, desarrollar una buena metodología TDD nos ayudará a escribir mejor software gracias a las restricciones que nos impone.

Obviamente los primeros intentos te llevarán su tiempo, te meterás en caminos aparentemente sin retorno o te saltarás los pasos del ciclo. Cuando ocurre eso, no tienes más que retroceder o volver a empezar de cero. Se trata de ejercicios que no tienen una respuesta correcta única.

De hecho, cada lenguaje de programación, enfoque o entorno de test podrían favorecer unas soluciones u otras. Puedes hacer una kata varias veces intentando asumir diferentes supuestos de partida en cada intento o aplicando distintos paradigmas o condiciones.

Si encuentras puntos en los que puedes elegir diversos cursos de acción, toma nota de ellos para repetir el ejercicio y probar más adelante otro camino a ver a dónde te dirige.

En TDD es muy importante centrarse en **el aquí y el ahora** que nos define cada test que no pasa y no agobiarse por alcanzar el objetivo final. Esto no quiere decir dejarlo de lado o dedicarnos a otra cosa. Simplemente quiere decir que hay que recorrer ese camino paso a paso, y hacerlo así nos llevará a la meta casi sin darnos cuenta, con mucho menos esfuerzo y más solidez. Adquirir esta mentalidad, ocuparse sólo del problema que tengo delante, nos ayudará a reducir el estrés y pensar con más claridad.

Si es posible prueba a hacer la misma kata en diferentes lenguajes, incluso en diferentes *frameworks* de testing. Las dos familias más conocidas son:

* **xSpec** , que están orientados a TDD y tienden a favorecer el testing mediante ejemplos, proporcionando sintaxis y utilidades específicas. Su hándicap es que no suelen funcionar bien para QA.
* **xUnit** , que son los *frameworks* de testing más genéricos, aunque más orientados a QA. Sin embargo, puedes usarse para TDD perfectamente.

## Cómo introducir TDD en equipos de desarrollo

Introducir la metodología TDD en equipos de desarrollo es un proceso complejo. Ante todo, es importante contribuir a generar una cultura abierta a la innovación, a la calidad y al aprendizaje. Las mayores reticencias suelen venir del miedo a que el uso de TDD ralentice el desarrollo, o que al principio no se vea un aplicación directa en los problemas diarios.

Personalmente creo que puede ser interesante utilizar canales formales e informales. He aquí algunas ideas.

* Establecer un tiempo semanal, unas dos horas, para un coding-dojo abierto a todo el equipo. Dependiendo del nivel de experiencia puede empezarse con katas dirigidas, o sesiones tipo hands-on, o el formato que nos parezca más adecuado. Lo ideal es que diversas personas lo puedan dinamizar.
* Introducir en los equipos personas con experiencia que puedan ayudar a introducir TDD en sesiones de trabajo en pairing o mob-programming, guiando a otras compañeras.
* Organizar formación específica, con ayuda externa si no se cuenta con personas con suficiente experiencia.
* Introducir, si no se tiene, un blog técnico en el que se publiquen artículos, ejercicios y ejemplos sobre el tema.

## Repositorios de katas

* [Katalyst](https://katalyst.codurance.com/)^[2](https://leanpub.com/tddcourse/read#fn-fn10)^
* [Kata-log](https://kata-log.rocks/index.html)^[3](https://leanpub.com/tddcourse/read#fn-fn11)^
* [Coding dojo](http://codingdojo.org/)^[4](https://leanpub.com/tddcourse/read#fn-fn12)^
* [Codekata](http://codekata.com/)^[5](https://leanpub.com/tddcourse/read#fn-fn13)^
* [Agile kata](http://agilekatas.co.uk/)^[6](https://leanpub.com/tddcourse/read#fn-fn14)^

## Referencias

* [The Programming Dojo](http://www.butunclebob.com/ArticleS.UncleBob.TheProgrammingDojo)^[7](https://leanpub.com/tddcourse/read#fn-fn15)^
* [What is coding dojo](http://codingdojo.org/WhatIsCodingDojo/)^[8](https://leanpub.com/tddcourse/read#fn-fn16)^
* [The Coder’s Dojo – A Different Way to Teach and Learn Programming - Abstract](https://link.springer.com/chapter/10.1007%2F11499053_54)^[9](https://leanpub.com/tddcourse/read#fn-fn17)^

# TDD clásica

En esta parte presentamos una serie de ejercicios de código en los que exploraremos en profundidad cómo se hace Test Driven Development.

Usaremos el estilo o aproximación clásica de la disciplina. TDD es una metodología de desarrollo de software *re-descubierta* por Kent Beck, basándose en el modo en que se construían los primeros programas de ordenador. Entonces, se realizaban primero los cálculos a mano para tener la referencia del resultado esperado y que debía reproducirse con el ordenador. En TDD, se escribe un programa muy sencillo que comprueba que el resultado de otro programa es el que se espera. La clave está en que ese programa aún no está escrito. Es así de simple.

La metodología fue presentada por Beck en su libro  *TDD by example* , en el cual, entre otras cosas, se enseña a construir un *framework* de testing mediante TDD. Posteriormente, diversos autores han contribuido a refinar y sistematizar el modelo.

# 4 Las leyes de TDD

Desde la introducción de la metodología TDD por Kent Beck se ha intentado definir un *framework* sencillo que proporcione una guía para aplicarla en la práctica.

Inicialmente, Kent Beck propuso dos reglas muy básicas:

* No escribir una línea de código sin antes tener un test automático que falle.
* Eliminar la duplicación.

Es decir, para poder escribir código de producción, primero debemos tener un test que no pase y que requiera que escribamos ese código, precisamente porque eso es lo necesario para que el test pase.

Una vez que lo hemos escrito y viendo que el test pasa, nuestro esfuerzo se centra en revisar el código escrito y eliminar en lo posible la duplicación. Esto es muy genérico, porque por una parte se refiere al *refactoring* y, por otra parte, al acoplamiento entre el test y el código de producción. Y al ser tan genérico resulta difícil bajarlo en acciones prácticas.

Además, estas reglas no nos dicen nada acerca de cuan grandes son los saltos de código implicados en cada ciclo. Beck sugiere en su libro que los pasos o *baby steps* pueden ser tan pequeños o tan grandes como nos resulten útiles. En general, recomienda usar pasos pequeños cuando tenemos inseguridad o poco conocimiento del algoritmo, mientras que permite pasos más grandes si por experiencia y conocimientos tenemos claro qué hacer a continuación.

Con el tiempo, y a partir de la metodología aprendida del propio Beck, Robert C. Martin estableció las “tres leyes”, que no sólo definen el ciclo de acciones en TDD, sino que también proporcionan criterios sobre cómo de grandes deberían ser los pasos en cada ciclo:

* No se permite escribir ningún código de producción a menos que haga pasar un test unitario que falle
* No se permite escribir más de un test unitario que sea suficiente para fallar; y los errores de compilación son fallos.
* No se permite escribir más código de producción del que sea necesario para hacer pasar un test unitario que falle

Las tres leyes son lo que hace diferente TDD de simplemente escribir tests antes que el código.

Estas leyes imponen una serie de restricciones cuyo objetivo es forzarnos a seguir un determinado orden y ritmo de trabajo. Definen una serie de condiciones que, si se cumplen, generan un ciclo y guían nuestra toma de decisiones. Entender cómo funcionan, nos ayudará a aprovechar al máximo la capacidad de TDD para ayudarnos a generar código de calidad y que podamos mantener.

Estas leyes se tienen que cumplir todas a la vez porque funcionan juntas.

## Las leyes en detalle

### No se permite escribir ningún código de producción a menos que haga pasar un test unitario que falle

La primera ley nos dice que no podemos escribir código de producción si no hace pasar un test unitario existente que actualmente está fallando. Esto implica lo siguiente:

* Tiene que existir un test que describa un aspecto nuevo del comportamiento de la unidad que estamos desarrollando.
* Este test tiene que fallar porque en el código de producción no existe nada que lo haga pasar.

En resumen, la primera ley nos fuerza a escribir un test que defina el comportamiento que vamos a implementar en la unidad de software que estamos desarrollando antes de plantearnos cómo hacerlo.

Ahora bien, ¿cómo tiene que ser el test que escribamos?

### No se permite escribir más de un test unitario que sea suficiente para fallar; y los errores de compilación son fallos.

La segunda ley nos dice que el test debe ser suficiente para fallar y que tenemos que considerar fallos los errores de compilación o su equivalente en lenguajes interpretados. Por ejemplo, entre estos errores estarían algunos tan obvios como que la clase o función no existe o no ha sido definida.

Debemos evitar la tentación de escribir un esqueleto de la clase o la función antes de escribir el primer test. Recuerda que estamos hablando de  *Test Driven Development* . Por tanto, son los tests los que nos dicen qué código de producción escribir y cuándo y no al revés.

Que el test sea suficiente para fallar quiere decir que el test ha de ser muy pequeño en diversos sentidos y es algo que al principio resulta bastante difícil de definir. Con frecuencia se habla del test “más sencillo”, del caso más simple, pero no es exactamente así.

¿Qué condiciones tendría que reunir un test en TDD, particularmente el primero?

Pues básicamente forzarnos a escribir el mínimo código posible que se pueda ejecutar. Lo mínimo en OOP sería instanciar la clase que queremos desarrollar sin preocuparnos de más detalles, de momento. El test concreto variará un poco en función del lenguaje y *framework* de testing que estemos utilizando.

Veamos este ejemplo. Se trata de la kata Leap Year en la se busca crear una función para averiguar si un año dado es bisiesto ( *leap year* ) o no. Para el ejemplo, mi intención es crear un objeto `Year`, al que le pueda preguntar si es bisiesto enviándole el mensaje `isLeap`. He encontrado este ejercicio en varias recopilaciones de katas sin mención de autoría. Para este capítulo, los ejemplos están escritos en C#.

Las reglas son:

* Los años no divisibles por 4 no son bisiestos (como 1997).
* Los años divisibles por 4 son bisiestos (como 1996), excepto:
* Si son divisibles por 100 no son bisiestos (como 1900).
* Si son divisibles por 400 serán bisiestos (como 2000).

Nuestro objetivo sería poder usar objetos `Year` de esta forma:

```

1 
var
 
year
 
=
 
new
 
Year
(
1996
);


2 


3 
if
 
(
year
.
IsLeap
())
 
{


4 

// do something


5 
}

```

La tentación habitual es tratar de empezar de la siguiente forma porque parece que es el ejemplo del caso más sencillo posible.

```

 1 
using
 
System
;


 2 
using
 
System.Runtime.Remoting.Metadata.W3cXsd2001
;


 3 
using
 
NUnit.Framework
;


 4 


 5 
namespace
 
LeapYear


 6 
{


 7 
  
public
 
class
 
Tests


 8 
  
{


 9 
        [Test]


10 
    
public
 
void
 
ShouldNotBeLeapYear
()


11 
    
{


12 
        
var
 
year
 
=
 
new
 
Year
(
1997
);


13 
        
Assert
.
False
(
year
.
IsLeap
())


14 
    
}


15 
  
}


16 
}

```

Sin embargo, no es el test más sencillo que pueda fallar por una única razón. En realidad puede fallar por cinco razones, al menos:

* La clase `Year` no existe todavía.
* Tampoco aceptaría parámetros pasados por la constructora.
* No responde al mensaje `IsLeap`
* Podría no retornar nada.
* Podría devolver una respuesta incorrecta.

Es decir, podemos esperar que el test falle por estas cinco causas y sólo la última es la que el test realmente describe. Tenemos que reducirlas a sólo una.

En este caso, es muy fácil ver que hay una dependencia entre los diversos motivos de fallo, de tal manera que para que se pueda producir uno, tiene que haberse solucionado el anterior. Evidentemente, es necesario que exista una clase que poder instanciar. Por tanto, nuestro primer test debería ser mucho más modesto y esperar únicamente que la clase se pueda instanciar:

```

 1 
using
 
System
;


 2 
using
 
System.Runtime.Remoting.Metadata.W3cXsd2001
;


 3 
using
 
NUnit.Framework
;


 4 


 5 
namespace
 
LeapYear


 6 
{


 7 
  
public
 
class
 
Tests


 8 
  
{


 9 
        [Test]


10 
    
public
 
void
 
CanInstantiate
()


11 
    
{


12 
        
new
 
Year
();


13 
    
}


14 
  
}


15 
}

```

Si lanzásemos este test veríamos que falla por razones obvias: no existe la clase que se pretende instanciar en ninguna parte. El test está fallando por un problema de compilación o equivalente. Por tanto podría ser un test suficiente para fallar.

A lo largo del proceso veremos que este test es redundante y que podemos prescindir de él, pero no nos adelantemos. Todavía tenemos que conseguir que pase.

### No se permite escribir más código de producción del que sea necesario para hacer pasar un test unitario que falle

La primera y la segunda leyes nos dicen que tenemos que escribir un test y cómo debería ser ese test. La tercera ley nos dice cómo tiene que ser el código de producción. Y la condición que nos pone es que haga pasar el test que hemos escrito.

Es muy importante entender que es el test el que nos dice qué código necesitamos implementar y, por tanto, aunque tengamos la certeza de que va a fallar porque ni siquiera tenemos un archivo con el código necesario para definir la clase, debemos ejecutar el test y esperar su mensaje de error.

Es decir: tenemos que ver que el test, efectivamente, falla.

Lo primero que nos dirá al tratar de ejecutarlo es que la clase no existe. En TDD eso no es un problema, sino una indicación de lo que debemos hacer: añadir un archivo con la definición de la clase. Seguramente con las herramientas del IDE podamos generar ese código de manera automática, y es aconsejable hacerlo así.

En nuestro ejemplo, el mensaje del test dice:

```

1 
The
 
type
 
or
 
namespace
 
name
 
'
Year
'
 
could
 
not
 
be
 
found
 

2 
(
are
 
you
 
missing
 
a
 
using
 
directive
 
or
 
an
 
assembly
 
reference
?)

```

Y simplemente tendremos que crear la clase `Year`.

```

 1 
using
 
System
;


 2 
using
 
System.Runtime.Remoting.Metadata.W3cXsd2001
;


 3 
using
 
NUnit.Framework
;


 4 


 5 
namespace
 
LeapYear


 6 
{


 7 
  
public
 
class
 
Tests


 8 
  
{


 9 
        [Test]


10 
    
public
 
void
 
CanInstantiate
()


11 
    
{


12 
        
new
 
Year
();


13 
    
}


14 
  
}


15 


16 
  
public
 
class
 
Year


17 
  
{


18 
  
}


19 
}

```

En este punto volvemos a ejecutar el test para comprobar si pasa de rojo a verde. En muchos lenguajes este código será suficiente. En algunos casos puedes necesitar algo más.

Si es así, y el test pasa, el primer ciclo está completo y podremos pasar al siguiente comportamiento, a no ser que consideremos que tenemos posibilidades de hacer un refactor del código existente. Por ejemplo, lo habitual aquí sería mover la clase `Year` a su propio archivo.

```

1 
namespace
 
LeapYear


2 
{


3 
  
public
 
class
 
Year


4 
  
{


5 
  
}


6 
}

```

Si el test no ha pasado, nos fijaremos en el mensaje mostrado por el test fallido y actuaremos en consecuencia, añadiendo el código mínimo necesario para que, finalmente, pase y se ponga en verde.

## El segundo test y las tres leyes

Cuando hemos logrado hacer pasar el primer test aplicando las tres leyes podríamos pensar que no hemos conseguido realmente nada. Ni siquiera hemos abordado los posibles parámetros que podría necesitar la clase para ser construida, ya sean datos o colaboradores en el caso de servicios o  *use cases* . Incluso el IDE se estará quejando de que no estamos asignando el objeto instanciado a ninguna variable.

Sin embargo, es importante ceñirse a la metodología, sobre todo en estas primeras fases. Con la práctica y la ayuda de un buen IDE el primer ciclo nos habrá llevado apenas unos pocos segundos. En esos pocos segundos hemos escrito un código, ciertamente muy pequeño, pero totalmente respaldado por un test.

Nuestro objetivo sigue siendo que los tests nos dicten qué código tenemos que escribir para implementar cada nuevo comportamiento. Como nuestro primer test ya pasa, tendríamos que escribir el segundo.

Aplicando las tres leyes, lo que viene a continuación es:

* Escribir un nuevo test que defina un comportamiento
* Que ese test sea el mínimo posible para obligarnos a hacer un cambio en el código de producción
* Escribir el código de producción mínimo y suficiente que hace pasar el test

¿Cuál podría ser el próximo comportamiento que necesitamos definir? Si en el primer test nos hemos forzado a escribir el código mínimo necesario para instanciar la clase, el segundo test puede llevarnos por dos caminos:

* Forzarnos a escribir el código necesario para validar parámetros del constructor y, por tanto, poder instanciar un objeto con todo lo necesario.
* Forzarnos a introducir el método que ejecuta el comportamiento deseado.

Así, en nuestro ejemplo, podríamos simplemente asegurarnos de que `Year` es capaz de responder al mensaje `IsLeap`.

```

 1 
using
 
System
;


 2 
using
 
System.Runtime.Remoting.Metadata.W3cXsd2001
;


 3 
using
 
NUnit.Framework
;


 4 


 5 
namespace
 
LeapYear


 6 
{


 7 
  
public
 
class
 
Tests


 8 
  
{


 9 
        [Test]


10 
    
public
 
void
 
CanInstantiate
()


11 
    
{


12 
        
new
 
Year
();


13 
    
}
    

14 



15 
        [Test]


16 
    
public
 
void
 
CanRespondToIsLeapMessage
()


17 
    
{


18 
        
var
 
year
 
=
 
new
 
Year
();


19 
        
year
.
IsLeap
();


20 
    
}


21 
  
}


22 
}

```

El test arrojará este mensaje de error:

```

1 
'Year' does not contain a definition for 'IsLeap' and no accessible extension...
```

Que nos indica que el siguiente paso debería ser introducir el método que responde a ese mensaje:

```

1 
namespace
 
LeapYear


2 
{


3 
  
public
 
class
 
Year


4 
  
{


5 
    
public
 
void
 
IsLeap
()


6 
    
{


7 
    
}


8 
  
}


9 
}

```

En algunos IDE podría ocurrir que se introduzca automáticamente código para arrojar una excepción que indique que el método no ha sido implementado.

El test pasa, indicando que ahora los objetos de tipo `Year`, pueden atender al mensaje `IsLeap`.

Habiendo llegado a este punto, nos podríamos preguntar: ¿qué pasa si no cumplimos las tres leyes de TDD?

## Violaciones de las tres leyes y sus consecuencias

Obviando la broma fácil de que no acabaremos en la cárcel o con una multa por incumplir las leyes de TDD, lo cierto es que sí tendríamos que apechugar con algunas consecuencias.

### Primera ley: escribir código de producción sin tener un test

La consecuencia más inmediata es que rompemos el ciclo red-green. El código que escribimos ya no está guiado ni cubierto por tests. De hecho, si queremos tener esa parte testeada, tendremos que hacer un test a posteriori (un test de QA).

Imagina que hacemos esto:

```

 1 
using
 
System
;


 2 


 3 
namespace
 
LeapYear


 4 
{


 5 
  
public
 
class
 
Year


 6 
  
{


 7 
    
private
 
readonly
 
int
 
_aYear
;


 8 


 9 
    
public
 
Year
(
int
 
aYear
)


10 
    
{


11 
        
_aYear
 
=
 
aYear
;


12 
    
}


13 


14 
    
public
 
bool?
 
IsLeap
()


15 
    
{


16 
        
if
 
(
_aYear
 
%
 
4
 
==
 
0
)


17 
        
{


18 
            
return
 
true
;


19 
        
}


20 
        

21 
        
return
 
false
;


22 
    
}


23 
  
}


24 
}

```

Los tests existentes fallarán porque hay que pasar un parámetro a la constructora, además no tenemos ningún test que se haga cargo de verificar el comportamiento que hemos introducido.Tendríamos que añadir tests para cubrir la funcionalidad que hemos incorporado, pero ya no estamos dirigiendo el desarrollo.

### Segunda ley: escribir más que un test que falle

Esto podemos interpretarlo de dos formas: escribir varios tests o escribir un test que supone un salto de comportamiento demasiado grande.

Escribir más de un test provocaría varios problemas. Para hacerlos pasar todos necesitaríamos implementar una gran cantidad de código y la guía que nos podrían proporcionar esos mismos tests se desdibuja tanto que es como no tenerla. No contaríamos con una indicación concreta que podamos resolver implementando nuevo código.

```

 1 
using
 
System
;


 2 
using
 
System.Runtime.Remoting.Metadata.W3cXsd2001
;


 3 
using
 
NUnit.Framework
;


 4 


 5 
namespace
 
LeapYear


 6 
{


 7 
  
public
 
class
 
Tests


 8 
  
{


 9 
        [Test]


10 
    
public
 
void
 
CanInstantiate
()


11 
    
{


12 
        
new
 
Year
();


13 
    
}
    

14 



15 
        [Test]


16 
    
public
 
void
 
CanRespondToIsLeapMessage
()


17 
    
{


18 
        
var
 
year
 
=
 
new
 
Year
();


19 
        
year
.
IsLeap
();


20 
    
}


21 


22 
        [Test]


23 
    
public
 
void
 
CommonYearsShouldNotBeLeap
()


24 
    
{


25 
        
var
 
year
 
=
 
new
 
Year
(
1997
);


26 
        
Assert
.
False
(
year
.
IsLeap
());


27 
    
}


28 



29 
        [Test]


30 
    
public
 
void
 
YearDivisibleBy4ShouldBeLeap
()


31 
    
{


32 
        
var
 
year
 
=
 
new
 
Year
(
1996
);


33 
        
Assert
.
True
(
year
.
IsLeap
());


34 
    
}


35 
  
}


36 
}

```

Aquí hemos añadido dos tests. Para hacerlos pasar tendríamos que definir dos comportamientos. Además son tests demasiado  *grandes* . Todavía no hemos establecido, por ejemplo, que se pasa un parámetro a la constructora, ni que la respuesta será del tipo `bool`. Estos tests mezclan diversas responsabilidades y tratan de probar demasiadas cosas a la vez. Tendríamos que escribir demasiado código de producción de una sola vez, con lo que conlleva de inseguridad y espacio para que se produzcan errores.

En lugar de eso, necesitamos hacer tests para incrementos de funcionalidad más pequeños. Podemos ver varias posibilidades:

**Para introducir que la respuesta es `bool`** podemos asumir que, por defecto, los años no son bisiestos, por lo que esperaremos una respuesta `false`:

```

 1 
using
 
System
;


 2 
using
 
System.Runtime.Remoting.Metadata.W3cXsd2001
;


 3 
using
 
NUnit.Framework
;


 4 


 5 
namespace
 
LeapYear


 6 
{


 7 
  
public
 
class
 
Tests


 8 
  
{


 9 
        [Test]


10 
    
public
 
void
 
CanInstantiate
()


11 
    
{


12 
        
new
 
Year
();


13 
    
}
    

14 



15 
        [Test]


16 
    
public
 
void
 
CanRespondToIsLeapMessage
()


17 
    
{


18 
        
var
 
year
 
=
 
new
 
Year
();


19 
        
year
.
IsLeap
();


20 
    
}


21 


22 
        [Test]


23 
    
public
 
void
 
ByDefaultYearsAreNotLeapYears
()


24 
    
{


25 
        
var
 
year
 
=
 
new
 
Year
();


26 
        
Assert
.
False
(
year
.
IsLeap
());


27 
    
}


28 
  
}


29 
}

```

El error es:

```

1 
Argument 1: cannot convert from 'void' to 'bool?'
```

Se puede resolver con:

```

 1 
using
 
System
;


 2 


 3 
namespace
 
LeapYear


 4 
{


 5 
  
public
 
class
 
Year


 6 
  
{


 7 
    
public
 
Year
()


 8 
    
{


 9 


10 
    
}


11 


12 
    
public
 
bool
 
IsLeap
()


13 
    
{


14 
        
return
 
false
;


15 
    
}


16 
  
}


17 
}

```

Sin embargo, tenemos otra forma de hacerlo. Puesto que el lenguaje tiene tipado fuerte, podemos usar el sistema de tipos como test. Así en lugar de crear un test nuevo:

```

 1 
using
 
System
;


 2 
using
 
System.Runtime.Remoting.Metadata.W3cXsd2001
;


 3 
using
 
NUnit.Framework
;


 4 


 5 
namespace
 
LeapYear


 6 
{


 7 
  
public
 
class
 
Tests


 8 
  
{


 9 
        [Test]


10 
    
public
 
void
 
CanInstantiate
()


11 
    
{


12 
        
new
 
Year
();


13 
    
}
    

14 



15 
        [Test]


16 
    
public
 
void
 
CanRespondToIsLeapMessage
()


17 
    
{


18 
        
var
 
year
 
=
 
new
 
Year
();


19 
        
year
.
IsLeap
();


20 
    
}


21 
  
}


22 
}

```

Cambiamos el tipo de retorno de `IsLeap`:

```

 1 
using
 
System
;


 2 


 3 
namespace
 
LeapYear


 4 
{


 5 
  
public
 
class
 
Year


 6 
  
{


 7 
    
public
 
Year
()


 8 
    
{


 9 


10 
    
}


11 


12 
    
public
 
bool
 
IsLeap
()


13 
    
{


14 
        

15 
    
}


16 
  
}


17 
}

```

Al ejecutar el test nos indicará que hay un problema pues no devolvemos nada en la función:

```

1 
'Year.IsLeap()': not all code paths return a value
```

Y finalmente, no tenemos más que añadir una respuesta por defecto, que será `false`:

```

 1 
using
 
System
;


 2 


 3 
namespace
 
LeapYear


 4 
{


 5 
  
public
 
class
 
Year


 6 
  
{


 7 
    
public
 
Year
()


 8 
    
{


 9 


10 
    
}


11 


12 
    
public
 
bool
 
IsLeap
()


13 
    
{


14 
        
return
 
false
;


15 
    
}


16 
  
}


17 
}

```

**Para introducir el parámetro de construcción** podríamos recurrir a un refactor. Pero para esto el lenguaje de programación nos puede condicionar, llevándonos a distintas soluciones.

La vía del refactor es sencilla. Tan sólo tenemos que incorporar el parámetro, aunque de momento no lo usaremos. En C# y otros lenguajes podemos hacerlo por la vía de introducir un constructor alternativo, de este modo los tests seguirán pasando. En otros lenguajes, podríamos marcar el parámetro como opcional.

```

 1 
using
 
System
;


 2 


 3 
namespace
 
LeapYear


 4 
{


 5 
  
public
 
class
 
Year


 6 
  
{


 7 
    
private
 
readonly
 
int
 
_aYear
;


 8 


 9 
    
public
 
Year
()


10 
    
{


11 
        

12 
    
}


13 


14 
    
public
 
Year
(
int
 
aYear
)


15 
    
{


16 
        
_aYear
 
=
 
aYear
;


17 
    
}


18 
    

19 
    
public
 
bool
 
IsLeap
()


20 
    
{


21 
        
return
 
false
;


22 
    
}


23 
  
}


24 
}

```

Como para nosotras no tiene sentido un constructor sin parámetros, ahora podríamos eliminarlo, pero antes tendríamos que refactorizar los tests, de modo que usemos la versión con parámetro:

```

 1 
using
 
System
;


 2 
using
 
System.Runtime.Remoting.Metadata.W3cXsd2001
;


 3 
using
 
NUnit.Framework
;


 4 


 5 
namespace
 
LeapYear


 6 
{


 7 
  
public
 
class
 
Tests


 8 
  
{


 9 
        [Test]


10 
    
public
 
void
 
CanInstantiate
()


11 
    
{


12 
        
new
 
Year
(
1997
);


13 
    
}
    

14 



15 
        [Test]


16 
    
public
 
void
 
CanRespondToIsLeapMessage
()


17 
    
{


18 
        
var
 
year
 
=
 
new
 
Year
(
1997
);


19 
        
year
.
IsLeap
();


20 
    
}


21 
  
}


22 
}

```

Lo cierto es que el primer test nos sobra, porque está implícito en el otro.

```

 1 
using
 
System
;


 2 
using
 
System.Runtime.Remoting.Metadata.W3cXsd2001
;


 3 
using
 
NUnit.Framework
;


 4 


 5 
namespace
 
LeapYear


 6 
{


 7 
  
public
 
class
 
Tests


 8 
  
{


 9 
        [Test]


10 
    
public
 
void
 
CanRespondToIsLeapMessage
()


11 
    
{


12 
        
var
 
year
 
=
 
new
 
Year
(
1997
);


13 
        
year
.
IsLeap
();


14 
    
}


15 


16 
  
}


17 
}

```

Y ahora podemos eliminar el constructor sin parámetros, ya que no se volverá a usar en ningún caso:

```

 1 
using
 
System
;


 2 


 3 
namespace
 
LeapYear


 4 
{


 5 
  
public
 
class
 
Year


 6 
  
{


 7 
    
private
 
readonly
 
int
 
_aYear
;


 8 


 9 
    
public
 
Year
(
int
 
aYear
)


10 
    
{


11 
        
_aYear
 
=
 
aYear
;


12 
    
}


13 
    

14 
    
public
 
bool
 
IsLeap
()


15 
    
{


16 
        
return
 
false
;


17 
    
}


18 
  
}


19 
}

```

### Tercera ley: escribir más del código de producción necesario para que pase el test

Se trata quizá de la violación más frecuente de todas. Llega un momento en que “vemos” el algoritmo con tanta claridad que nuestro impulso es escribirlo ya y terminar el proceso. Sin embargo, esto nos puede lleva a obviar algunas situaciones. Por ejemplo, en una aplicación podríamos “ver” el algoritmo general e implementarlo. Sin embargo, eso podría habernos distraído de uno o varios casos particulares y no contemplarlos, lo que una vez incorporado a la aplicación y desplegado posiblemente aparecerían errores en producción, incluso con pérdidas económicas.

Por ejemplo, si añadimos un test para probar que controlamos los años no bisiestos:

```

 1 
using
 
System
;


 2 
using
 
System.Runtime.Remoting.Metadata.W3cXsd2001
;


 3 
using
 
NUnit.Framework
;


 4 


 5 
namespace
 
LeapYear


 6 
{


 7 
  
public
 
class
 
Tests


 8 
  
{


 9 
        [Test]


10 
    
public
 
void
 
CanRespondToIsLeapMessage
()


11 
    
{


12 
        
var
 
year
 
=
 
new
 
Year
(
1997
);


13 
        
year
.
IsLeap
();


14 
    
}


15 


16 
        [Test]


17 
    
public
 
void
 
CommonYearsAreNoLeapYears
()


18 
    
{


19 
        
var
 
year
 
=
 
new
 
Year
(
1997
);


20 
        
Assert
.
False
(
year
.
IsLeap
());


21 
    
}


22 
  
}


23 
}

```

En el estado actual de nuestro ejercicio, un exceso de código sería este:

```

 1 
using
 
System
;


 2 


 3 
namespace
 
LeapYear


 4 
{


 5 
  
public
 
class
 
Year


 6 
  
{


 7 
    
private
 
readonly
 
int
 
_aYear
;


 8 


 9 
    
public
 
Year
(
int
 
aYear
)


10 
    
{


11 
        
_aYear
 
=
 
aYear
;


12 
    
}


13 
    

14 
    
public
 
bool
 
IsLeap
()


15 
    
{


16 
        
if
 
(
_aYear
 
%
 
4
 
==
 
0
)


17 
        
{


18 
            
if
 
(
_aYear
 
%
 
400
 
==
 
0
)


19 
            
{


20 
                
return
 
false
;


21 
            
}


22 


23 
            
if
 
(
_aYear
 
%
 
100
 
==
 
0
)


24 
            
{


25 
                
return
 
true
;


26 
            
}


27 


28 
            
return
 
true
;


29 
        
}


30 
        
return
 
false
;


31 
    
}


32 
  
}


33 
}

```

El test pasa con este código, pero como puedes ver se ha introducido mucho más del necesario para tener el comportamiento definido por el test, añadiendo código para controlar los años bisiestos y los casos especiales. Así que aparentemente todo esta bien.

Si probamos un año bisiesto, veremos que el código funciona, lo que refuerza nuestra impresión de que todo esta bien.

```

 1 
using
 
System
;


 2 
using
 
System.Runtime.Remoting.Metadata.W3cXsd2001
;


 3 
using
 
NUnit.Framework
;


 4 


 5 
namespace
 
LeapYear


 6 
{


 7 
  
public
 
class
 
Tests


 8 
  
{


 9 
        [Test]


10 
    
public
 
void
 
CanRespondToIsLeapMessage
()


11 
    
{


12 
        
var
 
year
 
=
 
new
 
Year
(
1997
);


13 
        
year
.
IsLeap
();


14 
    
}


15 


16 
        [Test]


17 
    
public
 
void
 
CommonYearsAreNoLeapYears
()


18 
    
{


19 
        
var
 
year
 
=
 
new
 
Year
(
1997
);


20 
        
Assert
.
False
(
year
.
IsLeap
());


21 
    
}


22 


23 
        [Test]


24 
    
public
 
void
 
ShouldIdentifyStandardLeapYears
()


25 
    
{


26 
        
var
 
year
 
=
 
new
 
Year
(
1996
);


27 
        
Assert
.
True
(
year
.
IsLeap
());


28 
    
}


29 
  
}


30 
}

```

Pero, un nuevo test falla. Los años divisibles por 100 no deben ser bisiestos (salvo que sean divisibles por 400), y este error lleva un buen rato en nuestro código, pero hasta ahora no teníamos un test que ejecutase esa parte del código.

```

 1 
using
 
System
;


 2 
using
 
System.Runtime.Remoting.Metadata.W3cXsd2001
;


 3 
using
 
NUnit.Framework
;


 4 


 5 
namespace
 
LeapYear


 6 
{


 7 
  
public
 
class
 
Tests


 8 
  
{


 9 
        [Test]


10 
    
public
 
void
 
CanRespondToIsLeapMessage
()


11 
    
{


12 
        
var
 
year
 
=
 
new
 
Year
(
1997
);


13 
        
year
.
IsLeap
();


14 
    
}


15 


16 
        [Test]


17 
    
public
 
void
 
CommonYearsAreNoLeapYears
()


18 
    
{


19 
        
var
 
year
 
=
 
new
 
Year
(
1997
);


20 
        
Assert
.
False
(
year
.
IsLeap
());


21 
    
}


22 


23 
        [Test]


24 
    
public
 
void
 
ShouldIdentifyStandardLeapYears
()


25 
    
{


26 
        
var
 
year
 
=
 
new
 
Year
(
1996
);


27 
        
Assert
.
True
(
year
.
IsLeap
());


28 
    
}


29 



30 
        [Test]


31 
    
public
 
void
 
ShouldIdentifyCenturyExceptionOfLeapYears
()


32 
    
{


33 
        
var
 
year
 
=
 
new
 
Year
(
1900
);


34 
        
Assert
.
False
(
year
.
IsLeap
());


35 
    
}


36 
  
}


37 
}

```

Este es el tipo de problemas que pueden pasar desapercibidos cuando añadimos demasiado código para hacer pasar un test. El exceso de código posiblemente no afecta al test que tenemos entre manos, por lo que no sabremos si esconde algún tipo de problema y no lo sabremos si no llegamos a construir un test que lo ponga de manifiesto. O peor: no lo sabremos hasta que el *bug* explota en producción.

La solución es bastante simple: añade sólo el código estrictamente necesario para que el test pase, aunque sólo sea devolver el valor esperado por el propio test. No introduzcas comportamiento si no existe antes un test que te obligue a ello porque está fallando.

En nuestro caso era el test que verificaba el tratamiento de los años no bisiestos. De hecho, el siguiente test, que pretendía introducir el comportamiento de detectar los años bisiestos estándar (años divisibles por 4) pasaba sin necesidad de añadir nuevo código. Esto nos lleva al siguiente punto.

## Qué significa que un test pase nada más escribirlo

Cuando escribimos un test y pasa sin añadir código de producción puede ser por alguno de estos motivos:

* El algoritmo que hemos escrito es lo bastante general como para cubrir todos los casos posibles: hemos terminado nuestro desarrollo.
* El ejemplo que hemos elegido no es cualitativamente diferente de otros que ya hemos usado y por lo tanto no nos fuerza a escribir código de producción. tenemos que encontrar otro ejemplo.
* Hemos añadido demasiado código, que es lo que acabamos de contar en el apartado anterior..

En esta kata Leap Year, por ejemplo, llegará un momento en que no hay forma de escribir un test que falle porque el algoritmo cubre todos los casos: años no bisiestos, bisiestos, años no bisiestos cada 100 años y bisiestos cada 400 años.

La otra posibilidad es que el ejemplo escogido no sea representativo de un nuevo comportamiento, lo que puede venir dado por una mala definición de la tarea o por no haber analizado bien los posibles escenarios.

## El ciclo red-green-refactor

Las tres leyes establecen un *framework* que podríamos llamar “de bajo nivel”. Martin Fowler, por su parte, define el ciclo TDD en estas tres fases que estarían en un nivel superior de abstracción:

* Escribe un test para el siguiente fragmento de funcionalidad que deseas añadir.
* Escribe el código de producción necesario para que el test pase.
* Refactoriza el código, tanto el nuevo como el anterior, para que esté bien estructurado.

Estas tres fases definen lo que se suele conocer como el ciclo “red-green-refactor”, nombrado así en relación al estado de los tests en cada una de las fases del ciclo:

* **Red** : la creación de un test que falla (está en rojo) y que describe la funcionalidad o comportamiento que queremos introducir en el software de producción.
* **Green** : la escritura del código de producción necesario para hacer pasar el test (ponerlo en verde) con lo cual se verifica que se ha añadido el comportamiento especificado.
* **Refactor** : manteniendo los tests en verde, reorganizar el código para estructurarlo mejor, haciéndolo más legible y sostenible sin perder la funcionalidad desarrollada hasta el momento.

En la práctica los ciclos de refactor surgen después de un cierto número de ciclos de las tres leyes. Los pequeños cambios impulsados por éstas se acumulan hasta llegar a un punto en el que comienzan a aparecer *smells* de código que requieren el refactor.

## Referencias

* [The three rules of TDD](http://butunclebob.com/ArticleS.UncleBob.TheThreeRulesOfTdd)^[1](https://leanpub.com/tddcourse/read#fn-fn18)^
* [The three rules of TDD - video](https://www.youtube.com/watch?v=AoIfc5NwRks)^[2](https://leanpub.com/tddcourse/read#fn-fn19)^
* [Refactoring the three laws of TDD](http://www.javiersaldana.com/articles/tech/refactoring-the-three-laws-of-tdd)^[3](https://leanpub.com/tddcourse/read#fn-fn20)^
* [TDD with PHPSpec](https://es.slideshare.net/CiaranMcNulty/tdd-with-phpspec)^[4](https://leanpub.com/tddcourse/read#fn-fn21)^
* [The 3 Laws of TDD: Focus on One Thing at a Time](https://qualitycoding.org/3-laws-tdd/)^[5](https://leanpub.com/tddcourse/read#fn-fn22)^
* [Test Driven Development](https://martinfowler.com/bliki/TestDrivenDevelopment.html)^[6](https://leanpub.com/tddcourse/read#fn-fn23)^
* [The cycles of TDD](https://blog.cleancoder.com/uncle-bob/2014/12/17/TheCyclesOfTDD.html)^[7](https://leanpub.com/tddcourse/read#fn-fn24)^

# 5 Fizz Buzz

## Entendiendo las leyes y ciclos de TDD

La kata FizzBuzz es una de las katas más sencillas para empezar a practicar TDD. Plantea un problema muy simple y bien acotado, por lo que en una primera fase es muy fácil resolverla por completo en una sesión de una ó dos horas. Pero también se pueden ampliar sus requerimientos y lograr desarrollos más complejos, como poner el requisito de que las reglas o el tamaño de la lista sean configurables, que se puedan añadir nuevas reglas, etc.

En este caso, al tratarse de nuestra primera kata, seguiremos la versión más sencilla.

## Historia

Según Coding Dojo, [no se conoce la autoría de la kata](http://codingdojo.org/kata/FizzBuzz/) ^[1](https://leanpub.com/tddcourse/read#fn-fn25)^ , pero se considera que fue presentada en sociedad por Michael Feathers y Emily Bache en 2008, en el marco de la conferencia Agile2008.

## Enunciado

**FizzBuzz** es un juego relacionado con el aprendizaje de la división en el que un grupo de estudiantes cuentan los números por turno, reemplazando cada número divisible por tres con la palabra “Fizz” y cada número divisible por cinco con la palabra “Buzz”. Si el número es divisible por ambos, entonces se dice “FizzBuzz”.

Así que nuestro objetivo será escribir un programa que imprima los números del 1 al 100 de tal manera que:

* si el número es divisible por 3 devuelve  **Fizz** .
* si el número es divisible por 5 devuelve  **Buzz** .
* si el número es divisible por 3 y 5 devuelve  **FizzBuzz** .

## Orientaciones para resolverla

La kata Fizz Buzz nos va a servir para entender y comenzar a aplicar el ciclo Red-Green-Refactor y las Tres leyes de TDD.

Lo primero que nos conviene hacer es considerar el problema y hacernos una idea general de cómo vamos a solucionarlo. TDD es una estrategia que nos ayuda a evitar la necesidad de hacer un detallado análisis y diseño exhaustivo previo a la solución, pero eso no significa que no debamos primero entender el problema y considerar cómo lo vamos a atacar.

Esto también es necesario para evitar dejarnos llevar por el enunciado literal de la kata, que nos puede llevar a callejones sin salida.

Lo primero que vamos a hacer, una vez que tenemos esa idea general de cómo vamos a enfocar el objetivo, es aplicar la primera ley y escribir un test que falle.

Este test debería definir el primer comportamiento que necesitamos implementar.

Escribir un test que falle significa, en este momento, escribir un test que no va a funcionar porque no existe ningún código que ejecutar, cosa que nos van a decir los mensajes de error. Aunque te parezca absurdo debes intentar ejecutar el test y confirmar que no pasa. Son los mensajes del test los que te van a indicar qué hacer a continuación.

Para conseguir hacer que el test falle tenemos que aplicar la segunda ley, que dice que no podemos escribir un test más grande de lo que sea suficiente para fallar. El test más pequeño posible debería obligarnos a definir la clase instanciándola y poco más.

Por último, para hacer que el test pase, aplicaremos la tercera ley, que dice que no debemos escribir más código de producción que el necesario para que el test pase. Es decir: definir la clase, en su caso el método que vamos a ejercitar y hacer que éste devuelva alguna respuesta que finalmente haga pasar el test.

Los dos primeros pasos de esta fase son bastante obvios, pero el tercero no tanto.

Con los dos primeros pasos intentamos llegar a conseguir que el test falle por los motivos adecuados. Es decir, primero falla porque no hemos escrito la clase y, en consecuencia la definimos. Luego fallará porque nos falta el método al que estamos llamando, así que lo definimos. Finalmente fallará porque no devuelve la respuesta que esperamos, que es lo que queremos llegar a testear.

¿Y qué respuesta deberíamos estar devolviendo en cada caso? Pues ni más ni menos la que espera el test.

Una vez que tenemos un primer test y un primer código de producción que lo hace pasar nos haremos la pregunta: ¿cuál sería el siguiente comportamiento que debería implementar?

## Enlaces de interés sobre la kata FizzBuzz

* [Vídeo de la kata por Jesús López de la Cruz](https://jesuslc.com/2016/02/17/kata-fizzbuzz/)^[2](https://leanpub.com/tddcourse/read#fn-fn26)^
* [FizzBuzz en Kata-log](https://kata-log.rocks/fizz-buzz-kata)^[3](https://leanpub.com/tddcourse/read#fn-fn27)^
* [FizzBuzz resuelta en SmallTalk](https://www.youtube.com/watch?v=BV86r2k6QI8)^[4](https://leanpub.com/tddcourse/read#fn-fn28)^
* [Code Katas Explained: FizzBuzz](https://www.youtube.com/watch?v=JyRouDwzCoo)^[5](https://leanpub.com/tddcourse/read#fn-fn29)^
* [TDD — Which Order to Write Your Tests](https://cloudnative.ly/which-order-to-write-your-tests-7ea2937761a1)^[6](https://leanpub.com/tddcourse/read#fn-fn30)^
* [Solución en Python usando una lista de casos de uso](https://www.linkedin.com/learning/unit-testing-and-test-driven-development-in-python/example-tdd-session-the-fizzbuzz-kata)^[7](https://leanpub.com/tddcourse/read#fn-fn31)^

# 6 Resolviendo la kata Fizz Buzz

## Enunciado de la kata

Nuestro objetivo será escribir un programa que imprima los números del 1 al 100 de tal manera que:

* si el número es divisible por 3 devuelve  **Fizz** .
* si el número es divisible por 5 devuelve  **Buzz** .
* si el número es divisible por 3 y 5 devuelve  **FizzBuzz** .

## Lenguaje y enfoque

Esta kata la vamos a hacer en Python con `unittest` como entorno de testing. La tarea consiste crear una clase `FizzBuzz`, que tendrá un método `generate` para crear la lista, de modo que se usará más o menos así:

```

1 
fizzbuzz
 
=
 
Fizzbuzz
()


2 
print
(
fizzbuzz
.
generate
())

```

Para ello creo una carpeta `fizzbuzzkata` y dentro añado el archivo `fixzzbuzz_test.py`.

## Definir la clase

Lo que nos pide el ejercicio es obtener una lista de los números 1 al 100 cambiando algunos de ellos por las palabras ‘Fizz’, ‘Buzz’ o ambas en caso de cumplirse ciertas condiciones.

Fíjate que no nos pide una lista de cualquier cantidad de números, sino específicamente del 1 al 100. Volveremos a eso dentro de un momento.

Ahora vamos a concentrarnos en ese primer test. Lo menos que podemos hacer es que se pueda instanciar un objeto del tipo `FizzBuzz`. He aquí un posible primer test:

```

 1 
import
 
unittest


 2 


 3 


 4 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 5 
  
def
 
test_something
(
self
):


 6 
    
FizzBuzz
()


 7 


 8 


 9 
if
 
__name__
 
==
 
'__main__'
:


10 
  
unittest
.
main
()

```

Puede parecer extraño. Este test se limita a intentar instanciar la clase y nada más.

Este primer test debería ser suficiente para fallar, que es lo que dice la segunda ley, y forzarnos a definir la clase para que el test pueda pasar, cumpliendo la tercera ley. En algunos entornos sería necesaria una aserción ya que consideran que el test no ha pasado si no se ha verificado explícitamente, cosa que no sucede en Python.

Así que lo lanzamos para ver si es verdad que falla. El resultado, como era de esperar es que el test no pasa, mostrando el siguiente error, el cual es justo el que esperaríamos ver:

```

1 
NameError
:
 
name
 
'FizzBuzz'
 
is
 
not
 
defined

```

Para hacer que el test pase, tendremos que definir la clase FizzBuzz, cosa que haremos en el propio archivo del test.

```

 1 
import
 
unittest


 2 


 3 
class
 
FizzBuzz
(
object
):


 4 
  
pass


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
def
 
test_something
(
self
):


 8 
    
FizzBuzz
()


 9 


10 


11 
if
 
__name__
 
==
 
'__main__'
:


12 
  
unittest
.
main
()

```

Y con esto el test pasará. Ahora que estamos en verde podemos pensar en refactorizar. La clase no tiene código. Pero el test no tiene un nombre adecuado, ahora podríamos cambiarlo:

```

 1 
import
 
unittest


 2 


 3 
class
 
FizzBuzz
:


 4 
  
pass


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
def
 
test_can_instantiate
(
self
):


 8 
    
FizzBuzz
()


 9 


10 


11 
if
 
__name__
 
==
 
'__main__'
:


12 
  
unittest
.
main
()

```

Normalmente, es mejor que las clases estén en su propio archivo (o módulo en Python) porque es más fácil gestionar el código y saber dónde está casa cosa. Definitivamente no queremos el código de producción en el archivo del test, así que creamos el archivo `fizzbuzz.py` moviendo de paso la clase.

Y en el test, la importamos:

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
def
 
test_can_instantiate
(
self
):


 8 
    
FizzBuzz
()


 9 


10 


11 
if
 
__name__
 
==
 
'__main__'
:


12 
  
unittest
.
main
()

```

Al introducir este cambio y ejecutar el test podemos ver que ahora sí pasa y ya estamos en verde.

Hemos cumplido las tres leyes y cerrado nuestro primer ciclo test-código-refactor. No hay mucho más que podamos hacer aquí, salvo pasar al siguiente test.

## Definir el método `generate`

La clase `FizzBuzz` no sólo no hace nada, ni siquiera tiene métodos. Hemos dicho que queremos que tenga un método `generate` que es el que devolverá la lista de los números del 1 al 100.

Para forzarnos a escribir el método `generate`, tenemos que escribir un test que lo llame. El método tendrá que devolver algo, ¿no? No. No siempre es necesario que devuelva algo. Nos basta con que nada se rompa al llamar al método.

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
def
 
test_can_instantiate
(
self
):


 8 
    
FizzBuzz
()


 9 


10 
  
def
 
test_responds_to_generate_message
(
self
):


11 
    
fizzbuzz
 
=
 
FizzBuzz
()


12 
    
fizzbuzz
.
generate
()


13 


14 


15 
if
 
__name__
 
==
 
'__main__'
:


16 
  
unittest
.
main
()

```

Al ejecutar el test nos dice que no tiene ningún método `generate`:

```

1 
AttributeError: 'FizzBuzz' object has no attribute 'generate'
```

Por supuesto que no lo tiene, tenemos que añadirlo:

```

1 
class
 
FizzBuzz
(
object
):


2 
  
def
 
generate
(
self
):


3 
    
pass

```

Ahora ya tenemos una clase capaz de responder al mensaje `generate`. ¿Podemos hacer algún refactor aquí?

Pues sí, pero no en el código de producción, sino en los tests. Resulta que este test que acabamos de escribir se superpone al anterior. Es decir, el test `test_responds_to_generate_message` cubre al test `test_can_instantiate`, convirtiéndolo en redundante. Por tanto, lo podemos quitar:

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
def
 
test_responds_to_generate_message
(
self
):


 8 
    
fizzbuzz
 
=
 
FizzBuzz
()


 9 
    
fizzbuzz
.
generate
()


10 


11 


12 
if
 
__name__
 
==
 
'__main__'
:


13 
  
unittest
.
main
()

```

Quizá esto te sorprenda. Es lo que comentamos al principio del libro, algunos de los tests que utilizamos para dirigir el desarrollo dejan de tener utilidad por un motivo u otro, generalmente porque son redundantes y no aportan ninguna información que no nos estén dando otros tests.

## Definir un comportamiento para `generate`

Específicamente queremos que nos devuelva una lista de números. Pero ahora no hace falta que lo haga con los múltiplos de 3 y 5 convertidos.

El test debe verificar esto, pero debe seguir pasando cuando hayamos desarrollado el algoritmo completo. Lo que podemos verificar es que devuelve una lista de 100 elementos, sin prestar atención a los que contiene exactamente.

Este test nos forzará a darle un comportamiento en respuesta al mensaje `generate`:

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 


 8 
  
def
 
test_respond_to_generate_message
(
self
):


 9 
    
fizzbuzz
 
=
 
FizzBuzz
()


10 
    
fizzbuzz
.
generate
()


11 


12 
  
def
 
test_generates_list_of_100_elements
(
self
):


13 
    
fizzbuzz
 
=
 
FizzBuzz
()


14 
    
num_list
 
=
 
fizzbuzz
.
generate
()


15 
    
self
.
assertEqual
(
100
,
 
len
(
num_list
))


16 


17 


18 
if
 
__name__
 
==
 
'__main__'
:


19 
  
unittest
.
main
()

```

Por supuesto, el test falla:

```

1 
TypeError
:
 
object
 
of
 
type
 
'NoneType'
 
has
 
no
 
len
()

```

Ahora mismo, el método devuelve `None`. Nosotros queremos una lista:

```

1 
class
 
FizzBuzz
(
object
):


2 
  
def
 
generate
(
self
):


3 
    
return
 
[]

```

Al hacer que `generate` devuelva una lista, hacemos que el test falle porque no se cumple lo que esperamos: que la lista tenga un cierto número de elementos:

```

1 
AssertionError
:
 
100
 
!=
 
0

```

Este ya es un error del test. Los anteriores eran básicamente errores equivalentes a los errores de compilación (errores de sintaxis, etc). Por eso es tan importante ver los tests fallar, para utilizar el feedback que nos proporcionan los mensajes de error.

Hacer que el test pase es bastante fácil:

```

1 
class
 
FizzBuzz
(
object
):


2 
  
def
 
generate
(
self
):


3 
    
return
 
[
None
]
 
*
 
100

```

Con el test pasando vamos a pensar un poco.

En primer lugar, se puede argumentar que en este test hemos pedido que la respuesta de `generate` cumpla dos condiciones:

* ser de tipo list (o array, o collection)
* tener exactamente 100 elementos

Podríamos haber forzado esto mismo con dos tests aún más pequeños.

A estos pequeños pasos se les suele llamar *baby steps* y lo cierto es que no tienen una medida determinada, sino que dependen de nuestra práctica y experiencia.

Así, por ejemplo, el test que hemos creado es lo bastante pequeño como para no generar un gran salto de código en producción, aunque es capaz de verificar las dos condiciones a la vez.

En segundo lugar, fíjate que hemos escrito tan sólo el código necesario para que se cumpla el test. De hecho devolvemos una lista de 100 elementos `None`, lo cual parece que no tiene mucho sentido pero es suficiente para nuestro objetivo con este test. Recuerda: no escribas más código del necesario para hacer pasar el test.

En tercer lugar, ya tenemos bastante código escrito, entre test y producción, como para examinarlo y ver si tenemos alguna oportunidad de refactorizar.

La oportunidad más clara de refactor que tenemos ahora mismo es el número mágico 100, que podríamos representar mediante una constante de la clase. De nuevo, cada lenguaje te ofrecerá sus propias opciones:

```

1 
class
 
FizzBuzz
(
object
):


2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


3 


4 
  
def
 
generate
(
self
):


5 
    
return
 
[
None
]
 
*
 
self
.
_NUMBER_OF_ELEMENTS

```

Y tenemos alguna en el código de test. Otra vez el test que hemos añadido se superpone e incluye al anterior, por lo que podríamos quitarlo.

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 


 8 
  
def
 
test_generates_list_of_100_elements
(
self
):


 9 
    
fizzbuzz
 
=
 
FizzBuzz
()


10 
    
num_list
 
=
 
fizzbuzz
.
generate
()


11 
    
self
.
assertEqual
(
100
,
 
len
(
num_list
))


12 


13 


14 
if
 
__name__
 
==
 
'__main__'
:


15 
  
unittest
.
main
()

```

De igual manera, el nombre del test puede mejorar. En lugar de hacer una referencia a la cifra concreta, podríamos simplemente indicar algo más general, que no ate el test a un detalle específico de la implementación:

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 


 8 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


 9 
    
fizzbuzz
 
=
 
FizzBuzz
()


10 
    
num_list
 
=
 
fizzbuzz
.
generate
()


11 
    
self
.
assertEqual
(
100
,
 
len
(
num_list
))


12 


13 


14 
if
 
__name__
 
==
 
'__main__'
:


15 
  
unittest
.
main
()

```

Por último, y no menos importante, igualmente tenemos un número mágico 100, al cual le pondremos un nombre:

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 


15 
if
 
__name__
 
==
 
'__main__'
:


16 
  
unittest
.
main
()

```

Y con esto, hemos terminado un nuevo ciclo en el que ya hemos introducido la fase de refactor.

## Generar una lista de números

Nuestra clase `FizzBuzz` ya puede generar una lista de 100 elementos, pero de momento cada uno de ellos es, literalmente, nada. Es hora de escribir un test que nos fuerce a poner números en esa lista.

Para ellos podríamos esperar que la lista generada contenga los números del 1 al 100. Sin embargo tenemos un problema: al final del proceso de desarrollo la lista contendrá los números pero algunos de ellos estarán representados con las palabras  **Fizz** , **Buzz** o  **FizzBuzz** . Si no tengo esto en cuenta, este tercer test empezará a fallar en cuanto comience a implementar el algoritmo que convierte los números. No parece una buena solución.

Un enfoque más prometedor es: ¿qué números no se verán afectados por el algoritmo? Pues aquellos que no sean múltiplos de 3 o de 5, por tanto podríamos escoger algunos de ellos para verificar que se incluyen en la lista sin transformar.

El más sencillo de todos es el 1, que debería figurar en la primera posición de la lista. Por razones de simetría vamos a hacer que los números se generen como `strings`.

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_one_is_represented_as_itself
(
self
):


15 
    
fizzbuzz
 
=
 
FizzBuzz
()


16 
    
num_list
 
=
 
fizzbuzz
.
generate
()


17 
    
self
.
assertEqual
(
'1'
,
 
num_list
[
0
])


18 


19 


20 
if
 
__name__
 
==
 
'__main__'
:


21 
  
unittest
.
main
()

```

El test es muy pequeño y falla:

```

1 
None != 1
```

¿Qué cambio podríamos introducir en el código de producción en este punto para que el test pase? El más obvio podría ser el siguiente:

```

1 
class
 
FizzBuzz
(
object
):


2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


3 


4 
  
def
 
generate
(
self
):


5 
    
return
 
[
'1'
]
 
*
 
self
.
_NUMBER_OF_ELEMENTS

```

Lo cierto es que es suficiente como para pasar el test, así que nos vale.

Un problema que tenemos aquí es que el número 1 no aparece como tal en el test. Sí aparece su representación, pero usamos su posición en `num_list`, que es un array 0-indexed. Vamos a hacer explícito que estamos testeando sobre la representación de un número. Primero introducimos el concepto de  *posición* :

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_one_is_represented_as_itself
(
self
):


15 
    
fizzbuzz
 
=
 
FizzBuzz
()


16 
    
num_list
 
=
 
fizzbuzz
.
generate
()


17 
    
position
 
=
 
0


18 
    
self
.
assertEqual
(
'1'
,
 
num_list
[
position
])


19 


20 


21 
if
 
__name__
 
==
 
'__main__'
:


22 
  
unittest
.
main
()

```

Y ahora el de  *número* , así como su relación con  *posición* :

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_one_is_represented_as_itself
(
self
):


15 
    
fizzbuzz
 
=
 
FizzBuzz
()


16 
    
num_list
 
=
 
fizzbuzz
.
generate
()


17 
    
number
 
=
 
1


18 
    
position
 
=
 
number
 
-
 
1


19 
    
self
.
assertEqual
(
'1'
,
 
num_list
[
position
])


20 


21 


22 
if
 
__name__
 
==
 
'__main__'
:


23 
  
unittest
.
main
()

```

Ya no necesitamos referirnos a la posición para nada, tan sólo al número.

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_one_is_represented_as_itself
(
self
):


15 
    
fizzbuzz
 
=
 
FizzBuzz
()


16 
    
num_list
 
=
 
fizzbuzz
.
generate
()


17 
    
number
 
=
 
1


18 
    
self
.
assertEqual
(
'1'
,
 
num_list
[(
number
 
-
 
1
)])


19 


20 


21 
if
 
__name__
 
==
 
'__main__'
:


22 
  
unittest
.
main
()

```

Podríamos hacer el test más fácil de leer. Primero separamos la verificación:

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_one_is_represented_as_itself
(
self
):


15 
    
number
 
=
 
1


16 


17 
    
self
.
__assert_number_is_represented_as
(
number
)


18 


19 
  
def
 
__assert_number_is_represented_as
(
self
,
 
number
):


20 
    
fizzbuzz
 
=
 
FizzBuzz
()


21 
    
num_list
 
=
 
fizzbuzz
.
generate
()


22 
    
self
.
assertEqual
(
'1'
,
 
num_list
[(
number
 
-
 
1
)])


23 


24 


25 
if
 
__name__
 
==
 
'__main__'
:


26 
  
unittest
.
main
()

```

Extraemos la *representación* como parámetro en la aserción y hacemos un *inline* de `number` para que sea más fluida la lectura:

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_one_is_represented_as_itself
(
self
):


15 
    
self
.
__assert_number_is_represented_as
(
1
,
 
'1'
)


16 


17 
  
def
 
__assert_number_is_represented_as
(
self
,
 
number
,
 
representation
):


18 
    
fizzbuzz
 
=
 
FizzBuzz
()


19 
    
num_list
 
=
 
fizzbuzz
.
generate
()


20 
    
self
.
assertEqual
(
representation
,
 
num_list
[(
number
 
-
 
1
)])


21 


22 


23 
if
 
__name__
 
==
 
'__main__'
:


24 
  
unittest
.
main
()

```

Como ves, hemos trabajado mucho en el test. Ahora será muy *barato* introducir nuevos ejemplos, lo que nos ayudará a escribir más tests y que el proceso sea más agradable y cómodo.

## Seguimos generando números

En realidad todavía no hemos verificado que el método `generate` nos esté dando una lista de números, así que necesitamos seguir proponiendo nuevos tests que nos fuercen a introducir ese código.

Vamos a asegurarnos de que en la segunda posición aparece el número 2 que es el siguiente más sencillo que no es múltiplo de 3 o de 5:

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_one_is_represented_as_itself
(
self
):


15 
    
self
.
__assert_number_is_represented_as
(
1
,
 
'1'
)


16 
    
self
.
__assert_number_is_represented_as
(
2
,
 
'2'
)


17 


18 
  
def
 
__assert_number_is_represented_as
(
self
,
 
number
,
 
representation
):


19 
    
fizzbuzz
 
=
 
FizzBuzz
()


20 
    
num_list
 
=
 
fizzbuzz
.
generate
()


21 
    
self
.
assertEqual
(
representation
,
 
num_list
[(
number
 
-
 
1
)])


22 


23 


24 
if
 
__name__
 
==
 
'__main__'
:


25 
  
unittest
.
main
()

```

Tenemos un nuevo test y también falla, así que vamos a añadir código en producción para que el test pase. Sin embargo, tenemos algunos problemas con esta implementación:

```

1 
class
 
FizzBuzz
(
object
):


2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


3 


4 
  
def
 
generate
(
self
):


5 
    
return
 
[
'1'
]
 
*
 
self
.
_NUMBER_OF_ELEMENTS

```

Para intervenir en ella necesitaríamos refactorizarla un poco primero. Como mínimo extraer la respuesta a una variable que podamos manipular antes de devolverla.

Pero como el test ahora mismo está fallando no podemos refactorizar. Antes tenemos que anular o borrar el test que acabamos de crear. Lo más fácil es comentarlo y así no se ejecutará. Recuerda, para hacer refactor es obligatorio que los tests pasen:

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_one_is_represented_as_itself
(
self
):


15 
    
self
.
__assert_number_is_represented_as
(
1
,
 
'1'
)


16 
    
# self.__assert_number_is_represented_as(2, '2')


17 


18 
  
def
 
__assert_number_is_represented_as
(
self
,
 
number
,
 
representation
):


19 
    
fizzbuzz
 
=
 
FizzBuzz
()


20 
    
num_list
 
=
 
fizzbuzz
.
generate
()


21 
    
self
.
assertEqual
(
representation
,
 
num_list
[(
number
 
-
 
1
)])


22 


23 


24 
if
 
__name__
 
==
 
'__main__'
:


25 
  
unittest
.
main
()

```

Ahora sí podemos trabajar:

```

1 
class
 
FizzBuzz
(
object
):


2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


3 


4 
  
def
 
generate
(
self
):


5 
    
num_list
 
=
 
[
'1'
]
 
*
 
self
.
_NUMBER_OF_ELEMENTS


6 
    
return
 
num_list

```

Y volvemos a activar el test, que ahora falla porque el número dos es representado con un ‘1’. El cambio más sencillo que se me ocurre ahora es este, tan tonto:

```

1 
class
 
FizzBuzz
(
object
):


2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


3 


4 
  
def
 
generate
(
self
):


5 
    
num_list
 
=
 
[
'1'
]
 
*
 
self
.
_NUMBER_OF_ELEMENTS


6 
    
num_list
[
1
]
 
=
 
'2'


7 
    

8 
    
return
 
num_list

```

Lo cierto es que el test está en verde. Sabemos que esta no es la implementación que resolverá el problema completo, pero nuestro código de producción sólo está obligado a satisfacer los tests existentes. Por tanto, no nos precipitemos. Veamos qué podemos hacer.

El nombre del test está obsoleto, para empezar, hagámoslo más general:

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_is_represented_as_itself
(
self
):


15 
    
self
.
__assert_number_is_represented_as
(
1
,
 
'1'
)


16 
    
self
.
__assert_number_is_represented_as
(
2
,
 
'2'
)


17 


18 
  
def
 
__assert_number_is_represented_as
(
self
,
 
number
,
 
representation
):


19 
    
fizzbuzz
 
=
 
FizzBuzz
()


20 
    
num_list
 
=
 
fizzbuzz
.
generate
()


21 
    
self
.
assertEqual
(
representation
,
 
num_list
[(
number
 
-
 
1
)])


22 


23 


24 
if
 
__name__
 
==
 
'__main__'
:


25 
  
unittest
.
main
()

```

Una vez resuelto esto, recordemos que antes vimos que el concepto de número y representación eran necesarios para definir mejor el comportamiento esperado en los tests. Podemos introducirlos ahora en nuestro código de producción:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
num_list
 
=
 
[
'1'
]
 
*
 
self
.
_NUMBER_OF_ELEMENTS


 6 
    

 7 
    
number
 
=
 
2


 8 
    
representation
 
=
 
'2'


 9 
    

10 
    
num_list
[
number
-
1
]
 
=
 
representation


11 


12 
    
return
 
num_list

```

Es un primer paso. Se pueden ver las limitaciones de la solución actual. Por ejemplo, ¿por qué tiene un tratamiento especial el `1`? ¿Y qué pasará si queremos verificar otro número? Son varios problemas.

En cuanto al número `1`, la clave está en la idea de lista de números. Ahora mismo generamos una lista de constantes, pero cada elemento de esa lista debería ser un número correlativo empezando por el número 1, hasta completar el número de elementos.

Y luego tendríamos que reemplazar cada número por su representación. Algo así:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
num_list
 
=
 
list
(
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
))


 6 


 7 
    
number
 
=
 
1


 8 
    
representation
 
=
 
'1'


 9 


10 
    
num_list
[
number
-
1
]
 
=
 
representation


11 


12 
    
number
 
=
 
2


13 
    
representation
 
=
 
'2'


14 


15 
    
num_list
[
number
-
1
]
 
=
 
representation


16 


17 
    
return
 
num_list

```

El test sigue pasando con esta nueva estructura pero esto no parece muy práctico. Sin embargo, podemos ver un patrón. Necesitamos recorrer la lista para darle una solución:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
num_list
 
=
 
list
(
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
))


 6 
    
for
 
number
 
in
 
num_list
:


 7 
        
if
 
number
 
==
 
1
:


 8 
            
representation
 
=
 
'1'


 9 


10 
        
if
 
number
 
==
 
2
:


11 
            
representation
 
=
 
'2'


12 


13 
        
num_list
[
number
-
1
]
 
=
 
representation


14 


15 
    
return
 
num_list

```

Con la información de que disponemos, podríamos asumir simplemente que nos basta con convertir el número en `string` y ponerlo en su lugar:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
num_list
 
=
 
list
(
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
))


 6 
    
for
 
number
 
in
 
num_list
:


 7 
        
representation
 
=
 
str
(
number
)


 8 
        
num_list
[
number
-
1
]
 
=
 
representation


 9 


10 
    
return
 
num_list

```

Claro que existen formas más *pythonicas* y compactas, como esta:

```

1 
class
 
FizzBuzz
:


2 


3 
  
_NUMBERS_IN_LIST
 
=
 
100


4 
  

5 
  
def
 
generate
(
self
):


6 
    
return
 
list
(
map
(
lambda
 
num
:
 
str
(
num
 
+
 
1
),
 
range
(
self
.
_NUMBERS_IN_LIST
)))

```

Pero debemos tener cuidado, probablemente estamos adelantándonos demasiado con este refactor y seguramente nos generará problemas cuando intentemos avanzar. Por eso, es preferible mantener una implementación más directa e ingenua y dejar las optimizaciones y estructuras más avanzadas para cuando el comportamiento del método esté completamente definido. Así que te recomendaría evitar este tipo de aproximación.

Todo este refactor con los tests pasando. Esto quiere decir que:

1. Con el test describimos el comportamiento que queremos desarrollar
2. Hacemos pasar el test con el código más sencillo posible, por estúpidamente simple que nos parezca, a fin de tener ese comportamiento implementado
3. Usamos los test en verde como red de seguridad para reestructurar el código hasta encontrar un diseño mejor: fácil de entender, mantener y extender.

Los puntos 2 y 3 se construyen basándose en estos principios:

* **KISS** : *Keep it simply stupid* (mantenlo simplemente estúpido), que quiere decir mantener el sistema lo más tonto posible, y no intentar añadir *inteligencia* prematuramente. Cuanto más mecánico y simple mejor, dentro de sus necesidades. Este KISS es nuestra primera aproximación.
* **Ley de Gall** : todo sistema complejo que funciona ha evolucionado desde un sistema más simple que funcionaba. Por tanto, empezamos por una implementación muy simple que funcione (KISS) y la hacemos evolucionar hacia una más compleja que también funciona, cosa que sabemos porque el test sigue pasando.
* **YAGNI** : *Your aren’t gonna need it* (no lo vas a necesitar), que nos fuerza a no implementar más comportamiento que lo estrictamente necesario para que pasen los tests actuales.

Pero ahora tenemos que implementar nuevos comportamientos.

## El test que no falla

El siguiente número que no es múltiplo de 3, 5 ó 15 es 4, así que añadimos un ejemplo para eso:

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_is_represented_as_itself
(
self
):


15 
    
self
.
__assert_number_is_represented_as
(
1
,
 
'1'
)


16 
    
self
.
__assert_number_is_represented_as
(
2
,
 
'2'
)


17 
    
self
.
__assert_number_is_represented_as
(
4
,
 
'4'
)


18 


19 
  
def
 
__assert_number_is_represented_as
(
self
,
 
number
,
 
representation
):


20 
    
fizzbuzz
 
=
 
FizzBuzz
()


21 
    
num_list
 
=
 
fizzbuzz
.
generate
()


22 
    
self
.
assertEqual
(
representation
,
 
num_list
[(
number
 
-
 
1
)])


23 


24 


25 
if
 
__name__
 
==
 
'__main__'
:


26 
  
unittest
.
main
()

```

Y el test pasa. ¿Buena noticia? Depende. Un test que pasa nada más crearlo siempre es motivo de sospecha, al menos desde el punto de vista de TDD. Recuerda: escribir un test que falle es lo primero. Si el test no falla es que:

* El comportamiento ya está implementado
* No es el test que andábamos buscando

En nuestro caso ocurre que el último refactor ha dado lugar al comportamiento general de los números que no necesitan transformación. De hecho, podemos categorizar los números en estas clases:

* Números que se representan como ellos mismos
* Múltiplos de tres, representados por ‘Fizz’
* Múltiplos de cinco, representados por ‘Buzz’
* Múltiplos de tres y cinco, representados por ‘FizzBuzz’

1 y 2 son miembros de la primera clase, por lo que son ejemplos más que suficientes ya que cualquier número de esa clase nos valdría como ejemplo. En TDD los necesitamos porque nos han ayudado a introducir la idea de que tendríamos que recorrer la lista de números. Pero nos bastaría con un único test en QA. Por eso, al introducir el ejemplo del 4, no hace falta añadir nuevo código: el comportamiento ya está implementado.

Es hora de moverse a las otras clases de números.

## Aprendiendo a decir “Fizz”

Es hora de que nuestro `FizzBuzz` sea capaz de convertir el 3 en “Fizz”. Un test mínimo para especificarlo sería el siguiente:

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_is_represented_as_itself
(
self
):


15 
    
self
.
__assert_number_is_represented_as
(
1
,
 
'1'
)


16 
    
self
.
__assert_number_is_represented_as
(
2
,
 
'2'
)


17 
    
self
.
__assert_number_is_represented_as
(
4
,
 
'4'
)


18 


19 
  
def
 
test_three_and_its_multiples_are_represented_as_fizz
(
self
):


20 
    
self
.
__assert_number_is_represented_as
(
3
,
 
'Fizz'
)


21 


22 


23 
  
def
 
__assert_number_is_represented_as
(
self
,
 
number
,
 
representation
):


24 
    
fizzbuzz
 
=
 
FizzBuzz
()


25 
    
num_list
 
=
 
fizzbuzz
.
generate
()


26 
    
self
.
assertEqual
(
representation
,
 
num_list
[(
number
 
-
 
1
)])


27 


28 


29 
if
 
__name__
 
==
 
'__main__'
:


30 
  
unittest
.
main
()

```

Teniendo un test que falla, veamos qué código de producción mínimo podríamos añadir para que pase:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
num_list
 
=
 
list
(
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
))


 6 
    
for
 
number
 
in
 
num_list
:


 7 
        
representation
 
=
 
str
(
number
)


 8 


 9 
        
if
 
number
 
==
 
3
:


10 
            
representation
 
=
 
'Fizz'


11 


12 
        
num_list
[
number
 
-
 
1
]
 
=
 
representation


13 


14 
    
return
 
num_list

```

Hemos añadido un `if` que hace pasar este caso particular. De momento no hay otra forma mejor con la información que tenemos. Recuerda KISS, Gall y YAGNI para evitar avanzar más de lo debido.

En lo que toca al código, puede que haya una manera mejor de poblar la lista. En lugar de generar una lista de números y cambiarla, tal vez podamos iniciar una lista vacía e ir añadiendo las representaciones de los números en ella:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
representations
 
=
 
list
()


 6 
    
num_list
 
=
 
list
(
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
))


 7 
    
for
 
number
 
in
 
num_list
:


 8 
        
representation
 
=
 
str
(
number
)


 9 


10 
        
if
 
number
 
==
 
3
:


11 
            
representation
 
=
 
'Fizz'


12 


13 
        
representations
.
append
(
representation
)


14 


15 
    
return
 
representations

```

Esto funciona. Ahora `num_list` no tiene mucha razón de ser como lista. Podemos hacer un cambio:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
representations
 
=
 
list
()


 6 
    
num_list
 
=
 
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
)


 7 
    
for
 
number
 
in
 
num_list
:


 8 
        
representation
 
=
 
str
(
number
)


 9 


10 
        
if
 
number
 
==
 
3
:


11 
            
representation
 
=
 
'Fizz'


12 


13 
        
representations
.
append
(
representation
)


14 


15 
    
return
 
representations

```

Y eliminar la variable temporal:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
representations
 
=
 
list
()


 6 
    
for
 
number
 
in
 
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
):


 7 
        
representation
 
=
 
str
(
number
)


 8 


 9 
        
if
 
number
 
==
 
3
:


10 
            
representation
 
=
 
'Fizz'


11 


12 
        
representations
.
append
(
representation
)


13 


14 
    
return
 
representations

```

Todo sigue funcionando correctamente, como atestiguan los tests.

## Decir “Fizz” cuando toca

Ahora queremos que nos ponga un “Fizz” cuando el número es múltiplo de 3 y no sólo cuando es exactamente 3. Por supuesto, nos toca añadir un test para especificarlo. Esta vez con el número 6, que es el más cercano que tenemos y que es múltiplo de 3 (y no de cinco).

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_is_represented_as_itself
(
self
):


15 
    
self
.
__assert_number_is_represented_as
(
1
,
 
'1'
)


16 
    
self
.
__assert_number_is_represented_as
(
2
,
 
'2'
)


17 
    
self
.
__assert_number_is_represented_as
(
4
,
 
'4'
)


18 


19 
  
def
 
test_three_and_its_multiples_are_represented_as_fizz
(
self
):


20 
    
self
.
__assert_number_is_represented_as
(
3
,
 
'Fizz'
)


21 
    
self
.
__assert_number_is_represented_as
(
6
,
 
'Fizz'
)


22 


23 


24 
  
def
 
__assert_number_is_represented_as
(
self
,
 
number
,
 
representation
):


25 
    
fizzbuzz
 
=
 
FizzBuzz
()


26 
    
num_list
 
=
 
fizzbuzz
.
generate
()


27 
    
self
.
assertEqual
(
representation
,
 
num_list
[(
number
 
-
 
1
)])


28 


29 


30 
if
 
__name__
 
==
 
'__main__'
:


31 
  
unittest
.
main
()

```

Para hacer pasar el test el cambio que hay que hacer es bastante pequeño. Tenemos que modificar la condición para ampliarla a los múltiplos de tres. Pero vamos a hacerlo de manera progresiva.

Primero establecemos el comportamiento:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
representations
 
=
 
list
()


 6 
    
for
 
number
 
in
 
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
):


 7 
        
representation
 
=
 
str
(
number
)


 8 


 9 
        
if
 
number
 
==
 
3
:


10 
            
representation
 
=
 
'Fizz'


11 


12 
        
if
 
number
 
==
 
6
:


13 
            
representation
 
=
 
'Fizz'


14 


15 
        
representations
.
append
(
representation
)


16 


17 
    
return
 
representations

```

Con esto el test, pasa. Ahora vamos a cambiar el código para que use el concepto  *múltiplo de* :

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
representations
 
=
 
list
()


 6 
    
for
 
number
 
in
 
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
):


 7 
        
representation
 
=
 
str
(
number
)


 8 


 9 
        
if
 
number
 
==
 
3
:


10 
            
representation
 
=
 
'Fizz'


11 


12 
        
if
 
number
 
==
 
6
:


13 
            
representation
 
=
 
'Fizz'


14 


15 
        
if
 
number
 
%
 
3
 
==
 
0
:


16 
            
representation
 
=
 
'Fizz'


17 


18 
        
representations
.
append
(
representation
)


19 


20 
    
return
 
representations

```

El test sigue pasando, lo que indica que nuestra hipótesis es correcta. Ahora podemos eliminar la parte de código redundante:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
representations
 
=
 
list
()


 6 
    
for
 
number
 
in
 
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
):


 7 
        
representation
 
=
 
str
(
number
)


 8 


 9 
        
if
 
number
 
%
 
3
 
==
 
0
:


10 
            
representation
 
=
 
'Fizz'


11 


12 
        
representations
.
append
(
representation
)


13 


14 
    
return
 
representations

```

En este punto, podrías querer probar otros ejemplos de la misma clase, aunque realmente no es necesario dado que cualquier múltiplo de tres es un representante adecuado. Por eso, nos moveremos al siguiente comportamiento.

## Aprendiendo a decir “Buzz”

Este test nos permite especificar el nuevo comportamiento:

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_is_represented_as_itself
(
self
):


15 
    
self
.
__assert_number_is_represented_as
(
1
,
 
'1'
)


16 
    
self
.
__assert_number_is_represented_as
(
2
,
 
'2'
)


17 
    
self
.
__assert_number_is_represented_as
(
4
,
 
'4'
)


18 


19 
  
def
 
test_three_and_its_multiples_are_represented_as_fizz
(
self
):


20 
    
self
.
__assert_number_is_represented_as
(
3
,
 
'Fizz'
)


21 
    
self
.
__assert_number_is_represented_as
(
6
,
 
'Fizz'
)


22 


23 
  
def
 
test_five_and_its_multiples_are_represented_as_buzz
(
self
):


24 
    
self
.
__assert_number_is_represented_as
(
5
,
 
'Buzz'
)


25 


26 
  
def
 
__assert_number_is_represented_as
(
self
,
 
number
,
 
representation
):


27 
    
fizzbuzz
 
=
 
FizzBuzz
()


28 
    
num_list
 
=
 
fizzbuzz
.
generate
()


29 
    
self
.
assertEqual
(
representation
,
 
num_list
[(
number
 
-
 
1
)])


30 


31 


32 
if
 
__name__
 
==
 
'__main__'
:


33 
  
unittest
.
main
()

```

Así que modificamos el código de producción para lograr que pase el test. Como hemos hecho antes, tratamos el caso particular de forma particular:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
representations
 
=
 
list
()


 6 
    
for
 
number
 
in
 
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
):


 7 
        
representation
 
=
 
str
(
number
)


 8 


 9 
        
if
 
number
 
%
 
3
 
==
 
0
:


10 
            
representation
 
=
 
'Fizz'


11 


12 
        
if
 
number
 
==
 
5
:


13 
            
representation
 
=
 
'Buzz'


14 


15 
        
representations
.
append
(
representation
)


16 


17 
    
return
 
representations

```

Sí, ya sabemos cómo tendríamos que tratar el caso general de los múltiplos de cinco, pero es preferible forzarse a ir despacio. Recuerda que el objetivo principal del ejercicio no es resolver la generación de la lista, sino hacerlo guiadas por tests. Nuestro interés ahora es internalizar este ciclo de pasos cortos.

No hay mucho más que podamos hacer ahora, salvo pasar al siguiente test.

## Decir “Buzz” cuando toca

A estas alturas el test es bastante obvio, el siguiente múltiplo de 5 es 10:

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_is_represented_as_itself
(
self
):


15 
    
self
.
__assert_number_is_represented_as
(
1
,
 
'1'
)


16 
    
self
.
__assert_number_is_represented_as
(
2
,
 
'2'
)


17 
    
self
.
__assert_number_is_represented_as
(
4
,
 
'4'
)


18 


19 
  
def
 
test_three_and_its_multiples_are_represented_as_fizz
(
self
):


20 
    
self
.
__assert_number_is_represented_as
(
3
,
 
'Fizz'
)


21 
    
self
.
__assert_number_is_represented_as
(
6
,
 
'Fizz'
)


22 


23 
  
def
 
test_five_and_its_multiples_are_represented_as_buzz
(
self
):


24 
    
self
.
__assert_number_is_represented_as
(
5
,
 
'Buzz'
)


25 
    
self
.
__assert_number_is_represented_as
(
10
,
 
'Buzz'
)


26 


27 
  
def
 
__assert_number_is_represented_as
(
self
,
 
number
,
 
representation
):


28 
    
fizzbuzz
 
=
 
FizzBuzz
()


29 
    
num_list
 
=
 
fizzbuzz
.
generate
()


30 
    
self
.
assertEqual
(
representation
,
 
num_list
[(
number
 
-
 
1
)])


31 


32 


33 
if
 
__name__
 
==
 
'__main__'
:


34 
  
unittest
.
main
()

```

Y, de nuevo, el cambio en el código de producción es simple al principio:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
representations
 
=
 
list
()


 6 
    
for
 
number
 
in
 
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
):


 7 
        
representation
 
=
 
str
(
number
)


 8 


 9 
        
if
 
number
 
%
 
3
 
==
 
0
:


10 
            
representation
 
=
 
'Fizz'


11 


12 
        
if
 
number
 
==
 
5
:


13 
            
representation
 
=
 
'Buzz'


14 


15 
        
if
 
number
 
==
 
10
:


16 
            
representation
 
=
 
'Buzz'


17 


18 
        
representations
.
append
(
representation
)


19 


20 
    
return
 
representations

```

A continuación, procedemos paso a paso en el refactor, ahora que hemos asegurado el comportamiento:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
representations
 
=
 
list
()


 6 
    
for
 
number
 
in
 
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
):


 7 
        
representation
 
=
 
str
(
number
)


 8 


 9 
        
if
 
number
 
%
 
3
 
==
 
0
:


10 
            
representation
 
=
 
'Fizz'


11 


12 
        
if
 
number
 
==
 
5
:


13 
            
representation
 
=
 
'Buzz'


14 


15 
        
if
 
number
 
==
 
10
:


16 
            
representation
 
=
 
'Buzz'


17 
            

18 
        
if
 
number
 
%
 
5
 
==
 
0
:


19 
            
representation
 
=
 
'Buzz'


20 


21 
        
representations
.
append
(
representation
)


22 


23 
    
return
 
representations

```

Y luego:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
representations
 
=
 
list
()


 6 
    
for
 
number
 
in
 
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
):


 7 
        
representation
 
=
 
str
(
number
)


 8 


 9 
        
if
 
number
 
%
 
3
 
==
 
0
:


10 
            
representation
 
=
 
'Fizz'


11 


12 
        
if
 
number
 
%
 
5
 
==
 
0
:


13 
            
representation
 
=
 
'Buzz'


14 


15 
        
representations
.
append
(
representation
)


16 


17 
    
return
 
representations

```

Y con este refactor podemos pasar a la siguiente clase de números.

## Aprender a decir “FizzBuzz”

La estructura es exactamente igual. Empecemos por el caso más sencillo: 15 debe devolver “FizzBuzz” ya que 15 es el primer número que es múltiplo de 3 y 5 a la vez

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_is_represented_as_itself
(
self
):


15 
    
self
.
__assert_number_is_represented_as
(
1
,
 
'1'
)


16 
    
self
.
__assert_number_is_represented_as
(
2
,
 
'2'
)


17 
    
self
.
__assert_number_is_represented_as
(
4
,
 
'4'
)


18 


19 
  
def
 
test_three_and_its_multiples_are_represented_as_fizz
(
self
):


20 
    
self
.
__assert_number_is_represented_as
(
3
,
 
'Fizz'
)


21 
    
self
.
__assert_number_is_represented_as
(
6
,
 
'Fizz'
)


22 


23 
  
def
 
test_five_and_its_multiples_are_represented_as_buzz
(
self
):


24 
    
self
.
__assert_number_is_represented_as
(
5
,
 
'Buzz'
)


25 
    
self
.
__assert_number_is_represented_as
(
10
,
 
'Buzz'
)


26 


27 
  
def
 
test_fifteen_and_its_multiples_are_represented_as_fizzbuzz
(
self
):


28 
    
self
.
__assert_number_is_represented_as
(
15
,
 
'FizzBuzz'
)


29 


30 


31 
  
def
 
__assert_number_is_represented_as
(
self
,
 
number
,
 
representation
):


32 
    
fizzbuzz
 
=
 
FizzBuzz
()


33 
    
num_list
 
=
 
fizzbuzz
.
generate
()


34 
    
self
.
assertEqual
(
representation
,
 
num_list
[(
number
 
-
 
1
)])


35 


36 


37 
if
 
__name__
 
==
 
'__main__'
:


38 
  
unittest
.
main
()

```

El nuevo test falla. Hagámoslo pasar:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
representations
 
=
 
list
()


 6 
    
for
 
number
 
in
 
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
):


 7 
        
representation
 
=
 
str
(
number
)


 8 


 9 
        
if
 
number
 
%
 
3
 
==
 
0
:


10 
            
representation
 
=
 
'Fizz'


11 


12 
        
if
 
number
 
%
 
5
 
==
 
0
:


13 
            
representation
 
=
 
'Buzz'


14 


15 
        
if
 
number
 
==
 
15
:


16 
            
representation
 
=
 
'FizzBuzz'


17 


18 
        
representations
.
append
(
representation
)


19 


20 
    
return
 
representations

```

## Decir “FizzBuzz” cuando toca

Y seguimos introduciendo un test para otro caso de la case de múltiplos de 3 y 5, que será 30.

```

 1 
import
 
unittest


 2 


 3 
from
 
fizzbuzzkata.fizzbuzz
 
import
 
FizzBuzz


 4 


 5 


 6 
class
 
FizzBuzzTestCase
(
unittest
.
TestCase
):


 7 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 8 


 9 
  
def
 
test_generates_list_of_required_number_of_elements
(
self
):


10 
    
fizzbuzz
 
=
 
FizzBuzz
()


11 
    
num_list
 
=
 
fizzbuzz
.
generate
()


12 
    
self
.
assertEqual
(
self
.
_NUMBER_OF_ELEMENTS
,
 
len
(
num_list
))


13 


14 
  
def
 
test_number_is_represented_as_itself
(
self
):


15 
    
self
.
__assert_number_is_represented_as
(
1
,
 
'1'
)


16 
    
self
.
__assert_number_is_represented_as
(
2
,
 
'2'
)


17 
    
self
.
__assert_number_is_represented_as
(
4
,
 
'4'
)


18 


19 
  
def
 
test_three_and_its_multiples_are_represented_as_fizz
(
self
):


20 
    
self
.
__assert_number_is_represented_as
(
3
,
 
'Fizz'
)


21 
    
self
.
__assert_number_is_represented_as
(
6
,
 
'Fizz'
)


22 


23 
  
def
 
test_five_and_its_multiples_are_represented_as_buzz
(
self
):


24 
    
self
.
__assert_number_is_represented_as
(
5
,
 
'Buzz'
)


25 
    
self
.
__assert_number_is_represented_as
(
10
,
 
'Buzz'
)


26 


27 
  
def
 
test_fifteen_and_its_multiples_are_represented_as_fizzbuzz
(
self
):


28 
    
self
.
__assert_number_is_represented_as
(
15
,
 
'FizzBuzz'
)


29 
    
self
.
__assert_number_is_represented_as
(
30
,
 
'FizzBuzz'
)


30 


31 


32 
  
def
 
__assert_number_is_represented_as
(
self
,
 
number
,
 
representation
):


33 
    
fizzbuzz
 
=
 
FizzBuzz
()


34 
    
num_list
 
=
 
fizzbuzz
.
generate
()


35 
    
self
.
assertEqual
(
representation
,
 
num_list
[(
number
 
-
 
1
)])


36 


37 


38 
if
 
__name__
 
==
 
'__main__'
:


39 
  
unittest
.
main
()

```

Esta vez iré directamente a la implementación final, pero ya te haces a la idea:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
representations
 
=
 
list
()


 6 
    
for
 
number
 
in
 
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
):


 7 
        
representation
 
=
 
str
(
number
)


 8 


 9 
        
if
 
number
 
%
 
3
 
==
 
0
:


10 
            
representation
 
=
 
'Fizz'


11 


12 
        
if
 
number
 
%
 
5
 
==
 
0
:


13 
            
representation
 
=
 
'Buzz'


14 


15 
        
if
 
number
 
%
 
15
 
==
 
0
:


16 
            
representation
 
=
 
'FizzBuzz'


17 


18 
        
representations
.
append
(
representation
)


19 


20 
    
return
 
representations

```

¡Y ya tenemos nuestro “FizzBuzz”!

## Finalizando

Hemos completado el desarrollo del comportamiento especificado de la clase `FizzBuzz`. De hecho, cualquier test que añadamos ahora nos confirmará que el algoritmo es lo bastante general como para que todos los casos estén cubiertos. Es decir, no hay un test concebible que nos pueda obligar a introducir más código de producción: no hay nada más que debamos hacer.

En un caso de trabajo real este código sería funcional y entregable. Pero ciertamente podemos mejorarlo todavía. Todos los tests pasando indican que el comportamiento deseado está implementado, así que podríamos refactorizar sin miedo buscando una solución más flexible. Por ejemplo, con la siguiente solución sería fácil añadir algunas reglas más:

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
generate
(
self
):


 5 
    
rules
 
=
 
{


 6 
        
3
:
 
'Fizz'
,


 7 
        
5
:
 
'Buzz'
,


 8 
        
15
:
 
'FizzBuzz'
,


 9 
    
}


10 


11 
    
representations
 
=
 
list
()


12 


13 
    
for
 
number
 
in
 
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
):


14 
        
representation
 
=
 
str
(
number
)


15 
        
for
 
divisor
 
in
 
rules
.
keys
():


16 
            
if
 
number
 
%
 
divisor
 
==
 
0
:


17 
                
representation
 
=
 
rules
[
divisor
]


18 


19 
        
representations
.
append
(
representation
)


20 


21 
    
return
 
representations

```

Y si te fijas bien, sería relativamente fácil modificar la clase para introducir las reglas desde fuera, ya que bastaría con pasar el diccionario con las reglas al instanciar la clase, cumpliendo el principio de  *Open for extension and Closed for modification* . En este caso, hemos dejado que se usen las reglas originales si no se indican otras, de modo que los tests siguen pasando exactamente igual.

```

 1 
class
 
FizzBuzz
(
object
):


 2 
  
_NUMBER_OF_ELEMENTS
 
=
 
100


 3 


 4 
  
def
 
__init__
(
self
,
 
rules
=
None
):


 5 
    
if
 
rules
 
is
 
None
:


 6 
        
rules
 
=
 
{


 7 
            
3
:
 
'Fizz'
,


 8 
            
5
:
 
'Buzz'
,


 9 
            
15
:
 
'FizzBuzz'
,


10 
        
}


11 
    
self
.
rules
 
=
 
rules


12 


13 
  
def
 
generate
(
self
):


14 


15 
    
representations
 
=
 
list
()


16 


17 
    
for
 
number
 
in
 
range
(
1
,
 
self
.
_NUMBER_OF_ELEMENTS
 
+
 
1
):


18 
        
representation
 
=
 
str
(
number
)


19 
        
for
 
divisor
 
in
 
self
.
rules
.
keys
():


20 
            
if
 
number
 
%
 
divisor
 
==
 
0
:


21 
                
representation
 
=
 
self
.
rules
[
divisor
]


22 


23 
        
representations
.
append
(
representation
)


24 


25 
    
return
 
representations

```

## Qué hemos aprendido con esta kata

* Las leyes de TDD
* El ciclo red->green->refactor
* Usar tests mínimos para hacer avanzar el código de producción
* Cambiar el código de producción lo mínimo para conseguir el comportamiento
* Usar la fase de refactor para mejorar el diseño del código

# 7 Elección de los ejemplos y criterio de finalización

Una de las preguntas más frecuentes cuando empiezas a hacer TDD es cuántos tests tienes que escribir hasta considerar el desarrollo terminado. La respuesta corta es: tendrás que hacer todos los tests que sean necesarios y ni uno más. La respuesta larga es este capítulo.

## Checklist driven testing

Una buena técnica puede ser seguir el consejo de Kent Beck y escribir una lista de control o *check-list* en la que anotamos todos aquellos comportamientos que queremos implementar. Obviamente, a medida que completamos cada comportamiento vamos tachando items en la lista.

También es posible que, durante el trabajo, descubramos que necesitamos testear algún otro comportamiento, que podemos suprimir alguno de los elementos de la lista, o que nos interesa cambiar el orden en que lo hemos planeado. Por supuesto que podemos hacer todo esto según nos convenga.

La lista no es más que una herramienta para no depender de nuestra memoria durante el proceso. Al fin y al cabo, uno de los beneficios de hacer Test Driven Development es reducir la cantidad de información y conocimiento que tenemos que utilizar en cada fase del proceso de desarrollo. Cada ciclo de TDD implica un problema muy pequeño, que podemos resolver con bastante poco esfuerzo. Pequeños pasos que acaban llevándonos muy lejos.

Veamos un ejemplo con la kata Leap Year, en la que tenemos que crear una función para calcular si un año es bisiesto o no. Una posible lista de control sería esta:

```

1 
Checklist para Leap Year

2 


3 
* Los años que no pueden dividir por 4 son años normales

4 
* Los años divisibles por 4 son bisiestos

5 
* Si son divisibles por 100 son bisiestos

6 
* Si son divisibles por 400 entonces no son bisiestos
```

Otro ejemplo para la kata Prime Numbers, en la que el ejercicio consiste en desarrollar una función que obtenga los factores primos de un número:

```

1 
Checklist para Prime Numbers

2 


3 
* Números que no tienen factores primos

4 
* Números primos (el único factor primo es el mismo número)

5 
* Números no primos:

6 
   * Potencias de un sólo factor primo

7 
   * Producto de distintos factores primos
```

## Selección de ejemplos

Por cada comportamiento que queremos implementar necesitaremos un cierto número de ejemplos con los que escribir los tests. En el [capítulo siguiente](https://leanpub.com/tddcourse/read#evolving) veremos que TDD tiene dos momentos principales: uno relacionado con el establecimiento de la interfaz de la unidad que estamos creando y otro en el que desarrollamos el comportamiento propiamente dicho. Es en este momento cuando necesitamos ejemplos que cuestionen la implementación existente y nos obliguen a introducir código que produzca el comportamiento deseado.

Una buena idea es, por tanto, anotar varios ejemplos posibles con los que probar cada item de la lista de control.

Pero, ¿cuántos ejemplos son necesarios? En QA tenemos varias técnicas para escoger ejemplos representativos con los que generar los tests, pero tienen el objetivo de optimizar la relación entre el número de tests y su capacidad de cubrir los escenarios posibles.

Podemos utilizar algunas de ellas en TDD, aunque de una forma un poco diferente, como veremos a continuación. Ten en cuenta que en TDD estamos desarrollando un algoritmo y, en muchos casos, lo vamos descubriendo mientras lo escribimos. Para eso necesitaremos varios ejemplos relacionados con el mismo comportamiento, de modo que podamos identificar regularidades y descubrir cómo generalizarlo.

Las técnicas en las que nos vamos a fijar son:

### Partición por clase de equivalencia

Esta técnica se basa en que el conjunto de todos los posibles casos concebibles se puede dividir en clases mediante algún criterio. Todos los ejemplos en la misma clase serían equivalentes, por lo que bastaría hacer un test con un ejemplo de cada clase ya que todos son igualmente representativos de la misma.

### Análisis de límites

Esta técnica es similar a la anterior, pero prestando atención a los límites o fronteras entre clases. Se escogen dos ejemplos de cada clase que son justamente los que se encuentran en sus límites. Ambos ejemplos son representativos de la clase, pero nos permiten estudiar qué ocurre en los extremos del intervalo.

Se usa cuando los ejemplos son datos contínuos o nos importa especialmente el cambio que se produce al pasar de una clase a otra. Específicamente es el tipo de situación en la que el resultado depende de si el valor considerado es mayor o estrictamente mayor, etc.

### Tabla de decisión

La tabla de decisión no es más que el resultado de combinar los posibles valores, agrupados en clases, de las parámetros que se pasan a la unidad bajo test.

Vamos a ver la elección de ejemplos aplicada al caso de Leap Year. Para eso, empezamos con la lista:

```

1 
Checklist para Leap Year

2 


3 
* Los años que no pueden dividir por 4 son años normales

4 
* Los años divisibles por 4 son bisiestos

5 
* Si son divisibles por 100 son bisiestos

6 
* Si son divisibles por 400 entonces no son bisiestos
```

Veamos el primer item. Podríamos usar cualquier número que cumpla la condición de no ser divisible por 4:

```

1 
* Los años que no pueden dividir por 4 son años normales

2 


3 
Ejemplos: 1997, 2021, 1825
```

En el segundo item, los ejemplos deben cumplir la condición de ser divisibles por 4:

```

1 
* Los años divisibles por 4 son bisiestos

2 


3 
Ejemplos: 1996, 2000, 2020, 1600, 1800, 1900
```

Prestemos atención al siguiente elemento de la lista. La condición de ser números divisibles por 100 se superpone con la condición anterior. Por tanto, tenemos que eliminar algunos ejemplos del item anterior:

```

1 
* Los años divisibles por 4 son bisiestos

2 


3 
Ejemplos: 1996, 2020

4 


5 
* Si son divisibles por 100 son bisiestos

6 


7 
Ejemplos: 2000, 1600, 1800, 1900
```

Y ocurre lo mismo con el último de los elementos de la lista. Los ejemplos para este item son los números divisibles por 400. También se superpone con el ejemplo anterior:

```

1 
* Si son divisibles por 100 son bisiestos

2 


3 
Ejemplos: 1800, 1900

4 


5 
* Si son divisibles por 400 entonces no son bisiestos

6 


7 
Ejemplos: 1600, 2000
```

De este modo, la lista con lo ejemplos quedaría así:

```

 1 
* Los años que no pueden dividir por 4 son años normales

 2 


 3 
Ejemplos: 1997, 2021, 1825

 4 


 5 
* Los años divisibles por 4 son bisiestos

 6 


 7 
Ejemplos: 1996, 2020

 8 


 9 
* Si son divisibles por 100 son bisiestos

10 


11 
Ejemplos: 1800, 1900

12 


13 
* Si son divisibles por 400 entonces no son bisiestos

14 


15 
Ejemplos: 1600, 2000
```

Por otro lado, la elección de ejemplos para Prime Factors nos podría dar esto:

```

 1 
Checklist para Prime Numbers

 2 


 3 
* Números que no tienen factores primos

 4 


 5 
Ejemplos: 1

 6 


 7 
* Números primos (el único factor primo es el mismo número)

 8 


 9 
Ejemplos: 2, 3, 5...

10 


11 
* Números no primos:

12 
   * Potencias de un sólo factor primo

13 
   

14 
   Ejemplos: 4, 8, 9, 16, 27...

15 
   

16 
   * Producto de distintos factores primos

17 
   

18 
   Ejemplos: 6, 10, 12, 15, 18, 20...
```

## Uso de varios ejemplos para generalizar un algoritmo

En ejercicios de código simples como puede ser la kata Leap Year, es relativamente fácil anticipar el algoritmo, de modo que no necesitaríamos usar varios ejemplos para hacerlo evolucionar e implementarlo. En realidad, sería suficiente con un ejemplo de cada clase, como hemos visto al hablar de la partición por clases de equivalencia, y en poco minutos tendríamos el problema resuelto.

Sin embargo, si estamos empezando con TDD es buena idea ir paso a paso. Lo mismo que si nos enfrentamos a un comportamiento complejo. Es preferible tomar *baby steps* realmente pequeños, introducir varios ejemplos y esperar a tener suficiente información para generalizar. En este mismo libro puedes encontrar varias aplicaciones de esta técnica. Tener algo de duplicación de código es preferible a escoger la abstracción equivocada y construir sobre ella.

Una heurística que puedes aplicar es la  *regla de los tres* . Esta regla nos dice que no deberíamos intentar generalizar código hasta tener al menos tres repeticiones del mismo. Para ello, tendremos que identificar las partes fijas y las partes que cambian.

Considera este ejemplo, tomado de un ejercicio de la kata Leap Year. En este punto los tests están pasando, pero de momento no hemos generado un algoritmo.

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
if
 
(
year
 
===
 
1992
)
 
{


 3 
    
return
 
true
;


 4 
  
}


 5 
  
if
 
(
year
 
===
 
1996
)
 
{


 6 
    
return
 
true
;


 7 
  
}


 8 
  
if
 
(
year
 
===
 
2020
)
 
{


 9 
    
return
 
true
;


10 
  
}


11 


12 
  
return
 
false
;


13 
}


14 


15 
describe
(
'Identify Leap Year'
,
 
()
 
=>
 
{


16 
  
it
(
'should be Leap Year'
,
 
()
 
=>
 
{


17 
    
expect
(
leapYear
(
1992
)).
toBeTruthy
();


18 
    
expect
(
leapYear
(
1996
)).
toBeTruthy
();


19 
    
expect
(
leapYear
(
2020
)).
toBeTruthy
();


20 
  
});


21 
})

```

Ya tenemos tres repeticiones. ¿Qué tienen en común aparte de la estructura `if/then`?. Forcemos un pequeño cambio:

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
if
 
(
year
 
===
 
498
 
*
 
4
)
 
{


 3 
    
return
 
true
;


 4 
  
}


 5 
  
if
 
(
year
 
===
 
499
 
*
 
4
)
 
{


 6 
    
return
 
true
;


 7 
  
}


 8 
  
if
 
(
year
 
===
 
505
 
*
 
4
)
 
{


 9 
    
return
 
true
;


10 
  
}


11 


12 
  
return
 
false
;


13 
}


14 


15 
describe
(
'Identify Leap Year'
,
 
()
 
=>
 
{


16 
  
it
 
(
'should be Common Year'
,
 
()
 
=>
 
{


17 
    
expect
(
leapYear
(
1997
)).
toBeFalsy
();


18 
    
expect
(
leapYear
(
1998
)).
toBeFalsy
();


19 
    
expect
(
leapYear
(
2021
)).
toBeFalsy
();


20 
  
});


21 


22 
  
it
(
'should be Leap Year'
,
 
()
 
=>
 
{


23 
    
expect
(
leapYear
(
1992
)).
toBeTruthy
();


24 
    
expect
(
leapYear
(
1996
)).
toBeTruthy
();


25 
    
expect
(
leapYear
(
2020
)).
toBeTruthy
();


26 
  
});


27 
})

```

Claramente, los tres años son divisibles por 4. Así que podríamos expresarlo de otra manera:

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
if
 
(
year
 
%
 
4
 
===
 
0
)
 
{


 3 
    
return
 
true
;


 4 
  
}


 5 
  
if
 
(
year
 
%
 
4
 
===
 
0
)
 
{


 6 
    
return
 
true
;


 7 
  
}


 8 
  
if
 
(
year
 
%
 
4
 
===
 
0
)
 
{


 9 
    
return
 
true
;


10 
  
}


11 


12 
  
return
 
false
;


13 
}


14 


15 
describe
(
'Identify Leap Year'
,
 
()
 
=>
 
{


16 
  
it
 
(
'should be Common Year'
,
 
()
 
=>
 
{


17 
    
expect
(
leapYear
(
1997
)).
toBeFalsy
();


18 
    
expect
(
leapYear
(
1998
)).
toBeFalsy
();


19 
    
expect
(
leapYear
(
2021
)).
toBeFalsy
();


20 
  
});


21 


22 
  
it
(
'should be Leap Year'
,
 
()
 
=>
 
{


23 
    
expect
(
leapYear
(
1992
)).
toBeTruthy
();


24 
    
expect
(
leapYear
(
1996
)).
toBeTruthy
();


25 
    
expect
(
leapYear
(
2020
)).
toBeTruthy
();


26 
  
});


27 
})

```

Que ahora es una repetición obvia y se puede eliminar:

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
if
 
(
year
 
%
 
4
 
===
 
0
)
 
{


 3 
    
return
 
true
;


 4 
  
}


 5 


 6 
  
return
 
false
;


 7 
}


 8 


 9 
describe
(
'Identify Leap Year'
,
 
()
 
=>
 
{


10 
  
it
 
(
'should be Common Year'
,
 
()
 
=>
 
{


11 
    
expect
(
leapYear
(
1997
)).
toBeFalsy
();


12 
    
expect
(
leapYear
(
1998
)).
toBeFalsy
();


13 
    
expect
(
leapYear
(
2021
)).
toBeFalsy
();


14 
  
});


15 


16 
  
it
(
'should be Leap Year'
,
 
()
 
=>
 
{


17 
    
expect
(
leapYear
(
1992
)).
toBeTruthy
();


18 
    
expect
(
leapYear
(
1996
)).
toBeTruthy
();


19 
    
expect
(
leapYear
(
2020
)).
toBeTruthy
();


20 
  
});


21 
})

```

Esto ha sido muy obvio, por supuesto. Sin embargo, no siempre tendremos las cosas tan fáciles.

En resumen, si no conocemos muy bien el problema, puede ser útil esperar a que se cumpla la *regla de los tres* para empezar a pensar en generalizaciones del código. Esto implica que, como mínimo, introduciremos tres ejemplos que representen la misma clase antes de refactorizar la solución a una más general.

Veamos otro ejemplo en la misma kata:

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
if
 
(
year
 
%
 
100
 
===
 
0
)
 
{


 3 
    
return
 
false
;


 4 
  
}


 5 


 6 
  
if
 
(
year
 
%
 
4
 
===
 
0
)
 
{


 7 
    
return
 
true
;


 8 
  
}


 9 


10 
  
return
 
false
;


11 
}


12 


13 
describe
(
'Identify Leap Year'
,
 
()
 
=>
 
{


14 
  
it
 
(
'should be Common Year'
,
 
()
 
=>
 
{


15 
    
expect
(
leapYear
(
1997
)).
toBeFalsy
();


16 
    
expect
(
leapYear
(
1998
)).
toBeFalsy
();


17 
    
expect
(
leapYear
(
2021
)).
toBeFalsy
();


18 
  
});


19 


20 
  
it
(
'should be Leap Year'
,
 
()
 
=>
 
{


21 
    
expect
(
leapYear
(
1992
)).
toBeTruthy
();


22 
    
expect
(
leapYear
(
1996
)).
toBeTruthy
();


23 
    
expect
(
leapYear
(
2020
)).
toBeTruthy
();


24 
  
});


25 


26 
  
it
(
'should be exceptional common year'
,
 
function
 
()
 
{


27 
    
expect
(
leapYear
(
1700
)).
toBeFalsy
();


28 
    
expect
(
leapYear
(
1800
)).
toBeFalsy
();


29 
    
expect
(
leapYear
(
1900
)).
toBeFalsy
();


30 
  
});


31 
})

```

### La duplicación que no lo es

El concepto *divisible por* es bastante evidente en esta ocasión y realmente no necesitamos un tercer caso para valorar la posibilidad de extraerlo. Pero aquí lo importante no es la duplicación. En realidad nos hubiese bastado con un ejemplo. Este refactor lo hacemos porque hace explícita la idea de que la condición que se evalúa es el hecho de que el número del año sea divisible por un cierto factor para que se aplique la regla.

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
function
 
divisibleBy
(
divisor
)
 
{


 3 
    
return
 
year
 
%
 
divisor
 
===
 
0
;


 4 
  
}


 5 


 6 
  
if
 
(
divisibleBy
(
100
))
 
{


 7 
    
return
 
false
;


 8 
  
}


 9 


10 
  
if
 
(
divisibleBy
(
4
))
 
{


11 
    
return
 
true
;


12 
  
}


13 


14 
  
return
 
false
;


15 
}


16 


17 
describe
(
'Identify Leap Year'
,
 
()
 
=>
 
{


18 
  
it
 
(
'should be Common Year'
,
 
()
 
=>
 
{


19 
    
expect
(
leapYear
(
1997
)).
toBeFalsy
();


20 
    
expect
(
leapYear
(
1998
)).
toBeFalsy
();


21 
    
expect
(
leapYear
(
2021
)).
toBeFalsy
();


22 
  
});


23 


24 
  
it
(
'should be Leap Year'
,
 
()
 
=>
 
{


25 
    
expect
(
leapYear
(
1992
)).
toBeTruthy
();


26 
    
expect
(
leapYear
(
1996
)).
toBeTruthy
();


27 
    
expect
(
leapYear
(
2020
)).
toBeTruthy
();


28 
  
});


29 


30 
  
it
(
'should be exceptional common year'
,
 
function
 
()
 
{


31 
    
expect
(
leapYear
(
1700
)).
toBeFalsy
();


32 
    
expect
(
leapYear
(
1800
)).
toBeFalsy
();


33 
    
expect
(
leapYear
(
1900
)).
toBeFalsy
();


34 
  
});


35 
})

```

Esto se ve más claro si avanzamos un poco más.

De ahora en adelante ocultaré los tests de este ejemplo para centrarnos en los ejemplos de refactor.

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
function
 
divisibleBy
(
divisor
)
 
{


 3 
    
return
 
year
 
%
 
divisor
 
===
 
0
;


 4 
  
}


 5 


 6 
  
if
 
(
divisibleBy
(
400
))
 
{


 7 
    
return
 
true
;


 8 
  
}


 9 


10 
  
if
 
(
divisibleBy
(
100
))
 
{


11 
    
return
 
false
;


12 
  
}


13 


14 
  
if
 
(
divisibleBy
(
4
))
 
{


15 
    
return
 
true
;


16 
  
}


17 


18 
  
return
 
false
;


19 
}

```

Tenemos una misma estructura repetida tres veces, pero no podemos extraer un concepto común de aquí. Dos de las repeticiones representan el mismo concepto (año bisiesto), pero la tercera representa años de duración normal excepcionales.

## En búsqueda de la abstracción incorrecta

Intentemos otra aproximación:

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
function
 
divisibleBy
(
divisor
)
 
{


 3 
    
return
 
year
 
%
 
divisor
 
===
 
0
;


 4 
  
}


 5 


 6 
  
if
 
(
divisibleBy
(
4
 
*
 
4
 
*
 
5
 
*
 
5
))
 
{


 7 
    
return
 
true
;


 8 
  
}


 9 


10 
  
if
 
(
divisibleBy
(
4
 
*
 
5
 
*
 
5
))
 
{


11 
    
return
 
false
;


12 
  
}


13 


14 
  
if
 
(
divisibleBy
(
4
))
 
{


15 
    
return
 
true
;


16 
  
}


17 


18 
  
return
 
false
;


19 
}

```

Si dividimos el año entre cuatro podríamos plantear otra idea, ya que eso nos podría ayudar a identificar mejor las partes comunes y diferentes:

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
function
 
divisibleBy
(
divisor
)
 
{


 3 
    
return
 
year
 
%
 
divisor
 
===
 
0
;


 4 
  
}


 5 
  
year
 
/=
 
4


 6 


 7 
  
if
 
(
divisibleBy
(
4
 
*
 
5
 
*
 
5
))
 
{


 8 
    
return
 
true
;


 9 
  
}


10 


11 
  
if
 
(
divisibleBy
(
5
 
*
 
5
))
 
{


12 
    
return
 
false
;


13 
  
}


14 


15 
  
if
 
(
divisibleBy
(
1
))
 
{


16 
    
return
 
true
;


17 
  
}


18 


19 
  
return
 
false
;


20 
}

```

Es extraño, pero funciona. Más simplificado:

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
function
 
divisibleBy
(
divisor
)
 
{


 3 
    
return
 
year
 
%
 
divisor
 
===
 
0
;


 4 
  
}


 5 
  
year
 
/=
 
4


 6 


 7 
  
if
 
(
divisibleBy
(
100
))
 
{


 8 
    
return
 
true
;


 9 
  
}


10 


11 
  
if
 
(
divisibleBy
(
25
))
 
{


12 
    
return
 
false
;


13 
  
}


14 


15 
  
if
 
(
divisibleBy
(
1
))
 
{


16 
    
return
 
true
;


17 
  
}


18 


19 
  
return
 
false
;


20 
}

```

Sigue funcionando. Pero, ¿de qué nos sirve?

* Por un lado, seguimos sin encontrar una manera de reconciliar las tres estructuras `if/then`.
* Por otro, hemos hecho que las reglas de dominio sean irreconocibles.

En otras palabras: intentar encontrar una abstracción basándonos sólo en la existencia de repetición en el código puede ser un camino sin salida.

## La abstracción correcta

Como hemos señalado antes, el concepto que nos interesa es el de año bisiesto y las reglas que lo determinan. ¿Podemos hacer el código menos repetitivo? Puede ser. Volvamos al principio:

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
function
 
divisibleBy
(
divisor
)
 
{


 3 
    
return
 
year
 
%
 
divisor
 
===
 
0
;


 4 
  
}


 5 


 6 
  
if
 
(
divisibleBy
(
400
))
 
{


 7 
    
return
 
true
;


 8 
  
}


 9 


10 
  
if
 
(
divisibleBy
(
100
))
 
{


11 
    
return
 
false
;


12 
  
}


13 


14 
  
if
 
(
divisibleBy
(
4
))
 
{


15 
    
return
 
true
;


16 
  
}


17 


18 
  
return
 
false
;


19 
}

```

La cuestión es que la regla de divisible por 400 es una excepción a la regla de divisible por 100:

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
function
 
divisibleBy
(
divisor
)
 
{


 3 
    
return
 
year
 
%
 
divisor
 
===
 
0
;


 4 
  
}


 5 


 6 
  
if
 
(
divisibleBy
(
100
)
 
&&
 
!
divisibleBy
(
400
))
 
{


 7 
    
return
 
false
;


 8 
  
}


 9 


10 
  
if
 
(
divisibleBy
(
4
))
 
{


11 
    
return
 
true
;


12 
  
}


13 


14 
  
return
 
false
;


15 
}

```

Lo que nos permite hacer esto y compactar un poco la solución:

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
function
 
divisibleBy
(
divisor
)
 
{


 3 
    
return
 
year
 
%
 
divisor
 
===
 
0
;


 4 
  
}


 5 


 6 
  
if
 
(
divisibleBy
(
100
)
 
&&
 
!
divisibleBy
(
400
))
 
{


 7 
    
return
 
false
;


 8 
  
}


 9 


10 
  
return
 
divisibleBy
(
4
);


11 
}

```

Quizá podamos hacerla un poco más explícita:

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
function
 
divisibleBy
(
divisor
)
 
{


 3 
    
return
 
year
 
%
 
divisor
 
===
 
0
;


 4 
  
}


 5 


 6 
  
function
 
isCommonYearExceptionally
()
 
{


 7 
    
return
 
divisibleBy
(
100
)
 
&&
 
!
divisibleBy
(
400
);


 8 
  
}


 9 


10 
  
if
 
(
isCommonYearExceptionally
())
 
{


11 
    
return
 
false
;


12 
  
}


13 


14 
  
return
 
divisibleBy
(
4
);


15 
}

```

Pero ahora queda un poco raro, necesitamos ser más explícitas aquí:

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
function
 
divisibleBy
(
divisor
)
 
{


 3 
    
return
 
year
 
%
 
divisor
 
===
 
0
;


 4 
  
}


 5 


 6 
  
function
 
isCommonYearExceptionally
()
 
{


 7 
    
return
 
divisibleBy
(
100
)
 
&&
 
!
divisibleBy
(
400
);


 8 
  
}


 9 


10 
  
function
 
isLeapYear
()
 
{


11 
    
return
 
divisibleBy
(
4
);


12 
  
}


13 


14 
  
if
 
(
isCommonYearExceptionally
())
 
{


15 
    
return
 
false
;


16 
  
}


17 


18 
  
return
 
isLeapYear
();


19 
}

```

En este punto, me pregunto si esto no es demasiado poco natural. Por un lado, la abstracción es correcta, pero a fuerza de llevarla tan lejos posiblemente estamos pecando de cierta  *sobre-ingeniería* . El dominio del problema es muy pequeño y las reglas muy sencillas y claras. Si comparas esto:

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
function
 
divisibleBy
(
divisor
)
 
{


 3 
    
return
 
year
 
%
 
divisor
 
===
 
0
;


 4 
  
}


 5 


 6 
  
if
 
(
divisibleBy
(
400
))
 
{


 7 
    
return
 
true
;


 8 
  
}


 9 


10 
  
if
 
(
divisibleBy
(
100
))
 
{


11 
    
return
 
false
;


12 
  
}


13 


14 
  
if
 
(
divisibleBy
(
4
))
 
{


15 
    
return
 
true
;


16 
  
}


17 


18 
  
return
 
false
;


19 
}

```

Con esto:

```

 1 
function
 
leapYear
(
year
)
 
{


 2 
  
function
 
divisibleBy
(
divisor
)
 
{


 3 
    
return
 
year
 
%
 
divisor
 
===
 
0
;


 4 
  
}


 5 


 6 
  
function
 
isCommonYearExceptionally
()
 
{


 7 
    
return
 
divisibleBy
(
100
)
 
&&
 
!
divisibleBy
(
400
);


 8 
  
}


 9 


10 
  
function
 
isLeapYear
()
 
{


11 
    
return
 
divisibleBy
(
4
);


12 
  
}


13 


14 
  
if
 
(
isCommonYearExceptionally
())
 
{


15 
    
return
 
false
;


16 
  
}


17 


18 
  
return
 
isLeapYear
();


19 
}

```

Creo que me quedaría con la primera solución. Ahora bien, en un problema más complejo y más complicado de entender, puede que la segunda solución sea mucho más adecuada, precisamente porque nos ayudaría a hacer explícitos los conceptos implicados.

La moraleja es que no hay que empeñarse en buscar la abstracción perfecta, sino la suficiente para este momento.

# 8 Evolución del comportamiento mediante tests

La metodología TDD se basa en ciclos de trabajo en los que definimos un comportamiento deseado en forma de test, realizamos cambios en el código de producción para implementarlo, y refactorizamos la solución una vez que sabemos que funciona.

Si bien disponemos de herramientas específicas para detectar situaciones que requieren refactor e incluso métodos bien definidos para llevarlo a cabo, no tenemos recursos que guíen las transformaciones necesarias del código de una forma similar. Es decir, ¿existe algún proceso que nos sirva para decidir qué tipo de cambio aplicar al código para implementar un comportamiento?

[The Transformation Priority Premise](http://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html)^[1](https://leanpub.com/tddcourse/read#fn-fn32)^ es un artículo que plantea un *framework* útil en este sentido. Partiendo de la idea de que a medida que los tests son más específicos el código se vuelve más general, propone una secuencia del tipo de transformaciones que podemos aplicar cada vez que estamos en fase de implementación, en la transición de rojo a verde.

El desarrollo mediante TDD tendría dos partes principales:

* En la primera parte construimos la interfaz pública de la clase, definiendo cómo nos vamos a comunicar con ella y cómo nos va a responder. Esta respuesta la analizamos en su forma más genérica, que sería el tipo de dato que proporciona.
* En la segunda parte desarrollamos el comportamiento, empezando desde los casos más genéricos e introduciendo después los más específicos.

Vamos a ver esto con un ejemplo práctico. Realizaremos la kata Roman Numerals fijándonos en cómo los tests nos sirven para guiar estas dos partes. En esta ocasión el lenguaje será Kotlin.

## Construir la interfaz pública de una clase dirigida por tests

Siempre empezaremos con un test que nos obligue a definir la clase, pues de momento no nos hace falta nada más que tener algún objeto con el que poder llegar a interactuar.

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 


 5 
class
 
RomanNumeralsTest
 
{


 6 


 7 
  
@Test


 8 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


 9 
    
RomanNumerals
()


10 
  
}


11 
}

```

Ejecutamos el test para verlo fallar y, a continuación, escribimos la definición de la clase vacía, lo mínimo imprescindible para que el test pase.

```

1 
package
 
org.talkingbit.kata


2 


3 
class
 
RomanNumerals
 
{


4 


5 
}

```

Si la hemos creado en el mismo archivo que el test, ahora podemos moverla a su sitio durante la fase de refactor.

Ya podemos pensar en el segundo test, que necesitamos para definir la interfaz pública, es decir: cómo vamos a comunicarnos con el objeto una vez instanciado, qué mensajes es capaz de entender:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 


 5 
class
 
RomanNumeralsTest
 
{


 6 


 7 
  
@Test


 8 
  
fun
 
`
It
 
converts
 
numbers
 
to
 
roman
`
 
()
 
{


 9 
    
RomanNumerals
().
toRoman
()


10 
  
}


11 
}

```

Estamos modificando el primer test. Ahora que tenemos algo de soltura, podemos permitirnos estas licencias, para que escribir un nuevo test nos resulte más económico. Comprobamos que falle por lo que tiene que fallar (no está definido el mensaje `toRoman`). Seguidamente escribimos el código necesario para hacerlo pasar. El compilador nos ayuda: si ejecutamos el test veremos que lanza una excepción que nos dice que el método existe pero no está implementado. Y seguramente el IDE también nos lo indica de una forma u otra. En el caso de Kotlin, que es el lenguaje que estamos usando aquí, directamente nos pide que implementemos:

```

1 
package
 
org.talkingbit.kata


2 


3 
class
 
RomanNumerals
 
{


4 
  
fun
 
toRoman
()
 
{


5 
    
TODO
(
"Not yet implemented"
)


6 
  
}


7 
}

```

De momento, quitamos estas indicaciones que introduce el IDE:

```

1 
package
 
org.talkingbit.kata


2 


3 
class
 
RomanNumerals
 
{


4 
  
fun
 
toRoman
()
 
{


5 
  
}


6 
}

```

Y con esto el test pasa. Ya tenemos el mensaje con el que vamos a pedirle a `RomanNumerals` que haga la conversión. El siguiente paso puede ser definir que la respuesta que esperamos es un `String`. Si trabajamos con tipado dinámico o *Duck Typing* necesitaremos un test específico. Sin embargo, en Kotlin podemos hacerlo sin tests. Nos basta especificar el tipo que retorna la función:

```

1 
package
 
org.talkingbit.kata


2 


3 
class
 
RomanNumerals
 
{


4 
  
fun
 
toRoman
():
 
String
 
{


5 
  
}


6 
}

```

Esto no compilará, así que el test que tenemos ahora fallará y la forma de hacerlo pasar es devolver algún `String`. Aunque sea vacío.

```

1 
package
 
org.talkingbit.kata


2 


3 
class
 
RomanNumerals
 
{


4 
  
fun
 
toRoman
():
 
String
 
{


5 
    
return
 
""
;


6 
  
}


7 
}

```

Hasta cierto punto podemos considerar esto como un refactor, pero lo puedes aplicar como si fuese un test.

Ahora ya vamos a pensar en cómo usar este código para convertir los números arábigos ea la notación romana. Como en ella no hay cero, tenemos que empezar por el 1.

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 


 5 
class
 
RomanNumeralsTest
 
{


 6 


 7 
  
@Test


 8 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


 9 
    
RomanNumerals
().
toRoman
(
1
)


10 
  
}


11 
}

```

Al ejecutar el test vemos que falla porque la función no espera parámetro, así que lo añadimos:

```

1 
package
 
org.talkingbit.kata


2 


3 
class
 
RomanNumerals
 
{


4 
  
fun
 
toRoman
(
decimal
:
 
Int
):
 
String
 
{


5 
    
return
 
""
;


6 
  
}


7 
}

```

Y esto hace pasar el test. La interfaz pública ha quedado definida, pero aún no tenemos ningún comportamiento.

Esta forma de construir la clase puede no funcionar igual en otros lenguajes. En este ejemplo, Kotlin no puede ejecutar un método si le pasamos parámetros cuando no los pide, lo que nos permite hacer un test de este estilo para forzar la implementación del mismo. Sin embargo, a PHP le daría igual, de modo que tendríamos que usar otro tipo de test para forzarnos a introducir el parámetro. Otros lenguajes requieren que asignes el retorno a una variable. Por tanto, ten presente estos detalles propios del lenguaje en el que estés practicando, algunos de ellos hasta te ahorrarán escribir tests.

## Dirigir el desarrollo de un comportamiento con ejemplos

Una vez que hemos establecido la interfaz pública de la clase que estamos desarrollando querremos empezar a implementar su comportamiento. Necesitamos un primer ejemplo, que para este ejercicio será convertir el `1` en `I`.

Para esto ya necesitamos asignar el valor a una variable y utilizar una aserción. El test quedará así:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
var
 
roman
 
=
 
RomanNumerals
().
toRoman
(
1
)


11 


12 
    
assertEquals
(
"I"
,
 
roman
)


13 
  
}


14 
}

```

### De null a constante

Ahora mismo `RomanNumerals().toRoman(1)` devuelve `""`, que para el caso es equivalente a devolver `null`.

¿Cuál es la transformación más sencilla que podemos realizar para que el test pase? En pocas palabras se trata de pasar de no devolver nada a devolver algo, y para que el test pase, ese algo debe ser el valor “I”. O sea, una constante:

```

1 
package
 
org.talkingbit.kata


2 


3 
class
 
RomanNumerals
 
{


4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


5 
    
return
 
"I"


6 
  
}


7 
}

```

El test pasa. Esta solución puede chocarte si es la primera vez que te asomas a TDD, aunque si estás leyendo este libro ya habrás visto más ejemplos de lo mismo. Pero esta solución no es estúpida.

De hecho, esta es la mejor solución para el estado actual del test. Nosotras podemos saber que queremos construir un convertidor de números arábigos a romanos, pero lo que el test especifica aquí y ahora es que esperamos que convierta el número entero `1` en el String `I`. Y es exactamente lo que hace.

Por tanto, la implementación tiene exactamente la complejidad y el nivel de especificidad necesarios. Lo que haremos a continuación será cuestionarla con otro ejemplo.

Pero antes, nos conviene hacer un refactor.

Lo haremos a fin de prepararnos para lo que viene después. Cuando cambiemos el ejemplo tendrá que cambiar la respuesta. Así que vamos a hacer dos cosas: utilizar el parámetro que recibimos y, a la vez, asegurar que este test siempre pasará:

```

1 
package
 
org.talkingbit.kata


2 


3 
class
 
RomanNumerals
 
{


4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


5 
    
if
 
(
number
 
==
 
1
)
 
return
 
"I"


6 
    
return
 
""


7 
  
}


8 
}

```

Ejecutamos el test, que debería pasar sin problema. Además, haremos un pequeño arreglo al propio test:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 


11 
    
assertEquals
(
"I"
,
 
RomanNumerals
().
toRoman
(
1
))


12 
  
}


13 
}

```

El test ahora sigue pasando y no hay nada que hacer ya, por lo que vamos a introducir un nuevo ejemplo, cosa que ahora es más fácil de hacer:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertEquals
(
"I"
,
 
RomanNumerals
().
toRoman
(
1
))


11 
    
assertEquals
(
"II"
,
 
RomanNumerals
().
toRoman
(
2
))


12 
  
}


13 
}

```

Al ejecutar el test comprobamos que falla porque no devuelve el `II` esperado. Una forma de hacerlo pasar es la siguiente:

```

1 
package
 
org.talkingbit.kata


2 


3 
class
 
RomanNumerals
 
{


4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


5 
    
if
 
(
number
 
==
 
2
)
 
return
 
"II"


6 
    
if
 
(
number
 
==
 
1
)
 
return
 
"I"


7 
    
return
 
""


8 
  
}


9 
}

```

Observa que, de momento, estamos devolviendo constantes en todos los casos.

Hagamos refactor ya que estamos en verde. Primero del test, para que sea aún más compacto y fácil de leer y añadir nuevos ejemplos:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertConvertsToRoman
(
1
,
 
"I"
)


11 
    
assertConvertsToRoman
(
2
,
 
"II"
)


12 
  
}


13 


14 
  
private
 
fun
 
assertConvertsToRoman
(
arabic
:
 
Int
,
 
roman
:
 
String
)
 
{


15 
    
assertEquals
(
roman
,
 
RomanNumerals
().
toRoman
(
arabic
))


16 
  
}


17 
}

```

Añadamos un test más. Ahora es aún más sencillo:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertConvertsToRoman
(
1
,
 
"I"
)


11 
    
assertConvertsToRoman
(
2
,
 
"II"
)


12 
    
assertConvertsToRoman
(
3
,
 
"III"
)


13 
  
}


14 


15 
  
private
 
fun
 
assertConvertsToRoman
(
arabic
:
 
Int
,
 
roman
:
 
String
)
 
{


16 
    
assertEquals
(
roman
,
 
RomanNumerals
().
toRoman
(
arabic
))


17 
  
}


18 
}

```

Lo vemos fallar y para que pase, añadimos una nueva constante:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
if
 
(
number
 
==
 
3
)
 
return
 
"III"


 6 
    
if
 
(
number
 
==
 
2
)
 
return
 
"II"


 7 
    
if
 
(
number
 
==
 
1
)
 
return
 
"I"


 8 
    
return
 
""


 9 
  
}


10 
}

```

Y ahora expresando lo mismo, pero de distinta manera y usando una única constante:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
if
 
(
number
 
==
 
3
)
 
return
 
"I"
 
+
 
"I"
 
+
 
"I"


 6 
    
if
 
(
number
 
==
 
2
)
 
return
 
"I"
 
+
 
"I"


 7 
    
if
 
(
number
 
==
 
1
)
 
return
 
"I"


 8 
    
return
 
""


 9 
  
}


10 
}

```

Podríamos extraerla:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
val
 
i
 
=
 
"I"


 6 
    
if
 
(
number
 
==
 
3
)
 
roman
 
=
 
i
 
+
 
i
 
+
 
i


 7 
    
if
 
(
number
 
==
 
2
)
 
roman
 
=
 
i
 
+
 
i


 8 
    
if
 
(
number
 
==
 
1
)
 
roman
 
=
 
i


 9 
    
return
 
""


10 
  
}


11 
}

```

Y ahora es fácil ver cómo podríamos introducir una nueva transformación.

### De constante a variable

Esta transformación consiste en usar una variable para generar la respuesta. Es decir, ahora en lugar de devolver un valor fijo para cada ejemplo, lo que haremos es calcular la respuesta que toca. Básicamente, hemos empezado a construir un algoritmo.

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
val
 
i
 
=
 
"I"


 6 
    
var
 
roman
 
=
 
""


 7 
    
if
 
(
number
 
==
 
3
)
 
roman
 
=
 
i
 
+
 
i
 
+
 
i


 8 
    
if
 
(
number
 
==
 
2
)
 
roman
 
=
 
i
 
+
 
i


 9 
    
if
 
(
number
 
==
 
1
)
 
roman
 
=
 
i


10 


11 
    
return
 
roman


12 
  
}


13 
}

```

Esta transformación hace evidente que al algoritmo consiste en acumular tantos `I` como nos indica el número `number`. Una forma de verlo es la siguiente:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
val
 
i
 
=
 
"I"


 6 
    
var
 
roman
 
=
 
""


 7 
    
for
 
(
counter
 
in
 
1.
.
number
)
 
{


 8 
        
roman
 
+=
 
i


 9 
    
}


10 
    
return
 
roman


11 
  
}


12 
}

```

Pero este bucle `for`, se puede expresar mejor mediante un `while`, aunque antes tenemos que hacer un cambio. Hay que hacer notar que los parámetros en kotlin son `final`, por lo que no podemos modificarlos. Por eso hemos tenido que introducir una variable que se inicializa con el valor del parámetro.

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
val
 
i
 
=
 
"I"


 7 
    
var
 
roman
 
=
 
""


 8 
    
while
 
(
arabic
 
>=
 
1
)
 
{


 9 
        
roman
 
+=
 
i


10 
        
arabic
 
-=
 
1


11 
    
}


12 


13 
    
return
 
roman


14 
  
}


15 
}

```

Por otro lado, puesto que la constante `i` sólo se usa una vez, y como su significado es bastante evidente, la vamos a eliminar.

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 
    
while
 
(
arabic
 
>=
 
1
)
 
{


 8 
        
roman
 
+=
 
"I"


 9 
        
arabic
 
-=
 
1


10 
    
}


11 


12 
    
return
 
roman


13 
  
}


14 
}

```

De este modo, hemos empezado a construir una solución más general para el algoritmo, al menos hasta el punto definido actualmente por los tests. Como sabemos, no es “legal” acumular más de 3 símbolos iguales en la notación romana, por lo que el método en su estado actual generará números romanos incorrectos si lo usamos a partir del cuatro.

Esto nos indica que necesitamos un nuevo test para poder incorporar nuevo comportamiento y desarrollar más el algoritmo, que aún es muy específico.

Pero, ¿cuál es el siguiente ejemplo que podríamos implementar?

### De incondicional a condicional

En primer lugar tenemos el número 4, que en notación romana es `IV`. Introduce un símbolo nuevo, que es una combinación de símbolos. Por lo que sabemos hasta ahora es un caso particular, así que introducimos una condicional que separe el flujo en dos ramas: una para lo que ya sabemos y otra para lo nuevo.

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertConvertsToRoman
(
1
,
 
"I"
)


11 
    
assertConvertsToRoman
(
2
,
 
"II"
)


12 
    
assertConvertsToRoman
(
3
,
 
"III"
)


13 
    
assertConvertsToRoman
(
4
,
 
"IV"
)


14 
  
}


15 


16 
  
private
 
fun
 
assertConvertsToRoman
(
arabic
:
 
Int
,
 
roman
:
 
String
)
 
{


17 
    
assertEquals
(
roman
,
 
RomanNumerals
().
toRoman
(
arabic
))


18 
  
}


19 
}

```

El test fallará porque intenta convertir el número 4 con `IIII`. Introducimos la condicional para tratar este caso particular.

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 


 8 
    
if
 
(
arabic
 
==
 
4
)
 
{


 9 
        
roman
 
=
 
"IV"


10 
    
}


11 


12 
    
while
 
(
arabic
 
>=
 
1
)
 
{


13 
        
roman
 
+=
 
"I"


14 
        
arabic
 
-=
 
1


15 
    
}


16 


17 
    
return
 
roman


18 
  
}


19 
}

```

Ups. El test falla porque la respuesta es `IVIII`. Hemos olvidado descontar el valor consumido. Lo arreglamos así y tomamos nota para el futuro:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 


 8 
    
if
 
(
arabic
 
==
 
4
)
 
{


 9 
        
roman
 
=
 
"IV"


10 
        
arabic
 
-=
 
4


11 
    
}


12 


13 
    
while
 
(
arabic
 
>=
 
1
)
 
{


14 
        
roman
 
+=
 
"I"


15 
        
arabic
 
-=
 
1


16 
    
}


17 


18 
    
return
 
roman


19 
  
}


20 
}

```

Avanzamos un nuevo número:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertConvertsToRoman
(
1
,
 
"I"
)


11 
    
assertConvertsToRoman
(
2
,
 
"II"
)


12 
    
assertConvertsToRoman
(
3
,
 
"III"
)


13 
    
assertConvertsToRoman
(
4
,
 
"IV"
)


14 
    
assertConvertsToRoman
(
5
,
 
"V"
)


15 
  
}


16 


17 
  
private
 
fun
 
assertConvertsToRoman
(
arabic
:
 
Int
,
 
roman
:
 
String
)
 
{


18 
    
assertEquals
(
roman
,
 
RomanNumerals
().
toRoman
(
arabic
))


19 
  
}


20 
}

```

Comprobamos que el test falla por las razones esperadas y nos da como resultado `IIIII`. Para hacerlo pasar tomaremos otro camino, introduciendo una nueva condicional porque es un caso nuevo. Esta vez no nos olvidamos de descontar el valor de 5.

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 


 8 
    
if
 
(
arabic
 
==
 
5
)
 
{


 9 
        
roman
 
=
 
"V"


10 
        
arabic
 
-=
 
5


11 
    
}


12 


13 
    
if
 
(
arabic
 
==
 
4
)
 
{


14 
        
roman
 
=
 
"IV"


15 
        
arabic
 
-=
 
4


16 
    
}


17 


18 
    
while
 
(
arabic
 
>=
 
1
)
 
{


19 
        
roman
 
+=
 
"I"


20 
        
arabic
 
-=
 
1


21 
    
}


22 


23 
    
return
 
roman


24 
  
}


25 
}

```

Lo cierto es que ya habíamos usado condicionales antes, cuando nuestras respuestas eran constantes, para escoger “qué constante devolver” por así decir. Ahora introducimos la condicional para poder tratar nuevas familia de casos ya que hemos agotado la capacidad del código existente para resolver los casos nuevos que estamos introduciendo. Y dentro de esa rama de ejecución que antes no existía, volvemos a resolver mediante una constante.

Introduzcamos un nuevo test que falle para forzar un nuevo avance del algoritmo:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertConvertsToRoman
(
1
,
 
"I"
)


11 
    
assertConvertsToRoman
(
2
,
 
"II"
)


12 
    
assertConvertsToRoman
(
3
,
 
"III"
)


13 
    
assertConvertsToRoman
(
3
,
 
"IV"
)


14 
    
assertConvertsToRoman
(
5
,
 
"V"
)


15 
    
assertConvertsToRoman
(
6
,
 
"VI"
)


16 
  
}


17 


18 
  
private
 
fun
 
assertConvertsToRoman
(
arabic
:
 
Int
,
 
roman
:
 
String
)
 
{


19 
    
assertEquals
(
roman
,
 
RomanNumerals
().
toRoman
(
arabic
))


20 
  
}


21 
}

```

En este caso es especialmente interesante ver cómo falla:

```

1 
expected:<[V]I> but was:<[IIIII]I>

2 
Expected :VI

3 
Actual   :IIIIII
```

Necesitamos hacer que se incluya el símbolo “V”, algo que podemos hacer de forma muy simple, cambiando el `==` por un `>=`.

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 


 8 
    
if
 
(
arabic
 
>=
 
5
)
 
{


 9 
        
roman
 
=
 
"V"


10 
        
arabic
 
-=
 
5


11 
    
}


12 


13 
    
if
 
(
arabic
 
==
 
4
)
 
{


14 
        
roman
 
=
 
"IV"


15 
        
arabic
 
-=
 
4


16 
    
}


17 


18 
    
while
 
(
arabic
 
>=
 
1
)
 
{


19 
        
roman
 
+=
 
"I"


20 
        
arabic
 
-=
 
1


21 
    
}


22 


23 
    
return
 
roman


24 
  
}


25 
}

```

Ha bastado un cambio mínimo para conseguir que el test pase. Los dos siguientes ejemplos pasan sin hacer nada:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertConvertsToRoman
(
1
,
 
"I"
)


11 
    
assertConvertsToRoman
(
2
,
 
"II"
)


12 
    
assertConvertsToRoman
(
3
,
 
"III"
)


13 
    
assertConvertsToRoman
(
4
,
 
"IV"
)


14 
    
assertConvertsToRoman
(
5
,
 
"V"
)


15 
    
assertConvertsToRoman
(
6
,
 
"VI"
)


16 
    
assertConvertsToRoman
(
7
,
 
"VII"
)


17 
    
assertConvertsToRoman
(
8
,
 
"VIII"
)


18 
  
}


19 


20 
  
private
 
fun
 
assertConvertsToRoman
(
arabic
:
 
Int
,
 
roman
:
 
String
)
 
{


21 
    
assertEquals
(
roman
,
 
RomanNumerals
().
toRoman
(
arabic
))


22 
  
}


23 
}

```

Esto ocurre porque el algoritmo que tenemos hasta ahora empieza a ser lo bastante general como para contemplar esos casos. Sin embargo, con el `9`, tenemos una casuística diferente:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertConvertsToRoman
(
1
,
 
"I"
)


11 
    
assertConvertsToRoman
(
2
,
 
"II"
)


12 
    
assertConvertsToRoman
(
3
,
 
"III"
)


13 
    
assertConvertsToRoman
(
4
,
 
"IV"
)


14 
    
assertConvertsToRoman
(
5
,
 
"V"
)


15 
    
assertConvertsToRoman
(
6
,
 
"VI"
)


16 
    
assertConvertsToRoman
(
7
,
 
"VII"
)


17 
    
assertConvertsToRoman
(
8
,
 
"VIII"
)


18 
    
assertConvertsToRoman
(
9
,
 
"IX"
)


19 
  
}


20 


21 
  
private
 
fun
 
assertConvertsToRoman
(
arabic
:
 
Int
,
 
roman
:
 
String
)
 
{


22 
    
assertEquals
(
roman
,
 
RomanNumerals
().
toRoman
(
arabic
))


23 
  
}


24 
}

```

El resultado es:

```

1 
expected:<I[X]> but was:<I[V]>

2 
Expected :IX

3 
Actual   :IV
```

Necesitamos un tratamiento específico, así que añadimos una condicional para el caso nuevo:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 


 8 
    
if
 
(
arabic
 
==
 
9
)
 
{


 9 
        
roman
 
=
 
"IX"


10 
        
arabic
 
-=
 
9


11 
    
}


12 


13 
    
if
 
(
arabic
 
>=
 
5
)
 
{


14 
        
roman
 
=
 
"V"


15 
        
arabic
 
-=
 
5


16 
    
}


17 


18 
    
if
 
(
arabic
 
==
 
4
)
 
{


19 
        
roman
 
=
 
"IV"


20 
        
arabic
 
-=
 
4


21 
    
}


22 


23 
    
while
 
(
arabic
 
>=
 
1
)
 
{


24 
        
roman
 
+=
 
"I"


25 
        
arabic
 
-=
 
1


26 
    
}


27 


28 
    
return
 
roman


29 
  
}


30 
}

```

Seguimos progresando en los ejemplos:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertConvertsToRoman
(
1
,
 
"I"
)


11 
    
assertConvertsToRoman
(
2
,
 
"II"
)


12 
    
assertConvertsToRoman
(
3
,
 
"III"
)


13 
    
assertConvertsToRoman
(
4
,
 
"IV"
)


14 
    
assertConvertsToRoman
(
5
,
 
"V"
)


15 
    
assertConvertsToRoman
(
6
,
 
"VI"
)


16 
    
assertConvertsToRoman
(
7
,
 
"VII"
)


17 
    
assertConvertsToRoman
(
8
,
 
"VIII"
)


18 
    
assertConvertsToRoman
(
9
,
 
"IX"
)


19 
    
assertConvertsToRoman
(
10
,
 
"X"
)


20 
  
}


21 


22 
  
private
 
fun
 
assertConvertsToRoman
(
arabic
:
 
Int
,
 
roman
:
 
String
)
 
{


23 
    
assertEquals
(
roman
,
 
RomanNumerals
().
toRoman
(
arabic
))


24 
  
}


25 
}

```

Al tratarse de un nuevo símbolo lo abordamos de manera especial:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 


 8 
    
if
 
(
arabic
 
==
 
10
)
 
{


 9 
        
roman
 
=
 
"X"


10 
        
arabic
 
-=
 
10


11 
    
}


12 


13 
    
if
 
(
arabic
 
==
 
9
)
 
{


14 
        
roman
 
=
 
"IX"


15 
        
arabic
 
-=
 
9


16 
    
}


17 


18 
    
if
 
(
arabic
 
>=
 
5
)
 
{


19 
        
roman
 
=
 
"V"


20 
        
arabic
 
-=
 
5


21 
    
}


22 


23 
    
if
 
(
arabic
 
==
 
4
)
 
{


24 
        
roman
 
=
 
"IV"


25 
        
arabic
 
-=
 
4


26 
    
}


27 


28 
    
while
 
(
arabic
 
>=
 
1
)
 
{


29 
        
roman
 
+=
 
"I"


30 
        
arabic
 
-=
 
1


31 
    
}


32 


33 
    
return
 
roman


34 
  
}


35 
}

```

Si observamos el código de producción vemos estructuras que son similares, pero no está del todo claro un patrón que nos permite hacer una refactor para generalizar. Quizá necesitamos más información. Vamos al caso siguiente:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertConvertsToRoman
(
1
,
 
"I"
)


11 
    
assertConvertsToRoman
(
2
,
 
"II"
)


12 
    
assertConvertsToRoman
(
3
,
 
"III"
)


13 
    
assertConvertsToRoman
(
4
,
 
"IV"
)


14 
    
assertConvertsToRoman
(
5
,
 
"V"
)


15 
    
assertConvertsToRoman
(
6
,
 
"VI"
)


16 
    
assertConvertsToRoman
(
7
,
 
"VII"
)


17 
    
assertConvertsToRoman
(
8
,
 
"VIII"
)


18 
    
assertConvertsToRoman
(
9
,
 
"IX"
)


19 
    
assertConvertsToRoman
(
10
,
 
"X"
)


20 
    
assertConvertsToRoman
(
11
,
 
"XI"
)


21 
  
}


22 


23 
  
private
 
fun
 
assertConvertsToRoman
(
arabic
:
 
Int
,
 
roman
:
 
String
)
 
{


24 
    
assertEquals
(
roman
,
 
RomanNumerals
().
toRoman
(
arabic
))


25 
  
}


26 
}

```

Este test da como resultado:

```

1 
expected:<[X]I> but was:<[VIIIII]I>

2 
Expected :XI

3 
Actual   :VIIIIII
```

Para empezar, necesitamos entrar en la condicional del símbolo “X”, así que hacemos este cambio:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 


 8 
    
if
 
(
arabic
 
>=
 
10
)
 
{


 9 
        
roman
 
=
 
"X"


10 
        
arabic
 
-=
 
10


11 
    
}


12 


13 
    
if
 
(
arabic
 
==
 
9
)
 
{


14 
        
roman
 
=
 
"IX"


15 
        
arabic
 
-=
 
9


16 
    
}


17 


18 
    
if
 
(
arabic
 
>=
 
5
)
 
{


19 
        
roman
 
=
 
"V"


20 
        
arabic
 
-=
 
5


21 
    
}


22 


23 
    
if
 
(
arabic
 
==
 
4
)
 
{


24 
        
roman
 
=
 
"IV"


25 
        
arabic
 
-=
 
4


26 
    
}


27 


28 
    
while
 
(
arabic
 
>=
 
1
)
 
{


29 
        
roman
 
+=
 
"I"


30 
        
arabic
 
-=
 
1


31 
    
}


32 


33 
    
return
 
roman


34 
  
}


35 
}

```

Y esto es suficiente para hacer pasar el test. Con el número 12 y 13, el test sigue pasando, pero al llegar al 14, algo ocurre:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertConvertsToRoman
(
1
,
 
"I"
)


11 
    
assertConvertsToRoman
(
2
,
 
"II"
)


12 
    
assertConvertsToRoman
(
3
,
 
"III"
)


13 
    
assertConvertsToRoman
(
4
,
 
"IV"
)


14 
    
assertConvertsToRoman
(
5
,
 
"V"
)


15 
    
assertConvertsToRoman
(
6
,
 
"VI"
)


16 
    
assertConvertsToRoman
(
7
,
 
"VII"
)


17 
    
assertConvertsToRoman
(
8
,
 
"VIII"
)


18 
    
assertConvertsToRoman
(
9
,
 
"IX"
)


19 
    
assertConvertsToRoman
(
10
,
 
"X"
)


20 
    
assertConvertsToRoman
(
11
,
 
"XI"
)


21 
    
assertConvertsToRoman
(
12
,
 
"XII"
)


22 
    
assertConvertsToRoman
(
13
,
 
"XIII"
)


23 
    
assertConvertsToRoman
(
14
,
 
"XIV"
)


24 
  
}


25 


26 
  
private
 
fun
 
assertConvertsToRoman
(
arabic
:
 
Int
,
 
roman
:
 
String
)
 
{


27 
    
assertEquals
(
roman
,
 
RomanNumerals
().
toRoman
(
arabic
))


28 
  
}


29 
}

```

El resultado es:

```

1 
expected:<[X]IV> but was:<[]IV>

2 
Expected :XIV

3 
Actual   :IV
```

Esto sucede porque no estamos acumulando la notación romana en la variable que vamos a retornar, por lo que en algunos lugares *machacamos* el resultado existente. Hagamos el cambio de una asignación simple a una expresión:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 


 8 
    
if
 
(
arabic
 
>=
 
10
)
 
{


 9 
        
roman
 
=
 
"X"


10 
        
arabic
 
-=
 
10


11 
    
}


12 


13 
    
if
 
(
arabic
 
==
 
9
)
 
{


14 
        
roman
 
=
 
"IX"


15 
        
arabic
 
-=
 
9


16 
    
}


17 


18 
    
if
 
(
arabic
 
>=
 
5
)
 
{


19 
        
roman
 
=
 
"V"


20 
        
arabic
 
-=
 
5


21 
    
}


22 


23 
    
if
 
(
arabic
 
==
 
4
)
 
{


24 
        
roman
 
+=
 
"IV"


25 
        
arabic
 
-=
 
4


26 
    
}


27 


28 
    
while
 
(
arabic
 
>=
 
1
)
 
{


29 
        
roman
 
+=
 
"I"


30 
        
arabic
 
-=
 
1


31 
    
}


32 


33 
    
return
 
roman


34 
  
}


35 
}

```

Este descubrimiento nos indica que podemos probar algunos ejemplos concretos con los que poner de manifiesto este problema y solucionarlo para otros números, por ejemplo el 15.

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertConvertsToRoman
(
1
,
 
"I"
)


11 
    
assertConvertsToRoman
(
2
,
 
"II"
)


12 
    
assertConvertsToRoman
(
3
,
 
"III"
)


13 
    
assertConvertsToRoman
(
4
,
 
"IV"
)


14 
    
assertConvertsToRoman
(
5
,
 
"V"
)


15 
    
assertConvertsToRoman
(
6
,
 
"VI"
)


16 
    
assertConvertsToRoman
(
7
,
 
"VII"
)


17 
    
assertConvertsToRoman
(
8
,
 
"VIII"
)


18 
    
assertConvertsToRoman
(
9
,
 
"IX"
)


19 
    
assertConvertsToRoman
(
10
,
 
"X"
)


20 
    
assertConvertsToRoman
(
11
,
 
"XI"
)


21 
    
assertConvertsToRoman
(
12
,
 
"XII"
)


22 
    
assertConvertsToRoman
(
13
,
 
"XIII"
)


23 
    
assertConvertsToRoman
(
14
,
 
"XIV"
)


24 
    
assertConvertsToRoman
(
15
,
 
"XV"
)


25 
  
}


26 


27 
  
private
 
fun
 
assertConvertsToRoman
(
arabic
:
 
Int
,
 
roman
:
 
String
)
 
{


28 
    
assertEquals
(
roman
,
 
RomanNumerals
().
toRoman
(
arabic
))


29 
  
}


30 
}

```

Y aplicamos el mismo cambio:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 


 8 
    
if
 
(
arabic
 
>=
 
10
)
 
{


 9 
        
roman
 
=
 
"X"


10 
        
arabic
 
-=
 
10


11 
    
}


12 


13 
    
if
 
(
arabic
 
==
 
9
)
 
{


14 
        
roman
 
=
 
"IX"


15 
        
arabic
 
-=
 
9


16 
    
}


17 


18 
    
if
 
(
arabic
 
>=
 
5
)
 
{


19 
        
roman
 
+=
 
"V"


20 
        
arabic
 
-=
 
5


21 
    
}


22 


23 
    
if
 
(
arabic
 
==
 
4
)
 
{


24 
        
roman
 
+=
 
"IV"


25 
        
arabic
 
-=
 
4


26 
    
}


27 


28 
    
while
 
(
arabic
 
>=
 
1
)
 
{


29 
        
roman
 
+=
 
"I"


30 
        
arabic
 
-=
 
1


31 
    
}


32 


33 
    
return
 
roman


34 
  
}


35 
}

```

El 19 también tiene la misma solución. Pero si probamos el 20, veremos un nuevo fallo, bastante curioso:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertConvertsToRoman
(
1
,
 
"I"
)


11 
    
assertConvertsToRoman
(
2
,
 
"II"
)


12 
    
assertConvertsToRoman
(
3
,
 
"III"
)


13 
    
assertConvertsToRoman
(
4
,
 
"IV"
)


14 
    
assertConvertsToRoman
(
5
,
 
"V"
)


15 
    
assertConvertsToRoman
(
6
,
 
"VI"
)


16 
    
assertConvertsToRoman
(
7
,
 
"VII"
)


17 
    
assertConvertsToRoman
(
8
,
 
"VIII"
)


18 
    
assertConvertsToRoman
(
9
,
 
"IX"
)


19 
    
assertConvertsToRoman
(
10
,
 
"X"
)


20 
    
assertConvertsToRoman
(
11
,
 
"XI"
)


21 
    
assertConvertsToRoman
(
12
,
 
"XII"
)


22 
    
assertConvertsToRoman
(
13
,
 
"XIII"
)


23 
    
assertConvertsToRoman
(
14
,
 
"XIV"
)


24 
    
assertConvertsToRoman
(
15
,
 
"XV"
)


25 
    
assertConvertsToRoman
(
19
,
 
"XIX"
)


26 
    
assertConvertsToRoman
(
20
,
 
"XX"
)


27 
  
}


28 


29 
  
private
 
fun
 
assertConvertsToRoman
(
arabic
:
 
Int
,
 
roman
:
 
String
)
 
{


30 
    
assertEquals
(
roman
,
 
RomanNumerals
().
toRoman
(
arabic
))


31 
  
}


32 
}

```

Este es el resultado:

```

1 
expected:<X[X]> but was:<X[VIIIII]>

2 
Expected :XX

3 
Actual   :XVIIIII
```

El problema es que necesitamos tener que reemplazar todos los `10` contenidos en el número por `X`.

### Cambiando de if a while

Para poder manejar este caso, lo más sencillo es cambiar el `if` a `while`. `while` es una estructura que es a la vez condicional y a la vez un bucle. Mientras que `if` sólo ejecuta la rama condicionada una vez, `while` lo hace mientras la condición se siga cumpliendo.

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 


 8 
    
while
 
(
arabic
 
>=
 
10
)
 
{


 9 
        
roman
 
+=
 
"X"


10 
        
arabic
 
-=
 
10


11 
    
}


12 


13 
    
if
 
(
arabic
 
==
 
9
)
 
{


14 
        
roman
 
+=
 
"IX"


15 
        
arabic
 
-=
 
9


16 
    
}


17 


18 
    
if
 
(
arabic
 
>=
 
5
)
 
{


19 
        
roman
 
+=
 
"V"


20 
        
arabic
 
-=
 
5


21 
    
}


22 


23 
    
if
 
(
arabic
 
==
 
4
)
 
{


24 
        
roman
 
+=
 
"IV"


25 
        
arabic
 
-=
 
4


26 
    
}


27 


28 
    
while
 
(
arabic
 
>=
 
1
)
 
{


29 
        
roman
 
+=
 
"I"


30 
        
arabic
 
-=
 
1


31 
    
}


32 


33 
    
return
 
roman


34 
  
}


35 
}

```

¿Podríamos usar `while` en todos los casos? Ahora que estamos en verde, probaremos a cambiar todas las condiciones de `if` a `while`. Y los tests demuestran que es posible hacerlo:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 


 8 
    
while
 
(
arabic
 
>=
 
10
)
 
{


 9 
        
roman
 
+=
 
"X"


10 
        
arabic
 
-=
 
10


11 
    
}


12 


13 
    
while
 
(
arabic
 
==
 
9
)
 
{


14 
        
roman
 
+=
 
"IX"


15 
        
arabic
 
-=
 
9


16 
    
}


17 


18 
    
while
 
(
arabic
 
>=
 
5
)
 
{


19 
        
roman
 
+=
 
"V"


20 
        
arabic
 
-=
 
5


21 
    
}


22 


23 
    
while
 
(
arabic
 
==
 
4
)
 
{


24 
        
roman
 
+=
 
"IV"


25 
        
arabic
 
-=
 
4


26 
    
}


27 


28 
    
while
 
(
arabic
 
>=
 
1
)
 
{


29 
        
roman
 
+=
 
"I"


30 
        
arabic
 
-=
 
1


31 
    
}


32 


33 
    
return
 
roman


34 
  
}


35 
}

```

Es interesante porque cada vez las estructuras se van haciendo más parecidas. Probemos ahora a cambiar los casos en que usamos una igualdad para ver si podemos comparar con `>=` en su lugar.

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 


 8 
    
while
 
(
arabic
 
>=
 
10
)
 
{


 9 
        
roman
 
+=
 
"X"


10 
        
arabic
 
-=
 
10


11 
    
}


12 


13 
    
while
 
(
arabic
 
>=
 
9
)
 
{


14 
        
roman
 
+=
 
"IX"


15 
        
arabic
 
-=
 
9


16 
    
}


17 


18 
    
while
 
(
arabic
 
>=
 
5
)
 
{


19 
        
roman
 
+=
 
"V"


20 
        
arabic
 
-=
 
5


21 
    
}


22 


23 
    
while
 
(
arabic
 
>=
 
4
)
 
{


24 
        
roman
 
+=
 
"IV"


25 
        
arabic
 
-=
 
4


26 
    
}


27 


28 
    
while
 
(
arabic
 
>=
 
1
)
 
{


29 
        
roman
 
+=
 
"I"


30 
        
arabic
 
-=
 
1


31 
    
}


32 


33 
    
return
 
roman


34 
  
}


35 
}

```

Y los test siguen pasando. Esto nos indica un posible refactor para unificar el código.

### Introducir arrays (o colecciones)

Es un refactor grande, que vamos a poner aquí en un solo paso. Básicamente consiste en introducir una estructura de diccionario (`Map` en Kotlin) que contiene las diversas reglas de conversión:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 


 8 
    
val
 
symbols
 
=
 
mapOf
(


 9 
            
10
 
to
 
"X"
,


10 
            
9
 
to
 
"IX"
,


11 
            
5
 
to
 
"V"
,


12 
            
4
 
to
 
"IV"
,


13 
            
1
 
to
 
"I"


14 
    
)


15 


16 
    
for
 
((
subtrahend
,
 
symbol
)
 
in
 
symbols
)
 
{


17 
        
while
 
(
arabic
 
>=
 
subtrahend
)
 
{


18 
            
roman
 
+=
 
symbol


19 
            
arabic
 
-=
 
subtrahend


20 
        
}


21 
    
}


22 


23 
    
return
 
roman


24 
  
}


25 
}

```

Los tests siguen pasando, indicación de que nuestro refactor es correcto. De hecho, no tendríamos fallos hasta llegar al número `39`. Algo esperable, porque se introduce un símbolo nuevo:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertConvertsToRoman
(
1
,
 
"I"
)


11 
    
assertConvertsToRoman
(
2
,
 
"II"
)


12 
    
assertConvertsToRoman
(
3
,
 
"III"
)


13 
    
assertConvertsToRoman
(
4
,
 
"IV"
)


14 
    
assertConvertsToRoman
(
5
,
 
"V"
)


15 
    
assertConvertsToRoman
(
6
,
 
"VI"
)


16 
    
assertConvertsToRoman
(
7
,
 
"VII"
)


17 
    
assertConvertsToRoman
(
8
,
 
"VIII"
)


18 
    
assertConvertsToRoman
(
9
,
 
"IX"
)


19 
    
assertConvertsToRoman
(
10
,
 
"X"
)


20 
    
assertConvertsToRoman
(
11
,
 
"XI"
)


21 
    
assertConvertsToRoman
(
12
,
 
"XII"
)


22 
    
assertConvertsToRoman
(
13
,
 
"XIII"
)


23 
    
assertConvertsToRoman
(
14
,
 
"XIV"
)


24 
    
assertConvertsToRoman
(
15
,
 
"XV"
)


25 
    
assertConvertsToRoman
(
19
,
 
"XIX"
)


26 
    
assertConvertsToRoman
(
20
,
 
"XX"
)


27 
    
assertConvertsToRoman
(
40
,
 
"XL"
)


28 
  
}


29 


30 
  
private
 
fun
 
assertConvertsToRoman
(
arabic
:
 
Int
,
 
roman
:
 
String
)
 
{


31 
    
assertEquals
(
roman
,
 
RomanNumerals
().
toRoman
(
arabic
))


32 
  
}


33 
}

```

La implementación es ahora sencilla:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


 5 
    
var
 
arabic
 
=
 
number


 6 
    
var
 
roman
 
=
 
""


 7 


 8 
    
val
 
symbols
 
=
 
mapOf
(


 9 
            
40
 
to
 
"XL"
,


10 
            
10
 
to
 
"X"
,


11 
            
9
 
to
 
"IX"
,


12 
            
5
 
to
 
"V"
,


13 
            
4
 
to
 
"IV"
,


14 
            
1
 
to
 
"I"


15 
    
)


16 


17 
    
for
 
((
subtrahend
,
 
symbol
)
 
in
 
symbols
)
 
{


18 
        
while
 
(
arabic
 
>=
 
subtrahend
)
 
{


19 
            
roman
 
+=
 
symbol


20 
            
arabic
 
-=
 
subtrahend


21 
        
}


22 
    
}


23 


24 
    
return
 
roman


25 
  
}


26 
}

```

Y ahora que hemos comprobado que funciona bien, la movemos a un mejor lugar:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
private
 
val
 
symbols
:
 
Map
<
Int
,
 
String
>
 
=
 
mapOf
(


 5 
        
40
 
to
 
"XL"
,


 6 
        
10
 
to
 
"X"
,


 7 
        
9
 
to
 
"IX"
,


 8 
        
5
 
to
 
"V"
,


 9 
        
4
 
to
 
"IV"
,


10 
        
1
 
to
 
"I"


11 
  
)


12 


13 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


14 
    
var
 
arabic
 
=
 
number


15 
    
var
 
roman
 
=
 
""


16 


17 
    
for
 
((
subtrahend
,
 
symbol
)
 
in
 
symbols
)
 
{


18 
        
while
 
(
arabic
 
>=
 
subtrahend
)
 
{


19 
            
roman
 
+=
 
symbol


20 
            
arabic
 
-=
 
subtrahend


21 
        
}


22 
    
}


23 


24 
    
return
 
roman


25 
  
}


26 
}

```

Podríamos seguir añadiendo ejemplos no cubiertos todavía para añadir las reglas de transformación que nos faltan, pero esencialmente este algoritmo ya no va a cambiar, con lo que hemos alcanzado una solución general para convertir cualquier número natural a notación romana. De hecho es así como quedaría. Los tests necesarios, primero:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
import
 
org.junit.jupiter.api.Test


 4 
import
 
kotlin.test.assertEquals


 5 


 6 
class
 
RomanNumeralsTest
 
{


 7 


 8 
  
@Test


 9 
  
fun
 
`
Should
 
convert
 
numbers
 
to
 
roman
`
 
()
 
{


10 
    
assertConvertsToRoman
(
1
,
 
"I"
)


11 
    
assertConvertsToRoman
(
2
,
 
"II"
)


12 
    
assertConvertsToRoman
(
3
,
 
"III"
)


13 
    
assertConvertsToRoman
(
4
,
 
"IV"
)


14 
    
assertConvertsToRoman
(
5
,
 
"V"
)


15 
    
assertConvertsToRoman
(
6
,
 
"VI"
)


16 
    
assertConvertsToRoman
(
7
,
 
"VII"
)


17 
    
assertConvertsToRoman
(
8
,
 
"VIII"
)


18 
    
assertConvertsToRoman
(
9
,
 
"IX"
)


19 
    
assertConvertsToRoman
(
10
,
 
"X"
)


20 
    
assertConvertsToRoman
(
11
,
 
"XI"
)


21 
    
assertConvertsToRoman
(
12
,
 
"XII"
)


22 
    
assertConvertsToRoman
(
13
,
 
"XIII"
)


23 
    
assertConvertsToRoman
(
14
,
 
"XIV"
)


24 
    
assertConvertsToRoman
(
15
,
 
"XV"
)


25 
    
assertConvertsToRoman
(
19
,
 
"XIX"
)


26 
    
assertConvertsToRoman
(
20
,
 
"XX"
)


27 
    
assertConvertsToRoman
(
40
,
 
"XL"
)


28 
    
assertConvertsToRoman
(
50
,
 
"L"
)


29 
    
assertConvertsToRoman
(
90
,
 
"XC"
)


30 
    
assertConvertsToRoman
(
100
,
 
"C"
)


31 
    
assertConvertsToRoman
(
400
,
 
"CD"
)


32 
    
assertConvertsToRoman
(
500
,
 
"D"
)


33 
    
assertConvertsToRoman
(
900
,
 
"CM"
)


34 
    
assertConvertsToRoman
(
1000
,
 
"M"
)


35 
  
}


36 


37 
  
private
 
fun
 
assertConvertsToRoman
(
arabic
:
 
Int
,
 
roman
:
 
String
)
 
{


38 
    
assertEquals
(
roman
,
 
RomanNumerals
().
toRoman
(
arabic
))


39 
  
}


40 
}

```

Y la implementación:

```

 1 
package
 
org.talkingbit.kata


 2 


 3 
class
 
RomanNumerals
 
{


 4 
  
private
 
val
 
symbols
:
 
Map
<
Int
,
 
String
>
 
=
 
mapOf
(


 5 
        
1000
 
to
 
"M"
,


 6 
        
900
 
to
 
"CM"
,


 7 
        
500
 
to
 
"D"
,


 8 
        
400
 
to
 
"CD"
,


 9 
        
100
 
to
 
"C"
,


10 
        
90
 
to
 
"XC"
,


11 
        
50
 
to
 
"L"
,


12 
        
40
 
to
 
"XL"
,


13 
        
10
 
to
 
"X"
,


14 
        
9
 
to
 
"IX"
,


15 
        
5
 
to
 
"V"
,


16 
        
4
 
to
 
"IV"
,


17 
        
1
 
to
 
"I"


18 
  
)


19 


20 
  
fun
 
toRoman
(
number
:
 
Int
):
 
String
 
{


21 
    
var
 
arabic
 
=
 
number


22 
    
var
 
roman
 
=
 
""


23 


24 
    
for
 
((
subtrahend
,
 
symbol
)
 
in
 
symbols
)
 
{


25 
        
while
 
(
arabic
 
>=
 
subtrahend
)
 
{


26 
            
roman
 
+=
 
symbol


27 
            
arabic
 
-=
 
subtrahend


28 
        
}


29 
    
}


30 


31 
    
return
 
roman


32 
  
}


33 
}

```

Podemos probar con diversos tests de aceptación para verificar que es posible generar cualquier número romano:

```

1 
    
assertConvertsToRoman
(
623
,
 
"DCXXIII"
)


2 
    
assertConvertsToRoman
(
1714
,
 
"MDCCXIV"
)


3 
    
assertConvertsToRoman
(
2938
,
 
"MMCMXXXVIII"
)

```

Pequeñas transformaciones del código de producción pueden dar lugar a cambios grandes de comportamiento, aunque para eso necesitaremos también dedicar tiempo al refactor, de modo que la introducción de los cambios sea lo más sencilla posible.

## Referencias

* [Applying Transformation Priority Premise to Roman Numerals Kata](https://codurance.com/2015/05/18/applying-transformation-priority-premise-to-roman-numerals-kata/)^[2](https://leanpub.com/tddcourse/read#fn-fn33)^
* [The Transformation Priority Premise](http://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html)^[3](https://leanpub.com/tddcourse/read#fn-fn34)^
* [The Transformation Priority Premise (TPP)](https://medium.com/@elliotchance/the-transformation-priority-premise-tpp-3e5dc08d445e)^[4](https://leanpub.com/tddcourse/read#fn-fn32)^

# 9 Prime Factors

## Desarrollando algoritmos

Esta kata demuestra que a medida que los tests se hacen más específicos, el algoritmo se vuelve más general. Pero, aparte de eso, es una kata estupenda para reflexionar sobre la elección de ejemplos y por qué no nos sirven los test que pasan en cuanto los escribimos.

Por otro lado, la kata revela un concepto bastante más intrigante: la premisa de prioridad de las transformaciones, según la cual, del mismo modo que hay *refactors* que son cambios en la estructura de un código que no alteran su comportamiento, existirían *transformaciones* que son cambios en código que producen cambios en su comportamiento.

Estas transformaciones tendrían un orden, desde las más sencillas a las más complejas, y una prioridad en su aplicación que dicta que deberíamos aplicar antes las más sencillas.

## Historia

La kata fue creada por [Robert C. Martin](http://butunclebob.com/ArticleS.UncleBob.ThePrimeFactorsKata)^[1](https://leanpub.com/tddcourse/read#fn-fn35)^ cuando escribía un programa para su hijo que calculase los factores primos de un número. Pensando sobre su desarrollo, le llamó la atención el modo en que el algoritmo evoluciona y se simplifica a medida que se hace más general.

## Enunciado

Escribir una clase con un método `generate` que devuelva una lista de los factores primos de un número entero. Si prefieres un enfoque más procedural, o incluso funcional, escribir una función `primefactors`.

Para no complicar el ejercicio el resultado se puede expresar con un array, lista o colección, con los factores no agrupados en forma de potencia. Por ejemplo:

```

1 
primefactors(2) = [2]

2 
primefactors(3) = [3]

3 
primefactors(6) = [2, 3]

4 
primefactors(8) = [2, 2, 2]

5 
primefactors(12) = [2, 2, 3]
```

## Orientaciones para resolverla

Esta kata es muy sencilla, a la vez que muy potente: hacen falta pocos ciclos para llevarla a cabo y sin embargo pone en evidencia algunas características de TDD especialmente importantes.

Para comenzar, podemos analizar los ejemplos que querríamos probar. En principio los argumentos serán números naturales. Tenemos tres categorías principales:

* Los que no tienen factores primos, el único caso es el 1.
* Los que son números primos, como 2, 3 ó 5.
* Los que son producto de varios números primos, como 4, 6, 8 ó 9.

Además, dentro de los números que no son primos, nos encontramos con los que son el producto de 2, 3 ó n factores, repetidos o no.

Aplicando las leyes de TDD que ya hemos visto, comenzaremos con un test lo más pequeño posible que falle. Luego escribiremos el código de producción necesario para hacer pasar el test.

Iremos recorriendo los distintos casos escribiendo primero el test y, a continuación, el código de producción que lo hace pasar sin romper los tests anteriores.

Una de las curiosidades de esta kata es que podemos ir tomando ejemplos de la lista de números naturales en orden, desde el 1 hasta donde consideremos que podemos parar. Sin embargo, ¿es esta la mejor estrategia? ¿Puede llevarnos a escoger ejemplos que no nos sirven?

## Enlaces de interés sobre la kata Prime Factors

* [Explicación de la kata](http://butunclebob.com/files/downloads/Prime%20Factors%20Kata.ppt)^[2](https://leanpub.com/tddcourse/read#fn-fn35)^
* [The Transformation Priority Premise](https://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html)^[3](https://leanpub.com/tddcourse/read#fn-fn32)^

# 10 Resolviendo la kata Prime Factors

## Enunciado de la kata

Nuestro objetivo será escribir un programa que descomponga un número natural en sus factores primos. Por simplicidad, no agruparemos los factores en forma de potencias. Eso lo dejaremos para un ejercicio posterior si te interesa avanzar un poco más.

## Lenguaje y enfoque

Esta kata la vamos a hacer en Javascript, con el *framework* de testing Jest. Crearemos una función `primeFactors`, a la que le pasamos el número que queremos descomponer y nos devolverá un array con los factores primos, ordenados de menor a mayor.

```

1 
var
 
primesOf18
 
=
 
primeFactors
(
18
);


2 
// -> [2, 3, 3]

```

## Definir la función

Nuestro primer test espera que exista la función `primefactors`:

```

1 
describe
(
'Calculate prime factors'
,
 
function
 
()
 
{


2 
  
it
 
(
'should exist'
,
 
()
 
=>
 
{


3 
   
expect
(
primefactors
())


4 
  
});


5 
});

```

Que ya sabemos que no ha sido definida todavía:

```

1 
ReferenceError
:
 
primefactors
 
is
 
not
 
defined

```

La introducimos sin más. De momento en el propio archivo del test:

```

1 
function
 
primefactors
()
 
{


2 
  

3 
}

```

Normalmente en este punto, una vez que hemos hecho pasar el test, la moveríamos a su propio archivo. En un ejercicio no es necesario, pero es un buen hábito.

De momento, no nos hemos comunicado con la función en el test, así que vamos a introducir esa idea, pasando un primer ejemplo de número para descomponer y el resultado que esperamos. Lo primero que nos debería llamar la atención es que debido a las peculiaridades de la definición y distribución de los números primos entre los números naturales, se nos presenta un orden muy intuitivo para organizar los ejemplos y escribir los tests. Casi nos basta con empezar con el número uno y avanzar progresivamente.

El uno, además, es un caso particular (no tiene factores primos), así que nos viene especialmente bien como primer test.

```

 1 
import
 
primefactors
 
from
 
"../src/primefactors"
;


 2 


 3 
describe
(
'Calculate prime factors'
,
 
function
 
()
 
{


 4 
  
it
 
(
'should exist'
,
 
()
 
=>
 
{


 5 
   
expect
(
primefactors
())


 6 
  
});


 7 


 8 
  
it
(
'1 should not have factors'
,
 
()
 
=>
 
{


 9 
    
expect
(
primefactors
(
1
)).
toEqual
([]);


10 
  
});


11 
});

```

Para hacer pasar el test necesitamos una implementación mínima de la función:

```

1 
function
 
primefactors
()
 
{


2 
  
return
 
[];


3 
}


4 


5 
export
 
default
 
primefactors
;

```

Fíjate que ni siquiera implementamos que la función recibe un parámetro. Vamos a hacer que sea el test quien nos lo pida. Mientras tanto, eliminamos el primer test, dado que ahora es redundante.

```

1 
import
 
primefactors
 
from
 
"../src/primefactors"
;


2 


3 
describe
(
'Calculate prime factors'
,
 
function
 
()
 
{


4 
  
it
(
'1 should not have factors'
,
 
()
 
=>
 
{


5 
    
expect
(
primefactors
(
1
)).
toEqual
([]);


6 
  
});


7 
});

```

## Definir la signatura de la función

El segundo test nos debería ayudar a definir la signatura de la función. Para ello necesitamos que sea un caso en el que esperemos una respuesta distinta de `[]`, lo cual podremos hacer si recibimos un parámetro que introduzca la variación necesaria. El 2 es un buen ejemplo para conseguir esto:

```

 1 
import
 
primefactors
 
from
 
"../src/primefactors"
;


 2 


 3 
describe
(
'Calculate prime factors'
,
 
function
 
()
 
{


 4 
  
it
(
'1 should not have factors'
,
 
()
 
=>
 
{


 5 
    
expect
(
primefactors
(
1
)).
toEqual
([]);


 6 
  
});


 7 


 8 
  
it
 
(
'2 is a prime number'
,
 
()
 
=>
 
{


 9 
    
expect
(
primefactors
(
2
)).
toEqual
([
2
])


10 
  
})


11 
});

```

Para resolver este caso necesitamos tener en cuenta el parámetro que define la función, lo que nos obliga a introducirlo y utilizarlo. En nuestra solución atendemos al caso que plantea el test anterior y hacemos una implementación obvia para poder pasar el test que acabamos de introducir. Estamos posponiendo la implementación del algoritmo hasta tener más información:

```

1 
function
 
primefactors
(
numberToDecompose
)
 
{


2 
  
if
 
(
numberToDecompose
 
===
 
1
)
 
{


3 
    
return
 
[];


4 
  
}


5 


6 
  
return
 
[
2
];


7 
}


8 


9 
export
 
default
 
primefactors
;

```

## Obteniendo más información sobre el problema

El siguiente caso que vamos a probar es a descomponer el número 3, que es primo como el número 2. Este test nos servirá para entender mejor cómo gestionar estos casos:

```

 1 
import
 
primefactors
 
from
 
"../src/primefactors"
;


 2 


 3 
describe
(
'Calculate prime factors'
,
 
function
 
()
 
{


 4 
  
it
(
'1 should not have factors'
,
 
()
 
=>
 
{


 5 
    
expect
(
primefactors
(
1
)).
toEqual
([]);


 6 
  
});


 7 


 8 
  
it
 
(
'2 is a prime number'
,
 
()
 
=>
 
{


 9 
    
expect
(
primefactors
(
2
)).
toEqual
([
2
])


10 
  
})


11 


12 
  
it
 
(
'3 is also a prime number'
,
 
()
 
=>
 
{


13 
    
expect
(
primefactors
(
3
)).
toEqual
([
3
])


14 
  
})


15 
});

```

Ahora que tenemos este test fallando, haremos una implementación obvia, como es devolver el propio número que pasamos. Puesto que es un número primo, es perfectamente correcto. No hay mucho más que rascar aquí.

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 
  
if
 
(
numberToDecompose
 
===
 
1
)
 
{


 3 
    
return
 
[];


 4 
  
}


 5 


 6 
  
return
 
[
numberToDecompose
];


 7 
 

 8 
}


 9 


10 
export
 
default
 
primefactors
;

```

## Introduciendo un test que no falla

En la presentación de la kata hemos dividido los casos en categorías. Repasemos:

* Casos límite o especiales, como el 1
* Números primos, como 2, 3 ó 5
* Números no primos, como 4, 6, 8

La primera categoría ya la hemos cubierto, puesto que no hay más casos límite que considerar.

La tercera categoría todavía no hemos empezado a tratarla y no hemos hecho tests con ningún ejemplo de ella.

La segunda categoría es la que hemos estado testeando hasta ahora. En este punto, podríamos seguir tomando ejemplos de esta categoría y probar nuevos casos. Pero, ¿qué pasaría? Veámoslo:

```

 1 
import
 
primefactors
 
from
 
"../src/primefactors"
;


 2 


 3 
describe
(
'Calculate prime factors'
,
 
function
 
()
 
{


 4 
  
it
(
'1 should not have factors'
,
 
()
 
=>
 
{


 5 
    
expect
(
primefactors
(
1
)).
toEqual
([]);


 6 
  
});


 7 


 8 
  
it
 
(
'2 is a prime number'
,
 
()
 
=>
 
{


 9 
    
expect
(
primefactors
(
2
)).
toEqual
([
2
])


10 
  
})


11 


12 
  
it
 
(
'3 is also a prime number'
,
 
()
 
=>
 
{


13 
    
expect
(
primefactors
(
3
)).
toEqual
([
3
])


14 
  
})


15 


16 
  
it
 
(
'5 is also a prime number'
,
 
()
 
=>
 
{


17 
    
expect
(
primefactors
(
5
)).
toEqual
([
5
])


18 
  
})


19 
  

20 
});

```

¡El test pasa sin implementar nada nuevo!

Era bastante obvio, ¿no? En este momento, el algoritmo, por llamarlo de algún modo, no hace nada más que considerar todos los números como primos. Por esta razón, si seguimos usando como ejemplos números primos, nada nos obligará a hacer cambios en la implementación.

Cuando añadimos un test que no falla significa que el algoritmo que estamos desarrollando ya es lo bastante general para resolver esa categoría de casos y, por tanto, es hora de pasar a otra categoría que todavía no pueda ser manejada con éxito. O, si ya hemos cubierto todas las categorías posibles, es que hemos terminado.

Empezaremos a utilizar ejemplos de la categoría de los números no primos. Pero igualmente vamos a refactorizar el test para ver estas categorías de forma más explícita:

```

 1 
import
 
primefactors
 
from
 
"../src/primefactors"
;


 2 


 3 
describe
(
'Calculate prime factors'
,
 
function
 
()
 
{


 4 
  
it
(
'1 should not have factors'
,
 
()
 
=>
 
{


 5 
    
expect
(
primefactors
(
1
)).
toEqual
([]);


 6 
  
});


 7 


 8 
  
it
 
(
'prime numbers cannot be decomposed'
,
 
()
 
=>
 
{


 9 
    
expect
(
primefactors
(
2
)).
toEqual
([
2
])


10 
    
expect
(
primefactors
(
3
)).
toEqual
([
3
])


11 
    
expect
(
primefactors
(
5
)).
toEqual
([
5
])


12 
  
})


13 
});

```

## Cuestionando nuestro algoritmo

El primer número no primo que tenemos es el 4, y es el más sencillo de todos por muchos motivos, así que hacemos un test que esta vez fallará:

```

 1 
import
 
primefactors
 
from
 
"../src/primefactors"
;


 2 


 3 
describe
(
'Calculate prime factors'
,
 
function
 
()
 
{


 4 
  
it
(
'1 should not have factors'
,
 
()
 
=>
 
{


 5 
    
expect
(
primefactors
(
1
)).
toEqual
([]);


 6 
  
});


 7 


 8 
  
it
 
(
'prime numbers cannot be decomposed'
,
 
()
 
=>
 
{


 9 
    
expect
(
primefactors
(
2
)).
toEqual
([
2
])


10 
    
expect
(
primefactors
(
3
)).
toEqual
([
3
])


11 
    
expect
(
primefactors
(
5
)).
toEqual
([
5
])


12 
  
})


13 


14 
  
it
 
(
'4 is 2 * 2'
,
 
()
 
=>
 
{


15 
    
expect
(
primefactors
(
4
)).
toEqual
([
2
,
 
2
])


16 
  
})


17 
});

```

Hay varias formas de plantear esta implementación. Por ejemplo, tenemos esta que es especialmente ingenua, pero eficaz:

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 
  
if
 
(
numberToDecompose
 
===
 
1
)
 
{


 3 
    
return
 
[];


 4 
  
}


 5 


 6 
  
if
 
(
numberToDecompose
 
===
 
4
)
 
{


 7 
    
return
 
[
2
,
 
2
];


 8 
  
}


 9 


10 
  
return
 
[
numberToDecompose
];


11 
}


12 


13 
export
 
default
 
primefactors
;

```

A pesar de lo simplona, es interesante. Nos ayuda a entender que tenemos que distinguir entre números primos y no primos para poder desarrollar el algoritmo.

Sin embargo, tiene una pinta muy deslavazada. Vamos a intentar organizarla un poco mejor:

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 
  
if
 
(
numberToDecompose
 
>
 
1
)
 
{


 3 
    
if
 
(
numberToDecompose
 
===
 
4
)
 
{


 4 
        
return
 
[
2
,
 
2
];


 5 
    
}


 6 
  

 7 
    
return
 
[
numberToDecompose
];


 8 
  
}


 9 


10 
  
return
 
[];


11 
}


12 


13 
export
 
default
 
primefactors
;

```

Básicamente dice: si un número es mayor que uno, intentamos descomponerlo. Si es cuatro, devolvemos su factorización y, si no, devolvemos el mismo número porque será primo. Lo que es cierto para los ejemplos que tenemos ahora mismo.

## Descubriendo los múltiplos de 2

El siguiente número que podemos descomponer es el 6. Una cosa buena de esta kata es que cada nuevo número no primo nos da una respuesta diferente y eso quiere decir que cada test nos aportará información. Helo aquí

```

 1 
import
 
primefactors
 
from
 
"../src/primefactors"
;


 2 


 3 
describe
(
'Calculate prime factors'
,
 
function
 
()
 
{


 4 
  
it
(
'1 should not have factors'
,
 
()
 
=>
 
{


 5 
    
expect
(
primefactors
(
1
)).
toEqual
([]);


 6 
  
});


 7 


 8 
  
it
 
(
'prime numbers cannot be decomposed'
,
 
()
 
=>
 
{


 9 
    
expect
(
primefactors
(
2
)).
toEqual
([
2
])


10 
    
expect
(
primefactors
(
3
)).
toEqual
([
3
])


11 
    
expect
(
primefactors
(
5
)).
toEqual
([
5
])


12 
  
})


13 


14 
  
it
 
(
'4 is 2 * 2'
,
 
()
 
=>
 
{


15 
    
expect
(
primefactors
(
4
)).
toEqual
([
2
,
 
2
])


16 
  
})


17 


18 
  
it
 
(
'6 is 2 * 3'
,
 
()
 
=>
 
{


19 
    
expect
(
primefactors
(
6
)).
toEqual
([
2
,
 
3
])


20 
  
})


21 
});

```

Vamos a empezar por la implementación ingenua:

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 
  
if
 
(
numberToDecompose
 
>
 
1
)
 
{


 3 
    
if
 
(
numberToDecompose
 
===
 
4
)
 
{


 4 
        
return
 
[
2
,
 
2
];


 5 
    
}


 6 
  

 7 
    
if
 
(
numberToDecompose
 
===
 
6
)
 
{


 8 
        
return
 
[
2
,
 
3
];


 9 
    
}


10 


11 
    
return
 
[
numberToDecompose
];


12 
  
}


13 


14 
  
return
 
[];


15 
}


16 


17 
export
 
default
 
primefactors
;

```

No hay nada de malo en hacerlo así. Al contrario, esta forma de resolver el problema nos empieza a poner de relieve regularidades. 4 y 6 son múltiplos de 2, por lo que queremos introducir ese conocimiento en forma de refactor. Y eso lo podemos hacer gracias a que tenemos tests que nos demuestran que la función ya los descompone correctamente. Así que vamos a modificar el código sin cambiar ese comportamiento que ya hemos definido con los tests.

Nuestro primer intento se basa en que el primer factor primo es 2 y es común. Es decir, podemos hacer un algoritmo que procese múltiplos de 2 y, de momento, asumimos que el número que queda como resto de la primera división por 2 es el segundo factor del compuesto, sea cual sea.

Para ello tenemos que introducir una variable de tipo array con la que entregar la respuesta, a la que le vamos añadiendo los factores que descubramos:

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 


 3 
  
let
 
factors
 
=
 
[];


 4 


 5 
  
if
 
(
numberToDecompose
 
>
 
1
)
 
{


 6 
    
if
 
(
numberToDecompose
 
===
 
4
)
 
{


 7 
        
factors
.
push
(
2
);


 8 
        
factors
.
push
(
2
);


 9 


10 
        
return
 
factors
;


11 
    
}


12 
  

13 
    
if
 
(
numberToDecompose
 
===
 
6
)
 
{


14 
        
factors
.
push
(
2
);


15 
        
factors
.
push
(
3
);


16 
        

17 
        
return
 
factors
;


18 
    
}


19 


20 
    
factors
.
push
(
numberToDecompose
);


21 
  
}


22 


23 
  
return
 
factors
;


24 
}


25 


26 
export
 
default
 
primefactors
;

```

Este ha sido un primer paso, ahora ya nos queda más claro cómo funcionaría y lo podemos generalizar, expresándolo así:

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 


 3 
  
let
 
factors
 
=
 
[];


 4 


 5 
  
if
 
(
numberToDecompose
 
>
 
1
)
 
{


 6 
    
if
 
(
numberToDecompose
 
%
 
2
 
===
 
0
)
 
{


 7 
        
factors
.
push
(
2
);


 8 
        
factors
.
push
(
Math
.
floor
(
numberToDecompose
/
2
));


 9 


10 
        
return
 
factors
;


11 
    
}


12 
  

13 
    
factors
.
push
(
numberToDecompose
);


14 
  
}


15 


16 
  
return
 
factors
;


17 
}


18 


19 
export
 
default
 
primefactors
;

```

Este refactor casi funciona, pero ha dejado de pasar el test del número 2. Arreglamos eso y avanzamos un paso más:

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 


 3 
  
let
 
factors
 
=
 
[];


 4 


 5 
  
if
 
(
numberToDecompose
 
>
 
1
)
 
{


 6 
    
if
 
(
numberToDecompose
 
%
 
2
 
===
 
0
 
&&
 
numberToDecompose
 
>
 
2
)
 
{


 7 
        
factors
.
push
(
2
);


 8 
        
numberToDecompose
 
=
 
Math
.
floor
(
numberToDecompose
/
2
);


 9 
    
}


10 
  

11 
    
factors
.
push
(
numberToDecompose
);


12 
  
}


13 


14 
  
return
 
factors
;


15 
}


16 


17 
export
 
default
 
primefactors
;

```

Esta nueva implementación hace pasar todos los tests y estamos listos para forzar un nuevo cambio.

## Introduciendo más factores

Dentro de los números no primos podríamos considerar varias agrupaciones a la hora de seleccionar ejemplos. Tenemos casos en que los números se descomponen en el producto de dos factores primos, y casos en los que se descomponen en el producto de 3 ó más factores. Esto viene a cuenta porque nuestros próximos ejemplos son 8 y 9. El 8 es 2 * 2 * 2, mientras que 9 es 3 * 3. El caso del 8 nos obliga a considerar los casos en que podemos descomponer un número en más de dos factores, y el del 9, aquellos casos en los que se introducen nuevos divisores.

En principio puede darnos igual empezar por cualquiera de los dos. Quizá la clave sea escoger el caso que te parezca más fácil de abordar. Aquí vamos a empezar por descomponer el número 8. De este modo, mantenemos el divisor 2 que, en este momento, nos parece algo más fácil de abordar.

Hagamos un test:

```

 1 
import
 
primefactors
 
from
 
"../src/primefactors"
;


 2 


 3 
describe
(
'Calculate prime factors'
,
 
function
 
()
 
{


 4 
  
it
(
'1 should not have factors'
,
 
()
 
=>
 
{


 5 
    
expect
(
primefactors
(
1
)).
toEqual
([]);


 6 
  
});


 7 


 8 
  
it
 
(
'prime numbers cannot be decomposed'
,
 
()
 
=>
 
{


 9 
    
expect
(
primefactors
(
2
)).
toEqual
([
2
])


10 
    
expect
(
primefactors
(
3
)).
toEqual
([
3
])


11 
    
expect
(
primefactors
(
5
)).
toEqual
([
5
])


12 
  
})


13 


14 
  
it
 
(
'4 is 2 * 2'
,
 
()
 
=>
 
{


15 
    
expect
(
primefactors
(
4
)).
toEqual
([
2
,
 
2
])


16 
  
})


17 


18 
  
it
 
(
'6 is 2 * 3'
,
 
()
 
=>
 
{


19 
    
expect
(
primefactors
(
6
)).
toEqual
([
2
,
 
3
])


20 
  
})


21 


22 
  
it
 
(
'8 is 2 * 2 * 2'
,
 
()
 
=>
 
{


23 
    
expect
(
primefactors
(
8
)).
toEqual
([
2
,
 
2
,
 
2
])


24 
  
})


25 
});

```

Para implementar tenemos que cambiar un `if` por un `while`. Es decir, tenemos que seguir dividiendo el número por 2 hasta que ya no podamos más:

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 


 3 
  
let
 
factors
 
=
 
[];


 4 


 5 
  
if
 
(
numberToDecompose
 
>
 
1
)
 
{


 6 
    
while
 
(
numberToDecompose
 
%
 
2
 
===
 
0
 
&&
 
numberToDecompose
 
>
 
2
)
 
{


 7 
        
factors
.
push
(
2
);


 8 
        
numberToDecompose
 
=
 
Math
.
floor
(
numberToDecompose
/
2
);


 9 
    
}


10 
  

11 
    
factors
.
push
(
numberToDecompose
);


12 
  
}


13 


14 
  
return
 
factors
;


15 
}


16 


17 
export
 
default
 
primefactors
;

```

Este cambio es muy espectacular porque es muy pequeño y muy potente. Aplicándolo podemos descomponer cualquier número que sea potencia de 2, ni más ni menos. Pero no es éste el objetivo final, sino que queremos descomponer cualquier número y para eso tenemos que poder introducir nuevos divisores.

## Nuevos divisores

En este punto necesitamos un ejemplo que nos obligue a introducir nuevos divisores. Antes hemos dejado aparcado el 9, y ahora nos toca retomarlo. El 9 es un buen ejemplo porque es múltiplo de 3, sin serlo de 2. Vamos a hacer un test que sabemos que fallará:

```

 1 
import
 
primefactors
 
from
 
"../src/primefactors"
;


 2 


 3 
describe
(
'Calculate prime factors'
,
 
function
 
()
 
{


 4 
  
it
(
'1 should not have factors'
,
 
()
 
=>
 
{


 5 
    
expect
(
primefactors
(
1
)).
toEqual
([]);


 6 
  
});


 7 


 8 
  
it
 
(
'prime numbers cannot be decomposed'
,
 
()
 
=>
 
{


 9 
    
expect
(
primefactors
(
2
)).
toEqual
([
2
])


10 
    
expect
(
primefactors
(
3
)).
toEqual
([
3
])


11 
    
expect
(
primefactors
(
5
)).
toEqual
([
5
])


12 
  
})


13 


14 
  
it
 
(
'4 is 2 * 2'
,
 
()
 
=>
 
{


15 
    
expect
(
primefactors
(
4
)).
toEqual
([
2
,
 
2
])


16 
  
})


17 


18 
  
it
 
(
'6 is 2 * 3'
,
 
()
 
=>
 
{


19 
    
expect
(
primefactors
(
6
)).
toEqual
([
2
,
 
3
])


20 
  
})


21 


22 
  
it
 
(
'8 is 2 * 2 * 2'
,
 
()
 
=>
 
{


23 
    
expect
(
primefactors
(
8
)).
toEqual
([
2
,
 
2
,
 
2
])


24 
  
})


25 


26 
  
it
 
(
'9 is 3 * 3'
,
 
()
 
=>
 
{


27 
    
expect
(
primefactors
(
9
)).
toEqual
([
3
,
 
3
])


28 
  
})


29 
});

```

De nuevo, empecemos con una implementación muy ingenua, pero que funciona. Lo importante es que el test pase, prueba de que hemos implementado el comportamiento.

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 


 3 
  
let
 
factors
 
=
 
[];


 4 


 5 
  
if
 
(
numberToDecompose
 
>
 
1
)
 
{


 6 
    
while
 
(
numberToDecompose
 
%
 
2
 
===
 
0
 
&&
 
numberToDecompose
 
>
 
2
)
 
{


 7 
        
factors
.
push
(
2
);


 8 
        
numberToDecompose
 
=
 
Math
.
floor
(
numberToDecompose
/
2
);


 9 
    
}


10 


11 
    
while
 
(
numberToDecompose
 
%
 
3
 
===
 
0
 
&&
 
numberToDecompose
 
>
 
3
)
 
{


12 
        
factors
.
push
(
3
);


13 
        
numberToDecompose
 
=
 
Math
.
floor
(
numberToDecompose
 
/
 
3
);


14 
    
}


15 
  

16 
    
factors
.
push
(
numberToDecompose
);


17 
  
}


18 


19 
  
return
 
factors
;


20 
}


21 


22 
export
 
default
 
primefactors
;

```

Con el código anterior, todos los tests están en verde. En este punto parece claro que cada nuevo divisor que queramos introducir, como el 5, necesitará una repetición del bloque así que vamos a refactorizar a una solución general.

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 


 3 
  
let
 
factors
 
=
 
[];


 4 


 5 
  
let
 
divisor
 
=
 
2
;


 6 


 7 
  
while
 
(
numberToDecompose
 
>
 
1
)
 
{


 8 
    
while
 
(
numberToDecompose
 
%
 
divisor
 
===
 
0
)
 
{


 9 
        
factors
.
push
(
divisor
);


10 
        
numberToDecompose
 
=
 
Math
.
floor
(
numberToDecompose
 
/
 
divisor
);


11 
    
}


12 
    
divisor
++
;


13 
  
}


14 


15 
  
return
 
factors
;


16 
}


17 


18 
export
 
default
 
primefactors
;

```

Este algoritmo tiene pinta de ser bastante general. Así que probemos un par de casos:

```

 1 
import
 
primefactors
 
from
 
"../src/primefactors"
;


 2 


 3 
describe
(
'Calculate prime factors'
,
 
function
 
()
 
{


 4 
  
it
(
'1 should not have factors'
,
 
()
 
=>
 
{


 5 
    
expect
(
primefactors
(
1
)).
toEqual
([]);


 6 
  
});


 7 


 8 
  
it
 
(
'2 is a prime number'
,
 
()
 
=>
 
{


 9 
    
expect
(
primefactors
(
2
)).
toEqual
([
2
])


10 
  
})


11 


12 
  
it
 
(
'3 is also a prime number'
,
 
()
 
=>
 
{


13 
    
expect
(
primefactors
(
3
)).
toEqual
([
3
])


14 
  
})


15 


16 
  
it
 
(
'4 is 2 * 2'
,
 
()
 
=>
 
{


17 
    
expect
(
primefactors
(
4
)).
toEqual
([
2
,
 
2
])


18 
  
})


19 
  

20 
  
it
 
(
'6 is 2 * 3'
,
 
()
 
=>
 
{


21 
    
expect
(
primefactors
(
6
)).
toEqual
([
2
,
 
3
])


22 
  
})


23 


24 
  
it
 
(
'8 is 2 * 2 * 2'
,
 
()
 
=>
 
{


25 
    
expect
(
primefactors
(
8
)).
toEqual
([
2
,
 
2
,
 
2
])


26 
  
})


27 


28 
  
it
 
(
'9 is 3 * 3'
,
 
()
 
=>
 
{


29 
    
expect
(
primefactors
(
9
)).
toEqual
([
3
,
 
3
])


30 
  
})


31 


32 
  
it
 
(
'10 is 2 * 5'
,
 
()
 
=>
 
{


33 
    
expect
(
primefactors
(
10
)).
toEqual
([
2
,
 
5
])


34 
  
})


35 
    

36 
  
it
 
(
'12 is 2 * 2 * 3'
,
 
()
 
=>
 
{


37 
    
expect
(
primefactors
(
12
)).
toEqual
([
2
,
 
2
,
 
3
])


38 
  
})


39 
});

```

Hemos añadido dos tests que pasan. Por lo que parece, hemos resuelto el problema. Pero, ¿no te queda la sensación de haber saltado demasiado en este último paso?

## El camino más corto no siempre es el más rápido

El camino de desarrollo en TDD no siempre es fácil. El siguiente test a veces es bastante evidente y otras veces tenemos varias alternativas. Escoger mal el camino nos puede llevar a un callejón sin salida o, como en este caso, a un punto en que tengamos que implementar mucho de golpe. Y como hemos visto, los cambios que añadamos al código de producción deberían ser lo más pequeños posibles.

En el sexto test optamos por explorar la vía de las repeticiones del mismo factor en lugar de forzar que aparecieran otros factores primos. ¿Hubiera sido mejor seguir esta ramificación del problema? Probémoslo, rebobinamos y volvemos a la situación antes del sexto test.

## Introduciendo nuevos factores, segundo intento

Esta es la versión del código de producción en la que estábamos al llegar al sexto test:

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 


 3 
  
let
 
factors
 
=
 
[];


 4 


 5 
  
if
 
(
numberToDecompose
 
%
 
2
 
===
 
0
)
 
{


 6 
    
factors
.
push
(
2
);


 7 
    
numberToDecompose
 
=
 
Math
.
floor
(
numberToDecompose
 
/
 
2
);


 8 
  
}


 9 
  

10 
  
if
 
(
numberToDecompose
 
>
 
1
)
 
{


11 
    
factors
.
push
(
numberToDecompose
);


12 
  
}


13 


14 
  
return
 
factors
;


15 
}


16 


17 
export
 
default
 
primefactors
;

```

Ahora sigamos por la otra ruta:

```

 1 
import
 
primefactors
 
from
 
"../src/primefactors"
;


 2 


 3 
describe
(
'Calculate prime factors'
,
 
function
 
()
 
{


 4 
  
it
(
'1 should not have factors'
,
 
()
 
=>
 
{


 5 
    
expect
(
primefactors
(
1
)).
toEqual
([]);


 6 
  
});


 7 


 8 
  
it
 
(
'prime numbers cannot be decomposed'
,
 
()
 
=>
 
{


 9 
    
expect
(
primefactors
(
2
)).
toEqual
([
2
])


10 
    
expect
(
primefactors
(
3
)).
toEqual
([
3
])


11 
    
expect
(
primefactors
(
5
)).
toEqual
([
5
])


12 
  
})


13 


14 
  
it
 
(
'4 is 2 * 2'
,
 
()
 
=>
 
{


15 
    
expect
(
primefactors
(
4
)).
toEqual
([
2
,
 
2
])


16 
  
})


17 


18 
  
it
 
(
'6 is 2 * 3'
,
 
()
 
=>
 
{


19 
    
expect
(
primefactors
(
6
)).
toEqual
([
2
,
 
3
])


20 
  
})


21 
  

22 
  
it
 
(
'9 is 3 * 3'
,
 
()
 
=>
 
{


23 
    
expect
(
primefactors
(
9
)).
toEqual
([
3
,
 
3
])


24 
  
})


25 
});

```

El siguiente código de producción nos permite pasar el nuevo test y todos los anteriores:

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 


 3 
  
let
 
factors
 
=
 
[];


 4 


 5 
  
if
 
(
numberToDecompose
 
%
 
2
 
===
 
0
)
 
{


 6 
    
factors
.
push
(
2
);


 7 
    
numberToDecompose
 
=
 
Math
.
floor
(
numberToDecompose
 
/
 
2
);


 8 
  
}


 9 


10 
  
if
 
(
numberToDecompose
 
%
 
3
 
===
 
0
)
 
{


11 
    
factors
.
push
(
3
);


12 
    
numberToDecompose
 
=
 
Math
.
floor
(
numberToDecompose
 
/
 
3
);


13 
  
}


14 
  

15 
  
if
 
(
numberToDecompose
 
>
 
1
)
 
{


16 
    
factors
.
push
(
numberToDecompose
);


17 
  
}


18 


19 
  
return
 
factors
;


20 
}


21 


22 
export
 
default
 
primefactors
;

```

Ahora podríamos refactorizar:

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 


 3 
  
let
 
factors
 
=
 
[];


 4 


 5 
  
let
 
divisor
 
=
 
2
;


 6 


 7 
  
while
 
(
divisor
 
<
 
numberToDecompose
)
 
{


 8 
    
if
 
(
numberToDecompose
 
%
 
divisor
 
===
 
0
)
 
{


 9 
        
factors
.
push
(
divisor
);


10 
        
numberToDecompose
 
=
 
Math
.
floor
(
numberToDecompose
 
/
 
divisor
);


11 
    
}


12 
    
divisor
++
;


13 
  
}


14 
  

15 
  
if
 
(
numberToDecompose
 
>
 
1
)
 
{


16 
    
factors
.
push
(
numberToDecompose
);


17 
  
}


18 
  

19 
  
return
 
factors
;


20 
}


21 


22 
export
 
default
 
primefactors
;

```

## Más de dos factores

Para introducir más de dos factores necesitamos un test:

```

 1 
import
 
primefactors
 
from
 
"../src/primefactors"
;


 2 


 3 
describe
(
'Calculate prime factors'
,
 
function
 
()
 
{


 4 
  
it
(
'1 should not have factors'
,
 
()
 
=>
 
{


 5 
    
expect
(
primefactors
(
1
)).
toEqual
([]);


 6 
  
});


 7 


 8 
  
it
 
(
'prime numbers cannot be decomposed'
,
 
()
 
=>
 
{


 9 
    
expect
(
primefactors
(
2
)).
toEqual
([
2
])


10 
    
expect
(
primefactors
(
3
)).
toEqual
([
3
])


11 
    
expect
(
primefactors
(
5
)).
toEqual
([
5
])


12 
  
})


13 


14 
  
it
 
(
'4 is 2 * 2'
,
 
()
 
=>
 
{


15 
    
expect
(
primefactors
(
4
)).
toEqual
([
2
,
 
2
])


16 
  
})


17 


18 
  
it
 
(
'6 is 2 * 3'
,
 
()
 
=>
 
{


19 
    
expect
(
primefactors
(
6
)).
toEqual
([
2
,
 
3
])


20 
  
})


21 


22 
  
it
 
(
'9 is 3 * 3'
,
 
()
 
=>
 
{


23 
    
expect
(
primefactors
(
9
)).
toEqual
([
3
,
 
3
])


24 
  
})


25 


26 
  
it
 
(
'8 is 2 * 2 * 2'
,
 
()
 
=>
 
{


27 
    
expect
(
primefactors
(
8
)).
toEqual
([
2
,
 
2
,
 
2
])


28 
  
})


29 
});

```

El cambio necesario es sencillo:

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 


 3 
  
let
 
factors
 
=
 
[];


 4 


 5 
  
let
 
divisor
 
=
 
2
;


 6 


 7 
  
while
 
(
divisor
 
<
 
numberToDecompose
)
 
{


 8 
    
while
 
(
numberToDecompose
 
%
 
divisor
 
===
 
0
)
 
{


 9 
        
factors
.
push
(
divisor
);


10 
        
numberToDecompose
 
=
 
Math
.
floor
(
numberToDecompose
 
/
 
divisor
);


11 
    
}


12 
    
divisor
++
;


13 
  
}


14 
  

15 
  
if
 
(
numberToDecompose
 
>
 
1
)
 
{


16 
    
factors
.
push
(
numberToDecompose
);


17 
  
}


18 
  

19 
  
return
 
factors
;


20 
}


21 


22 
export
 
default
 
primefactors
;

```

Y podemos librarnos del último `if` puesto que queda cubierto por el while que acabamos de introducir:

```

 1 
function
 
primefactors
(
numberToDecompose
)
 
{


 2 


 3 
  
let
 
factors
 
=
 
[];


 4 


 5 
  
let
 
divisor
 
=
 
2
;


 6 


 7 
  
while
 
(
divisor
 
<=
 
numberToDecompose
)
 
{


 8 
    
while
 
(
numberToDecompose
 
%
 
divisor
 
===
 
0
)
 
{


 9 
        
factors
.
push
(
divisor
);


10 
        
numberToDecompose
 
=
 
Math
.
floor
(
numberToDecompose
 
/
 
divisor
);


11 
    
}


12 
    
divisor
++
;


13 
  
}


14 
  

15 
  
return
 
factors
;


16 
}


17 


18 
export
 
default
 
primefactors
;

```

Si añadimos nuevos tests veremos que podemos factorizar cualquier número sin problemas. Es decir, con este último cambio y su refactor hemos terminado el desarrollo de la clase. ¿Ha sido mejor este camino? En parte sí. Hemos llegado a un algoritmo casi idéntico, pero diría que el recorrido ha sido más suave, los saltos de código de producción menos pronunciados y todo ha ido mejor hilado.

## ¿Tenemos criterios para elegir buenos ejemplos?

Desde el punto de vista de QA tradicional existen una serie de métodos para elegir los casos de test. Sin embargo, estos métodos no son necesariamente aplicables en TDD. Recuerda cómo empezábamos este libro: QA y TDD no son lo mismo pese a usar las mismas herramientas y solaparse mucho ambas disciplinas. TDD es una metodología para guiar el desarrollo de software y los tests más adecuados para hacerlo pueden ser sutilmente diferentes de los que usaríamos para verificar el funcionamiento de un software.

Por ejemplo, la categorización que hemos hecho de los números en primos y no primos puede ser más que suficiente en QA, pero en TDD los casos de números no primos podrían subdividirse:

* Potencias de un factor primo, como el 4, el 8 o el 9, que implican un único primo multiplicado varias veces por sí mismo.
* Producto de diferentes primos, como el 6, el 10, que implican varios números primos.
* Productos de n factores primos, con n mayor que dos.

Cada una de estas categorías nos fuerza a implementar distintas partes del algoritmo, lo que puede plantearnos problemas más o menos fáciles de resolver. Incluso, una mala elección podría llevarnos a un callejón sin salida.

Sin embargo, nada nos impide volver atrás si nos quedamos estancados. Cuando tengamos una duda razonable de si tomar un curso u otro en TDD, lo mejor es tomar nota de cuál es el estado del desarrollo y ese punto, marcándolo como un punto de retorno en caso de que nos metamos en algún cenagal de código. Marcha atrás y pensar de nuevo. Haberse equivocado es también información.

## Qué hemos aprendido con esta kata

* Con esta kata hemos aprendido cómo a medida que añadimos tests y estos son más específicos, el algoritmo se hace más general
* También hemos visto que obtenemos mejores resultados priorizando las transformaciones (cambios en el código de producción) más sencillas

# 11 La elección del primer test

En TDD la elección del primer test es un problema interesante. En algunos trabajos y tutoriales sobre TDD se suele hablar del “caso más sencillo” y ahí se queda la recomendación. Pero en realidad deberíamos acostumbrarnos a buscar el test más pequeño que pueda fallar, que suele ser una cosa muy distinta.

Con todo, no parece una definición muy práctica, así que posiblemente merece una explicación más detenida. ¿Hay una forma más o menos objetiva de decidir cuál es el test mínimo que pueda fallar?

## A la búsqueda del primer test más sencillo que pueda fallar

Supongamos la kata Roman Numerals. Consiste en crear una convertidor entre números decimales y romanos. Decidimos que la clase va a ser `RomanNumeralsConverter` y la función se llama `toRoman`, de modo que se utilizaría más o menos así:

```

1 
$roman
 
=
 
$romanNumeralsConverter
->
toRoman
(
54
)

```

Según el enfoque del “caso más sencillo” podríamos hacer un test más o menos como éste:

```

1 
public
 
function
 
testShouldConvertOne
()
:
 
void


2 
{


3 
  
$converter
 
=
 
new
 
RomanNumeralsConverter
();


4 
  

5 
  
$this
->
assertEquals
(
"I"
,
 
$converter
->
toRoman
(
1
));


6 
}

```

Parece correcto, ¿verdad? Sin embargo, éste no es el test más sencillo que pueda fallar. En realidad hay como mínimo dos aún más sencillos que pueden fallar y ambos nos forzarán a crear código de producción.

– Pensemos un momento sobre el test que acabamos de escribir: ¿qué ocurrirá si lo ejecutamos.

– Fallará.

– Pero, ¿por qué fallará?

– Obvio: porque ni siquiera tenemos la clase definida. Al intentar ejecutar el test, no encuentra la clase.

– ¿Podemos decir que el test falla por la razón que esperamos que falle?

– Humm. ¿Qué quieres decir?

– Quiero decir que el test establece que esperamos que pueda convertir el decimal 1 en el romano I. Debería fallar porque no hace la conversión, no porque no encuentre la clase. En realidad el test puede fallar por, como mínimo, tres causas: que la clase no exista, que la clase no tenga el método `toRoman` y que no devuelva el resultado “I”. Y sólo debería fallar por una.

– ¿Me estás diciendo que el primer test debería ser simplemente instanciar la clase?

– Sí.

– ¿Y qué sentido tiene?

– Que el test, al fallar, sólo puede fallar por la razón que esperamos que falle.

– Tengo que pensar en eso un momento.

– Sin problema. Te espero en el párrafo siguiente.

Esta es la cuestión. Para ser el caso más sencillo, este primer test puede fallar por tres motivos diferentes que consideramos como que el test no pasa (recuerda, la segunda ley: no compilar es fallar), por tanto, deberíamos reducirlo para que sólo falle por una causa.

Como nota al margen: es cierto que podría fallar por otras muchas causas, como equivocarnos de nombre al escribir, poner la clase en el namespace incorrecto, etc. Asumimos que esos errores son involuntarios. Además, al ejecutar el test nos dirá el error. De ahí la importancia de lanzar los tests, ver cómo fallan y asegurarnos de que fallan como es debido.

Vayamos más despacio, entonces.

El primer test sólo debería pedir que exista la clase y se pueda instanciar.

```

1 
public
 
function
 
testShouldInstantiate
()
:
 
void


2 
{


3 
  
$this
->
expectNotToPerformAssertions
();


4 
  

5 
  
new
 
RomanNumeralsConverter
();


6 
}

```

En PHPUnit un test sin aserciones falla o al menos se considera  *risky* . Para hacer que pase claramente especificamos que no vamos a realizar aserciones. En otros lenguajes esto es innecesario.

Para pasar el test tengo que crear la clase. Una vez creada veré que el test pasa y entonces podré afrontar el siguiente paso.

El segundo test debería obligarme a definir el método deseado en la clase, aunque todavía no sepamos qué hacer con él o qué parámetros necesitará.

```

1 
public
 
function
 
testShouldBeAbleToConvertToRoman
()
:
 
void


2 
{


3 
  
$this
->
expectNotToPerformAssertions
();


4 
  

5 
  
$converter
 
=
 
new
 
RomanNumeralsConverter
();


6 
  
$converter
->
toRoman
();


7 
}

```

De nuevo, este test es un poco especial en PHP. Por ejemplo, en PHP y otros lenguajes podemos ignorar el retorno de un método si no está tipado. Otros lenguajes nos exigirán tipar el método de manera explícita, cosa que en este paso podría hacerse con `void` para que no devuelva nada. Otra estrategia sería devolver un valor vacío del tipo adecuado (en este caso `string`). Hay lenguajes, por su parte, que requieren que se use el resultado del método si es que se devuelve, pero también permiten ignorarlo.

Un asunto interesante es que una vez que hemos hecho pasar este segundo test, el primero es redundante: el caso está cubierto por este segundo test y si un cambio en el código lo hace fallar, el segundo test fallará también. En la fase de refactor puedes borrarlo.

Y es ahora cuando el “caso más sencillo” tiene sentido porque este test, tras los anteriores fallará por la razón adecuada:

```

1 
public
 
function
 
testShouldConvertOne
()
:
 
void


2 
{


3 
  
$converter
 
=
 
new
 
RomanNumeralsConverter
();


4 
  

5 
  
$this
->
assertEquals
(
"I"
,
 
$converter
->
toRoman
(
1
));


6 
}

```

Este ya es un test que fallaría por la razón esperada: la clase no tiene nada definido que realice la conversión.

De nuevo, una vez hagas pasar este test y estés en fase de refactor, el anterior puedes borrarlo. Ha cumplido su función de forzarnos a añadir un cambio en el código. Además, en caso de que ese segundo test falle por un cambio en el código, nuestro test actual también fallará. Por tanto, puedes borrarlo también.

Supongo que ahora te haces dos preguntas:

* Por qué hacer tres tests para quedarme con el que había pensado al principio
* Por qué puedo borrar esos tests

Vayamos por partes, entonces.

### Por qué empezar con pasos tan pequeños

Un test sólo debería tener una razón para fallar. Imagínalo como una aplicación del Single Responsibility Principle. Si un test tiene más de una razón para fallar lo más posible es que estemos queriendo hacer que un test provoque muchos cambios a la vez en el código.

Es cierto que en testing existe una técnica llamada **triangulación** en la que justamente se verifican varios posibles aspectos que deben ocurrir juntos para considerar que el test pasa o falla. Pero, como hemos dicho al principio del libro TDD no es QA, por lo que no son aplicables las mismas técnicas.

En TDD lo que queremos es que los tests nos digan cuál es el cambio que tenemos que producir en el software y éste cambio debería ser lo más pequeño posible y lo menos ambiguo posible.

Cuando no tenemos nada de código de producción escrito, lo más pequeño que podemos hacer es crear un archivo en el que se defina la función o clase que estamos desarrollando. Es el primer paso. Y aún así, hay posibilidades de que no lo hagamos correctamente:

* nos equivocamos en el nombre del archivo
* nos equivocamos en su ubicación en el proyecto
* nos equivocamos al teclear el nombre de la clase o función
* nos equivocamos al situarla en un name space
* …

Tenemos que evitar todos estos problemas sólo para conseguir instanciar una clase o poder usar una función, pero ese test mínimo fallará si pasa cualquiera de esas cosas. Al corregir todas las que puedan suceder haremos que el test pase.

Sin embargo, si el test puede fallar por más razones, se multiplicarán las potenciales fuentes de errores porque hay que hacer más cosas para hacerlo pasar. Además, algunas de ellas pueden depender y entremezclarse entre sí. En general, el cambio necesario en el código de producción será demasiado grande con el test en rojo y, por tanto, hacerlo pasar a verde será más costoso y menos obvio.

### Por qué borrar estos primeros tests

En TDD muchos tests son redundantes. Desde el punto de vista de QA en TDD se testea demasiado. En primer lugar, porque muchas veces se utilizan varios ejemplos de la misma clase, precisamente para encontrar la regla general que caracteriza a esa clase. Por otro lado, hay tests que hacemos en TDD que están incluidos en otros.

Es el caso de estos primeros tests que hemos mostrado hace un momento.

El test que nos fuerza a definir la unidad de software por primera vez está incluido en cualquier otro test que podamos imaginar por la simple razón de que para que se puedan ejecutar esos otros tests necesitamos la clase. Dicho de otro modo, si falla el primer test, fallarán todos los demás.

En esta situación el test es redundante y lo podemos borrar.

No siempre es fácil identificar tests redundantes. En algunas etapas de TDD usamos ejemplos de la misma clase para mover el desarrollo, con lo cual puede llegar un punto en que algunos de esos tests sean redundantes y podamos borrarlos por innecesarios.

Por otro lado, otra posibilidad es refactorizar los tests con data providers o técnicas similares con las que abaratar la creación de nuevos ejemplos.

## La felicidad de los *paths*

### *Happy path testing*

Denominamos *happy path* al flujo de un programa cuando no se producen problemas y puede ejecutar el algoritmo completo. El *happy path* ocurre cuando los datos de entrada son válidos y no se generan errores en el proceso porque todos los datos manejados están en sus rangos de valores aceptables y no se producen otros fallos que puedan afectar a la unidad de software que estamos desarrollando.

El *happy path testing* en TDD consiste en escoger ejemplos que deberían dar como resultado valores predecibles, sobre los que podemos testear. Por ejemplo, en la kata Roman Numerals, un ejemplo de test de *happy path* sería:

```

1 
public
 
function
 
testShouldConvertFour
()
:
 
void


2 
{


3 
  
$converter
 
=
 
new
 
RomanNumeralsConverter
();


4 
  

5 
  
$this
->
assertEquals
(
"IV"
,
 
$converter
->
toRoman
(
4
));


6 
}

```

Con mucha frecuencia en las katas trabajamos con tests de  *happy path* . Esto es así porque nos interesa centrarnos en el desarrollo del algoritmo y que el ejercicio no dure demasiado tiempo.

### *Sad path testing*

Por el contrario, los *sad paths* son aquellos flujos del programa que terminan mal. Cuando decimos que terminan mal queremos decir que se produce un error y no se puede terminar de ejecutar el algoritmo.

Sin embargo, los errores y la forma en la que el código de producción se enfrenta a ellos, forman parte del comportamiento del software y en el trabajo real merecen ser considerados al utilizar la metodología TDD.

En ese sentido, el *sad path testing* sería justamente la elección de casos de tests que describen situaciones en las que el código de producción tiene que manejar datos de entrada incorrectos o respuestas de sus colaboradores que debemos tratar también. Un ejemplo de esto sería algo así:

```

1 
public
 
function
 
testShouldFailWithInvalidInput
()
:
 
void


2 
{


3 
  
$converter
 
=
 
new
 
RomanNumeralsConverter
();


4 
  

5 
  
$this
->
expectException
(
InvalidInput
::
class
);


6 
  
$converter
->
toRoman
(
-
12.34
);


7 
}

```

Esto es: nuestro convertidor de números romanos no puede manejar números negativos ni números con decimales y, por tanto, en un programa real tendríamos que gestionar esta situación. En el ejemplo, la consecuencia es lanzar una excepción. Pero podría ser cualquier otra forma de reacción que nos convenga para los propósitos de la aplicación.

```

1 
public
 
function
 
testShouldFailWithInvalidInput
()
:
 
void


2 
{


3 
  
$converter
 
=
 
new
 
RomanNumeralsConverter
();


4 
  

5 
  
$this
->
assertEquals
(
'Non possum hic numerus converto'
,
 
$converter
->
toRoman
(
-
12.34
));


6 
}

```

# 12 NIF

## Comienza por los *sad paths* y aplaza las soluciones

Esta kata consiste originalmente en crear un *Value Object* para representar el NIF, o número de identificación fiscal español. Su forma habitual es una cadena de ocho caracteres numéricos y una letra de control, que nos ayuda a asegurar su validez.

Al tratarse de un *Value Object* queremos poder instanciarlo a partir de un `string` y garantizar que sea válido para poder utilizarlo sin problemas en cualquier lugar del código de una aplicación.

Una de las dificultades para desarrollar este tipo de objetos en TDD es que a veces no necesitan implementar comportamientos significativos y es más importante asegurarse de que se crean consistentes.

El algoritmo para validarlo es relativamente sencillo, como veremos, pero el interés está sobre todo en cómo librarnos de todas las cadenas de caracteres que no pueden formar un NIF válido.

## Historia

Esta kata es original y surgió por casualidad al preparar un pequeño taller de introducción a TDD y *live coding* acerca de los beneficios de utilizar la metodología en el trabajo cotidiano.

Al profundizar en este ejemplo se fueron poniendo de manifiesto dos cuestiones que resultan muy interesantes:

* Empezar por tests que descarten los casos inválidos nos permite evitar atacar el desarrollo del algoritmo nada más empezar, quitándolos de en medio y reduciendo el espacio del problema. La consecuencia es que acabamos desarrollando objetos más resilientes, con algoritmos más limpios y contribuye a prevenir la aparición de bugs en el código de producción.
* Se pone de manifiesto el mecanismo de aplazar la solución de cada problema hasta el siguiente test. Es decir: para hacer que cada nuevo test pase, introducimos una implementación inflexible que nos permita cumplir ese test, pero para que los anteriores sigan pasando nos vemos obligados a refactorizar el código que ya teníamos antes.

## Enunciado

Crear un clase `Nif`, que será un *Value Object* para representar el Número de Identificación Fiscal de España. Este número es una cadena de ocho caracteres numéricos, con una letra final que actúa como carácter de control.

Esta letra de control se obtiene calculando el resto de dividir la parte numérica del NIF entre 23 (mod 23). El resultado nos indica la fila en la que consultar la letra de control de la siguiente tabla:


| Resto | Letra |
| ------- | ------- |
| 0     | T     |
| 1     | R     |
| 2     | W     |
| 3     | A     |
| 4     | G     |
| 5     | M     |
| 6     | Y     |
| 7     | F     |
| 8     | P     |
| 9     | D     |
| 10    | X     |
| 11    | B     |
| 12    | N     |
| 13    | J     |
| 14    | Z     |
| 15    | S     |
| 16    | Q     |
| 17    | V     |
| 18    | H     |
| 19    | L     |
| 20    | C     |
| 21    | K     |
| 22    | E     |

Existe un caso especial de NIF que es el NIE o Número de Identificación para Extranjeros. En este caso, el primer carácter será una letra X, Y ó Z. Para el cálculo del mod 23 se reemplazan por los valores 0, 1 y 2, respectivamente.

## Orientaciones para resolverla

Esta kata nos puede aportar varios aprendizajes tanto de TDD como de tipos de datos y validación.

En las katas es habitual obviar temas como la validación de datos para simplificar el ejercicio y centrarnos en el desarrollo del algoritmo. En un desarrollo real no podemos hacer esto, sino justamente poner mucho énfasis en validar los datos a distintos niveles, tanto por razones de seguridad como para evitar errores en los cálculos.

Así que hemos incluido esta kata precisamente para practicar cómo desarrollar mediante TDD algoritmos que primero gestionan todos los valores que no pueden manejar tanto desde el punto de vista estructural como de dominio.

En concreto este ejemplo se baja en el hecho de que el comportamiento efectivo del constructor que vamos a crear es asignar el valor que le pasamos. Todo lo demás que hace es comprobar que ese valor es adecuado para eso, por lo que actúa como barrera de valores indeseados.

Al tratarse de un *Value Object* intentaremos crear una clase a la que se le pasa la cadena candidata en el constructor. Si la cadena resulta ser inválida para un NIF el constructor lanzará una excepción, impidiendo que se puedan instanciar objetos con valores inadecuados. Fundamentalmente, nuestros primeros tests esperarán excepciones o errores.

De todas las infinitas cadenas que podría recibir este constructor sólo unas pocas serán NIF válidos, por lo que nuestro primer objetivo podría ser eliminar las más obvias: las que nunca podrían serlo porque tienen el número de caracteres inadecuado.

En una segunda fase, buscaremos controlar aquellas que no podrían nunca ser un NIF por su estructura, básicamente porque no siguen el esquema de ocho caracteres numéricos y una letra final, teniendo en cuanta la excepción de los NIE, que sí podrían tener una letra al principio.

Con esto tendríamos todo preparado para implementar el algoritmo de validación ya que sólo tendríamos que manejar `strings` que estructuralmente podrían ser NIF.

Una cosa que los pasos anteriores nos garantizan es que los tests no empezarán a fallar cuando introduzcamos el algoritmo ya que sus ejemplos **nunca** podrían ser válidos. Si comenzásemos usando `string` que estructuralmente podrían ser NIFs, aunque los hayamos escrito al azar, podríamos encontrarnos con alguno que casualmente fuese válido y al implementar la parte correspondiente del algoritmo ese test fallaría por la razón equivocada.

## Enlaces de interés sobre la kata

* [La kata del NIF para aprender TDD](https://franiglesias.github.io/iniciacion-tdd/)^[1](https://leanpub.com/tddcourse/read#fn-fn36)^

# 13 Resolviendo la Kata NIF

En este kata vamos a orientarnos en una estrategia que aborde primero los  *sad paths* , es decir, vamos a tratar primero los casos que provocarían un error. De este modo, primero desarrollaremos la validación de la estructura del input, para pasar después al del algoritmo.

Es habitual que las katas obvien temas como las validaciones, pero en este caso hemos preferido hacer un ejemplo que es más realista, en el sentido de que es una situación con la que lidiamos habitualmente. En el código de un proyecto en producción es fundamental la validación de datos de entrada y no está de más practicar con un ejercicio que pone su foco casi exclusivamente en ello.

Aparte, veremos un par de técnicas interesantes para transformar una interfaz pública sin romper los tests.

## Enunciado de la kata

Crear un clase `Nif`, que será un *Value Object* para representar el Número de Identificación Fiscal de España. Es una combinación de una cadena de ocho caracteres numéricos, con una letra final que actúa como carácter de control.

Esta letra de control se obtiene calculando el resto de dividir la parte numérica del NIF entre 23 (mod 23). El resultado nos indica la fila en la que consultar la letra de control de la siguiente tabla. En esta tabla he incluido también ejemplos sencillos de NIF válidos para que los puedas usar en los tests.


| Parte numérica | Resto | Letra | Ejemplo NIF válido |
| ----------------- | ------- | ------- | --------------------- |
| 00000023        | 0     | T     | 00000023T           |
| 00000024        | 1     | R     | 00000024R           |
| 00000025        | 2     | W     | 00000025W           |
| 00000026        | 3     | A     | 00000026A           |
| 00000027        | 4     | G     | 00000027G           |
| 00000028        | 5     | M     | 00000028M           |
| 00000029        | 6     | Y     | 00000029Y           |
| 00000030        | 7     | F     | 00000030F           |
| 00000031        | 8     | P     | 00000031P           |
| 00000032        | 9     | D     | 00000032D           |
| 00000033        | 10    | X     | 00000033X           |
| 00000034        | 11    | B     | 00000034B           |
| 00000035        | 12    | N     | 00000035N           |
| 00000036        | 13    | J     | 00000036J           |
| 00000037        | 14    | Z     | 00000037Z           |
| 00000038        | 15    | S     | 00000038S           |
| 00000039        | 16    | Q     | 00000039Q           |
| 00000040        | 17    | V     | 00000040V           |
| 00000041        | 18    | H     | 00000041H           |
| 00000042        | 19    | L     | 00000042L           |
| 00000043        | 20    | C     | 00000043C           |
| 00000044        | 21    | K     | 00000044K           |
| 00000045        | 22    | E     | 00000045E           |

Puedes crear NIF inválidos simplemente escogiendo una parte numérica y la letra que no le corresponde.


| Ejemplo inválido |
| ------------------- |
| 00000000S         |
| 00000001M         |
| 00000002H         |
| 00000003Q         |
| 00000004E         |

Hay una excepción: los NIF para extranjeras (o NIE) pueden empezar por las letras `X`, `Y` o `Z`, que a los efectos de los cálculos se reemplazan por los números `0`, `1` y `2`, respectivamente. En ese caso `X0000000T` equivale a `00000000T`.

Para evitar confusiones se han excluido las letras `U`, `I`, `O` y `Ñ`.

Un cadena que empieza por una letra distinta de `X`, `Y`, `Z`, o que contenga caracteres alfabéticos en las posiciones centrales también es inválida.

## Lenguaje y enfoque

Esta kata la vamos a resolver en Go, por lo que vamos a matizar un poco su resultado. En este ejemplo vamos a crear un tipo de dato `Nif`, que será básicamente un `string`, y una función factoría `NewNif` que nos permitirá construir NIF validados a partir de un `string` que le pasamos.

Por otro lado, el testing en Go es también un poco particular. Aunque el lenguaje incorpora de forma estándar soporte para realizar tests, no incluye utilidades habituales como `asserts`.

### Disclaimer

Para resolver esta kata me voy a aprovechar de la forma en que Go gestiona los errores. Estos se pueden devolver como una de las respuestas de una función, lo que te obliga a gestionarlos siempre de manera explícita.

Basar tests en mensajes de error no es una buena práctica, porque pueden cambiar con facilidad haciendo fallar los tests aunque no haya realmente una alteración de la funcionalidad. Sin embargo, en esta kata vamos a usar los mensajes de error como una especie de comodín temporal en el que apoyarnos haciendo que cambien de más específicos a más generales. Al acabar el ejercicio manejaremos únicamente dos errores posibles.

## Creando la función constructora

En esta kata nos interesa empezar centrándonos en los  *sad paths* , los casos en los que que no vamos a poder usar el argumento pasado a la función constructora. De todas las innumerables combinaciones de string que la función podría recibir vamos primero a dar una respuesta a las que sabemos con seguridad que no nos van a servir porque no se ajustan a los requisitos. Esta respuesta será un error.

Empezaremos rechazando aquellas cadenas que sean demasiado largas, las que tienen más de nueve caracteres. Esto lo podemos describir con este test:

En el archivo **nif/nif_test.go**

```

1 
package
 
nif


2 


3 
import
 
"testing"


4 


5 
func
 
TestShouldFailWhenStringIsTooLong
(
t
 
*
testing
.
T
)
 
{


6 

NewNif
()


7 
}

```

De momento vamos a ignorar las respuestas de la función simplemente para forzarnos a implementar el mínimo de código.

Como es de suponer el test fallará porque no compila. Así que implementamos el código mínimo necesario, que puede ser tan pequeño como éste:

Archivo **nif/nif.go**

```

1 
package
 
nif


2 


3 
func
 
NewNif
()
 
{


4 


5 
}

```

Con esto ya logramos una base sobre la que construir.

Ahora podemos avanzar un paso más. La función debería aceptar un parámetro:

```

1 
package
 
nif


2 


3 
import
 
"testing"


4 


5 
func
 
TestShouldFailWhenStringIsTooLong
(
t
 
*
testing
.
T
)
 
{


6 

NewNif
(
"01234567891011"
)


7 
}

```

Volvemos a hacer pasar el test con:

```

1 
package
 
nif


2 


3 
func
 
NewNif
(
candidate
 
string
)
 
{


4 


5 
}

```

Y, finalmente, devolver:

* el NIF cuando el que hemos pasado es válido.
* un error en caso de que no se pueda.

En **Go** una función puede devolver varios valores y, por convención, se devuelven también los errores como último valor devuelto.

Esto proporciona una flexibilidad que no es habitual encontrar en otros lenguajes y nos deja jugar con algunas ideas que son como mínimo curiosas. Por ejemplo, nosotras vamos a ignorar de momento la respuesta de la función y centrarnos sólo en los errores. Nuestro próximo test va a pedir que la función devuelva sólo el error sin hacer nada con él. El `if` es, de momento, para que el compilador no proteste.

```

1 
package
 
nif


2 


3 
import
 
"testing"


4 


5 
func
 
TestShouldFailWhenStringIsTooLong
(
t
 
*
testing
.
T
)
 
{


6 

err
 
:=
 
NewNif
(
"01234567891011"
)


7 


8 

if
 
err
 
!=
 
nil
 
{}


9 
}

```

Este test nos indica que debemos devolver algo, así que por ahora indicamos que vamos a devolver un error, que puede ser `nil`.

```

1 
package
 
nif


2 


3 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


4 

return
 
nil


5 
}

```

Avancemos un paso más esperando que se produzca un error determinado cuando se cumple la circunstancia definida por el test, que la cadena es demasiado larga, y con lo que tendremos ya un primer test en condiciones:

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailWhenStringIsTooLong
(
t
 
*
testing
.
T
)
 
{


 6 

err
 
:=
 
NewNif
(
"01234567891011"
)


 7 


 8 

if
 
err
.
Error
()
 
!=
 
"too long"
 
{


 9 

t
.
Errorf
(
"Expected too long, got %s"
,
 
err
.
Error
())


10 

}


11 
}

```

De nuevo fallará el test y para hacerlo pasar devolvemos incondicionalmente el error:

```

1 
package
 
nif


2 


3 
import
 
"errors"


4 


5 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


6 

return
 
errors
.
New
(
"too long"
)


7 
}

```

Y con esto ya hemos hecho que nuestro primer test esté completo y pase. Podríamos ser un poco más estrictas en el manejo de la respuesta para contemplar el caso de que `err` sea `nil`, pero de momento es algo que no nos tiene que afectar.

En este punto me gustaría llamar tu atención al hecho de que no estamos resolviendo nada todavía: el error se devuelve de manera incondicional, por lo que estamos retrasando esta validación para más tarde.

## Implementar la primera validación

Nuestro segundo test tiene como objetivo forzar la implementación de la validación que acabamos de posponer. Puede sonar un poco extraño, pero nos muestra que uno de los grandes beneficios de TDD es el hecho de poder posponer decisiones. Al hacerlo, tendremos un poco más de información, lo que siempre es una ventaja.

El test es muy similar al anterior:

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailWhenStringIsTooLong
(
t
 
*
testing
.
T
)
 
{


 6 

err
 
:=
 
NewNif
(
"01234567891011"
)


 7 


 8 

if
 
err
.
Error
()
 
!=
 
"too long"
 
{


 9 

t
.
Errorf
(
"Expected too long, got %s"
,
 
err
.
Error
())


10 

}


11 
}


12 


13 
func
 
TestShouldFailWhenStringIsTooShort
(
t
 
*
testing
.
T
)
 
{


14 

err
 
:=
 
NewNif
(
"0123456"
)


15 


16 

if
 
err
.
Error
()
 
!=
 
"too short"
 
{


17 

t
.
Errorf
(
"Expected too short, got %s"
,
 
err
.
Error
())


18 

}


19 
}

```

Este test ya nos obliga a actuar de manera diferente en cada caso, así que vamos a implementar la validación que limita los string demasiado largos:

```

 1 
package
 
nif


 2 


 3 
import
 
"errors"


 4 


 5 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 6 

if
 
len
(
candidate
)
 
>
 
9
 
{


 7 

return
 
errors
.
New
(
"too long"
)


 8 

}


 9 


10 

return
 
errors
.
New
(
"too short"
)


11 
}

```

Vuelvo a señalar que en este momento lo que dice el test no lo estamos implementando ahora. Lo haremos en el siguiente ciclo, pero el test se cumple al devolver el error esperado de forma incondicional.

No hay mucho más que podamos hacer en el código de producción, pero al fijarnos en los tests podemos ver que sería posible unificar un poco su estructura. Al fin y al cabo vamos a hacer una serie de ellos en los que pasamos un valor y esperamos un error determinado como respuesta.

## Un test para dominarlos a todos

En **Go** existe una estructura de test similar a la que en otros lenguajes nos proporciona el uso de  *Data Providers* : `Table Test`.

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailIfCandidateIsInvalid
(
t
 
*
testing
.
T
)
 
{


 6 

tests
 
:=
 
[]
struct
 
{


 7 

name
 
string


 8 

example
 
string


 9 

expected
 
string


10 

}{


11 

{
"should fail if too long"
,
 
"01234567891011"
,
 
"too long"
},


12 

{
"should fail if too short"
,
 
"01234"
,
 
"too short"
},


13 

}


14 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


15 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


16 
	
err
 
:=
 
NewNif
(
test
.
example
)


17 


18 
	
if
 
err
.
Error
()
 
!=
 
test
.
expected
 
{


19 
		
t
.
Errorf
(
"Expected %s, got %s"
,
 
test
.
expected
,
 
err
.
Error
())


20 
	
}


21 

})


22 

}


23 
}

```

Con esto conseguimos que ahora sea muy fácil y rápido añadir tests, sobre todo si son de la misma familia, como en este caso en el que pasamos cadenas candidatas inválidas y chequeamos por el error. Además, si hacemos cambios en la interfaz de la constructora sólo tenemos un lugar en donde aplicarlos.

Con esto, tendríamos ya todo preparado para seguir desarrollando.

## Completar la validación de la longitud y empezar a examinar la estructura

Con los dos tests anteriores verificamos si la cadena que vamos a examinar cumple la especificación de tener exactamente nueve caracteres, aunque de momento eso no está implementado. Lo haremos ahora.

Sin embargo, puede que te preguntes por qué no testear simplemente que la función rechaza los `strings` que no la cumplan, algo que podríamos hacer en un único test.

La razón es que en realidad hay dos posibles formas de que no se cumpla la especificación: el `string` tiene más de nueve caracteres o el `string` tiene menos. Si hacemos un sólo test elegiremos uno de los dos casos, con lo cual no estamos garantizando que se cumpla el otro.

En este ejemplo concreto en que hay un único valor que nos interesa podríamos plantear la disyuntiva entre `strings` con longitud nueve y `strings` con longitud distinta de nueve. Sin embargo, es frecuente que tengamos que trabajar con intervalos de valores que, además, pueden estar abiertos o cerrados. En esa situación la estrategia de dos, o incluso más tests, es muchísimo más segura.

En cualquier caso, en el punto en el que estamos, para mover el desarrollo necesitamos añadir otro requisito en forma de test. Los dos tests existentes nos definen la longitud válida del `string`. El siguiente test pregunta por su estructura.

Y con el refactor que acabamos de hacer añadir un test es tremendamente sencillo.

Empezaremos por el principio. Los NIF válidos comienzan con un número, excepto un subconjunto de ellos que lo hace por alguna de las letras `X`, `Y` y `Z`. Una forma de definir el test es de la siguiente forma:

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailIfCandidateIsInvalid
(
t
 
*
testing
.
T
)
 
{


 6 

tests
 
:=
 
[]
struct
 
{


 7 

name
 
string


 8 

example
 
string


 9 

expected
 
string


10 

}{


11 

{
"should fail if too long"
,
 
"01234567891011"
,
 
"too long"
},


12 

{
"should fail if too short"
,
 
"01234"
,
 
"too short"
},


13 

{
"should fail if starts with a letter other than X, Y, Z"
,
 
"A12345678"
,
 
"bad start form\


14 
at"
},


15 

}


16 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


17 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


18 
	
err
 
:=
 
NewNif
(
test
.
example
)


19 


20 
	
if
 
err
.
Error
()
 
!=
 
test
.
expected
 
{


21 
		
t
.
Errorf
(
"Expected %s, got %s"
,
 
test
.
expected
,
 
err
.
Error
())


22 
	
}


23 

})


24 

}


25 
}

```

Para hacer pasar el test, resolvemos primero el problema pendiente del anterior:

```

 1 
package
 
nif


 2 


 3 
import
 
"errors"


 4 


 5 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 6 

if
 
len
(
candidate
)
 
>
 
9
 
{


 7 

return
 
errors
.
New
(
"too long"
)


 8 

}


 9 


10 

if
 
len
(
candidate
)
 
<
 
9
 
{


11 

return
 
errors
.
New
(
"too short"
)


12 

}


13 


14 

return
 
errors
.
New
(
"bad start format"
)


15 
}

```

Aquí tenemos una oportunidad de refactor bastante clara que consistiría en unir las condicionales que evalúan la longitud del `string`. Sin embargo, esa va a hacer que el test falle ya que al menos tendríamos que cambiar un mensaje de error.

### La vía no muy limpia de cambiar a la vez test y código de producción

Una posibilidad es “saltarnos” temporalmente la condición de que el refactor sea con los tests en verde y hacer cambios a la vez en prod y test. Veamos qué pasa.

Lo primero sería cambiar el test para esperar un mensaje de error distinto, que será más genérico e igual para todos los casos que queremos consolidar en este paso:

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailIfCandidateIsInvalid
(
t
 
*
testing
.
T
)
 
{


 6 

tests
 
:=
 
[]
struct
 
{


 7 

name
 
string


 8 

example
 
string


 9 

expected
 
string


10 

}{


11 

{
"should fail if too long"
,
 
"01234567891011"
,
 
"bad format"
},


12 

{
"should fail if too short"
,
 
"01234"
,
 
"bad format"
},


13 

{
"should fail if starts with a letter other than X, Y, Z"
,
 
"A12345678"
,
 
"bad start form\


14 
at"
},


15 

}


16 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


17 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


18 
	
err
 
:=
 
NewNif
(
test
.
example
)


19 


20 
	
if
 
err
.
Error
()
 
!=
 
test
.
expected
 
{


21 
		
t
.
Errorf
(
"Expected %s, got %s"
,
 
test
.
expected
,
 
err
.
Error
())


22 
	
}


23 

})


24 

}


25 
}

```

Esto hará fallar el test. Cosa que se puede arreglar cambiando el código de producción del mismo modo:

```

 1 
package
 
nif


 2 


 3 
import
 
"errors"


 4 


 5 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 6 

if
 
len
(
candidate
)
 
>
 
9
 
{


 7 

return
 
errors
.
New
(
"bad format"
)


 8 

}


 9 


10 

if
 
len
(
candidate
)
 
<
 
9
 
{


11 

return
 
errors
.
New
(
"bad format"
)


12 

}


13 


14 

return
 
errors
.
New
(
"bad start format"
)


15 
}

```

El test vuelve a pasar y estamos listas para el refactor. Pero no vamos a hacer eso.

### La vía segura

Otra opción es hacer un refactor temporal en el test para hacerlo más tolerante. Simplemente hacemos que sea posible devolver un error más genérico aparte del error específico.

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailIfCandidateIsInvalid
(
t
 
*
testing
.
T
)
 
{


 6 

tests
 
:=
 
[]
struct
 
{


 7 

name
 
string


 8 

example
 
string


 9 

expected
 
string


10 

}{


11 

{
"should fail if too long"
,
 
"01234567891011"
,
 
"too long"
},


12 

{
"should fail if too short"
,
 
"01234"
,
 
"too short"
},


13 

{
"should fail if starts with a letter other than X, Y, Z"
,
 
"A12345678"
,
 
"bad start form\


14 
at"
},


15 

}


16 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


17 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


18 
	
err
 
:=
 
NewNif
(
test
.
example
)


19 


20 
	
if
 
err
.
Error
()
 
!=
 
test
.
expected
 
&&
 
err
.
Error
()
 
!=
 
"bad format"
 
{


21 
		
t
.
Errorf
(
"Expected %s, got %s"
,
 
test
.
expected
,
 
err
.
Error
())


22 
	
}


23 

})


24 

}


25 
}

```

Este cambio nos permite ahora hacer el cambio en producción sin romper nada:

```

 1 
package
 
nif


 2 


 3 
import
 
"errors"


 4 


 5 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 6 

if
 
len
(
candidate
)
 
>
 
9
 
{


 7 

return
 
errors
.
New
(
"bad format"
)


 8 

}


 9 


10 

if
 
len
(
candidate
)
 
<
 
9
 
{


11 

return
 
errors
.
New
(
"bad format"
)


12 

}


13 


14 

return
 
errors
.
New
(
"bad end format"
)


15 
}

```

El test sigue pasando y ahora sí podemos hacer el refactor.

## Unificar la validación por longitud del `string`

Unificar las condicionales es fácil en este momento. Este es el primer paso, que incluyo aquí para tener un modelo de cómo hacer esto en caso de que fuese un intervalo de longitudes válidas.

```

 1 
package
 
nif


 2 


 3 
import
 
"errors"


 4 


 5 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 6 

if
 
len
(
candidate
)
 
>
 
9
 
||
 
len
(
candidate
)
 
<
 
9
 
{


 7 

return
 
errors
.
New
(
"bad format"
)


 8 

}


 9 


10 

return
 
errors
.
New
(
"bad start format"
)


11 
}

```

Pero se puede hacer mejor:

```

 1 
package
 
nif


 2 


 3 
import
 
"errors"


 4 


 5 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 6 

if
 
len
(
candidate
)
 
!=
 
9
 
{


 7 

return
 
errors
.
New
(
"bad format"
)


 8 

}


 9 


10 

return
 
errors
.
New
(
"bad start format"
)


11 
}

```

Y un poco más expresivo:

```

 1 
package
 
nif


 2 


 3 
import
 
"errors"


 4 


 5 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 6 

const
 
maxlength
 
=
 
9


 7 


 8 

if
 
len
(
candidate
)
 
!=
 
maxlength
 
{


 9 

return
 
errors
.
New
(
"bad format"
)


10 

}


11 


12 

return
 
errors
.
New
(
"bad start format"
)


13 
}

```

Finalmente, un nuevo refactor del test para contemplar estos cambios. Retiramos nuestro cambio temporal aunque es posible que tengamos que volver a utilizarlo en el futuro.

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailIfCandidateIsInvalid
(
t
 
*
testing
.
T
)
 
{


 6 

tests
 
:=
 
[]
struct
 
{


 7 

name
 
string


 8 

example
 
string


 9 

expected
 
string


10 

}{


11 

{
"should fail if too long"
,
 
"01234567891011"
,
 
"bad format"
},


12 

{
"should fail if too short"
,
 
"01234"
,
 
"bad format"
},


13 

{
"should fail if starts with a letter other than X, Y, Z"
,
 
"A12345678"
,
 
"bad start form\


14 
at"
},


15 

}


16 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


17 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


18 
	
err
 
:=
 
NewNif
(
test
.
example
)


19 


20 
	
if
 
err
.
Error
()
 
!=
 
test
.
expected
 
{


21 
		
t
.
Errorf
(
"Expected %s, got %s"
,
 
test
.
expected
,
 
err
.
Error
())


22 
	
}


23 

})


24 

}


25 
}

```

Fíjate que hemos podido hacer todos estos cambios sin que fallaran los tests.

## Avanzando en la estructura

El código está bastante compacto, así que vamos a añadir un nuevo test que nos permita avanzar con la validez de la estructura. El fragmento central del NIF está compuesto sólo por números, exactamente siete:

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailIfCandidateIsInvalid
(
t
 
*
testing
.
T
)
 
{


 6 

tests
 
:=
 
[]
struct
 
{


 7 

name
 
string


 8 

example
 
string


 9 

expected
 
string


10 

}{


11 

{
"should fail if too long"
,
 
"01234567891011"
,
 
"bad format"
},


12 

{
"should fail if too short"
,
 
"01234"
,
 
"bad format"
},


13 

{
"should fail if starts with a letter other than X, Y, Z"
,
 
"A12345678"
,
 
"bad start form\


14 
at"
},


15 

{
"should fail if doesn't have 7 digit in the middle"
,
 
"0123X567R"
,
 
"bad middle format"
},


16 

}


17 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


18 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


19 
	
err
 
:=
 
NewNif
(
test
.
example
)


20 


21 
	
if
 
err
.
Error
()
 
!=
 
test
.
expected
 
{


22 
		
t
.
Errorf
(
"Expected %s, got %s"
,
 
test
.
expected
,
 
err
.
Error
())


23 
	
}


24 

})


25 

}


26 
}

```

Lo lanzamos para asegurarnos de que falla por la razón adecuada. Para hacer pasar el test tenemos que resolver primero el test anterior, por lo que añadiremos código para verificar que el primer símbolo es un número o una letra en el conjunto `X`, `Y` y `Z`. Lo haremos con una expresión regular:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 9 

const
 
maxlength
 
=
 
9


10 


11 

if
 
len
(
candidate
)
 
!=
 
maxlength
 
{


12 

return
 
errors
.
New
(
"bad format"
)


13 

}


14 


15 

invalid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[^0-9XYZ].*`
)


16 


17 

if
 
invalid
.
MatchString
(
candidate
)
 
{


18 

return
 
errors
.
New
(
"bad start format"
)


19 

}


20 


21 

return
 
errors
.
New
(
"bad middle format"
)


22 
}

```

Con este código hacemos pasar el test, pero vamos a hacer un refactor.

## Invertir la condicional

Tiene sentido que en vez de hacer *match* contra una expresión regular que excluya los string no válidos, hagamos *match* contra una expresión que los detecte. Con eso tendremos que invertir la condicional. Lo cierto es que el cambio es bastante pequeño:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 9 

const
 
maxlength
 
=
 
9


10 


11 

if
 
len
(
candidate
)
 
!=
 
maxlength
 
{


12 

return
 
errors
.
New
(
"bad format"
)


13 

}


14 


15 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ].*`
)


16 


17 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


18 

return
 
errors
.
New
(
"bad start format"
)


19 

}


20 


21 

return
 
errors
.
New
(
"bad middle format"
)


22 
}

```

## El final de la estructura

Nos estamos acercando al final de la validación estructural del NIF, necesitamos un test que nos diga cuáles rechazar en función de su último símbolo, lo que nos llevará a resolver el problema que quedaba pendiente del test anterior:

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailIfCandidateIsInvalid
(
t
 
*
testing
.
T
)
 
{


 6 

tests
 
:=
 
[]
struct
 
{


 7 

name
 
string


 8 

example
 
string


 9 

expected
 
string


10 

}{


11 

{
"should fail if too long"
,
 
"01234567891011"
,
 
"bad format"
},


12 

{
"should fail if too short"
,
 
"01234"
,
 
"bad format"
},


13 

{
"should fail if starts with a letter other than X, Y, Z"
,
 
"A12345678"
,
 
"bad start form\


14 
at"
},


15 

{
"should fail if doesn't have 7 digit in the middle"
,
 
"0123X567R"
,
 
"bad middle format"
},


16 

{
"should fail if doesn't end with a valid control letter"
,
 
"01234567U"
,
 
"invalid end fo\


17 
rmat"
},


18 


19 

}


20 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


21 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


22 
	
err
 
:=
 
NewNif
(
test
.
example
)


23 


24 
	
if
 
err
.
Error
()
 
!=
 
test
.
expected
 
{


25 
		
t
.
Errorf
(
"Expected %s, got %s"
,
 
test
.
expected
,
 
err
.
Error
())


26 
	
}


27 

})


28 

}


29 
}

```

De las cuatro letras no válidas tomamos la `U` como ejemplo, pero podrían ser la `I`, la `Ñ` y la `O`.

Sin embargo, para hacer pasar el test, lo que hacemos es asegurarnos que el anterior se va a cumplir. Lo más fácil es implementar eso de forma separada:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 9 

const
 
maxlength
 
=
 
9


10 


11 

if
 
len
(
candidate
)
 
!=
 
maxlength
 
{


12 

return
 
errors
.
New
(
"bad format"
)


13 

}


14 


15 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ].*`
)


16 


17 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


18 

return
 
errors
.
New
(
"bad start format"
)


19 

}


20 


21 

valid
 
=
 
regexp
.
MustCompile
(
`(?i)^.\d{7}.*`
)


22 


23 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


24 

return
 
errors
.
New
(
"bad middle format"
)


25 

}


26 


27 

return
 
errors
.
New
(
"invalid end format"
)


28 
}

```

## Compactando el algoritmo

Con esto pasa el test y nos encontramos con una situación familiar que ya hemos resuelto antes: tenemos que convertir los errores en más genéricos con la ayuda temporal de un control extra en el test:

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailIfCandidateIsInvalid
(
t
 
*
testing
.
T
)
 
{


 6 

tests
 
:=
 
[]
struct
 
{


 7 

name
 
string


 8 

example
 
string


 9 

expected
 
string


10 

}{


11 

{
"should fail if too long"
,
 
"01234567891011"
,
 
"bad format"
},


12 

{
"should fail if too short"
,
 
"01234"
,
 
"bad format"
},


13 

{
"should fail if starts with a letter other than X, Y, Z"
,
 
"A12345678"
,
 
"bad start form\


14 
at"
},


15 

{
"should fail if doesn't have 7 digit in the middle"
,
 
"0123X567R"
,
 
"bad middle format"
},


16 

{
"should fail if doesn't end with a valid control letter"
,
 
"01234567U"
,
 
"invalid end fo\


17 
rmat"
},


18 


19 

}


20 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


21 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


22 
	
err
 
:=
 
NewNif
(
test
.
example
)


23 


24 
	
if
 
err
.
Error
()
 
!=
 
test
.
expected
 
&&
 
err
.
Error
()
 
!=
 
"bad format"
 
{


25 
		
t
.
Errorf
(
"Expected %s, got %s"
,
 
test
.
expected
,
 
err
.
Error
())


26 
	
}


27 

})


28 

}


29 
}

```

Hacemos el cambio en los mensajes de error en el código de producción:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 9 

const
 
maxlength
 
=
 
9


10 


11 

if
 
len
(
candidate
)
 
!=
 
maxlength
 
{


12 

return
 
errors
.
New
(
"bad format"
)


13 

}


14 


15 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ].*`
)


16 


17 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


18 

return
 
errors
.
New
(
"bad format"
)


19 

}


20 


21 

valid
 
=
 
regexp
.
MustCompile
(
`(?i)^.\d{7}.*`
)


22 


23 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


24 

return
 
errors
.
New
(
"bad format"
)


25 

}


26 


27 

return
 
errors
.
New
(
"invalid end format"
)


28 
}

```

Ahora unificamos la expresión regular y las condicionales:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 9 

const
 
maxlength
 
=
 
9


10 


11 

if
 
len
(
candidate
)
 
!=
 
maxlength
 
{


12 

return
 
errors
.
New
(
"bad format"
)


13 

}


14 


15 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}.*`
)


16 


17 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


18 

return
 
errors
.
New
(
"bad format"
)


19 

}


20 


21 

return
 
errors
.
New
(
"invalid end format"
)


22 
}

```

Todavía podemos hacer un cambio pequeño pero importante. La última parte de la expresión regular `.*` está para cumplir el requisito de que se haga match de toda la cadena, pero realmente no necesitamos el cuantificador ya que nos basta un carácter:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 9 

const
 
maxlength
 
=
 
9


10 


11 

if
 
len
(
candidate
)
 
!=
 
maxlength
 
{


12 

return
 
errors
.
New
(
"bad format"
)


13 

}


14 


15 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}.$`
)


16 


17 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


18 

return
 
errors
.
New
(
"bad format"
)


19 

}


20 


21 

return
 
errors
.
New
(
"invalid end format"
)


22 
}

```

Y esto nos revela un detalle, la expresión regular hace *match* únicamente en cadenas de exactamente nueve caracteres, por lo que la validación inicial de la longitud resulta innecesaria:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 9 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}.$`
)


10 


11 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


12 

return
 
errors
.
New
(
"bad format"
)


13 

}


14 


15 

return
 
errors
.
New
(
"invalid end format"
)


16 
}

```

Tanto camino recorrido para desandarlo. Sin embargo, al principio no sabíamos esto y es ahí donde está el valor del proceso.

Por último, cambiamos el test para reflejar los cambios y volver a quitar nuestro apoyo temporal:

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailIfCandidateIsInvalid
(
t
 
*
testing
.
T
)
 
{


 6 

tests
 
:=
 
[]
struct
 
{


 7 

name
 
string


 8 

example
 
string


 9 

expected
 
string


10 

}{


11 

{
"should fail if too long"
,
 
"01234567891011"
,
 
"bad format"
},


12 

{
"should fail if too short"
,
 
"01234"
,
 
"bad format"
},


13 

{
"should fail if starts with a letter other than X, Y, Z"
,
 
"A12345678"
,
 
"bad format"
},


14 

{
"should fail if doesn't have 7 digit in the middle"
,
 
"0123X567R"
,
 
"bad format"
},


15 

{
"should fail if doesn't end with a valid control letter"
,
 
"01234567U"
,
 
"invalid end fo\


16 
rmat"
},


17 


18 

}


19 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


20 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


21 
	
err
 
:=
 
NewNif
(
test
.
example
)


22 


23 
	
if
 
err
.
Error
()
 
!=
 
test
.
expected
 
{


24 
		
t
.
Errorf
(
"Expected %s, got %s"
,
 
test
.
expected
,
 
err
.
Error
())


25 
	
}


26 

})


27 

}


28 
}

```

## Terminando la validación estructural

Necesitamos un nuevo test para terminar la parte de la validación estructural. Los tests existentes nos garantizarían la corrección de los `strings`, pero la siguiente validación ya implica el algoritmo para calcular la letra de control.

El test que necesitamos ahora controla que no podemos usar un NIF estructuralmente válido, pero en el que la letra de control sea incorrecta. Al enunciar la kata pusimos algunos ejemplos, como `00000000S`. Este es el test:

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailIfCandidateIsInvalid
(
t
 
*
testing
.
T
)
 
{


 6 

tests
 
:=
 
[]
struct
 
{


 7 

name
 
string


 8 

example
 
string


 9 

expected
 
string


10 

}{


11 

{
"should fail if too long"
,
 
"01234567891011"
,
 
"bad format"
},


12 

{
"should fail if too short"
,
 
"01234"
,
 
"bad format"
},


13 

{
"should fail if starts with a letter other than X, Y, Z"
,
 
"A12345678"
,
 
"bad format"
},


14 

{
"should fail if doesn't have 7 digit in the middle"
,
 
"0123X567R"
,
 
"bad format"
},


15 

{
"should fail if doesn't end with a valid control letter"
,
 
"01234567U"
,
 
"invalid end fo\


16 
rmat"
},


17 

{
"should fail if doesn't end with the right control letter"
,
 
"00000000S"
,
 
"bad control \


18 
letter"
},


19 


20 

}


21 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


22 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


23 
	
err
 
:=
 
NewNif
(
test
.
example
)


24 


25 
	
if
 
err
.
Error
()
 
!=
 
test
.
expected
 
{


26 
		
t
.
Errorf
(
"Expected %s, got %s"
,
 
test
.
expected
,
 
err
.
Error
())


27 
	
}


28 

})


29 

}


30 
}

```

Y he aquí el código que lo hace pasar:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 9 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}.$`
)


10 


11 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


12 

return
 
errors
.
New
(
"bad format"
)


13 

}


14 


15 

valid
 
=
 
regexp
.
MustCompile
(
`(?i).*[^UIOÑ0-9]$`
)


16 


17 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


18 

return
 
errors
.
New
(
"invalid end format"
)


19 

}


20 


21 

return
 
errors
.
New
(
"bad control letter"
)


22 
}

```

Y, cómo no, toca refactorizar.

## Compactando la validación

Este refactor es bastante obvio, pero tenemos que volver a proteger el test temporalmente:

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailIfCandidateIsInvalid
(
t
 
*
testing
.
T
)
 
{


 6 

tests
 
:=
 
[]
struct
 
{


 7 

name
 
string


 8 

example
 
string


 9 

expected
 
string


10 

}{


11 

{
"should fail if too long"
,
 
"01234567891011"
,
 
"bad format"
},


12 

{
"should fail if too short"
,
 
"01234"
,
 
"bad format"
},


13 

{
"should fail if starts with a letter other than X, Y, Z"
,
 
"A12345678"
,
 
"bad format"
},


14 

{
"should fail if doesn't have 7 digit in the middle"
,
 
"0123X567R"
,
 
"bad format"
},


15 

{
"should fail if doesn't end with a valid control letter"
,
 
"01234567U"
,
 
"invalid end fo\


16 
rmat"
},


17 

{
"should fail if doesn't end with the right control letter"
,
 
"00000000S"
,
 
"bad control \


18 
letter"
},


19 


20 

}


21 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


22 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


23 
	
err
 
:=
 
NewNif
(
test
.
example
)


24 


25 
	
if
 
err
.
Error
()
 
!=
 
test
.
expected
  
&&
 
err
.
Error
()
 
!=
 
"bad format"
 
{


26 
		
t
.
Errorf
(
"Expected %s, got %s"
,
 
test
.
expected
,
 
err
.
Error
())


27 
	
}


28 

})


29 

}


30 
}

```

Hacemos más general el error para poder unificar las expresiones regulares y las condicionales:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 9 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}.$`
)


10 


11 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


12 

return
 
errors
.
New
(
"bad format"
)


13 

}


14 


15 

valid
 
=
 
regexp
.
MustCompile
(
`(?i).*[^UIOÑ0-9]$`
)


16 


17 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


18 

return
 
errors
.
New
(
"bad format"
)


19 

}


20 


21 

return
 
errors
.
New
(
"bad control letter"
)


22 
}

```

Y hacemos ahora la unificación, mientras los tests siguen pasando:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 9 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


10 


11 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


12 

return
 
errors
.
New
(
"bad format"
)


13 

}


14 


15 

return
 
errors
.
New
(
"bad control letter"
)


16 
}

```

Con esto terminamos la validación de la estructura y nos quedaría implementar el algoritmo  **mod23** . Pero para eso necesitamos un pequeño cambio de enfoque.

## Seamos optimistas

El algoritmo es, de hecho, muy sencillo: obtener un resto (de dividir por 23) y buscar la posición indicada por el resultado en una tabla. Es fácil de implementar en una sola iteración. Sin embargo, vamos a hacerlo más lentamente.

Hasta ahora nuestros tests eran pesimistas porque esperaban ejemplos incorrectos de NIF para poder pasar. Nuestros tests ahora tienen que ser optimistas, es decir, van a esperar que le pasemos ejemplos de NIF válidos.

En este punto introduciremos un cambio. Si recuerdas, de momento sólo estamos devolviendo el error y la interfaz final de la función devolverá el `string` validado como un tipo NIF que vamos a crear para la ocasión.

Es decir, tenemos que cambiar el código para que devuelva algo, y que ese algo sea de un tipo que todavía no existe.

Para hacer este cambio sin romper los tests vamos a hacer una técnica de refactor un tanto rebuscada.

## Cambiando la interfaz pública

En primer lugar, extraemos el cuerpo de `NewNif` a otra función:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 9 

return
 
FullNewNif
(
candidate
)


10 
}


11 


12 
func
 
FullNewNif
(
candidate
 
string
)
 
error
 
{


13 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


14 


15 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


16 

return
 
errors
.
New
(
"bad format"
)


17 

}


18 


19 

return
 
errors
.
New
(
"bad control letter"
)


20 
}

```

Los tests siguen pasando. Ahora introducimos una variable:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 9 

err
 
:=
 
FullNewNif
(
candidate
)


10 

return
 
err


11 
}


12 


13 
func
 
FullNewNif
(
candidate
 
string
)
 
error
 
{


14 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


15 


16 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


17 

return
 
errors
.
New
(
"bad format"
)


18 

}


19 


20 

return
 
errors
.
New
(
"bad control letter"
)


21 
}

```

Con esto podemos hacer que `FullNewNif` devuelva el `string` sin afectar al test porque queda encapsulado dentro de `NewNif`.

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
NewNif
(
candidate
 
string
)
 
error
 
{


 9 

_
,
 
err
 
:=
 
FullNewNif
(
candidate
)


10 

return
 
err


11 
}


12 


13 
func
 
FullNewNif
(
candidate
 
string
)
 
(
string
,
 
error
)
 
{


14 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


15 


16 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


17 

return
 
""
,
 
errors
.
New
(
"bad format"
)


18 

}


19 


20 

return
 
candidate
,
 
errors
.
New
(
"bad control letter"
)


21 
}

```

Los tests siguen pasando y casi hemos acabado. En el test cambiamos el uso de `NewNif` por `FullNewNif`.

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailIfCandidateIsInvalid
(
t
 
*
testing
.
T
)
 
{


 6 

tests
 
:=
 
[]
struct
 
{


 7 

name
 
string


 8 

example
 
string


 9 

expected
 
string


10 

}{


11 

{
"should fail if too long"
,
 
"01234567891011"
,
 
"bad format"
},


12 

{
"should fail if too short"
,
 
"01234"
,
 
"bad format"
},


13 

{
"should fail if starts with a letter other than X, Y, Z"
,
 
"A12345678"
,
 
"bad format"
},


14 

{
"should fail if doesn't have 7 digit in the middle"
,
 
"0123X567R"
,
 
"bad format"
},


15 

{
"should fail if doesn't end with a valid control letter"
,
 
"01234567U"
,
 
"invalid end fo\


16 
rmat"
},


17 

{
"should fail if doesn't end with the right control letter"
,
 
"00000000S"
,
 
"bad control \


18 
letter"
},


19 


20 

}


21 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


22 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


23 
	
_
,
 
err
 
:=
 
FullNewNif
(
test
.
example
)


24 


25 
	
if
 
err
.
Error
()
 
!=
 
test
.
expected
  
&&
 
err
.
Error
()
 
!=
 
"bad format"
 
{


26 
		
t
.
Errorf
(
"Expected %s, got %s"
,
 
test
.
expected
,
 
err
.
Error
())


27 
	
}


28 

})


29 

}


30 
}

```

Siguen pasando los tests. Ahora la función devuelve los dos parámetros que queríamos y no hemos roto los tests. Podemos eliminar la función `NewNif` original.

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
FullNewNif
(
candidate
 
string
)
 
(
string
,
 
error
)
 
{


 9 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


10 


11 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


12 

return
 
""
,
 
errors
.
New
(
"bad format"
)


13 

}


14 


15 

return
 
candidate
,
 
errors
.
New
(
"bad control letter"
)


16 
}

```

Y usar las herramientas del IDE para cambiar el nombre de la función `FullNewNif` a `NewNif`.

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
func
 
NewNif
(
candidate
 
string
)
 
(
string
,
 
error
)
 
{


 9 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


10 


11 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


12 

return
 
""
,
 
errors
.
New
(
"bad format"
)


13 

}


14 


15 

return
 
candidate
,
 
errors
.
New
(
"bad control letter"
)


16 
}

```

## Ahora sí

Nuestro objetivo ahora es empujar la implementación del algoritmo  **mod23** . Esta vez los tests esperan que la cadena sea válida. Además, queremos forzar que se devuelva el tipo `Nif` en lugar de `string`.

```

 1 
func
 
TestShouldCreateNifTypeWithValidCandidate
(
t
 
*
testing
.
T
)
 
{


 2 

tests
 
:=
 
[]
struct
 
{


 3 

name
 
string


 4 

example
 
string


 5 

}{


 6 

{
"should accept mod23 being 0"
,
 
"00000023T"
},


 7 

}


 8 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


 9 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


10 
	
nif
,
 
err
 
:=
 
NewNif
(
test
.
example
)


11 
	

12 
	
if
 
nif
 
!=
 
Nif
(
test
.
example
)
 
{


13 
		
t
.
Errorf
(
"Expected Nif(%s), got %s"
,
 
test
.
example
,
 
nif
)


14 
	
}


15 
	

16 
	
if
 
err
 
!=
 
nil
 
{


17 
		
t
.
Errorf
(
"Unexpected error %s"
,
 
err
.
Error
())


18 
	
}


19 

})


20 

}


21 
}

```

En un primer paso cambiamos el código de producción para introducir y usar el tipo `Nif`:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
type
 
Nif
 
string


 9 


10 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


11 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


12 


13 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


14 

return
 
""
,
 
errors
.
New
(
"bad format"
)


15 

}


16 


17 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


18 
}

```

Ahora el test estará fallando porque no hemos validado nada todavía. Para hacerlo pasar añadimos un condicional:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
type
 
Nif
 
string


 9 


10 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


11 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


12 


13 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


14 

return
 
""
,
 
errors
.
New
(
"bad format"
)


15 

}


16 


17 

if
 
candidate
 
==
 
"00000023T"
 
{


18 

return
 
Nif
(
candidate
),
 
nil


19 

}


20 


21 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


22 
}

```

Una nota sobre **Go** es que los tipos *custom* no pueden tener valor `nil`, sino vacío. Por eso en caso de error devolvemos `string` vacío.

## Avanzando el algoritmo

De momento no hay muchos motivos para hacer refactor, así que vamos a introducir un test que nos ayude a avanzar un poco. En principio, queremos lograr que nos impulse a separar la parte numérica de la letra de control.

Una posibilidad sería testear otro NIF que acabe con la letra `T`, como el `00000046T`.

```

 1 
func
 
TestShouldCreateNifTypeWithValidCandidate
(
t
 
*
testing
.
T
)
 
{


 2 

tests
 
:=
 
[]
struct
 
{


 3 

name
 
string


 4 

example
 
string


 5 

}{


 6 

{
"should accept mod23 being 0"
,
 
"00000023T"
},


 7 

{
"should accept mod23 being 0 letter T"
,
 
"00000046T"
},


 8 

}


 9 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


10 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


11 
	
nif
,
 
err
 
:=
 
NewNif
(
test
.
example
)


12 


13 
	
if
 
nif
 
!=
 
Nif
(
test
.
example
)
 
{


14 
		
t
.
Errorf
(
"Expected Nif(%s), got %s"
,
 
test
.
example
,
 
nif
)


15 
	
}


16 


17 
	
if
 
err
 
!=
 
nil
 
{


18 
		
t
.
Errorf
(
"Unexpected error %s"
,
 
err
.
Error
())


19 
	
}


20 

})


21 

}


22 
}

```

Para hacer pasar el test, podemos hacer esta implementación sencilla:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
type
 
Nif
 
string


 9 


10 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


11 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


12 


13 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


14 

return
 
""
,
 
errors
.
New
(
"bad format"
)


15 

}


16 


17 

if
 
candidate
 
==
 
"00000023T"
 
{


18 

return
 
Nif
(
candidate
),
 
nil


19 

}


20 


21 

if
 
candidate
 
==
 
"00000046T"
 
{


22 

return
 
Nif
(
candidate
),
 
nil


23 

}


24 


25 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


26 
}

```

Y ahora empezamos a refactorizar.

## Más refactor

En el código de producción podemos ver lo que hay de diferente y de común entre los ejemplos. En ambos la letra de control es `T` y la parte numérica es divisible entre 23, por lo que su **mod23** será 0.

Ahora podemos hacer el refactor. Un primer paso.

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 
)


 7 


 8 
type
 
Nif
 
string


 9 


10 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


11 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


12 


13 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


14 

return
 
""
,
 
errors
.
New
(
"bad format"
)


15 

}


16 


17 

control
 
:=
 
string
(
candidate
[
8
])


18 


19 

if
 
control
 
==
 
"T"
 
{


20 

return
 
Nif
(
candidate
),
 
nil


21 

}


22 


23 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


24 
}

```

Y, después de ver pasar los tests, el segundo paso:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 

"strconv"


 7 
)


 8 


 9 
type
 
Nif
 
string


10 


11 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


12 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


13 


14 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


15 

return
 
""
,
 
errors
.
New
(
"bad format"
)


16 

}


17 


18 

control
 
:=
 
string
(
candidate
[
8
])


19 


20 

numeric
,
 
_
 
:=
 
strconv
.
Atoi
(
candidate
[
0
:
8
])


21 


22 

modulus
 
:=
 
numeric
 
%
 
23


23 


24 

if
 
control
 
==
 
"T"
 
&&
 
modulus
 
==
 
0
 
{


25 

return
 
Nif
(
candidate
),
 
nil


26 

}


27 


28 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


29 
}

```

Con este cambio los tests pasan y acepta todos los NIF válidos acabados en `T`.

## Validando más letras de control

En este tipo de algoritmos no tiene mucho sentido intentar validar todas las letras de control, pero podemos introducir una más para forzarnos a entender cómo debería evolucionar el código ahora. Probaremos con una nueva letra:

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailIfCandidateIsInvalid
(
t
 
*
testing
.
T
)
 
{


 6 

tests
 
:=
 
[]
struct
 
{


 7 

name
 
string


 8 

example
 
string


 9 

expected
 
string


10 

}{


11 

{
"should fail if too long"
,
 
"01234567891011"
,
 
"bad format"
},


12 

{
"should fail if too short"
,
 
"01234"
,
 
"bad format"
},


13 

{
"should fail if starts with a letter other than X, Y, Z"
,
 
"A12345678"
,
 
"bad format"
},


14 

{
"should fail if doesn't have 7 digit in the middle"
,
 
"0123X567R"
,
 
"bad format"
},


15 

{
"should fail if doesn't end with a valid control letter"
,
 
"01234567U"
,
 
"invalid end fo\


16 
rmat"
},


17 

{
"should fail if doesn't end with the right control letter"
,
 
"00000000S"
,
 
"bad control \


18 
letter"
},


19 


20 

}


21 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


22 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


23 
	
_
,
 
err
 
:=
 
NewNif
(
test
.
example
)


24 


25 
	
if
 
err
.
Error
()
 
!=
 
test
.
expected
  
&&
 
err
.
Error
()
 
!=
 
"bad format"
 
{


26 
		
t
.
Errorf
(
"Expected %s, got %s"
,
 
test
.
expected
,
 
err
.
Error
())


27 
	
}


28 

})


29 

}


30 
}


31 


32 
func
 
TestShouldCreateNifTypeWithValidCandidate
(
t
 
*
testing
.
T
)
 
{


33 

tests
 
:=
 
[]
struct
 
{


34 

name
 
string


35 

example
 
string


36 

}{


37 

{
"should accept mod23 being 0"
,
 
"00000000T"
},


38 

{
"should accept mod23 being 0 letter T"
,
 
"00000023T"
},


39 

{
"should accept mod23 being 1 letter R"
,
 
"00000024R"
},


40 

}


41 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


42 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


43 
	
nif
,
 
err
 
:=
 
NewNif
(
test
.
example
)


44 


45 
	
if
 
nif
 
!=
 
Nif
(
test
.
example
)
 
{


46 
		
t
.
Errorf
(
"Expected Nif(%s), got %s"
,
 
test
.
example
,
 
nif
)


47 
	
}


48 


49 
	
if
 
err
 
!=
 
nil
 
{


50 
		
t
.
Errorf
(
"Unexpected error %s"
,
 
err
.
Error
())


51 
	
}


52 

})


53 

}


54 
}

```

Ya tenemos este test fallando, así que vamos a hacer una implementación muy sencilla:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 

"strconv"


 7 
)


 8 


 9 
type
 
Nif
 
string


10 


11 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


12 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


13 


14 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


15 

return
 
""
,
 
errors
.
New
(
"bad format"
)


16 

}


17 


18 

control
 
:=
 
string
(
candidate
[
8
])


19 


20 

numeric
,
 
_
 
:=
 
strconv
.
Atoi
(
candidate
[
0
:
8
])


21 


22 

modulus
 
:=
 
numeric
 
%
 
23


23 


24 

if
 
control
 
==
 
"T"
 
&&
 
modulus
 
==
 
0
 
{


25 

return
 
Nif
(
candidate
),
 
nil


26 

}


27 


28 

if
 
control
 
==
 
"R"
 
&&
 
modulus
 
==
 
1
 
{


29 

return
 
Nif
(
candidate
),
 
nil


30 

}


31 


32 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


33 
}

```

Esto ya nos da una idea de por dónde van los tiros: un mapa entre letras de control y el resto al dividir por 23. Sin embargo, es frecuente que los `strings` puedan funcionar como `arrays` en muchos lenguajes, por lo que nos basta tener un `string` con todas las letras de control ordenadas y acceder a la letra en la posición indicada por el módulo para saber cual es la correcta.

## Un refactor para más simplicidad

Primero implementamos una versión simple de esta idea:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 

"strconv"


 7 
)


 8 


 9 
type
 
Nif
 
string


10 


11 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


12 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


13 


14 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


15 

return
 
""
,
 
errors
.
New
(
"bad format"
)


16 

}


17 


18 

controlMap
 
:=
 
"TR"


19 


20 

control
 
:=
 
candidate
[
8
]


21 


22 

numeric
,
 
_
 
:=
 
strconv
.
Atoi
(
candidate
[
0
:
8
])


23 


24 

modulus
 
:=
 
numeric
 
%
 
23


25 


26 

if
 
control
 
==
 
controlMap
[
modulus
]
 
{


27 

return
 
Nif
(
candidate
),
 
nil


28 

}


29 


30 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


31 
}

```

Ya tenemos una primera versión. Luego añadiremos la lista completa de letras, pero podemos intentar arreglar un poco el código actual. Primero hacemos que `controlMap` sea constante:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 

"strconv"


 7 
)


 8 


 9 
type
 
Nif
 
string


10 


11 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


12 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


13 


14 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


15 

return
 
""
,
 
errors
.
New
(
"bad format"
)


16 

}


17 


18 

const
 
controlMap
 
=
 
"TR"


19 


20 

control
 
:=
 
candidate
[
8
]


21 


22 

numeric
,
 
_
 
:=
 
strconv
.
Atoi
(
candidate
[
0
:
8
])


23 


24 

modulus
 
:=
 
numeric
 
%
 
23


25 


26 

if
 
control
 
==
 
controlMap
[
modulus
]
 
{


27 

return
 
Nif
(
candidate
),
 
nil


28 

}


29 


30 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


31 
}

```

En realidad podríamos extraer toda la parte del cálculo del módulo a otra función. Primero reorganizamos el código para controlar mejor la extracción:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 

"strconv"


 7 
)


 8 


 9 
type
 
Nif
 
string


10 


11 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


12 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


13 


14 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


15 

return
 
""
,
 
errors
.
New
(
"bad format"
)


16 

}


17 


18 

control
 
:=
 
candidate
[
8
]


19 


20 

const
 
controlMap
 
=
 
"TR"


21 

numeric
,
 
_
 
:=
 
strconv
.
Atoi
(
candidate
[
0
:
8
])


22 

modulus
 
:=
 
numeric
 
%
 
23


23 

shouldBe
 
:=
 
controlMap
[
modulus
]


24 


25 

if
 
control
 
==
 
shouldBe
 
{


26 

return
 
Nif
(
candidate
),
 
nil


27 

}


28 


29 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


30 
}

```

Recuerda verificar que pasan los tests. Ahora extraemos la función:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 

"strconv"


 7 
)


 8 


 9 
type
 
Nif
 
string


10 


11 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


12 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


13 


14 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


15 

return
 
""
,
 
errors
.
New
(
"bad format"
)


16 

}


17 


18 

control
 
:=
 
candidate
[
8
]


19 


20 

if
 
control
 
==
 
shouldHaveControl
(
candidate
)
 
{


21 

return
 
Nif
(
candidate
),
 
nil


22 

}


23 


24 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


25 
}


26 


27 
func
 
shouldHaveControl
(
candidate
 
string
)
 
uint8
 
{


28 

const
 
controlMap
 
=
 
"TR"


29 

numeric
,
 
_
 
:=
 
strconv
.
Atoi
(
candidate
[
0
:
8
])


30 

modulus
 
:=
 
numeric
 
%
 
23


31 


32 

return
 
controlMap
[
modulus
]


33 
}

```

Y podemos compactar el código un poco más, mientras que añadimos las demás letras de control. A primera vista parece “trampa”, pero en el fondo no es más que generalizar un algoritmo que se podría enunciar como “toma la letra que hay en la posición dada por el **mod23** de la parte numérica”.

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 

"strconv"


 7 
)


 8 


 9 
type
 
Nif
 
string


10 


11 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


12 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


13 


14 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


15 

return
 
""
,
 
errors
.
New
(
"bad format"
)


16 

}


17 


18 

if
 
candidate
[
8
]
 
==
 
shouldHaveControl
(
candidate
)
 
{


19 

return
 
Nif
(
candidate
),
 
nil


20 

}


21 


22 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


23 
}


24 


25 
func
 
shouldHaveControl
(
candidate
 
string
)
 
uint8
 
{


26 

const
 
controlMap
 
=
 
"TRWAGMYFPDXBNJZSQVHLCKE"


27 


28 

numeric
,
 
_
 
:=
 
strconv
.
Atoi
(
candidate
[
0
:
8
])


29 

modulus
 
:=
 
numeric
 
%
 
23


30 


31 

return
 
controlMap
[
modulus
]


32 
}

```

Con esto ya podemos validar todos los NIF, excepto los NIE, que empiezan por las letras `X`, `Y` ó `Z`.

## Dar soporte a NIE

Ahora que hemos implementado el algoritmo general vamos a tratar sus excepciones, que no son tanto. Los NIE comienzan con una letra que a efectos del cálculo se reemplaza con un número.

El test que parece más evidente en este punto es el siguiente:

```

 1 
func
 
TestShouldCreateNifTypeWithValidCandidate
(
t
 
*
testing
.
T
)
 
{


 2 

tests
 
:=
 
[]
struct
 
{


 3 

name
 
string


 4 

example
 
string


 5 

}{


 6 

{
"should accept mod23 being 0"
,
 
"00000000T"
},


 7 

{
"should accept mod23 being 0 letter T"
,
 
"00000023T"
},


 8 

{
"should accept mod23 being 1 letter R"
,
 
"00000024R"
},


 9 

{
"should accept NIE starting with X"
,
 
"X0000023T"
},


10 

}


11 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


12 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


13 
	
nif
,
 
err
 
:=
 
NewNif
(
test
.
example
)


14 


15 
	
if
 
nif
 
!=
 
Nif
(
test
.
example
)
 
{


16 
		
t
.
Errorf
(
"Expected Nif(%s), got %s"
,
 
test
.
example
,
 
nif
)


17 
	
}


18 


19 
	
if
 
err
 
!=
 
nil
 
{


20 
		
t
.
Errorf
(
"Unexpected error %s"
,
 
err
.
Error
())


21 
	
}


22 

})


23 

}


24 
}

```

El caso `X0000023T` es equivalente a `00000023T`, ¿afectará eso al resultado del test?

Ejecutamos el test y… ¿sorpresa? El test pasa. Esto ocurre porque la conversión que hacemos en esta línea genera un error que actualmente estamos ignorando, pero permite que la parte numérica siga siendo equivalente a 23, cuyo **mod23** es 0 y le corresponde igualmente la letra `T`.

```

1 

numeric
,
 
_
 
:=
 
strconv
.
Atoi
(
candidate
[
0
:
8
])

```

En otro lenguajes la conversión no falla, pero asume la X como 0 al realizar la conversión.

En cualquier caso eso nos abre dos posible caminos:

* anular este test y refactorizar el código de producción para tratar el error y que el test falle cuando lo volvamos a incluir
* probar otro ejemplo que sí pueda fallar (`Y0000000Z`) y hacer el cambio después

Posiblemente para este caso la segunda opción sería más que suficiente ya que con nuestras validaciones estructurales ya garantizaríamos que el error no tiene posibilidad de aparecer una vez que la función esté completamente desarrollada.

Sin embargo, podría ser interesante introducir la gestión del error. Manejar los errores, incluyendo los que  *nunca podrían llegar a pasar* , es siempre una buena práctica.

Así que, anulemos el test e introduzcamos un refactor para manejar el error:

```

 1 
func
 
TestShouldCreateNifTypeWithValidCandidate
(
t
 
*
testing
.
T
)
 
{


 2 

tests
 
:=
 
[]
struct
 
{


 3 

name
 
string


 4 

example
 
string


 5 

}{


 6 

{
"should accept mod23 being 0"
,
 
"00000000T"
},


 7 

{
"should accept mod23 being 0 letter T"
,
 
"00000023T"
},


 8 

{
"should accept mod23 being 1 letter R"
,
 
"00000024R"
},


 9 

//{"should accept NIE starting with X", "X0000023X"},


10 

}


11 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


12 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


13 
	
nif
,
 
err
 
:=
 
NewNif
(
test
.
example
)


14 


15 
	
if
 
nif
 
!=
 
Nif
(
test
.
example
)
 
{


16 
		
t
.
Errorf
(
"Expected Nif(%s), got %s"
,
 
test
.
example
,
 
nif
)


17 
	
}


18 


19 
	
if
 
err
 
!=
 
nil
 
{


20 
		
t
.
Errorf
(
"Unexpected error %s"
,
 
err
.
Error
())


21 
	
}


22 

})


23 

}


24 
}

```

Aquí el refactor. En este caso, gestiono el error provocando un `panic`, que no es la mejor manera de gestionar un error, pero que nos permite hacer que el test pueda fallar y obligarnos a implementar la solución.

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 

"strconv"


 7 
)


 8 


 9 
type
 
Nif
 
string


10 


11 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


12 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


13 


14 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


15 

return
 
""
,
 
errors
.
New
(
"bad format"
)


16 

}


17 


18 

if
 
candidate
[
8
]
 
==
 
shouldHaveControl
(
candidate
)
 
{


19 

return
 
Nif
(
candidate
),
 
nil


20 

}


21 


22 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


23 
}


24 


25 
func
 
shouldHaveControl
(
candidate
 
string
)
 
uint8
 
{


26 

const
 
controlMap
 
=
 
"TRWAGMYFPDXBNJZSQVHLCKE"


27 


28 

numeric
,
 
err
 
:=
 
strconv
.
Atoi
(
candidate
[
0
:
8
])


29 


30 

if
 
err
 
!=
 
nil
 
{


31 

panic
(
"Numeric part contains letters"
)


32 

}


33 


34 

modulus
 
:=
 
numeric
 
%
 
23


35 


36 

return
 
controlMap
[
modulus
]


37 
}

```

Al ejecutar los tests, comprobamos que siguen en verde. Pero si reactivamos el último test vemos cómo falla:

```

 1 
func
 
TestShouldCreateNifTypeWithValidCandidate
(
t
 
*
testing
.
T
)
 
{


 2 

tests
 
:=
 
[]
struct
 
{


 3 

name
 
string


 4 

example
 
string


 5 

}{


 6 

{
"should accept mod23 being 0"
,
 
"00000000T"
},


 7 

{
"should accept mod23 being 0 letter T"
,
 
"00000023T"
},


 8 

{
"should accept mod23 being 1 letter R"
,
 
"00000024R"
},


 9 

{
"should accept NIE starting with X"
,
 
"X0000023X"
},


10 

}


11 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


12 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


13 
	
nif
,
 
err
 
:=
 
NewNif
(
test
.
example
)


14 


15 
	
if
 
nif
 
!=
 
Nif
(
test
.
example
)
 
{


16 
		
t
.
Errorf
(
"Expected Nif(%s), got %s"
,
 
test
.
example
,
 
nif
)


17 
	
}


18 


19 
	
if
 
err
 
!=
 
nil
 
{


20 
		
t
.
Errorf
(
"Unexpected error %s"
,
 
err
.
Error
())


21 
	
}


22 

})


23 

}


24 
}

```

Y esto ya nos obliga a introducir un tratamiento para estos casos. Básicamente es reemplazar la `X` por `0`:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 

"strconv"


 7 

"strings"


 8 
)


 9 


10 
type
 
Nif
 
string


11 


12 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


13 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


14 


15 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


16 

return
 
""
,
 
errors
.
New
(
"bad format"
)


17 

}


18 


19 

if
 
candidate
[
8
]
 
==
 
shouldHaveControl
(
candidate
)
 
{


20 

return
 
Nif
(
candidate
),
 
nil


21 

}


22 


23 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


24 
}


25 


26 
func
 
shouldHaveControl
(
candidate
 
string
)
 
uint8
 
{


27 

const
 
controlMap
 
=
 
"TRWAGMYFPDXBNJZSQVHLCKE"


28 


29 

var
 
numPart
 
=
 
candidate
[
0
:
8
]


30 


31 

if
 
string
(
candidate
[
0
])
 
==
 
"X"
 
{


32 

numPart
 
=
 
strings
.
Replace
(
numPart
,
 
"X"
,
 
"0"
,
 
1
)


33 

}


34 


35 

numeric
,
 
err
 
:=
 
strconv
.
Atoi
(
numPart
)


36 


37 

if
 
err
 
!=
 
nil
 
{


38 

panic
(
"Numeric part contains letters"
)


39 

}


40 


41 

modulus
 
:=
 
numeric
 
%
 
23


42 


43 

return
 
controlMap
[
modulus
]


44 
}

```

Se puede refactorizar usando un `Replacer`:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 

"strconv"


 7 

"strings"


 8 
)


 9 


10 
type
 
Nif
 
string


11 


12 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


13 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


14 


15 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


16 

return
 
""
,
 
errors
.
New
(
"bad format"
)


17 

}


18 


19 

if
 
candidate
[
8
]
 
==
 
shouldHaveControl
(
candidate
)
 
{


20 

return
 
Nif
(
candidate
),
 
nil


21 

}


22 


23 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


24 
}


25 


26 
func
 
shouldHaveControl
(
candidate
 
string
)
 
uint8
 
{


27 

const
 
controlMap
 
=
 
"TRWAGMYFPDXBNJZSQVHLCKE"


28 


29 

var
 
numPart
 
=
 
candidate
[
0
:
8
]


30 


31 

re
 
:=
 
strings
.
NewReplacer
(
"X"
,
 
"0"
)


32 


33 

numeric
,
 
err
 
:=
 
strconv
.
Atoi
(
re
.
Replace
(
numPart
))


34 


35 

if
 
err
 
!=
 
nil
 
{


36 

panic
(
"Numeric part contains letters"
)


37 

}


38 


39 

modulus
 
:=
 
numeric
 
%
 
23


40 


41 

return
 
controlMap
[
modulus
]


42 
}

```

En este punto podríamos hacer un test para forzarnos a introducir el resto de reemplazos. Es barato, aunque en el fondo no es muy necesario por lo que comentamos antes: podemos interpretar esta parte del algoritmo como “reemplazar las letras iniciales X, Y y Z por los números 0, 1 y 2, respectivamente”:

```

 1 
package
 
nif


 2 


 3 
import
 
"testing"


 4 


 5 
func
 
TestShouldFailIfCandidateIsInvalid
(
t
 
*
testing
.
T
)
 
{


 6 

tests
 
:=
 
[]
struct
 
{


 7 

name
 
string


 8 

example
 
string


 9 

expected
 
string


10 

}{


11 

{
"should fail if too long"
,
 
"01234567891011"
,
 
"bad format"
},


12 

{
"should fail if too short"
,
 
"01234"
,
 
"bad format"
},


13 

{
"should fail if starts with a letter other than X, Y, Z"
,
 
"A12345678"
,
 
"bad format"
},


14 

{
"should fail if doesn't have 7 digit in the middle"
,
 
"0123X567R"
,
 
"bad format"
},


15 

{
"should fail if doesn't end with a valid control letter"
,
 
"01234567U"
,
 
"invalid end fo\


16 
rmat"
},


17 

{
"should fail if doesn't end with the right control letter"
,
 
"00000000S"
,
 
"bad control \


18 
letter"
},


19 


20 

}


21 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


22 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


23 
	
_
,
 
err
 
:=
 
NewNif
(
test
.
example
)


24 


25 
	
if
 
err
.
Error
()
 
!=
 
test
.
expected
  
&&
 
err
.
Error
()
 
!=
 
"bad format"
 
{


26 
		
t
.
Errorf
(
"Expected %s, got %s"
,
 
test
.
expected
,
 
err
.
Error
())


27 
	
}


28 

})


29 

}


30 
}


31 


32 
func
 
TestShouldCreateNifTypeWithValidCandidate
(
t
 
*
testing
.
T
)
 
{


33 

tests
 
:=
 
[]
struct
 
{


34 

name
 
string


35 

example
 
string


36 

}{


37 

{
"should accept mod23 being 0"
,
 
"00000000T"
},


38 

{
"should accept mod23 being 0 letter T"
,
 
"00000023T"
},


39 

{
"should accept mod23 being 1 letter R"
,
 
"00000024R"
},


40 

{
"should accept NIE starting with X"
,
 
"X0000000T"
},


41 

{
"should accept NIE starting with Y"
,
 
"Y0000000Z"
},


42 

}


43 

for
 
_
,
 
test
 
:=
 
range
 
tests
 
{


44 

t
.
Run
(
test
.
name
,
 
func
(
t
 
*
testing
.
T
)
 
{


45 
	
nif
,
 
err
 
:=
 
NewNif
(
test
.
example
)


46 


47 
	
if
 
nif
 
!=
 
Nif
(
test
.
example
)
 
{


48 
		
t
.
Errorf
(
"Expected Nif(%s), got %s"
,
 
test
.
example
,
 
nif
)


49 
	
}


50 


51 
	
if
 
err
 
!=
 
nil
 
{


52 
		
t
.
Errorf
(
"Unexpected error %s"
,
 
err
.
Error
())


53 
	
}


54 

})


55 

}


56 
}

```

Sólo es necesario añadir los pares correspondientes:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 

"strconv"


 7 

"strings"


 8 
)


 9 


10 
type
 
Nif
 
string


11 


12 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


13 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


14 


15 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


16 

return
 
""
,
 
errors
.
New
(
"bad format"
)


17 

}


18 


19 

if
 
candidate
[
8
]
 
==
 
shouldHaveControl
(
candidate
)
 
{


20 

return
 
Nif
(
candidate
),
 
nil


21 

}


22 


23 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


24 
}


25 


26 
func
 
shouldHaveControl
(
candidate
 
string
)
 
uint8
 
{


27 

const
 
controlMap
 
=
 
"TRWAGMYFPDXBNJZSQVHLCKE"


28 


29 

var
 
numPart
 
=
 
candidate
[
0
:
8
]


30 


31 

re
 
:=
 
strings
.
NewReplacer
(
"X"
,
 
"0"
,
 

32 
	                      
"Y"
,
 
"1"
,
 

33 
	                      
"Z"
,
 
"2"
)


34 


35 

numeric
,
 
err
 
:=
 
strconv
.
Atoi
(
re
.
Replace
(
numPart
))


36 


37 

if
 
err
 
!=
 
nil
 
{


38 

panic
(
"Numeric part contains letters"
)


39 

}


40 


41 

modulus
 
:=
 
numeric
 
%
 
23


42 


43 

return
 
controlMap
[
modulus
]


44 
}

```

Después de un rato de refactor, esta sería una posible solución:

```

 1 
package
 
nif


 2 


 3 
import
 
(


 4 

"errors"


 5 

"regexp"


 6 

"strconv"


 7 

"strings"


 8 
)


 9 


10 
type
 
Nif
 
string


11 


12 
func
 
NewNif
(
candidate
 
string
)
 
(
Nif
,
 
error
)
 
{


13 

valid
 
:=
 
regexp
.
MustCompile
(
`(?i)^[0-9XYZ]\d{7}[^UIOÑ0-9]$`
)


14 


15 

if
 
!
valid
.
MatchString
(
candidate
)
 
{


16 

return
 
""
,
 
errors
.
New
(
"bad format"
)


17 

}


18 


19 

if
 
candidate
[
8
]
 
!=
 
controlLetterFor
(
candidate
)
 
{


20 

return
 
""
,
 
errors
.
New
(
"bad control letter"
)


21 

}


22 


23 

return
 
Nif
(
candidate
),
 
nil


24 
}


25 


26 
func
 
controlLetterFor
(
candidate
 
string
)
 
uint8
 
{


27 

const
 
controlMap
 
=
 
"TRWAGMYFPDXBNJZSQVHLCKE"


28 


29 

position
,
 
err
 
:=
 
controlPosition
(
candidate
[
0
:
8
])


30 


31 

if
 
err
 
!=
 
nil
 
{


32 

panic
(
"Numeric part contains letters"
)


33 

}


34 


35 

return
 
controlMap
[
position
]


36 
}


37 


38 
func
 
controlPosition
(
numPart
 
string
)
 
(
int
,
 
error
)
 
{


39 

re
 
:=
 
strings
.
NewReplacer
(
"X"
,
 
"0"
,
 
"Y"
,
 
"1"
,
 
"Z"
,
 
"2"
)


40 


41 

numeric
,
 
err
 
:=
 
strconv
.
Atoi
(
re
.
Replace
(
numPart
))


42 


43 

return
 
numeric
 
%
 
23
,
 
err


44 
}

```

## Qué hemos aprendido con esta kata

* Utilizar sad paths para mover el desarrollo
* Utilizar table tests en Go reduciendo el coste de añadir nuevos tests
* Una técnica para cambiar los errores devueltos por otro más general sin romper los tests
* Una técnica para cambiar la interfaz pública del código de producción sin romper los tests

## Referencias

* [Is Go object oriented?](https://flaviocopes.com/golang-is-go-object-oriented/)^[1](https://leanpub.com/tddcourse/read#fn-fn37)^



# 14 La fase de refactor

En capítulos anteriores, mencionamos las leyes de TDD. Originalmente, estas leyes eran dos, en la formulación de Kent Beck:

* No escribir una línea de código sin antes tener un test automático que falle
* Eliminar la duplicación

En esencia, lo que Kent Beck proponía es definir primero una pequeña parte de la especificación mediante un test, implementar un algoritmo muy pequeño que la satisfaga y, a continuación, revisar el código en busca de casos de duplicación para refactorizarlos en un algoritmo más general y flexible.

Y eso es, más o menos, como define Martin Fowler el ciclo Red-Green-Refactor:

* Escribe un test para el siguiente fragmento de funcionalidad que deseas añadir
* Escribe el código de producción necesario para que el test pase
* Refactoriza el código, tanto el nuevo como el anterior, para que esté bien estructurado

Este enunciado parece dar por sentado que el refactor es, por así decir, el final de cada etapa del proceso. Pero, paradójicamente, si interpretamos el ciclo al pie de la letra caeremos en una mala práctica.

## La función del refactor en TDD

Por lo general, en *Test Driven Development* se favorece que tanto los tests como los cambios en el código de producción sean lo más pequeños posibles. Este enfoque minimalista es beneficioso porque nos permite trabajar con poca carga cognitiva en cada ciclo, mientras aprendemos y alcanzamos una mayor y más profunda comprensión del problema, aplazando decisiones hasta un momento en que estemos mejor informadas para afrontarlas.

Normalmente, los pequeños pasos en TDD nos permiten hacer cambios de código muy sencillos cada vez. Muchas veces estos cambios son obvios y nos llevan a implementaciones que podríamos considerar ingenuas. Sin embargo, por muy sencillas o bastas que nos parezcan, estas implementaciones hacen pasar los tests y, por tanto, cumplen las especificaciones. Podríamos entregar ese código si es el caso porque el comportamiento ha sido desarrollado.

La fase de refactor está precisamente para hacer evolucionar esas implementaciones ingenuas a mejores diseños teniendo la red de seguridad que nos proporcionan los tests que están pasando.

## Que refactors ejecutar

En cada ciclo es posible realizar diversos refactors. Obviamente, en las primeras fases serán más pequeños e incluso es posible que nos parezca que no son necesarios. Sin embargo, es conveniente aprovechar la oportunidad cuando se presenta.

Podemos hacer muchos tipos de refactors, entre otros:

* Introducir constantes para reemplazar valores mágicos.
* Cambiar nombres de variables y parámetros para reflejar mejor sus intenciones.
* Extraer métodos privados.
* Extraer condicionales a métodos cuando se vuelvan complejas.
* Aplanar estructuras condicionales anidadas.
* Extraer ramas de condicionales a métodos privados.
* Extraer funcionalidad a colaboradores.

## Límites del refactor

En ocasiones, un *exceso* de refactor puede llevarnos a que la implementación se complique y sea difícil avanzar en el proceso de TDD. Esto ocurre cuando introducimos ciertos patrones de forma prematura, sin que el desarrollo esté todavía terminado. Sería un *refactor prematuro* parecido a la  *optimización prematura* , generando un código difícil de mantener.

Podríamos decir que hay dos modalidades de refactor implicadas:

* Una de alcance limitado aplicable en cada ciclo red-green-refactor cuya función es facilitar la legibilidad, sostenibilidad y capacidad de evolución del algoritmo en desarrollo.
* La otra que tendrá lugar una vez que hemos completado toda la funcionalidad y cuyo objetivo es introducir un diseño más evolucionado y orientado a patrones.

Otra cuestión interesante es la introducción de características exclusivas o propias del lenguaje, que en principio también convendría posponer hasta esa fase final. ¿Por qué dejarlas para este momento? Precisamente porque pueden limitar nuestra capacidad de refactorizar un código si todavía no tenemos seguridad acerca de hacia dónde podría evolucionar.

Por ejemplo, en Ruby esta construcción:

```

1 
def
 
greet
(
name
 
=
 
nil
)


2 
  
if
 
name
.
nil?


3 
  
name
 
=
 
'my friend'


4 
  
end


5 


6 
  
"Hello, 
#{
name
}
"


7 
end

```

Podría refactorizarse, y de hecho se recomienda, de esta forma que me parece realmente bonita:

```

1 
def
 
greet
(
name
 
=
 
nil
)


2 
  
name
 
=
 
'my friend'
 
if
 
name
.
nil?


3 


4 
  
"Hello, 
#{
name
}
"


5 
end

```

En este caso, la estructura representa la idea de asignar un valor por defecto a la variable, algo que podríamos conseguir también de este modo, el cual es común a otros lenguajes:

```

1 
def
 
greet
(
name
 
=
 
'my friend'
)


2 
  
"Hello, 
#{
name
}
"


3 
end

```

Las tres variantes hacen pasar los tests, pero cada una de ellas nos coloca en una posición ligeramente distinta de cara a los futuros requerimientos.

Por ejemplo, supongamos que nuestro próximo requerimiento nos pide poder introducir varios nombres. Una posible solución para eso es usar  *splat parameters* , es decir, que la función admita un número indefinido de parámetros que luego se presentarán dentro del método como un `array`. En Ruby esto se expresa así:

```

1 
def
 
greet
(
*
name
)


2 
  
#


3 
end

```

Esta declaración, por ejemplo, es incompatible con la tercera variante ya que el *splat operator* no admite un valor por defecto y tendremos que reimplementar ese paso, lo que nos llevará de nuevo a utilizar una de las otras variantes.

En principio no parece que sea un gran inconveniente pero implica deshacer toda la lógica que venga determinada por esa estructura y, según el momento de desarrollo en que nos encontremos puede llevarnos incluso a callejones sin salida.

En las otras opciones, es un poco menos inconveniente. Además de cambiar la signatura lo único que tenemos que modificar es la pregunta (`empty?` por `nil?`) y el valor por defecto que, en lugar de un `string`, pasa a ser un `array` de `string`. Por supuesto, para finalizar tenemos que hacer un `join` de la colección para poder mostrarlo en el saludo.

```

1 
def
 
greet
(
*
name
)


2 
  
if
 
name
.
empty?


3 
  
name
 
=
 
[
'my friend'
]


4 
  
end


5 


6 
  
names
 
=
 
name
.
join
(
', '
)


7 


8 
  
"Hello, 
#{
names
}
"


9 
end

```

O la versión  *rubyficada* :

```

1 
def
 
greet
(
*
name
)


2 
  
name
 
=
 
[
'my friend'
]
 
if
 
name
.
empty?


3 


4 
  
names
 
=
 
name
.
join
(
', '
)


5 


6 
  
"Hello, 
#{
names
}
"


7 
end

```

Aparte de eso, sería necesario en este punto un refactor del nombre del parámetro que exprese más claramente su nuevo significado:

```

1 
def
 
greet
(
*
people
)


2 
  
people
 
=
 
[
'my friend'
]
 
if
 
people
.
empty?


3 


4 
  
names
 
=
 
people
.
join
(
', '
)


5 


6 
  
"Hello, 
#{
names
}
"


7 
end

```

Así que como recomendación general es conveniente buscar un equilibrio entre los refactors que nos ayudan a mantener el código limpio y legible de aquellos que podríamos considerar como sobreingeniería. Una implementación un poco menos refinada puede ser más fácil de cambiar que una muy evolucionada a medida que se introducen nuevos tests.

No *sobre refactorices* antes de tiempo.

## Cuando es el momento de hacer refactor

Para hacer refactor la condición *sine qua non* es que todos los tests existentes estén pasando. En este momento nos interesa analizar el estado de la implementación y aplicar los refactors que mejor le vayan.

Si un test está en rojo nos indica que una parte de la especificación no está conseguida y, por lo tanto, debemos trabajar en eso y no en el refactor.

Pero hay un caso especial: cuando añadimos un nuevo test que falla y nos damos cuenta de que necesitamos un refactor previo para poder implementar la solución más obvia o sencilla para ese test.

¿Cómo actuamos en este caso? Pues tenemos que dar un paso atrás.

### El paso atrás en el ciclo Red-Green-Refactor

Supongamos un ejemplo sencillo. Vamos a iniciar la [Greeting kata de testdouble](https://github.com/testdouble/contributing-tests/wiki/Greeting-Kata). Empezamos con un test con el que definir la interfaz:

```

1 
require
 
'rspec'


2 


3 
RSpec
.
describe
 
'A simple greeting'
 
do


4 
  
it
 
'should greet a person'
 
do


5 
  
expect
(
greet
(
'Fran'
))
.
to
 
eq
(
'Hello, Fran'
)


6 
  
end


7 
end

```

Nuestro siguiente paso es crear la implementación más sencilla para que el test pase, cosa que podríamos hacer así:

```

1 
def
 
greet
(
name
)


2 
  
'Hello, Fran'


3 
end

```

El siguiente requerimiento es que maneje el caso de que no se proporcione nombre, en cuyo caso debe ofrecer alguna fórmula anónima como la que ponemos de ejemplo en este test:

```

 1 
require
 
'rspec'


 2 


 3 
def
 
greet
(
name
)


 4 
  
'Hello, Fran'


 5 
end


 6 


 7 
RSpec
.
describe
 
'A simple greeting'
 
do


 8 
  
it
 
'should greet a person'
 
do


 9 
  
expect
(
greet
(
'Fran'
))
.
to
 
eq
(
'Hello, Fran'
)


10 
  
end


11 


12 
  
it
 
'should greet even if no name provided'
 
do


13 
  
expect
(
greet
)
.
to
 
eq
(
'Hello, my friend'
)


14 
  
end


15 
end

```

El test falla en primer lugar porque el argumento no es opcional. Pero es que además no se usa en la implementación actual y necesitamos usarlo para hacer lo más obvio que requiere este test. Tenemos que ejecutar varios pasos preparatorios antes de poder realizar la implementación, a saber:

* Hacer opcional el parámetro `name`
* Usar el parámetro en el valor de retorno

El caso es que con el nuevo requerimiento tenemos nueva información que nos sería útil para refactorizar lo desarrollado gracias al primer test. Sin embargo, como tenemos un nuevo test que falla, no deberíamos hacer refactor, por lo que eliminamos o anulamos el test anterior. Por ejemplo, comentándolo:

```

 1 
require
 
'rspec'


 2 


 3 
def
 
greet
(
name
)


 4 
  
'Hello, Fran'


 5 
end


 6 


 7 
RSpec
.
describe
 
'A simple greeting'
 
do


 8 
  
it
 
'should greet a person'
 
do


 9 
  
expect
(
greet
(
'Fran'
))
.
to
 
eq
(
'Hello, Fran'
)


10 
  
end


11 
  

12 
  
# it 'should greet even if no name provided' do


13 
  
#   expect(greet).to eq('Hello, my friend')


14 
  
# end


15 
end

```

Al hacer así, volvemos a tener los tests en verde y podemos aplicar los cambios necesarios, que no alteran el comportamiento implementado hasta el momento.

Hacemos opcional el parámetro del nombre.

```

1 
def
 
greet
(
name
 
=
 
nil
)


2 
  
'Hello, Fran'


3 
end

```

Aquí empezamos a dar uso al parámetro:

```

1 
def
 
greet
(
name
)


2 
  
"Hello, 
#{
name
}
"


3 
end

```

Esto nos ha permitido pasar de nuestra primera implementación tosca a una lo bastante flexible con la que el test sigue pasando y estamos en mejores condiciones para volver a introducir el siguiente test:

```

 1 
require
 
'rspec'


 2 


 3 
def
 
greet
(
name
 
=
 
nil
)


 4 
  
"Hello, 
#{
name
}
"


 5 
end


 6 


 7 
RSpec
.
describe
 
'A simple greeting'
 
do


 8 
  
it
 
'should greet a person'
 
do


 9 
  
expect
(
greet
(
'Fran'
))
.
to
 
eq
(
'Hello, Fran'
)


10 
  
end


11 


12 
  
it
 
'should greet even if no name provided'
 
do


13 
  
expect
(
greet
)
.
to
 
eq
(
'Hello, my friend'
)


14 
  
end


15 
end

```

Obviamente, el test falla, pero la razón del fallo es justamente que nos falta código que resuelva el requerimiento. Lo único que tenemos que hacer es comprobar si recibimos un nombre o no, y actuar en consecuencia.

```

1 
def
 
greet
(
name
 
=
 
nil
)


2 
  
if
 
name
.
nil?


3 
  
name
 
=
 
'my friend'


4 
  
end


5 
  

6 
  
"Hello, 
#{
name
}
"


7 
end

```

En cierto modo, resulta que la  *información del futuro* , o sea, el nuevo test que planteamos para introducir la siguiente funcionalidad,  *afecta al pasado* , es decir al estado adecuado del código para poder continuar, y nos obliga a considerar la profundidad del refactor necesario antes de afrontar el nuevo ciclo. En esta situación, lo mejor es volver al último test que pasaba, anulando el nuevo, y trabajar en el refactor hasta estar mejor preparadas para continuar avanzando.



# 15 Bowling game

## La fase de refactor

En las katas anteriores, por lo general, los ciclos de TDD se ejecutaban de forma bastante fluida.

Sin embargo, es posible que hayas notado que, en algún momento, hacer pasar un nuevo test implicaba un cierto refactor del código de producción antes de poder afrontar los cambios necesarios para hacer pasar el test.

La kata que vamos a practicar ahora, además de ser una de las clásicas, tiene la particularidad de que casi cada nueva funcionalidad que añadimos, cada nuevo test, require un refactor relativamente grande del algoritmo. Eso nos pone en un dilema: no podemos estar refactorizando si el test no está en verde.

O dicho de otro modo: en ocasiones nos encontraremos que el nuevo test nos proporciona una información que no teníamos antes y que nos muestra una oportunidad de refactor que debemos afrontar **antes** de implementar la parte nueva de funcionalidad.

Por eso, con la kata  *Bowling Game* , aprenderemos cómo manejar esta situación y dar un paso atrás para refactorizar el código de producción con lo aprendido al pensar en el nuevo test.

En cierto modo, la información del futuro nos ayudará a cambiar el pasado.

## Historia

La Bowling kata es muy conocida. Se la debemos a Robert C. Martin, aunque una versión muy popular es la de Ron Jeffreys en el libro *Adventures in C#*

## Enunciado

La kata consiste en crear un programa para calcular las puntuaciones del juego de los Bolos, aunque para evitar complicarla mucho sólo se calcula el resultado final y no se hacen validaciones sobre las puntuaciones.

Si no tienes familiaridad con el juego y su sistema de puntuación, aquí van las reglas que es necesario conocer:

* En cada juego, el jugador o jugadora tiene 10 turnos, llamados  *frames* .
* Dentro de cada  *frame* , se dispone de dos intentos para tumbar los 10 bolos (eso hace un total de 20 intentos o lanzamientos de bola en todo el juego).
* En cada intento, se cuentan los bolos tumbados y la puntuación del frame es la suma de ambos intentos.
* Si no se tira ningún bolo es un  *Gutter* .
* Si no se han tirado todos los bolos en los dos intentos esa será la puntuación. Por ejemplo 3 + 5 = 8 puntos en el  *frame* .
* Si se han tumbado los 10 bolos en el *frame* (por ejemplo 4 + 6), a eso se le llama *spare* y se obtiene un *bonus* que será la puntuación del siguiente lanzamiento, el primero del siguiente *frame* (10 del *frame* actual + 3 del siguiente lanzamiento = 13). Esto es, la puntuación final de un *spare* se calcula **después** del siguiente lanzamiento y, por así decir, ese lanzamiento se cuenta dos veces (una como bonus y otra normal).
* Si se han tumbado los 10 bolos en un sólo lanzamiento es un *strike* y en ese caso, el *bonus* es la puntuación del siguiente *frame* (por ejemplo, 10 + (3 + 4) = 17).
* En el caso de que esto se produzca en el último frame, se hacen uno ó dos lanzamientos extras según sea necesario.

## Orientaciones para resolverla

La *Bowling Game* es una kata interesante por el reto que plantea el tratamiento de los *spares* y  *strikes* . Cuando detectamos uno de estos casos, tenemos que consultar el resultado de los siguientes lanzamientos por lo que necesitamos conservar la historia de la partida.

Esto nos obligará a cambiar el algoritmo varias veces de una forma un tanto radical, lo que nos pone ante el problema de cómo gestionar estos cambios sin romper los ciclos de TDD, es decir, refactorizando el código de producción mientras se mantienen los tests pasando.

Para entender mejor lo que queremos decir, la situación sería la siguiente:

Después de un par de ciclos comenzamos a testear por el caso  *spare* . En ese punto nos damos cuenta de que necesitamos hacer un cambio relativamente grande al modo en que estábamos calculando la puntuación total. En último término, lo que ocurre es que tenemos que refactorizar mientras un test no pasa. Pero es es contradictorio con la definición de la fase de refactor que exige que todos los tests estén pasando.

La solución, por suerte, es muy sencilla:  **dar un paso atrás** .

Una vez que sabemos que queremos refactorizar el algoritmo, nos basta comentar el nuevo test para desactivarlo y, con el test anterior pasando, refactorizar el código de producción. Cuando lo tengamos, volvemos a traer a la vida el nuevo test y desarrollamos el nuevo comportamiento.

## Enlaces de interés sobre la kata Bowling Game

* [The Bowling Game Kata](http://butunclebob.com/files/downloads/Bowling%20Game%20Kata.ppt)^[1](https://leanpub.com/tddcourse/read#fn-fn38)^
* [Adventures in C#: The Bowling Game](https://ronjeffries.com/xprog/articles/acsbowling/)^[2](https://leanpub.com/tddcourse/read#fn-fn39)^

# 16 Resolviendo la kata Bowling Game

## Enunciado de la kata

La kata consiste en crear un programa para calcular las puntuaciones de un jugador en un juego de los Bolos, aunque para evitar complicarla mucho sólo se calcula el resultado final y no se hacen validaciones sobre las puntuaciones.

Un breve recordatorio de las reglas:

* Cada juego tiene 10 turnos de 2 lanzamientos cada uno.
* En cada turno se cuentan los bolos que han caído y ese número es la puntuación
  * 0 puntos es un *gutter*
  * Si se tiran todos los bolos entre los dos intentos es un  *spare* , y se suma como bonus la puntuación del siguiente lanzamiento
  * Si se tiran todos los bolos en el primer lanzamiento es un  *strike* , y se suma como bonus la puntuación de los siguientes dos lanzamientos
* Si el *strike* o el *spare* se logran en el último *frame* habrá lanzamientos extra

## Lenguaje y enfoque

Para hacer esta kata he escogido Ruby y RSpec. Posiblemente notes que tengo cierta preferencia por los *frameworks* de test de la familia *Spec, pero es que han sido diseñados pensando en TDD, considerando el test como especificación lo que ayuda mucho a salirse del marco de pensar en los tests como QA.

Dicho eso, no hay ningún problema en usar cualquier otro *framework* de testing, como los de la familia *Unit.

Por otro lado, emplearemos orientación a objetos.

## Iniciando el juego

A estas alturas, el primer test debería ser suficiente para forzarnos a definir e instanciar la clase:

```

1 
require
 
'rspec'


2 


3 
RSpec
.
describe
 
'A Bowling Game'
 
do


4 
  
it
 
'should start a new game'
 
do


5 
  
BowlingGame
.
new


6 
  
end


7 
end

```

El test fallará, obligándonos a escribir el código de producción mínimo para que llegue a pasar.

```

1 
class
 
BowlingGame


2 


3 
end

```

Y una vez que hemos hecho pasar el test, movemos la clase a su propio archivo y la requerimos:

```

1 
require
 
'rspec'


2 
require_relative
 
'../src/bowling_game'


3 


4 
RSpec
.
describe
 
'A Bowling Game'
 
do


5 
  
it
 
'should start a new game'
 
do


6 
  
BowlingGame
.
new


7 
  
end


8 
end

```

Estamos listas para el siguiente paso.

## Lancemos la bola

Para que nuestro `BowlingGame` sea útil necesitaremos al menos dos cosas:

* Una forma de indicar el resultado de un lanzamiento, pasando el número de bolos derribado, que sería un  *command* . Un *command* provoca un efecto en el estado de un objeto, pero no devuelve nada por lo que necesitamos una vía alternativa de observar ese efecto.
* Una forma de obtener la puntuación en un momento dado, que sería una  *query* . Una *query* devuelve una respuesta, por lo que podemos verificar que es la que esperamos.

Puede que te preguntes: ¿Cuál de las dos deberíamos atacar primero?

No hay una regla fija, pero una forma de verlo puede ser la siguiente:

Los métodos *query* devuelven un resultado y su efecto puede testearse, pero hay que tener en cuenta en este punto asegurarnos de que la respuesta esperada no nos dificultará crear nuevos tests que fallen.

Por contra, los métodos *command* podemos introducirlos con un mínimo de código, sin tener que estar pendientes de sus efectos en futuros tests, salvo asegurarnos de que los parámetros que reciban son válidos.

Así que vamos empezar introduciendo un método para lanzar la bola, que simplemente espera recibir el número de bolos derribado, que puede ser 0. Pero para forzar eso debemos escribir un test primero:

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 
  
it
 
'should start a new game'
 
do


 6 
  
game
 
=
 
BowlingGame
.
new


 7 
  
end


 8 


 9 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


10 
  
game
 
=
 
BowlingGame
.
new


11 
  
game
.
roll
 
0


12 
  
end


13 
end

```

Y el código suficiente para hacer que el test pase es simplemente definir el método. Básicamente lo que tenemos es que podemos comunicarle a `BowlingGame` que hemos lanzado la bola.

```

1 
class
 
BowlingGame


2 
  
def
 
roll
(
pins_down
)


3 


4 
  
end


5 
end

```

## Hora de refactorizar

En esta kata vamos a prestar especial atención a la fase de refactor. Hay que buscar un equilibrio para que ciertos refactors no nos condicionen las posibilidades de hacer evolucionar el código. Del mismo modo que la optimización prematura es un  *smell* , la sobre ingeniería prematura también lo es.

El código de producción no ofrece todavía ninguna oportunidad de refactor, pero los tests empiezan a mostrar un patrón. El objeto `game` podría vivir como variable de instancia e inicializarse en un método `setup` de la especificación o test case. En este caso, usamos `before`.

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should start a new game'
 
do


11 
  
game
 
=
 
BowlingGame
.
new


12 
  
end


13 


14 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


15 
  
@game
.
roll
 
0


16 
  
end


17 
end

```

Y esto hace que el primer test sea redundante:

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


11 
  
@game
.
roll
 
0


12 
  
end


13 
end

```

Con esto la especificación será más manejable.

## Contando los puntos

Toca introducir un método para poder saber el marcador del juego. Lo reclamamos mediante un test que falle:

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


11 
  
@game
.
roll
 
0


12 
  
end


13 


14 
  
it
 
'should score after a gutter roll'
 
do


15 
  
@game
.
roll
 
0


16 
  
expect
(
@game
.
score
)
.
to
 
eq
(
0
)


17 
  
end


18 
end

```

El test fallará porque no existe el método  *score* .

```

1 
class
 
BowlingGame


2 
  
def
 
roll
(
pins_down
)


3 


4 
  
end


5 


6 
  
def
 
score


7 
  

8 
  
end


9 
end

```

Y seguirá fallando porque tiene que devolver 0. Lo mínimo para lograr que pase es:

```

1 
class
 
BowlingGame


2 
  
def
 
roll
(
pins_down
)


3 


4 
  
end


5 


6 
  
def
 
score


7 
  
0


8 
  
end


9 
end

```

## El peor lanzador del mundo

Muchas soluciones de la kata van directamente a este punto donde vamos a empezar a definir el comportamiento de `BowlingGame` tras los 20 lanzamientos. Nosotros hemos escogido un camino con pasos más pequeños y vamos a ver qué implica.

Nuestro siguiente test intentará hacer posible obtener un marcador tras 20 lanzamientos. Una forma de hacerlo es simularlos y lo más sencillo sería que todos ellos fuesen fallidos, es decir, que no tirasen ningún bolo con lo que el marcador final sería 0.

Este parece un buen test para empezar:

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


11 
  
@game
.
roll
 
0


12 
  
end


13 


14 
  
it
 
'should score after a gutter roll'
 
do


15 
  
@game
.
roll
 
0


16 
  
expect
(
@game
.
score
)
.
to
 
eq
(
0
)


17 
  
end


18 


19 
  
it
 
'should score a gutter game'
 
do


20 
  
20
.
times
 
do


21 
    
@game
.
roll
 
0


22 
  
end


23 
  
expect
(
@game
.
score
)
.
to
 
eq
(
0
)


24 
  
end


25 
end

```

Pero no lo es. Lo ejecutamos y pasa a la primera.

Este test no nos obliga a introducir cambios en el código de producción porque no falla. En el fondo es el mismo test que teníamos antes. Sin embargo, en algunos sentidos es un test mejor ya que nuestro objetivo es que `score` nos devuelva los resultados tras la totalidad de lanzamientos.

## Organizando el código

Simplemente eliminamos el test anterior por redundante, ya que ese comportamiento estaría implícito en el que acabamos de definir.

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


11 
  
@game
.
roll
 
0


12 
  
end


13 
  

14 
  
it
 
'should score a gutter game'
 
do


15 
  
20
.
times
 
do


16 
    
@game
.
roll
 
0


17 
  
end


18 
  
expect
(
@game
.
score
)
.
to
 
eq
(
0
)


19 
  
end


20 
end

```

Como el test no nos ha requerido escribir código de producción, necesitamos un test que sí falle.

## Enseñando a contar a nuestro juego

Lo mejor sería esperar un resultado distinto a cero en `score` para vernos obligadas a implementar nuevo código de producción. De todos los resultados posibles de un juego completo de bolos quizá el más sencillo de probar sea el caso en el que todos los lanzamientos acaban con un único bolo derribado. De este modo, esperamos que la puntuación final sea 20, y no hay posibilidad de que se generen puntos o tiradas extra.

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


11 
  
@game
.
roll
 
0


12 
  
end


13 


14 
  
it
 
'should score a gutter game'
 
do


15 
  
20
.
times
 
do


16 
    
@game
.
roll
 
0


17 
  
end


18 
  
expect
(
@game
.
score
)
.
to
 
eq
(
0
)


19 
  
end


20 


21 
  
it
 
'should score all ones'
 
do


22 
  
20
.
times
 
do


23 
    
@game
.
roll
 
1


24 
  
end


25 
  
expect
(
@game
.
score
)
.
to
 
eq
(
20
)


26 
  
end


27 
end

```

Este test ya falla porque no hay nada que acumule los puntos obtenidos en cada lanzamiento. Por tanto, necesitamos tener esa variable, que se inicie a cero y que vaya acumulando los resultados.

Pero… un momento. Eso ¿no son muchas cosas?

## Un paso atrás para llegar más lejos

Repasemos, para pasar el test que tenemos ahora fallando necesitamos:

* Añadir una variable en la clase para almacenar las puntuaciones
* Iniciarla a 0
* Acumular en ella los resultados

Son muchas cosas para añadir en un sólo ciclo mientras tenemos un test fallando.

El caso es que, en realidad, podríamos olvidar este test un momento y volver al estado anterior cuando estábamos todavía en verde. Para ello comentamos el nuevo test de modo que no se ejecute.

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


11 
  
@game
.
roll
 
0


12 
  
end


13 


14 
  
it
 
'should score a gutter game'
 
do


15 
  
20
.
times
 
do


16 
    
@game
.
roll
 
0


17 
  
end


18 
  
expect
(
@game
.
score
)
.
to
 
eq
(
0
)


19 
  
end


20 


21 
  
# it 'should score all ones' do


22 
  
#   20.times do


23 
  
#     @game.roll 1


24 
  
#   end


25 
  
#   expect(@game.score).to eq(20)


26 
  
# end


27 
end

```

Y ahora procedemos al refactor. Empezamos cambiando la constante 0 por una variable:

```

1 
class
 
BowlingGame


2 
  
def
 
roll
(
pins_down
)


3 


4 
  
end


5 


6 
  
def
 
score


7 
  
@score
 
=
 
0


8 
  
end


9 
end

```

Podemos mejorar este código, guardando en la variable los puntos obtenidos en el lanzamiento. Este código sigue haciendo pasar el test y es un cambio mínimo:

```

1 
class
 
BowlingGame


2 
  
def
 
roll
(
pins_down
)


3 
  
@score
 
=
 
pins_down


4 
  
end


5 


6 
  
def
 
score


7 
  
@score


8 
  
end


9 
end

```

## Recuperando un test anulado

Ahora sí que lanzamos el cuarto test y vemos de nuevo que falla:

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


11 
  
@game
.
roll
 
0


12 
  
end


13 


14 
  
it
 
'should score a gutter game'
 
do


15 
  
20
.
times
 
do


16 
    
@game
.
roll
 
0


17 
  
end


18 
  
expect
(
@game
.
score
)
.
to
 
eq
(
0
)


19 
  
end


20 


21 
  
it
 
'should score all ones'
 
do


22 
  
20
.
times
 
do


23 
    
@game
.
roll
 
1


24 
  
end


25 
  
expect
(
@game
.
score
)
.
to
 
eq
(
20
)


26 
  
end


27 
end

```

El cambio necesario en el código es más pequeño ahora. Tenemos que iniciar la variable en construcción, de modo que cada juego empieza en cero y va acumulando puntos. Fíjate que aparte del constructor nos basta con añadir un signo `+`.

```

 1 
class
 
BowlingGame


 2 


 3 
  
def
 
initialize


 4 
  
@score
 
=
 
0


 5 
  
end


 6 


 7 
  
def
 
roll
(
pins_down
)


 8 
  
@score
 
+=
 
pins_down


 9 
  
end


10 


11 
  
def
 
score


12 
  
@score


13 
  
end


14 
end

```

De nuevo en verde, sabiendo que ya acumulamos los puntos.

## Poniéndonos más cómodas

Al observar los tests vemos que puede ser útil tener un método para lanzar varias veces la bola con el mismo resultado. Así que lo extraemos y, por supuesto, lo utilizamos:

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


11 
  
@game
.
roll
 
0


12 
  
end


13 


14 
  
it
 
'should score a gutter game'
 
do


15 
  
roll_many
 
20
,
 
0


16 
  
expect
(
@game
.
score
)
.
to
 
eq
(
0
)


17 
  
end


18 


19 
  
it
 
'should score all ones'
 
do


20 
  
roll_many
 
20
,
 
1


21 
  
expect
(
@game
.
score
)
.
to
 
eq
(
20
)


22 
  
end


23 


24 
  
def
 
roll_many
(
times
,
 
pins_down
)


25 
  
times
.
times
 
do


26 
    
@game
.
roll
 
pins_down


27 
  
end


28 
  
end


29 
end

```

## Cómo manejar un *spare*

Ahora que ya sabemos que nuestro BowlingGame es capaz de acumular los puntos obtenidos en cada lanzamiento es momento de seguir avanzando. Podemos empezar a tratar casos especiales como por ejemplo, cómo se procesa un  *spare* , es decir, tumbar los diez bolos con dos lanzamientos en un  *frame* .

Así que escribimos un test que simule esa situación. Lo más sencillo es imaginar que el *spare* ocurre en el primer *frame* y que el resultado del tercer lanzamiento es el bonus. Para que sea más fácil, el resto de lanzamientos hasta completar el juego serán 0, con lo que no introducimos puntuaciones extrañas.

He aquí un test posible:

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


11 
  
@game
.
roll
 
0


12 
  
end


13 


14 
  
it
 
'should score a gutter game'
 
do


15 
  
roll_many
 
20
,
 
0


16 
  
expect
(
@game
.
score
)
.
to
 
eq
(
0
)


17 
  
end


18 


19 
  
it
 
'should score all ones'
 
do


20 
  
roll_many
 
20
,
 
1


21 
  
expect
(
@game
.
score
)
.
to
 
eq
(
20
)


22 
  
end


23 


24 
  
it
 
'should score an spare'
 
do


25 
  
@game
.
roll
 
5


26 
  
@game
.
roll
 
5


27 
  
@game
.
roll
 
3


28 
  
roll_many
 
17
,
 
0


29 
  
expect
(
@game
.
score
)
.
to
 
eq
(
16
)


30 
  
end


31 


32 
  
def
 
roll_many
(
times
,
 
pins_down
)


33 
  
times
.
times
 
do


34 
    
@game
.
roll
 
pins_down


35 
  
end


36 
  
end


37 
end

```

El test falla porque `score` nos devuelve 13 puntos cuando deberían ser 16. Ahora mismo no existe un mecanismo que cuente el lanzamiento posterior al *spare* como bonus.

El problema es que nos hace falta contar los puntos no por lanzamiento, sino por  *frame* , para poder saber si un frame ha dado un *spare* o no y actuar en consecuencia. Además, ya no nos basta con ir sumando los puntos, sino que debemos pasar la responsabilidad del recuento al método `score`, de modo que `roll` se limite a almacenar los parciales y sea `score` quien gestione la lógica de calcular por  *frame* .

De nuevo nos vemos en la necesidad de cambiar primero la estructura del código sin cambiar el comportamiento antes de introducir el nuevo test. Por tanto, anulamos este test y refactorizamos con el anterior como red de seguridad para introducir el concepto de *frame* en el recuento.

## Introduciendo el concepto de *frame*

Primero regresamos al test anterior, anulando temporalmente el que está fallando:

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


11 
  
@game
.
roll
 
0


12 
  
end


13 


14 
  
it
 
'should score a gutter game'
 
do


15 
  
roll_many
 
20
,
 
0


16 
  
expect
(
@game
.
score
)
.
to
 
eq
(
0
)


17 
  
end


18 


19 
  
it
 
'should score all ones'
 
do


20 
  
roll_many
 
20
,
 
1


21 
  
expect
(
@game
.
score
)
.
to
 
eq
(
20
)


22 
  
end


23 


24 
  
# it 'should score an spare' do


25 
  
#   @game.roll 5


26 
  
#   @game.roll 5


27 
  
#   @game.roll 3


28 
  
#   roll_many 17, 0


29 
  
#   expect(@game.score).to eq(16)


30 
  
# end


31 


32 
  
def
 
roll_many
(
times
,
 
pins_down
)


33 
  
times
.
times
 
do


34 
    
@game
.
roll
 
pins_down


35 
  
end


36 
  
end


37 
end

```

Vamos por el refactor. En primer lugar, cambiamos el nombre de la variable:

```

 1 
class
 
BowlingGame


 2 


 3 
  
def
 
initialize


 4 
  
@rolls
 
=
 
0


 5 
  
end


 6 


 7 
  
def
 
roll
(
pins_down
)


 8 
  
@rolls
 
+=
 
pins_down


 9 
  
end


10 


11 
  
def
 
score


12 
  
@rolls


13 
  
end


14 
end

```

Los tests siguen pasando. Ahora cambiamos su significado y movemos la suma a `score`:

```

 1 
class
 
BowlingGame


 2 


 3 
  
def
 
initialize


 4 
  
@rolls
 
=
 
[]


 5 
  
end


 6 


 7 
  
def
 
roll
(
pins_down
)


 8 
  
@rolls
.
push
 
pins_down


 9 
  
end


10 


11 
  
def
 
score


12 
  
score
 
=
 
0


13 
  
@rolls
.
each
 
do
 
|
roll
|


14 
    
score
 
+=
 
roll


15 
  
end


16 
  
score


17 
  
end


18 
end

```

Comprobamos que los tests siguen pasando. Puede ser buen momento para introducir el concepto de  *frame* . Sabemos que hay un máximo de 10  *frames* .

```

 1 
class
 
BowlingGame


 2 


 3 
  
def
 
initialize


 4 
  
@rolls
 
=
 
[]


 5 
  
end


 6 


 7 
  
def
 
roll
(
pins_down
)


 8 
  
@rolls
.
push
 
pins_down


 9 
  
end


10 


11 
  
def
 
score


12 
  
score
 
=
 
0


13 
  
roll
 
=
 
0


14 


15 
  
10
.
times
 
do


16 
    
frame_score
 
=
 
@rolls
[
roll
]
 
+
 
@rolls
[
roll
+
1
]


17 
    
score
 
+=
 
frame_score


18 
    
roll
 
+=
 
2


19 
  
end


20 
  
score


21 
  
end


22 
end

```

Con este cambio los tests siguen pasando y ya tenemos acceso a la puntuación por  *frame* . Parece que estamos listos para volver a introducir el test anterior.

## Seguimos manejando el *spare*

Volvemos a activar el test que falla.

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


11 
  
@game
.
roll
 
0


12 
  
end


13 


14 
  
it
 
'should score a gutter game'
 
do


15 
  
roll_many
 
20
,
 
0


16 
  
expect
(
@game
.
score
)
.
to
 
eq
(
0
)


17 
  
end


18 


19 
  
it
 
'should score all ones'
 
do


20 
  
roll_many
 
20
,
 
1


21 
  
expect
(
@game
.
score
)
.
to
 
eq
(
20
)


22 
  
end


23 


24 
  
it
 
'should score an spare'
 
do


25 
    
@game
.
roll
 
5


26 
    
@game
.
roll
 
5


27 
    
@game
.
roll
 
3


28 
    
roll_many
 
17
,
 
0


29 
    
expect
(
@game
.
score
)
.
to
 
eq
(
16
)


30 
  
end


31 


32 
  
def
 
roll_many
(
times
,
 
pins_down
)


33 
  
times
.
times
 
do


34 
    
@game
.
roll
 
pins_down


35 
  
end


36 
  
end


37 
end

```

Ahora estamos en mejor disposición para introducir el comportamiento deseado con un cambio bastante pequeño:

```

 1 
class
 
BowlingGame


 2 


 3 
  
def
 
initialize


 4 
  
@rolls
 
=
 
[]


 5 
  
end


 6 


 7 
  
def
 
roll
(
pins_down
)


 8 
  
@rolls
.
push
 
pins_down


 9 
  
end


10 


11 
  
def
 
score


12 
  
score
 
=
 
0


13 
  
roll
 
=
 
0


14 


15 
  
10
.
times
 
do


16 
    
frame_score
 
=
 
@rolls
[
roll
]
 
+
 
@rolls
[
roll
 
+
 
1
]


17 
    
if
 
frame_score
 
==
 
10


18 
      
frame_score
 
+=
 
@rolls
[
roll
 
+
 
2
]


19 
    
end


20 
    
score
 
+=
 
frame_score


21 
    
roll
 
+=
 
2


22 
  
end


23 
  
score


24 
  
end


25 
end

```

Añadiendo un bloque `if` es suficiente para hacer pasar el test.

## Eliminando números mágicos y otros refactors

En este punto en que ya tenemos los tests pasando podemos hacer varias mejoras en el código. Vamos por partes:

Demos significado a algunos números mágicos en el código de producción:

```

 1 
class
 
BowlingGame


 2 
  

 3 
  
def
 
initialize


 4 
  
@rolls
 
=
 
[]


 5 
  
end


 6 


 7 
  
def
 
roll
(
pins_down
)


 8 
  
@rolls
.
push
 
pins_down


 9 
  
end


10 


11 
  
FRAMES_IN_A_GAME
 
=
 
10


12 
  
ALL_PINS_DOWN
 
=
 
10


13 


14 
  
def
 
score


15 
  
score
 
=
 
0


16 
  
roll
 
=
 
0


17 


18 
  
FRAMES_IN_A_GAME
.
times
 
do


19 
    
frame_score
 
=
 
@rolls
[
roll
]
 
+
 
@rolls
[
roll
 
+
 
1
]


20 
    
if
 
frame_score
 
==
 
ALL_PINS_DOWN


21 
      
frame_score
 
+=
 
@rolls
[
roll
 
+
 
2
]


22 
    
end


23 
    
score
 
+=
 
frame_score


24 
    
roll
 
+=
 
2


25 
  
end


26 
  
score


27 
  
end


28 
end

```

El cálculo de la puntuación en el *frame* podría extraerse a un método y ahorrarnos la variable temporal de paso:

```

 1 
class
 
BowlingGame


 2 


 3 
  
def
 
initialize


 4 
  
@rolls
 
=
 
[]


 5 
  
end


 6 


 7 
  
def
 
roll
(
pins_down
)


 8 
  
@rolls
.
push
 
pins_down


 9 
  
end


10 


11 
  
FRAMES_IN_A_GAME
 
=
 
10


12 
  
ALL_PINS_DOWN
 
=
 
10


13 


14 
  
def
 
score


15 
  
score
 
=
 
0


16 
  
roll
 
=
 
0


17 


18 
  
FRAMES_IN_A_GAME
.
times
 
do


19 
    
score
 
+=
 
frame_score
(
roll
)


20 
    
roll
 
+=
 
2


21 
  
end


22 
  
score


23 
  
end


24 


25 
  
private


26 


27 
  
def
 
frame_score
(
roll
)


28 
  
frame_score
 
=
 
@rolls
[
roll
]
 
+
 
@rolls
[
roll
 
+
 
1
]


29 
  
if
 
frame_score
 
==
 
ALL_PINS_DOWN


30 
    
frame_score
 
+=
 
@rolls
[
roll
 
+
 
2
]


31 
  
end


32 
  
frame_score


33 
  
end


34 
end

```

Podemos darle significado a la suma de los puntos en cada lanzamiento del  *frame* , así como a la pregunta de si se trata de un *spare* o no, y *rubyficar* un poco el código:

```

 1 
class
 
BowlingGame


 2 


 3 
  
def
 
initialize


 4 
  
@rolls
 
=
 
[]


 5 
  
end


 6 


 7 
  
def
 
roll
(
pins_down
)


 8 
  
@rolls
.
push
 
pins_down


 9 
  
end


10 


11 
  
FRAMES_IN_A_GAME
 
=
 
10


12 
  
ALL_PINS_DOWN
 
=
 
10


13 


14 
  
def
 
score


15 
  
score
 
=
 
0


16 
  
roll
 
=
 
0


17 


18 
  
FRAMES_IN_A_GAME
.
times
 
do


19 
    
frame_score
 
=
 
base_frame_score
(
roll
)


20 
    
frame_score
 
+=
 
@rolls
[
roll
 
+
 
2
]
 
if
 
spare?
 
frame_score


21 
    
score
 
+=
 
frame_score


22 
    
roll
 
+=
 
2


23 
  
end


24 
  
score


25 
  
end


26 


27 
  
private


28 


29 
  
def
 
spare?
(
frame_score
)


30 
  
frame_score
 
==
 
ALL_PINS_DOWN


31 
  
end


32 


33 
  
def
 
base_frame_score
(
roll
)


34 
  
@rolls
[
roll
]
 
+
 
@rolls
[
roll
 
+
 
1
]


35 
  
end


36 
end

```

Lo cierto es que esto nos está pidiendo a gritos extraer todo a una clase `Frame`, pero ahora no lo vamos a hacer pues podríamos caer en un *smell* por exceso de diseño.

Por otro lado, mirando el test, podemos detectar algunos puntos de mejora. Como ser más explícitos en el ejemplo:

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


11 
  
@game
.
roll
 
0


12 
  
end


13 


14 
  
it
 
'should score a gutter game'
 
do


15 
  
roll_many
 
20
,
 
0


16 
  
expect
(
@game
.
score
)
.
to
 
eq
(
0
)


17 
  
end


18 


19 
  
it
 
'should score all ones'
 
do


20 
  
roll_many
 
20
,
 
1


21 
  
expect
(
@game
.
score
)
.
to
 
eq
(
20
)


22 
  
end


23 


24 
  
it
 
'should score an spare'
 
do


25 
  
roll_spare


26 
  
@game
.
roll
 
3


27 
  
roll_many
 
17
,
 
0


28 
  
expect
(
@game
.
score
)
.
to
 
eq
(
16
)


29 
  
end


30 


31 
  
def
 
roll_many
(
times
,
 
pins_down
)


32 
  
times
.
times
 
do


33 
    
@game
.
roll
 
pins_down


34 
  
end


35 
  
end


36 


37 
  
def
 
roll_spare


38 
  
@game
.
roll
 
5


39 
  
@game
.
roll
 
5


40 
  
end


41 
end

```

Y con esto damos por terminado el refactor. A continuación, queremos tratar el caso del  *strike* .

## *Strike!*

*Strike* es conseguir tumbar todos los bolos en un único lanzamiento. En ese caso, el *bonus* consiste en los puntos obtenidos en los siguientes dos lanzamientos. El próximo test nos propone un ejemplo de eso:

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


11 
  
@game
.
roll
 
0


12 
  
end


13 


14 
  
it
 
'should score a gutter game'
 
do


15 
  
roll_many
 
20
,
 
0


16 
  
expect
(
@game
.
score
)
.
to
 
eq
(
0
)


17 
  
end


18 


19 
  
it
 
'should score all ones'
 
do


20 
  
roll_many
 
20
,
 
1


21 
  
expect
(
@game
.
score
)
.
to
 
eq
(
20
)


22 
  
end


23 


24 
  
it
 
'should score an spare'
 
do


25 
  
roll_spare


26 
  
@game
.
roll
 
3


27 
  
roll_many
 
17
,
 
0


28 
  
expect
(
@game
.
score
)
.
to
 
eq
(
16
)


29 
  
end


30 


31 
  
it
 
'should score an strike'
 
do


32 
  
@game
.
roll
(
10
)


33 
  
@game
.
roll
(
4
)


34 
  
@game
.
roll
(
3
)


35 
  
roll_many
 
17
,
 
0


36 
  
expect
(
@game
.
score
)
.
to
 
eq
(
24
)


37 
  
end


38 


39 
  
def
 
roll_many
(
times
,
 
pins_down
)


40 
  
times
.
times
 
do


41 
    
@game
.
roll
 
pins_down


42 
  
end


43 
  
end


44 


45 
  
def
 
roll_spare


46 
  
@game
.
roll
 
5


47 
  
@game
.
roll
 
5


48 
  
end


49 
end

```

En esta ocasión el test falla porque el código de producción calcula un total de 17 puntos (los 10 del strike más los 7 de los dos siguientes lanzamientos). Sin embargo, debería contar esos 7 dos veces: el bonus y la puntuación normal.

Ahora mismo tenemos todo lo necesario en el código de producción y, en principio, no tenemos que volver atrás. Tan sólo introducir los cambios necesarios. Fundamentalmente nos interesa detectar que se ha realizado el  *strike* .

```

 1 
class
 
BowlingGame


 2 


 3 
  
def
 
initialize


 4 
  
@rolls
 
=
 
[]


 5 
  
end


 6 


 7 
  
def
 
roll
(
pins_down
)


 8 
  
@rolls
.
push
 
pins_down


 9 
  
end


10 


11 
  
FRAMES_IN_A_GAME
 
=
 
10


12 
  
ALL_PINS_DOWN
 
=
 
10


13 


14 
  
def
 
score


15 
  
score
 
=
 
0


16 
  
roll
 
=
 
0


17 


18 
  
FRAMES_IN_A_GAME
.
times
 
do


19 
    
if
 
@rolls
[
roll
]
 
==
 
10


20 
      
frame_score
 
=
 
10
 
+
 
@rolls
[
roll
 
+
 
1
]
 
+
 
@rolls
[
roll
 
+
 
2
]


21 
      
roll
 
+=
 
1


22 
    
else


23 
      
frame_score
 
=
 
base_frame_score
 
roll


24 
      
frame_score
 
+=
 
@rolls
[
roll
 
+
 
2
]
 
if
 
spare?
 
frame_score


25 
      
roll
 
+=
 
2


26 
    
end


27 
    
score
 
+=
 
frame_score


28 
  
end


29 


30 
  
score


31 
  
end


32 


33 
  
private


34 


35 
  
def
 
spare?
(
frame_score
)


36 
  
frame_score
 
==
 
ALL_PINS_DOWN


37 
  
end


38 


39 
  
def
 
base_frame_score
(
roll
)


40 
  
@rolls
[
roll
]
 
+
 
@rolls
[
roll
 
+
 
1
]


41 
  
end


42 
end

```

## Reorganizando el conocimiento del juego

El código de producción que tenemos ahora nos permite pasar los tests y, por tanto, estamos en disposición de arreglar su estructura.

Empecemos haciendo algunas cosas más explícitas sobre el  *strike* :

```

 1 
class
 
BowlingGame


 2 


 3 
  
def
 
initialize


 4 
  
@rolls
 
=
 
[]


 5 
  
end


 6 


 7 
  
def
 
roll
(
pins_down
)


 8 
  
@rolls
.
push
 
pins_down


 9 
  
end


10 


11 
  
FRAMES_IN_A_GAME
 
=
 
10


12 
  
ALL_PINS_DOWN
 
=
 
10


13 


14 
  
def
 
score


15 
  
score
 
=
 
0


16 
  
roll
 
=
 
0


17 


18 
  
FRAMES_IN_A_GAME
.
times
 
do


19 
    
if
 
strike?
 
roll


20 
      
frame_score
 
=
 
10
 
+
 
base_frame_score
(
roll
 
+
 
1
)


21 
      
roll
 
+=
 
1


22 
    
else


23 
      
frame_score
 
=
 
base_frame_score
 
roll


24 
      
frame_score
 
+=
 
@rolls
[
roll
 
+
 
2
]
 
if
 
spare?
 
frame_score


25 
      
roll
 
+=
 
2


26 
    
end


27 
    
score
 
+=
 
frame_score


28 
  
end


29 


30 
  
score


31 
  
end


32 


33 
  
private


34 


35 
  
def
 
strike?
(
roll
)


36 
  
@rolls
[
roll
]
 
==
 
ALL_PINS_DOWN


37 
  
end


38 


39 
  
def
 
spare?
(
frame_score
)


40 
  
frame_score
 
==
 
ALL_PINS_DOWN


41 
  
end


42 


43 
  
def
 
base_frame_score
(
roll
)


44 
  
@rolls
[
roll
]
 
+
 
@rolls
[
roll
 
+
 
1
]


45 
  
end


46 
end

```

La estructura de cálculo de la puntuación del *frame* resulta poco clara, así que vamos a volver atrás y dejarlo también más expresivo:

```

 1 
class
 
BowlingGame


 2 


 3 
  
def
 
initialize


 4 
  
@rolls
 
=
 
[]


 5 
  
end


 6 


 7 
  
def
 
roll
(
pins_down
)


 8 
  
@rolls
.
push
 
pins_down


 9 
  
end


10 


11 
  
FRAMES_IN_A_GAME
 
=
 
10


12 
  
ALL_PINS_DOWN
 
=
 
10


13 


14 
  
def
 
score


15 
  
score
 
=
 
0


16 
  
roll
 
=
 
0


17 


18 
  
FRAMES_IN_A_GAME
.
times
 
do


19 
    
if
 
strike?
 
roll


20 
      
frame_score
 
=
 
10
 
+
 
base_frame_score
(
roll
 
+
 
1
)


21 
      
roll
 
+=
 
1


22 
    
elsif
 
spare?
 
base_frame_score
 
roll


23 
      
frame_score
 
=
 
10
 
+
 
@rolls
[
roll
 
+
 
2
]


24 
      
roll
 
+=
 
2


25 
    
else


26 
      
frame_score
 
=
 
base_frame_score
 
roll


27 
      
roll
 
+=
 
2


28 
    
end


29 
    
score
 
+=
 
frame_score


30 
  
end


31 


32 
  
score


33 
  
end


34 


35 
  
private


36 


37 
  
def
 
strike?
(
roll
)


38 
  
@rolls
[
roll
]
 
==
 
ALL_PINS_DOWN


39 
  
end


40 


41 
  
def
 
spare?
(
frame_score
)


42 
  
frame_score
 
==
 
ALL_PINS_DOWN


43 
  
end


44 


45 
  
def
 
base_frame_score
(
roll
)


46 
  
@rolls
[
roll
]
 
+
 
@rolls
[
roll
 
+
 
1
]


47 
  
end


48 
end

```

Este refactor deja en evidencia que `strike?` y `spare?` tienen una estructura diferente, lo que dificulta su comprensión y su manejo. Cambiamos `spare` para igualarlos y de paso quitamos también números mágicos.

```

 1 
class
 
BowlingGame


 2 


 3 
  
def
 
initialize


 4 
  
@rolls
 
=
 
[]


 5 
  
end


 6 


 7 
  
def
 
roll
(
pins_down
)


 8 
  
@rolls
.
push
 
pins_down


 9 
  
end


10 


11 
  
FRAMES_IN_A_GAME
 
=
 
10


12 
  
ALL_PINS_DOWN
 
=
 
10


13 


14 
  
def
 
score


15 
  
score
 
=
 
0


16 
  
roll
 
=
 
0


17 


18 
  
FRAMES_IN_A_GAME
.
times
 
do


19 
    
if
 
strike?
 
roll


20 
      
frame_score
 
=
 
ALL_PINS_DOWN
 
+
 
base_frame_score
(
roll
 
+
 
1
)


21 
      
roll
 
+=
 
1


22 
    
elsif
 
spare?
 
roll


23 
      
frame_score
 
=
 
ALL_PINS_DOWN
 
+
 
@rolls
[
roll
 
+
 
2
]


24 
      
roll
 
+=
 
2


25 
    
else


26 
      
frame_score
 
=
 
base_frame_score
 
roll


27 
      
roll
 
+=
 
2


28 
    
end


29 
    
score
 
+=
 
frame_score


30 
  
end


31 


32 
  
score


33 
  
end


34 


35 
  
private


36 


37 
  
def
 
strike?
(
roll
)


38 
  
ALL_PINS_DOWN
 
==
 
@rolls
[
roll
]


39 
  
end


40 


41 
  
def
 
spare?
(
roll
)


42 
  
ALL_PINS_DOWN
 
==
 
base_frame_score
(
roll
)


43 
  
end


44 


45 
  
def
 
base_frame_score
(
roll
)


46 
  
@rolls
[
roll
]
 
+
 
@rolls
[
roll
 
+
 
1
]


47 
  
end


48 
end

```

Ahora podemos extraer métodos que hagan más explícitos los cálculos:

```

 1 
class
 
BowlingGame


 2 


 3 
  
def
 
initialize


 4 
  
@rolls
 
=
 
[]


 5 
  
end


 6 


 7 
  
def
 
roll
(
pins_down
)


 8 
  
@rolls
.
push
 
pins_down


 9 
  
end


10 


11 
  
FRAMES_IN_A_GAME
 
=
 
10


12 
  
ALL_PINS_DOWN
 
=
 
10


13 


14 
  
def
 
score


15 
  
score
 
=
 
0


16 
  
roll
 
=
 
0


17 


18 
  
FRAMES_IN_A_GAME
.
times
 
do


19 
    
if
 
strike?
 
roll


20 
      
frame_score
 
=
 
strike_score
 
roll


21 
      
roll
 
+=
 
1


22 
    
elsif
 
spare?
 
roll


23 
      
frame_score
 
=
 
spare_score
 
roll


24 
      
roll
 
+=
 
2


25 
    
else


26 
      
frame_score
 
=
 
base_frame_score
 
roll


27 
      
roll
 
+=
 
2


28 
    
end


29 
    
score
 
+=
 
frame_score


30 
  
end


31 


32 
  
score


33 
  
end


34 


35 
  
private


36 


37 
  
def
 
spare_score
(
roll
)


38 
  
ALL_PINS_DOWN
 
+
 
@rolls
[
roll
 
+
 
2
]


39 
  
end


40 


41 
  
def
 
strike_score
(
roll
)


42 
  
ALL_PINS_DOWN
 
+
 
base_frame_score
(
roll
 
+
 
1
)


43 
  
end


44 


45 
  
def
 
strike?
(
roll
)


46 
  
ALL_PINS_DOWN
 
==
 
@rolls
[
roll
]


47 
  
end


48 


49 
  
def
 
spare?
(
roll
)


50 
  
ALL_PINS_DOWN
 
==
 
base_frame_score
(
roll
)


51 
  
end


52 


53 
  
def
 
base_frame_score
(
roll
)


54 
  
@rolls
[
roll
]
 
+
 
@rolls
[
roll
 
+
 
1
]


55 
  
end


56 
end

```

## La mejor jugadora del mundo

En principio, el desarrollo que tenemos es suficiente. Sin embargo, nos conviene tener algún test que lo certifique. Por ejemplo, este nuevo test corresponde a un juego perfecto: todos los lanzamientos son strikes:

```

 1 
require
 
'rspec'


 2 
require_relative
 
'../src/bowling_game'


 3 


 4 
RSpec
.
describe
 
'A Bowling Game'
 
do


 5 


 6 
  
before
 
do


 7 
  
@game
 
=
 
BowlingGame
.
new


 8 
  
end


 9 


10 
  
it
 
'should roll a ball knocking down 0 pins'
 
do


11 
  
@game
.
roll
 
0


12 
  
end


13 


14 
  
it
 
'should score a gutter game'
 
do


15 
  
roll_many
 
20
,
 
0


16 
  
expect
(
@game
.
score
)
.
to
 
eq
(
0
)


17 
  
end


18 


19 
  
it
 
'should score all ones'
 
do


20 
  
roll_many
 
20
,
 
1


21 
  
expect
(
@game
.
score
)
.
to
 
eq
(
20
)


22 
  
end


23 


24 
  
it
 
'should score an spare'
 
do


25 
  
roll_spare


26 
  
@game
.
roll
 
3


27 
  
roll_many
 
17
,
 
0


28 
  
expect
(
@game
.
score
)
.
to
 
eq
(
16
)


29 
  
end


30 


31 
  
it
 
'should score an strike'
 
do


32 
  
@game
.
roll
(
10
)


33 
  
@game
.
roll
(
4
)


34 
  
@game
.
roll
(
3
)


35 
  
roll_many
 
17
,
 
0


36 
  
expect
(
@game
.
score
)
.
to
 
eq
(
24
)


37 
  
end


38 


39 
  
def
 
roll_many
(
times
,
 
pins_down
)


40 
  
times
.
times
 
do


41 
    
@game
.
roll
 
pins_down


42 
  
end


43 
  
end


44 


45 
  
it
 
'should score perfect game'
 
do


46 
  
roll_many
 
12
,
 
10


47 
  
expect
(
@game
.
score
)
.
to
 
eq
(
300
)


48 
  
end


49 


50 
  
def
 
roll_spare


51 
  
@game
.
roll
 
5


52 
  
@game
.
roll
 
5


53 
  
end


54 
end

```

Al ejecutarlo, el test pasa, lo que nos confirma que BowlingGame funciona como esperamos.

Con todos los test pasando y la funcionalidad completamente implementada, podemos hacer evolucionar el código hacia un mejor diseño. En el siguiente ejemplo hemos extraído una clase `Rolls` que básicamente es un array al que le hemos añadido los métodos de cálculo de puntos que habíamos ido extrayendo:

```

 1 
class
 
Rolls
<
Array


 2 
  
ALL_PINS_DOWN
 
=
 
10


 3 


 4 
  
def
 
spare_score
(
roll
)


 5 
  
ALL_PINS_DOWN
 
+
 
self
[
roll
 
+
 
2
]


 6 
  
end


 7 


 8 
  
def
 
strike_score
(
roll
)


 9 
  
ALL_PINS_DOWN
 
+
 
base_frame_score
(
roll
 
+
 
1
)


10 
  
end


11 


12 
  
def
 
strike?
(
roll
)


13 
  
ALL_PINS_DOWN
 
==
 
self
[
roll
]


14 
  
end


15 


16 
  
def
 
spare?
(
roll
)


17 
  
ALL_PINS_DOWN
 
==
 
base_frame_score
(
roll
)


18 
  
end


19 


20 
  
def
 
base_frame_score
(
roll
)


21 
  
self
[
roll
]
 
+
 
self
[
roll
 
+
 
1
]


22 
  
end


23 
end


24 


25 


26 
class
 
BowlingGame


27 


28 
  
def
 
initialize


29 
  
@rolls
 
=
 
Rolls
.
new


30 
  
end


31 


32 
  
def
 
roll
(
pins_down
)


33 
  
@rolls
.
push
 
pins_down


34 
  
end


35 


36 
  
FRAMES_IN_A_GAME
 
=
 
10


37 


38 
  
def
 
score


39 
  
score
 
=
 
0


40 
  
roll
 
=
 
0


41 


42 
  
FRAMES_IN_A_GAME
.
times
 
do


43 
    
if
 
@rolls
.
strike?
 
roll


44 
      
frame_score
 
=
 
@rolls
.
strike_score
 
roll


45 
      
roll
 
+=
 
1


46 
    
elsif
 
@rolls
.
spare?
 
roll


47 
      
frame_score
 
=
 
@rolls
.
spare_score
 
roll


48 
      
roll
 
+=
 
2


49 
    
else


50 
      
frame_score
 
=
 
@rolls
.
base_frame_score
 
roll


51 
      
roll
 
+=
 
2


52 
    
end


53 
    
score
 
+=
 
frame_score


54 
  
end


55 


56 
  
score


57 
  
end


58 
end

```

## Qué hemos aprendido con esta kata

* El refactor es la etapa del diseño en TDD clásica, es el momento en que una vez que hemos implementado un comportamiento, reorganizamos el código para que se exprese mejor.
* Hay que aprovechar las oportunidades de refactor en cuanto las detectamos.
* Refactorizamos tanto el test como el código de producción.


# 17 Greeting

## Una kata funcional para dominarlas todas

El concepto de función pura me parece muy interesante para Test Driven Development porque nos fuerza a pensar en un comportamiento que debe evolucionar mientas que lo único que podemos saber sobre él desde el punto de vista del test son sus inputs y sus outputs actuales. Esto es común a todo desarrollo en TDD clásico, dado que que se basa en tests de caja negra. O sea, no tenemos en cuenta cómo es la implementación de la unidad que estamos desarrollando, sino cómo interactuamos con ella a través de su interfaz pública.

Por eso te la propongo como ejercicio final de esta serie, porque ayuda a ejercitar todas las cosas que hemos aprendido con las anteriores, añadiendo una restricción extra para forzarnos a no utilizar los recursos de que dispondríamos en orientación a objetos, como podría ser mantener un estado o extrayendo comportamiento a dependencias.

Además, dado que los requisitos cambian en cada iteración, nos fuerza a hacer refactors constantemente para poder introducir los cambios necesarios de comportamiento.

## Historia

Esta kata no es muy conocida. La he encontrado en TestDouble, donde se menciona como autor a Nick Gauthier.

## Enunciado

El enunciado de esta kata es muy simple. Se trata de crear una función pura `greet()` que devuelva un string con un saludo. Se le pasa como parámetro el nombre de la persona a la que saludar.

Seguidamente se van añadiendo requisitos que nos obligarán a extender el algoritmo para darles soporte únicamente a través de la entrada y salida de esta función. Para cada requisito se nos proporciona un ejemplo. Son los siguientes:


| Requisitos                                                                    | input                             | output                                     |
| ------------------------------------------------------------------------------- | ----------------------------------- | -------------------------------------------- |
| 1. Interpolar nombre en un saludo sencillo                                    | “Bob”                           | Hello, Bob.                                |
| 2. Si no se pasa nombre, retornar alguna fórmula genérica                   | null                              | Hello, my friend.                          |
| 3. Si nos gritan, contestar con un grito                                      | “JERRY”                         | HELLO, JERRY!                              |
| 4. Manejar dos nombres                                                        | “Jill”, “Jane”                | Hello, Jill and Jane.                      |
| 5. Manejar cualquier número de nombras, con coma estilo Oxford               | “Amy”, “Brian”, “Charlotte” | Hello, Amy, Brian, and Charlotte.          |
| 6. Permitir mezclar nombres normales y gritados, pero separar las respuestas. | “Amy”, “BRIAN”, “Charlotte” | Hello, Amy and Charlotte. AND HELLO BRIAN! |
| 7. Si un nombre contiene una coma, separarlo                                  | “Bob”, “Charlie, Dianne”      | Hello, Bob, Charlie, and Dianne.           |
| 8. Permitir escapar las comas de #7                                           | “Bob”, “"Charlie, Dianne"      | Hello, Bob and Charlie, Dianne.            |

## Orientaciones para resolverla

Parte del interés de esta kata reside en trabajar con un requerimiento cada vez, por lo que es importante no adelantarse e ir uno por uno.

La dificultad es resolverla sin crear unidades extra, sólo a través de la interfaz `greet()`.Cada uno de los requerimientos nos permite construir un test que nos fuerce a extender el comportamiento, aunque podríamos crear cuantos tests nos parezcan necesarios.

Por otro lado, es muy importante el paso atrás del que hablábamos en la kata  **Bowling** . Al resolver un requisito, haciendo pasar el test correspondiente, nos veremos en la necesidad de preparar el terreno para poder implementar el siguiente, manteniendo todos los tests actuales pasando.

En resumen:

* Céntrate en un requisito cada vez, en el orden propuesto.
* Una vez logrado, refactoriza para facilitar la consecución del siguiente requisito: haz que el cambio sea fácil (eso puede ser difícil) y luego haz el cambio fácil, como diría Kent Beck.

## Enlaces de interés sobre la kata Greetings

* [Greetings Kata](https://github.com/testdouble/contributing-tests/wiki/Greeting-Kata)^[1](https://leanpub.com/tddcourse/read#fn-fn40)^

# 18 Resolviendo la kata Greetings

## Enunciado de la kata

El enunciado de esta kata es muy simple. Se trata de crear una función pura `greet()` que devuelva un string con un saludo. Se le pasa como parámetro el nombre de la persona a la que saludar.

Seguidamente se van añadiendo requisitos que nos obligarán a extender el algoritmo para darles soporte únicamente a través de la entrada y salida de esta función. Para cada requisito se nos proporciona un ejemplo. Son los siguientes:


| Requisitos                                                                    | input                              | output                                     |
| ------------------------------------------------------------------------------- | ------------------------------------ | -------------------------------------------- |
| 1. Interpolar nombre en un saludo sencillo                                    | “Bob”                            | Hello, Bob.                                |
| 2. Si no se pasa nombre, retornar alguna fórmula genérica                   | null                               | Hello, my friend.                          |
| 3. Si nos gritan, contestar con un grito                                      | “JERRY”                          | HELLO, JERRY!                              |
| 4. Manejar dos nombres                                                        | “Jill”, “Jane”                 | Hello, Jill and Jane.                      |
| 5. Manejar cualquier número de nombras, con coma estilo Oxford               | “Amy”, “Brian”, “Charlotte”  | Hello, Amy, Brian, and Charlotte.          |
| 6. Permitir mezclar nombres normales y gritados, pero separar las respuestas. | “Amy”, “BRIAN”, “Charlotte”  | Hello, Amy and Charlotte. AND HELLO BRIAN! |
| 7. Si un nombre contiene una coma, separarlo                                  | “Bob”, “Charlie, Dianne”       | Hello, Bob, Charlie, and Dianne.           |
| 8. Permitir escapar las comas de #7                                           | “Bob”, “\“Charlie, Dianne\”” | Hello, Bob and Charlie, Dianne.            |

## Lenguaje y enfoque

Esta kata la vamos a resolver en Scala con el *framework* FunSite. La escribiremos usando un enfoque funcional.

## Saludo básico

La forma en que se presenta esta kata nos proporciona prácticamente todos los casos de test que necesitamos. A estas alturas creo que podemos dar un salto relativamente grande para empezar.

Este es nuestro primer test en el que suponemos que la función será un método de la clase `Greetings` en el package `greetings`.

```

1 
import
 
greetings.Greetings


2 
import
 
org.scalatest.FunSuite


3 


4 
class
 
GreetingTest
 
extends
 
FunSuite
 
{


5 
  
test
(
"Require the function"
)
 
{


6 
  
assert
(
Greetings
.
greet
(
"Bob"
)
 
===
 
"Hello, Bob."
)


7 
  
}


8 
}

```

En cualquier caso, al usar lenguajes que son muy estrictos en el tipado muchas veces no podríamos empezar por tests más pequeños, pues el propio compilador nos obligaría a introducir más código. Pero, por otra parte, el tipado estricto nos permite ignorar con seguridad esos mismos tests. De hecho, puedes considerar que el sistema de tipado estricto es, en cierto modo, un sistema de testing.

El test fallará, como era de esperar. En este caso crearemos el código mínimo necesario para hacerlo pasar de una sola vez:

```

1 
package
 
greetings


2 


3 
object
 
Greetings
 
{


4 
  
def
 
greet
(
value
:
 
String
)
:
 
String
 
=
 
{


5 
  
"Hello, Bob."


6 
  
}


7 
}

```

**Scala** no nos permite definir la función sin argumentos y usarla pasándole alguno, por lo que nos vemos obligadas a incorporarlo en la signatura. Por lo demás, devolvemos el `string` esperado por el test para que se ponga en verde.

## Saludo genérico

El segundo caso es gestionar la situación en que no nos pasan ningún nombre, por lo que el saludo deberá ser genérico.

```

 1 
import
 
greetings.Greetings


 2 
import
 
org.scalatest.FunSuite


 3 


 4 
class
 
GreetingTest
 
extends
 
FunSuite
 
{


 5 
  
test
(
"Require the function"
)
 
{


 6 
  
assert
(
Greetings
.
greet
(
"Bob"
)
 
===
 
"Hello, Bob."
)


 7 
  
}


 8 


 9 
  
test
(
"Act when name is null"
)
 
{


10 
    
assert
(
Greetings
.
greet
()
 
===
 
"Hello, my friend."
)


11 
  
}


12 
}

```

Lo primero que observamos es que el test fallará debido a que `greet` espera un parámetro que no le pasamos. Esto nos está indicando que debería ser opcional.

Nuestra primera intención sería corregir eso y permitir que se pueda pasar un parámetro opcional. Pero hay que tener en cuenta que si lo hacemos, el test seguirá fallando.

Por tanto, lo que vamos a hacer es descartar de momento este último test y refactorizar el código que tenemos mientras mantenemos el primer test pasando.

## Usar el parámetro

Desactivamos el test:

```

 1 
import
 
org.scalatest.FunSuite


 2 


 3 
class
 
GreetingTest
 
extends
 
FunSuite
 
{


 4 
  
test
(
"Require the function"
)
 
{


 5 
  
assert
(
Greetings
.
greet
(
"Bob"
)
 
===
 
"Hello, Bob."
)


 6 
  
}


 7 


 8 
//    test("Act when name is null") {


 9 
//      assert(Greetings.greet() === "Hello, my friend.")


10 
//    }


11 
}

```

Y hacemos el refactor. En **Scala** es posible poner valores por defecto eliminando la necesidad de pasar un parámetro.

```

1 
package
 
greetings


2 


3 
object
 
Greetings
 
{


4 
  
def
 
greet
(
name
:
 
String
 
=
 
"Bob"
)
:
 
String
 
=
 
{


5 
  
"Hello, Bob."


6 
  
}


7 
}

```

Nos faltaría hacer un uso efectivo del parámetro, en este caso mediante una interpolación.

```

1 
package
 
greetings


2 


3 
object
 
Greetings
 
{


4 
  
def
 
greet
(
name
:
 
String
 
=
 
"Bob"
)
:
 
String
 
=
 
{


5 
  
s"Hello, 
$name
."


6 
  
}


7 
}

```

## Un saludo genérico

Volvemos a activar el segundo test para poder implementar el requisito número dos, que consiste en permitir un saludo genérico si no se pasan valores:

```

 1 
import
 
greetings.Greetings


 2 
import
 
org.scalatest.FunSuite


 3 


 4 
class
 
GreetingTest
 
extends
 
FunSuite
 
{


 5 
  
test
(
"Require the function"
)
 
{


 6 
  
assert
(
Greetings
.
greet
(
"Bob"
)
 
===
 
"Hello, Bob."
)


 7 
  
}


 8 


 9 
  
test
(
"Act when name is null"
)
 
{


10 
  
assert
(
Greetings
.
greet
()
 
===
 
"Hello, my friend."
)


11 
  
}


12 
}

```

El test no pasará, pero el cambio necesario para que sí lo haga es muy sencillo:

```

1 
package
 
greetings


2 


3 
object
 
Greetings
 
{


4 
  
def
 
greet
(
name
:
 
String
 
=
 
"my friend"
)
:
 
String
 
=
 
{


5 
  
s"Hello, 
$name
."


6 
  
}


7 
}

```

Es muy importante fijarse en este detalle. El cambio que hemos realizado ha sido muy pequeño, pero para que pudiese ser pequeño hemos hecho antes el refactor protegiéndonos con tel test anterior. Es muy habitual intentar hacer ese refactor con el nuevo test fallando, pero esa es una mala práctica porque si refactorizamos mientras el test falla no podemos tener seguridad sobre lo que estamos haciendo.

## Responder a gritos

Este tercer test introduce el nuevo requisito de responder de manera diferente a los nombres expresados por completo en mayúsculas:

```

 1 
import
 
greetings.Greetings


 2 
import
 
org.scalatest.FunSuite


 3 


 4 
class
 
GreetingTest
 
extends
 
FunSuite
 
{


 5 
  
test
(
"Require the function"
)
 
{


 6 
  
assert
(
Greetings
.
greet
(
"Bob"
)
 
===
 
"Hello, Bob."
)


 7 
  
}


 8 


 9 
  
test
(
"Act when name is null"
)
 
{


10 
  
assert
(
Greetings
.
greet
()
 
===
 
"Hello, my friend."
)


11 
  
}


12 


13 
  
test
(
"Should manage shout"
)
 
{


14 
  
assert
(
Greetings
.
greet
(
"JERRY"
)
 
===
 
"HELLO, JERRY!"
)


15 
  
}


16 
}

```

Nos aseguramos de que el test falla por el motivo correcto antes de pasar a escribir el código de producción. Este es un enfoque posible:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
name
:
 
String
 
=
 
"my friend"
)
:
 
String
 
=
 
{


 5 
  
if
 
(
name
.
toUpperCase
 
==
 
name
)
 
{


 6 
    
return
 
s"HELLO, 
$name
!"


 7 
  
}


 8 
  
s"Hello, 
$name
."


 9 
  
}


10 
}

```

Llegadas a este punto vamos a ver qué oportunidades tenemos de hacer refactor. Esto nos lleva a esta solución tan sencilla:

```

1 
package
 
greetings


2 


3 
object
 
Greetings
 
{


4 
  
def
 
greet
(
name
:
 
String
 
=
 
"my friend"
)
:
 
String
 
=
 
{


5 
  
if
 
(
name
.
toUpperCase
()
 
==
 
name
)
 
s"HELLO, 
$name
!"
 
else
 
s"Hello, 
$name
."


6 
  
}


7 
}

```

De momento no hay mucho más que podamos hacer con la información que tenemos hasta ahora por lo que vamos a examinar el siguiente requisito.

## Poder saludar a dos personas

El requisito cuatro nos pide manejar dos nombres, lo que cambia ligeramente la cadena de saludo. Por supuesto, nos proporciona un ejemplo con el que hacer un test.

```

 1 
import
 
greetings.Greetings


 2 
import
 
org.scalatest.FunSuite


 3 


 4 
class
 
GreetingTest
 
extends
 
FunSuite
 
{


 5 
  
test
(
"Require the function"
)
 
{


 6 
  
assert
(
Greetings
.
greet
(
"Bob"
)
 
===
 
"Hello, Bob."
)


 7 
  
}


 8 


 9 
  
test
(
"Act when name is null"
)
 
{


10 
  
assert
(
Greetings
.
greet
()
 
===
 
"Hello, my friend."
)


11 
  
}


12 


13 
  
test
(
"Should manage shout"
)
 
{


14 
  
assert
(
Greetings
.
greet
(
"JERRY"
)
 
===
 
"HELLO, JERRY!"
)


15 
  
}


16 


17 
  
test
(
"Should manage two names"
)
 
{


18 
  
assert
(
Greetings
.
greet
(
"Jill"
,
 
"Jane"
)
 
===
 
"Hello, Jill and Jane."
)


19 
  
}


20 
}

```

Es posible que al escribir el test el propio IDE te haya advertido de que no es correcto pasar dos argumentos cuando la signatura de la función sólo permite uno, que además es opcional. Si no es así, la ejecución del test fallará al no poder compilar.

Como ya hemos visto en otras ocasiones la mejor forma de afrontar esto es retroceder al test anterior y hacer un refactor con el que prevenir el problema. Así que anulamos temporalmente el test que acabamos de introducir.

## Preparándose para varios nombres

```

 1 
import
 
greetings.Greetings


 2 
import
 
org.scalatest.FunSuite


 3 


 4 
class
 
GreetingTest
 
extends
 
FunSuite
 
{


 5 
  
test
(
"Require the function"
)
 
{


 6 
  
assert
(
Greetings
.
greet
(
"Bob"
)
 
===
 
"Hello, Bob."
)


 7 
  
}


 8 


 9 
  
test
(
"Act when name is null"
)
 
{


10 
  
assert
(
Greetings
.
greet
()
 
===
 
"Hello, my friend."
)


11 
  
}


12 


13 
  
test
(
"Should manage shout"
)
 
{


14 
  
assert
(
Greetings
.
greet
(
"JERRY"
)
 
===
 
"HELLO, JERRY!"
)


15 
  
}


16 


17 
//  test("Should manage two names") {


18 
//    assert(Greetings.greet("Jill", "Jane") === "Hello, Jill and Jane.")


19 
//  }


20 
}

```

Y refactorizamos a una implementación que nos permita introducir dos parámetros. La forma más fácil de hacerlo es usando  *splat parameters* . Sin embargo eso nos forzará a cambiar el algoritmo ya que los parámetros se presentarán como un objeto `Seq` de `String`. Además de eso, cambiamos el nombre del parámetro.

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


 6 


 7 
  
val
 
name
 
=
 
person
.
last


 8 


 9 
  
if
 
(
name
.
toUpperCase
()
 
==
 
name
)
 
s"HELLO, 
$name
!"
 
else
 
s"Hello, 
$name
."


10 
  
}


11 
}

```

Esta es una reimplementación ingenua, suficiente para permitirnos pasar el test, pero que podríamos desarrollar a un estilo más propio del lenguaje. Una de las mejores cosas que nos proporciona TDD es justamente esta facilidad para que podamos bosquejar implementaciones funcionales, aunque sean toscas, pero que nos ayudan a reflexionar sobre el problema y experimentar soluciones alternativas.

Para mejorarla un poco vamos primero a extraer la condición del `if` a una función anidada, con lo que no sólo es más expresiva sino también más fácil de reutilizar llegado el caso:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


 9 


10 
  
val
 
name
 
=
 
person
.
last


11 


12 
  
if
 
(
isShouting
(
name
))
 
s"HELLO, 
$name
!"
 
else
 
s"Hello, 
$name
."


13 
  
}


14 
}

```

La cuestión ahora, ¿nos conviene retomar el cuarto test o deberíamos seguir con el refactor para dar soporte a los cambios que necesitamos?

## Un refactor antes de seguir

El último refactor nos ha permitido dar soporte a una lista de nombres, pero necesitaríamos cambiar el enfoque para poder manejar listas de nombres gritando.

Hasta ahora distinguimos si hay que *gritar* cuando cuando montamos el saludo. Sin embargo, es posible que nos interese separar primero los nombres en función si han de ser gritados o no.

Así que lo que hacemos es repartir la lista de nombres en dos, según si son gritados o no, y adaptamos el resto del código a eso.

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


 9 


10 
  
val
 
(
shout
,
 
normal
)
 
=
 
person
.
partition
(
isShouting
)


11 


12 
  
if
 
(
normal
.
nonEmpty
)


13 
    
s"Hello, 
${
normal
.
last
}
."


14 
  
else
 
if
 
(
shout
.
nonEmpty
)


15 
    
s"HELLO, 
${
shout
.
last
}
!"


16 
  
else
 
""


17 
  
}


18 
}

```

Con esto deberíamos estar mejor preparadas para afrontar el cuarto test, así que lo reactivamos.

## Reintroduciendo un test

Al volver a activar el cuarto test ocurre lo que podíamos predecir: se hará el saludo a una sola persona, que será precisamente la última de las dos.

```

 1 
import
 
greetings.Greetings


 2 
import
 
org.scalatest.FunSuite


 3 


 4 
class
 
GreetingTest
 
extends
 
FunSuite
 
{


 5 
  
test
(
"Require the function"
)
 
{


 6 
  
assert
(
Greetings
.
greet
(
"Bob"
)
 
===
 
"Hello, Bob."
)


 7 
  
}


 8 


 9 
  
test
(
"Act when name is null"
)
 
{


10 
  
assert
(
Greetings
.
greet
()
 
===
 
"Hello, my friend."
)


11 
  
}


12 


13 
  
test
(
"Should manage shout"
)
 
{


14 
  
assert
(
Greetings
.
greet
(
"JERRY"
)
 
===
 
"HELLO, JERRY!"
)


15 
  
}


16 


17 
  
test
(
"Should manage two names"
)
 
{


18 
  
assert
(
Greetings
.
greet
(
"Jill"
,
 
"Jane"
)
 
===
 
"Hello, Jill and Jane."
)


19 
  
}


20 
}

```

El resultado es:

```

1 
Expected :"Hello, J[ill and J]ane."

2 
Actual   :"Hello, J[]ane."
```

Es decir, el test falla por la razón correcta, indicándonos que tenemos que introducir un cambio que se ocupe de procesar la lista de nombres y concatenarla. Gracias a los refactors anteriores es fácil de introducir:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


 9 


10 
  
val
 
(
shout
,
 
normal
)
 
=
 
person
.
partition
(
isShouting
)


11 


12 
  
if
 
(
normal
.
nonEmpty
)


13 
    
s"Hello, 
${
normal
.
mkString
(
" and "
)
}
."


14 
  
else
 
if
 
(
shout
.
nonEmpty
)


15 
    
s"HELLO, 
${
shout
.
last
}
!"


16 
  
else
 
""


17 
  
}


18 
}

```

Es importante fijarse en que en este punto no intentamos adelantarnos a los próximos requisitos, sino que resolvemos el problema actual. Sólo cuando introduzcamos el próximo test y con ello aprendamos cosas nuevas sobre el comportamiento que estamos implementando en la función nos plantearemos volver atrás a refactorizar los cambios previos que podamos necesitar.

## Manejar un número indeterminado de nombres

El quinto requisito consiste en manejar un número indeterminado de nombres, con un pequeño cambio en el formato del saludo. Introducimos un nuevo test que lo especifica:

```

 1 
import
 
greetings.Greetings


 2 
import
 
org.scalatest.FunSuite


 3 


 4 
class
 
GreetingTest
 
extends
 
FunSuite
 
{


 5 
  
test
(
"Require the function"
)
 
{


 6 
  
assert
(
Greetings
.
greet
(
"Bob"
)
 
===
 
"Hello, Bob."
)


 7 
  
}


 8 


 9 
  
test
(
"Act when name is null"
)
 
{


10 
  
assert
(
Greetings
.
greet
()
 
===
 
"Hello, my friend."
)


11 
  
}


12 


13 
  
test
(
"Should manage shout"
)
 
{


14 
  
assert
(
Greetings
.
greet
(
"JERRY"
)
 
===
 
"HELLO, JERRY!"
)


15 
  
}


16 


17 
  
test
(
"Should manage two names"
)
 
{


18 
  
assert
(
Greetings
.
greet
(
"Jill"
,
 
"Jane"
)
 
===
 
"Hello, Jill and Jane."
)


19 
  
}


20 


21 
  
test
(
"Should manage several names"
)
 
{


22 
  
assert
(
Greetings
.
greet
(
"Amy"
,
 
"Brian"
,
 
"Charlotte"
)
 
===
 
"Hello, Amy, Brian, and Charl\


23 
otte."
)


24 
  
}


25 
}

```

El resultado del test es:

```

1 
Expected
 
:
"Hello, Amy[, Brian,] and Charlotte."


2 
Actual
   
:
"Hello, Amy[ and Brian] and Charlotte."

```

Podemos empezar por el siguiente cambio:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


 9 


10 
  
val
 
(
shout
,
 
normal
)
 
=
 
person
.
partition
(
isShouting
)


11 


12 
  
if
 
(
normal
.
nonEmpty
)


13 
    
s"Hello, 
${
normal
.
mkString
(
", "
)
}
."


14 
  
else
 
if
 
(
shout
.
nonEmpty
)


15 
    
s"HELLO, 
${
shout
.
last
}
!"


16 
  
else
 
""


17 
  
}


18 
}

```

Esto rompe el test anterior y tampoco pasa el nuevo, que nos indica que el último elemento de la lista requiere un trato especial:

```

1 
Expected :"Hello, Amy, Brian, [and ]Charlotte."

2 
Actual   :"Hello, Amy, Brian, []Charlotte."
```

Hagamos eso literalmente, es decir: separemos el último elemento:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


 9 


10 
  
val
 
(
shout
,
 
normal
)
 
=
 
person
.
partition
(
isShouting
)


11 


12 
  
if
 
(
normal
.
nonEmpty
)


13 
    
s"Hello, 
${
normal
.
init
.
mkString
(
", "
)
}
, and 
${
normal
.
last
}
."


14 
  
else
 
if
 
(
shout
.
nonEmpty
)


15 
    
s"HELLO, 
${
shout
.
last
}
!"


16 
  
else
 
""


17 
  
}


18 
}

```

Sin embargo, este cambio hace pasar el último test, a la ver que provocan que fallen el anterior y el primero. El problema es que en el caso del saludo normal y el del saludo a dos personas no pueden seguir el mismo patrón. Estamos destapando un agujero para tapar otro.

Puesto que estamos haciendo fallar tests que ya estaban pasando lo mejor es que volvamos al punto del código en que los cuatro tests anteriores se cumplían.

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


 9 


10 
  
val
 
(
shout
,
 
normal
)
 
=
 
person
.
partition
(
isShouting
)


11 


12 
  
if
 
(
normal
.
nonEmpty
)


13 
    
s"Hello, 
${
normal
.
mkString
(
" and "
)
}
."


14 
  
else
 
if
 
(
shout
.
nonEmpty
)


15 
    
s"HELLO, 
${
shout
.
last
}
!"


16 
  
else
 
""


17 
  
}


18 
}

```

Lo que nos indica este recorrido de ida y vuelta es que hay dos tipos de casos que tienen tratamiento diferente.

* Listas de 2 o menos nombres.
* Listas de más de 2 nombres.

Lo más sencillo es reconocer eso y abrazarlo en el propio código:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


 9 


10 
  
val
 
(
shout
,
 
normal
)
 
=
 
person
.
partition
(
isShouting
)


11 


12 
  
if
 
(
normal
.
nonEmpty
)


13 
    
if
 
(
normal
.
length
 
<=
 
2
)


14 
      
s"Hello, 
${
normal
.
mkString
(
" and "
)
}
."


15 
    
else


16 
      
s"Hello, 
${
normal
.
init
.
mkString
(
", "
)
}
, and 
${
normal
.
last
}
."


17 
  
else
 
if
 
(
shout
.
nonEmpty
)


18 
    
s"HELLO, 
${
shout
.
last
}
!"


19 
  
else
 
""


20 
  
}


21 
}

```

De nuevo, una implementación tosca e ingenua nos permite hacer pasar todos los tests, acudiendo a un mecanismo tan simple como es el de  **posponer la generalización** . Es ahora, al haber logrado el comportamiento deseado cuando podemos intentar a analizar el problema y buscar un algoritmo más general.

Como queremos centrarnos en la parte del algoritmo que concatena los nombres dentro del saludo vamos a hacer primero el siguiente refactor, extrayendo a una función inline el bloque de código que nos interesa:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


 9 


10 
  
val
 
(
shout
,
 
normal
)
 
=
 
person
.
partition
(
isShouting
)


11 


12 
  
def
 
concatenate
 
=
 
{


13 
    
if
 
(
normal
.
length
 
<=
 
2
)


14 
      
s"
${
normal
.
mkString
(
" and "
)
}
."


15 
    
else


16 
      
s"
${
normal
.
init
.
mkString
(
", "
)
}
, and 
${
normal
.
last
}
."


17 
  
}


18 


19 
  
if
 
(
normal
.
nonEmpty
)


20 
    
s"Hello, 
${
concatenate
}
"


21 
  
else
 
if
 
(
shout
.
nonEmpty
)


22 
    
s"HELLO, 
${
shout
.
last
}
!"


23 
  
else
 
""


24 
  
}


25 
}

```

Lo más interesante es haber aislado específicamente la concatenación de nombres. Vamos a hacer un par de cambios más. Ahora mismo actuamos directamente sobre la secuencia `normal` que está en el ámbito de la función `greet` y, por tanto, es global dentro de la función `concatenate`:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


 9 


10 
  
val
 
(
shout
,
 
normal
)
 
=
 
person
.
partition
(
isShouting
)


11 


12 
  
def
 
concatenate
(
names
:
 
Seq
[
String
])
 
=
 
{


13 
    
if
 
(
names
.
length
 
<=
 
2
)


14 
      
s"
${
names
.
mkString
(
" and "
)
}
"


15 
    
else


16 
      
s"
${
names
.
init
.
mkString
(
", "
)
}
, and 
${
names
.
last
}
"


17 
  
}


18 


19 
  
if
 
(
normal
.
nonEmpty
)


20 
    
s"Hello, 
${
concatenate
(
normal
)
}
."


21 
  
else
 
if
 
(
shout
.
nonEmpty
)


22 
    
s"HELLO, 
${
shout
.
last
}
!"


23 
  
else
 
""


24 
  
}


25 
}

```

Tras habernos asegurado de que los tests siguen pasando, vamos a hacer explícitos los diferentes casos que se tratan. Ahora mismo, la lista de un sólo nombre queda cubierta de forma implícita por el caso de dos nombres. Nuestro objetivo es tratar de entender mejor las regularidades en los tres supuestos:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


 9 


10 
  
val
 
(
shout
,
 
normal
)
 
=
 
person
.
partition
(
isShouting
)


11 


12 
  
def
 
concatenate
(
names
:
 
Seq
[
String
])
 
=
 
{


13 
    
if
 
(
names
.
length
 
==
 
1
)


14 
      
s"
${
names
.
last
}
"


15 
    
else
 
if
 
(
names
.
length
 
==
 
2
)


16 
      
s"
${
names
.
mkString
(
" and "
)
}
"


17 
    
else


18 
      
s"
${
names
.
init
.
mkString
(
", "
)
}
, and 
${
names
.
last
}
"


19 
  
}


20 


21 
  
if
 
(
normal
.
nonEmpty
)


22 
    
s"Hello, 
${
concatenate
(
normal
)
}
."


23 
  
else
 
if
 
(
shout
.
nonEmpty
)


24 
    
s"HELLO, 
${
shout
.
last
}
!"


25 
  
else
 
""


26 
  
}


27 
}

```

Demos un pequeño paso más en el caso de dos nombres:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


 9 


10 
  
val
 
(
shout
,
 
normal
)
 
=
 
person
.
partition
(
isShouting
)


11 


12 
  
def
 
concatenate
(
names
:
 
Seq
[
String
])
 
=
 
{


13 
    
if
 
(
names
.
length
 
==
 
1
)


14 
      
s"
${
names
.
last
}
"


15 
    
else
 
if
 
(
names
.
length
 
==
 
2
)


16 
      
s"
${
names
.
head
}
 and 
${
names
.
last
}
"


17 
    
else


18 
      
s"
${
names
.
init
.
mkString
(
", "
)
}
, and 
${
names
.
last
}
"


19 
  
}


20 


21 
  
if
 
(
normal
.
nonEmpty
)


22 
    
s"Hello, 
${
concatenate
(
normal
)
}
."


23 
  
else
 
if
 
(
shout
.
nonEmpty
)


24 
    
s"HELLO, 
${
shout
.
last
}
!"


25 
  
else
 
""


26 
  
}


27 
}

```

En **Scala** esto se puede expresar de manera más sucinta usando `match... case`:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 


 9 
  
def
 
concatenate
(
names
:
 
Seq
[
String
])
 
=
 
{


10 
    
names
.
length
 
match
 
{


11 
      
case
 
1
 
=>
 
s"
${
names
.
last
}
"


12 
      
case
 
2
 
=>
 
s"
${
names
.
head
}
 and 
${
names
.
last
}
"


13 
      
case
 
_
 
=>
 
s"
${
names
.
init
.
mkString
(
", "
)
}
, and 
${
names
.
last
}
"


14 
    
}


15 
  
}


16 


17 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


18 


19 
  
val
 
(
shout
,
 
normal
)
 
=
 
person
.
partition
(
isShouting
)


20 


21 
  
if
 
(
normal
.
nonEmpty
)


22 
    
s"Hello, 
${
concatenate
(
normal
)
}
."


23 
  
else
 
if
 
(
shout
.
nonEmpty
)


24 
    
s"HELLO, 
${
shout
.
last
}
!"


25 
  
else
 
""


26 
  
}


27 
}

```

Y un poquito más:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 


 9 
  
def
 
concatenate
(
names
:
 
Seq
[
String
])
 
=
 
{


10 
    
s"
${
names
.
length
 
match
 
{


11 
      
case
 
1
 
=>
 
""


12 
      
case
 
2
 
=>
 
s"
${
names
.
head
}
 and "


13 
      
case
 
_
 
=>
 
s"
${
names
.
init
.
mkString
(
", "
)
}
, and "


14 
    
}}${
names
.
last
}
"


15 
  
}


16 


17 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


18 


19 
  
val
 
(
shout
,
 
normal
)
 
=
 
person
.
partition
(
isShouting
)


20 


21 
  
if
 
(
normal
.
nonEmpty
)


22 
    
s"Hello, 
${
concatenate
(
normal
)
}
."


23 
  
else
 
if
 
(
shout
.
nonEmpty
)


24 
    
s"HELLO, 
${
shout
.
last
}
!"


25 
  
else
 
""


26 
  
}


27 
}

```

## Gritar a los gritones, pero sólo a ellos

En el test anterior nos hemos enfrentado al problema de generalizar el algoritmo para cualquier número de casos y hacerlo más expresivo sin romper la funcionalidad conseguida hasta aquel momento. Toca introducir un nuevo requisito mediante un nuevo test:

```

 1 
import
 
greetings.Greetings


 2 
import
 
org.scalatest.FunSuite


 3 


 4 
class
 
GreetingTest
 
extends
 
FunSuite
 
{


 5 
  
test
(
"Require the function"
)
 
{


 6 
  
assert
(
Greetings
.
greet
(
"Bob"
)
 
===
 
"Hello, Bob."
)


 7 
  
}


 8 


 9 
  
test
(
"Act when name is null"
)
 
{


10 
  
assert
(
Greetings
.
greet
()
 
===
 
"Hello, my friend."
)


11 
  
}


12 


13 
  
test
(
"Should manage shout"
)
 
{


14 
  
assert
(
Greetings
.
greet
(
"JERRY"
)
 
===
 
"HELLO, JERRY!"
)


15 
  
}


16 


17 
  
test
(
"Should manage two names"
)
 
{


18 
  
assert
(
Greetings
.
greet
(
"Jill"
,
 
"Jane"
)
 
===
 
"Hello, Jill and Jane."
)


19 
  
}


20 


21 
  
test
(
"Should manage several names"
)
 
{


22 
  
assert
(
Greetings
.
greet
(
"Amy"
,
 
"Brian"
,
 
"Charlotte"
)
 
===
 
"Hello, Amy, Brian, and Charl\


23 
otte."
)


24 
  
}


25 


26 
  
test
(
"Should shout to shouters"
)
 
{


27 
  
assert
(
Greetings
.
greet
(
"Amy"
,
 
"BRIAN"
,
 
"Charlotte"
)
 
===
 
"Hello, Amy and Charlotte. AN\


28 
D HELLO, BRIAN!"
)


29 
  
}


30 
}

```

Este test falla, como cabría esperar. Es interesante que ya nos habíamos preparado para este caso y tratábamos los saludos “gritones” de forma separada. Por lo que deducimos del ejemplo, podríamos aplicar el mismo tratamiento que a los “no gritones”, teniendo en cuenta que pueden aparecer los dos casos simultáneamente. Después de un par de intentos, llegamos a esto:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 


 9 
  
def
 
concatenate
(
names
:
 
Seq
[
String
])
 
=
 
{


10 
    
s"
${
names
.
length
 
match
 
{


11 
      
case
 
1
 
=>
 
""


12 
      
case
 
2
 
=>
 
s"
${
names
.
head
}
 and "


13 
      
case
 
_
 
=>
 
s"
${
names
.
init
.
mkString
(
", "
)
}
, and "


14 
    
}}${
names
.
last
}
"


15 
  
}


16 


17 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


18 


19 
  
val
 
(
shout
,
 
normal
)
 
=
 
person
.
partition
(
isShouting
)


20 


21 
  
s"
${
if
 
(
normal
.
nonEmpty
)
 
s"Hello, 
${
concatenate
(
normal
)
}
."
 
else
 
""
}${
if
 
(
shout
.
nonEmp
\


22 
ty
)
 
s"
${
if
 
(
normal
.
nonEmpty
)
 
" AND "
 
else
 
""
}
HELLO, 
${
concatenate
(
shout
)
}
!"
 
else
 
""
}
"


23 
  
}


24 
}

```

## Separar nombres que contienen comas

El siguiente requisito que se nos pide es separar los nombres que contienen comas. Para hacernos una idea esto viene siendo como permitir pasar los nombres con un número indeterminado de `strings` como en forma de un único `string` conteniendo varios nombres. Esto no altera realmente el modo en que generamos el saludo, sino más bien al modo en que preparamos los datos recibidos.

Nos toca, por tanto, añadir un test que ejemplifique el nuevo requisito:

```

 1 
import
 
greetings.Greetings


 2 
import
 
org.scalatest.FunSuite


 3 


 4 
class
 
GreetingTest
 
extends
 
FunSuite
 
{


 5 
  
test
(
"Require the function"
)
 
{


 6 
  
assert
(
Greetings
.
greet
(
"Bob"
)
 
===
 
"Hello, Bob."
)


 7 
  
}


 8 


 9 
  
test
(
"Act when name is null"
)
 
{


10 
  
assert
(
Greetings
.
greet
()
 
===
 
"Hello, my friend."
)


11 
  
}


12 


13 
  
test
(
"Should manage shout"
)
 
{


14 
  
assert
(
Greetings
.
greet
(
"JERRY"
)
 
===
 
"HELLO, JERRY!"
)


15 
  
}


16 


17 
  
test
(
"Should manage two names"
)
 
{


18 
  
assert
(
Greetings
.
greet
(
"Jill"
,
 
"Jane"
)
 
===
 
"Hello, Jill and Jane."
)


19 
  
}


20 


21 
  
test
(
"Should manage several names"
)
 
{


22 
  
assert
(
Greetings
.
greet
(
"Amy"
,
 
"Brian"
,
 
"Charlotte"
)
 
===
 
"Hello, Amy, Brian, and Charl\


23 
otte."
)


24 
  
}


25 


26 
  
test
(
"Should shout to shouters"
)
 
{


27 
  
assert
(
Greetings
.
greet
(
"Amy"
,
 
"BRIAN"
,
 
"Charlotte"
)
 
===
 
"Hello, Amy and Charlotte. AN\


28 
D HELLO, BRIAN!"
)


29 
  
}


30 


31 
  
test
(
"Should separate names with comma"
)
 
{


32 
  
assert
(
Greetings
.
greet
(
"Bob"
,
 
"Charlie, Dianne"
)
 
===
 
"Hello, Bob, Charlie, and Dianne\


33 
."
)


34 
  
}


35 
}

```

Ejecutamos el test para comprobar que no pasa y nos planteamos cómo resolver este nuevo caso.

En principio, podríamos recorrer la lista de personas y hacer un `split` de cada una de ellas por la coma. Como esto generará una colección de colecciones, la aplanamos. En **Scala** hay métodos para todo eso:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 


 9 
  
def
 
concatenate
(
names
:
 
Seq
[
String
])
 
=
 
{


10 
    
s"
${
names
.
length
 
match
 
{


11 
      
case
 
1
 
=>
 
""


12 
      
case
 
2
 
=>
 
s"
${
names
.
head
}
 and "


13 
      
case
 
_
 
=>
 
s"
${
names
.
init
.
mkString
(
", "
)
}
, and "


14 
    
}}${
names
.
last
}
"


15 
  
}


16 


17 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


18 


19 
  
val
 
personsList
 
=
 
person
.
flatMap
(
name
 
=>
 
name
.
split
(
","
).
map
(
_
.
trim
))


20 


21 
  
val
 
(
shout
,
 
normal
)
 
=
 
personsList
.
partition
(
isShouting
)


22 


23 
  
s"
${
if
 
(
normal
.
nonEmpty
)
 
s"Hello, 
${
concatenate
(
normal
)
}
."
 
else
 
""
}${
if
 
(
shout
.
nonEmp
\


24 
ty
)
 
s"
${
if
 
(
normal
.
nonEmpty
)
 
" AND "
 
else
 
""
}
HELLO, 
${
concatenate
(
shout
)
}
!"
 
else
 
""
}
"


25 
  
}


26 
}

```

Y he aquí que el test pasa sin problemas.

Una vez que hemos visto que la solución funciona, refactorizamos un poco el código:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 


 9 
  
def
 
concatenate
(
names
:
 
Seq
[
String
])
 
=
 
{


10 
    
s"
${
names
.
length
 
match
 
{


11 
      
case
 
1
 
=>
 
""


12 
      
case
 
2
 
=>
 
s"
${
names
.
head
}
 and "


13 
      
case
 
_
 
=>
 
s"
${
names
.
init
.
mkString
(
", "
)
}
, and "


14 
    
}}${
names
.
last
}
"


15 
  
}


16 


17 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


18 


19 
  
val
 
(
shout
,
 
normal
)
 
=
 
person


20 
    
.
flatMap
(
_
.
split
(
","
).
map
(
_
.
trim
))


21 
    
.
partition
(
isShouting
)


22 


23 
  
s"
${
if
 
(
normal
.
nonEmpty
)
 
s"Hello, 
${
concatenate
(
normal
)
}
."
 
else
 
""
}${
if
 
(
shout
.
nonEmp
\


24 
ty
)
 
s"
${
if
 
(
normal
.
nonEmpty
)
 
" AND "
 
else
 
""
}
HELLO, 
${
concatenate
(
shout
)
}
!"
 
else
 
""
}
"


25 
  
}


26 
}

```

## Escapar comas

El octavo requisito consiste en permitir que se evite el comportamiento anterior si la entrada de texto está escapada. Veamos el caso en forma de test:

```

 1 
import
 
greetings.Greetings


 2 
import
 
org.scalatest.FunSuite


 3 


 4 
class
 
GreetingTest
 
extends
 
FunSuite
 
{


 5 
  
test
(
"Require the function"
)
 
{


 6 
  
assert
(
Greetings
.
greet
(
"Bob"
)
 
===
 
"Hello, Bob."
)


 7 
  
}


 8 


 9 
  
test
(
"Act when name is null"
)
 
{


10 
  
assert
(
Greetings
.
greet
()
 
===
 
"Hello, my friend."
)


11 
  
}


12 


13 
  
test
(
"Should manage shout"
)
 
{


14 
  
assert
(
Greetings
.
greet
(
"JERRY"
)
 
===
 
"HELLO, JERRY!"
)


15 
  
}


16 


17 
  
test
(
"Should manage two names"
)
 
{


18 
  
assert
(
Greetings
.
greet
(
"Jill"
,
 
"Jane"
)
 
===
 
"Hello, Jill and Jane."
)


19 
  
}


20 


21 
  
test
(
"Should manage several names"
)
 
{


22 
  
assert
(
Greetings
.
greet
(
"Amy"
,
 
"Brian"
,
 
"Charlotte"
)
 
===
 
"Hello, Amy, Brian, and Charl\


23 
otte."
)


24 
  
}


25 


26 
  
test
(
"Should shout to shouters"
)
 
{


27 
  
assert
(
Greetings
.
greet
(
"Amy"
,
 
"BRIAN"
,
 
"Charlotte"
)
 
===
 
"Hello, Amy and Charlotte. AN\


28 
D HELLO, BRIAN!"
)


29 
  
}


30 


31 
  
test
(
"Should separate names with comma"
)
 
{


32 
  
assert
(
Greetings
.
greet
(
"Bob"
,
 
"Charlie, Dianne"
)
 
===
 
"Hello, Bob, Charlie, and Dianne\


33 
."
)


34 
  
}


35 


36 
  
test
(
"Should not separate names with comma if escaped"
)
 
{


37 
  
assert
(
Greetings
.
greet
(
"Bob"
,
 
"\"Charlie, Dianne\""
)
 
===
 
"Hello, Bob and Charlie, Dia\


38 
nne."
)


39 
  
}


40 
}

```

De nuevo, esto afecta a la preparación de los datos antes de montar el saludo. La solución que se nos ocurre es detectar primero la situación de que la cadena viene escapada y reemplazar la coma por un carácter arbitrario antes de hacer el split. Una vez hecho, restauramos la coma original.

En este caso, lo hacemos mediante una expresión regular, reemplazando por el símbolo # y restituyéndolo después.

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 


 9 
  
def
 
concatenate
(
names
:
 
Seq
[
String
])
 
=
 
{


10 
    
s"
${
names
.
length
 
match
 
{


11 
      
case
 
1
 
=>
 
""


12 
      
case
 
2
 
=>
 
s"
${
names
.
head
}
 and "


13 
      
case
 
_
 
=>
 
s"
${
names
.
init
.
mkString
(
", "
)
}
, and "


14 
    
}}${
names
.
last
}
"


15 
  
}


16 


17 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


18 
  

19 
  
val
 
escaped
 
=
 
"^\"([^,]+),(.+)\"$"
.
r


20 
  
val
 
personsList
 
=
 
person


21 
    
.
map
(
input
 
=>
 
escaped
.
replaceAllIn
(
input
,
 
"$1#$2"
))


22 
    
.
flatMap
(
_
.
split
(
","
).
map
(
_
.
trim
))


23 
    
.
map
(
_
.
replace
(
"#"
,
 
","
))


24 


25 
  
val
 
(
shout
,
 
normal
)
 
=
 
personsList
.
partition
(
isShouting
)


26 


27 
  
s"
${
if
 
(
normal
.
nonEmpty
)
 
s"Hello, 
${
concatenate
(
normal
)
}
."
 
else
 
""
}${
if
 
(
shout
.
nonEmp
\


28 
ty
)
 
s"
${
if
 
(
normal
.
nonEmpty
)
 
" AND "
 
else
 
""
}
HELLO, 
${
concatenate
(
shout
)
}
!"
 
else
 
""
}
"


29 
  
}


30 
}

```

Con esto completamos todos los requisitos. Podemos hacer un pequeño refactor:

```

 1 
package
 
greetings


 2 


 3 
object
 
Greetings
 
{


 4 
  
def
 
greet
(
person
:
 
String*
)
:
 
String
 
=
 
{


 5 
  
def
 
isShouting
(
name
:
 
String
)
:
 
Boolean
 
=
 
{


 6 
    
name
.
toUpperCase
()
 
==
 
name


 7 
  
}


 8 


 9 
  
def
 
concatenate
(
names
:
 
Seq
[
String
])
 
=
 
{


10 
    
s"
${
names
.
length
 
match
 
{


11 
      
case
 
1
 
=>
 
""


12 
      
case
 
2
 
=>
 
s"
${
names
.
head
}
 and "


13 
      
case
 
_
 
=>
 
s"
${
names
.
init
.
mkString
(
", "
)
}
, and "


14 
    
}}${
names
.
last
}
"


15 
  
}


16 


17 
  
if
 
(
person
.
isEmpty
)
 
return
 
"Hello, my friend."


18 


19 
  
val
 
escaped
 
=
 
"^\"([^,]+),(.+)\"$"
.
r


20 
  
val
 
(
shout
,
 
normal
)
 
=
 
person


21 
    
.
map
(
input
 
=>
 
escaped
.
replaceAllIn
(
input
,
 
"$1#$2"
))


22 
    
.
flatMap
(
_
.
split
(
","
).
map
(
_
.
trim
))


23 
    
.
map
(
_
.
replace
(
"#"
,
 
","
))


24 
    
.
partition
(
isShouting
)


25 


26 
  
s"
${
if
 
(
normal
.
nonEmpty
)
 
s"Hello, 
${
concatenate
(
normal
)
}
."
 
else
 
""
}${
if
 
(
shout
.
nonEmp
\


27 
ty
)
 
s"
${
if
 
(
normal
.
nonEmpty
)
 
" AND "
 
else
 
""
}
HELLO, 
${
concatenate
(
shout
)
}
!"
 
else
 
""
}
"


28 
  
}


29 
}

```

Una de las cosas que llama la atención en esta kata es que el enfoque funcional hace que cambios de comportamiento relativamente grandes se puedan conseguir mediante cambios comparativamente pequeños en el código de producción.

## Qué hemos aprendido con esta kata

* En esta kata hemos aprendido a **posponer la generalización** hasta tener más información sobre el algoritmo que estamos desarrollando
* Hemos aplicado las técnicas aprendidas en katas anteriores
* Hemos comprobado que un sistema de tipos estrictos nos permite ahorrarnos algunos tests

# *Outside-in* TDD

La metodología *outside-in* TDD intenta potenciar el carácter comunicativo de la programación orientada a objetos, poniendo énfasis en los mensajes entre objetos colaboradores y prestando atención al diseño del sistema.

Para ello, comienza desde el exterior del mismo, creando un test de aceptación que describe lo que se va a desarrollar y estableciendo un doble ciclo en el que vamos alternando entre el nivel de aceptación y el unitario. En el nivel unitario se diseña la colaboración entre objetos, decidiendo la atribución de responsabilidades en cada fase de la iteración. Para ello, se usan dobles de test,  *mocks* , fijando ciertas expectativas sobre ellos.

El autor más destacado en este enfoque es Sandro Mancuso, que la introduce en varias [publicaciones y conferencias](https://www.codurance.com/publications/2017/10/23/outside-in-design) ^[1](https://leanpub.com/tddcourse/read#fn-fn41)^ .

*Outside-in TDD* no contradice el enfoque clásico, pero propone una metodología más aplicable al desarrollo de software en condiciones reales y le da contexto, poniendo énfasis en las necesidades de diseño.

Por otro lado, es posible realizar un *outside-in* siguiendo las reglas clásicas, buscando el diseño durante las fases de refactor. No es habitual encontrar ejemplos. Uno de ellos es este del propio Sandro Mancuso con la [Rover kata](https://www.youtube.com/watch?v=24vzFAvOzo0) ^[2](https://leanpub.com/tddcourse/read#fn-fn42)^ , aunque no se trata de una aplicación completa.


# 19 Enfoques en TDD

La metodología Test Driven Development se basa en un conjunto relativamente reducido de reglas o principios. Pero un aspecto que no se define explícitamente es el modo en que esto puede aplicarse a diferentes situaciones de desarrollo.

Así, por ejemplo, es muy evidente la forma en que podemos dirigir mediante tests el desarrollo de una clase o una función. Una buena parte de las katas de este libro y, en general, las katas de iniciación a TDD, hacen exactamente eso. El problema viene con el salto al  *mundo real* , un momento en el que muchas personas no consiguen encontrar rendimiento a la introducción de TDD en su proceso de desarrollo.

La cuestión clave es que una historia de usuario no consiste normalmente en desarrollar una clase e integrarla en el código existente, sino que lo normal es desarrollar features que implican un conjunto de componentes, incluyendo algún tipo de interfaz al mundo exterior (UI, API), así como casos de uso, entidades y servicios de dominio, entre otros.

Esto genera una pregunta muy simple: ¿por dónde empezar?

Las diferentes formas de responder a esta pregunta podrían clasificarse en tres, no tan separadas entre sí como se podría pensar. De hecho, no son excluyentes.

## TDD Clásico o Detroit School

Este enfoque recibe ambos nombres debido a ser, por así decir, el modelo original de TDD propuesto por los fundadores del paradigma Extreme Programming (Kent Beck, Ward Cunningham, Ron Jeffries), surgido en el contexto del proyecto Chrysler Comprehensive Compensation System en Detroit.

Habitualmente desde este enfoque un proyecto complejo se abordaría definiendo las unidades de software necesarias y creando cada una de ellas mediante un proceso estándar de TDD.

Por poner un ejemplo muy simplista. Imagina que nuestra tarea es diseñar un *endpoint* de un API.

Esto supondría crear, al menos, un controlador, un caso de uso, una o dos entidades y sus correspondientes repositorios.

En este enfoque clásico de TDD, una vez determinados los componentes necesarios iríamos creándolos en orden de dependencia, empezando por la entidades de dominio y avanzando hacia afuera. Es decir, si para construir una unidad, necesito usar otra unidad, construiré primero esta última. Puesto que las dependencias apuntan hacia el dominio, lo adecuado seria comenzar resolviendo el problema en la capa de dominio e ir “saliendo” hacia las capas más externas.

Algunos rasgos que caracterizan este modelo son:

* Se testea contra las API públicas de las unidades, usando *black box testing* (test de caja negra). Esto implica que en el test no hacemos asunciones sobre el modo en que está implementada la unidad.
* Hincapié especialmente en la fase de refactor, que es la fase en la que se introduce el diseño. Se debe refactorizar en cuanto tenemos tests en verde y por pequeña que parezca la oportunidad.
* Minimiza el uso de dobles de test, limitándolos fundamentalmente a las fronteras de arquitectura.
* Desarrollo desde dentro hacia fuera. Prioriza la identificación y desarrollo de la lógica de dominio.
* Se centra en el estado y outcomes de los objetos y sus métodos.

Este enfoque aporta los beneficios esperables de TDD:

* Trabajar en incrementos pequeños y manejables.
* Generar una red de seguridad con abundantes tests de regresión.
* Posibilidad de refactorizar la implementación con gran seguridad.

En el lado de los inconvenientes habría que señalar:

* Los tests no ayudan realmente a dirigir el diseño, sino la implementación de las unidades. El diseño se hace durante la fase de refactor y puede dar lugar a la extracción de colaboradores de una unidad que se testean a través de la interfaz pública de ésta.
* Se corre el riesgo de crear unidades de software muy grandes, algo que se puede afrontar aplicando refactor de manera intensa, particularmente extrayendo a métodos privados y a colaboradores en cuanto sea posible.
* Se corre también el riesgo de crear funcionalidad no necesaria en las unidades más internas al no tener claras las necesidades de los componentes que dependen de ellas. Contradice un poco el principio de segregación de interfaces, que justamente promueve que sean definidas por las necesidades de sus consumidores.
* Puede dar problemas en la integración de los componentes.

## Outside-in, London School o *mockista*

Su origen está también en la comunidad de  *extreme programming* , pero en este caso la londinense. El nombre viene de que promueve una metodología basada en comenzar a partir de las necesidades de los consumidores de un sistema.

En general, la metodología  *outside-in* , defiende que un proyecto complejo se abordaría definiendo su interfaz más externa y trabajando hacia adentro, descubriendo y definiendo en el camino las unidades necesarias con la ayuda de dobles.

Algunos rasgos que caracterizan este modelo son:

* Se testean las interacciones entre las unidades, lo que conocemos como  *white box testing* . Es decir las aserciones verifican los mensajes que unos componentes envían a otros.
* La fase de refactor es menos importante y el diseño se hace con el test en rojo.
* Los dobles de tests se usan de manera generosa, en cada momento se decide qué colaboradores maneja una unidad y se crean dobles para descubrir y establecer sus interfaces. Las clases reales se implementan posteriormente mediante un proceso TDD clásico en el que las dependencias se doblan primero y se implementan después. Por esta razón también se conoce este enfoque como  *Mockist TDD* .
* El desarrollo va desde fuera hacia dentro, protegido por un test de aceptación.
* Se centra en la comunicación entre objetos, por lo que se podría considerar incluso un enfoque más OOP, en el sentido original de Alan Kay.

Beneficios

* Nos proporciona un enfoque de trabajo que encaja especialmente bien en equipos multidisciplinares y tiene más orientación a negocio.
* Reduce o elimina los problemas de integración del producto final.
* Reduce la probabilidad de escribir código innecesario, las interfaces son más compactas.
* Introduce la consideración del diseño desde el principio del proceso de desarrollo.
* Prestamos más atención a las interacciones entre objetos. Tener que usar primero los dobles para diseñar sus interfaces nos ayuda a que sean más concisas y fáciles de manejar.
* Encaja muy bien en la metodología  *Behavior Driven Development* .

Inconvenientes

* El coste del refactor es más alto porque se centra en interacciones y los tests tienden a ser más frágiles por acoplamiento a la implementación. Sin embargo, hay que pensar que estas interacciones son necesarias y, sobre todo, han sido diseñadas y decididas por nosotras, por lo que son implementaciones razonablemente estables.

## Behavior Driven Development

Se podría decir que si empezamos Outside-in development desde un paso más externo, nos encontramos con [Behavior Driven Development](https://franiglesias.github.io/bdd-business-devel/).

TDD en sus dos escuelas principales es una metodología centrada en el proceso técnico de desarrollar software. Pero BDD da un paso más allá integrando el negocio en el desarrollo.

Esquemáticamente sigue siendo TDD. Se comienza con un test y el desarrollo es impulsado por nuevos tests. La diferencia es que en BDD nos preguntamos por comportamientos o features en los que estamos interesadas y las describimos en lenguaje de negocio con ejemplos. De hecho, existe un lenguaje estructurado para ello:  *gherkin* .

Estas descripciones se traducen en forma de tests de aceptación y se desarrollan a partir de ahí, utilizando una metodología bastante similar a *Outside-in* que, a su vez, puede utilizar el enfoque clásico de TDD cuando toca implementar las unidades concretas de software. Con todo, el tipo de tests unitarios favorecidos por BDD tienden a usar un estilo “especificación mediante ejemplos” en oposición a aserciones.

En la práctica BDD es Outside-in TDD pero tomando como punto de partida a las personas interesadas en el software y sus necesidades, no los contratos o requisitos técnicos de la implementación.

Existen herramientas específicas para este enfoque, siendo la más conocida Cucumber, en Ruby, y que tiene *ports* para otros lenguajes. Estas herramientas sirven para convertir los documentos Gherkin en tests ejecutables. Pero a partir de este punto ya entramos en metodología  *outside-in* .

## Entonces, ¿qué enfoque seguir? Y ¿Cómo aprender TDD a la luz de estos enfoques?

Como se decía al principio del capítulo, el aprendizaje de TDD clásico mediante katas puede ser difícil de transferir a la práctica cotidiana en un problema real de desarrollo. Sin embargo, es un aprendizaje necesario antes de introducirse al enfoque Outside-in que resulta mucho más realista en varios aspectos.

Outside-in no excluye el enfoque clásico, pero lo pone en contexto, mientras nos proporciona un enfoque de diseño dirigido por tests al que se podrían aplicar *grosso modo* los mismos principios de TDD: empezar con un test, escribir el mínimo código de producción para que el test pase y refactorizar la solución si hay oportunidad.

Al fin y al cabo se trata de herramientas y lo importante es tenerlas a mano para utilizarlas cuando nos resulten más apropiadas. En el trabajo real, diría que lo importante es poder mezclar estilos a conveniencia. En una tarea concreta puede que empecemos con un estilo clásico, pero al llegar a cierto punto introduzcamos Mocks para no salirnos del foco de un determinado flujo y poder centrarnos en los detalles más tarde.

Es más difícil encontrar katas en las que se pueda usar un enfoque  *outside-in* . Por lo general son más largas y complejas, aunque también es posible adaptar algunas katas clásicas para practicar este enfoque.

Un plan de formación en TDD podría estructurarse de la siguiente forma:

* Iniciación con katas clásicas
* Perfeccionamiento con katas en forma agile-kata
* Katas *outside-in*
* Perfeccionamiento con agile-kata complejas

## Referencias

* [Does TDD lead to good design](https://codurance.com/2015/05/12/does-tdd-lead-to-good-design/)^[1](https://leanpub.com/tddcourse/read#fn-fn43)^
* [A case for Outside-in Development](https://codurance.com/2017/10/23/outside-in-design/)^[2](https://leanpub.com/tddcourse/read#fn-fn44)^
* [Detroit School TDD](https://github.com/testdouble/contributing-tests/wiki/Detroit-school-TDD)^[3](https://leanpub.com/tddcourse/read#fn-fn45)^
* [London school TDD](https://github.com/testdouble/contributing-tests/wiki/London-school-TDD)^[4](https://leanpub.com/tddcourse/read#fn-fn46)^
* [Extreme programming: origins](https://en.wikipedia.org/wiki/Extreme_programming#Origins)^[5](https://leanpub.com/tddcourse/read#fn-fn47)^
* [The failures of “intro to TDD”](http://blog.testdouble.com/posts/2014-01-25-the-failures-of-intro-to-tdd/)^[6](https://leanpub.com/tddcourse/read#fn-fn48)^
* [Endo-Testing: Unit Testing with Mock Objects (PDF)](https://www2.ccs.neu.edu/research/demeter/related-work/extreme-programming/MockObjectsFinal.PDF)^[7](https://leanpub.com/tddcourse/read#fn-fn49)^
* [The London School of Test Driven Development](http://coding-is-like-cooking.info/2013/04/the-london-school-of-test-driven-development/)^[8](https://leanpub.com/tddcourse/read#fn-fn50)^
* [Outside-In development with Double Loop TDD](http://coding-is-like-cooking.info/2013/04/outside-in-development-with-double-loop-tdd/)^[9](https://leanpub.com/tddcourse/read#fn-fn51)^
* [“Tell, Don’t Ask” Object Oriented Design](http://coding-is-like-cooking.info/2013/05/tell-dont-ask-object-oriented-design/)^[10](https://leanpub.com/tddcourse/read#fn-fn52)^

# 20 Proyecto Todo-List

En esta parte de desarrollo con enfoque  *outside-in* , realizaremos un pequeño proyecto que consiste en un API para una aplicación de lista de tareas.

Básicamente queremos implementar las siguientes funcionalidades:

### US 1

* As a User
* I want to add tasks to a to-do list
* So that, I can organize my task

### US 2

* As a User
* I want to see the task in my to-do list
* So that, I can know what I have to do next

### US 3

* As a User
* I want to check a task when it is done
* So that, I can see my progress

### Ejemplos para tests

1. Write a test that fails (done)
2. Write Production code that makes the test pass
3. Refactor if there is opportunity

### Endpoints, payloads y respuestas

```

 1 
POST /api/todo


 2 
[task:Write a test that fails]


 3 
201. Created


 4 


 5 
POST /api/todo


 6 
[task:Write Production code that makes the test pass]


 7 
201. Created


 8 


 9 
POST /api/todo


10 
[task:Refactor if there is opportunity]


11 
201. Created


12 


13 
PATCH /api/todo/1


14 
[done:true]


15 
200. Ok


16 


17 
GET /api/todo


18 
[√] 1. Write a test that fails


19 
[ ] 2. Write Production code that makes the test pass


20 
[ ] 3. Refactor if there is opportunity


21 
200. Ok

```

Para simplificar, la lista de tareas que esperamos es un array de strings, con los datos de las tareas formateados.

## Diseño

Para desarrollar *outside-in* es necesario hacer un cierto diseño previo. Por supuesto, no se trata de generar todas las especificaciones de los componentes hasta el mínimo detalle, sino de plantear una idea general del modelo de arquitectura que vamos a seguir y los grandes componentes que esperamos desarrollar.

Esto nos ayudará a ubicar los distintos elementos y comprender sus relaciones y dependencias. Nos proporciona un contexto de cómo funciona el ciclo de la aplicación y cómo se organizan y comunican sus componentes.

### Capas

Nuestra aplicación se organizará en capas:

* **Dominio** : contiene las entidades del dominio que son el corazón mismo de la aplicación y en la que se representan los conceptos, procesos y reglas de negocio.
* **Aplicación** : los distintos casos de uso de la aplicación, representando las intenciones de sus consumidoras
* **Infrastructura** : las implementaciones concretas necesarias para que la aplicación funciones. A su vez, esta capa tiene diversos  *puertos* :
  * **Puntos de entrada** , como puede ser el Api, que contiene los controladores que se encargan de interaccionar con las consumidoras. En su caso aquí también residirían los comandos de consola y otros.
  * **Persistencia** : los adaptadores de las tecnologías de persistencia que necesitamos para implementar el repositorio.
  * En caso necesario, otros adaptadores.
* **Vendor** o  **Lib** , contienen los recursos de terceros que necesita la aplicación para funcionar.

Las dependencias apuntan siempre hacia el dominio.

### Flujo de la aplicación

Al hacer una *request* HTTP a un  *endpoint* , un controlador recoge los datos necesarios y los pasa a una instancia del caso de uso correspondiente. Recoge la respuesta, si la hay, y la transforma para entregarla a la consumidora.

El caso de uso instancia o reclama del repositorio las entidades de dominio que sean necesarias y utiliza los servicios de dominio para realizar su tarea.

Los casos de uso pueden adoptar la forma de *comands* o  *queries* . En el primer caso, provocan un efecto en el sistema. En el segundo, devuelven una respuesta. Para acomodar la respuesta a la demanda del controlador, pueden usar algún tipo de transformador de datos, de modo que los objetos de dominio no llegan nunca al controlador, sino una representación. Mediante un patrón *Strategy* podemos hacer que el controlador decida en qué representación concreta está interesado.

### Arquitectura

Construiremos la aplicación usando el enfoque de [arquitectura hexagonal](https://alistair.cockburn.us/hexagonal-architecture/)^[1](https://leanpub.com/tddcourse/read#fn-fn60)^ con una estructura de tres capas: dominio, aplicación e infrastructura, tal como hemos detallado un poco más arriba.El desarrollo comenzará con un test de aceptación, que actúa como consumidor de la API, lo que nos llevará a implementar los controladores, en primer lugar,

Este es un esquema genérico del tipo de arquitectura que tenemos en mente al desarrollar esta aplicación.

![](https://leanpub.com/site_images1/tddcourse/images----print----app-architecture.jpeg)
Arquitectura hexagonal de la aplicación

# 21 *Outside-in mockista*

Outside-in TDD, también llamado *mockist* o  *London school* , es una aproximación al desarrollo dirigido por tests que busca implementar *features* en el software partiendo de un test de aceptación y procediendo hacia el interior del software.

En lugar de diseñar el sistema en la fase de refactoring, como hace el enfoque clásico, la aproximación *outside-in* lo hace durante la fase  *en rojo* , es decir, cuando el test de aceptación todavía está fallando. El desarrollo estará terminado cuando el test de aceptación pasa. A medida que tenemos que implementar componentes, estos se desarrollan con un estilo clásico.

Así por ejemplo, en el desarrollo de un API, primero se escribiría un test de aceptación contra el API, como si el test fuese un consumidor más de ese API. El siguiente paso sería diseñar y testear el controlador, luego el caso de uso, y luego los servicios y entidades manejados por ese caso de uso, hasta llegar al dominio de la aplicación. En todos los casos haríamos *mocks* de las dependencias, de modo que estaríamos testeando los mensajes entre objetos de la aplicación.

Para hacerlo, la metodología se basa en dos ciclos:

* **Ciclo test de aceptación** . Se trata de un test que describe la feature completa en el nivel  *end to end* , usando implementaciones reales de los componentes del sistema, excepto aquellas que definen límites del mismo. Los fallos de los test en este nivel nos sirven como guía para saber qué es lo próximo que tenemos que desarrollar.
* **Ciclo de tests unitarios** . Una vez que tenemos un fallo en el test de aceptación que nos indica qué tenemos que desarrollar, daremos un paso hacia el interior del sistema y usaremos tests unitarios para desarrollar el componente correspondiente, *mockeando* aquellos colaboradores o dependencias que éste pueda necesitar. Cuando terminamos, volvemos al ciclo del test de aceptación para encontrar cual será nuestro próximo objetivo.

![](https://leanpub.com/site_images1/tddcourse/images----print----outside-in-cycle.jpeg)
El ciclo outside-in mockista

## Desarrollo

En esta ocasión vamos a desarrollar la kata en PHP, usando [este repositorio](https://github.com/franiglesias/tb), ya que contiene una instalación preparada de PHP y Symfony, lo que nos proporciona un *framework* HTTP con el que empezar a desarrollar:

`https://github.com/franiglesias/tb`

En los ejemplos de PHP no mostraré la tag de apertura `<?php`, ni la declaración `declare(strict_types=1);`, para ahorrar espacio.

En el repositorio ya tenemos un test básico que utilizaremos como punto de partida:

```

 1 
namespace
 
App\Tests\Katas\TodoList
;


 2 


 3 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


 4 


 5 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


 6 
{


 7 


 8 
  
protected
 
function
 
setUp
()
:
 
void


 9 
  
{


10 
      
$this
->
resetRepositoryData
();


11 
  
}


12 


13 
  
protected
 
function
 
tearDown
()
:
 
void


14 
  
{


15 
      
$this
->
resetRepositoryData
();


16 
  
}


17 


18 
  
private
 
function
 
resetRepositoryData
()
:
 
void


19 
  
{


20 
      
if
 
(
file_exists
(
'repository.data'
))
 
{


21 
          
unlink
(
'repository.data'
);


22 
      
}


23 
  
}


24 
}

```

Los métodos `setUp` y `tearDown` gestionan un archivo de datos necesario para la implementación de un sistema muy básico de persistencia (`FileStorageEngine`) que necesitaremos para poder implementar la feature completa. No necesitamos tenerlos en cuenta en los tests.

## Diseñando el test de aceptación

Necesitamos un test de aceptación que describa cómo tiene que funcionar la aplicación. Para ello tenemos un ejemplo. Estas son las tareas que vamos a poner en nuestra lista:

```

1 
1. Write a test that fails (done)

2 
2. Write Production code that makes the test pass

3 
3. Refactor if there is opportunity
```

Los pasos que el test tiene que ejecutar, por tanto, son anotar las tres tareas, marcar la primera como hecha y ser capaz de mostrarnos la lista. Estas operaciones son:

```

 1 
POST /api/todo


 2 
payload: [task:Write a test that fails]


 3 


 4 
POST /api/todo


 5 
payload: [task:Write Production code that makes the test pass]


 6 


 7 
POST /api/todo


 8 
payload: [task:Refactor if there is opportunity]


 9 


10 
PATCH /api/todo/1


11 
payload: [done:true]


12 


13 
GET /api/todo


14 
Response:


15 
[√] 1. Write a test that fails


16 
[ ] 2. Write Production code that makes the test pass


17 
[ ] 3. Refactor if there is opportunity

```

Para simplificar, la respuesta será una representación de cada tarea en una línea de texto con el formato que se puede ver arriba.

### Empezando por el final: cuál será el resultado esperado

Para empezar a diseñar nuestro test, comenzamos por el final, es decir, por la llamada para recuperar la lista de tareas y que representa el resultado que esperamos obtener al final del proceso. A partir de ahí iremos reproduciendo los pasos previos necesarios para llegar a ese estado.

```

 1 
  
/** @test */


 2 
  
public
 
function
 
shouldAllowAddingTaskCompleteAndRetrieveTheList
()
:
 
void


 3 
  
{


 4 
      
$expectedList
 
=
 
[


 5 
          
'[√] 1. Write a test that fails'
,


 6 
          
'[ ] 2. Write Production code that makes the test pass'
,


 7 
          
'[ ] 3. Refactor if there is opportunity'
,


 8 
      
];


 9 


10 
      
$client
 
=
 
self
::
createClient
();


11 
      
$client
->
request
(
'GET'
,
 
'/api/todo'
);


12 
      
$response
 
=
 
$client
->
getResponse
();


13 
      
$list
 
=
 
json_decode
(
$response
->
getContents
(),
 
true
);


14 
      

15 
      
self
::
assertEquals
(
Response
::
HTTP_OK
,
 
$response
->
getStatusCode
());


16 
      
self
::
assertEquals
(
$list
,
 
$expectedList
);


17 
  
}

```

Para llegar a este punto, necesitaríamos haber hecho una petición a la API por cada tarea y una petición más para marcar una tarea como completada. De este modo, el test completo quedaría así:

```

 1 
  
/** @test */


 2 
  
public
 
function
 
shouldAllowAddingTaskCompleteAndRetrieveTheList
()
:
 
void


 3 
  
{


 4 
      
$expectedList
 
=
 
[


 5 
          
'[√] 1. Write a test that fails'
,


 6 
          
'[ ] 2. Write Production code that makes the test pass'
,


 7 
          
'[ ] 3. Refactor if there is opportunity'
,


 8 
      
];


 9 


10 
      
$client
 
=
 
self
::
createClient
();


11 


12 
      
$taskDescription
 
=
 
'Write a test that fails'
;


13 
      
$client
->
request
(


14 
          
'POST'
,


15 
          
'/api/todo'
,


16 
          
[],


17 
          
[],


18 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


19 
          
json_encode
([
'task'
 
=>
 
$taskDescription
])


20 
      
);


21 


22 
      
$taskDescription
 
=
 
'Write Production code that makes the test pass'
;


23 
      
$client
->
request
(


24 
          
'POST'
,


25 
          
'/api/todo'
,


26 
          
[],


27 
          
[],


28 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


29 
          
json_encode
([
'task'
 
=>
 
$taskDescription
])


30 
      
);


31 


32 
      
$taskDescription
 
=
 
'Refactor if there is opportunity'
;


33 
      
$client
->
request
(


34 
          
'POST'
,


35 
          
'/api/todo'
,


36 
          
[],


37 
          
[],


38 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


39 
          
json_encode
([
'task'
 
=>
 
$taskDescription
])


40 
      
);


41 


42 
      
$taskId
 
=
 
1
;


43 
      
$client
->
request
(


44 
          
'PATCH'
,


45 
          
'/api/todo/'
.
$taskId
,


46 
          
[],


47 
          
[],


48 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


49 
          
json_encode
([
'done'
 
=>
 
true
])


50 
      
);


51 


52 
      
$client
->
request
(
'GET'
,
 
'/api/todo'
);


53 
      
$response
 
=
 
$client
->
getResponse
();


54 
      
$list
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


55 


56 
      
self
::
assertEquals
(
$list
,
 
$expectedList
);


57 
  
}

```

Si lo ejecutamos empezaremos a ver fallos acerca de problemas de la configuración del  *framework* . Lo primero que tenemos que hacer es conseguir que el test falle por el motivo correcto, que no es otro sino que al pedir la lista de tareas la respuesta `$list` no sea la que esperamos. Por lo tanto, primero iremos resolviendo estos problemas hasta lograr que el test se ejecute.

### Resolviendo los detalles necesarios en el *framework*

El primer error nos dice que no hay ningún controlador en la ubicación esperada por el  *framework* . En nuestro caso, además de eso, queremos montar una solución con una arquitectura limpia. Según eso, los controladores del API deberían estar en la capa de Infraestructura, por lo que vamos a cambiar la configuración de **services.yaml** de Symfony de modo que espere encontrar los controladores en otra ruta. En concreto, yo prefiero ponerlos en:

`src/Infrastructure/EntryPoint/Api/Controller`

Por tanto, **services.yaml** quedará así:

```

1 
  
# controllers are imported separately to make sure services can be injected


2 
  
# as action arguments even if you don't extend any base controller class


3 
  
App\Infrastructure\EntryPoint\Api\Controller\
:


4 
      
resource
:
 
'../src/Infrastructure/EntryPoint/Api/Controller'


5 
      
tags
:
 
[
'controller.service_arguments'
]

```

Si ejecutamos el test de nuevo, veremos que el mensaje de error ha cambiado, lo cual indica que hemos intervenido de manera correcta. Ahora nos indica que no hay controladores en el nuevo lugar definido, así que vamos a crear una clase `TodoListController` en la ubicación: `\App\Infrastructure\EntryPoint\Api\Controller\TodoListController`.

```

1 
namespace
 
App
\
Infrastructure
\
EntryPoint
\
Api
\
Controller
;


2 


3 


4 
class
 
TodoListController


5 
{


6 


7 
}

```

Y de momento, la dejamos así. Ejecutamos el test para ver qué nos dice. Tenemos dos tipos de mensajes. Por una parte, varias excepciones que os indican que no se encuentras las rutas de los  *endpoints* , las cuales no hemos definido todavía.

Por otra parte, el test nos indica que la llamada al *endpoint* devuelve `null` y, por tanto, no tenemos todavía la lista de tareas.

Así que necesitamos que nuestro controlador sea capaz de gestionar estas rutas antes de nada. La primera ruta que no encuentra es la de `POST /api/todo`, con la que añadimos tareas a la lista. Para ello, introduciremos una entrada en el archivo  **routes.yaml** .

```

1 
api_add_task
:


2 
  
path
:
 
/api/todo


3 
  
controller
:
 
App\Infrastructure\EntryPoint\Api\Controller\TodoListController::addTask


4 
  
methods
:
 
[
'POST'
]

```

Una vez añadida la ruta, ejecutamos de nuevo el test de aceptación. Lo adecuado es lanzar el test con cada cambio para confirmar que falla por el motivo esperado. En este caso, esperamos que nos diga que no tenemos un método `addTask` en `TodoListController`, y lo tenemos que añadir para avanzar.

Observarás que no estoy siguiendo las convenciones habituales de Symfony.

```

 1 
namespace
 
App\Infrastructure\EntryPoint\Api\Controller
;


 2 


 3 


 4 
class
 
TodoListController


 5 
{


 6 


 7 
  
public
 
function
 
addTask
()


 8 
  
{


 9 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s::%s'
,
 
__CLASS__
,
 
__METHOD__
));


10 
  
}


11 
}

```

Como puedes ver, en el método lanzo una excepción que me permitirá ver cuando se está llamando al controlador real. De este modo, sabré con seguridad si es lo que tengo que implementar a continuación. Esta técnica se la he visto a Sandro Mancuso en su vídeo sobre *Outside-in* y me parece muy útil. En algunas ocasiones el propio compilador o intérprete podría señalar este falta de implementación, pero hacerlo explícito hará que todo sea más fácil para nosotras.

Al relanzar el test, el primer error nos dice literalmente que hay que implementar el método `addTask`.

Y esto nos lleva al ciclo de tests unitarios.

## Primer test unitario

El primer test unitario nos introduce un paso hacia el interior de la aplicación. El test de aceptación ejercita el código desde *fuera* de la aplicación, mientras que el controlador se encuentra en la capa de Infraestructura. Lo que vamos a hacer es desarrollar el controlador con un test unitario, pero en lugar de usar el enfoque clásico, que consiste en implementar una solución y luego usar la etapa de refactor para diseñar los componentes, empezaremos por este punto.

Es decir, lo que queremos hacer es diseñar qué componentes queremos que use el controlador para devolver una respuesta, *mockearlos* en el test, implementando sólo el código propio del controlador.

En este ejemplo, voy a suponer que cada controlador invoca un caso de uso en la capa de aplicación. Para que se entienda mejor no usaré un bus de comandos como haría en una aplicación real, sino que invocaré directamente los casos de uso.

Este es mi primer test unitario:

```

 1 
namespace
 
App\Tests\Infrastructure\EntryPoint\Api\Controller
;


 2 


 3 
use
 
App\Infrastructure\EntryPoint\Api\Controller\TodoListController
;


 4 
use
 
PHPUnit\Framework\TestCase
;


 5 
use
 
Symfony\Component\HttpFoundation\Request
;


 6 
use
 
Symfony\Component\HttpFoundation\Response
;


 7 


 8 
class
 
TodoListControllerTest
 
extends
 
TestCase


 9 
{


10 


11 
  
/** @test */


12 
  
public
 
function
 
shouldAddTask
()
:
 
void


13 
  
{


14 
      
$addTask
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


15 
      
$addTask


16 
          
->
expects
(
self
::
once
())


17 
          
->
method
(
'execute'
)


18 
          
->
with
(
'Task Description'
);


19 
          

20 
      
$todoListController
 
=
 
new
 
TodoListController
(
$addTask
);


21 


22 
      
$request
 
=
 
new
 
Request
(


23 
          
[],


24 
          
[],


25 
          
[],


26 
          
[],


27 
          
[],


28 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


29 
          
json_encode
([
'task'
 
=>
 
'Task Description'
],
 
JSON_THROW_ON_ERROR
)


30 
      
);


31 
      

32 
      
$response
 
=
 
$todoListController
->
addTask
(
$request
);


33 
      

34 
      
self
::
assertEquals
(
Response
::
HTTP_CREATED
,
 
$response
->
getStatusCode
());


35 
  
}


36 
}

```

Por un lado, en el test simulamos una *request* con un payload JSON, que será la que nos proporcione los datos necesario. El mock de `AddTaskHandler` simula que simplemente llamamos a su método `execute` pasándole como parámetro la descripción de la tarea proporcionada en la llamada al  *endpoint* .

Gracias al uso de *mocks* no tenemos que preocuparnos de qué pasa más adentro en la aplicación. Lo que estamos testando es el modo en el que el controlador obtiene los datos relevantes y se los pasa al caso de uso para que éste haga lo que tenga que hacer. Si no hay ningún problema, el controlador retornará una respuesta 201, indicando que el recurso ha sido creado. No nos vamos a ocupar en este ejemplo de todos los posibles fallos que podrían ocurrir, pero puedes hacerte una idea de cómo se gestionaría.

Ahora ejecutamos el test `TodoListController` para asegurar que falla por las razones esperadas: que no se llama a `AddTaskHandler` y que no se devuelve el código HTTP 201.

En este caso, el primer error es que no tenemos una clase `AddTaskHandler` que  *mockear* , así que la creamos. La vamos a poner en `App\Application`.

```

1 
namespace
 
App
\
Application
;


2 


3 


4 
class
 
AddTaskHandler


5 
{


6 


7 
}

```

Tiramos de nuevo el test, que nos indicará que no existe un método *execute* que se pueda  *mockear* . Lo añadimos, pero dejamos que lance una excepción para decirnos que no está implementado. Veremos la utilidad de ello dentro de un rato, porque en este test no se va a ejecutar en realidad.

```

 1 
namespace
 
App\Application
;


 2 


 3 


 4 
class
 
AddTaskHandler


 5 
{


 6 
  
public
 
function
 
execute
(
string
 
$taskDescription
)


 7 
  
{


 8 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s::%s'
,
 
__CLASS__
,
 
__METHOD__
));


 9 
  
}


10 
}

```

En cambio, si todo ha ido bien, en este punto el test nos pedirá que implementemos el método `addTask` del controlador, que es el punto al que queríamos llegar.

```

 1 
namespace
 
App\Infrastructure\EntryPoint\Api\Controller
;


 2 


 3 


 4 
use
 
App\Application\AddTaskHandler
;


 5 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 6 
use
 
Symfony\Component\HttpFoundation\Request
;


 7 
use
 
Symfony\Component\HttpFoundation\Response
;


 8 


 9 
class
 
TodoListController


10 
{


11 


12 
  
private
 
AddTaskHandler
 
$addTask
;


13 


14 
  
public
 
function
 
__construct
(
AddTaskHandler
 
$addTask
)


15 
  
{


16 
      
$this
->
addTask
 
=
 
$addTask
;


17 
  
}


18 


19 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


20 
  
{


21 
      
$body
 
=
 
json_decode
(
$request
->
getContent
(),
 
true
);


22 


23 
      
$this
->
addTask
->
execute
(
$body
[
'task'
]);


24 


25 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


26 
  
}


27 
}

```

Este código hace pasar el test. Puesto que es relativamente sencillo no vamos a hacerlo en pasos muy pequeños a fin de avanzar más rápido con la explicación.

Vamos a aprovechar que el test está en verde para refactorizarlo un poco. Sabemos que tendremos que añadir más tests en este `TestCase` y que habrá que instanciar el controlador varias veces, así que vamos a hacernos la vida un poco más fácil para el futuro próximo. Tras asegurarnos de que sigue pasando, el test queda así:

```

 1 
namespace
 
App\Tests\Infrastructure\EntryPoint\Api\Controller
;


 2 


 3 
use
 
App\Application\AddTaskHandler
;


 4 
use
 
App\Infrastructure\EntryPoint\Api\Controller\TodoListController
;


 5 
use
 
PHPUnit\Framework\TestCase
;


 6 
use
 
Symfony\Component\HttpFoundation\Request
;


 7 
use
 
Symfony\Component\HttpFoundation\Response
;


 8 


 9 
class
 
TodoListControllerTest
 
extends
 
TestCase


10 
{


11 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


12 
  
private
 
TodoListController
 
$todoListController
;


13 


14 


15 
  
protected
 
function
 
setUp
()
:
 
void


16 
  
{


17 
      
$this
->
addTaskHandler
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


18 
      
$this
->
todoListController
 
=
 
new
 
TodoListController
(
$this
->
addTaskHandler
);


19 
  
}


20 
  

21 
  
/** @test */


22 
  
public
 
function
 
shouldAddTask
()
:
 
void


23 
  
{


24 
      
$this
->
addTaskHandler


25 
          
->
expects
(
self
::
once
())


26 
          
->
method
(
'execute'
)


27 
          
->
with
(
'Task Description'
);


28 


29 
      
$request
 
=
 
new
 
Request
(


30 
          
[],


31 
          
[],


32 
          
[],


33 
          
[],


34 
          
[],


35 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


36 
          
json_encode
([
'task'
 
=>
 
'Task Description'
],
 
JSON_THROW_ON_ERROR
)


37 
      
);


38 


39 
      
$response
 
=
 
$this
->
todoListController
->
addTask
(
$request
);


40 


41 
      
self
::
assertEquals
(
Response
::
HTTP_CREATED
,
 
$response
->
getStatusCode
());


42 
  
}


43 
}

```

Es momento de volver a ejecutar el test de aceptación.

## De vuelta en el ciclo de aceptación

Ahora que el test `TodoListController` está pasando, ya no tenemos más trabajo que hacer en este nivel, así que volvemos al test de aceptación para ver si sigue fallando algo y qué es lo que falla.

En este punto, lo que nos dice es que `AddTaskHandler::execute` no está implementada. ¿Recuerdas la excepción que pusimos antes? Pues eso nos dice que tenemos que movernos un nivel más adentro y ponernos en la capa de Aplicación para desarrollar el caso de uso. Por supuesto, con un test unitario.

Como hemos dicho antes, en *outside-in* diseñamos en la fase de test en rojo y *mockeamos* los componentes que la unidad actual pueda utilizar como colaboradores. Normalmente no haremos dobles de entidades. En este caso, lo que esperamos del caso de uso es:

* Que cree una nueva tarea, modelada con una entidad de dominio `Task`
* Que la persista en un repositorio
* La tarea tiene que adquirir un Id, el cual será proporcionado por el repositorio.

Esto indica que el caso de uso tendrá una dependencia, el repositorio `TaskRepository`, y que empezaremos a modelar las tareas con una entidad `Task`. Este es el test.

```

 1 
namespace
 
App\Tests\Application
;


 2 


 3 
use
 
App\Application\AddTaskHandler
;


 4 
use
 
PHPUnit\Framework\TestCase
;


 5 


 6 
class
 
AddTaskHandlerTest
 
extends
 
TestCase


 7 
{


 8 


 9 
  
/** @test */


10 
  
public
 
function
 
shouldAddATaskToRepository
()
:
 
void


11 
  
{


12 
      
$taskRepository
 
=
 
$this
->
createMock
(
TaskRepository
::
class
);


13 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


14 
      

15 
      
$taskRepository


16 
          
->
method
(
'nextId'
)


17 
          
->
willReturn
(
1
);


18 
      

19 
      
$taskRepository


20 
          
->
expects
(
self
::
once
())


21 
          
->
method
(
'store'
)


22 
          
->
with
(
$task
);


23 
      

24 
      

25 
      
$addTaskHandler
 
=
 
new
 
AddTaskHandler
(
$taskRepository
);


26 
      

27 
      
$addTaskHandler
->
execute
(
'Task Description'
);


28 
  
}


29 
}

```

Lo ejecutamos y nos irá diciendo qué tenemos que hacer.

Lo primero será crear `TaskRepository` para poder  *mockearlo* . En este caso, el repositorio se define como interfaz en la capa de dominio, como ya sabemos. Así que empezamos por ahí.

```

1 
namespace
 
App\Domain
;


2 


3 


4 
interface
 
TaskRepository


5 
{


6 


7 
}

```

Lo siguiente será la entidad `Task`, que también está en el dominio.

```

 1 
namespace
 
App\Domain
;


 2 


 3 


 4 
class
 
Task


 5 
{


 6 


 7 
  
private
 
int
 
$id
;


 8 
  
private
 
string
 
$description
;


 9 


10 
  
public
 
function
 
__construct
(
int
 
$id
,
 
string
 
$description
)


11 
  
{


12 
      
$this
->
id
 
=
 
$id
;


13 
      
$this
->
description
 
=
 
$description
;


14 
  
}


15 
}

```

De momento, me limito a crear lo básico, ya veremos lo que el desarrollo nos va pidiendo.

El siguiente error nos indica que no tenemos un método `nextId` en `TaskRepository`, así que lo introducimos en la interfaz.

```

1 
namespace
 
App\Domain
;


2 


3 


4 
interface
 
TaskRepository


5 
{


6 
  
public
 
function
 
nextId
()
:
 
int
;


7 
}

```

Y tampoco tenemos un método `store`. Lo mismo:

```

1 
namespace
 
App\Domain
;


2 


3 


4 
interface
 
TaskRepository


5 
{


6 
  
public
 
function
 
nextId
()
:
 
int
;


7 


8 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void
;


9 
}

```

Por último, al invocar el método `execute`, nos lanza la consabida excepción de que no tiene código, indicando que ya hemos preparado todo lo necesario hasta ahora, así que vamos a implementar por fin.

```

 1 
namespace
 
App\Application
;


 2 


 3 


 4 
use
 
App\Domain\Task
;


 5 
use
 
App\Domain\TaskRepository
;


 6 


 7 
class
 
AddTaskHandler


 8 
{


 9 
  
private
 
TaskRepository
 
$taskRepository
;


10 


11 
  
public
 
function
 
__construct
(
TaskRepository
 
$taskRepository
)


12 
  
{


13 
      
$this
->
taskRepository
 
=
 
$taskRepository
;


14 
  
}


15 


16 
  
public
 
function
 
execute
(
string
 
$taskDescription
)
:
 
void


17 
  
{


18 
      
$id
 
=
 
$this
->
taskRepository
->
nextId
();


19 


20 
      
$task
 
=
 
new
 
Task
(
$id
,
 
$taskDescription
);


21 


22 
      
$this
->
taskRepository
->
store
(
$task
);


23 
  
}


24 
}

```

Con este código, el test pasa. Ya no tenemos nada más que hacer aquí, salvo ver si podemos refactorizar alguna cosa. En el test vemos algunos detalles que se pueden mejorar, para hacerlo todo más fácil de entender:

```

 1 
namespace
 
App\Tests\Application
;


 2 


 3 
use
 
App\Application\AddTaskHandler
;


 4 
use
 
App\Domain\Task
;


 5 
use
 
App\Domain\TaskRepository
;


 6 
use
 
PHPUnit\Framework\TestCase
;


 7 


 8 
class
 
AddTaskHandlerTest
 
extends
 
TestCase


 9 
{


10 
  
private
 
const
 
NEW_TASK_ID
 
=
 
1
;


11 
  
private
 
const
 
NEW_TASK_DESCRIPTION
 
=
 
'Task Description'
;


12 


13 
  
/** @test */


14 
  
public
 
function
 
shouldAddATaskToRepository
()
:
 
void


15 
  
{


16 
      
$task
 
=
 
new
 
Task
(
self
::
NEW_TASK_ID
,
 
self
::
NEW_TASK_DESCRIPTION
);


17 
      

18 
      
$taskRepository
 
=
 
$this
->
createMock
(
TaskRepository
::
class
);


19 
      
$taskRepository


20 
          
->
method
(
'nextId'
)


21 
          
->
willReturn
(
self
::
NEW_TASK_ID
);


22 
      
$taskRepository


23 
          
->
expects
(
self
::
once
())


24 
          
->
method
(
'store'
)


25 
          
->
with
(
$task
);


26 
      

27 
      
$addTaskHandler
 
=
 
new
 
AddTaskHandler
(
$taskRepository
);


28 


29 
      
$addTaskHandler
->
execute
(
self
::
NEW_TASK_DESCRIPTION
);


30 
  
}


31 
}

```

Volvamos al test de aceptación, a ver qué ocurre.

## Nueva visita al test de aceptación

Al ejecutar de nuevo el test de aceptación, nos indica que aunque tenemos una interfaz para `TaskRepository` no hemos definido ninguna implementación concreta, por lo que el test no se ejecuta. Es hora de desarrollar una.

Teniendo en cuenta que estamos creando un API REST necesitamos que las tareas que almacenemos persistan entre llamadas, por lo que en principio un repositorio en memoria no nos valdrá. En nuestro caso usaremos un  *vendor* , que se encuentra en el repositorio que estamos usando como base para este desarrollo. Se trata de la clase `FileStorageEngine`. Simplemente guarda los objetos en un archivo, de modo que simulamos una base de datos real, cuya persistencia es suficiente para ejecutar el test.

```

 1 
namespace
 
App\Lib
;


 2 


 3 


 4 
class
 
FileStorageEngine


 5 
{


 6 
  
private
 
string
 
$filePath
;


 7 


 8 
  
public
 
function
 
__construct
(
$filePath
)


 9 
  
{


10 
      
$this
->
filePath
 
=
 
$filePath
;


11 
  
}


12 


13 
  
public
 
function
 
loadObjects
(
string
 
$class
)
:
 
array


14 
  
{


15 
      
if
 
(
!
file_exists
(
$this
->
filePath
))
 
{


16 
          
return
 
[];


17 
      
}


18 


19 
      
$file
 
=
 
fopen
(
$this
->
filePath
,
 
'rb'
);


20 
      
$objects
 
=
 
unserialize
(
fgets
(
$file
),
 
[
'allowed_classes'
 
=>
 
[
$class
]]);


21 
      
fclose
(
$file
);


22 


23 
      
return
 
$objects
;


24 
  
}


25 


26 
  
public
 
function
 
persistObjects
(
array
 
$objects
)
:
 
void


27 
  
{


28 
      
$file
 
=
 
fopen
(
$this
->
filePath
,
 
'wb'
);


29 
      
fwrite
(
$file
,
 
serialize
(
$objects
));


30 
      
fclose
(
$file
);


31 
  
}


32 


33 
}

```

Vamos entonces a escribir tests unitarios para desarrollar un repositorio de tareas que utilice `FileStorageEngine`.

```

 1 
namespace
 
App\Tests\Infrastructure\Persistence
;


 2 


 3 
use
 
App\Domain\Task
;


 4 
use
 
App\Infrastructure\Persistence\FileTaskRepository
;


 5 
use
 
App\Lib\FileStorageEngine
;


 6 
use
 
PHPUnit\Framework\TestCase
;


 7 


 8 
class
 
FileTaskRepositoryTest
 
extends
 
TestCase


 9 
{


10 
  
/** @test */


11 
  
public
 
function
 
shouldBeAbleToStoreTasks
()
:
 
void


12 
  
{


13 
      
$task
 
=
 
new
 
Task
(
1
,
 
'TaskDescription'
);


14 
      
$storageEngine
 
=
 
$this
->
createMock
(
FileStorageEngine
::
class
);


15 
      
$storageEngine


16 
          
->
method
(
'loadObjects'
)


17 
          
->
with
(
Task
::
class
)


18 
          
->
willReturn
([]);


19 
      
$storageEngine


20 
          
->
expects
(
self
::
once
())


21 
          
->
method
(
'persistObjects'
)


22 
          
->
with
([
'1'
 
=>
 
$task
]);


23 


24 
      
$taskRepository
 
=
 
new
 
FileTaskRepository
(
$storageEngine
);


25 
      
$taskRepository
->
store
(
$task
);


26 
  
}


27 
}

```

Al ejecutar el test, nos dice que no tenemos un `FileTaskRepository`, así que empezamos a construirlo. Al fallar, el test nos irá indicando qué tenemos que hacer. Y este es el resultado:

```

 1 
namespace
 
App\Infrastructure\Persistence
;


 2 


 3 


 4 
use
 
App\Domain\Task
;


 5 
use
 
App\Domain\TaskRepository
;


 6 
use
 
App\Lib\FileStorageEngine
;


 7 


 8 
class
 
FileTaskRepository
 
implements
 
TaskRepository


 9 
{


10 
  
private
 
FileStorageEngine
 
$storageEngine
;


11 


12 
  
public
 
function
 
__construct
(
FileStorageEngine
 
$storageEngine
)


13 
  
{


14 
      
$this
->
storageEngine
 
=
 
$storageEngine
;


15 
  
}


16 


17 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void


18 
  
{


19 
      
$tasks
 
=
 
$this
->
storageEngine
->
loadObjects
(
Task
::
class
);


20 
      
$tasks
[
$task
->
id
()]
 
=
 
$task
;


21 
      
$this
->
storageEngine
->
persistObjects
(
$tasks
);


22 
  
}


23 


24 
  
public
 
function
 
nextId
()
:
 
int


25 
  
{


26 
      
throw
 
new
 
\RuntimeException
(
'Implement nextId() method.'
);


27 
  
}


28 
}

```

De nuevo, nos hemos saltado algunos *baby steps* para llegar a la implementación deseada. Una vez que el test pasa, volveremos al test de aceptación.

El test ahora nos indica que nos falta por implementar el método `nextId` en `FileTaskRepository`. Así que volveremos al test unitario.

En principio lo que vamos a hacer es simplemente devolver como nuevo `id` el número de tareas guardadas más uno. Esto no funcionará bien en el caso de que lleguemos a borrar tareas, pero por el momento será suficiente. Este es el test:

```

 1 
  
/** @test */


 2 
  
public
 
function
 
shouldProvideNextIdentity
()
:
 
void


 3 
  
{


 4 
      
$storageEngine
 
=
 
$this
->
createMock
(
FileStorageEngine
::
class
);


 5 
      
$storageEngine


 6 
          
->
method
(
'loadObjects'
)


 7 
          
->
with
(
Task
::
class
)


 8 
          
->
willReturn
([]);


 9 


10 
      
$taskRepository
 
=
 
new
 
FileTaskRepository
(
$storageEngine
);


11 
      
$id
 
=
 
$taskRepository
->
nextId
();


12 
      
self
::
assertEquals
(
1
,
 
$id
);


13 
  
}

```

Y esta la implementación:

```

1 
  
public
 
function
 
nextId
()
:
 
int


2 
  
{


3 
      
$tasks
 
=
 
$this
->
storageEngine
->
loadObjects
(
Task
::
class
);


4 


5 
      
return
 
count
(
$tasks
)
 
+
 
1
;


6 
  
}

```

Sería necesario añadir un par de casos más para verificarlo, pero lo dejaremos así para avanzar más rápido ahora.

## Finalizando la primera historia de usuario

Si lanzamos ahora el test de aceptación, veremos que el error que aparece es que no tenemos ruta para el *endpoint* en el que marcamos una tarea como completada. Esto quiere decir que la primera de nuestras *User Stories* está terminada: ya se pueden añadir tareas en la lista.

Hemos ido desde el exterior de la aplicación hasta los detalles de implementación y cada paso estaba cubierto por tests. Lo cierto es que hemos podido completar mucho trabajo, pero aún nos queda camino por delante.

Y el primer paso debería sonarnos familiar. Tenemos que definir la ruta al  *endpoint* , el controlador, un nuevo caso de uso y la interacción con el repositorio de tareas. En **routes.yaml** añadimos la ruta:

```

 1 
api_add_task
:


 2 
  
path
:
 
/api/todo


 3 
  
controller
:
 
App\Infrastructure\EntryPoint\Api\Controller\TodoListController::addTask


 4 
  
methods
:
 
[
'POST'
]


 5 


 6 
api_mark_task_completed
:


 7 
  
path
:
 
/api/todo/{taskid}


 8 
  
controller
:
 
App\Infrastructure\EntryPoint\Api\Controller\TodoListController::markTaskCo\


 9 
mpleted


10 
  
methods
:
 
[
'PATCH'
]

```

Añadimos un método a `TodoListController`:

```

 1 
namespace
 
App\Infrastructure\EntryPoint\Api\Controller
;


 2 


 3 


 4 
use
 
App\Application\AddTaskHandler
;


 5 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 6 
use
 
Symfony\Component\HttpFoundation\Request
;


 7 
use
 
Symfony\Component\HttpFoundation\Response
;


 8 


 9 
class
 
TodoListController


10 
{


11 


12 
  
private
 
AddTaskHandler
 
$addTask
;


13 


14 
  
public
 
function
 
__construct
(
AddTaskHandler
 
$addTask
)


15 
  
{


16 
      
$this
->
addTask
 
=
 
$addTask
;


17 
  
}


18 


19 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


20 
  
{


21 
      
$payload
 
=
 
json_decode
(
$request
->
getContent
(),
 
true
);


22 


23 
      
$this
->
addTask
->
execute
(
$payload
[
'task'
]);


24 


25 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


26 
  
}


27 


28 
  
public
 
function
 
markTaskCompleted
(
int
 
$taskid
,
 
Request
 
$request
)
:
 
Response


29 
  
{


30 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s::%s'
,
 
__CLASS__
,
 
__METHOD__
));


31 
  
}


32 
}

```

Al añadir este código y ejecutar el test de aceptación el mensaje de error nos pide implementar el nuevo método. Así que nos vamos a `TodoListControllerTest` y añadimos el siguiente test:

```

 1 
namespace
 
App\Tests\Infrastructure\EntryPoint\Api\Controller
;


 2 


 3 
use
 
App\Application\AddTaskHandler
;


 4 
use
 
App\Infrastructure\EntryPoint\Api\Controller\TodoListController
;


 5 
use
 
PHPUnit\Framework\TestCase
;


 6 
use
 
Symfony\Component\HttpFoundation\Request
;


 7 
use
 
Symfony\Component\HttpFoundation\Response
;


 8 


 9 
class
 
TodoListControllerTest
 
extends
 
TestCase


10 
{


11 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


12 
  
private
 
TodoListController
 
$todoListController
;


13 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


14 


15 


16 
  
protected
 
function
 
setUp
()
:
 
void


17 
  
{


18 
      
$this
->
addTaskHandler
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


19 
      
$this
->
markTaskCompletedHandler
 
=
 
$this
->
createMock
(
MarkTaskCompletedHandler
::
cla\


20 
ss
);


21 
      
$this
->
todoListController
 
=
 
new
 
TodoListController
(


22 
          
$this
->
addTaskHandler
,


23 
          
$this
->
markTaskCompletedHandler


24 
      
);


25 
  
}


26 


27 
  
/** @test */


28 
  
public
 
function
 
shouldAddTask
()
:
 
void


29 
  
{


30 
      
$this
->
addTaskHandler


31 
          
->
expects
(
self
::
once
())


32 
          
->
method
(
'execute'
)


33 
          
->
with
(
'Task Description'
);


34 


35 
      
$request
 
=
 
new
 
Request
(


36 
          
[],


37 
          
[],


38 
          
[],


39 
          
[],


40 
          
[],


41 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


42 
          
json_encode
([
'task'
 
=>
 
'Task Description'
],
 
JSON_THROW_ON_ERROR
)


43 
      
);


44 


45 
      
$response
 
=
 
$this
->
todoListController
->
addTask
(
$request
);


46 


47 
      
self
::
assertEquals
(
Response
::
HTTP_CREATED
,
 
$response
->
getStatusCode
());


48 
  
}


49 


50 
  
/** @test */


51 
  
public
 
function
 
shouldMarkATaskCompleted
()
:
 
void


52 
  
{


53 
      
$this
->
markTaskCompletedHandler


54 
          
->
expects
(
self
::
once
())


55 
          
->
method
(
'execute'
)


56 
          
->
with
(
1
);


57 


58 
      
$request
 
=
 
new
 
Request
(


59 
          
[],


60 
          
[],


61 
          
[],


62 
          
[],


63 
          
[],


64 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


65 
          
json_encode
([
'done'
 
=>
 
true
],
 
JSON_THROW_ON_ERROR
)


66 
      
);


67 


68 
      
$taskId
 
=
 
1
;


69 
      
$response
 
=
 
$this
->
todoListController
->
markTaskCompleted
(
$taskId
,
 
$request
);


70 


71 
      
self
::
assertEquals
(
Response
::
HTTP_OK
,
 
$response
->
getStatusCode
());


72 
  
}


73 


74 


75 
}

```

Este test fallará porque no hemos definido `MarkTaskCompletedHandler`, así que iremos ejecutando el test y respondiendo a los distintos errores hasta que falle por las razones correctas y, posteriormente, implementar lo necesario para que pase.

```

 1 
namespace
 
App\Application
;


 2 


 3 


 4 
class
 
MarkTaskCompletedHandler


 5 
{


 6 
  
public
 
function
 
execute
(
int
 
$taskId
,
 
bool
 
$done
)
:
 
void


 7 
  
{


 8 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s::%s'
,
 
__CLASS__
,
 
__METHOD__
));


 9 
  
}


10 
}

```

Una vez que hemos añadido el código básico del caso de uso, podemos empezar a implementar el controlador, que quedará así:

```

 1 
namespace
 
App\Infrastructure\EntryPoint\Api\Controller
;


 2 


 3 


 4 
use
 
App\Application\AddTaskHandler
;


 5 
use
 
App\Application\MarkTaskCompletedHandler
;


 6 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 7 
use
 
Symfony\Component\HttpFoundation\Request
;


 8 
use
 
Symfony\Component\HttpFoundation\Response
;


 9 


10 
class
 
TodoListController


11 
{


12 


13 
  
private
 
AddTaskHandler
 
$addTask
;


14 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompleted
;


15 


16 
  
public
 
function
 
__construct
(


17 
      
AddTaskHandler
 
$addTask
,


18 
      
MarkTaskCompletedHandler
 
$markTaskCompleted


19 
  
)


20 
  
{


21 
      
$this
->
addTask
 
=
 
$addTask
;


22 
      
$this
->
markTaskCompleted
 
=
 
$markTaskCompleted
;


23 
  
}


24 


25 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


26 
  
{


27 
      
$payload
 
=
 
json_decode
(
$request
->
getContent
(),
 
true
);


28 


29 
      
$this
->
addTask
->
execute
(
$payload
[
'task'
]);


30 


31 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


32 
  
}


33 


34 
  
public
 
function
 
markTaskCompleted
(
int
 
$taskid
,
 
Request
 
$request
)
:
 
Response


35 
  
{


36 
      
$payload
 
=
 
json_decode
(
$request
->
getContent
(),
 
true
);


37 


38 
      
$done
 
=
 
$payload
[
'done'
];


39 


40 
      
$this
->
markTaskCompleted
->
execute
(
$taskid
,
 
$done
);


41 


42 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_OK
);


43 
  
}


44 
}

```

Y con esto hacemos pasar el test `TodoListControllerTest`. Es momento de lanzar de nuevo el test de aceptación para que nos diga qué tenemos que hacer ahora.

Y básicamente lo que nos dice es que debemos implementar `MarkTaskCompletedHandler`, que no tiene código todavía. Para eso necesitaremos un test unitario.

El caso de uso necesitará el repositorio para obtener la tarea deseada y actualizarla. Eso será lo que vamos a  *mockear* .

```

 1 
namespace
 
App\Tests\Application
;


 2 


 3 
use
 
App\Application\MarkTaskCompletedHandler
;


 4 
use
 
App\Domain\Task
;


 5 
use
 
App\Domain\TaskRepository
;


 6 
use
 
PHPUnit\Framework\TestCase
;


 7 


 8 
class
 
MarkTaskCompletedHandlerTest
 
extends
 
TestCase


 9 
{


10 
  
private
 
const
 
TASK_ID
 
=
 
1
;


11 


12 
  
/** @test */


13 
  
public
 
function
 
shouldMarkTaskAsComplete
()
:
 
void


14 
  
{


15 
      
$task
 
=
 
$this
->
createMock
(
Task
::
class
);


16 
      
$task


17 
          
->
expects
(
self
::
once
())


18 
          
->
method
(
'markCompleted'
);


19 
      

20 
      
$taskRepository
 
=
 
$this
->
createMock
(
TaskRepository
::
class
);


21 
      
$taskRepository


22 
          
->
method
(
'retrieve'
)


23 
          
->
with
(
self
::
TASK_ID
)


24 
          
->
willReturn
(
$task
);


25 
      
$taskRepository


26 
          
->
expects
(
self
::
once
())


27 
          
->
method
(
'store'
)


28 
          
->
with
(
$task
);


29 


30 
      
$markTaskAsCompleted
 
=
 
new
 
MarkTaskCompletedHandler
(
$taskRepository
);


31 


32 
      
$markTaskAsCompleted
->
execute
(
self
::
TASK_ID
,
 
true
);


33 
  
}


34 
}

```

Como detalle llamativo señalar que vamos a *mockear* una entidad. Esto es necesario para poder testar que pase algo que nos interesa: que llamamos a su método `markCompleted`. Esto nos obligará a implementarlo. Normalmente evitaría *mockear* entidades.

Al ejecutar el test, nos pide un método `retrieve`, que aún no tenemos en el repositorio.

```

 1 
namespace
 
App\Domain
;


 2 


 3 


 4 
interface
 
TaskRepository


 5 
{


 6 
  
public
 
function
 
nextId
()
:
 
int
;


 7 


 8 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void
;


 9 


10 
  
public
 
function
 
retrieve
(
int
 
$taskId
)
:
 
Task
;


11 
}

```

Así como `markCompleted` en `Task`:

```

 1 
namespace
 
App\Domain
;


 2 


 3 


 4 
class
 
Task


 5 
{


 6 


 7 
  
private
 
int
 
$id
;


 8 
  
private
 
string
 
$description
;


 9 


10 
  
public
 
function
 
__construct
(
int
 
$id
,
 
string
 
$description
)


11 
  
{


12 
      
$this
->
id
 
=
 
$id
;


13 
      
$this
->
description
 
=
 
$description
;


14 
  
}


15 


16 
  
public
 
function
 
id
()
:
 
int


17 
  
{


18 
      
return
 
$this
->
id
;


19 
  
}


20 


21 
  
public
 
function
 
markCompleted
()
:
 
void


22 
  
{


23 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s::%s'
,
 
__CLASS__
,
 
__METHOD__
));


24 
  
}


25 
}

```

Finalmente, tenemos que implementar el método `execute` del caso de uso, que quedará así:

```

 1 
namespace
 
App\Application
;


 2 


 3 


 4 
use
 
App\Domain\TaskRepository
;


 5 


 6 
class
 
MarkTaskCompletedHandler


 7 
{


 8 
  
private
 
TaskRepository
 
$taskRepository
;


 9 


10 
  
public
 
function
 
__construct
(
TaskRepository
 
$taskRepository
)


11 
  
{


12 
      
$this
->
taskRepository
 
=
 
$taskRepository
;


13 
  
}


14 


15 
  
public
 
function
 
execute
(
int
 
$taskId
,
 
bool
 
$done
)
:
 
void


16 
  
{


17 
      
$task
 
=
 
$this
->
taskRepository
->
retrieve
(
$taskId
);


18 


19 
      
$task
->
markCompleted
();


20 


21 
      
$this
->
taskRepository
->
store
(
$task
);


22 
  
}


23 
}

```

Y, de momento, estamos listas por aquí.

Ejecutaremos de nuevo el test de aceptación. A ver qué nos dice.

Lo primero que nos indica es que no tenemos método `retrieve` en el repositorio `FileTaskRepository`. Tenemos que implementarlo para poder seguir. Para ello, usaremos el mismo `FileTaskRepositoryTestCase` que ya habíamos comenzado.

```

 1 
  
/** @test */


 2 
  
public
 
function
 
shouldRetrieveTasksById
()
:
 
void


 3 
  
{


 4 
      
$storageEngine
 
=
 
$this
->
createMock
(
FileStorageEngine
::
class
);


 5 
      
$task1
 
=
 
new
 
Task
(
1
,
 
'Task 1'
);


 6 
      
$task2
 
=
 
new
 
Task
(
2
,
 
'Task 2'
);


 7 
      
$storageEngine


 8 
          
->
method
(
'loadObjects'
)


 9 
          
->
with
(
Task
::
class
)


10 
          
->
willReturn
([
1
 
=>
 
$task1
,
 
2
 
=>
 
$task2
]);


11 


12 
      
$taskRepository
 
=
 
new
 
FileTaskRepository
(
$storageEngine
);


13 
      
$task
 
=
 
$taskRepository
->
retrieve
(
2
);


14 


15 
      
self
::
assertEquals
(
$task2
,
 
$task
);


16 
  
}

```

Nos pedirá implementar `retrieve`. Nos bastaría con esto:

```

 1 
namespace
 
App\Infrastructure\Persistence
;


 2 


 3 


 4 
use
 
App\Domain\Task
;


 5 
use
 
App\Domain\TaskRepository
;


 6 
use
 
App\Lib\FileStorageEngine
;


 7 


 8 
class
 
FileTaskRepository
 
implements
 
TaskRepository


 9 
{


10 
  
private
 
FileStorageEngine
 
$storageEngine
;


11 


12 
  
public
 
function
 
__construct
(
FileStorageEngine
 
$storageEngine
)


13 
  
{


14 
      
$this
->
storageEngine
 
=
 
$storageEngine
;


15 
  
}


16 


17 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void


18 
  
{


19 
      
$tasks
 
=
 
$this
->
storageEngine
->
loadObjects
(
Task
::
class
);


20 
      
$tasks
[
$task
->
id
()]
 
=
 
$task
;


21 
      
$this
->
storageEngine
->
persistObjects
(
$tasks
);


22 
  
}


23 


24 
  
public
 
function
 
nextId
()
:
 
int


25 
  
{


26 
      
$tasks
 
=
 
$this
->
storageEngine
->
loadObjects
(
Task
::
class
);


27 


28 
      
return
 
count
(
$tasks
)
 
+
 
1
;


29 
  
}


30 


31 
  
public
 
function
 
retrieve
(
int
 
$taskId
)
:
 
Task


32 
  
{


33 
      
$tasks
 
=
 
$this
->
storageEngine
->
loadObjects
(
Task
::
class
);


34 


35 
      
return
 
$tasks
[
$taskId
];


36 
  
}


37 
}

```

Y efectivamente nos llega. Ahora que estamos en verde, podemos aprovechar para arreglar un poquito el test.

```

 1 
namespace
 
App\Tests\Infrastructure\Persistence
;


 2 


 3 
use
 
App\Domain\Task
;


 4 
use
 
App\Infrastructure\Persistence\FileTaskRepository
;


 5 
use
 
App\Lib\FileStorageEngine
;


 6 
use
 
PHPUnit\Framework\TestCase
;


 7 


 8 
class
 
FileTaskRepositoryTest
 
extends
 
TestCase


 9 
{


10 
  
private
 
FileStorageEngine
 
$storageEngine
;


11 
  
private
 
FileTaskRepository
 
$taskRepository
;


12 
  

13 
  
protected
 
function
 
setUp
()
:
 
void


14 
  
{


15 
      
$this
->
storageEngine
 
=
 
$this
->
createMock
(
FileStorageEngine
::
class
);


16 
      
$this
->
taskRepository
 
=
 
new
 
FileTaskRepository
(
$this
->
storageEngine
);


17 
  
}


18 


19 


20 
  
/** @test */


21 
  
public
 
function
 
shouldBeAbleToStoreTasks
()
:
 
void


22 
  
{


23 
      
$task
 
=
 
new
 
Task
(
1
,
 
'TaskDescription'
);


24 
      
$this
->
storageEngine


25 
          
->
method
(
'loadObjects'
)


26 
          
->
with
(
Task
::
class
)


27 
          
->
willReturn
([]);


28 
      
$this
->
storageEngine


29 
          
->
expects
(
self
::
once
())


30 
          
->
method
(
'persistObjects'
)


31 
          
->
with
([
1
 
=>
 
$task
]);


32 


33 
      
$this
->
taskRepository
->
store
(
$task
);


34 
  
}


35 


36 
  
/** @test */


37 
  
public
 
function
 
shouldProvideNextIdentity
()
:
 
void


38 
  
{


39 
      
$this
->
storageEngine


40 
          
->
method
(
'loadObjects'
)


41 
          
->
with
(
Task
::
class
)


42 
          
->
willReturn
([]);


43 
      

44 
      
$id
 
=
 
$this
->
taskRepository
->
nextId
();


45 
      
self
::
assertEquals
(
1
,
 
$id
);


46 
  
}


47 


48 
  
/** @test */


49 
  
public
 
function
 
shouldRetrieveTasksById
()
:
 
void


50 
  
{


51 
      
$task1
 
=
 
new
 
Task
(
1
,
 
'Task 1'
);


52 
      
$task2
 
=
 
new
 
Task
(
2
,
 
'Task 2'
);


53 
      
$this
->
storageEngine


54 
          
->
method
(
'loadObjects'
)


55 
          
->
with
(
Task
::
class
)


56 
          
->
willReturn
([
1
 
=>
 
$task1
,
 
2
 
=>
 
$task2
]);


57 


58 
      
$task
 
=
 
$this
->
taskRepository
->
retrieve
(
2
);


59 


60 
      
self
::
assertEquals
(
$task2
,
 
$task
);


61 
  
}


62 
}

```

Una vez hecho esto, podemos lanzar de nuevo el test de aceptación y ver dónde hemos llegado.

Al hacerlo, nos salta la excepción que habíamos dejado en `Task::markCompleted`. De momento la vamos a implementar sin hacer nada. Esperaremos a que otros tests nos obliguen ya que no tenemos realmente forma de verificarlo sin crear un método sólo para poder revisar su estado en un test.

```

 1 
namespace
 
App\Domain
;


 2 


 3 


 4 
class
 
Task


 5 
{


 6 


 7 
  
private
 
int
 
$id
;


 8 
  
private
 
string
 
$description
;


 9 


10 
  
public
 
function
 
__construct
(
int
 
$id
,
 
string
 
$description
)


11 
  
{


12 
      
$this
->
id
 
=
 
$id
;


13 
      
$this
->
description
 
=
 
$description
;


14 
  
}


15 


16 
  
public
 
function
 
id
()
:
 
int


17 
  
{


18 
      
return
 
$this
->
id
;


19 
  
}


20 


21 
  
public
 
function
 
markCompleted
()
:
 
void


22 
  
{


23 
  
}


24 
}

```

Esto hace que el test pueda llegar al siguiente punto interesante: no tenemos una ruta para recuperar la lista de tareas. En **routes.yaml** añadimos la definición:

```

 1 
api_add_task
:


 2 
  
path
:
 
/api/todo


 3 
  
controller
:
 
App\Infrastructure\EntryPoint\Api\Controller\TodoListController::addTask


 4 
  
methods
:
 
[
'POST'
]


 5 


 6 
api_mark_task_completed
:


 7 
  
path
:
 
/api/todo/{taskid}


 8 
  
controller
:
 
App\Infrastructure\EntryPoint\Api\Controller\TodoListController::markTaskCo\


 9 
mpleted


10 
  
methods
:
 
[
'PATCH'
]


11 


12 
api_get_tasks_list
:


13 
  
path
:
 
/api/todo


14 
  
controller
:
 
App\Infrastructure\EntryPoint\Api\Controller\TodoListController::getTasksLi\


15 
st


16 
  
methods
:
 
[
'GET'
]

```

Lanzamos el test de aceptación para ver que ya no pide la ruta, sino la implementación de un controlador. Y añadimos un esqueleto en `TodoListController`.

```

 1 
namespace
 
App\Infrastructure\EntryPoint\Api\Controller
;


 2 


 3 


 4 
use
 
App\Application\AddTaskHandler
;


 5 
use
 
App\Application\MarkTaskCompletedHandler
;


 6 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 7 
use
 
Symfony\Component\HttpFoundation\Request
;


 8 
use
 
Symfony\Component\HttpFoundation\Response
;


 9 


10 
class
 
TodoListController


11 
{


12 


13 
  
private
 
AddTaskHandler
 
$addTask
;


14 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompleted
;


15 


16 
  
public
 
function
 
__construct
(


17 
      
AddTaskHandler
 
$addTask
,


18 
      
MarkTaskCompletedHandler
 
$markTaskCompleted


19 
  
)


20 
  
{


21 
      
$this
->
addTask
 
=
 
$addTask
;


22 
      
$this
->
markTaskCompleted
 
=
 
$markTaskCompleted
;


23 
  
}


24 


25 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


26 
  
{


27 
      
$payload
 
=
 
json_decode
(
$request
->
getContent
(),
 
true
);


28 


29 
      
$this
->
addTask
->
execute
(
$payload
[
'task'
]);


30 


31 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


32 
  
}


33 


34 
  
public
 
function
 
markTaskCompleted
(
int
 
$taskid
,
 
Request
 
$request
)
:
 
Response


35 
  
{


36 
      
$payload
 
=
 
json_decode
(
$request
->
getContent
(),
 
true
);


37 


38 
      
$done
 
=
 
$payload
[
'done'
];


39 


40 
      
$this
->
markTaskCompleted
->
execute
(
$taskid
,
 
$done
);


41 


42 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_OK
);


43 
  
}


44 


45 
  
public
 
function
 
getTasksList
()
:
 
Response


46 
  
{


47 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s::%s'
,
 
__CLASS__
,
 
__METHOD__
));


48 
  
}


49 
}

```

Así que hay volver a `TodoListControllerTestCase` para desarrollar este método:

```

  1 
namespace
 
App\Tests\Infrastructure\EntryPoint\Api\Controller
;


  2 


  3 
use
 
App\Application\AddTaskHandler
;


  4 
use
 
App\Application\MarkTaskCompletedHandler
;


  5 
use
 
App\Domain\Task
;


  6 
use
 
App\Infrastructure\EntryPoint\Api\Controller\TodoListController
;


  7 
use
 
PHPUnit\Framework\TestCase
;


  8 
use
 
Symfony\Component\HttpFoundation\Request
;


  9 
use
 
Symfony\Component\HttpFoundation\Response
;


 10 


 11 
class
 
TodoListControllerTest
 
extends
 
TestCase


 12 
{


 13 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


 14 
  
private
 
TodoListController
 
$todoListController
;


 15 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


 16 
  
private
 
GetTasksListHandler
 
$getTasksListHandler
;


 17 
  

 18 
  
protected
 
function
 
setUp
()
:
 
void


 19 
  
{


 20 
      
$this
->
addTaskHandler
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


 21 
      
$this
->
markTaskCompletedHandler
 
=
 
$this
->
createMock
(
MarkTaskCompletedHandler
::
cla\


 22 
ss
);


 23 
      
$this
->
getTasksListHandler
 
=
 
$this
->
createMock
(
GetTasksListHandler
::
class
)


 24 


 25 
      
$this
->
todoListController
 
=
 
new
 
TodoListController
(


 26 
          
$this
->
addTaskHandler
,


 27 
          
$this
->
markTaskCompletedHandler
,


 28 
          
$this
->
getTasksListHandler


 29 
      
);


 30 
  
}


 31 


 32 
  
/** @test */


 33 
  
public
 
function
 
shouldAddTask
()
:
 
void


 34 
  
{


 35 
      
$this
->
addTaskHandler


 36 
          
->
expects
(
self
::
once
())


 37 
          
->
method
(
'execute'
)


 38 
          
->
with
(
'Task Description'
);


 39 


 40 
      
$request
 
=
 
new
 
Request
(


 41 
          
[],


 42 
          
[],


 43 
          
[],


 44 
          
[],


 45 
          
[],


 46 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


 47 
          
json_encode
([
'task'
 
=>
 
'Task Description'
],
 
JSON_THROW_ON_ERROR
)


 48 
      
);


 49 


 50 
      
$response
 
=
 
$this
->
todoListController
->
addTask
(
$request
);


 51 


 52 
      
self
::
assertEquals
(
Response
::
HTTP_CREATED
,
 
$response
->
getStatusCode
());


 53 
  
}


 54 


 55 
  
/** @test */


 56 
  
public
 
function
 
shouldMarkATaskCompleted
()
:
 
void


 57 
  
{


 58 
      
$this
->
markTaskCompletedHandler


 59 
          
->
expects
(
self
::
once
())


 60 
          
->
method
(
'execute'
)


 61 
          
->
with
(
1
);


 62 


 63 
      
$request
 
=
 
new
 
Request
(


 64 
          
[],


 65 
          
[],


 66 
          
[],


 67 
          
[],


 68 
          
[],


 69 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


 70 
          
json_encode
([
'done'
 
=>
 
true
],
 
JSON_THROW_ON_ERROR
)


 71 
      
);


 72 


 73 
      
$taskId
 
=
 
1
;


 74 
      
$response
 
=
 
$this
->
todoListController
->
markTaskCompleted
(
$taskId
,
 
$request
);


 75 


 76 
      
self
::
assertEquals
(
Response
::
HTTP_OK
,
 
$response
->
getStatusCode
());


 77 
  
}


 78 


 79 
  
/** @test */


 80 
  
public
 
function
 
shouldGetListOfTasks
()
:
 
void


 81 
  
{


 82 
      
$task1
 
=
 
new
 
Task
(
1
,
 
'Task 1'
);


 83 
      
$task1
->
markCompleted
();


 84 


 85 
      
$task2
 
=
 
new
 
Task
(
2
,
 
'Task 2'
);


 86 


 87 
      
$expectedList
 
=
 
[
'[√] Task 1'
,
 
'[ ] Task 2'
];


 88 


 89 
      
$this
->
getTasksListHandler


 90 
          
->
expects
(
self
::
once
())


 91 
          
->
method
(
'execute'
)


 92 
          
->
willReturn
([
$task1
,
 
$task2
]);


 93 
      

 94 
      
$request
 
=
 
new
 
Request
();


 95 
      

 96 
      
$response
 
=
 
$this
->
todoListController
->
getTasksList
(
$request
);


 97 
      

 98 
      
$list
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


 99 
      

100 
      
self
::
assertEquals
(
Response
::
HTTP_OK
,
 
$response
->
getStatusCode
());


101 
      
self
::
assertEquals
(
$expectedList
,
 
$list
);


102 
  
}


103 
}

```

El test fallará ya que necesitamos implementar `GetTasksListHandler`.

```

 1 
namespace
 
App\Application
;


 2 


 3 


 4 
class
 
GetTasksListHandler


 5 
{


 6 
  
public
 
function
 
execute
()
:
 
array


 7 
  
{


 8 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s::%s'
,
 
__CLASS__
,
 
__METHOD__
));


 9 
  
}


10 
}

```

Cuando podemos ejecutar todo el test, empezamos a implementar. Esta es nuestra tentativa:

```

 1 
namespace
 
App\Infrastructure\EntryPoint\Api\Controller
;


 2 


 3 


 4 
use
 
App\Application\AddTaskHandler
;


 5 
use
 
App\Application\GetTasksListHandler
;


 6 
use
 
App\Application\MarkTaskCompletedHandler
;


 7 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 8 
use
 
Symfony\Component\HttpFoundation\Request
;


 9 
use
 
Symfony\Component\HttpFoundation\Response
;


10 


11 
class
 
TodoListController


12 
{


13 


14 
  
private
 
AddTaskHandler
 
$addTask
;


15 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompleted
;


16 
  
private
 
GetTasksListHandler
 
$getTasksList
;


17 


18 
  
public
 
function
 
__construct
(


19 
      
AddTaskHandler
 
$addTask
,


20 
      
MarkTaskCompletedHandler
 
$markTaskCompleted
,


21 
      
GetTasksListHandler
 
$getTasksList


22 
  
)


23 
  
{


24 
      
$this
->
addTask
 
=
 
$addTask
;


25 
      
$this
->
markTaskCompleted
 
=
 
$markTaskCompleted
;


26 
      
$this
->
getTasksList
 
=
 
$getTasksList
;


27 
  
}


28 


29 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


30 
  
{


31 
      
$payload
 
=
 
json_decode
(
$request
->
getContent
(),
 
true
);


32 


33 
      
$this
->
addTask
->
execute
(
$payload
[
'task'
]);


34 


35 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


36 
  
}


37 


38 
  
public
 
function
 
markTaskCompleted
(
int
 
$taskid
,
 
Request
 
$request
)
:
 
Response


39 
  
{


40 
      
$payload
 
=
 
json_decode
(
$request
->
getContent
(),
 
true
);


41 


42 
      
$done
 
=
 
$payload
[
'done'
];


43 


44 
      
$this
->
markTaskCompleted
->
execute
(
$taskid
,
 
$done
);


45 


46 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_OK
);


47 
  
}


48 


49 
  
public
 
function
 
getTasksList
(
Request
 
$request
)
:
 
Response


50 
  
{


51 
      
$list
 
=
 
$this
->
getTasksList
->
execute
();


52 


53 
      
return
 
new
 
JsonResponse
(
$list
,
 
Response
::
HTTP_OK
);


54 
  
}


55 
}

```

El problema aquí es que tenemos que introducir una forma de convertir la lista tal como la devuelve el caso de uso `GetTaskListHandler` al formato requerido por el consumidor del  *endpoint* . Se trata de una representación de la tarea en forma de cadena de texto.

Hay varias formas de resolver esto, y todas requieren que `Task` pueda darnos algún tipo de representación utilizable:

* La más sencilla sería hacer la conversión en el propio controlador, recorriendo la lista de tareas y generando su representación. Para ello nos hará falta un método que se encargue.
* Otra consistiría en crear un servicio que haga la conversión. Sería una dependencia del controlador.
* Y una tercera alternativa sería usar ese mismo servicio, pero pasándolo a `GetTaskListHandler` como estrategia. De este modo el controlador decide cómo quiere obtener la lista, aunque sea `GetTaskListHandler` quien la prepara.

Esta última opción es la que vamos a usar. Pero para eso tendremos que cambiar tests. No mucho, por suerte, tan sólo `TodoListControllerTest` necesita cambios realmente.

```

  1 
namespace
 
App\Tests\Infrastructure\EntryPoint\Api\Controller
;


  2 


  3 
use
 
App\Application\AddTaskHandler
;


  4 
use
 
App\Application\GetTasksListHandler
;


  5 
use
 
App\Application\MarkTaskCompletedHandler
;


  6 
use
 
App\Application\TaskListFormatter
;


  7 
use
 
App\Domain\Task
;


  8 
use
 
App\Infrastructure\EntryPoint\Api\Controller\TodoListController
;


  9 
use
 
PHPUnit\Framework\TestCase
;


 10 
use
 
Symfony\Component\HttpFoundation\Request
;


 11 
use
 
Symfony\Component\HttpFoundation\Response
;


 12 


 13 
class
 
TodoListControllerTest
 
extends
 
TestCase


 14 
{


 15 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


 16 
  
private
 
TodoListController
 
$todoListController
;


 17 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


 18 
  
private
 
GetTasksListHandler
 
$getTasksListHandler
;


 19 
  
private
 
TaskListFormatter
 
$taskListFormatter
;


 20 


 21 
  
protected
 
function
 
setUp
()
:
 
void


 22 
  
{


 23 
      
$this
->
addTaskHandler
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


 24 
      
$this
->
markTaskCompletedHandler
 
=
 
$this
->
createMock
(
MarkTaskCompletedHandler
::
cla\


 25 
ss
);


 26 
      
$this
->
getTasksListHandler
 
=
 
$this
->
createMock
(
GetTasksListHandler
::
class
);


 27 
      
$this
->
taskListFormatter
 
=
 
$this
->
createMock
(
TaskListFormatter
::
class
);


 28 


 29 
      
$this
->
todoListController
 
=
 
new
 
TodoListController
(


 30 
          
$this
->
addTaskHandler
,


 31 
          
$this
->
markTaskCompletedHandler
,


 32 
          
$this
->
getTasksListHandler
,


 33 
          
$this
->
taskListFormatter


 34 
      
);


 35 
  
}


 36 


 37 
  
/** @test */


 38 
  
public
 
function
 
shouldAddTask
()
:
 
void


 39 
  
{


 40 
      
$this
->
addTaskHandler


 41 
          
->
expects
(
self
::
once
())


 42 
          
->
method
(
'execute'
)


 43 
          
->
with
(
'Task Description'
);


 44 


 45 
      
$request
 
=
 
new
 
Request
(


 46 
          
[],


 47 
          
[],


 48 
          
[],


 49 
          
[],


 50 
          
[],


 51 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


 52 
          
json_encode
([
'task'
 
=>
 
'Task Description'
],
 
JSON_THROW_ON_ERROR
)


 53 
      
);


 54 


 55 
      
$response
 
=
 
$this
->
todoListController
->
addTask
(
$request
);


 56 


 57 
      
self
::
assertEquals
(
Response
::
HTTP_CREATED
,
 
$response
->
getStatusCode
());


 58 
  
}


 59 


 60 
  
/** @test */


 61 
  
public
 
function
 
shouldMarkATaskCompleted
()
:
 
void


 62 
  
{


 63 
      
$this
->
markTaskCompletedHandler


 64 
          
->
expects
(
self
::
once
())


 65 
          
->
method
(
'execute'
)


 66 
          
->
with
(
1
);


 67 


 68 
      
$request
 
=
 
new
 
Request
(


 69 
          
[],


 70 
          
[],


 71 
          
[],


 72 
          
[],


 73 
          
[],


 74 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


 75 
          
json_encode
([
'done'
 
=>
 
true
],
 
JSON_THROW_ON_ERROR
)


 76 
      
);


 77 


 78 
      
$taskId
 
=
 
1
;


 79 
      
$response
 
=
 
$this
->
todoListController
->
markTaskCompleted
(
$taskId
,
 
$request
);


 80 


 81 
      
self
::
assertEquals
(
Response
::
HTTP_OK
,
 
$response
->
getStatusCode
());


 82 
  
}


 83 


 84 
  
/** @test */


 85 
  
public
 
function
 
shouldGetListOfTasks
()
:
 
void


 86 
  
{


 87 
      
$expectedList
 
=
 
[
'[√] Task 1'
,
 
'[ ] Task 2'
];


 88 


 89 
      
$this
->
getTasksListHandler


 90 
          
->
expects
(
self
::
once
())


 91 
          
->
method
(
'execute'
)


 92 
          
->
with
(
$this
->
taskListFormatter
)


 93 
          
->
willReturn
(
$expectedList
);


 94 


 95 
      
$request
 
=
 
new
 
Request
();


 96 


 97 
      
$response
 
=
 
$this
->
todoListController
->
getTasksList
(
$request
);


 98 


 99 
      
$list
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


100 


101 
      
self
::
assertEquals
(
Response
::
HTTP_OK
,
 
$response
->
getStatusCode
());


102 
      
self
::
assertEquals
(
$expectedList
,
 
$list
);


103 
  
}


104 
}

```

Y el controlador quedará así:

```

 1 
namespace
 
App\Infrastructure\EntryPoint\Api\Controller
;


 2 


 3 


 4 
use
 
App\Application\AddTaskHandler
;


 5 
use
 
App\Application\GetTasksListHandler
;


 6 
use
 
App\Application\MarkTaskCompletedHandler
;


 7 
use
 
App\Application\TaskListFormatter
;


 8 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 9 
use
 
Symfony\Component\HttpFoundation\Request
;


10 
use
 
Symfony\Component\HttpFoundation\Response
;


11 


12 
class
 
TodoListController


13 
{


14 


15 
  
private
 
AddTaskHandler
 
$addTask
;


16 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompleted
;


17 
  
private
 
GetTasksListHandler
 
$getTasksList
;


18 
  
private
 
TaskListFormatter
 
$taskListFormatter
;


19 


20 


21 
  
public
 
function
 
__construct
(


22 
      
AddTaskHandler
 
$addTask
,


23 
      
MarkTaskCompletedHandler
 
$markTaskCompleted
,


24 
      
GetTasksListHandler
 
$getTasksList
,


25 
      
TaskListFormatter
 
$taskListFormatter


26 
  
)


27 
  
{


28 
      
$this
->
addTask
 
=
 
$addTask
;


29 
      
$this
->
markTaskCompleted
 
=
 
$markTaskCompleted
;


30 
      
$this
->
getTasksList
 
=
 
$getTasksList
;


31 
      
$this
->
taskListFormatter
 
=
 
$taskListFormatter
;


32 
  
}


33 


34 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


35 
  
{


36 
      
$payload
 
=
 
json_decode
(
$request
->
getContent
(),
 
true
);


37 


38 
      
$this
->
addTask
->
execute
(
$payload
[
'task'
]);


39 


40 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


41 
  
}


42 


43 
  
public
 
function
 
markTaskCompleted
(
int
 
$taskid
,
 
Request
 
$request
)
:
 
Response


44 
  
{


45 
      
$payload
 
=
 
json_decode
(
$request
->
getContent
(),
 
true
);


46 


47 
      
$done
 
=
 
$payload
[
'done'
];


48 


49 
      
$this
->
markTaskCompleted
->
execute
(
$taskid
,
 
$done
);


50 


51 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_OK
);


52 
  
}


53 


54 
  
public
 
function
 
getTasksList
(
Request
 
$request
)
:
 
Response


55 
  
{


56 
      
$list
 
=
 
$this
->
getTasksList
->
execute
(
$this
->
taskListFormatter
);


57 


58 
      
return
 
new
 
JsonResponse
(
$list
,
 
Response
::
HTTP_OK
);


59 
  
}


60 
}

```

Y el caso de uso será este:

```

 1 
namespace
 
App\Application
;


 2 


 3 


 4 
class
 
GetTasksListHandler


 5 
{


 6 
  
public
 
function
 
execute
(
TaskListFormatter
 
$taskListFormatter
)
:
 
array


 7 
  
{


 8 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s::%s'
,
 
__CLASS__
,
 
__METHOD__
));


 9 
  
}


10 
}

```

Y, de momento, la implementación que tenemos del *formateador* sería así:

```

 1 
namespace
 
App\Application
;


 2 


 3 


 4 
class
 
TaskListFormatter


 5 
{


 6 
  
public
 
function
 
format
(
array
 
$tasks
)
:
 
array


 7 
  
{


 8 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s::%s'
,
 
__CLASS__
,
 
__METHOD__
));


 9 
  
}


10 
}

```

Hemos vuelto a verde, y en este caso, como veremos, significa que ya hemos acabado con `TodoListController`. Veamos qué dice el test de aceptación.

El test de aceptación nos pide implementar el caso de uso. Así que tenemos que crear un nuevo test unitario.

```

 1 
namespace
 
App\Tests\Application
;


 2 


 3 
use
 
App\Application\GetTasksListHandler
;


 4 
use
 
App\Application\TaskListFormatter
;


 5 
use
 
App\Domain\Task
;


 6 
use
 
App\Domain\TaskRepository
;


 7 
use
 
PHPUnit\Framework\TestCase
;


 8 


 9 
class
 
GetTasksListHandlerTest
 
extends
 
TestCase


10 
{


11 


12 
  
/** @test */


13 
  
public
 
function
 
shouldGetTheListOfTasks
()
:
 
void


14 
  
{


15 
      
$tasks
 
=
 
[


16 
          
new
 
Task
(
1
,
 
'Task 1'
),


17 
          
new
 
Task
(
2
,
 
'Task 2'
)


18 
      
];


19 


20 
      
$expectedList
 
=
 
[
'[√] Task 1'
,
 
'[ ] Task 2'
];


21 


22 
      
$tasksRepository
 
=
 
$this
->
createMock
(
TaskRepository
::
class
);


23 
      
$tasksRepository
->
method
(
'findAll'
)
->
willReturn
(
$tasks
);


24 
      

25 
      
$formatter
 
=
 
$this
->
createMock
(
TaskListFormatter
::
class
);


26 
      
$formatter


27 
          
->
expects
(
self
::
once
())


28 
          
->
method
(
'format'
)


29 
          
->
with
(
$tasks
)


30 
          
->
willReturn
(
$expectedList
);


31 


32 
      
$getTaskListHandler
 
=
 
new
 
GetTasksListHandler
(
$tasksRepository
);


33 
      
$list
 
=
 
$getTaskListHandler
->
execute
(
$formatter
);


34 


35 
      
self
::
assertEquals
(
$expectedList
,
 
$list
);


36 
  
}


37 
}

```

Ejecutar el test nos revela la necesidad de implementar un método `findAll` en el repositorio. Una vez subsanado esto, nos tocará implementar el método `execute` del caso de uso:

```

 1 
namespace
 
App\Application
;


 2 


 3 


 4 
use
 
App\Domain\TaskRepository
;


 5 
use
 
App\Application\TaskListFormatter
;


 6 


 7 
class
 
GetTasksListHandler


 8 
{


 9 
  
private
 
TaskRepository
 
$taskRepository
;


10 


11 
  
public
 
function
 
__construct
(
TaskRepository
 
$taskRepository
)


12 
  
{


13 
      
$this
->
taskRepository
 
=
 
$taskRepository
;


14 
  
}


15 


16 
  
public
 
function
 
execute
(
TaskListFormatter
 
$taskListFormatter
)
:
 
array


17 
  
{


18 
      
$tasks
 
=
 
$this
->
taskRepository
->
findAll
();


19 


20 
      
return
 
$taskListFormatter
->
format
(
$tasks
);


21 
  
}


22 
}

```

Esta sencilla implementación nos lleva a verde y podemos volver a lanzar el test de aceptación. Estamos muy cerca ya del final. Pero tenemos que añadir el método `findAll` al repositorio concreto. Primero el test:

```

 1 
namespace
 
App\Tests\Infrastructure\Persistence
;


 2 


 3 
use
 
App\Domain\Task
;


 4 
use
 
App\Infrastructure\Persistence\FileTaskRepository
;


 5 
use
 
App\Lib\FileStorageEngine
;


 6 
use
 
PHPUnit\Framework\TestCase
;


 7 


 8 
class
 
FileTaskRepositoryTest
 
extends
 
TestCase


 9 
{


10 
  
private
 
FileStorageEngine
 
$storageEngine
;


11 
  
private
 
FileTaskRepository
 
$taskRepository
;


12 


13 
  
protected
 
function
 
setUp
()
:
 
void


14 
  
{


15 
      
$this
->
storageEngine
 
=
 
$this
->
createMock
(
FileStorageEngine
::
class
);


16 
      
$this
->
taskRepository
 
=
 
new
 
FileTaskRepository
(
$this
->
storageEngine
);


17 
  
}


18 


19 


20 
  
/** @test */


21 
  
public
 
function
 
shouldBeAbleToStoreTasks
()
:
 
void


22 
  
{


23 
      
$task
 
=
 
new
 
Task
(
1
,
 
'TaskDescription'
);


24 
      
$this
->
storageEngine


25 
          
->
method
(
'loadObjects'
)


26 
          
->
with
(
Task
::
class
)


27 
          
->
willReturn
([]);


28 
      
$this
->
storageEngine


29 
          
->
expects
(
self
::
once
())


30 
          
->
method
(
'persistObjects'
)


31 
          
->
with
([
1
 
=>
 
$task
]);


32 


33 
      
$this
->
taskRepository
->
store
(
$task
);


34 
  
}


35 


36 
  
/** @test */


37 
  
public
 
function
 
shouldProvideNextIdentity
()
:
 
void


38 
  
{


39 
      
$this
->
storageEngine


40 
          
->
method
(
'loadObjects'
)


41 
          
->
with
(
Task
::
class
)


42 
          
->
willReturn
([]);


43 


44 
      
$id
 
=
 
$this
->
taskRepository
->
nextId
();


45 
      
self
::
assertEquals
(
1
,
 
$id
);


46 
  
}


47 


48 
  
/** @test */


49 
  
public
 
function
 
shouldRetrieveTasksById
()
:
 
void


50 
  
{


51 
      
$task1
 
=
 
new
 
Task
(
1
,
 
'Task 1'
);


52 
      
$task2
 
=
 
new
 
Task
(
2
,
 
'Task 2'
);


53 
      
$this
->
storageEngine


54 
          
->
method
(
'loadObjects'
)


55 
          
->
with
(
Task
::
class
)


56 
          
->
willReturn
([
1
 
=>
 
$task1
,
 
2
 
=>
 
$task2
]);


57 


58 
      
$task
 
=
 
$this
->
taskRepository
->
retrieve
(
2
);


59 


60 
      
self
::
assertEquals
(
$task2
,
 
$task
);


61 
  
}


62 


63 
  
/** @test */


64 
  
public
 
function
 
shouldRetrieveAllTasks
()
:
 
void


65 
  
{


66 
      
$expectedTasks
 
=
 
[


67 
          
1
 
=>
 
new
 
Task
(
1
,
 
'Task 1'
),


68 
          
2
 
=>
 
new
 
Task
(
2
,
 
'Task 2'
),


69 
      
];


70 


71 
      
$this
->
storageEngine


72 
          
->
method
(
'loadObjects'
)


73 
          
->
with
(
Task
::
class
)


74 
          
->
willReturn
(
$expectedTasks
);


75 


76 
      
$tasks
 
=
 
$this
->
taskRepository
->
findAll
();


77 


78 
      
self
::
assertEquals
(
$expectedTasks
,
 
$tasks
);


79 
  
}


80 
}

```

Test que se resuelve rápidamente con:

```

 1 
namespace
 
App\Infrastructure\Persistence
;


 2 


 3 


 4 
use
 
App\Domain\Task
;


 5 
use
 
App\Domain\TaskRepository
;


 6 
use
 
App\Lib\FileStorageEngine
;


 7 


 8 
class
 
FileTaskRepository
 
implements
 
TaskRepository


 9 
{


10 
  
private
 
FileStorageEngine
 
$storageEngine
;


11 


12 
  
public
 
function
 
__construct
(
FileStorageEngine
 
$storageEngine
)


13 
  
{


14 
      
$this
->
storageEngine
 
=
 
$storageEngine
;


15 
  
}


16 


17 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void


18 
  
{


19 
      
$tasks
 
=
 
$this
->
storageEngine
->
loadObjects
(
Task
::
class
);


20 
      
$tasks
[
$task
->
id
()]
 
=
 
$task
;


21 
      
$this
->
storageEngine
->
persistObjects
(
$tasks
);


22 
  
}


23 


24 
  
public
 
function
 
nextId
()
:
 
int


25 
  
{


26 
      
$tasks
 
=
 
$this
->
storageEngine
->
loadObjects
(
Task
::
class
);


27 


28 
      
return
 
count
(
$tasks
)
 
+
 
1
;


29 
  
}


30 


31 
  
public
 
function
 
retrieve
(
int
 
$taskId
)
:
 
Task


32 
  
{


33 
      
$tasks
 
=
 
$this
->
storageEngine
->
loadObjects
(
Task
::
class
);


34 


35 
      
return
 
$tasks
[
$taskId
];


36 
  
}


37 


38 
  
public
 
function
 
findAll
()
:
 
array


39 
  
{


40 
      
return
 
$this
->
storageEngine
->
loadObjects
(
Task
::
class
);


41 
  
}


42 
}

```

Y volvemos a lanzar el test de aceptación para ver por dónde seguir. En esta ocasión el test nos dice que tenemos que implementar el método `TaskListFormatter::format`. Realmente estamos a dos pasos, pero tenemos que crear un test unitario.

En este punto podríamos plantear diversos diseños que eviten tratar temas de presentación en una entidad de dominio, pero para simplificar haremos que `Task` sea capaz de proporcionar su representación en forma de texto añadiendo un método `asString`.

Cabe preguntarse si aquí sería adecuado usar un doble de `Task`, algo que ya hicimos en otro test y esperar a que el test de aceptación nos pida desarrollar `Task`, o si sería preferible usar la entidad tal cual y que el test nos fuerce a introducir los métodos necesarios.

En la práctica, llegadas a este punto creo que todo depende de la complejidad que pueda suponer. En este ejercicio, el comportamiento de `Task` es bastante trivial, por lo que podríamos avanzar con la entidad sin más complicaciones. Pero si el comportamiento es complejo, posiblemente sea mejor ir despacio, trabajar con el *mock* y dedicarle el tiempo necesario después.

Así que aquí también usaremos *mocks* para eso.

```

 1 
namespace
 
App\Tests\Application\Formatter
;


 2 


 3 
use
 
App\Domain\Task
;


 4 
use
 
App\Application\TaskListFormatter
;


 5 
use
 
PHPUnit\Framework\TestCase
;


 6 


 7 
class
 
TaskListFormatterTest
 
extends
 
TestCase


 8 
{


 9 


10 
  
/** @test */


11 
  
public
 
function
 
shouldFormatAListOfTasks
()
:
 
void


12 
  
{


13 
      
$expected
 
=
 
[


14 
          
'[√] 1. Task 1'
,


15 
          
'[ ] 2. Task 2'


16 
      
];


17 


18 
      
$task1
 
=
 
$this
->
createMock
(
Task
::
class
);


19 
      
$task1
->
method
(
'asString'
)
->
willReturn
(
'[√] 1. Task 1'
);


20 


21 
      
$task2
 
=
 
$this
->
createMock
(
Task
::
class
);


22 
      
$task2
->
method
(
'asString'
)
->
willReturn
(
'[ ] 2. Task 2'
);


23 


24 
      
$formatter
 
=
 
new
 
TaskListFormatter
();


25 
      
$formattedList
 
=
 
$formatter
->
format
([
$task1
,
 
$task2
]);


26 


27 
      
self
::
assertEquals
(
$expected
,
 
$formattedList
);


28 
  
}


29 
}

```

Lanzamos el test para ver que falla porque no tenemos el método `asString` en `Task`. Así que lo introducimos. Fíjate que todavía no hemos implementado `markCompleted`.

```

 1 
namespace
 
App\Domain
;


 2 


 3 


 4 
class
 
Task


 5 
{


 6 


 7 
  
private
 
int
 
$id
;


 8 
  
private
 
string
 
$description
;


 9 


10 
  
public
 
function
 
__construct
(
int
 
$id
,
 
string
 
$description
)


11 
  
{


12 
      
$this
->
id
 
=
 
$id
;


13 
      
$this
->
description
 
=
 
$description
;


14 
  
}


15 


16 
  
public
 
function
 
id
()
:
 
int


17 
  
{


18 
      
return
 
$this
->
id
;


19 
  
}


20 


21 
  
public
 
function
 
markCompleted
()
:
 
void


22 
  
{


23 
  
}


24 


25 
  
public
 
function
 
asString
()
:
 
string


26 
  
{


27 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s::%s'
,
 
__CLASS__
,
 
__METHOD__
));


28 
  
}


29 
}

```

Al relanzar el test ya protesta porque no está implementado el método `format`, así que vamos a ello:

```

 1 
namespace
 
App\Application\Formatter
;


 2 


 3 


 4 
class
 
TaskListFormatter


 5 
{


 6 
  
public
 
function
 
format
(
array
 
$tasks
)
:
 
array


 7 
  
{


 8 
      
$formatted
 
=
 
[];


 9 


10 
      
foreach
 
(
$tasks
 
as
 
$task
)
 
{


11 
          
$formatted
[]
 
=
 
$task
->
asString
();


12 
      
}


13 


14 
      
return
 
$formatted
;


15 
  
}


16 
}

```

Y ya estamos en verde. Turno de volver al bucle del test de aceptación.

## Últimos pasos

El test de aceptación, como cabía esperar, falla porque `Task::asString` no está implementado. También habíamos dejado `Task:markCompleted` sin implementar no haciendo nada. Podría ser buena idea dejar que se queje de nuevo y así asegurarnos de que se llama y no olvidarnos de gestionarlo también.

```

 1 
namespace
 
App\Domain
;


 2 


 3 


 4 
class
 
Task


 5 
{


 6 


 7 
  
private
 
int
 
$id
;


 8 
  
private
 
string
 
$description
;


 9 


10 
  
public
 
function
 
__construct
(
int
 
$id
,
 
string
 
$description
)


11 
  
{


12 
      
$this
->
id
 
=
 
$id
;


13 
      
$this
->
description
 
=
 
$description
;


14 
  
}


15 


16 
  
public
 
function
 
id
()
:
 
int


17 
  
{


18 
      
return
 
$this
->
id
;


19 
  
}


20 


21 
  
public
 
function
 
markCompleted
()
:
 
void


22 
  
{


23 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s::%s'
,
 
__CLASS__
,
 
__METHOD__
));


24 
  
}


25 


26 
  
public
 
function
 
asString
()
:
 
string


27 
  
{


28 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s::%s'
,
 
__CLASS__
,
 
__METHOD__
));


29 
  
}


30 
}

```

Y al volver a lanzar el test de aceptación vemos que se queja de eso exactamente y que es ahí donde queríamos estar ahora.

Tenemos que seguir con el desarrollo de `Task`, usando un test unitario. Como no queremos añadir métodos, de momento, para verificar el estado de `done`, lo haremos a través de `asString`.

```

 1 
namespace
 
App\Tests\Domain
;


 2 


 3 
use
 
App\Domain\Task
;


 4 
use
 
PHPUnit\Framework\TestCase
;


 5 


 6 
class
 
TaskTest
 
extends
 
TestCase


 7 
{


 8 


 9 
  
/** @test */


10 
  
public
 
function
 
shouldHaveTextualRepresentation
()
:
 
void


11 
  
{


12 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


13 
      

14 
      
$formatted
 
=
 
$task
->
asString
();


15 
      

16 
      
self
::
assertEquals
(
'[ ] 1. Task Description'
,
 
$formatted
);


17 
  
}


18 
}

```

Este test pasa. Por lo que hay que volver al test de aceptación.

Ahora el mensaje del test ha cambiado. Nos pide implementar `markCompleted` en `Task`, pero el test en sí ahora falla porque las respuestas no coinciden. Espera esto:

```

1 
Array (

2 
    0 => '[√] 1. Write a test that fails'

3 
    1 => '[ ] 2. Write Production code ...t pass'

4 
    2 => '[ ] 3. Refactor if there is o...tunity'

5 
)
```

y obtiene esto:

```

1 
Array (

2 
    0 => '[ ] 1. Write a test that fails'

3 
    1 => '[ ] 2. Write Production code ...t pass'

4 
    2 => '[ ] 3. Refactor if there is o...tunity'

5 
)
```

A estas alturas, el motivo es obvio. No hay nada implementado en `Task` que se ocupe de mantener el estado de done.

Añadamos un caso más al test:

```

 1 
namespace
 
App\Tests\Domain
;


 2 


 3 
use
 
App\Domain\Task
;


 4 
use
 
PHPUnit\Framework\TestCase
;


 5 


 6 
class
 
TaskTest
 
extends
 
TestCase


 7 
{


 8 


 9 
  
/** @test */


10 
  
public
 
function
 
shouldHaveTextualRepresentation
()
:
 
void


11 
  
{


12 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


13 


14 
      
$formatted
 
=
 
$task
->
asString
();


15 


16 
      
self
::
assertEquals
(
'[ ] 1. Task Description'
,
 
$formatted
);


17 
  
}


18 


19 
  
/** @test */


20 
  
public
 
function
 
shouldHaveTextualRepresentationWhenDone
()
:
 
void


21 
  
{


22 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


23 
      
$task
->
markCompleted
();


24 
      

25 
      
$formatted
 
=
 
$task
->
asString
();


26 


27 
      
self
::
assertEquals
(
'[√] 1. Task Description'
,
 
$formatted
);


28 
  
}


29 
}

```

Ahora lo implementamos:

```

 1 
namespace
 
App\Domain
;


 2 


 3 


 4 
class
 
Task


 5 
{


 6 


 7 
  
private
 
int
 
$id
;


 8 
  
private
 
string
 
$description
;


 9 
  
private
 
bool
 
$done
;


10 


11 
  
public
 
function
 
__construct
(
int
 
$id
,
 
string
 
$description
)


12 
  
{


13 
      
$this
->
id
 
=
 
$id
;


14 
      
$this
->
description
 
=
 
$description
;


15 
      
$this
->
done
 
=
 
false
;


16 
  
}


17 


18 
  
public
 
function
 
id
()
:
 
int


19 
  
{


20 
      
return
 
$this
->
id
;


21 
  
}


22 


23 
  
public
 
function
 
markCompleted
()
:
 
void


24 
  
{


25 
      
$this
->
done
 
=
 
true
;


26 
  
}


27 


28 
  
public
 
function
 
asString
()
:
 
string


29 
  
{


30 
      
$done
 
=
 
$this
->
done
 
?
 
'√'
 
:
 
' '
;


31 
      
return
 
sprintf
(
'[%s] %s. %s'
,
 
$done
,
 
$this
->
id
,
 
$this
->
description
);


32 
  
}


33 
}

```

Con el test en verde, volvemos a lanzar el test de aceptación y… ¡Si! El test pasa sin ningún problema más: hemos terminado el desarrollo de nuestra aplicación.

## Qué hemos aprendido con esta kata

* La modalidad *outside-in mockista* parece contravenir las normas de TDD. Pese a ello, todo el proceso ha sido guiado por lo que nos indican los test.
* El test de aceptación fallará mientras no se haya implementado todo lo necesario para ejecutar la aplicación.
* Nos movemos siempre entre el loop del test de aceptación y el de cada uno de los tests unitarios que tendremos que usar para desarrollar los componentes.
* Una vez que el test de aceptación pasa, la *feature* está completa, al menos en los términos que hayamos definido el test.
* En los tests unitarios usamos *mocks* para definir la interfaz pública de cada componente en función de las necesidades de sus consumidores, lo que nos ayuda a mantener el principio de segregación de interfaces.



# 22 *Outside-in* TDD clásico

Es posible seguir una metodología *outside-in* mientras mantenemos el ciclo de TDD clásico. Como ya sabrás, en esta aproximación el diseño se aplica durante la fase de refactor, por lo que, una vez que hemos desarrollado una versión tosca de la funcionalidad deseada, vamos identificando responsabilidades y extrayéndolas a diferentes objetos con los que vamos componiendo el sistema.

En las katas de estilo clásico que hemos presentado en la segunda parte del libro no hemos llegado a esta fase de extracción a colaboradores, aunque lo hemos sugerido varias veces, y sería algo perfectamente posible. De hecho, es un ejercicio recomendable.

Sin embargo, cuando hablamos de *outside-in* es frecuente que pensemos más bien en proyectos más complejos que los problemas propuestos en las katas. Es decir, el desarrollo de un producto de software real visto desde el punto de vista de sus consumidores.

Nuestro ejemplo de backend de aplicación de lista de tareas estaría en esta categoría. En el capítulo anterior hemos desarrollado el proyecto usando el enfoque  *mockista* , cuya característica principal es que partimos de un test de aceptación y vamos *entrando* en cada componente de la aplicación, que desarrollamos con la ayuda de un test unitario, *mockeando* los componentes más internos que aún no hemos desarrollado.

En TDD clásico con frecuencia se hace un diseño *up-front* para tener una idea de los componentes necesarios y luego se desarrolla cada uno de ellos, integrándose después.

Pero *outside-in* clásico es un poco diferente. Empezaríamos también con un test en el nivel de aceptación y con el fin de escribir la lógica que lo hace pasar. En las fases de refactor comenzaríamos a extraer objetos capaces de hacerse cargo de las diversas responsabilidades identificadas.

![](https://leanpub.com/site_images1/tddcourse/images----print----classic-cycle.jpeg)
El ciclo outside-in clasicista

Para este ejemplo escribiremos una nueva versión de nuestra aplicación de lista de tareas, esta vez en Ruby. El *framework* HTTP será Sinatra y el *framework* de testing RSpec.

## Planteando el problema

Nuestro punto de partida será igualmente un test de aceptación como consumidoras de la API. En cierto modo, podríamos considerar el sistema como un gran *objeto* con el que nos comunicamos mediante *request* a sus  *endpoints* .

Al tratarse de TDD clásico no usaremos  *mocks* , salvo si necesitamos definir un límite de arquitectura. Obviamente para definir este tipo de cosas necesitamos tener algún mínimo de diseño  *up-front* , así que esperamos que en algún momento tendremos casos de uso, entidades de dominio y repositorios.

El límite de arquitectura en nuestro ejemplo será el repositorio. Como todavía no vamos a definir cuál es la tecnología concreta de persistencia, en su momento lo  *mockearemos* . Después veremos cómo desarrollar una implementación.

Otros ejemplos de límites de arquitectura podría ser todo lo que tiene que ver con fechas y horas, así como la aleatoriedad, el acceso a servicios remotos, etc. En TDD clásico utilizaríamos dobles para abstraerlos.

### Poniendo en marcha el desarrollo

Mi primera propuesta de test es la siguiente:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
require
 
'rspec'


 7 


 8 
RSpec
.
describe
 
'As a user I want to'
 
do


 9 


10 
  
it
 
"add a new task to the list"
 
do


11 
  
TodoListApp
.
new


12 
  
end


13 
end

```

Este test intenta instanciar un objeto `TodoListApp`, que es la clase en la que definiremos la aplicación `Sinatra` que responderá en primera instancia. Requiere instalar `rspec`, si no lo tenemos ya. Y fallará con este error:

```

1 
     NameError:

2 
       uninitialized constant TodoListApp

3 
     # ./spec/todo_list_acceptance_spec.rb:10:in `block (2 levels) in <top (required)>'
```

Que nos indica que no tenemos la clase definida en ningún sitio. Para hacerlo pasar, introduciré la clase en el mismo archivo del test y cuando consiga ponerlo en verde, lo moveré a su ubicación.

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
require
 
'rspec'


 7 


 8 
class
 
TodoListApp


 9 


10 
end


11 


12 
RSpec
.
describe
 
'As a user I want to'
 
do


13 


14 
  
it
 
"add a new task to the list"
 
do


15 
  
TodoListApp
.
new


16 
  
end


17 
end

```

Esto es suficiente para hacer pasar el test, por lo que voy a hacer el refactor más obvio, que es mover `TodoListApp` a un lugar adecuado en el proyecto.

Recuerda que, en TDD clásico, el refactor siempre se debe hacer con todos los tests existentes en verde.

La fase de refactor es la fase en la que tomamos decisiones de diseño en el enfoque clásico. Los controladores pertenecen a la capa de infrastructura, por lo que será allí donde coloque esta clase. Con eso, el test queda así:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
require
 
'rspec'


 7 


 8 
require_relative
 
'../src/infrastructure/entry_point/todo_list_app.rb'


 9 


10 
RSpec
.
describe
 
'As a user I want to'
 
do


11 


12 
  
it
 
"add a new task to the list"
 
do


13 
  
TodoListApp
.
new


14 
  
end


15 
end

```

Y verificamos que sigue pasando.

Para el siguiente punto necesito hacer un salto un poco más grande y preparar el cliente que ejecutará las *requests* contra los  *endpoints* . Usando rack-test, puedo crear un cliente del API. Puesto que estoy en verde, voy a introducirlo e iniciarlo. Tendremos que instalar `rack-test` primero.

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
require
 
'rspec'


 7 
require
 
'rack/test'


 8 


 9 
require_relative
 
'../src/infrastructure/entry_point/todo_list_app.rb'


10 


11 
RSpec
.
describe
 
'As a user I want to'
 
do


12 


13 
  
it
 
"add a new task to the list"
 
do


14 
  
todo_application
 
=
 
TodoListApp
.
new


15 


16 
  
@client
 
=
 
Rack
::
Test
::
Session
.
new
(


17 
    
Rack
::
MockSession
.
new
(


18 
      
todo_application


19 
    
)


20 
  
)


21 
  

22 
  
end


23 
end

```

Este refactor no cambia el resultado del test, así que vamos bastante bien.

Ahora vamos a asegurarnos de que podemos hacer una llamada `POST /api/todo` y que alguien nos responde.

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
require
 
'rspec'


 7 
require
 
'rack/test'


 8 


 9 
require_relative
 
'../src/infrastructure/entry_point/todo_list_app.rb'


10 


11 
RSpec
.
describe
 
'As a user I want to'
 
do


12 


13 
  
it
 
"add a new task to the list"
 
do


14 
  
todo_application
 
=
 
TodoListApp
.
new


15 


16 
  
@client
 
=
 
Rack
::
Test
::
Session
.
new
(


17 
    
Rack
::
MockSession
.
new
(


18 
      
todo_application


19 
    
)


20 
  
)


21 


22 
  
@client
.
post
 
'/api/todo'


23 


24 
  
end


25 
end

```

Ahora el test falla, porque la aplicación no es capaz de enrutar la llamada a ningún método. Es el momento de implementar algo en `TodoListApp` hasta lograr hacer pasar el test. Esto requerirá introducir e instalar `sinatra`.

```

1 
# frozen_string_literal: true


2 


3 
require
 
'sinatra'


4 


5 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


6 


7 
end

```

Lo cierto es que basta con esto para que el test pase ya que no estamos haciendo ninguna expectativa sobre la respuesta. Necesitamos un poco más de resolución para obligarnos a implementar una acción asociada al  *endpoint* , para lo cual hacemos que el test sea más preciso y explícito:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
require
 
'rspec'


 7 
require
 
'rack/test'


 8 


 9 
require_relative
 
'../src/infrastructure/entry_point/todo_list_app.rb'


10 


11 
RSpec
.
describe
 
'As a user I want to'
 
do


12 


13 
  
it
 
"add a new task to the list"
 
do


14 
  
todo_application
 
=
 
TodoListApp
.
new


15 


16 
  
@client
 
=
 
Rack
::
Test
::
Session
.
new
(


17 
    
Rack
::
MockSession
.
new
(


18 
      
todo_application


19 
    
)


20 
  
)


21 


22 
  
@client
.
post
 
'/api/todo'


23 


24 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


25 
  
end


26 
end

```

Y este test, que ya es un  *test de verdad* , nos muestra que no se encuentra la ruta deseada:

```

1 
  1) As a user I want to add a new task to the list

2 
     Failure/Error: expect(@client.last_response.status).to eq(201)

3 


4 
       expected: 201

5 
            got: 404
```

Con lo que ya podemos implementar una acción que responda.

```

1 
# frozen_string_literal: true


2 


3 
require
 
'sinatra'


4 


5 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


6 
  
post
 
'/api/todo'
 
do


7 
  
[
201
]


8 
  
end


9 
end

```

Ahora hemos hecho pasar el test, devolviendo una respuesta fija, y ya tenemos la seguridad de que nuestra aplicación está respondiendo al  *endpoint* . Sería el momento de introducir la llamada con su  *payload* , que será la descripción de la nueva tarea.

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
  
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
  
require
 
'rspec'


 7 
  
require
 
'rack/test'


 8 


 9 
  
require_relative
 
'../src/infrastructure/entry_point/todo_list_app.rb'


10 


11 
  
RSpec
.
describe
 
'As a user I want to'
 
do


12 


13 
  
it
 
"add a new task to the list"
 
do


14 
    
todo_application
 
=
 
TodoListApp
.
new


15 


16 
    
@client
 
=
 
Rack
::
Test
::
Session
.
new
(


17 
      
Rack
::
MockSession
.
new
(


18 
        
todo_application


19 
      
)


20 
    
)


21 


22 
    
@client
.
post
 
'/api/todo'
,


23 
                 
{
task
:
 
'Write a test that fails'
}
.
to_json
,


24 
                 
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


25 


26 
    
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


27 
  
end


28 
  
end

```

El test no añade nueva información. Si queremos progresar en el desarrollo necesitaremos introducir otro test que cuestione la implementación actual, obligando a hacer un cambio en la dirección de conseguir aquello que se espera que haga el test.

Este *endpoint* sirve para crear tareas y guardarlas en la lista, lo que quiere decir que produce un efecto ( *side effect* ) en el sistema. Es un comando y no ofrece ninguna respuesta. Para testarlo tenemos que comprobar el efecto verificando que en algún lugar hay una tarea creada.

Una posibilidad es asumir que la tarea se persistirá en un `TaskRepository`, que sería un colaborador de `TodoListApp`. Los repositorios son objetos en los límites de arquitectura y se basan en una tecnología concreta. Esto presupone un cierto nivel de diseño previo, pero creo que es un compromiso aceptable dentro del enfoque clásico.

Esto implica modifica la forma en que se instancia `TodoListApp`, de modo que podamos pasarle colaboradores. Así que antes de nada, vamos a refactorizar el test de modo que la creación de nuevos ejemplos sea más fácil y el test más expresivo.

Quedaría algo así:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
  
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
  
require
 
'rspec'


 7 
  
require
 
'rack/test'


 8 


 9 
  
require_relative
 
'../src/infrastructure/entry_point/todo_list_app.rb'


10 


11 
def
 
todo_application


12 
  
TodoListApp
.
new


13 
end


14 


15 
def
 
build_client


16 
  
Rack
::
Test
::
Session
.
new
(


17 
  
Rack
::
MockSession
.
new
(


18 
    
todo_application


19 
  
)


20 
  
)


21 
end


22 


23 
RSpec
.
describe
 
'As a user I want to'
 
do


24 


25 
  
before
 
do


26 
    
@client
 
=
 
build_client


27 
  
end


28 


29 
  
it
 
"add a new task to the list"
 
do


30 
    
@client
.
post
 
'/api/todo'
,


31 
                 
{
task
:
 
'Write a test that fails'
}
.
to_json
,


32 
                 
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


33 


34 
    
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


35 
  
end


36 
  
end

```

Con este rediseño el test sigue pasando. Ahora, tenemos que introducir un doble del repositorio. Lo mínimo necesario para forzarnos a crear algo es:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
  
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
  
require
 
'rspec'


 7 
  
require
 
'rack/test'


 8 


 9 
  
require_relative
 
'../src/infrastructure/entry_point/todo_list_app.rb'


10 


11 
def
 
todo_application


12 
  
double
(
TaskRepository
)


13 


14 
  
TodoListApp
.
new


15 
end


16 


17 
def
 
build_client


18 
  
Rack
::
Test
::
Session
.
new
(


19 
  
Rack
::
MockSession
.
new
(


20 
    
todo_application


21 
  
)


22 
  
)


23 
end


24 


25 
RSpec
.
describe
 
'As a user I want to'
 
do


26 


27 
  
before
 
do


28 
    
@client
 
=
 
build_client


29 
  
end


30 


31 
  
it
 
"add a new task to the list"
 
do


32 
    
@client
.
post
 
'/api/todo'
,


33 
                 
{
task
:
 
'Write a test that fails'
}
.
to_json
,


34 
                 
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


35 


36 
    
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


37 
  
end


38 
  
end

```

Con lo que tendríamos que introducir la definición de la clase. De momento, lo haremos en el mismo archivo.

```

 1 
# ...


 2 


 3 
class
 
TaskRepository


 4 
  

 5 
end


 6 


 7 
def
 
todo_application


 8 
  
double
(
TaskRepository
)


 9 


10 
  
TodoListApp
.
new


11 
end


12 


13 
# ...

```

Y se lo pasamos a `TodoListApp` como parámetro de construcción.

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
  
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
  
require
 
'rspec'


 7 
  
require
 
'rack/test'


 8 


 9 
  
require_relative
 
'../src/infrastructure/entry_point/todo_list_app.rb'


10 


11 
class
 
TaskRepository


12 


13 
end


14 


15 
def
 
todo_application


16 
  
@task_repository
 
=
 
double
(
TaskRepository
)


17 


18 
  
TodoListApp
.
new
 
@task_repository


19 
end


20 


21 
def
 
build_client


22 
  
Rack
::
Test
::
Session
.
new
(


23 
  
Rack
::
MockSession
.
new
(


24 
    
todo_application


25 
  
)


26 
  
)


27 
end


28 


29 
RSpec
.
describe
 
'As a user I want to'
 
do


30 


31 
  
before
 
do


32 
    
@client
 
=
 
build_client


33 
  
end


34 


35 
  
it
 
"add a new task to the list"
 
do


36 
    
@client
.
post
 
'/api/todo'
,


37 
                 
{
task
:
 
'Write a test that fails'
}
.
to_json
,


38 
                 
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


39 


40 
    
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


41 
  
end


42 
  
end

```

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 


 5 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 6 
  
def
 
initialize
(
task_repository
)


 7 
  
@task_repository
 
=
 
task_repository


 8 
  
end


 9 


10 
  
post
 
'/api/todo'
 
do


11 
  
[
201
]


12 
  
end


13 
end

```

En principio estos cambios no afectan al resultado del test. Así que vamos a mover `TaskRepository` a su sitio, en la capa de dominio.

A continuación, necesitamos definir el efecto que esperamos obtener, lo cual hacemos fijando una expectativa sobre el mensaje que vamos a enviar a task repository.

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
  
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
  
require
 
'rspec'


 7 
  
require
 
'rack/test'


 8 


 9 
  
require_relative
 
'../src/infrastructure/entry_point/todo_list_app.rb'


10 
  
require_relative
 
'../src/domain/task_repository'


11 


12 
def
 
todo_application


13 
  
@task_repository
 
=
 
double
(
TaskRepository
)


14 


15 
  
TodoListApp
.
new
 
@task_repository


16 
end


17 


18 
def
 
build_client


19 
  
Rack
::
Test
::
Session
.
new
(


20 
  
Rack
::
MockSession
.
new
(


21 
    
todo_application


22 
  
)


23 
  
)


24 
end


25 


26 
RSpec
.
describe
 
'As a user I want to'
 
do


27 


28 
  
before
 
do


29 
    
@client
 
=
 
build_client


30 
  
end


31 


32 
  
it
 
"add a new task to the list"
 
do


33 


34 
    
expect
(
@task_repository
)


35 
      
.
to
 
receive
(
:store
)


36 
            
.
with
(
instance_of
(
Task
))


37 


38 
    
@client
.
post
 
'/api/todo'
,


39 
                 
{
task
:
 
'Write a test that fails'
}
.
to_json
,


40 
                 
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


41 


42 
    
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


43 
  
end


44 
  
end


45 
end

```

El test falla inicialmente porque hemos introducido `Task`, así que lo añadimos ya en su ubicación en la capa de dominio, porque lo necesitaremos enseguida. Al hacerlo, conseguimos que el test falle por el motivo adecuado:

```

1 
1) As a user I want to add a new task to the list

2 
   Failure/Error:

3 
     expect(@task_repository)

4 
       .to receive(:store)

5 
             .with(instance_of(Task))

6 


7 
     (Double TaskRepository).store(an_instance_of(Task))

8 
         expected: 1 time with arguments: (an_instance_of(Task))

9 
         received: 0 times
```

Añadiendo este código en `TodoListApp`, hacemos que pase el test.

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 


 5 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 6 
  
def
 
initialize
(
task_repository
)


 7 
  
@task_repository
 
=
 
task_repository


 8 
  
end


 9 


10 
  
post
 
'/api/todo'
 
do


11 
  
task
 
=
 
Task
.
new


12 
  
@task_repository
.
store
(
task
)


13 
  
[
201
]


14 
  
end


15 
end

```

Ahora necesitamos que un nuevo test nos pida implementar que se instancie una `Task` con los valores deseados. Esto es, queremos que `Task` se inicie con el id `1` y la descripción que le pasamos. Para que el test funcione tenemos que implementar una inicialización en `Task`, que aún no tenemos y alguna forma de comparar objetos `Task`.

En Ruby, dos objetos son iguales si tienen el mismo identificador interno de objeto, por lo que la `Task` que creemos en el test como esperada y la que se genere en el código de producción nunca serán iguales.Para verificarlo tenemos varias opciones, aunque una de las más sencillas es introducir un *matcher* en el test que nos permita hacer alguna comparación.

Por otro lado, tenemos que implementar alguna manera de inicializar `Task`. Esta creación puede ser cubierta por el propio test de aceptación. Otro modo de hacerlo sería desarrollando `Task` con un test unitario, pero la verdad es que, de momento, no lo veo necesario.

Al introducir esto en el test:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
require
 
'rspec'


 7 
require
 
'rack/test'


 8 


 9 
require_relative
 
'../src/infrastructure/entry_point/todo_list_app.rb'


10 
require_relative
 
'../src/domain/task_repository'


11 
require_relative
 
'../src/domain/task'


12 


13 
def
 
todo_application


14 
  
@task_repository
 
=
 
double
(
TaskRepository
)


15 


16 
  
TodoListApp
.
new
 
@task_repository


17 
end


18 


19 
def
 
build_client


20 
  
Rack
::
Test
::
Session
.
new
(


21 
  
Rack
::
MockSession
.
new
(


22 
    
todo_application


23 
  
)


24 
  
)


25 
end


26 


27 
RSpec
.
describe
 
'As a user I want to'
 
do


28 


29 
  
before
 
do


30 
  
@client
 
=
 
build_client


31 
  
end


32 


33 
  
it
 
"add a new task to the list"
 
do


34 


35 
  
task
 
=
 
Task
.
new
 
1
,
 
'Write a test that fails'


36 


37 
  
expect
(
@task_repository
)


38 
    
.
to
 
receive
(
:store
)


39 
          
.
with
(
instance_of
(
Task
))


40 


41 
  
@client
.
post
 
'/api/todo'
,


42 
               
{
 
task
:
 
'Write a test that fails'
 
}
.
to_json
,


43 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


44 


45 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


46 
  
end


47 
end

```

Empezará a fallar, por lo que tenemos que implementar la inicialización:

```

1 
class
 
Task


2 
  
def
 
initialize
(
id
,
 
description
)


3 


4 
  
@id
 
=
 
id


5 
  
@description
 
=
 
description


6 
  
end


7 
end

```

El test falla ahora porque en el `TodoListApp` no estamos inicializando bien `Task` ya que no le pasábamos argumentos. Con este pequeño cambio, el test ya pasa.

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 


 7 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 8 
  
def
 
initialize
(
task_repository
)


 9 
  
@task_repository
 
=
 
task_repository


10 
  
end


11 


12 
  
post
 
'/api/todo'
 
do


13 
  
task
 
=
 
Task
.
new
 
1
,
 
'Write a test that fails'


14 
  
@task_repository
.
store
(
task
)


15 
  
[
201
]


16 
  
end


17 
end

```

Se puede decir que aquí estamos usando constantes para satisfacer el test, por lo que tenemos que evolucionar el código y obtener una implementación más flexible. Empezaré con un pequeño refactor que ponga de manifiesto lo que tenemos que lograr a continuación.

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 


 7 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 8 
  
def
 
initialize
(
task_repository
)


 9 
  
@task_repository
 
=
 
task_repository


10 
  
end


11 


12 
  
post
 
'/api/todo'
 
do


13 
  
task_id
 
=
 
1


14 
  
task_description
 
=
 
'Write a test that fails'


15 
  
task
 
=
 
Task
.
new
 
task_id
,
 
task_description


16 
  
@task_repository
.
store
(
task
)


17 
  
[
201
]


18 
  
end


19 
end

```

Así de simple, tenemos que obtener valores para las variables que acabamos de introducir. Pero ahora mismo no lo estamos comprobando. Es el momento de introducir un  *matcher* .

```

1 
RSpec
::
Matchers
.
define
 
:has_same_data
 
do
 
|
expected
|


2 
  
match
 
do
 
|
actual
|


3 
  
expected
.
id
 
==
 
actual
.
id
 
&&
 
expected
.
description
 
==
 
actual
.
description


4 
  
end


5 
end

```

Para usarlo, cambiaremos el test:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
require
 
'rspec'


 7 
require
 
'rack/test'


 8 
require
 
'json'


 9 


10 
require_relative
 
'../src/infrastructure/entry_point/todo_list_app.rb'


11 
require_relative
 
'../src/domain/task_repository'


12 
require_relative
 
'../src/domain/task'


13 


14 
def
 
todo_application


15 
  
@task_repository
 
=
 
double
(
TaskRepository
)


16 


17 
  
TodoListApp
.
new
 
@task_repository


18 
end


19 


20 
def
 
build_client


21 
  
Rack
::
Test
::
Session
.
new
(


22 
  
Rack
::
MockSession
.
new
(


23 
    
todo_application


24 
  
)


25 
  
)


26 
end


27 


28 
RSpec
::
Matchers
.
define
 
:has_same_data
 
do
 
|
expected
|


29 
  
match
 
do
 
|
actual
|


30 
  
expected
.
id
 
==
 
actual
.
id
 
&&
 
expected
.
description
 
==
 
actual
.
description


31 
  
end


32 
end


33 


34 


35 
RSpec
.
describe
 
'As a user I want to'
 
do


36 


37 
  
before
 
do


38 
  
@client
 
=
 
build_client


39 
  
end


40 


41 
  
it
 
"add a new task to the list"
 
do


42 


43 
  
task
 
=
 
Task
.
new
 
1
,
 
'Write a test that fails'


44 


45 
  
expect
(
@task_repository
)


46 
    
.
to
 
receive
(
:store
)


47 
          
.
with
(
has_same_data
(
task
))


48 


49 
  
@client
.
post
 
'/api/todo'
,


50 
               
{
 
task
:
 
'Write a test that fails'
 
}
.
to_json
,


51 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


52 


53 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


54 
  
end


55 
end

```

En este momento el test no pasará porque `Task` no expone métodos para acceder a sus propiedades, por lo que añadiremos `attr_reader`:

```

1 
class
 
Task


2 
  
attr_reader
 
:description
,
 
:id


3 
  
def
 
initialize
(
id
,
 
description
)


4 


5 
  
@id
 
=
 
id


6 
  
@description
 
=
 
description


7 
  
end


8 
end

```

Y con esto el test pasa.

`task_description` viene en la *payload* de la  *request* . Puesto que ya está definida en el test ahora mismo podríamos simplemente usarla.

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 


 7 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 8 
  
def
 
initialize
(
task_repository
)


 9 
  
@task_repository
 
=
 
task_repository


10 
  
end


11 


12 
  
post
 
'/api/todo'
 
do


13 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


14 
  
task_description
 
=
 
payload
[
'task'
]


15 
  

16 
  
task_id
 
=
 
1


17 
  
task
 
=
 
Task
.
new
 
task_id
,
 
task_description


18 
  
@task_repository
.
store
(
task
)


19 
  
[
201
]


20 
  
end


21 
end

```

En cuanto al id de `task`, necesitaremos un generador de identidades. En nuestro diseño hemos puesto esta responsabilidad en `TaskRepository`, que tendría un método  *next_id* . En este caso, tendremos que especificarlo en el test mediante un stub.

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
require
 
'rspec'


 7 
require
 
'rack/test'


 8 


 9 
require_relative
 
'../src/infrastructure/entry_point/todo_list_app.rb'


10 
require_relative
 
'../src/domain/task_repository'


11 
require_relative
 
'../src/domain/task'


12 


13 
def
 
todo_application


14 
  
@task_repository
 
=
 
double
(
TaskRepository
)


15 


16 
  
TodoListApp
.
new
 
@task_repository


17 
end


18 


19 
def
 
build_client


20 
  
Rack
::
Test
::
Session
.
new
(


21 
  
Rack
::
MockSession
.
new
(


22 
    
todo_application


23 
  
)


24 
  
)


25 
end


26 


27 
RSpec
.
describe
 
'As a user I want to'
 
do


28 


29 
  
before
 
do


30 
  
@client
 
=
 
build_client


31 
  
end


32 


33 
  
it
 
"add a new task to the list"
 
do


34 


35 
  
task
 
=
 
Task
.
new
 
1
,
 
'Write a test that fails'


36 


37 
  
allow
(
@task_repository
)


38 
    
.
to
 
receive
(
:next_id
)


39 
          
.
and_return
(
1
)


40 


41 
  
expect
(
@task_repository
)


42 
    
.
to
 
receive
(
:store
)


43 
          
.
with
(
instance_of
(
Task
))


44 


45 
  
@client
.
post
 
'/api/todo'
,


46 
               
{
 
task
:
 
'Write a test that fails'
 
}
.
to_json
,


47 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


48 


49 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


50 
  
end


51 
end

```

Tal y como está el código de producción el test pasa, por lo que no nos dice qué tendríamos que hacer a continuación, así que voy a hacer una pequeña trampa y forzar un fallo del test:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 


 7 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 8 
  
def
 
initialize
(
task_repository
)


 9 
  
@task_repository
 
=
 
task_repository


10 
  
end


11 


12 
  
post
 
'/api/todo'
 
do


13 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


14 
  
task_description
 
=
 
payload
[
'task'
]


15 


16 
  
task_id
 
=
 
0


17 
  
task
 
=
 
Task
.
new
 
task_id
,
 
task_description


18 
  
@task_repository
.
store
(
task
)


19 
  
[
201
]


20 
  
end


21 
end

```

Ahora sí tiene sentido introducir la llamada a `next_id`:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 


 7 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 8 
  
def
 
initialize
(
task_repository
)


 9 
  
@task_repository
 
=
 
task_repository


10 
  
end


11 


12 
  
post
 
'/api/todo'
 
do


13 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


14 
  
task_description
 
=
 
payload
[
'task'
]


15 


16 
  
task_id
 
=
 
@task_repository
.
next_id


17 


18 
  
task
 
=
 
Task
.
new
 
task_id
,
 
task_description


19 
  
@task_repository
.
store
(
task
)


20 
  
[
201
]


21 
  
end


22 
end

```

## Extracción del caso de uso

Ahora el test ya pasa y podríamos decir que la implementación del *endpoint* está completa. Sin embargo, tenemos varios problemas:

* `TaskRepository` es un  *mock* . Sabemos que interfaz debería tener, pero no tenemos ninguna implementación concreta que pueda funcionar en producción.
* En el controlador hay un montón de lógica de negocio que no debería estar ahí.
* De hecho tenemos objetos de dominio en el controlador: `Task` y `TaskRepostory`.

En resumen, ahora mismo, el controlador está haciendo más cosas de las debidas. Además de su tarea como controlador, que es gestionar la *request* que viene del exterior, está haciendo tareas de la capa de aplicación, coordinando objetos del dominio.

Por tanto, tendríamos que extraer esta parte de la implementación a un nuevo objeto, que será el caso de uso `AddTaskHandler`.

Lo primero que hago es extraer la funcionalidad a un método privado

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 


 7 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 8 
  
def
 
initialize
(
task_repository
)


 9 
  
@task_repository
 
=
 
task_repository


10 
  
end


11 


12 
  
post
 
'/api/todo'
 
do


13 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


14 
  
task_description
 
=
 
payload
[
'task'
]


15 


16 
  
add_task
(
task_description
)


17 
  
[
201
]


18 
  
end


19 


20 
  
private


21 
  

22 
  
def
 
add_task
(
task_description
)


23 
  
task_id
 
=
 
@task_repository
.
next_id


24 
  
task
 
=
 
Task
.
new
 
task_id
,
 
task_description


25 
  
@task_repository
.
store
(
task
)


26 
  
end


27 
end

```

Crearé una clase `AddTaskHandler` en la capa de aplicación que encapsule la misma funcionalidad:

```

 1 
class
 
AddTaskHandler


 2 
  
def
 
initialize
(
task_repository
)


 3 


 4 
  
@task_repository
 
=
 
task_repository


 5 
  
end


 6 


 7 
  
def
 
execute
(
task_description
)


 8 
  
task_id
 
=
 
@task_repository
.
next_id


 9 
  
task
 
=
 
Task
.
new
 
task_id
,
 
task_description


10 
  
@task_repository
.
store
(
task
)


11 
  
end


12 
end

```

Y reemplazo la implementación del método por una llamada:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 
require_relative
 
'../../application/add_task_handler'


 7 


 8 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 9 
  
def
 
initialize
(
task_repository
)


10 
  
@task_repository
 
=
 
task_repository


11 
  
end


12 


13 
  
post
 
'/api/todo'
 
do


14 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


15 
  
task_description
 
=
 
payload
[
'task'
]


16 


17 
  
add_task
(
task_description
)


18 
  
[
201
]


19 
  
end


20 


21 
  
private


22 


23 
  
def
 
add_task
(
task_description
)


24 
  
@add_task_handler
 
=
 
AddTaskHandler
.
new
 
@task_repository


25 
  
@add_task_handler
.
execute
 
task_description


26 
  
end


27 
end

```

Hago un *inline* del método:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 
require_relative
 
'../../application/add_task_handler'


 7 


 8 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 9 
  
def
 
initialize
(
task_repository
)


10 
  
@task_repository
 
=
 
task_repository


11 
  
end


12 


13 
  
post
 
'/api/todo'
 
do


14 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


15 
  
task_description
 
=
 
payload
[
'task'
]


16 


17 
  
@add_task_handler
 
=
 
AddTaskHandler
.
new
 
@task_repository


18 
  
@add_task_handler
.
execute
 
task_description


19 
  
[
201
]


20 
  
end


21 
end

```

Y refactorizo un poco la solución, moviendo la inicialización al constructor y eliminando alguna variable temporal:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 
require_relative
 
'../../application/add_task_handler'


 7 


 8 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 9 
  
def
 
initialize
(
task_repository
)


10 
  
@task_repository
 
=
 
task_repository


11 
  
@add_task_handler
 
=
 
AddTaskHandler
.
new
 
@task_repository


12 
  
end


13 


14 
  
post
 
'/api/todo'
 
do


15 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


16 
  

17 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


18 
  

19 
  
[
201
]


20 
  
end


21 
end

```

El siguiente paso es inyectar la dependencia de `AddTaskHandler` en lugar de la del repositorio. Para ello cambio primero el test:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
ENV
[
'APP_ENV'
]
 
=
 
'test'


 5 


 6 
require
 
'rspec'


 7 
require
 
'rack/test'


 8 
require
 
'json'


 9 


10 
require_relative
 
'../src/infrastructure/entry_point/todo_list_app.rb'


11 
require_relative
 
'../src/domain/task_repository'


12 
require_relative
 
'../src/domain/task'


13 


14 
def
 
todo_application


15 
  
@task_repository
 
=
 
double
(
TaskRepository
)


16 
  
@add_task_handler
 
=
 
AddTaskHandler
.
new
 
@task_repository


17 
  
TodoListApp
.
new
 
@add_task_handler


18 
end


19 


20 
def
 
build_client


21 
  
Rack
::
Test
::
Session
.
new
(


22 
  
Rack
::
MockSession
.
new
(


23 
    
todo_application


24 
  
)


25 
  
)


26 
end


27 


28 
RSpec
::
Matchers
.
define
 
:has_same_data
 
do
 
|
expected
|


29 
  
match
 
do
 
|
actual
|


30 
  
expected
.
id
 
==
 
actual
.
id
 
&&
 
expected
.
description
 
==
 
actual
.
description


31 
  
end


32 
end


33 


34 


35 
RSpec
.
describe
 
'As a user I want to'
 
do


36 


37 
  
before
 
do


38 
  
@client
 
=
 
build_client


39 
  
end


40 


41 
  
it
 
"add a new task to the list"
 
do


42 


43 
  
task
 
=
 
Task
.
new
 
1
,
 
'Write a test that fails'


44 


45 
  
allow
(
@task_repository
)


46 
    
.
to
 
receive
(
:next_id
)


47 
          
.
and_return
(
1
)


48 


49 
  
expect
(
@task_repository
)


50 
    
.
to
 
receive
(
:store
)


51 
          
.
with
(
has_same_data
(
task
))


52 


53 
  
@client
.
post
 
'/api/todo'
,


54 
               
{
 
task
:
 
'Write a test that fails'
 
}
.
to_json
,


55 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


56 


57 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


58 
  
end


59 
end

```

Esto hará que el test falle porque el código de producción sigue esperando al repositorio como dependencia, así que lo cambiamos de este modo:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 
require_relative
 
'../../application/add_task_handler'


 7 


 8 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 9 
  
def
 
initialize
(
add_task_handler
)


10 
  
@add_task_handler
 
=
 
add_task_handler


11 
  
end


12 


13 
  
post
 
'/api/todo'
 
do


14 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


15 


16 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


17 


18 
  
[
201
]


19 
  
end


20 
end

```

Y ya tenemos esta parte resuelta.

## Implementando un repositorio

Para arrancar el desarrollo hemos empezado con un `TaskRepository` que es un  *mock* . Hemos introducido una clase vacía para poder doblarla, pero esta version *real* no puede recibir mensajes siquiera. Esto ha sido una licencia que me he permitido para no empezar a desarrollar  *desde dentro* , creando componentes de la capa de dominio como este repositorio, antes de saber cómo iban a ser usados.

El repositorio es uno de esos objetos que viven en el límite de arquitectura, por así decir, por lo que es bastante aceptable usar un doble. Sin embargo, ahora vamos a tratar de implementar una versión que pueda servirnos para testear.

En Ruby no tenemos el concepto de interfaz explícita. Esto no es un obstáculo para tener diversas implementaciones de repositorio que podamos usar en distintos entornos. Así, por ejemplo, para tests unitarios podríamos usar un repositorio en memoria, mientras que para pruebas de aceptación es posible que necesitemos una persistencia más duradera, aunque en este ejemplo sólo necesitaremos la implementación en memoria.

Esto supone un pequeño problema si consideramos que `TaskRepository` es un objeto del dominio, por lo que no queremos tener implementaciones concretas en esta capa. Una forma sencilla de hacerlo es mediante composición: en dominio tendríamos una clase `TaskRepository` que simplemente delegaría en la implementación concreta que inyectemos. Este es el enfoque que vamos a adoptar en este caso, implementando las versiones del repositorio que puedan ser necesarias a partir de un test unitario extrayendo las implementaciones a partir de una genérica.

En esta ocasión empezamos por la capacidad del repositorio de atender un mensaje `next_id`, que debería ser 1 cuando el repositorio está vacío.

```

 1 
require
 
'rspec'


 2 


 3 
describe
 
'TaskRepository'
 
do


 4 
  
it
 
'should provide empty collection of tasks'
 
do


 5 
    
task_repository
 
=
 
TaskRepository
.
new


 6 


 7 
    
result
 
=
 
task_repository
.
next_id


 8 


 9 
    
expect
(
result
)
.
to
 
eq
(
1
)


10 
  
end


11 
end

```

Este método aún no existe y el test fallará. Implementamos una versión inicial.

```

1 
class
 
TaskRepository


2 
  
def
 
next_id


3 
  
1


4 
  
end


5 
end

```

Con el test en verde, vamos a hacer un refactor. `next_id<span> </span>`debería proporcionarnos un número que es el resultado de sumar uno a la cantidad de tareas almacenada. Así que vamos a representar esto en código primero.

```

1 
class
 
TaskRepository


2 
  
def
 
initialize


3 
  
@tasks
 
=
 
{}


4 
  
end


5 
  
def
 
next_id


6 
  
@tasks
.
count
 
+
 
1


7 
  
end


8 
end

```

Lo suyo sería poder añadir elementos y ver si las cosas realmente funcionan, así que vamos a permitir que el repositorio se pueda inicializar con algún contenido.

```

 1 
class
 
TaskRepository


 2 
  
def
 
initialize
(
*
tasks
)


 3 
  
tasks
.
empty?
 
?
 
@tasks
 
=
 
{}
 
:
 
(
@tasks
 
=
 
Hash
[
tasks
.
collect
 
{
 
|
task
|
 
[
task
.
id
,
 
task
]
 
}
]
\


 4 
 
unless
 
tasks
.
empty?
)


 5 
  
end


 6 


 7 
  
def
 
next_id


 8 
  
@tasks
.
count
 
+
 
1


 9 
  
end


10 
end

```

Con esto, podemos testear que si iniciamos el repositorio con algún elemento nos devuelve el identificador correcto. Por ejemplo, así:

```

 1 
require
 
'rspec'


 2 


 3 
require_relative
 
'../../src/domain/task_repository'


 4 
require_relative
 
'../../src/domain/task'


 5 


 6 
describe
 
'TaskRepository'
 
do


 7 
  
it
 
'first identity should be 1'
 
do


 8 
    
task_repository
 
=
 
TaskRepository
.
new


 9 


10 
    
result
 
=
 
task_repository
.
next_id


11 


12 
    
expect
(
result
)
.
to
 
eq
(
1
)


13 
  
end


14 


15 
  
it
 
'should have next_id = n+1 if contains n tasks'
 
do


16 
    
task
 
=
 
Task
.
new
 
1
,
 
'Description'


17 
    

18 
    
task_repository
 
=
 
TaskRepository
.
new
 
task


19 


20 
    
expect
(
task_repository
.
next_id
)
.
to
 
eq
(
2
)


21 
  
end


22 
end

```

Esto ya debería ser suficiente para fiarnos de `next_id`. Puede que estés pensando que la generación de identidades con este algoritmo no es precisamente robusta, pero de momento nos llega para el ejemplo. En cualquier caso, podríamos implementar cualquier otra estrategia.

Ahora podríamos usar `next_id` como una manera indirecta de saber si hemos añadido tareas en el repositorio, por lo que ya podemos testear el método `store`.

```

 1 
require
 
'rspec'


 2 


 3 
require_relative
 
'../../src/domain/task_repository'


 4 
require_relative
 
'../../src/domain/task'


 5 


 6 
describe
 
'TaskRepository'
 
do


 7 
  
it
 
'first identity should be 1'
 
do


 8 
    
task_repository
 
=
 
TaskRepository
.
new


 9 


10 
    
result
 
=
 
task_repository
.
next_id


11 


12 
    
expect
(
result
)
.
to
 
eq
(
1
)


13 
  
end


14 


15 
  
it
 
'should have next_id = n+1 if contains n tasks'
 
do


16 
    
task
 
=
 
Task
.
new
 
1
,
 
'Description'


17 


18 
    
task_repository
 
=
 
TaskRepository
.
new
 
task


19 


20 
    
expect
(
task_repository
.
next_id
)
.
to
 
eq
(
2
)


21 
  
end


22 


23 


24 
  
it
 
'should add a Task'
 
do


25 
    
task_repository
 
=
 
TaskRepository
.
new


26 


27 
    
task
 
=
 
Task
.
new
 
1
,
 
'Task Description'


28 


29 
    
task_repository
.
store
 
task


30 


31 
    
expect
(
task_repository
.
next_id
)
.
to
 
eq
(
2
)


32 
  
end


33 
end

```

De momento, el test falla porque no tenemos un método que atienda el mensaje `store`, así que lo añadimos es implementamos la solución más simple:

```

 1 
class
 
TaskRepository


 2 
  
def
 
initialize
(
*
tasks
)


 3 
  
tasks
.
empty?
 
?
 
@tasks
 
=
 
{}
 
:
 
(
@tasks
 
=
 
Hash
[
tasks
.
collect
 
{
 
|
task
|
 
[
task
.
id
,
 
task
]
 
}
]
\


 4 
 
unless
 
tasks
.
empty?
)


 5 
  
end


 6 


 7 
  
def
 
next_id


 8 
  
@tasks
.
count
 
+
 
1


 9 
  
end


10 


11 
  
def
 
store
(
task
)


12 
  
@tasks
.
store
 
task
.
id
,
 
task


13 
  
end


14 
end

```

Que, por lo demás, es suficiente para hacer pasar el test. El último test se superpone al anterior test de `next_id`, así que lo vamos a quitar.

```

 1 
require
 
'rspec'


 2 


 3 
require_relative
 
'../../src/domain/task_repository'


 4 
require_relative
 
'../../src/domain/task'


 5 


 6 
describe
 
'TaskRepository'
 
do


 7 
  
it
 
'should add a Task'
 
do


 8 
    
task_repository
 
=
 
TaskRepository
.
new


 9 


10 
    
task
 
=
 
Task
.
new
 
1
,
 
'Task Description'


11 


12 
    
task_repository
.
store
 
task


13 


14 
    
expect
(
task_repository
.
next_id
)
.
to
 
eq
(
2
)


15 
  
end


16 
end

```

Y también podemos quitar la inicialización, ya que no la necesitamos realmente.

```

 1 
class
 
TaskRepository


 2 
  
def
 
initialize


 3 
  
@tasks
 
=
 
{}


 4 
  
end


 5 


 6 
  
def
 
next_id


 7 
  
@tasks
.
count
 
+
 
1


 8 
  
end


 9 


10 
  
def
 
store
(
task
)


11 
  
@tasks
.
store
 
task
.
id
,
 
task


12 
  
end


13 
end

```

Podríamos asegurarnos de que podemos introducir más tareas:

```

 1 
require
 
'rspec'


 2 


 3 
require_relative
 
'../../src/domain/task_repository'


 4 
require_relative
 
'../../src/domain/task'


 5 


 6 
describe
 
'TaskRepository'
 
do


 7 
  
it
 
'first identity should be 1'
 
do


 8 
    
task_repository
 
=
 
TaskRepository
.
new


 9 


10 
    
result
 
=
 
task_repository
.
next_id


11 


12 
    
expect
(
result
)
.
to
 
eq
(
1
)


13 
  
end


14 


15 
  
it
 
'should add a Task'
 
do


16 
    
task_repository
 
=
 
TaskRepository
.
new


17 


18 
    
task
 
=
 
Task
.
new
 
1
,
 
'Task Description'


19 


20 
    
task_repository
.
store
 
task


21 


22 
    
expect
(
task_repository
.
next_id
)
.
to
 
eq
(
2
)


23 
  
end


24 


25 
  
it
 
'should add several tasks'
 
do


26 
    
task_repository
 
=
 
TaskRepository
.
new


27 


28 
    
@task_repository
.
store
 
Task
.
new
(
1
,
 
'Task Description'
)


29 
    
@task_repository
.
store
 
Task
.
new
(
2
,
 
'Another Task'
)


30 
    
@task_repository
.
store
 
Task
.
new
(
3
,
 
'Third Task'
)


31 


32 
    
expect
(
task_repository
.
next_id
)
.
to
 
eq
(
4
)


33 
  
end


34 
end

```

Puesto que queremos separar la tecnología concreta de persistencia, usaré estos tests para extraer un repositorio en memoria. Nos queda así:

```

 1 
require_relative
 
'../infrastructure/persistence/memory_storage'


 2 


 3 
class
 
TaskRepository


 4 
  
def
 
initialize


 5 
  
@storage
 
=
 
MemoryStorage
.
new


 6 
  
end


 7 


 8 
  
def
 
next_id


 9 
  
@storage
.
next_id


10 
  
end


11 


12 
  
def
 
store
(
task
)


13 
  
@storage
.
store
 
task


14 
  
end


15 
end

```

```

 1 
class
 
MemoryStorage


 2 
  
def
 
initialize


 3 
  
@objects
 
=
 
{}


 4 
  
end


 5 


 6 
  
def
 
next_id


 7 
  
@objects
.
count
 
+
 
1


 8 
  
end


 9 


10 
  
def
 
store
(
object
)


11 
  
@objects
.
store
 
object
.
id
,
 
object


12 
  
end


13 
end

```

Ahora podemos inyectarlo, para ello modificamos primero el test:

```

 1 
require
 
'rspec'


 2 


 3 
require_relative
 
'../../src/domain/task_repository'


 4 
require_relative
 
'../../src/domain/task'


 5 


 6 
describe
 
'TaskRepository'
 
do


 7 
  
before
()
 
do


 8 
  
@task_repository
 
=
 
TaskRepository
.
new


 9 
  
end


10 


11 
  
it
 
'first identity should be 1'
 
do


12 


13 
  
result
 
=
 
@task_repository
.
next_id


14 


15 
  
expect
(
result
)
.
to
 
eq
(
1
)


16 
  
end


17 


18 
  
it
 
'should add a Task'
 
do


19 
  
task
 
=
 
Task
.
new
 
1
,
 
'Task Description'


20 


21 
  
@task_repository
.
store
 
task


22 


23 
  
expect
(
@task_repository
.
next_id
)
.
to
 
eq
(
2
)


24 
  
end


25 


26 
  
it
 
'should add several tasks'
 
do


27 


28 
  
@task_repository
.
store
 
Task
.
new
(
@task_repository
.
next_id
,
 
'Task Description'
)


29 
  
@task_repository
.
store
 
Task
.
new
(
@task_repository
.
next_id
,
 
'Another Task'
)


30 
  
@task_repository
.
store
 
Task
.
new
(
@task_repository
.
next_id
,
 
'Third Task'
)


31 


32 
  
expect
(
@task_repository
.
next_id
)
.
to
 
eq
(
4
)


33 
  
end


34 
end

```

Y ahora que sólo tenemos un lugar para inicializar el repositorio…

```

 1 
require
 
'rspec'


 2 


 3 
require_relative
 
'../../src/domain/task_repository'


 4 
require_relative
 
'../../src/domain/task'


 5 
require_relative
 
'../../src/infrastructure/persistence/memory_storage'


 6 


 7 
describe
 
'TaskRepository'
 
do


 8 
  
before
()
 
do


 9 
  
memory_storage
 
=
 
MemoryStorage
.
new


10 
  
@task_repository
 
=
 
TaskRepository
.
new
 
memory_storage


11 
  
end


12 


13 
  
# ...


14 
end

```

El test fallará, pero sólo es necesario hacer este cambio:

```

 1 
class
 
TaskRepository


 2 
  
def
 
initialize
(
storage
)


 3 
  
@storage
 
=
 
storage


 4 
  
end


 5 


 6 
  
def
 
next_id


 7 
  
@storage
.
next_id


 8 
  
end


 9 


10 
  
def
 
store
(
task
)


11 
  
@storage
.
store
 
task


12 
  
end


13 
end

```

Con el cual tenemos un `TaskRepository` que podremos configurar para usar distintas tecnologías de persistencia y que podríamos empezar a usar en nuestro test de aceptación.

Un cambio posible es este, aunque luego seguiremos evolucionándolo:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
# ...


 5 


 6 
RSpec
.
describe
 
'As a user I want to'
 
do


 7 


 8 
  
before
 
do


 9 
  
@client
 
=
 
build_client


10 
  
end


11 


12 
  
it
 
"add a new task to the list"
 
do


13 


14 
  
@client
.
post
 
'/api/todo'
,


15 
               
{
 
task
:
 
'Write a test that fails'
 
}
.
to_json
,


16 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


17 


18 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


19 
  
expect
(
@task_repository
.
next_id
)
.
to
 
eq
(
2
)


20 
  
end


21 
end

```

## Obtener la lista de las tareas

Una vez que podemos añadir tareas, sería interesante poder acceder a ellas. Nuestro siguiente test de aceptación describiría esta acción, introduciendo una o más tareas y obteniendo una lista con todas las que tengamos.

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
# ...


 5 


 6 
RSpec
.
describe
 
'As a user I want to'
 
do


 7 


 8 
  
before
 
do


 9 
  
@client
 
=
 
build_client


10 
  
end


11 


12 
  
it
 
"add a new task to the list"
 
do


13 


14 
  
@client
.
post
 
'/api/todo'
,


15 
               
{
 
task
:
 
'Write a test that fails'
 
}
.
to_json
,


16 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


17 


18 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


19 
  
expect
(
@task_repository
.
next_id
)
.
to
 
eq
(
2
)


20 
  
end


21 


22 
  
it
 
'get a list with all the tasks I\'ve introduced'
 
do


23 
  
@client
.
post
 
'/api/todo'
,


24 
               
{
 
task
:
 
'Write a test that fails'
 
}
.
to_json
,


25 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


26 


27 
  
@client
.
get
 
'/api/todo'


28 


29 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
200
)


30 
  

31 
  
expected_list
 
=
 
[


32 
    
'[ ] 1. Write a test that fails'


33 
  
]


34 
  
expect
(
@client
.
last_response
.
body
)
.
to
 
eq
(
expected_list
.
to_json
)


35 


36 
  
end


37 
end

```

Lanzamos este test y vemos que falla, ya que no hay controlador que se encargue de esta ruta.

```

 1 
  1) As a user I want to get a list with all the tasks I've introduced

 2 
     Failure/Error: expect(@client.last_response.status).to eq(200)

 3 


 4 
       expected: 200

 5 
            got: 404

 6 
````

7

8
Así que añadimos uno:

9

10

```ruby

11 
  # frozen_string_literal: true

12 


13 
  require 'sinatra'

14 
  require_relative '../../domain/task'

15 
  require_relative '../../domain/task_repository'

16 
  require_relative '../../application/add_task_handler'

17 


18 
  class TodoListApp < Sinatra::Base

19 
    def initialize(add_task_handler)

20 
      @add_task_handler = add_task_handler

21 
    end

22 


23 
    post '/api/todo' do

24 
      payload = JSON.parse request.body.read.to_s

25 


26 
      @add_task_handler.execute payload['task']

27 


28 
      [201]

29 
    end

30 


31 
    get '/api/todo' do

32 
    

33 
    end

34 


35 
  end
```

Esta vez el error es que no se devuelve nada. Podemos arreglarlo fácilmente con esta implementación constante:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 
require_relative
 
'../../application/add_task_handler'


 7 


 8 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 9 
  
def
 
initialize
(
add_task_handler
)


10 
  
@add_task_handler
 
=
 
add_task_handler


11 
  
end


12 


13 
  
post
 
'/api/todo'
 
do


14 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


15 


16 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


17 


18 
  
[
201
]


19 
  
end


20 


21 
  
get
 
'/api/todo'
 
do


22 
  
tasks
 
=
 
[


23 
    
'[ ] 1. Write a test that fails'


24 
  
]


25 
  
[
200
,
 
tasks
.
to_json
]


26 
  
end


27 


28 
end

```

Por supuesto, lo suyo sería obtener las tareas del repositorio y generar la respuesta a partir de ahí. Para ello vamos a modificar un poco el test, introduciendo una tarea más y esperando una lista más larga en consecuencia.

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
# ...


 5 


 6 
RSpec
.
describe
 
'As a user I want to'
 
do


 7 


 8 
  
before
 
do


 9 
  
@client
 
=
 
build_client


10 
  
end


11 


12 
  
it
 
"add a new task to the list"
 
do


13 


14 
  
@client
.
post
 
'/api/todo'
,


15 
               
{
 
task
:
 
'Write a test that fails'
 
}
.
to_json
,


16 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


17 


18 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


19 
  
expect
(
@task_repository
.
next_id
)
.
to
 
eq
(
2
)


20 
  
end


21 


22 
  
it
 
'get a list with all the tasks I\'ve introduced'
 
do


23 
  
@client
.
post
 
'/api/todo'
,


24 
               
{
 
task
:
 
'Write a test that fails'
 
}
.
to_json
,


25 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


26 


27 
  
@client
.
post
 
'/api/todo'
,


28 
               
{
 
task
:
 
'Write Production code that makes the test pass'
 
}
.
to_json
,


29 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


30 


31 


32 
  
@client
.
get
 
'/api/todo'


33 


34 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
200
)


35 


36 
  
expected_list
 
=
 
[


37 
    
'[ ] 1. Write a test that fails'
,


38 
    
'[ ] 2. Write Production code that makes the test pass'


39 
  
]


40 
  
expect
(
@client
.
last_response
.
body
)
.
to
 
eq
(
expected_list
.
to_json
)


41 


42 
  
end


43 
end

```

El test fallará porque no coinciden la lista generada y la esperada. Para hacerlo pasar necesitaremos volver a inyectar el repositorio, de modo que podamos recuperar las tareas guardadas.

De momento, podemos hacerlo en el test, pero antes tendríamos que anular este segundo test para volver a verde y hacer los cambios que necesitamos. Este es el test que quedaría:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
# ...


 5 


 6 
RSpec
.
describe
 
'As a user I want to'
 
do


 7 


 8 
  
before
 
do


 9 
  
@client
 
=
 
build_client


10 
  
end


11 


12 
  
it
 
"add a new task to the list"
 
do


13 


14 
  
@client
.
post
 
'/api/todo'
,


15 
               
{
 
task
:
 
'Write a test that fails'
 
}
.
to_json
,


16 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


17 


18 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


19 
  
expect
(
@task_repository
.
next_id
)
.
to
 
eq
(
2
)


20 
  
end


21 


22 
  
it
 
'get a list with all the tasks I\'ve introduced'
 
do


23 
  
@client
.
post
 
'/api/todo'
,


24 
               
{
 
task
:
 
'Write a test that fails'
 
}
.
to_json
,


25 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


26 


27 
  
# @client.post '/api/todo',


28 
  
#              { task: 'Write Production code that makes the test pass' }.to_json,


29 
  
#              { 'CONTENT_TYPE' => 'application/json' }


30 


31 


32 
  
@client
.
get
 
'/api/todo'


33 


34 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
200
)


35 


36 
  
expected_list
 
=
 
[


37 
    
'[ ] 1. Write a test that fails'
,


38 
    
# '[ ] 2. Write Production code that makes the test pass'


39 
  
]


40 
  
expect
(
@client
.
last_response
.
body
)
.
to
 
eq
(
expected_list
.
to_json
)


41 


42 
  
end


43 
end

```

El código de producción:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 
require_relative
 
'../../application/add_task_handler'


 7 


 8 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 9 
  
def
 
initialize
(
add_task_handler
,
 
task_repository
)


10 
  
@add_task_handler
 
=
 
add_task_handler


11 
  
@task_repository
 
=
 
task_repository


12 
  
end


13 


14 
  
post
 
'/api/todo'
 
do


15 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


16 


17 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


18 


19 
  
[
201
]


20 
  
end


21 


22 
  
get
 
'/api/todo'
 
do


23 
  
tasks
 
=
 
[


24 
    
'[ ] 1. Write a test that fails'


25 
  
]


26 
  
[
200
,
 
tasks
.
to_json
]


27 
  
end


28 
end

```

Ahora nos encontramos un par de problemas:

* No tenemos un método en el repositorio para obtener las tareas
* Tenemos que gestionar la transformación de `Task` en su representación

Personalmente creo que me interesa abordar antes este último. Puestos a devolver una respuesta  *hard-coded* , puedo empezar con la transformación desde el objeto `Task` y luego ya continuaré el desarrollo de `TaskRepository`.

De hecho tiene sentido esto como refactor en la situación actual, mientras el test está en verde. Así que vamos a ello:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 
require_relative
 
'../../application/add_task_handler'


 7 


 8 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 9 
  
def
 
initialize
(
add_task_handler
,
 
task_repository
)


10 
  
@add_task_handler
 
=
 
add_task_handler


11 
  
@task_repository
 
=
 
task_repository


12 
  
end


13 


14 
  
post
 
'/api/todo'
 
do


15 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


16 


17 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


18 


19 
  
[
201
]


20 
  
end


21 


22 
  
get
 
'/api/todo'
 
do


23 
  
tasks
 
=
 
{


24 
    
1
 
=>
 
Task
.
new
(
1
,
 
'Write a test that fails'
)


25 
  
}


26 
  
representation
 
=
 
tasks
.
map
 
do
 
|
key
,
 
task
|


27 
    
"[ ] 
#{
task
.
id
}
. 
#{
task
.
description
}
"


28 
  
end


29 


30 
  
[
200
,
 
representation
.
to_json
]


31 
  
end


32 


33 
end

```

Esta solución es muy sencilla en Ruby y nos permite hacer pasar el test.

Para el siguiente paso necesitaremos implementar el método `find_all` en el repositorio, por lo que tenemos que cambiar de foco y movernos a su test. De momento, empezamos con un test sencillo:

```

 1 
require
 
'rspec'


 2 


 3 
require_relative
 
'../../src/domain/task_repository'


 4 
require_relative
 
'../../src/domain/task'


 5 
require_relative
 
'../../src/infrastructure/persistence/memory_storage'


 6 


 7 
describe
 
'TaskRepository'
 
do


 8 
  
before
()
 
do


 9 
  
memory_storage
 
=
 
MemoryStorage
.
new


10 
  
@task_repository
 
=
 
TaskRepository
.
new
 
memory_storage


11 
  
end


12 


13 
  
it
 
'first identity should be 1'
 
do


14 


15 
  
result
 
=
 
@task_repository
.
next_id


16 


17 
  
expect
(
result
)
.
to
 
eq
(
1
)


18 
  
end


19 


20 
  
it
 
'should add a Task'
 
do


21 
  
task
 
=
 
Task
.
new
 
1
,
 
'Task Description'


22 


23 
  
@task_repository
.
store
 
task


24 


25 
  
expect
(
@task_repository
.
next_id
)
.
to
 
eq
(
2
)


26 
  
end


27 


28 
  
it
 
'should add several tasks'
 
do


29 


30 
    
@task_repository
.
store
 
Task
.
new
(
1
,
 
'Task Description'
)


31 
    
@task_repository
.
store
 
Task
.
new
(
2
,
 
'Another Task'
)


32 
    
@task_repository
.
store
 
Task
.
new
(
3
,
 
'Third Task'
)


33 


34 
  
expect
(
@task_repository
.
next_id
)
.
to
 
eq
(
4
)


35 
  
end


36 


37 
  
it
 
'should find all tasks stored'
 
do


38 
    
@task_repository
.
store
 
Task
.
new
(
1
,
 
'Task Description'
)


39 
    
@task_repository
.
store
 
Task
.
new
(
2
,
 
'Another Task'
)


40 
    
@task_repository
.
store
 
Task
.
new
(
3
,
 
'Third Task'
)


41 


42 
  
expect
(
@task_repository
.
find_all
.
count
)
.
to
 
eq
(
3
)


43 
  
end


44 
end

```

Para hacerlo pasar necesitamos:

```

 1 
class
 
TaskRepository


 2 
  
def
 
initialize
(
storage
)


 3 
  
@storage
 
=
 
storage


 4 
  
end


 5 


 6 
  
def
 
next_id


 7 
  
@storage
.
next_id


 8 
  
end


 9 


10 
  
def
 
store
(
task
)


11 
  
@storage
.
store
 
task


12 
  
end


13 


14 
  
def
 
find_all


15 
  
@storage
.
find_all


16 
  
end


17 
end

```

Y como no está implementado en `memory_storage`, pues se lo añadimos:

```

 1 
class
 
MemoryStorage


 2 
  
def
 
initialize


 3 
  
@objects
 
=
 
{}


 4 
  
end


 5 


 6 
  
def
 
next_id


 7 
  
@objects
.
count
 
+
 
1


 8 
  
end


 9 


10 
  
def
 
store
(
object
)


11 
  
@objects
.
store
 
object
.
id
,
 
object


12 
  
end


13 


14 
  
def
 
find_all


15 
  
@objects


16 
  
end


17 
end

```

Esto hace pasar el test, podríamos añadir aquí tests para verificar que las tareas almacenadas son las que hemos guardado. Después de toquetear un poco:

```

 1 
require
 
'rspec'


 2 


 3 
require_relative
 
'../../src/domain/task_repository'


 4 
require_relative
 
'../../src/domain/task'


 5 
require_relative
 
'../../src/infrastructure/persistence/memory_storage'


 6 


 7 
describe
 
'TaskRepository'
 
do


 8 
  
before
()
 
do


 9 
  
memory_storage
 
=
 
MemoryStorage
.
new


10 
  
@task_repository
 
=
 
TaskRepository
.
new
 
memory_storage


11 
  
end


12 


13 
  
it
 
'first identity should be 1'
 
do


14 


15 
  
result
 
=
 
@task_repository
.
next_id


16 


17 
  
expect
(
result
)
.
to
 
eq
(
1
)


18 
  
end


19 


20 
  
it
 
'should add a Task'
 
do


21 
  
task
 
=
 
Task
.
new
 
1
,
 
'Task Description'


22 


23 
  
@task_repository
.
store
 
task


24 


25 
  
expect
(
@task_repository
.
next_id
)
.
to
 
eq
(
2
)


26 
  
end


27 


28 
  
it
 
'should add several tasks'
 
do


29 


30 
  
@task_repository
.
store
 
Task
.
new
(
1
,
 
'Task Description'
)


31 
  
@task_repository
.
store
 
Task
.
new
(
2
,
 
'Another Task'
)


32 
  
@task_repository
.
store
 
Task
.
new
(
3
,
 
'Third Task'
)


33 


34 
  
expect
(
@task_repository
.
next_id
)
.
to
 
eq
(
4
)


35 
  
end


36 


37 
  
it
 
'should find all tasks stored'
 
do


38 
  
examples
 
=
 
[


39 
    
Task
.
new
(
1
,
 
'Task Description'
),


40 
    
Task
.
new
(
2
,
 
'Another Task'
),


41 
    
Task
.
new
(
3
,
 
'Third Task'
)


42 
  
].
each
 
{
 
|
task
|
 
@task_repository
.
store
 
task
 
}


43 


44 
  
tasks
 
=
 
@task_repository
.
find_all


45 


46 
  
expect
(
tasks
.
count
)
.
to
 
eq
(
3
)


47 
  
expect
(
tasks
[
1
]
)
.
to
 
eq
(
examples
[
0
]
)


48 
  
expect
(
tasks
[
2
]
)
.
to
 
eq
(
examples
[
1
]
)


49 
  
expect
(
tasks
[
3
]
)
.
to
 
eq
(
examples
[
2
]
)


50 
  
end


51 


52 
end

```

Con lo que ya tendríamos lo que necesitamos en el repositorio. Por tanto, podemos introducir su uso en el código de producción después de recuperar el test:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
# ...


 5 


 6 
RSpec
.
describe
 
'As a user I want to'
 
do


 7 


 8 
  
before
 
do


 9 
  
@client
 
=
 
build_client


10 
  
end


11 


12 
  
it
 
"add a new task to the list"
 
do


13 


14 
  
@client
.
post
 
'/api/todo'
,


15 
               
{
 
task
:
 
'Write a test that fails'
 
}
.
to_json
,


16 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


17 


18 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


19 
  
expect
(
@task_repository
.
next_id
)
.
to
 
eq
(
2
)


20 
  
end


21 


22 
  
it
 
'get a list with all the tasks I\'ve introduced'
 
do


23 
  
@client
.
post
 
'/api/todo'
,


24 
               
{
 
task
:
 
'Write a test that fails'
 
}
.
to_json
,


25 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


26 


27 
  
@client
.
post
 
'/api/todo'
,


28 
               
{
 
task
:
 
'Write Production code that makes the test pass'
 
}
.
to_json
,


29 
               
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


30 


31 


32 
  
@client
.
get
 
'/api/todo'


33 


34 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
200
)


35 


36 
  
expected_list
 
=
 
[


37 
    
'[ ] 1. Write a test that fails'
,


38 
    
'[ ] 2. Write Production code that makes the test pass'


39 
  
]


40 
  
expect
(
@client
.
last_response
.
body
)
.
to
 
eq
(
expected_list
.
to_json
)


41 


42 
  
end


43 
end

```

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 
require_relative
 
'../../application/add_task_handler'


 7 


 8 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 9 
  
def
 
initialize
(
add_task_handler
,
 
task_repository
)


10 
  
@add_task_handler
 
=
 
add_task_handler


11 
  
@task_repository
 
=
 
task_repository


12 
  
end


13 


14 
  
post
 
'/api/todo'
 
do


15 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


16 


17 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


18 


19 
  
[
201
]


20 
  
end


21 


22 
  
get
 
'/api/todo'
 
do


23 
  
tasks
 
=
 
@task_repository
.
find_all


24 


25 
  
representation
 
=
 
tasks
.
map
 
do
 
|
key
,
 
task
|


26 
    
"[ ] 
#{
task
.
id
}
. 
#{
task
.
description
}
"


27 
  
end


28 


29 
  
[
200
,
 
representation
.
to_json
]


30 
  
end


31 


32 
end

```

Del mismo modo que hicimos en la historia anterior, ahora sería el momento de extraer la lógica de negocio que contiene el controlador a un caso de uso. Hay que recordar que la condición es que sea el controlador quien decida la representación que necesita.

Seguiremos el mismo procedimiento que antes, extrayendo un método privado con la funcionalidad que vamos a mover al caso de uso. Aquí hemos dado un salto bastante grande de código, implementando la estrategia de transformación mediante un  **block** .

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 
require_relative
 
'../../application/add_task_handler'


 7 


 8 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 9 
  
def
 
initialize
(
add_task_handler
,
 
task_repository
)


10 
  
@add_task_handler
 
=
 
add_task_handler


11 
  
@task_repository
 
=
 
task_repository


12 
  
end


13 


14 
  
post
 
'/api/todo'
 
do


15 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


16 


17 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


18 


19 
  
[
201
]


20 
  
end


21 


22 
  
get
 
'/api/todo'
 
do


23 
  
tasks
 
=
 
get_tasks_list
 
do
 
|
task
|


24 
    
"[ ] 
#{
task
.
id
}
. 
#{
task
.
description
}
"


25 
  
end


26 


27 
  
[
200
,
 
tasks
.
to_json
]


28 
  
end


29 


30 
  
private


31 


32 
  
def
 
get_tasks_list


33 
  
tasks
 
=
 
@task_repository
.
find_all


34 
  
return
 
tasks
 
unless
 
block_given?


35 


36 
  
representations
 
=
 
[]


37 
  
tasks
.
each
 
do
 
|
key
,
 
task
|


38 
    
representations
 
<<
 
yield
(
task
)


39 
  
end


40 


41 
  
representations


42 
  
end


43 


44 
end

```

Es ahora cuando creamos el caso de uso:

```

1 
class
 
GetTaskListHandler


2 
  
def
 
initialize
(
task_repository
)


3 
  
@task_repository
 
=
 
task_repository


4 
  
end


5 
  

6 
  
def
 
execute


7 


8 
  
end


9 
end

```

Y lo usamos dentro del código.

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 
require_relative
 
'../../application/add_task_handler'


 7 
require_relative
 
'../../application/get_task_list_handler'


 8 


 9 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


10 
  
def
 
initialize
(
add_task_handler
,
 
task_repository
)


11 
  
@add_task_handler
 
=
 
add_task_handler


12 
  
@task_repository
 
=
 
task_repository


13 
  
@get_tasks_list_handler
 
=
 
GetTaskListHandler
.
new
 
task_repository


14 
  
end


15 


16 
  
post
 
'/api/todo'
 
do


17 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


18 


19 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


20 


21 
  
[
201
]


22 
  
end


23 


24 
  
get
 
'/api/todo'
 
do


25 
  
tasks
 
=
 
@get_tasks_list_handler
.
execute
  
do
 
|
task
|


26 
    
"[ ] 
#{
task
.
id
}
. 
#{
task
.
description
}
"


27 
  
end


28 
  
tasks
 
=
 
get_tasks_list
 
do
 
|
task
|


29 
    
"[ ] 
#{
task
.
id
}
. 
#{
task
.
description
}
"


30 
  
end


31 


32 
  
[
200
,
 
tasks
.
to_json
]


33 
  
end


34 


35 
  
private


36 


37 
  
def
 
get_tasks_list


38 
  
tasks
 
=
 
@task_repository
.
find_all


39 
  
return
 
tasks
 
unless
 
block_given?


40 


41 
  
representations
 
=
 
[]


42 
  
tasks
.
each
 
do
 
|
key
,
 
task
|


43 
    
representations
 
<<
 
yield
(
task
)


44 
  
end


45 


46 
  
representations


47 
  
end


48 
end

```

Con estos cambios el test pasa. La ejecución del caso de uso no tiene ningún efecto en el test, así que vamos a mover el código con los siguientes pasos:

Primero, copiamos el método privado `get_tasks_list` en el `execute` del caso de uso:

```

 1 
class
 
GetTaskListHandler


 2 
  
def
 
initialize
(
task_repository
)


 3 
  
@task_repository
 
=
 
task_repository


 4 
  
end


 5 


 6 
  
def
 
execute


 7 
  
tasks
 
=
 
@task_repository
.
find_all


 8 
  
return
 
tasks
 
unless
 
block_given?


 9 


10 
  
representations
 
=
 
[]


11 
  
tasks
.
each
 
do
 
|
key
,
 
task
|


12 
    
representations
 
<<
 
yield
(
task
)


13 
  
end


14 


15 
  
representations


16 
  
end


17 
end

```

Ejecutamos el test para asegurarnos de que este cambio no tiene efectos indeseados. Ahora quitamos la llamada al método privado y volvemos a probar:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 
require_relative
 
'../../application/add_task_handler'


 7 
require_relative
 
'../../application/get_task_list_handler'


 8 


 9 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


10 
  
def
 
initialize
(
add_task_handler
,
 
task_repository
)


11 
  
@add_task_handler
 
=
 
add_task_handler


12 
  
@task_repository
 
=
 
task_repository


13 
  
@get_tasks_list_handler
 
=
 
GetTaskListHandler
.
new
 
task_repository


14 
  
end


15 


16 
  
post
 
'/api/todo'
 
do


17 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


18 


19 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


20 


21 
  
[
201
]


22 
  
end


23 


24 
  
get
 
'/api/todo'
 
do


25 
  
tasks
 
=
 
@get_tasks_list_handler
.
execute
  
do
 
|
task
|


26 
    
"[ ] 
#{
task
.
id
}
. 
#{
task
.
description
}
"


27 
  
end


28 
  

29 
  
[
200
,
 
tasks
.
to_json
]


30 
  
end


31 


32 
  
private


33 


34 
  
def
 
get_tasks_list


35 
  
tasks
 
=
 
@task_repository
.
find_all


36 
  
return
 
tasks
 
unless
 
block_given?


37 


38 
  
representations
 
=
 
[]


39 
  
tasks
.
each
 
do
 
|
key
,
 
task
|


40 
    
representations
 
<<
 
yield
(
task
)


41 
  
end


42 


43 
  
representations


44 
  
end


45 
end

```

Con esto ya nos aseguramos de que es el caso de uso el que ejecuta la acción y, por tanto, está haciendo que el test siga pasando.

Sólo nos queda borrar el método privado.

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 
require_relative
 
'../../application/add_task_handler'


 7 
require_relative
 
'../../application/get_task_list_handler'


 8 


 9 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


10 
  
def
 
initialize
(
add_task_handler
,
 
task_repository
)


11 
  
@add_task_handler
 
=
 
add_task_handler


12 
  
@task_repository
 
=
 
task_repository


13 
  
@get_tasks_list_handler
 
=
 
GetTaskListHandler
.
new
 
task_repository


14 
  
end


15 


16 
  
post
 
'/api/todo'
 
do


17 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


18 


19 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


20 


21 
  
[
201
]


22 
  
end


23 


24 
  
get
 
'/api/todo'
 
do


25 
  
tasks
 
=
 
@get_tasks_list_handler
.
execute
 
do
 
|
task
|


26 
    
"[ ] 
#{
task
.
id
}
. 
#{
task
.
description
}
"


27 
  
end


28 


29 
  
[
200
,
 
tasks
.
to_json
]


30 
  
end


31 
end

```

Y ya está. La segunda historia de usuario está implementada. Nos queda todavía un poco de refactor. Vamos a inyectar el caso de uso que acabamos de crear. Por otro lado, dejaremos aún la dependencia de `TaskRepository` porque es previsible que la necesitemos de nuevo.

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../domain/task'


 5 
require_relative
 
'../../domain/task_repository'


 6 
require_relative
 
'../../application/add_task_handler'


 7 
require_relative
 
'../../application/get_task_list_handler'


 8 


 9 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


10 
  
def
 
initialize
(
add_task_handler
,
 
get_tasks_list_handler
,
 
task_repository
)


11 
  
@add_task_handler
 
=
 
add_task_handler


12 
  
@get_tasks_list_handler
 
=
 
get_tasks_list_handler


13 
  
@task_repository
 
=
 
task_repository


14 
  
end


15 


16 
  
post
 
'/api/todo'
 
do


17 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


18 


19 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


20 


21 
  
[
201
]


22 
  
end


23 


24 
  
get
 
'/api/todo'
 
do


25 
  
tasks
 
=
 
@get_tasks_list_handler
.
execute
 
do
 
|
task
|


26 
    
"[ ] 
#{
task
.
id
}
. 
#{
task
.
description
}
"


27 
  
end


28 


29 
  
[
200
,
 
tasks
.
to_json
]


30 
  
end


31 
end

```

Y aplicamos esto en el test:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
# ...


 5 


 6 
def
 
todo_application


 7 
  
@task_repository
 
=
 
TaskRepository
.
new
 
MemoryStorage
.
new


 8 
  
@add_task_handler
 
=
 
AddTaskHandler
.
new
 
@task_repository


 9 
  
@get_tasks_list_handler
 
=
 
GetTaskListHandler
.
new
 
@task_repository


10 
  
TodoListApp
.
new
 
@add_task_handler
,
 
@get_tasks_list_handler
,
 
@task_repository


11 
end


12 


13 
# ...

```

Ruby es bastante conciso, aún así, voy a hacer algún refactor en el test de aceptación extrayendo a métodos las llamadas a la API:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
# ...


 5 


 6 
def
 
api_post_task
(
description
)


 7 
  
@client
.
post
 
'/api/todo'
,


 8 
             
{
 
task
:
 
description
 
}
.
to_json
,


 9 
             
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


10 
end


11 


12 
def
 
api_get_tasks


13 
  
@client
.
get
 
'/api/todo'


14 
end


15 


16 
RSpec
.
describe
 
'As a user I want to'
 
do


17 


18 
  
before
 
do


19 
  
@client
 
=
 
build_client


20 
  
end


21 


22 
  
it
 
"add a new task to the list"
 
do


23 


24 
  
api_post_task
(
'Write a test that fails'
)


25 


26 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


27 
  
expect
(
@task_repository
.
next_id
)
.
to
 
eq
(
2
)


28 
  
end


29 


30 
  
it
 
'get a list with all the tasks I\'ve introduced'
 
do


31 
  
api_post_task
(
'Write a test that fails'
)


32 
  
api_post_task
(
'Write Production code that makes the test pass'
)


33 


34 
  
api_get_tasks


35 


36 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
200
)


37 


38 
  
expected_list
 
=
 
[


39 
    
'[ ] 1. Write a test that fails'
,


40 
    
'[ ] 2. Write Production code that makes the test pass'


41 
  
]


42 
  

43 
  
expect
(
@client
.
last_response
.
body
)
.
to
 
eq
(
expected_list
.
to_json
)


44 
  
end


45 
end

```

## Marcar una tarea completada

La última funcionalidad que vamos a implementar es marcar una tarea como completada. Nos toca seguir los pasos que hemos realizado hasta ahora:

* Añadir un ejemplo al test de aceptación
* Implementar la funcionalidad en el controlador
* Extraerla a un caso de uso

Si necesitamos desarrollar algo nuevo en algún objeto, como ha ocurrido con el `TaskRepository`, lo hacemos con el test de aceptación en verde, de modo que luego podamos usarlo sin problemas en el código.

Es la principal diferencia con  *outside-in mockista* : en TDD clásico sólo puede estar fallando un test cada vez, para que nos guíe en aquello que tenemos que implementar.

Así que vamos allá. Empecemos con el test de aceptación que, gracias a los refactors anteriores, debería ser fácil de escribir. Aquí está:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
# ...


 5 


 6 
def
 
api_post_task
(
description
)


 7 
  
@client
.
post
 
'/api/todo'
,


 8 
             
{
 
task
:
 
description
 
}
.
to_json
,


 9 
             
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


10 
end


11 


12 
def
 
api_get_tasks


13 
  
@client
.
get
 
'/api/todo'


14 
end


15 


16 
RSpec
.
describe
 
'As a user I want to'
 
do


17 


18 
  
before
 
do


19 
  
@client
 
=
 
build_client


20 
  
end


21 


22 
  
# ...


23 
  

24 
  
it
 
'mark a task completed'
 
do


25 
  
api_post_task
(
'Write a test that fails'
)


26 
  
api_post_task
(
'Write Production code that makes the test pass'
)


27 


28 
  
api_get_tasks


29 


30 
  
@client
.
patch
 
'/api/todo/1'
,


31 
                
{
 
completed
:
 
true
 
}
.
to_json
,


32 
                
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


33 


34 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
200
)


35 


36 
  
expected_list
 
=
 
[


37 
    
'[√] 1. Write a test that fails'
,


38 
    
'[ ] 2. Write Production code that makes the test pass'


39 
  
]


40 


41 
  
expect
(
@client
.
last_response
.
body
)
.
to
 
eq
(
expected_list
.
to_json
)


42 
  
end


43 
end

```

El principal punto de interés en este test es que vamos a comprobar que ha funcionado recuperando la lista y viendo si ya se representa la tarea como marcada. En muchos aspectos, podríamos considerar que este test sería suficiente para validar toda la funcionalidad de la lista ya que para que para llegar al resultado final todas las demás acciones, que hemos desarrollado con otros tests, funcionan.

Así que vamos a empezar a añadir código de producción hasta lograr que el test pase. Por supuesto, el primer problema es que no hay una ruta ni un controlador asociado.

Con este primer paso conseguimos resolver este problema y el fallo del test ya tiene que ver con el contenido de la respuesta.

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 


 5 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 6 
  
def
 
initialize
(
add_task_handler
,
 
get_tasks_list_handler
,
 
task_repository
)


 7 
  
@add_task_handler
 
=
 
add_task_handler


 8 
  
@get_tasks_list_handler
 
=
 
get_tasks_list_handler


 9 
  
@task_repository
 
=
 
task_repository


10 
  
end


11 


12 
  
#...


13 


14 
  
patch
 
'/api/todo/:task_id'
 
do
 
|
 
task_id
 
|


15 
  
[
200
]


16 
  
end


17 
end

```

Este es el error:

```

1 
  1) As a user I want to mark a task completed

2 
     Failure/Error: expect(@client.last_response.body).to eq(expected_list.to_json)

3 


4 
       expected: "[\"[√] 1. Write a test that fails\",\"[ ] 2. Write Production code that\

5 
 makes the test pass\"]"

6 
            got: "[\"[ ] 1. Write a test that fails\",\"[ ] 2. Write Production code that\

7 
 makes the test pass\"]"
```

Y este error ya es que la tarea completada aparece sin marcar, que es exactamente donde queremos estar.

Una forma de solucionarlo es con este código:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../../src/domain/task'


 5 


 6 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 7 
  
def
 
initialize
(
add_task_handler
,
 
get_tasks_list_handler
,
 
task_repository
)


 8 
  
@add_task_handler
 
=
 
add_task_handler


 9 
  
@get_tasks_list_handler
 
=
 
get_tasks_list_handler


10 
  
@task_repository
 
=
 
task_repository


11 
  
end


12 


13 
  
post
 
'/api/todo'
 
do


14 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


15 


16 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


17 


18 
  
[
201
]


19 
  
end


20 


21 
  
get
 
'/api/todo'
 
do


22 
  
tasks
 
=
 
@get_tasks_list_handler
.
execute
 
do
 
|
task
|


23 
    
"[
#{
task
.
id
 
==
 
1
 
?
 
'√'
 
:
 
' '
}
] 
#{
task
.
id
}
. 
#{
task
.
description
}
"


24 
  
end


25 


26 
  
[
200
,
 
tasks
.
to_json
]


27 
  
end


28 


29 
  
patch
 
'/api/todo/:task_id'
 
do
 
|
 
task_id
 
|


30 
  
[
200
]


31 
  
end


32 
end

```

Y este código hace pasar nuestro test actual. Sin embargo, hace fallar el test anterior de obtener todas las tareas ya que en ese test se asume que no hay ninguna completada.

Por supuesto, lo que necesitamos es que una tarea pueda decir que está completada. Necesitamos añadir algún comportamiento en `Task`, pero también que los tests de aceptación anteriores pasen. Por tanto, vamos a quitar este test temporalmente, revertir este último cambio y trabajar en añadir en `Task` la capacidad de ser marcada como completa.

De momento, me basta con anular la última aserción, que es la que controla el cambio de comportamiento en `Task`:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
# ...


 5 


 6 
def
 
api_post_task
(
description
)


 7 
  
@client
.
post
 
'/api/todo'
,


 8 
             
{
 
task
:
 
description
 
}
.
to_json
,


 9 
             
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


10 
end


11 


12 
def
 
api_get_tasks


13 
  
@client
.
get
 
'/api/todo'


14 
end


15 


16 
RSpec
.
describe
 
'As a user I want to'
 
do


17 


18 
  
before
 
do


19 
  
@client
 
=
 
build_client


20 
  
end


21 


22 
  
#...


23 


24 
  
it
 
'mark a task completed'
 
do


25 
  
api_post_task
(
'Write a test that fails'
)


26 
  
api_post_task
(
'Write Production code that makes the test pass'
)


27 


28 
  
@client
.
patch
 
'/api/todo/1'
,


29 
                
{
 
completed
:
 
true
 
}
.
to_json
,


30 
                
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


31 


32 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
200
)


33 


34 
  
api_get_tasks


35 


36 
  
expected_list
 
=
 
[


37 
    
'[√] 1. Write a test that fails'
,


38 
    
'[ ] 2. Write Production code that makes the test pass'


39 
  
]


40 


41 
  
# expect(@client.last_response.body).to eq(expected_list.to_json)


42 
  
end


43 
end

```

Y también tengo que neutralizar el cambio en el código de producción, temporalmente:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../../src/domain/task'


 5 


 6 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 7 
  
def
 
initialize
(
add_task_handler
,
 
get_tasks_list_handler
,
 
task_repository
)


 8 
  
@add_task_handler
 
=
 
add_task_handler


 9 
  
@get_tasks_list_handler
 
=
 
get_tasks_list_handler


10 
  
@task_repository
 
=
 
task_repository


11 
  
end


12 


13 
  
post
 
'/api/todo'
 
do


14 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


15 


16 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


17 


18 
  
[
201
]


19 
  
end


20 


21 
  
get
 
'/api/todo'
 
do


22 
  
tasks
 
=
 
@get_tasks_list_handler
.
execute
 
do
 
|
task
|


23 
    
"[ ] 
#{
task
.
id
}
. 
#{
task
.
description
}
"


24 
  
end


25 


26 
  
[
200
,
 
tasks
.
to_json
]


27 
  
end


28 


29 
  
patch
 
'/api/todo/:task_id'
 
do
 
|
 
task_id
 
|


30 
  
[
200
]


31 
  
end


32 
end

```

Vamos a ver entonces cómo marcar tareas completadas:

```

 1 
require
 
'rspec'


 2 


 3 
require_relative
 
'../../src/domain/task'


 4 


 5 
describe
 
'Task'
 
do


 6 


 7 
  
it
 
'should be incomplete on creation'
 
do


 8 
  
task
 
=
 
Task
.
new
 
1
,
 
'Task Description'


 9 
  
expect
(
task
.
completed
)
.
to
 
be_falsey


10 
  
end


11 
end

```

Esto nos basta para introducir la propiedad, iniciarla como `false`, y exponer un método para acceder a ella.

```

1 
class
 
Task


2 
  
attr_reader
 
:description
,
 
:id
,
 
:completed


3 
  
def
 
initialize
(
id
,
 
description
)


4 


5 
  
@id
 
=
 
id


6 
  
@description
 
=
 
description


7 
  
@completed
 
=
 
false


8 
  
end


9 
end

```

Por otra parte, necesitamos poder marcar la tarea como completada:

```

 1 
require
 
'rspec'


 2 


 3 
require_relative
 
'../../src/domain/task'


 4 


 5 
describe
 
'Task'
 
do


 6 


 7 
  
it
 
'should be incomplete on creation'
 
do


 8 
  
task
 
=
 
Task
.
new
 
1
,
 
'Task Description'


 9 
  
expect
(
task
.
completed
)
.
to
 
be_falsey


10 
  
end


11 


12 
  
it
 
'should be able to be completed'
 
do


13 
  
task
 
=
 
Task
.
new
 
1
,
 
'Task Description'


14 
  
task
.
mark_completed


15 
  
expect
(
task
.
completed
)
.
to
 
be_truthy


16 
  
end


17 
end

```

Lo cual es bastante sencillo de lograr:

```

 1 
class
 
Task


 2 
  
attr_reader
 
:description
,
 
:id
,
 
:completed


 3 
  
def
 
initialize
(
id
,
 
description
)


 4 


 5 
  
@id
 
=
 
id


 6 
  
@description
 
=
 
description


 7 
  
@completed
 
=
 
false


 8 
  
end


 9 


10 
  
def
 
mark_completed


11 
  
@completed
 
=
 
true


12 
  
end


13 
end

```

Por esta parte ya tenemos lo que necesitamos.

Ahora, vamos a hacer un refactor para usar algunas de estas capacidades. Con este refactor mantenemos el comportamiento actual y estamos preparados para atender al cambio importante:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../../src/domain/task'


 5 


 6 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 7 
  
def
 
initialize
(
add_task_handler
,
 
get_tasks_list_handler
,
 
task_repository
)


 8 
  
@add_task_handler
 
=
 
add_task_handler


 9 
  
@get_tasks_list_handler
 
=
 
get_tasks_list_handler


10 
  
@task_repository
 
=
 
task_repository


11 
  
end


12 


13 
  
# ...


14 
  

15 
  
get
 
'/api/todo'
 
do


16 
  
tasks
 
=
 
@get_tasks_list_handler
.
execute
 
do
 
|
task
|


17 
    
"[
#{
task
.
completed
 
?
 
'√'
 
:
 
' '
}
] 
#{
task
.
id
}
. 
#{
task
.
description
}
"


18 
  
end


19 


20 
  
[
200
,
 
tasks
.
to_json
]


21 
  
end


22 


23 
  
# ...


24 
end

```

Así que recuperamos el test:

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
# ...


 5 


 6 
def
 
api_post_task
(
description
)


 7 
  
@client
.
post
 
'/api/todo'
,


 8 
             
{
 
task
:
 
description
 
}
.
to_json
,


 9 
             
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


10 
end


11 


12 
def
 
api_get_tasks


13 
  
@client
.
get
 
'/api/todo'


14 
end


15 


16 
RSpec
.
describe
 
'As a user I want to'
 
do


17 


18 
  
before
 
do


19 
  
@client
 
=
 
build_client


20 
  
end


21 


22 
  
it
 
"add a new task to the list"
 
do


23 


24 
  
api_post_task
(
'Write a test that fails'
)


25 


26 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
201
)


27 
  
expect
(
@task_repository
.
next_id
)
.
to
 
eq
(
2
)


28 
  
end


29 


30 
  
it
 
'get a list with all the tasks I\'ve introduced'
 
do


31 
  
api_post_task
(
'Write a test that fails'
)


32 
  
api_post_task
(
'Write Production code that makes the test pass'
)


33 


34 
  
api_get_tasks


35 


36 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
200
)


37 


38 
  
expected_list
 
=
 
[


39 
    
'[ ] 1. Write a test that fails'
,


40 
    
'[ ] 2. Write Production code that makes the test pass'


41 
  
]


42 


43 
  
expect
(
@client
.
last_response
.
body
)
.
to
 
eq
(
expected_list
.
to_json
)


44 
  
end


45 


46 
  
it
 
'mark a task completed'
 
do


47 
  
api_post_task
(
'Write a test that fails'
)


48 
  
api_post_task
(
'Write Production code that makes the test pass'
)


49 


50 
  
@client
.
patch
 
'/api/todo/1'
,


51 
                
{
 
completed
:
 
true
 
}
.
to_json
,


52 
                
{
 
'CONTENT_TYPE'
 
=>
 
'application/json'
 
}


53 


54 
  
expect
(
@client
.
last_response
.
status
)
.
to
 
eq
(
200
)


55 


56 
  
api_get_tasks


57 


58 
  
expected_list
 
=
 
[


59 
    
'[√] 1. Write a test that fails'
,


60 
    
'[ ] 2. Write Production code that makes the test pass'


61 
  
]


62 


63 
  
expect
(
@client
.
last_response
.
body
)
.
to
 
eq
(
expected_list
.
to_json
)


64 
  
end


65 
end

```

Que falla por el motivo deseado. No deja de tener cierta gracia que nos interese que fallen cosas por una buena razón:

```

1 
  1) As a user I want to mark a task completed

2 
     Failure/Error: expect(@client.last_response.body).to eq(expected_list.to_json)

3 


4 
       expected: "[\"[√] 1. Write a test that fails\",\"[ ] 2. Write Production code that\

5 
 makes the test pass\"]"

6 
            got: "[\"[ ] 1. Write a test that fails\",\"[ ] 2. Write Production code that\

7 
 makes the test pass\"]"
```

Ahora es cuando implementamos una solución tentativa:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../../src/domain/task'


 5 


 6 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 7 
  
def
 
initialize
(
add_task_handler
,
 
get_tasks_list_handler
,
 
task_repository
)


 8 
  
@add_task_handler
 
=
 
add_task_handler


 9 
  
@get_tasks_list_handler
 
=
 
get_tasks_list_handler


10 
  
@task_repository
 
=
 
task_repository


11 
  
end


12 


13 
  
# ...


14 


15 
  
patch
 
'/api/todo/:task_id'
 
do
 
|
 
task_id
 
|


16 
  
task
 
=
 
Task
.
new
 
1
,
 
'Write a test that fails'


17 
  
task
.
mark_completed


18 
  

19 
  
@task_repository
.
store
 
task


20 


21 
  
[
200
]


22 
  
end


23 
end

```

Y esto hace pasar el test. Obviamente necesitamos recuperar primero la tarea para poder actualizarla, pero es algo que no tenemos todavía en nuestro `TaskRepository`. Pero como tenemos todos los tests pasando podemos añadir la funcionalidad.

```

 1 
require
 
'rspec'


 2 


 3 
require_relative
 
'../../src/domain/task_repository'


 4 
require_relative
 
'../../src/domain/task'


 5 
require_relative
 
'../../src/infrastructure/persistence/memory_storage'


 6 


 7 
describe
 
'TaskRepository'
 
do


 8 
  
before
()
 
do


 9 
  
memory_storage
 
=
 
MemoryStorage
.
new


10 
  
@task_repository
 
=
 
TaskRepository
.
new
 
memory_storage


11 
  
end


12 


13 
  
# ...


14 


15 
  
it
 
'should retrieve a task by id'
 
do


16 
  
examples
 
=
 
[


17 
    
Task
.
new
(
1
,
 
'Task Description'
),


18 
    
Task
.
new
(
2
,
 
'Another Task'
),


19 
    
Task
.
new
(
3
,
 
'Third Task'
)


20 
  
].
each
 
{
 
|
task
|
 
@task_repository
.
store
 
task
 
}


21 


22 
  
task
 
=
 
@task_repository
.
retrieve
 
1


23 


24 
  
expect
(
task
)
.
to
 
eq
(
examples
[
0
]
)


25 
  
end


26 
end

```

Lo implementamos así:

```

 1 
class
 
TaskRepository


 2 
  
def
 
initialize
(
storage
)


 3 
  
@storage
 
=
 
storage


 4 
  
end


 5 


 6 
  
def
 
next_id


 7 
  
@storage
.
next_id


 8 
  
end


 9 


10 
  
def
 
store
(
task
)


11 
  
@storage
.
store
 
task


12 
  
end


13 


14 
  
def
 
find_all


15 
  
@storage
.
find_all


16 
  
end


17 


18 
  
def
 
retrieve
(
task_id
)


19 
  
@storage
.
retrieve
 
task_id


20 
  
end


21 
end

```

Junto con:

```

 1 
class
 
MemoryStorage


 2 
  
def
 
initialize


 3 
  
@objects
 
=
 
{}


 4 
  
end


 5 


 6 
  
def
 
next_id


 7 
  
@objects
.
count
 
+
 
1


 8 
  
end


 9 


10 
  
def
 
store
(
object
)


11 
  
@objects
.
store
 
object
.
id
,
 
object


12 
  
end


13 


14 
  
def
 
find_all


15 
  
@objects


16 
  
end


17 


18 
  
def
 
retrieve
(
object_id
)


19 
  
@objects
[
object_id
]


20 
  
end


21 
end

```

Ahora posamos usarlo en nuestra implementación, reemplazando la asignación directa de `task`, que tenemos ahora.

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../../src/domain/task'


 5 


 6 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 7 
  
def
 
initialize
(
add_task_handler
,
 
get_tasks_list_handler
,
 
task_repository
)


 8 
  
@add_task_handler
 
=
 
add_task_handler


 9 
  
@get_tasks_list_handler
 
=
 
get_tasks_list_handler


10 
  
@task_repository
 
=
 
task_repository


11 
  
end


12 


13 
  
post
 
'/api/todo'
 
do


14 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


15 


16 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


17 


18 
  
[
201
]


19 
  
end


20 


21 
  
get
 
'/api/todo'
 
do


22 
  
tasks
 
=
 
@get_tasks_list_handler
.
execute
 
do
 
|
task
|


23 
    
"[
#{
task
.
completed
 
?
 
'√'
 
:
 
' '
}
] 
#{
task
.
id
}
. 
#{
task
.
description
}
"


24 
  
end


25 


26 
  
[
200
,
 
tasks
.
to_json
]


27 
  
end


28 


29 
  
patch
 
'/api/todo/:task_id'
 
do
 
|
 
task_id
 
|


30 
  
task
 
=
 
@task_repository
.
retrieve
 
task_id


31 
  
task
.
mark_completed


32 


33 
  
@task_repository
.
store
 
task


34 


35 
  
[
200
]


36 
  
end


37 
end

```

Y ya casi estamos. El test de aceptación sigue pasando. Lo único que nos queda es introducir el caso de uso, para lo que seguimos el proceso de refactor que ya conocemos. Primero extraemos la funcionalidad a un método privado.

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../../src/domain/task'


 5 


 6 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 7 
  
def
 
initialize
(
add_task_handler
,
 
get_tasks_list_handler
,
 
task_repository
)


 8 
  
@add_task_handler
 
=
 
add_task_handler


 9 
  
@get_tasks_list_handler
 
=
 
get_tasks_list_handler


10 
  
@task_repository
 
=
 
task_repository


11 
  
end


12 


13 
  
# ...


14 
  

15 
  
patch
 
'/api/todo/:task_id'
 
do
 
|
 
task_id
 
|


16 
  
mark_task_completed
 
task_id


17 


18 
  
[
200
]


19 
  
end


20 


21 
  
def
 
self
.
mark_task_completed
(
task_id
)


22 
  
task
 
=
 
@task_repository
.
retrieve
 
task_id


23 
  
task
.
mark_completed


24 


25 
  
@task_repository
.
store
 
task


26 
  
end


27 
end

```

Introducimos la nueva clase, que simplemente usa el mismo código que ya está testado.

```

 1 
class
 
MarkTaskCompletedHandler


 2 
  
def
 
initialize
(
task_repository
)


 3 


 4 
  
@task_repository
 
=
 
task_repository


 5 
  
end


 6 


 7 
  
def
 
execute
(
task_id
)


 8 
  
task
 
=
 
@task_repository
.
retrieve
 
task_id


 9 
  
task
.
mark_completed


10 


11 
  
@task_repository
.
store
 
task


12 
  
end


13 
end

```

Y ahora, introducimos su uso. Como esta acción es idempotente, podemos hacer esto de modo que probamos si funciona antes de eliminar el código que hemos movido:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../../src/domain/task'


 5 


 6 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 7 
  
def
 
initialize
(
add_task_handler
,
 
get_tasks_list_handler
,
 
task_repository
)


 8 
  
@add_task_handler
 
=
 
add_task_handler


 9 
  
@get_tasks_list_handler
 
=
 
get_tasks_list_handler


10 
  
@task_repository
 
=
 
task_repository


11 
  
end


12 


13 
  
# ...


14 


15 
  
patch
 
'/api/todo/:task_id'
 
do
 
|
 
task_id
 
|


16 
  
mark_task_completed
 
task_id


17 
  

18 
  
@mark_task_completed
 
=
 
MarkTaskCompletedHandler
.
new
 
@task_repository


19 
  
@mark_task_completed
.
execute
 
task_id


20 
  
[
200
]


21 
  
end


22 


23 
  
# ...


24 
end

```

Y el test sigue pasando, como era de esperar. Así que podemos eliminar el método extraído antes. Después tendremos que cambiar la construcción para inyectar el caso de uso. Pero vamos por partes:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../../src/domain/task'


 5 


 6 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 7 
  
def
 
initialize
(
add_task_handler
,
 
get_tasks_list_handler
,
 
task_repository
)


 8 
  
@add_task_handler
 
=
 
add_task_handler


 9 
  
@get_tasks_list_handler
 
=
 
get_tasks_list_handler


10 
  
@mark_task_completed
 
=
 
MarkTaskCompletedHandler
.
new
 
@task_repository


11 


12 
  
@task_repository
 
=
 
task_repository


13 
  
end


14 


15 
  
post
 
'/api/todo'
 
do


16 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


17 


18 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


19 


20 
  
[
201
]


21 
  
end


22 


23 
  
get
 
'/api/todo'
 
do


24 
  
tasks
 
=
 
@get_tasks_list_handler
.
execute
 
do
 
|
task
|


25 
    
"[
#{
task
.
completed
 
?
 
'√'
 
:
 
' '
}
] 
#{
task
.
id
}
. 
#{
task
.
description
}
"


26 
  
end


27 


28 
  
[
200
,
 
tasks
.
to_json
]


29 
  
end


30 


31 


32 
  
patch
 
'/api/todo/:task_id'
 
do
 
|
 
task_id
 
|


33 
  
@mark_task_completed
.
execute
 
task_id


34 
  

35 
  
[
200
]


36 
  
end


37 


38 
end

```

El cambio de la construcción lo vamos a dirigir desde el test, iniciando la aplicación con los servicios que realmente necesita

```

 1 
# todo_list_acceptance_spec.rb


 2 
# frozen_string_literal: true


 3 


 4 
# ...


 5 


 6 
def
 
todo_application


 7 
  
@task_repository
 
=
 
TaskRepository
.
new
 
MemoryStorage
.
new


 8 
  
@add_task_handler
 
=
 
AddTaskHandler
.
new
 
@task_repository


 9 
  
@get_tasks_list_handler
 
=
 
GetTaskListHandler
.
new
 
@task_repository


10 
  
@mark_task_completed
 
=
 
MarkTaskCompletedHandler
.
new
 
@task_repository


11 


12 
  
TodoListApp
.
new
 
@add_task_handler
,
 
@get_tasks_list_handler
,
 
@mark_task_completed


13 
end


14 


15 
# ...

```

Los test fallarán estrepitosamente, pero el cambio es fácil de aplicar. Así queda la aplicación:

```

 1 
# frozen_string_literal: true


 2 


 3 
require
 
'sinatra'


 4 
require_relative
 
'../../../src/domain/task'


 5 


 6 
class
 
TodoListApp
 
<
 
Sinatra
::
Base


 7 
  

 8 
  
def
 
initialize
(
add_task_handler
,
 
get_tasks_list_handler
,
 
mark_task_completed
)


 9 
  
@add_task_handler
 
=
 
add_task_handler


10 
  
@get_tasks_list_handler
 
=
 
get_tasks_list_handler


11 
  
@mark_task_completed
 
=
 
mark_task_completed


12 
  
end


13 


14 
  
post
 
'/api/todo'
 
do


15 
  
payload
 
=
 
JSON
.
parse
 
request
.
body
.
read
.
to_s


16 


17 
  
@add_task_handler
.
execute
 
payload
[
'task'
]


18 


19 
  
[
201
]


20 
  
end


21 


22 
  
get
 
'/api/todo'
 
do


23 
  
tasks
 
=
 
@get_tasks_list_handler
.
execute
 
do
 
|
task
|


24 
    
"[
#{
task
.
completed
 
?
 
'√'
 
:
 
' '
}
] 
#{
task
.
id
}
. 
#{
task
.
description
}
"


25 
  
end


26 


27 
  
[
200
,
 
tasks
.
to_json
]


28 
  
end


29 


30 
  
patch
 
'/api/todo/:task_id'
 
do
 
|
 
task_id
 
|


31 
  
@mark_task_completed
.
execute
 
task_id


32 


33 
  
[
200
]


34 
  
end


35 
end

```

## Qué hemos aprendido con esta kata

* Es perfectamente posible aplicar un enfoque *outside-in* con la metodología clásica de TDD.
* La modalidad *outside-in clásica* require que tengamos los tests en verde para introducir el diseño porque lo hacemos en la fase de refactor.
* En algunos momentos podríamos necesitar dobles de test, aunque preferiremos usar implementaciones *fake* o específicas para test (como los repositorios en memoria), o en su caso *stubs* antes que  *mocks* .

# TDD en la vida real

En esta parte nos ocuparemos de cómo es posible incorporar TDD en todos los procesos de desarrollo en proyectos reales.

Trabajaremos en un proyecto para crear el *backend* de una aplicación de lista de tareas sencilla. La misma que hemos usado en el ejemplo de  *outside-in* . Pero esta vez tendremos un punto de partida ligeramente distinto, con el proyecto organizado en base a historias de usuario.

El segundo capítulo de esta parte nos mostrará cómo trabajar cuando tenemos que solucionar un bug, desde la forma de reproducirlo a los pasos que tendremos que ir dando para solucionarlo.

El tercer capítulo trata sobre la implementación de nuevas historias de usuario en el sistema.



# 23 Lista de tareas, *outside-in* TDD por historias de usuario

En esta versión del mismo ejercicio de crear una aplicación usando TDD trabajaremos con el proyecto organizado en historias de usuario. Esto es: hemos dividido el proyecto en funcionalidades que aporten valor. El objetivo es mostrar una metodología de trabajo que podríamos llevar a la práctica en proyectos reales.

Este proyecto también lo haremos en PHP, usando PHPUnit y algunos componentes del *framework* Symfony. La resolución es un poco diferente a la que hicimos en un capítulo anterior, porque esta vez limitaremos el alcance de nuestro trabajo a la historia de usuario, lo que impone algunas restricciones que antes no se presentaban.

## Añadir tareas a una lista

Repasemos la definición.

### US 1

* As a User
* I want to add tasks to a to-do list
* So that, I can organize my tasks

Para completar esta historia de usuario necesitaremos, aparte de un *endpoint* al que poder llamar y un controlador que lo gestione, un caso de uso para añadir tareas a la lista y un repositorio en el que guardarlas. Nuestro caso de uso va a ser un  *command* , por lo que el resultado de la acción será una llamada al repositorio guardando cada nueva tarea.

Para poder verificar esto en un test no queremos escribir código que no vaya a ser necesario en producción. Por ejemplo, no vamos a desarrollar métodos (todavía) para recuperar información del repositorio. Estrictamente hablando, de momento no sabemos siquiera si las vamos a necesitar ( *spoiler* : sí, pero eso sería programar para un futuro que aún no conocemos). Así que, inicialmente, usaremos un *mock* del repositorio y verificaremos que se hacen las llamadas adecuadas.

Una vez que tenemos esto claro, escribimos un test que enviará un POST al *endpoint* para crear una tarea nueva y verificará que, en algún momento, estamos llamando a un repositorio de tareas, confiando en que la implementación real lo gestionará correctamente cuando esté disponible.

Suele ser buena idea, empezar el test por el final, es decir, por lo que esperamos, y construir el resto con las acciones necesarias. En este caso, esperamos la existencia de un `TaskRepository`, que será una interfaz por el momento. También introducimos el concepto de `Task`.

```

 1 
namespace
 
App\Tests\Katas\TodoList
;


 2 


 3 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


 4 


 5 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


 6 
{


 7 
  
/** @test */


 8 
  
public
 
function
 
asUserIWantToAddTaskToAToDoList
()
:
 
void


 9 
  
{


10 
      
$taskRepository
 
=
 
$this
->
createMock
(
TaskRepository
::
class
);


11 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Write a test that fails'
);


12 
      
$taskRepository


13 
          
->
expects
(
self
::
once
())


14 
          
->
method
(
'store'
)


15 
          
->
with
(
$task
);


16 


17 
      
$client
 
=
 
self
::
createClient
();


18 


19 
      
$client
->
getContainer
()
->
set
(
TaskRepository
::
class
,
 
$taskRepository
);


20 


21 
      
$client
->
request
(


22 
          
'POST'
,


23 
          
'/api/todo'
,


24 
          
[],


25 
          
[],


26 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


27 
          
json_encode
([
'task'
 
=>
 
'Write a test that fails'
],
 
JSON_THROW_ON_ERROR
)


28 
      
);


29 
  
}


30 


31 
  
protected
 
function
 
setUp
()
:
 
void


32 
  
{


33 
      
$this
->
resetRepositoryData
();


34 
  
}


35 


36 
  
protected
 
function
 
tearDown
()
:
 
void


37 
  
{


38 
      
$this
->
resetRepositoryData
();


39 
  
}


40 


41 
  
private
 
function
 
resetRepositoryData
()
:
 
void


42 
  
{


43 
      
if
 
(
file_exists
(
'repository.data'
))
 
{


44 
          
unlink
(
'repository.data'
);


45 
      
}


46 
  
}


47 
}

```

Tendremos que ejecutar el test e implementar todo lo que nos vaya pidiendo hasta lograr que falle por la razón adecuada.

El primer mensaje de error es que no tenemos definido `TaskRepository`, así que empezamos por ahí:

```

1 
Cannot stub or mock class or interface "App\Tests\Katas\TodoList\TaskRepository" which do\

2 
es not exist
```

Este error en concreto es específico de PHP y PHPUnit. En otros lenguajes podrías encontrar un error diferente.

De momento mi solución es iniciarlo en el mismo test, si el mensaje de error cambia, entonces lo moveré a su propio archivo.

```

1 
interface
 
TaskRepository


2 
{


3 


4 
}

```

El test ahora falla por una razón diferente, así que hemos pasado este escollo. Usamos el refactor *Move Class* para poner `TaskRepository` en `App\TodoList\Domain\TaskRepository` y lanzamos nuevamente los tests, obteniendo el siguiente error, que es:

```

1 
Error
 
:
 
Class
 
'App\Tests\Katas\TodoList\Task'
 
not
 
found

```

Que nos está diciendo que no hemos definido la clase `Task`. De momento, crearemos Task en el mismo archivo, relanzando el test para ver si cambia el error.

```

1 
class
 
Task


2 
{


3 
  

4 
}

```

Ahora el error nos indica que no existe un método `store` en `TaskRepository`, por lo que no se puede  *mockear* . Tenemos que introducirlo, pero antes, moveremos `Task` a su lugar en `App\TodoList\Domain`. Como puedes ver, estamos organizando el código conforme a una arquitectura en capas.

Tras mover `Task`, añadimos el método `store` en `TaskRepository`:

```

1 
namespace
 
App\TodoList\Domain
;


2 


3 
interface
 
TaskRepository


4 
{


5 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void
;


6 
}

```

El siguiente error es algo más extraño:

```

1 
Symfony\Component\Config\Exception\LoaderLoadException : The file "../src/Controller" doe\

2 
s not exist

3 
 (in: /application/config) in /application/config/services.yaml 

4 
 (which is loaded in resource "/application/config/services.yaml").
```

Tiene que ver con la configuración de Symfony, el *framework* de PHP que estamos usando para este ejercicio. Este mensaje nos indica que no hay archivos que contengan controladores en el *path* y *namespace* indicados. De hecho, yo tampoco no los quiero ahí, sino en `App\TodoList\Infrastructure\EntryPoint\Api`. Esto es porque quiero mantener esa arquitectura limpia, con los componentes organizados en capas. Los controladores y los puntos de entrada a la aplicación están en la capa de infraestructura, dentro de una categoría `EntryPoint` que, en este caso, tiene un “puerto” relacionado con la comunicación mediante Api.

Para lograr esto, no tenemos más que ir al archivo `config/services.yaml` y cambiar lo necesario:

```

1 
  
# controllers are imported separately to make sure services can be injected


2 
  
# as action arguments even if you don't extend any base controller class


3 
  
App\TodoList\Infrastructure\EntryPoint\Api\
:


4 
      
resource
:
 
'../src/TodoList/Infrastructure/EntryPoint/Api'


5 
      
tags
:
 
[
'controller.service_arguments'
]

```

Al ejecutar el test, tendremos un error semejante:

```

1 
Symfony\Component\Config\Exception\LoaderLoadException : The file "../src/TodoList/Infras\

2 
tructure/EntryPoint/Api" 

3 
 does not exist (in: /application/config) in /application/config/services.yaml

4 
 (which is loaded in resource "/application/config/services.yaml").
```

Es positivo porque refleja que hemos hecho el cambio de **services.yaml** correctamente, pero aún no hemos añadido un controlador en la ubicación deseada que se pueda cargar y evitar el error. Así que añadimos un archivo `TodoListController`, en la ubicación definida.

```

1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


2 


3 


4 
class
 
TodoListController


5 
{


6 


7 
}

```

Al ejecutar el test obtenemos dos nuevos mensajes de error. Por un lado:

```

1 
"No route found for "POST /api/todo""
```

Nos indica un problema en el  *framework* , ya que el cliente HTTP del test está llamando a un *endpoint* que aún no hemos definido en ninguna parte. Lo resolvemos configurando lo necesario en `routes.yaml`:

```

1 
api_add_task
:


2 
  
path
:
 
/api/todo


3 
  
controller
:
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController::addTask


4 
  
methods
:
 
[
'POST'
]

```

Como hacemos después de un cambio, ejecutamos el test, que ahora se quejará de que no existe un método en el controlador encargado de responder a este  *endpoint* .

```

1 
"The controller for URI "/api/todo" is not callable. 

2 
Expected method "addTask" on class "App\TodoList\Infrastructure\EntryPoint\Api\TodoListCo\

3 
ntroller"...
```

Lo implementamos así:

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 


 4 
class
 
TodoListController


 5 
{


 6 
  
public
 
function
 
addTask
()


 7 
  
{


 8 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s'
,
 
__METHOD__
));


 9 
  
}


10 
}

```

Es una simple línea que lanza una excepción para indicar que el método no está implementado. Esto lo hacemos para que el propio test nos indique que tenemos algo sin implementar. En este caso concreto, un cuerpo vacío no nos indicaría nada y, en muchos casos, sería fácil perder la pista de lo que tenemos pendiente de escribir.

De hecho, si lanzamos el test nos indica justamente ese error.

```

1 
RuntimeException: "Implement App\TodoList\Infrastructure\EntryPoint\Api\TodoListControlle\

2 
r::addTask"
```

Pero también este otro, que es propio del test:

```

1 
Expectation failed for method name is equal to 'store' when invoked 1 time(s).

2 
Method was expected to be called 1 times, actually called 0 times.
```

Este error es el que esperaríamos del test tal como lo hemos definido. Ya no hay errores de configuración del  *framework* . Nos dice que nunca llega a intentarse guardar una `Task` en el repositorio, que es como decir, que no hay código de producción que haga lo que deseamos.

Estos dos errores juntos nos indican momento de implementar.

Y para hacerlo, necesitamos avanzar un paso hacia el interior de nuestra aplicación, que en nuestro ejemplo es `TodoListController`. En este punto abandonamos el ciclo del test de aceptación y entramos en un ciclo de test unitarios para desarrollar `TodoListController::addTask`.

## Diseñando *en rojo*

El test de aceptación no está pasando, y nos está pidiendo que implementemos algo en `TodoListController`. Para hacerlo, lo que vamos a hacer es pensar cómo queremos que sea el controlador y si delegará en otros objetos el trabajo.

En particular, queremos que el controlador sea una capa muy fina que se encargue de:

* Obtener la información necesaria de la request
* Pasársela a un caso de uso para que haga lo que sea necesario
* Obtener la respuesta del caso de uso y enviarla como respuesta del *endpoint*

En un enfoque clásico, implementaríamos la solución completa en el controlador y luego iríamos moviendo la lógica a los componentes necesarios.

En lugar de eso, en el enfoque `mockista`, diseñamos cómo va a ser ese nivel de implementación y usamos dobles para los colaboradores que vayamos necesitando. Por ejemplo, este es nuestro test:

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController
;


 4 
use
 
PHPUnit\Framework\TestCase
;


 5 
use
 
Symfony\Component\HttpFoundation\Request
;


 6 


 7 
class
 
TodoListControllerTest
 
extends
 
TestCase


 8 
{


 9 


10 
  
/** @test */


11 
  
public
 
function
 
shouldAddTask
()
:
 
void


12 
  
{


13 
      
$addTaskHandler
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


14 
      
$addTaskHandler


15 
          
->
expects
(
self
::
once
())


16 
          
->
method
(
'execute'
)


17 
          
->
with
(
'Task Description'
);


18 
      

19 
      
$todoListController
 
=
 
new
 
TodoListController
(
$addTaskHandler
);


20 


21 
      
$request
 
=
 
new
 
Request
(


22 
          
[],


23 
          
[],


24 
          
[],


25 
          
[],


26 
          
[],


27 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


28 
          
json_encode
([
'task'
 
=>
 
'Task Description'
],
 
JSON_THROW_ON_ERROR
)


29 
      
);


30 
      

31 
      
$response
 
=
 
$todoListController
->
addTask
(
$request
);


32 


33 
      
self
::
assertEquals
(
201
,
 
$response
->
getStatusCode
());


34 
  
}


35 
}

```

En este test se verifican dos cosas. Por un lado que devolvemos una respuesta con código 201 (recurso creado) y que tendremos un caso de uso llamado `AddTaskHandler` que se encarga de procesar la creación de la tarea a partir de su descripción, que recibe como *payload* en la  *request* .

Al ejecutar el test, empezamos a obtener los errores esperados. El primero es que no tenemos ningún `AddTaskHandler`. De nuevo, empezaré añadiéndolo en el archivo del test y lo moveré en el siguiente paso. De hecho, es literalmente lo que indica el error:

```

1 
Cannot stub or mock class or interface "App\Tests\TodoList\Infrastructure\EntryPoint\Api\\

2 
AddTaskHandler" 

3 
which does not exist
```

Así que, añadimos:

```

1 
class
 
AddTaskHandler


2 
{


3 


4 
}

```

Al ejecutar ahora el test, nos pide incorporar el método `execute`, que aún no está definido. Antes de añadirlo, vamos a mover `AddTaskHandler`, que es el caso de uso, a su lugar en la capa de aplicación: `App\TodoList\Application`. A continuación, añadimos el método incluyendo nuestra excepción de `no implementado`.

```

1 
namespace
 
App\TodoList\Application
;


2 


3 
class
 
AddTaskHandler


4 
{


5 
  
public
 
function
 
execute
()
:
 
void


6 
  
{


7 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s'
,
 
__METHOD__
));


8 
  
}


9 
}

```

De este modo, lo que ocurrirá es lo siguiente: una vez que hayamos implementado el controlador, veremos que su test unitario pasa, puesto que estamos usando el doble de `AddTaskHandler` y no llamamos al código real. Esto ocurrirá al lanzar el test de aceptación, lo que nos estará indicando que deberíamos implementar `AddTaskHandler` y profundizar un nivel más en la aplicación.

El siguiente fallo es conocido:

```

1 
RuntimeException
 
:
 
Implement
 
App
\
TodoList
\
Infrastructure
\
EntryPoint
\
Api
\
TodoListControlle
\


2 
r
::
addTask

```

Lo que nos indica que el test ya está llamando al método `addTask`, que aún no está implementado. Es justo donde queríamos estar. En `TodoListController::addTask` implementaremos lógica que haga pasar el test:

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 


 4 
use
 
App\TodoList\Application\AddTaskHandler
;


 5 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 6 
use
 
Symfony\Component\HttpFoundation\Request
;


 7 
use
 
Symfony\Component\HttpFoundation\Response
;


 8 


 9 
class
 
TodoListController


10 
{


11 


12 
  
/** @var AddTaskHandler */


13 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


14 


15 
  
public
 
function
 
__construct
(
AddTaskHandler
 
$addTaskHandler
)


16 
  
{


17 
      
$this
->
addTaskHandler
 
=
 
$addTaskHandler
;


18 
  
}


19 


20 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


21 
  
{


22 
      
$payload
 
=
 
json_decode
(
$request
->
getContent
(),
 
true
,
 
512
,
 
JSON_THROW_ON_ERROR
);


23 


24 
      
$this
->
addTaskHandler
->
execute
(
$payload
[
'task'
]);


25 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


26 
  
}


27 
}

```

¡El test pasa!

Podríamos haber ido más despacio aquí para dirigir la implementación con pasos más pequeños, pero creo que es mejor hacerlo en uno sólo porque la lógica no es muy compleja y así no nos vamos mucho por las ramas. Lo importante, en todo caso, es que hemos cumplido con el objetivo de desarrollar este controlador con un test unitario que ahora mismo pasa.

Como el test unitario ya pasa, no tenemos más que hacer en este nivel. En todo caso, voy a hacer un pequeño refactor para ocultar los detalles de la obtención del *payload* de la  *request* , lo que deja el cuerpo del controlador un poco más limpio y fácil de seguir.

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 


 4 
use
 
App\TodoList\Application\AddTaskHandler
;


 5 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 6 
use
 
Symfony\Component\HttpFoundation\Request
;


 7 
use
 
Symfony\Component\HttpFoundation\Response
;


 8 


 9 
class
 
TodoListController


10 
{


11 
  
/** @var AddTaskHandler */


12 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


13 


14 
  
public
 
function
 
__construct
(
AddTaskHandler
 
$addTaskHandler
)


15 
  
{


16 
      
$this
->
addTaskHandler
 
=
 
$addTaskHandler
;


17 
  
}


18 


19 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


20 
  
{


21 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


22 


23 
      
$this
->
addTaskHandler
->
execute
(
$payload
[
'task'
]);


24 


25 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


26 
  
}


27 


28 
  
private
 
function
 
obtainPayload
(
Request
 
$request
)
:
 
array


29 
  
{


30 
      
return
 
json_decode
(
$request
->
getContent
(),
 
true
,
 
512
,
 
JSON_THROW_ON_ERROR
);


31 
  
}


32 
}

```

## Volviendo al test de aceptación

Una vez que hemos hecho pasar el test unitario, tenemos que volver al nivel de aceptación para que nos diga como seguir. Lo ejecutamos y obtenemos lo siguiente:

```

1 
RuntimeException: "Implement App\TodoList\Application\AddTaskHandler::App\TodoList\Applic\

2 
ation\AddTaskHandler::execute" 
```

Ahora nos toca internarnos un poco más en la aplicación y movernos al caso de uso `AddTaskHandler`. Lo que esperamos de este UseCase es que use la información recibida para crear una tarea y la guarde en TaskRepository.

Para crear una tarea, necesitaremos asignarle un ID, el cual le vamos a pedir al propio repositorio que tendrá un método a propósito.

Esto lo podemos expresar con el siguiente test unitario.

```

 1 
namespace
 
App\Tests\TodoList\Application
;


 2 


 3 
use
 
App\TodoList\Application\AddTaskHandler
;


 4 
use
 
App\TodoList\Domain\Task
;


 5 
use
 
App\TodoList\Domain\TaskRepository
;


 6 
use
 
PHPUnit\Framework\TestCase
;


 7 


 8 
class
 
AddTaskHandlerTest
 
extends
 
TestCase


 9 
{


10 
  
/** @test */


11 
  
public
 
function
 
shouldCreateAndStoreATask
()
:
 
void


12 
  
{


13 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


14 
      

15 
      
$taskRepository
 
=
 
$this
->
createMock
(
TaskRepository
::
class
);


16 
      

17 
      
$taskRepository


18 
          
->
method
(
'nextIdentity'
)


19 
          
->
willReturn
(
1
);


20 
      

21 
      
$taskRepository


22 
          
->
expects
(
self
::
once
())


23 
          
->
method
(
'store'
)


24 
          
->
with
(
$task
);


25 
      

26 
      
$addTaskHandler
 
=
 
new
 
AddTaskHandler
(
$taskRepository
);


27 
      

28 
      
$addTaskHandler
->
execute
(
'Task Description'
);


29 
  
}


30 
}

```

Ejecutamos el test. Obtenemos primero este error:

```

1 
Trying to configure method "nextIdentity" which cannot be configured because it does not \

2 
exist, has not been specified, is final, or is static
```

Añadimos el método en la interfaz:

```

1 
namespace
 
App\TodoList\Domain
;


2 


3 
interface
 
TaskRepository


4 
{


5 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void
;


6 
  

7 
  
public
 
function
 
nextIdentity
()
:
 
int
;


8 
}

```

Lo que genera este error:

```

1 
RuntimeException
 
:
 
Implement
 
App
\
TodoList
\
Application
\
AddTaskHandler
::
App
\
TodoList
\
Applic
\


2 
ation
\
AddTaskHandler
::
execute

```

Y estamos listos para implementar el caso de uso. Este código debería bastar:

```

 1 
namespace
 
App\TodoList\Application
;


 2 


 3 
use
 
App\TodoList\Domain\Task
;


 4 
use
 
App\TodoList\Domain\TaskRepository
;


 5 


 6 
class
 
AddTaskHandler


 7 
{


 8 
  
/** @var TaskRepository */


 9 
  
private
 
TaskRepository
 
$taskRepository
;


10 


11 
  
public
 
function
 
__construct
(
TaskRepository
 
$taskRepository
)


12 
  
{


13 
      
$this
->
taskRepository
 
=
 
$taskRepository
;


14 
  
}


15 


16 
  
public
 
function
 
execute
(
string
 
$taskDescription
)
:
 
void


17 
  
{


18 
      
$id
 
=
 
$this
->
taskRepository
->
nextIdentity
();


19 


20 
      
$task
 
=
 
new
 
Task
(
$id
,
 
$taskDescription
);


21 


22 
      
$this
->
taskRepository
->
store
(
$task
);


23 
  
}


24 
}

```

El código es suficiente para hacer pasar el test, por lo que podemos volver al nivel de aceptación.

## Nuevo ciclo

Al relanzar el test de aceptación nos encontramos que éste pasa. Sin embargo, la historia de usuario no está implementada aún ya que no tenemos un repositorio concreto en el que se estén guardando `Task`. De hecho, nuestras clases `Task` no tienen ningún código todavía.

El motivo es que estamos usando un *mock* de `TaskRepository` en el test de aceptación. Nos interesaría dejar de usarlo para que `TodoList` utilice una implementación concreta. El problema que tendríamos ahora es que de momento no vamos a tener métodos con los que explorar el contenido del repositorio y verificar el test. Vamos a hacer esto en dos fases.

En la primera simplemente eliminamos el uso del *mock* y verificamos que la respuesta del API devuelve el código 201 (created).

```

 1 
namespace
 
App\Tests\Katas\TodoList
;


 2 


 3 
use
 
App\TodoList\Domain\Task
;


 4 
use
 
App\TodoList\Domain\TaskRepository
;


 5 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


 6 
use
 
Symfony\Component\HttpFoundation\Response
;


 7 


 8 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


 9 
{


10 
  
/** @test */


11 
  
public
 
function
 
asUserIWantToAddTaskToAToDoList
()
:
 
void


12 
  
{


13 
      
$client
 
=
 
self
::
createClient
();


14 


15 
      
$client
->
request
(


16 
          
'POST'
,


17 
          
'/api/todo'
,


18 
          
[],


19 
          
[],


20 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


21 
          
json_encode
([
'task'
 
=>
 
'Write a test that fails'
],
 
JSON_THROW_ON_ERROR
)


22 
      
);


23 


24 
      
$response
 
=
 
$client
->
getResponse
();


25 


26 
      
self
::
assertEquals
(
Response
::
HTTP_CREATED
,
 
$response
->
getStatusCode
());


27 
  
}


28 


29 


30 
  
protected
 
function
 
setUp
()
:
 
void


31 
  
{


32 
      
$this
->
resetRepositoryData
();


33 
  
}


34 


35 
  
protected
 
function
 
tearDown
()
:
 
void


36 
  
{


37 
      
$this
->
resetRepositoryData
();


38 
  
}


39 


40 
  
private
 
function
 
resetRepositoryData
()
:
 
void


41 
  
{


42 
      
if
 
(
file_exists
(
'repository.data'
))
 
{


43 
          
unlink
(
'repository.data'
);


44 
      
}


45 
  
}


46 
}

```

Antes de continuar, tenemos que eliminar la definición del servicio que hicimos antes en `services_test.yaml`. Como es el único que tenemos declarado aquí, podemos eliminar el archivo sin problema.

Y al ejecutar el test, nos aparece el siguiente error del  *framework* :

```

1 
Cannot autowire service "App\TodoList\Application\AddTaskHandler": argument "$taskReposit\

2 
ory" of method "__construct()"
```

Esto ocurre porque sólo tenemos una interfaz de `TaskRepository` y necesitaríamos una implementación concreta que usar. De este modo, tenemos un error que nos permite avanzar en el desarrollo. Necesitaremos un test para implementar `FileTaskRepository`, un repositorio basado en un sencillo archivo de texto para guardar los objetos serializados:

```

 1 
namespace
 
App\Lib
;


 2 


 3 


 4 
class
 
FileStorageEngine


 5 
{


 6 
  
private
 
string
 
$filePath
;


 7 


 8 
  
public
 
function
 
__construct
(
$filePath
)


 9 
  
{


10 
      
$this
->
filePath
 
=
 
$filePath
;


11 
  
}


12 


13 
  
public
 
function
 
loadObjects
(
string
 
$class
)
:
 
array


14 
  
{


15 
      
if
 
(
!
file_exists
(
$this
->
filePath
))
 
{


16 
          
return
 
[];


17 
      
}


18 


19 
      
$file
 
=
 
fopen
(
$this
->
filePath
,
 
'rb'
);


20 
      
$objects
 
=
 
unserialize
(
fgets
(
$file
),
 
[
'allowed_classes'
 
=>
 
[
$class
]]);


21 
      
fclose
(
$file
);


22 


23 
      
return
 
$objects
;


24 
  
}


25 


26 
  
public
 
function
 
persistObjects
(
array
 
$objects
)
:
 
void


27 
  
{


28 
      
$file
 
=
 
fopen
(
$this
->
filePath
,
 
'wb'
);


29 
      
fwrite
(
$file
,
 
serialize
(
$objects
));


30 
      
fclose
(
$file
);


31 
  
}


32 
}

```

En primer lugar vamos a crear una implementación por defecto para `FileTaskRepository` en su lugar, que será `App\TodoList\Infrastructure\Persistence`:

```

 1 
namespace
 
App\TodoList\Infrastructure\Persistence
;


 2 


 3 


 4 
use
 
App\TodoList\Domain\Task
;


 5 
use
 
App\TodoList\Domain\TaskRepository
;


 6 


 7 
class
 
FileTaskRepository
 
implements
 
TaskRepository


 8 
{


 9 


10 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void


11 
  
{


12 
      
throw
 
new
 
\RuntimeException
(
'Implement store() method.'
);


13 
  
}


14 


15 
  
public
 
function
 
nextIdentity
()
:
 
int


16 
  
{


17 
      
throw
 
new
 
\RuntimeException
(
'Implement nextIdentity() method.'
);


18 
  
}


19 
}

```

Al volver a ejecutar el test de aceptación se producen dos errores. Uno nos dice que tenemos que implementar el método `nextIdentity` del repositorio. El otro, que es un error propio del test, nos informa de que el *endpoint* devuelve el código 500 en lugar de 201. Es lógico porque la implementación que tenemos ahora de FileTaskRepository fallará de forma fatal.

Pero es una buena noticia, porque nos dice por dónde seguir. Así que crearemos un nuevo test unitario para guiar el desarrollo de `FileTaskRepository`. En este test simulamos distinto número de objetos en el almacenamiento para asegurar la implementación correcta.

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\Persistence
;


 2 


 3 
use
 
App\Lib\FileStorageEngine
;


 4 
use
 
App\TodoList\Infrastructure\Persistence\FileTaskRepository
;


 5 
use
 
PHPUnit\Framework\TestCase
;


 6 


 7 
class
 
FileTaskRepositoryTest
 
extends
 
TestCase


 8 
{


 9 
  
/** @test */


10 
  
public
 
function
 
shouldProvideNextIdentityCountingExistingObjects
()
:
 
void


11 
  
{


12 
      
$storageEngine
 
=
 
$this
->
createMock
(
FileStorageEngine
::
class
);


13 


14 
      
$taskRepository
 
=
 
new
 
FileTaskRepository
(
$storageEngine
);


15 
      
$storageEngine


16 
          
->
method
(
'loadObjects'
)


17 
          
->
willReturn
(


18 
              
[],


19 
              
[
'Task'
],


20 
              
[
'Task'
,
 
'Task'
]


21 
          
);


22 


23 
      
self
::
assertEquals
(
1
,
 
$taskRepository
->
nextIdentity
());


24 
      
self
::
assertEquals
(
2
,
 
$taskRepository
->
nextIdentity
());


25 
      
self
::
assertEquals
(
3
,
 
$taskRepository
->
nextIdentity
());


26 
  
}


27 
}

```

Con este test pasando, volvemos al test de aceptación, que vuelve a fallar. El *endpoint* devuelve un error 500 porque no tenemos una implementación del método `store` en `FileTaskRepository`.

Introduciremos un nuevo test, aunque antes lo hemos refactorizado un poco a fin de que sea más fácil introducir los cambios:

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\Persistence
;


 2 


 3 
use
 
App\Lib\FileStorageEngine
;


 4 
use
 
App\TodoList\Domain\Task
;


 5 
use
 
App\TodoList\Domain\TaskRepository
;


 6 
use
 
App\TodoList\Infrastructure\Persistence\FileTaskRepository
;


 7 
use
 
PHPUnit\Framework\TestCase
;


 8 


 9 
class
 
FileTaskRepositoryTest
 
extends
 
TestCase


10 
{


11 
  
private
 
FileStorageEngine
 
$fileStorageEngine
;


12 
  
private
 
TaskRepository
 
$taskRepository
;


13 


14 
  
public
 
function
 
setUp
()
:
 
void


15 
  
{


16 
      
$this
->
fileStorageEngine
 
=
 
$this
->
createMock
(
FileStorageEngine
::
class
);


17 
      
$this
->
taskRepository
 
=
 
new
 
FileTaskRepository
(
$this
->
fileStorageEngine
);


18 
  
}


19 


20 
  
/** @test */


21 
  
public
 
function
 
shouldProvideNextIdentityCountingExistingObjects
()
:
 
void


22 
  
{


23 
      
$this
->
fileStorageEngine


24 
          
->
method
(
'loadObjects'
)


25 
          
->
willReturn
(


26 
              
[],


27 
              
[
'Task'
],


28 
              
[
'Task'
,
 
'Task'
]


29 
          
);


30 


31 
      
self
::
assertEquals
(
1
,
 
$this
->
taskRepository
->
nextIdentity
());


32 
      
self
::
assertEquals
(
2
,
 
$this
->
taskRepository
->
nextIdentity
());


33 
      
self
::
assertEquals
(
3
,
 
$this
->
taskRepository
->
nextIdentity
());


34 
  
}


35 


36 
  
/** @test */


37 
  
public
 
function
 
shouldStoreATask
()
:
 
void


38 
  
{


39 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


40 


41 
      
$this
->
fileStorageEngine


42 
          
->
method
(
'loadObjects'
)


43 
          
->
willReturn
([]);


44 
      
$this
->
fileStorageEngine


45 
          
->
expects
(
self
::
once
())


46 
          
->
method
(
'persistObjects'
)


47 
          
->
with
([
1
 
=>
 
$task
]);


48 


49 
      
$this
->
taskRepository
->
store
(
$task
);


50 
  
}


51 
}

```

Esta es nuestra implementación para pasar el test:

```

 1 
namespace
 
App\TodoList\Infrastructure\Persistence
;


 2 


 3 


 4 
use
 
App\Lib\FileStorageEngine
;


 5 
use
 
App\TodoList\Domain\Task
;


 6 
use
 
App\TodoList\Domain\TaskRepository
;


 7 


 8 
class
 
FileTaskRepository
 
implements
 
TaskRepository


 9 
{


10 


11 
  
/** @var FileStorageEngine */


12 
  
private
 
FileStorageEngine
 
$fileStorageEngine
;


13 


14 
  
public
 
function
 
__construct
(
FileStorageEngine
 
$fileStorageEngine
)


15 
  
{


16 
      
$this
->
fileStorageEngine
 
=
 
$fileStorageEngine
;


17 
  
}


18 


19 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void


20 
  
{


21 
     
$tasks
 
=
 
$this
->
fileStorageEngine
->
loadObjects
(
Task
::
class
);


22 


23 
     
$tasks
[
$task
->
id
()]
 
=
 
$task
;


24 


25 
     
$this
->
fileStorageEngine
->
persistObjects
(
$tasks
);


26 
  
}


27 


28 
  
public
 
function
 
nextIdentity
()
:
 
int


29 
  
{


30 
      
$tasks
 
=
 
$this
->
fileStorageEngine
->
loadObjects
(
Task
::
class
);


31 


32 
      
return
 
count
(
$tasks
)
 
+
 
1
;


33 
  
}


34 
}

```

Tenemos que implementar el método `Task::id`, lo que nos hace introducir también un constructor:

```

 1 
namespace
 
App\TodoList\Domain
;


 2 


 3 
class
 
Task


 4 
{


 5 
  
private
 
int
 
$id
;


 6 
  
private
 
string
 
$description
;


 7 


 8 
  
public
 
function
 
__construct
(
int
 
$id
,
 
string
 
$description
)


 9 
  
{


10 
      
$this
->
id
 
=
 
$id
;


11 
      
$this
->
description
 
=
 
$description
;


12 
  
}


13 


14 
  
public
 
function
 
id
()
:
 
int


15 
  
{


16 
      
return
 
$this
->
id
;


17 
  
}


18 
}

```

La implementación hace pasar el test. Para no alargarnos no introduciré más ejemplos, que sería lo propio para tener más confianza en el comportamiento del test. Pero de momento nos vale para entender el proceso.

Como estamos en verde, volvemos al test de aceptación para comprobar qué avances hemos tenido. Y al ejecutarlo, el test de aceptación pasa, indicando que la feature está completa. O casi, ya que por el momento no tenemos forma de saber si las tareas se han almacenado o no.

Una posibilidad es obtener el contenido de `FileStorageEngine` y ver si allí se encuentran nuestras tareas. No nos obliga a implementar nada en el código de producción:

```

 1 
namespace
 
App\Tests\Katas\TodoList
;


 2 


 3 
use
 
App\Lib\FileStorageEngine
;


 4 
use
 
App\TodoList\Domain\Task
;


 5 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


 6 
use
 
Symfony\Component\HttpFoundation\Response
;


 7 


 8 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


 9 
{


10 
  
/** @test */


11 
  
public
 
function
 
asUserIWantToAddTaskToAToDoList
()
:
 
void


12 
  
{


13 
      
$client
 
=
 
self
::
createClient
();


14 


15 
      
$client
->
request
(


16 
          
'POST'
,


17 
          
'/api/todo'
,


18 
          
[],


19 
          
[],


20 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


21 
          
json_encode
([
'task'
 
=>
 
'Write a test that fails'
],
 
JSON_THROW_ON_ERROR
)


22 
      
);


23 


24 
      
$response
 
=
 
$client
->
getResponse
();


25 


26 
      
self
::
assertEquals
(
Response
::
HTTP_CREATED
,
 
$response
->
getStatusCode
());


27 


28 
      
$storage
 
=
 
new
 
FileStorageEngine
(
'repository.data'
);


29 
      
$tasks
 
=
 
$storage
->
loadObjects
(
Task
::
class
);


30 


31 
      
self
::
assertCount
(
1
,
 
$tasks
);


32 
      
self
::
assertEquals
(
1
,
 
$tasks
[
1
]
->
id
());


33 
  
}


34 


35 


36 
  
protected
 
function
 
setUp
()
:
 
void


37 
  
{


38 
      
$this
->
resetRepositoryData
();


39 
  
}


40 


41 
  
protected
 
function
 
tearDown
()
:
 
void


42 
  
{


43 
      
$this
->
resetRepositoryData
();


44 
  
}


45 


46 
  
private
 
function
 
resetRepositoryData
()
:
 
void


47 
  
{


48 
      
if
 
(
file_exists
(
'repository.data'
))
 
{


49 
          
unlink
(
'repository.data'
);


50 
      
}


51 
  
}


52 
}

```

El test verifica que hemos guardado una tarea en el repositorio, confirmando que la primera historia de usuario está implementada. Puede ser buen momento para examinar lo que hemos hecho y ver si podemos hacer algún refactor que pueda facilitar los siguientes pasos del desarrollo.

Empecemos con el test de aceptación:

```

 1 
namespace
 
App\Tests\Katas\TodoList
;


 2 


 3 
use
 
App\Lib\FileStorageEngine
;


 4 
use
 
App\TodoList\Domain\Task
;


 5 
use
 
Symfony\Bundle\FrameworkBundle\Client
;


 6 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


 7 
use
 
Symfony\Component\HttpFoundation\Response
;


 8 


 9 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


10 
{


11 
  
private
 
Client
 
$client
;


12 


13 
  
/** @test */


14 
  
public
 
function
 
asUserIWantToAddTaskToAToDoList
()
:
 
void


15 
  
{


16 
      
$response
 
=
 
$this
->
whenWeRequestToCreateATaskWithDescription
(
'Write a test that f\


17 
ails'
);


18 


19 
      
$this
->
thenResponseShouldBeSuccesful
(
$response
);


20 


21 
      
$this
->
thenTheTaskIsStored
();


22 
  
}


23 


24 


25 
  
protected
 
function
 
setUp
()
:
 
void


26 
  
{


27 
      
$this
->
resetRepositoryData
();


28 


29 
      
$this
->
client
 
=
 
self
::
createClient
();


30 
  
}


31 


32 
  
protected
 
function
 
tearDown
()
:
 
void


33 
  
{


34 
      
$this
->
resetRepositoryData
();


35 
  
}


36 


37 
  
private
 
function
 
resetRepositoryData
()
:
 
void


38 
  
{


39 
      
if
 
(
file_exists
(
'repository.data'
))
 
{


40 
          
unlink
(
'repository.data'
);


41 
      
}


42 
  
}


43 


44 
  
private
 
function
 
whenWeRequestToCreateATaskWithDescription
(
string
 
$taskDescription
)
:
 
\


45 
Response


46 
  
{


47 
      
$this
->
client
->
request
(


48 
          
'POST'
,


49 
          
'/api/todo'
,


50 
          
[],


51 
          
[],


52 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


53 
          
json_encode
([
'task'
 
=>
 
$taskDescription
],
 
JSON_THROW_ON_ERROR
)


54 
      
);


55 


56 
      
return
 
$this
->
client
->
getResponse
();


57 
  
}


58 


59 
  
private
 
function
 
thenResponseShouldBeSuccesful
(
Response
 
$response
)
:
 
void


60 
  
{


61 
      
self
::
assertEquals
(
Response
::
HTTP_CREATED
,
 
$response
->
getStatusCode
());


62 
  
}


63 


64 
  
private
 
function
 
thenTheTaskIsStored
()
:
 
void


65 
  
{


66 
      
$storage
 
=
 
new
 
FileStorageEngine
(
'repository.data'
);


67 
      
$tasks
 
=
 
$storage
->
loadObjects
(
Task
::
class
);


68 


69 
      
self
::
assertCount
(
1
,
 
$tasks
);


70 
      
self
::
assertEquals
(
1
,
 
$tasks
[
1
]
->
id
());


71 
  
}


72 
}

```

**TodoListControllerTest** :

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Application\AddTaskHandler
;


 4 
use
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController
;


 5 
use
 
PHPUnit\Framework\TestCase
;


 6 
use
 
Symfony\Component\HttpFoundation\Request
;


 7 


 8 
class
 
TodoListControllerTest
 
extends
 
TestCase


 9 
{


10 
  
private
 
const
 
TASK_DESCRIPTION
 
=
 
'Task Description'
;


11 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


12 
  
private
 
TodoListController
 
$todoListController
;


13 


14 
  
protected
 
function
 
setUp
()
:
 
void


15 
  
{


16 
      
$this
->
addTaskHandler
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


17 
      
$this
->
todoListController
 
=
 
new
 
TodoListController
(
$this
->
addTaskHandler
);


18 
  
}


19 


20 


21 
  
/** @test */


22 
  
public
 
function
 
shouldAddTask
()
:
 
void


23 
  
{


24 
      
$this
->
addTaskHandler


25 
          
->
expects
(
self
::
once
())


26 
          
->
method
(
'execute'
)


27 
          
->
with
(
self
::
TASK_DESCRIPTION
);


28 


29 
      
$request
 
=
 
new
 
Request
(


30 
          
[],


31 
          
[],


32 
          
[],


33 
          
[],


34 
          
[],


35 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


36 
          
json_encode
([
'task'
 
=>
 
self
::
TASK_DESCRIPTION
],
 
JSON_THROW_ON_ERROR
)


37 
      
);


38 


39 
      
$response
 
=
 
$this
->
todoListController
->
addTask
(
$request
);


40 


41 
      
self
::
assertEquals
(
201
,
 
$response
->
getStatusCode
());


42 
  
}


43 
}

```

Hay otros pequeños cambios en archivos, pero no los vamos a detallar aquí.

## Ver las tareas de la lista

### US 2

* As a User
* I want to see the task in my to-do list
* So that, I can know what I have to do next

Nuestra segunda historia requiere su propio  *endpoint* , controlador y caso de uso. Ya tenemos un repositorio de tareas, al cual tendremos que añadir un método con el que obtener las lista completa.

Como tenemos una implementación *real* del repositorio ya no tenemos que usar un *mock* como nos hizo falta antes para poder arrancar el desarrollo. En una situación en la que estuviésemos usando una persistencia en base de datos o similar, posiblemente necesitaríamos una implementación  *fake* , como un repositorio en memoria o incluso este simple repositorio en archivo que estamos utilizando, que necesitamos por el problema de la persistencia entre requests de PHP.

Esta es la primera versión del test de aceptación para esta historia de usuario:

```

  1 
namespace
 
App\Tests\Katas\TodoList
;


  2 


  3 
use
 
App\Lib\FileStorageEngine
;


  4 
use
 
App\TodoList\Domain\Task
;


  5 
use
 
Symfony\Bundle\FrameworkBundle\Client
;


  6 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


  7 
use
 
Symfony\Component\HttpFoundation\Response
;


  8 


  9 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


 10 
{


 11 
  
private
 
Client
 
$client
;


 12 


 13 
  
/** @test */


 14 
  
public
 
function
 
asUserIWantToAddTaskToAToDoList
()
:
 
void


 15 
  
{


 16 
      
$response
 
=
 
$this
->
whenWeRequestToCreateATaskWithDescription
(
'Write a test that f\


 17 
ails'
);


 18 


 19 
      
$this
->
thenResponseShouldBeSuccesful
(
$response
);


 20 


 21 
      
$this
->
thenTheTaskIsStored
();


 22 
  
}


 23 


 24 
  
/** @test */


 25 
  
public
 
function
 
asUserIWantToSeeTheTasksInMyTodoList
()
:
 
void


 26 
  
{


 27 
      
$expectedList
 
=
 
[


 28 
          
'[ ] 1. Write a test tha fails'
,


 29 
          
'[ ] 2. Write code to make the test pass'


 30 
      
];


 31 
      

 32 
      
$this
->
apiCreateTaskWithDescription
(
'Write a test tha fails'
);


 33 
      
$this
->
apiCreateTaskWithDescription
(
'Write code to make the test pass'
);


 34 
      

 35 
      
$this
->
client
->
request
(


 36 
          
'GET'
,


 37 
          
'/api/todo'


 38 
      
);


 39 


 40 
      
$response
 
=
  
$this
->
client
->
getResponse
();


 41 
      

 42 
      
self
::
assertEquals
(
Response
::
HTTP_OK
,
 
$response
->
getStatusCode
());


 43 
      

 44 
      
$taskList
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


 45 
      

 46 
      
self
::
assertEquals
(
$expectedList
,
 
$taskList
);


 47 
  
}


 48 


 49 
  
protected
 
function
 
setUp
()
:
 
void


 50 
  
{


 51 
      
$this
->
resetRepositoryData
();


 52 


 53 
      
$this
->
client
 
=
 
self
::
createClient
();


 54 
  
}


 55 


 56 
  
protected
 
function
 
tearDown
()
:
 
void


 57 
  
{


 58 
      
$this
->
resetRepositoryData
();


 59 
  
}


 60 


 61 
  
private
 
function
 
resetRepositoryData
()
:
 
void


 62 
  
{


 63 
      
if
 
(
file_exists
(
'repository.data'
))
 
{


 64 
          
unlink
(
'repository.data'
);


 65 
      
}


 66 
  
}


 67 


 68 
  
private
 
function
 
whenWeRequestToCreateATaskWithDescription
(
string
 
$taskDescription
)
:
 
\


 69 
Response


 70 
  
{


 71 
      
return
 
$this
->
apiCreateTaskWithDescription
(
$taskDescription
);


 72 
  
}


 73 


 74 
  
private
 
function
 
thenResponseShouldBeSuccesful
(
Response
 
$response
)
:
 
void


 75 
  
{


 76 
      
self
::
assertEquals
(
Response
::
HTTP_CREATED
,
 
$response
->
getStatusCode
());


 77 
  
}


 78 


 79 
  
private
 
function
 
thenTheTaskIsStored
()
:
 
void


 80 
  
{


 81 
      
$storage
 
=
 
new
 
FileStorageEngine
(
'repository.data'
);


 82 
      
$tasks
 
=
 
$storage
->
loadObjects
(
Task
::
class
);


 83 


 84 
      
self
::
assertCount
(
1
,
 
$tasks
);


 85 
      
self
::
assertEquals
(
1
,
 
$tasks
[
1
]
->
id
());


 86 
  
}


 87 


 88 
  
private
 
function
 
apiCreateTaskWithDescription
(
string
 
$taskDescription
)
:
 
Response


 89 
  
{


 90 
      
$this
->
client
->
request
(


 91 
          
'POST'
,


 92 
          
'/api/todo'
,


 93 
          
[],


 94 
          
[],


 95 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


 96 
          
json_encode
([
'task'
 
=>
 
$taskDescription
],
 
JSON_THROW_ON_ERROR
)


 97 
      
);


 98 


 99 
      
return
 
$this
->
client
->
getResponse
();


100 
  
}


101 
}

```

Así que lo ejecutamos y, como antes, nos vamos fijando en los errores que lanza para arreglarlos hasta que el test falle por las razones correctas. En este caso podemos ver dos errores relacionados.

El primero es que no hay una ruta adecuada para el  *endpoint* .

```

1 
"No route found for "GET /api/todo": Method Not Allowed (Allow: POST)"
```

Lo que, por supuesto, causa el error en el test al verificar el código de estado:

```

1 
Failed asserting that 405 matches expected 200.
```

Configuramos la ruta en  **routes.yaml** :

```

1 
api_add_task
:


2 
  
path
:
 
/api/todo


3 
  
controller
:
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController::addTask


4 
  
methods
:
 
[
'POST'
]

```

Lanzamos el test. El error es diferente, lo que indica que hemos hecho el cambio correctamente, pero ahora nos hace falta el controlador específico:

```

1 
"The controller for URI "/api/todo" is not callable. Expected method "getTaskList" on cla\

2 
ss "App\TodoList\Infrastructure\EntryPoint\Api\TodoListController"
```

Así que añadimos nuestra implementación *vacía* inicial:

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 


 4 
use
 
App\TodoList\Application\AddTaskHandler
;


 5 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 6 
use
 
Symfony\Component\HttpFoundation\Request
;


 7 
use
 
Symfony\Component\HttpFoundation\Response
;


 8 


 9 
class
 
TodoListController


10 
{


11 
  
/** @var AddTaskHandler */


12 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


13 


14 
  
public
 
function
 
__construct
(
AddTaskHandler
 
$addTaskHandler
)


15 
  
{


16 
      
$this
->
addTaskHandler
 
=
 
$addTaskHandler
;


17 
  
}


18 


19 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


20 
  
{


21 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


22 


23 
      
$this
->
addTaskHandler
->
execute
(
$payload
[
'task'
]);


24 


25 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


26 
  
}


27 


28 
  
public
 
function
 
getTaskList
()
:
 
Response


29 
  
{


30 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s'
,
 
__METHOD__
));


31 
  
}


32 


33 
  
private
 
function
 
obtainPayload
(
Request
 
$request
)
:
 
array


34 
  
{


35 
      
return
 
json_decode
(
$request
->
getContent
(),
 
true
,
 
512
,
 
JSON_THROW_ON_ERROR
);


36 
  
}


37 
}

```

Al volver a lanzar el test, se lanza la excepción que nos indica que necesitamos implementar algo. Es el momento de volver al test unitario de `TodoListController`. Es importante aprender a identificar cuando tenemos que movernos entre el ciclo del test de aceptación y el ciclo de tests unitarios.

El nuevo test nos ayuda a introducir el nuevo caso de uso `GetTaskListHandler`, pero también nos plantea un problema interesante: ¿qué debería devolver `GetTaskListHandler`, objetos `Task` o una representación de estos?

En este caso, lo más correcto sería utilizar algún tipo de `DataTransformer` y aplicar un patrón `Strategy` de modo que `TodoListController` le indique al caso de uso qué `DataTransformer` quiere usar. Este *transformer* se puede pasar como dependencia al controlador y este se lo enviará al caso de uso como parámetro.

Como puedes ver. ahora estamos literalmente diseñando. Así que vamos a ver cómo queda el test.

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Application\AddTaskHandler
;


 4 
use
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController
;


 5 
use
 
PHPUnit\Framework\TestCase
;


 6 
use
 
Symfony\Component\HttpFoundation\Request
;


 7 


 8 
class
 
TodoListControllerTest
 
extends
 
TestCase


 9 
{


10 
  
private
 
const
 
TASK_DESCRIPTION
 
=
 
'Task Description'
;


11 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


12 
  
private
 
TodoListController
 
$todoListController
;


13 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


14 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


15 


16 
  
protected
 
function
 
setUp
()
:
 
void


17 
  
{


18 
      
$this
->
addTaskHandler
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


19 
      
$this
->
getTaskListHandler
 
=
 
$this
->
createMock
(
GetTaskListHandler
::
class
);


20 
      
$this
->
taskListTransformer
 
=
 
$this
->
createMock
(
TaskListTransformer
::
class
);


21 
      
$this
->
todoListController
 
=
 
new
 
TodoListController
(


22 
          
$this
->
addTaskHandler
,


23 
          
$this
->
getTaskListHandler
,


24 
          
$this
->
taskListTransformer


25 
      
);


26 
  
}


27 


28 
  
/** @test */


29 
  
public
 
function
 
shouldAddTask
()
:
 
void


30 
  
{


31 
      
$this
->
addTaskHandler


32 
          
->
expects
(
self
::
once
())


33 
          
->
method
(
'execute'
)


34 
          
->
with
(
self
::
TASK_DESCRIPTION
);


35 


36 
      
$request
 
=
 
new
 
Request
(


37 
          
[],


38 
          
[],


39 
          
[],


40 
          
[],


41 
          
[],


42 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


43 
          
json_encode
([
'task'
 
=>
 
self
::
TASK_DESCRIPTION
],
 
JSON_THROW_ON_ERROR
)


44 
      
);


45 


46 
      
$response
 
=
 
$this
->
todoListController
->
addTask
(
$request
);


47 


48 
      
self
::
assertEquals
(
201
,
 
$response
->
getStatusCode
());


49 
  
}


50 


51 
  
/** @test */


52 
  
public
 
function
 
shouldGetTaskList
()
:
 
void


53 
  
{


54 
      
$expectedList
 
=
 
[


55 
          
'[ ] 1. Task Description'
,


56 
          
'[ ] 2. Task Description'
,


57 
      
];


58 
      
$this
->
getTaskListHandler


59 
          
->
expects
(
self
::
once
())


60 
          
->
method
(
'execute'
)


61 
          
->
with
(
$this
->
taskListTransformer
)


62 
          
->
willReturn
(
$expectedList
);


63 


64 
      
$response
 
=
 
$this
->
todoListController
->
getTaskList
(
new
 
Request
());


65 


66 
      
self
::
assertEquals
(
200
,
 
$response
->
getStatusCode
());


67 


68 
      
$list
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


69 


70 
      
self
::
assertEquals
(
$expectedList
,
 
$list
);


71 
  
}


72 
}

```

En este punto, sólo necesitamos `TaskListTransformer` para que el controlador lo pase al caso de uso. Si lanzamos el test, fallará porque no tenemos aún definida la clase `GetTaskListHandler`. Introducimos una implementación inicial.

```

1 
class
 
GetTaskListHandler


2 
{


3 
  

4 
}

```

Lanzando el test de nuevo, vemos que ahora nos pide `TaskListTransformer`. Primero movemos `GetTaskListHandler` a su lugar en `App\TodoList\Application`. Luego creamos `TaskListTransformer`.

```

1 
class
 
TaskListTransformer


2 
{


3 
  

4 
}

```

Comprobamos de nuevo el resultado del test, que ahora nos dice que nos falta un método execute en `GetTaskListHandler`. Igual que hicimos antes, movemos primero la clase `TaskListTransformer` a su lugar.

En principio yo lo introduciría en `App\TodoList\Infrastructure\EntryPoint\Api` puesto que la razón de ser del transformer es preparar una respuesta específica para el API. Pero eso sería para la implementación concreta que vayamos a usar. Si lo hacemos así tendremos una dependencia mal orientada, pues estaría apuntando de Aplicación a Infraestructura. Para invertirla, tendremos que poner `TaskListTransformer` en la capa de aplicación como interface. Su lugar sería: `App\TodoList\Application\TaskListTransformer`.

Una vez recolocado nos ocupamos de añadir el método execute en `GetTaskListHandler`.

```

1 
namespace
 
App\TodoList\Application
;


2 


3 
class
 
GetTaskListHandler


4 
{


5 
  
public
 
function
 
execute
(
TaskListTransformer
 
$taskListTransformer
)
:
 
array


6 
  
{


7 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s'
,
 
__METHOD__
));


8 
  
}


9 
}

```

Con este añadido, al ejecutar el test conseguimos que falle porque vemos que ha saltado la excepción que nos pide implementar `getTaskList` en el controlador:

```

1 
RuntimeException
 
:
 
Implement
 
App
\
TodoList
\
Infrastructure
\
EntryPoint
\
Api
\
TodoListControlle
\


2 
r
::
getTaskList

```

Y podemos implementar lo necesario para que pase el test:

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 


 4 
use
 
App\TodoList\Application\AddTaskHandler
;


 5 
use
 
App\TodoList\Application\GetTaskListHandler
;


 6 
use
 
App\TodoList\Application\TaskListTransformer
;


 7 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 8 
use
 
Symfony\Component\HttpFoundation\Request
;


 9 
use
 
Symfony\Component\HttpFoundation\Response
;


10 


11 
class
 
TodoListController


12 
{


13 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


14 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


15 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


16 


17 
  
public
 
function
 
__construct
(


18 
      
AddTaskHandler
 
$addTaskHandler
,


19 
      
GetTaskListHandler
 
$getTaskListHandler
,


20 
      
TaskListTransformer
 
$taskListTransformer


21 
  
)
 
{


22 
      
$this
->
addTaskHandler
 
=
 
$addTaskHandler
;


23 
      
$this
->
getTaskListHandler
 
=
 
$getTaskListHandler
;


24 
      
$this
->
taskListTransformer
 
=
 
$taskListTransformer
;


25 
  
}


26 


27 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


28 
  
{


29 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


30 


31 
      
$this
->
addTaskHandler
->
execute
(
$payload
[
'task'
]);


32 


33 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


34 
  
}


35 


36 
  
public
 
function
 
getTaskList
(
Request
 
$request
)
:
 
Response


37 
  
{


38 
      
$taskList
 
=
 
$this
->
getTaskListHandler
->
execute
(
$this
->
taskListTransformer
);


39 


40 
      
return
 
new
 
JsonResponse
(
$taskList
,
 
Response
::
HTTP_OK
);


41 
  
}


42 


43 
  
private
 
function
 
obtainPayload
(
Request
 
$request
)
:
 
array


44 
  
{


45 
      
return
 
json_decode
(
$request
->
getContent
(),
 
true
,
 
512
,
 
JSON_THROW_ON_ERROR
);


46 
  
}


47 
}

```

Se puede observar que el controlador tiene muchas dependencias. Esto se puede solucionar con un bus de comandos o dividiendo la clase en otras más pequeñas, pero no lo vamos a hacer en este ejercicio para no perder el foco.

En cualquier caso, el test pasa, lo que nos indica que es el momento de moverse de nuevo al ciclo del test de aceptación.

Este seguirá fallando, como cabría esperar:

```

1 
PHP Exception RuntimeException: "Implement App\TodoList\Application\GetTaskListHandler::e\

2 
xecute" 
```

Fallo que nos dice que el siguiente paso es desarrollar con un test unitario el caso de uso `GetTaskListHandler`.

```

 1 
namespace
 
App\Tests\TodoList\Application
;


 2 


 3 
use
 
App\TodoList\Application\GetTaskListHandler
;


 4 
use
 
App\TodoList\Application\TaskListTransformer
;


 5 
use
 
App\TodoList\Domain\Task
;


 6 
use
 
App\TodoList\Domain\TaskRepository
;


 7 
use
 
PHPUnit\Framework\TestCase
;


 8 


 9 
class
 
GetTaskListHandlerTest
 
extends
 
TestCase


10 
{


11 
  
/** @test */


12 
  
public
 
function
 
shouldGetExistingTasks
()
:
 
void


13 
  
{


14 
      
$expectedList
 
=
 
[


15 
          
'[ ] 1. Write a test that fails'
,


16 
          
'[ ] 2. Write code to make the test pass'
,


17 
      
];


18 


19 
      
$taskList
 
=
 
[


20 
          
new
 
Task
(
1
,
 
'Write a test that fails'
),


21 
          
new
 
Task
(
2
,
 
'Write code to make the test pass'
),


22 
      
];


23 


24 
      
$tasksRepository
 
=
 
$this
->
createMock
(
TaskRepository
::
class
);


25 
      
$tasksRepository


26 
          
->
method
(
'findAll'
)


27 
          
->
willReturn
(
$taskList
);


28 


29 
      
$taskListTransformer
 
=
 
$this
->
createMock
(
TaskListTransformer
::
class
);


30 
      
$taskListTransformer


31 
          
->
expects
(
self
::
once
())


32 
          
->
method
(
'transform'
)


33 
          
->
with
(
$taskList
)


34 
          
->
willReturn
(
$expectedList
);


35 


36 
      
$getTaskListHandler
 
=
 
new
 
GetTaskListHandler
(
$tasksRepository
);


37 
      
$list
 
=
 
$getTaskListHandler
->
execute
(
$taskListTransformer
);


38 


39 
      
self
::
assertEquals
(
$expectedList
,
 
$list
);


40 
  
}


41 
}

```

Al lanzar este test, nos pide añadir el método `findAll` en el repositorio.

```

1 
Trying to configure method "findAll" which cannot be configured because it does not exist\

2 
, has not been specified, is final, or is static
```

Esto lo hacemos en la interfaz y en la implementación concreta:

```

 1 
namespace
 
App\TodoList\Domain
;


 2 


 3 
interface
 
TaskRepository


 4 
{


 5 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void
;


 6 


 7 
  
public
 
function
 
nextIdentity
()
:
 
int
;


 8 


 9 
  
public
 
function
 
findAll
()
:
 
array
;


10 
}

```

```

 1 
namespace
 
App\TodoList\Infrastructure\Persistence
;


 2 


 3 


 4 
use
 
App\Lib\FileStorageEngine
;


 5 
use
 
App\TodoList\Domain\Task
;


 6 
use
 
App\TodoList\Domain\TaskRepository
;


 7 


 8 
class
 
FileTaskRepository
 
implements
 
TaskRepository


 9 
{


10 


11 
  
/** @var FileStorageEngine */


12 
  
private
 
FileStorageEngine
 
$fileStorageEngine
;


13 


14 
  
public
 
function
 
__construct
(
FileStorageEngine
 
$fileStorageEngine
)


15 
  
{


16 
      
$this
->
fileStorageEngine
 
=
 
$fileStorageEngine
;


17 
  
}


18 


19 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void


20 
  
{


21 
     
$tasks
 
=
 
$this
->
fileStorageEngine
->
loadObjects
(
Task
::
class
);


22 


23 
     
$tasks
[
$task
->
id
()]
 
=
 
$task
;


24 


25 
     
$this
->
fileStorageEngine
->
persistObjects
(
$tasks
);


26 
  
}


27 


28 
  
public
 
function
 
nextIdentity
()
:
 
int


29 
  
{


30 
      
$tasks
 
=
 
$this
->
fileStorageEngine
->
loadObjects
(
Task
::
class
);


31 


32 
      
return
 
count
(
$tasks
)
 
+
 
1
;


33 
  
}


34 


35 
  
public
 
function
 
findAll
()
:
 
array


36 
  
{


37 
      
throw
 
new
 
\RuntimeException
(
'Implement findAll() method.'
);


38 
  
}


39 
}

```

Y lo mismo para el método `transform` en `TaskListTransformer`:

```

1 
Trying to configure method "transform" which cannot be configured because it does not exi\

2 
st, 

3 
has not been specified, is final, or is static
```

El cual quedará así, una vez redefinido como interfaz:

```

1 
namespace
 
App\TodoList\Application
;


2 


3 
interface
 
TaskListTransformer


4 
{


5 
  
public
 
function
 
transform
(
array
 
$taskList
)
:
 
array
;


6 
}

```

Con estos cambios, el test ahora fallará para decirnos que necesitamos implementar el método execute del caso de uso, que es justo donde queríamos estar:

```

1 
RuntimeException
 
:
 
Implement
 
App
\
TodoList
\
Application
\
GetTaskListHandler
::
execute

```

Y he aquí la implementación que hace pasar el test.

```

 1 
namespace
 
App\TodoList\Application
;


 2 


 3 
use
 
App\TodoList\Domain\TaskRepository
;


 4 
use
 
App\TodoList\Application\TaskListTransformer
;


 5 


 6 
class
 
GetTaskListHandler


 7 
{


 8 
  
/** @var TaskRepository */


 9 
  
private
 
TaskRepository
 
$taskRepository
;


10 


11 
  
public
 
function
 
__construct
(
TaskRepository
 
$taskRepository
)


12 
  
{


13 
      
$this
->
taskRepository
 
=
 
$taskRepository
;


14 
  
}


15 


16 
  
public
 
function
 
execute
(
TaskListTransformer
 
$taskListTransformer
)
:
 
array


17 
  
{


18 
      
$tasks
 
=
 
$this
->
taskRepository
->
findAll
();


19 


20 
      
return
 
$taskListTransformer
->
transform
(
$tasks
);


21 
  
}


22 
}

```

Ahora que hemos vuelto a verde, regresaremos al ciclo de aceptación. Al lanzar el test el resultado es un mensaje de error nuevo, que nos pide implementar `findAll` en `FileTaskRepository`.

```

1 
RuntimeException: "Implement findAll() method."
```

Esto requiere un test unitario.

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\Persistence
;


 2 


 3 
use
 
App\Lib\FileStorageEngine
;


 4 
use
 
App\TodoList\Domain\Task
;


 5 
use
 
App\TodoList\Domain\TaskRepository
;


 6 
use
 
App\TodoList\Infrastructure\Persistence\FileTaskRepository
;


 7 
use
 
PHPUnit\Framework\TestCase
;


 8 


 9 
class
 
FileTaskRepositoryTest
 
extends
 
TestCase


10 
{


11 
  
private
 
FileStorageEngine
 
$fileStorageEngine
;


12 
  
private
 
TaskRepository
 
$taskRepository
;


13 


14 
  
public
 
function
 
setUp
()
:
 
void


15 
  
{


16 
      
$this
->
fileStorageEngine
 
=
 
$this
->
createMock
(
FileStorageEngine
::
class
);


17 
      
$this
->
taskRepository
 
=
 
new
 
FileTaskRepository
(
$this
->
fileStorageEngine
);


18 
  
}


19 


20 
  
/** @test */


21 
  
public
 
function
 
shouldProvideNextIdentityCountingExistingObjects
()
:
 
void


22 
  
{


23 
      
$this
->
fileStorageEngine


24 
          
->
method
(
'loadObjects'
)


25 
          
->
willReturn
(


26 
              
[],


27 
              
[
'Task'
],


28 
              
[
'Task'
,
 
'Task'
]


29 
          
);


30 


31 
      
self
::
assertEquals
(
1
,
 
$this
->
taskRepository
->
nextIdentity
());


32 
      
self
::
assertEquals
(
2
,
 
$this
->
taskRepository
->
nextIdentity
());


33 
      
self
::
assertEquals
(
3
,
 
$this
->
taskRepository
->
nextIdentity
());


34 
  
}


35 


36 
  
/** @test */


37 
  
public
 
function
 
shouldStoreATask
()
:
 
void


38 
  
{


39 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


40 


41 
      
$this
->
fileStorageEngine


42 
          
->
method
(
'loadObjects'
)


43 
          
->
willReturn
([]);


44 
      
$this
->
fileStorageEngine


45 
          
->
expects
(
self
::
once
())


46 
          
->
method
(
'persistObjects'
)


47 
          
->
with
([
1
 
=>
 
$task
]);


48 


49 
      
$this
->
taskRepository
->
store
(
$task
);


50 
  
}


51 


52 
  
/** @test */


53 
  
public
 
function
 
shouldGetStoredTasks
()
:
 
void


54 
  
{


55 
      
$storedTasks
 
=
 
[


56 
          
1
 
=>
 
new
 
Task
(
1
,
 
'Write a test that fails'
),


57 
          
2
 
=>
 
new
 
Task
(
2
,
 
'Write code to make the test pass'
),


58 
      
];


59 


60 
      
$this
->
fileStorageEngine


61 
          
->
method
(
'loadObjects'
)


62 
          
->
willReturn
(


63 
              
$storedTasks


64 
          
);


65 


66 
      
self
::
assertEquals
(
$storedTasks
,
 
$this
->
taskRepository
->
findAll
());


67 
  
}


68 
}

```

Al ejecutarlo, nos pedirá:

```

1 
RuntimeException
 
:
 
Implement
 
findAll
()
 
method
.

```

Así que vamos a ello:

```

 1 
namespace
 
App\TodoList\Infrastructure\Persistence
;


 2 


 3 


 4 
use
 
App\Lib\FileStorageEngine
;


 5 
use
 
App\TodoList\Domain\Task
;


 6 
use
 
App\TodoList\Domain\TaskRepository
;


 7 


 8 
class
 
FileTaskRepository
 
implements
 
TaskRepository


 9 
{


10 


11 
  
/** @var FileStorageEngine */


12 
  
private
 
FileStorageEngine
 
$fileStorageEngine
;


13 


14 
  
public
 
function
 
__construct
(
FileStorageEngine
 
$fileStorageEngine
)


15 
  
{


16 
      
$this
->
fileStorageEngine
 
=
 
$fileStorageEngine
;


17 
  
}


18 


19 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void


20 
  
{


21 
     
$tasks
 
=
 
$this
->
fileStorageEngine
->
loadObjects
(
Task
::
class
);


22 


23 
     
$tasks
[
$task
->
id
()]
 
=
 
$task
;


24 


25 
     
$this
->
fileStorageEngine
->
persistObjects
(
$tasks
);


26 
  
}


27 


28 
  
public
 
function
 
nextIdentity
()
:
 
int


29 
  
{


30 
      
$tasks
 
=
 
$this
->
fileStorageEngine
->
loadObjects
(
Task
::
class
);


31 


32 
      
return
 
count
(
$tasks
)
 
+
 
1
;


33 
  
}


34 


35 
  
public
 
function
 
findAll
()
:
 
array


36 
  
{


37 
      
return
 
$this
->
fileStorageEngine
->
loadObjects
(
Task
::
class
);


38 
  
}


39 
}

```

Ahora el test unitario pasa, con lo cual tenemos implementado buena parte del repositorio. ¿Será suficiente para hacer pasar el test de aceptación?

No, todavía tenemos cosas pendientes. En este momento se nos reclama introducir una implementación concreta de `TaskListTransformer`.

Ahora nos toca introducir un nuevo test unitario para desarrollar el *Transformer* concreto, que ubicaremos en `App\TodoList\Infrastructure\EntryPoint\Api`, ya que es el controlador quien está interesado en usarlo. Lo denominaremos `StringTaskListTransformer` ya que convierte a `Task` en una representación en forma de `string`.

Este nos va a suponer un pequeño reto de diseño. No disponemos todavía de formas de acceder a las propiedades de `Task`, una entidad que tampoco hemos tenido que desarrollar más hasta ahora, y lo cierto es que no deberíamos condicionar su implementación a este tipo de necesidades. En un sistema más real y sofisticado podríamos aplicar un patrón *Visitor* o similar. En este caso, lo que haremos será pasar una plantilla a `Task` para que nos la devuelva cubierta con sus datos.

Como `Task` es una entidad prefiero no  *mockearla* , así que el test quedará de esta forma:

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Domain\Task
;


 4 
use
 
App\TodoList\Infrastructure\EntryPoint\Api\StringTaskListTransformer
;


 5 
use
 
PHPUnit\Framework\TestCase
;


 6 


 7 
class
 
StringTaskListTransformerTest
 
extends
 
TestCase


 8 
{


 9 
  
/** @test


10 
     * @dataProvider examplesProvider


11 
     */


12 
  
public
 
function
 
shouldTransformList
(
$tasksList
,
 
$expected
)
:
 
void


13 
  
{


14 
      
$taskListTransformer
 
=
 
new
 
StringTaskListTransformer
();


15 


16 
      
$result
 
=
 
$taskListTransformer
->
transform
(
$tasksList
);


17 


18 
      
self
::
assertEquals
(
$expected
,
 
$result
);


19 
  
}


20 


21 
  
public
 
function
 
examplesProvider
()
:
 
array


22 
  
{


23 
      
return
 
[


24 
        
[[],
 
[]],


25 
        
[[
new
 
Task
(
1
,
 
'Task Description'
)],
 
[
'[ ] 1. Task Description'
]]


26 
      
];


27 
  
}


28 
}

```

Y el código de producción podría ser este:

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Application\TaskListTransformer
;


 4 


 5 
class
 
StringTaskListTransformer
 
implements
 
TaskListTransformer


 6 
{


 7 
  
public
 
function
 
transform
(
array
 
$taskList
)
:
 
array


 8 
  
{


 9 
      
$transformed
 
=
 
[];


10 


11 
      
foreach
 
(
$taskList
 
as
 
$task
)
 
{


12 
          
$transformed
[]
 
=
 
$task
->
representedAs
(
'[:check] :id. :description'
);


13 
      
}


14 


15 
      
return
 
$transformed
;


16 
  
}


17 
}

```

El test lanzará un error para decirnos que no está implementado el método `representedAs` en `Task`, por lo que podemos añadirlo.

```

 1 
namespace
 
App\TodoList\Domain
;


 2 


 3 
class
 
Task


 4 
{


 5 
  
private
 
int
 
$id
;


 6 
  
private
 
string
 
$description
;


 7 


 8 
  
public
 
function
 
__construct
(
int
 
$id
,
 
string
 
$description
)


 9 
  
{


10 
      
$this
->
id
 
=
 
$id
;


11 
      
$this
->
description
 
=
 
$description
;


12 
  
}


13 


14 
  
public
 
function
 
id
()
:
 
int


15 
  
{


16 
      
return
 
$this
->
id
;


17 
  
}


18 


19 
  
public
 
function
 
representedAs
()
:
 
string


20 
  
{


21 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s'
,
 
__METHOD__
));


22 
  
}


23 
}

```

Salvando las distancias, podemos usar el test actual como test de aceptación. Si lo ejecutamos veremos que se lanza la excepción:

```

1 
RuntimeException
 
:
 
Implement
 
App
\
TodoList
\
Domain
\
Task
::
representedAs

```

Lo que nos indicaría la necesidad de pasar al siguiente nivel y crear un test unitario para desarrollar `Task`, o al menos el método `representedAs`. Otra opción, sería desarrollar `Task` bajo la cobertura del test actual, pero no es muy buena idea ya que el test podría requerir de ejemplos que no aportan nada realmente al test y que son relevantes sólo para `task`.

```

 1 
namespace
 
App\Tests\TodoList\Domain
;


 2 


 3 
use
 
App\TodoList\Domain\Task
;


 4 
use
 
PHPUnit\Framework\TestCase
;


 5 


 6 
class
 
TaskTest
 
extends
 
TestCase


 7 
{


 8 
  
/** @test */


 9 
  
public
 
function
 
shouldProvideRepresentation
()
:
 
void


10 
  
{


11 
      
$expected
 
=
 
'[ ] 1. Task Description'
;


12 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


13 
      

14 
      
$representation
 
=
 
$task
->
representedAs
(
'[:check] :id. :description'
);


15 
      

16 
      
self
::
assertEquals
(
$expected
,
 
$representation
);


17 
  
}


18 
}

```

Por el momento esta implementación ya nos iría bien.

```

 1 
namespace
 
App\TodoList\Domain
;


 2 


 3 
class
 
Task


 4 
{


 5 
  
private
 
int
 
$id
;


 6 
  
private
 
string
 
$description
;


 7 


 8 
  
public
 
function
 
__construct
(
int
 
$id
,
 
string
 
$description
)


 9 
  
{


10 
      
$this
->
id
 
=
 
$id
;


11 
      
$this
->
description
 
=
 
$description
;


12 
  
}


13 


14 
  
public
 
function
 
id
()
:
 
int


15 
  
{


16 
      
return
 
$this
->
id
;


17 
  
}


18 


19 
  
public
 
function
 
representedAs
(
string
 
$format
)
:
 
string


20 
  
{


21 
      
$values
 
=
 
[


22 
          
':check'
 
=>
 
' '
,


23 
          
':id'
 
=>
 
$this
->
id
,


24 
          
':description'
 
=>
 
$this
->
description


25 
      
];


26 
      
return
 
strtr
(
$format
,
 
$values
);


27 


28 
  
}


29 
}

```

Así que podríamos subir un nivel y volver al test anterior del  *Transformer* , que pasa sin más problemas.

Con este test en verde, regresamos al nivel de aceptación, que también pasa, indicando que hemos terminado de desarrollar esta historia de usuario.

## Marcar tareas completadas

### US-3

* As a User
* I want to check a task when it is done
* So that, I can see my progress

La tercera historia de usuario se construye fácilmente a partir de las dos anteriores, ya que nuestra aplicación ya permite introducir tareas y ver la lista. Por eso, antes de empezar con el desarrollo refactorizaremos el test de aceptación para que sea más sencillo extenderlo. De hecho, hasta podemos reutilizar algunas partes. Este es el resultado, ya con el nuevo test de aceptación.

```

  1 
namespace
 
App\Tests\Katas\TodoList
;


  2 


  3 
use
 
App\Lib\FileStorageEngine
;


  4 
use
 
App\TodoList\Domain\Task
;


  5 
use
 
Symfony\Bundle\FrameworkBundle\Client
;


  6 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


  7 
use
 
Symfony\Component\HttpFoundation\Response
;


  8 


  9 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


 10 
{


 11 
  
private
 
Client
 
$client
;


 12 


 13 
  
/** @test */


 14 
  
public
 
function
 
asUserIWantToAddTaskToAToDoList
()
:
 
void


 15 
  
{


 16 
      
$response
 
=
 
$this
->
whenWeRequestToCreateATaskWithDescription
(
'Write a test that f\


 17 
ails'
);


 18 


 19 
      
$this
->
thenResponseShouldBeSuccesful
(
$response
);


 20 


 21 
      
$this
->
thenTheTaskIsStored
();


 22 
  
}


 23 


 24 
  
/** @test */


 25 
  
public
 
function
 
asUserIWantToSeeTheTasksInMyTodoList
()
:
 
void


 26 
  
{


 27 
      
$this
->
givenIHaveAddedTasks
();


 28 


 29 
      
$response
 
=
 
$this
->
whenIRequestTheListOfTasks
();


 30 


 31 
      
$this
->
thenICanSeeAddedTasksInTheList
(


 32 
          
[


 33 
              
'[ ] 1. Write a test tha fails'
,


 34 
              
'[ ] 2. Write code to make the test pass'


 35 
          
],


 36 
          
$response


 37 
      
);


 38 
  
}


 39 


 40 
  
/** @test */


 41 
  
public
 
function
 
asUserIWantToMarkTasksAsCompleted
()
:
 
void


 42 
  
{


 43 
      
$this
->
givenIHaveAddedTasks
();


 44 
      

 45 
      
$this
->
client
->
request
(


 46 
          
'PATCH'
,


 47 
          
'/api/todo/1'
,


 48 
          
[],


 49 
          
[],


 50 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


 51 
          
json_encode
([
'completed'
 
=>
 
true
],
 
JSON_THROW_ON_ERROR
)


 52 


 53 
      
);


 54 
      

 55 
      
$patchResponse
 
=
 
$this
->
client
->
getResponse
();


 56 


 57 
      
self
::
assertEquals
(
Response
::
HTTP_OK
,
 
$patchResponse
->
getStatusCode
());


 58 
              

 59 
      
$response
 
=
 
$this
->
whenIRequestTheListOfTasks
();


 60 


 61 
      
$this
->
thenICanSeeAddedTasksInTheList
(


 62 
          
[


 63 
              
'[√] 1. Write a test tha fails'
,


 64 
              
'[ ] 2. Write code to make the test pass'


 65 
          
],


 66 
          
$response


 67 
      
);


 68 
  
}


 69 


 70 
  
protected
 
function
 
setUp
()
:
 
void


 71 
  
{


 72 
      
$this
->
resetRepositoryData
();


 73 


 74 
      
$this
->
client
 
=
 
self
::
createClient
();


 75 
  
}


 76 


 77 
  
protected
 
function
 
tearDown
()
:
 
void


 78 
  
{


 79 
      
$this
->
resetRepositoryData
();


 80 
  
}


 81 


 82 
  
private
 
function
 
resetRepositoryData
()
:
 
void


 83 
  
{


 84 
      
if
 
(
file_exists
(
'repository.data'
))
 
{


 85 
          
unlink
(
'repository.data'
);


 86 
      
}


 87 
  
}


 88 


 89 
  
private
 
function
 
whenWeRequestToCreateATaskWithDescription
(
string
 
$taskDescription
)
:
 
\


 90 
Response


 91 
  
{


 92 
      
return
 
$this
->
apiCreateTaskWithDescription
(
$taskDescription
);


 93 
  
}


 94 


 95 
  
private
 
function
 
thenResponseShouldBeSuccesful
(
Response
 
$response
)
:
 
void


 96 
  
{


 97 
      
self
::
assertEquals
(
Response
::
HTTP_CREATED
,
 
$response
->
getStatusCode
());


 98 
  
}


 99 


100 
  
private
 
function
 
thenTheTaskIsStored
()
:
 
void


101 
  
{


102 
      
$storage
 
=
 
new
 
FileStorageEngine
(
'repository.data'
);


103 
      
$tasks
 
=
 
$storage
->
loadObjects
(
Task
::
class
);


104 


105 
      
self
::
assertCount
(
1
,
 
$tasks
);


106 
      
self
::
assertEquals
(
1
,
 
$tasks
[
1
]
->
id
());


107 
  
}


108 


109 
  
private
 
function
 
apiCreateTaskWithDescription
(
string
 
$taskDescription
)
:
 
Response


110 
  
{


111 
      
$this
->
client
->
request
(


112 
          
'POST'
,


113 
          
'/api/todo'
,


114 
          
[],


115 
          
[],


116 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


117 
          
json_encode
([
'task'
 
=>
 
$taskDescription
],
 
JSON_THROW_ON_ERROR
)


118 
      
);


119 


120 
      
return
 
$this
->
client
->
getResponse
();


121 
  
}


122 


123 
  
private
 
function
 
whenIRequestTheListOfTasks
()
:
 
Response


124 
  
{


125 
      
$response
 
=
 
$this
->
apiGetTasksList
();


126 


127 
      
self
::
assertEquals
(
Response
::
HTTP_OK
,
 
$response
->
getStatusCode
());


128 
      
return
 
$response
;


129 
  
}


130 


131 
  
private
 
function
 
apiGetTasksList
()
:
 
Response


132 
  
{


133 
      
$this
->
client
->
request
(


134 
          
'GET'
,


135 
          
'/api/todo'


136 
      
);


137 


138 
      
return
 
$this
->
client
->
getResponse
();


139 
  
}


140 


141 
  
private
 
function
 
givenIHaveAddedTasks
()
:
 
void


142 
  
{


143 
      
$this
->
apiCreateTaskWithDescription
(
'Write a test tha fails'
);


144 
      
$this
->
apiCreateTaskWithDescription
(
'Write code to make the test pass'
);


145 
  
}


146 


147 
  
private
 
function
 
thenICanSeeAddedTasksInTheList
(
array
 
$expectedTasks
,
 
Response
 
$respo\


148 
nse
)
:
 
void


149 
  
{


150 
      
$taskList
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


151 


152 
      
self
::
assertEquals
(


153 
          
$expectedTasks
,
 
$taskList
);


154 
  
}


155 
}

```

Al lanzar el test, y como era de esperar, falla porque no se encuentra la ruta al  *endpoint* :

```

1 
"No route found for "PATCH /api/todo/1"
```

Y, como hemos hecho antes, tendremos que definirla y crear un controlador que la gestione. En primer lugar, la definición de la ruta en  **routes.yaml** .

```

 1 
api_add_task
:


 2 
  
path
:
 
/api/todo


 3 
  
controller
:
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController::addTask


 4 
  
methods
:
 
[
'POST'
]


 5 


 6 
api_get_task_list
:


 7 
  
path
:
 
/api/todo


 8 
  
controller
:
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController::getTaskList


 9 
  
methods
:
 
[
'GET'
]


10 


11 
api_mark_task_completed
:


12 
  
path
:
 
/api/todo/{taskId}


13 
  
controller
:
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController::markTaskComp\


14 
leted


15 
  
methods
:
 
[
'PATCH'
]

```

Una nueva ejecución del test nos indica que falta un controlador:

```

1 
"The controller for URI "/api/todo/1" is not callable. Expected method "markTaskCompleted"
```

Y añadimos uno vacío:

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 


 4 
use
 
App\TodoList\Application\AddTaskHandler
;


 5 
use
 
App\TodoList\Application\GetTaskListHandler
;


 6 
use
 
App\TodoList\Application\TaskListTransformer
;


 7 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 8 
use
 
Symfony\Component\HttpFoundation\Request
;


 9 
use
 
Symfony\Component\HttpFoundation\Response
;


10 


11 
class
 
TodoListController


12 
{


13 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


14 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


15 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


16 


17 
  
public
 
function
 
__construct
(


18 
      
AddTaskHandler
 
$addTaskHandler
,


19 
      
GetTaskListHandler
 
$getTaskListHandler
,


20 
      
TaskListTransformer
 
$taskListTransformer


21 
  
)
 
{


22 
      
$this
->
addTaskHandler
 
=
 
$addTaskHandler
;


23 
      
$this
->
getTaskListHandler
 
=
 
$getTaskListHandler
;


24 
      
$this
->
taskListTransformer
 
=
 
$taskListTransformer
;


25 
  
}


26 


27 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


28 
  
{


29 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


30 


31 
      
$this
->
addTaskHandler
->
execute
(
$payload
[
'task'
]);


32 


33 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


34 
  
}


35 


36 
  
public
 
function
 
getTaskList
(
Request
 
$request
)
:
 
Response


37 
  
{


38 
      
$taskList
 
=
 
$this
->
getTaskListHandler
->
execute
(
$this
->
taskListTransformer
);


39 


40 
      
return
 
new
 
JsonResponse
(
$taskList
,
 
Response
::
HTTP_OK
);


41 
  
}


42 


43 
  
public
 
function
 
markTaskCompleted
(
int
 
$taskId
)
:
 
Response


44 
  
{


45 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s'
,
 
__METHOD__
));


46 
  
}


47 


48 
  
private
 
function
 
obtainPayload
(
Request
 
$request
)
:
 
array


49 
  
{


50 
      
return
 
json_decode
(
$request
->
getContent
(),
 
true
,
 
512
,
 
JSON_THROW_ON_ERROR
);


51 
  
}


52 
}

```

El error ahora es:

```

1 
RuntimeException: "Implement App\TodoList\Infrastructure\EntryPoint\Api\TodoListControlle\

2 
r::markTaskCompleted"
```

Y el test falla porque espera que ese *endpoint* esté funcionando como es debido y respondiendo, pero todavía está sin implementar. Por tanto, nos movemos al nivel unitario para definir la funcionalidad del controlador.

Como en los casos anteriores, implementar la funcionalidad require además del controlador un caso de uso y utilizar el repositorio para recuperar la tarea que se quiere marcar, y volver a guardarla. Por tanto, la clave del test será esperar que se ejecute el caso de uso con los parámetros adecuados.

Así que, el test quedaría más o menos así;

```

  1 
namespace
 
App\Tests\TodoList\Infrastructure\EntryPoint\Api
;


  2 


  3 
use
 
App\TodoList\Application\AddTaskHandler
;


  4 
use
 
App\TodoList\Application\GetTaskListHandler
;


  5 
use
 
App\TodoList\Application\TaskListTransformer
;


  6 
use
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController
;


  7 
use
 
PHPUnit\Framework\TestCase
;


  8 
use
 
Symfony\Component\HttpFoundation\Request
;


  9 


 10 
class
 
TodoListControllerTest
 
extends
 
TestCase


 11 
{


 12 
  
private
 
const
 
TASK_DESCRIPTION
 
=
 
'Task Description'
;


 13 
  
private
 
const
 
COMPLETED_TASK_ID
 
=
 
1
;


 14 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


 15 
  
private
 
TodoListController
 
$todoListController
;


 16 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


 17 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


 18 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


 19 


 20 
  
protected
 
function
 
setUp
()
:
 
void


 21 
  
{


 22 
      
$this
->
addTaskHandler
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


 23 
      
$this
->
getTaskListHandler
 
=
 
$this
->
createMock
(
GetTaskListHandler
::
class
);


 24 
      
$this
->
taskListTransformer
 
=
 
$this
->
createMock
(
TaskListTransformer
::
class
);


 25 
      
$this
->
markTaskCompletedHandler
 
=
 
$this
->
createMock
(
MarkTaskCompletedHandler
::
cla\


 26 
ss
);


 27 
      
$this
->
todoListController
 
=
 
new
 
TodoListController
(


 28 
          
$this
->
addTaskHandler
,


 29 
          
$this
->
getTaskListHandler
,


 30 
          
$this
->
taskListTransformer
,


 31 
          
$this
->
markTaskCompletedHandler


 32 
      
);


 33 
  
}


 34 


 35 


 36 
  
/** @test */


 37 
  
public
 
function
 
shouldAddTask
()
:
 
void


 38 
  
{


 39 
      
$this
->
addTaskHandler


 40 
          
->
expects
(
self
::
once
())


 41 
          
->
method
(
'execute'
)


 42 
          
->
with
(
self
::
TASK_DESCRIPTION
);


 43 


 44 
      
$request
 
=
 
new
 
Request
(


 45 
          
[],


 46 
          
[],


 47 
          
[],


 48 
          
[],


 49 
          
[],


 50 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


 51 
          
json_encode
([
'task'
 
=>
 
self
::
TASK_DESCRIPTION
],
 
JSON_THROW_ON_ERROR
)


 52 
      
);


 53 


 54 
      
$response
 
=
 
$this
->
todoListController
->
addTask
(
$request
);


 55 


 56 
      
self
::
assertEquals
(
201
,
 
$response
->
getStatusCode
());


 57 
  
}


 58 


 59 
  
/** @test */


 60 
  
public
 
function
 
shouldGetTaskList
()
:
 
void


 61 
  
{


 62 
      
$expectedList
 
=
 
[


 63 
          
'[ ] 1. Task Description'
,


 64 
          
'[ ] 2. Task Description'
,


 65 
      
];


 66 
      
$this
->
getTaskListHandler


 67 
          
->
expects
(
self
::
once
())


 68 
          
->
method
(
'execute'
)


 69 
          
->
with
(
$this
->
taskListTransformer
)


 70 
          
->
willReturn
(
$expectedList
);


 71 


 72 
      
$response
 
=
 
$this
->
todoListController
->
getTaskList
(
new
 
Request
());


 73 


 74 
      
self
::
assertEquals
(
200
,
 
$response
->
getStatusCode
());


 75 


 76 
      
$list
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


 77 


 78 
      
self
::
assertEquals
(
$expectedList
,
 
$list
);


 79 
  
}


 80 


 81 
  
/** @test */


 82 
  
public
 
function
 
shouldMarkTaskCompleted
()
:
 
void


 83 
  
{


 84 
      
$this
->
markTaskCompletedHandler


 85 
          
->
expects
(
self
::
once
())


 86 
          
->
method
(
'execute'
)


 87 
          
->
with
(
self
::
COMPLETED_TASK_ID
,
 
true
);


 88 


 89 
      
$request
 
=
 
new
 
Request
(


 90 
          
[],


 91 
          
[],


 92 
          
[],


 93 
          
[],


 94 
          
[],


 95 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


 96 
          
json_encode
([
'completed'
 
=>
 
true
],
 
JSON_THROW_ON_ERROR
)


 97 
      
);


 98 


 99 
      
$response
 
=
 
$this
->
todoListController
->
markTaskCompleted
(
self
::
COMPLETED_TASK_ID
,
\


100 
 
$request
);


101 


102 
      
self
::
assertEquals
(
200
,
 
$response
->
getStatusCode
());


103 
  
}


104 
}

```

Una vez que tenemos el test, lo lanzamos. El resultado es que nos pide crear la clase `MarkTaskCompletedHandler`.

```

1 
Cannot stub or mock class or interface "App\Tests\TodoList\Infrastructure\EntryPoint\Api\\

2 
MarkTaskCompletedHandler" which does not exist
```

La creamos en el propio test y luego la movemos a su ubicación en `App\TodoList\Application`. A continuación nos pedirá crear el método `execute`.

```

1 
Trying to configure method "execute" which cannot be configured because it does not exist\

2 
, has not been specified, is final, or is static
```

El cual prepararemos de esta forma:

```

 1 
namespace
 
App\TodoList\Application
;


 2 


 3 


 4 
class
 
MarkTaskCompletedHandler


 5 
{


 6 
  
public
 
function
 
execute
(
int
 
$taskId
,
 
bool
 
$completed
)
:
 
void


 7 
  
{


 8 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s'
,
 
__METHOD__
));


 9 
  
}


10 
}

```

Con esto ya tenemos lo necesario para implementar la acción del controlador, cosa que hacemos, porque el siguiente error nos lo indica:

```

1 
RuntimeException
 
:
 
Implement
 
App
\
TodoList
\
Infrastructure
\
EntryPoint
\
Api
\
TodoListControlle
\


2 
r
::
markTaskCompleted

```

Este es el código que hará pasar el test del controlador.

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 


 4 
use
 
App\TodoList\Application\AddTaskHandler
;


 5 
use
 
App\TodoList\Application\GetTaskListHandler
;


 6 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 7 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 8 
use
 
Symfony\Component\HttpFoundation\Request
;


 9 
use
 
Symfony\Component\HttpFoundation\Response
;


10 


11 
class
 
TodoListController


12 
{


13 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


14 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


15 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


16 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


17 


18 
  
public
 
function
 
__construct
(


19 
      
AddTaskHandler
 
$addTaskHandler
,


20 
      
GetTaskListHandler
 
$getTaskListHandler
,


21 
      
TaskListTransformer
 
$taskListTransformer
,


22 
      
MarkTaskCompletedHandler
 
$markTaskCompletedHandler


23 
  
)
 
{


24 
      
$this
->
addTaskHandler
 
=
 
$addTaskHandler
;


25 
      
$this
->
getTaskListHandler
 
=
 
$getTaskListHandler
;


26 
      
$this
->
taskListTransformer
 
=
 
$taskListTransformer
;


27 
      
$this
->
markTaskCompletedHandler
 
=
 
$markTaskCompletedHandler
;


28 
  
}


29 


30 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


31 
  
{


32 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


33 


34 
      
$this
->
addTaskHandler
->
execute
(
$payload
[
'task'
]);


35 


36 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


37 
  
}


38 


39 
  
public
 
function
 
getTaskList
(
Request
 
$request
)
:
 
Response


40 
  
{


41 
      
$taskList
 
=
 
$this
->
getTaskListHandler
->
execute
(
$this
->
taskListTransformer
);


42 


43 
      
return
 
new
 
JsonResponse
(
$taskList
,
 
Response
::
HTTP_OK
);


44 
  
}


45 


46 
  
public
 
function
 
markTaskCompleted
(
int
 
$taskId
,
 
Request
 
$request
)
:
 
Response


47 
  
{


48 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


49 


50 
      
$this
->
markTaskCompletedHandler
->
execute
(
$taskId
,
 
$payload
[
'completed'
]);


51 


52 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_OK
);


53 
  
}


54 


55 
  
private
 
function
 
obtainPayload
(
Request
 
$request
)
:
 
array


56 
  
{


57 
      
return
 
json_decode
(
$request
->
getContent
(),
 
true
,
 
512
,
 
JSON_THROW_ON_ERROR
);


58 
  
}


59 
}

```

Una vez que el test del controlador pasa, tendremos que volver a lanzar el test de aceptación. Este nos indicará el siguiente paso:

```

1 
RuntimeException: "Implement App\TodoList\Application\MarkTaskCompletedHandler::execute"
```

Nos requiere implementar el caso de uso. Por lo tanto, necesitamos un nuevo test unitario:

```

 1 
namespace
 
App\Tests\TodoList\Application
;


 2 


 3 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 4 
use
 
App\TodoList\Domain\Task
;


 5 
use
 
App\TodoList\Domain\TaskRepository
;


 6 
use
 
PHPUnit\Framework\TestCase
;


 7 


 8 
class
 
MarkTaskCompletedHandlerTest
 
extends
 
TestCase


 9 
{


10 
  
private
 
const
 
COMPLETED_TASK_ID
 
=
 
1
;


11 


12 
  
/** @test */


13 
  
public
 
function
 
shouldMarkTaskAsCompletedAndPersist
()
:
 
void


14 
  
{


15 
      
$task
 
=
 
new
 
Task
(
self
::
COMPLETED_TASK_ID
,
 
'Task Description'
);


16 
      

17 
      
$taskRepository
 
=
 
$this
->
createMock
(
TaskRepository
::
class
);


18 
      
$taskRepository


19 
          
->
method
(
'retrieve'
)


20 
          
->
with
(
self
::
COMPLETED_TASK_ID
)


21 
          
->
willReturn
(
$task
);


22 


23 
      
$taskRepository


24 
          
->
expects
(
self
::
once
())


25 
          
->
method
(
'store'
)


26 
          
->
with
(
$task
);


27 


28 
      
$markTaskCompletedHandler
 
=
 
new
 
MarkTaskCompletedHandler
(
$taskRepository
);


29 


30 
      
$markTaskCompletedHandler
->
execute
(
self
::
COMPLETED_TASK_ID
,
 
true
);


31 
  
}


32 
}

```

La ejecución del test arroja el siguiente error:

```

1 
Trying to configure method "retrieve" which cannot be configured because it does not exis\

2 
t, has not been specified, is final, or is static
```

Hasta ahora no habíamos requerido este método en el repositorio, por lo cual tendremos que añadirlo a la interfaz.

```

 1 
namespace
 
App\TodoList\Domain
;


 2 


 3 
interface
 
TaskRepository


 4 
{


 5 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void
;


 6 


 7 
  
public
 
function
 
nextIdentity
()
:
 
int
;


 8 


 9 
  
public
 
function
 
findAll
()
:
 
array
;


10 


11 
  
public
 
function
 
retrieve
(
int
 
$taskId
)
:
 
Task
;


12 
}

```

Esto será suficiente para poder seguir ejecutando el test y que nos pida implementar el método `execute` en el caso de uso.

```

1 
RuntimeException
 
:
 
Implement
 
App
\
TodoList
\
Application
\
MarkTaskCompletedHandler
::
execute

```

Así que vamos a ello. Es bastante sencillo:

```

 1 
namespace
 
App\TodoList\Application
;


 2 


 3 


 4 
use
 
App\TodoList\Domain\TaskRepository
;


 5 


 6 
class
 
MarkTaskCompletedHandler


 7 
{


 8 
  
private
 
TaskRepository
 
$taskRepository
;


 9 


10 
  
public
 
function
 
__construct
(
TaskRepository
 
$taskRepository
)


11 
  
{


12 
      
$this
->
taskRepository
 
=
 
$taskRepository
;


13 
  
}


14 


15 
  
public
 
function
 
execute
(
int
 
$taskId
,
 
bool
 
$completed
)
:
 
void


16 
  
{


17 
      
$task
 
=
 
$this
->
taskRepository
->
retrieve
(
$taskId
);


18 


19 
      
if
 
(
$completed
)
 
{


20 
          
$task
->
markCompleted
();


21 
      
}


22 
      

23 
      
$this
->
taskRepository
->
store
(
$task
);


24 
  
}


25 
}

```

Al volver a ejecutar el test fallará. Esto es porque no tenemos definido el método `Task::markCompleted`:

```

1 
Error
 
:
 
Call
 
to
 
undefined
 
method
 
App
\
TodoList
\
Domain
\
Task
::
markCompleted
()

```

Siempre que tenemos un error de este tipo, tendremos que profundizar y entrar en un nuevo test unitario. En este caso, para implementar este método en `Task`. No tenemos acceso directo a la propiedad `complete`, que aún no tenemos definida siquiera, pero podemos controlar su estado indirectamente gracias a su representación.

```

 1 
namespace
 
App\Tests\TodoList\Domain
;


 2 


 3 
use
 
App\TodoList\Domain\Task
;


 4 
use
 
PHPUnit\Framework\TestCase
;


 5 


 6 
class
 
TaskTest
 
extends
 
TestCase


 7 
{


 8 
  
/** @test */


 9 
  
public
 
function
 
shouldProvideRepresentation
()
:
 
void


10 
  
{


11 
      
$expected
 
=
 
'[ ] 1. Task Description'
;


12 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


13 


14 
      
$representation
 
=
 
$task
->
representedAs
(
'[:check] :id. :description'
);


15 


16 
      
self
::
assertEquals
(
$expected
,
 
$representation
);


17 
  
}


18 


19 
  
/** @test */


20 
  
public
 
function
 
shouldMarkTaskCompleted
()
:
 
void


21 
  
{


22 
      
$expected
 
=
 
'[√] 1. Task Description'
;


23 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


24 
      
$task
->
markCompleted
();


25 
      

26 
      
$representation
 
=
 
$task
->
representedAs
(
'[:check] :id. :description'
);


27 


28 
      
self
::
assertEquals
(
$expected
,
 
$representation
);


29 
  
}


30 
}

```

La implementación es bastante sencilla:

```

 1 
namespace
 
App\TodoList\Domain
;


 2 


 3 
class
 
Task


 4 
{


 5 
  
private
 
int
 
$id
;


 6 
  
private
 
string
 
$description
;


 7 
  
private
 
bool
 
$completed
;


 8 


 9 
  
public
 
function
 
__construct
(
int
 
$id
,
 
string
 
$description
)


10 
  
{


11 
      
$this
->
id
 
=
 
$id
;


12 
      
$this
->
description
 
=
 
$description
;


13 
      
$this
->
completed
 
=
 
false
;


14 
  
}


15 


16 
  
public
 
function
 
id
()
:
 
int


17 
  
{


18 
      
return
 
$this
->
id
;


19 
  
}


20 


21 
  
public
 
function
 
representedAs
(
string
 
$format
)
:
 
string


22 
  
{


23 
      
$values
 
=
 
[


24 
          
':check'
 
=>
 
$this
->
completed
 
?
 
'√'
 
:
 
' '
,


25 
          
':id'
 
=>
 
$this
->
id
,


26 
          
':description'
 
=>
 
$this
->
description


27 
      
];


28 
      
return
 
strtr
(
$format
,
 
$values
);


29 


30 
  
}


31 


32 
  
public
 
function
 
markCompleted
()
:
 
void


33 
  
{


34 
      
$this
->
completed
 
=
 
true
;


35 
  
}


36 
}

```

Con esto, el test de `Task` pasa y podemos volver al nivel del caso de uso. Al lanzar el test de nuevo, vemos que también pasa, por lo que podemos volver al nivel del test de aceptación.

Este test, en cambio, no pasará porque espera que implementemos el método `retrieve` en `FileTaskRepository`, que aún no lo tenemos. Nos vamos al test.

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\Persistence
;


 2 


 3 
use
 
App\Lib\FileStorageEngine
;


 4 
use
 
App\TodoList\Domain\Task
;


 5 
use
 
App\TodoList\Domain\TaskRepository
;


 6 
use
 
App\TodoList\Infrastructure\Persistence\FileTaskRepository
;


 7 
use
 
PHPUnit\Framework\TestCase
;


 8 


 9 
class
 
FileTaskRepositoryTest
 
extends
 
TestCase


10 
{


11 
  
private
 
FileStorageEngine
 
$fileStorageEngine
;


12 
  
private
 
TaskRepository
 
$taskRepository
;


13 


14 
  
public
 
function
 
setUp
()
:
 
void


15 
  
{


16 
      
$this
->
fileStorageEngine
 
=
 
$this
->
createMock
(
FileStorageEngine
::
class
);


17 
      
$this
->
taskRepository
 
=
 
new
 
FileTaskRepository
(
$this
->
fileStorageEngine
);


18 
  
}


19 


20 
  
/** @test */


21 
  
public
 
function
 
shouldProvideNextIdentityCountingExistingObjects
()
:
 
void


22 
  
{


23 
      
$this
->
fileStorageEngine


24 
          
->
method
(
'loadObjects'
)


25 
          
->
willReturn
(


26 
              
[],


27 
              
[
'Task'
],


28 
              
[
'Task'
,
 
'Task'
]


29 
          
);


30 


31 
      
self
::
assertEquals
(
1
,
 
$this
->
taskRepository
->
nextIdentity
());


32 
      
self
::
assertEquals
(
2
,
 
$this
->
taskRepository
->
nextIdentity
());


33 
      
self
::
assertEquals
(
3
,
 
$this
->
taskRepository
->
nextIdentity
());


34 
  
}


35 


36 
  
/** @test */


37 
  
public
 
function
 
shouldStoreATask
()
:
 
void


38 
  
{


39 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


40 


41 
      
$this
->
fileStorageEngine


42 
          
->
method
(
'loadObjects'
)


43 
          
->
willReturn
([]);


44 
      
$this
->
fileStorageEngine


45 
          
->
expects
(
self
::
once
())


46 
          
->
method
(
'persistObjects'
)


47 
          
->
with
([
1
 
=>
 
$task
]);


48 


49 
      
$this
->
taskRepository
->
store
(
$task
);


50 
  
}


51 


52 
  
/** @test */


53 
  
public
 
function
 
shouldGetStoredTasks
()
:
 
void


54 
  
{


55 
      
$storedTasks
 
=
 
[


56 
          
1
 
=>
 
new
 
Task
(
1
,
 
'Write a test that fails'
),


57 
          
2
 
=>
 
new
 
Task
(
2
,
 
'Write code to make the test pass'
),


58 
      
];


59 


60 
      
$this
->
fileStorageEngine


61 
          
->
method
(
'loadObjects'
)


62 
          
->
willReturn
(


63 
              
$storedTasks


64 
          
);


65 


66 
      
self
::
assertEquals
(
$storedTasks
,
 
$this
->
taskRepository
->
findAll
());


67 
  
}


68 


69 
  
/** @test */


70 
  
public
 
function
 
shouldRetrieveATaskByItsId
()
:
 
void


71 
  
{


72 
      
$expectedTask
 
=
 
new
 
Task
(
1
,
 
'Write a test that fails'
);


73 
      

74 
      
$storedTasks
 
=
 
[


75 
          
1
 
=>
 
$expectedTask
,


76 
          
2
 
=>
 
new
 
Task
(
2
,
 
'Write code to make the test pass'
),


77 
      
];


78 


79 
      
$this
->
fileStorageEngine


80 
          
->
method
(
'loadObjects'
)


81 
          
->
willReturn
(


82 
              
$storedTasks


83 
          
);


84 


85 
      
self
::
assertEquals
(
$expectedTask
,
 
$this
->
taskRepository
->
retrieve
(
1
));


86 
  
}


87 
}

```

Como era de esperar, el test nos reclamará escribir el método retrieve.

```

 1 
namespace
 
App\TodoList\Infrastructure\Persistence
;


 2 


 3 


 4 
use
 
App\Lib\FileStorageEngine
;


 5 
use
 
App\TodoList\Domain\Task
;


 6 
use
 
App\TodoList\Domain\TaskRepository
;


 7 


 8 
class
 
FileTaskRepository
 
implements
 
TaskRepository


 9 
{


10 
  
private
 
FileStorageEngine
 
$fileStorageEngine
;


11 


12 
  
public
 
function
 
__construct
(
FileStorageEngine
 
$fileStorageEngine
)


13 
  
{


14 
      
$this
->
fileStorageEngine
 
=
 
$fileStorageEngine
;


15 
  
}


16 


17 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void


18 
  
{


19 
     
$tasks
 
=
 
$this
->
fileStorageEngine
->
loadObjects
(
Task
::
class
);


20 


21 
     
$tasks
[
$task
->
id
()]
 
=
 
$task
;


22 


23 
     
$this
->
fileStorageEngine
->
persistObjects
(
$tasks
);


24 
  
}


25 


26 
  
public
 
function
 
nextIdentity
()
:
 
int


27 
  
{


28 
      
$tasks
 
=
 
$this
->
fileStorageEngine
->
loadObjects
(
Task
::
class
);


29 


30 
      
return
 
count
(
$tasks
)
 
+
 
1
;


31 
  
}


32 


33 
  
public
 
function
 
findAll
()
:
 
array


34 
  
{


35 
      
return
 
$this
->
fileStorageEngine
->
loadObjects
(
Task
::
class
);


36 
  
}


37 


38 
  
public
 
function
 
retrieve
(
int
 
$taskId
)
:
 
Task


39 
  
{


40 
      
$tasks
 
=
 
$this
->
fileStorageEngine
->
loadObjects
(
Task
::
class
);


41 


42 
      
return
 
$tasks
[
$taskId
];


43 
  
}


44 
}

```

Y con este el test de `FileTaskRepository` está en verde. Aprovechamos para hacer un pequeño refactor, de modo que la dependencia esté controlada:

```

 1 
namespace
 
App\TodoList\Infrastructure\Persistence
;


 2 


 3 


 4 
use
 
App\Lib\FileStorageEngine
;


 5 
use
 
App\TodoList\Domain\Task
;


 6 
use
 
App\TodoList\Domain\TaskRepository
;


 7 


 8 
class
 
FileTaskRepository
 
implements
 
TaskRepository


 9 
{


10 
  
private
 
FileStorageEngine
 
$fileStorageEngine
;


11 


12 
  
public
 
function
 
__construct
(
FileStorageEngine
 
$fileStorageEngine
)


13 
  
{


14 
      
$this
->
fileStorageEngine
 
=
 
$fileStorageEngine
;


15 
  
}


16 


17 
  
public
 
function
 
store
(
Task
 
$task
)
:
 
void


18 
  
{


19 
      
$tasks
 
=
 
$this
->
findAll
();


20 


21 
      
$tasks
[
$task
->
id
()]
 
=
 
$task
;


22 


23 
      
$this
->
persistAllInStorage
(
$tasks
);


24 
  
}


25 


26 
  
public
 
function
 
nextIdentity
()
:
 
int


27 
  
{


28 
      
$tasks
 
=
 
$this
->
findAll
();


29 


30 
      
return
 
count
(
$tasks
)
 
+
 
1
;


31 
  
}


32 


33 
  
public
 
function
 
findAll
()
:
 
array


34 
  
{


35 
      
return
 
$this
->
getAllFromStorage
();


36 
  
}


37 


38 
  
public
 
function
 
retrieve
(
int
 
$taskId
)
:
 
Task


39 
  
{


40 
      
$tasks
 
=
 
$this
->
findAll
();


41 


42 
      
return
 
$tasks
[
$taskId
];


43 
  
}


44 


45 
  
private
 
function
 
getAllFromStorage
()
:
 
array


46 
  
{


47 
      
return
 
$this
->
fileStorageEngine
->
loadObjects
(
Task
::
class
);


48 
  
}


49 


50 
  
private
 
function
 
persistAllInStorage
(
array
 
$tasks
)
:
 
void


51 
  
{


52 
      
$this
->
fileStorageEngine
->
persistObjects
(
$tasks
);


53 
  
}


54 
}

```

Y ahora volveremos a lanzar el test de aceptación, que esta vez pasa limpiamente.

## Siguientes pasos

En este punto tenemos las tres historias de usuario implementadas. ¿Qué nos interesa hacer ahora?

Una de las mejoras que podemos hacer en este momento es arreglar el test de aceptación para que pueda usarse como test de QA. Ahora que hemos desarrollado todos los componentes implicados es posible hacer que el test sea más expresivo y más útil para describir el comportamiento implementado.

Los tests unitarios nos pueden valer tal como están. Una objeción típica es que al estar basados en *mocks* son frágiles por su acoplamiento a la implementación. Sin embargo, debemos recordar que básicamente hemos estado diseñando los componentes que necesitábamos y la forma en que queríamos hacerlos interactuar. En otras palabras: no es previsible que esta implementación vaya a cambiar demasiado hasta el punto de invalidar los test. Por otro lado, los tests unitarios que hemos usado, caracterizan el comportamiento concreto de cada unidad. En conjunto son rápidos y nos proporcionan la resolución necesaria como para ayudarnos a diagnosticar rápidamente los problemas que puedan surgir.

Así que vamos a retocar el test de aceptación para que tenga un mejor lenguaje de negocio:

```

  1 
namespace
 
App\Tests\Katas\TodoList
;


  2 


  3 
use
 
Symfony\Bundle\FrameworkBundle\Client
;


  4 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


  5 
use
 
Symfony\Component\HttpFoundation\Response
;


  6 


  7 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


  8 
{


  9 
  
private
 
Client
 
$client
;


 10 


 11 
  
/** @test */


 12 
  
public
 
function
 
asUserIWantToAddTaskToAToDoList
()
:
 
void


 13 
  
{


 14 
      
$this
->
givenIRequestToCreateATaskWithDescription
(
'Write a test that fails'
);


 15 
      
$response
 
=
 
$this
->
whenIRequestTheListOfTasks
();


 16 
      
$this
->
thenICanSeeAddedTasksInTheList
(


 17 
          
[


 18 
              
'[ ] 1. Write a test that fails'
,


 19 
          
],


 20 
          
$response


 21 
      
);


 22 
  
}


 23 


 24 
  
/** @test */


 25 
  
public
 
function
 
asUserIWantToSeeTheTasksInMyTodoList
()
:
 
void


 26 
  
{


 27 
      
$this
->
givenIHaveAddedTasks
(


 28 
          
[


 29 
              
'Write a test that fails'
,


 30 
              
'Write code to make the test pass'
,


 31 
          
]


 32 
      
);


 33 
      
$response
 
=
 
$this
->
whenIRequestTheListOfTasks
();


 34 
      
$this
->
thenICanSeeAddedTasksInTheList
(


 35 
          
[


 36 
              
'[ ] 1. Write a test that fails'
,


 37 
              
'[ ] 2. Write code to make the test pass'
,


 38 
          
],


 39 
          
$response


 40 
      
);


 41 
  
}


 42 


 43 
  
/** @test */


 44 
  
public
 
function
 
asUserIWantToMarkTasksAsCompleted
()
:
 
void


 45 
  
{


 46 
      
$this
->
givenIHaveAddedTasks
(


 47 
          
[


 48 
              
'Write a test that fails'
,


 49 
              
'Write code to make the test pass'
,


 50 
          
]


 51 
      
);


 52 
      
$this
->
givenIMarkATaskAsCompleted
(
1
);


 53 
      
$response
 
=
 
$this
->
whenIRequestTheListOfTasks
();


 54 
      
$this
->
thenICanSeeAddedTasksInTheList
(


 55 
          
[


 56 
              
'[√] 1. Write a test that fails'
,


 57 
              
'[ ] 2. Write code to make the test pass'
,


 58 
          
],


 59 
          
$response


 60 
      
);


 61 
  
}


 62 


 63 
  
private
 
function
 
givenIRequestToCreateATaskWithDescription
(
string
 
$taskDescription
)
:
 
\


 64 
Response


 65 
  
{


 66 
      
return
 
$this
->
apiCreateTaskWithDescription
(
$taskDescription
);


 67 
  
}


 68 


 69 
  
private
 
function
 
apiCreateTaskWithDescription
(
string
 
$taskDescription
)
:
 
Response


 70 
  
{


 71 
      
$this
->
client
->
request
(


 72 
          
'POST'
,


 73 
          
'/api/todo'
,


 74 
          
[],


 75 
          
[],


 76 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


 77 
          
json_encode
([
'task'
 
=>
 
$taskDescription
],
 
JSON_THROW_ON_ERROR
)


 78 
      
);


 79 


 80 
      
return
 
$this
->
client
->
getResponse
();


 81 
  
}


 82 


 83 
  
private
 
function
 
whenIRequestTheListOfTasks
()
:
 
Response


 84 
  
{


 85 
      
$response
 
=
 
$this
->
apiGetTasksList
();


 86 


 87 
      
self
::
assertEquals
(
Response
::
HTTP_OK
,
 
$response
->
getStatusCode
());


 88 


 89 
      
return
 
$response
;


 90 
  
}


 91 


 92 
  
private
 
function
 
apiGetTasksList
()
:
 
Response


 93 
  
{


 94 
      
$this
->
client
->
request
(


 95 
          
'GET'
,


 96 
          
'/api/todo'


 97 
      
);


 98 


 99 
      
return
 
$this
->
client
->
getResponse
();


100 
  
}


101 


102 
  
private
 
function
 
thenICanSeeAddedTasksInTheList
(
array
 
$expectedTasks
,
 
Response
 
$respo\


103 
nse
)
:
 
void


104 
  
{


105 
      
$taskList
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


106 


107 
      
self
::
assertEquals
(
$expectedTasks
,
 
$taskList
);


108 
  
}


109 


110 
  
private
 
function
 
givenIHaveAddedTasks
(
$tasks
)
:
 
void


111 
  
{


112 
      
foreach
 
(
$tasks
 
as
 
$task
)
 
{


113 
          
$this
->
apiCreateTaskWithDescription
(
$task
);


114 
      
}


115 
  
}


116 


117 
  
private
 
function
 
givenIMarkATaskAsCompleted
(
int
 
$taskId
)
:
 
void


118 
  
{


119 
      
$patchResponse
 
=
 
$this
->
apiMarkTaskCompleted
(
$taskId
);


120 


121 
      
self
::
assertEquals
(
Response
::
HTTP_OK
,
 
$patchResponse
->
getStatusCode
());


122 
  
}


123 


124 
  
private
 
function
 
apiMarkTaskCompleted
(
int
 
$taskId
)
:
 
Response


125 
  
{


126 
      
$this
->
client
->
request
(


127 
          
'PATCH'
,


128 
          
'/api/todo/'
 
.
 
$taskId
 
.
 
''
,


129 
          
[],


130 
          
[],


131 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


132 
          
json_encode
([
'completed'
 
=>
 
true
],
 
JSON_THROW_ON_ERROR
)


133 


134 
      
);


135 


136 
      
return
 
$this
->
client
->
getResponse
();


137 
  
}


138 


139 
  
protected
 
function
 
setUp
()
:
 
void


140 
  
{


141 
      
$this
->
resetRepositoryData
();


142 


143 
      
$this
->
client
 
=
 
self
::
createClient
();


144 
  
}


145 


146 
  
private
 
function
 
resetRepositoryData
()
:
 
void


147 
  
{


148 
      
if
 
(
file_exists
(
'repository.data'
))
 
{


149 
          
unlink
(
'repository.data'
);


150 
      
}


151 
  
}


152 


153 
  
protected
 
function
 
tearDown
()
:
 
void


154 
  
{


155 
      
$this
->
resetRepositoryData
();


156 
  
}


157 
}

```

Básicamente hemos reescrito el test usando un estilo *Behavior Driven Development.* No nos ha hecho falta hacer un Gherkin aquí, pero hubiésemos podido hacerlo.

Esto nos ha permitido desprendernos de la llamada directa al motor de almacenamiento que habíamos introducido al principio, y al hacerlo conseguimos que el test sea más portable, ya que sólo usa las llamadas a los  *endpoints* , por lo que puede funcionar en distintos entornos (local e integración contínua, por ejemplo).



# 24 Resolviendo bugs con TDD

En nuestro proyecto de lista de tareas hemos desarrollado lo que podríamos llamar el *happy path* de la aplicación. Es decir, hemos supuesto que al crear una tarea la consumidora del API no cometería errores como intentar crear una tarea sin nombre. Otro supuesto es que al marcar una tarea como completada se usarán id de tareas que existan en la lista.

Esto significa que la aplicación puede fallar si no se cumple alguno de estos supuestos. ¿Es esto un bug? En cierto sentido sí, aunque también podemos argumentar que son prestaciones no implementadas.

Cuando desarrollamos usando TDD podemos prevenir muchos defectos debidos a implementaciones con errores. Por ejemplo, imagina que no hemos implementado un método `Task::markComplete` y no tenemos tests cuya ejecución implique esa llamada. El resultado será un  *bug* .

Obviamente, si no hemos escrito un test para verificar un comportamiento específico, como podría ser impedir que se puedan crear tareas sin descripción, ese defecto acabará apareciendo.

Se dice que ni el testing ni el TDD nos libran de que un software tenga defectos. Sin embargo, creo que podemos estar muy seguras de que usando TDD los defectos aparecerán en aquellas partes que no estén cubiertas por un test. Considerados así, por tanto, los defectos son más bien circunstancias no previstas o casos no implementados todavía. Esto es interesante y bastante liberador, porque en cierto modo, hace que los defectos del software sean bastante previsibles y manejables, motivados por la falta de definición o, simplemente, por falta de información en el momento del desarrollo.

Así que vamos a ver cómo trabajaríamos en el caso de que se reporta un bug sobre nuestro proyecto To-do list.

## Defectos en To-do list

Después de un tiempo utilizando nuestra API para generar listas de tareas, vemos que hay algunos defectos. Uno de ellos es que podemos introducir tareas sin descripción, lo que no tiene mucho sentido ya que no nos sirve para saber qué tenemos que hacer.

Este bug es debido a que no controlamos en ningún momento que efectivamente recibimos la descripción de la tarea, es decir, estamos confiando en que el input es siempre correcto. En ese caso, caben dos posibilidades: que el *payload* de la petición al *endpoint* del POST esté completamente vacía o que el campo `task` venga vacío.

En esta ocasión, el comportamiento del sistema no está especificado para estas circunstancias y no está expresado en tests. En otros casos, el bug es algún tipo de error no cubierto por los tests actuales.

Así que nuestra primera aproximación será crear un test que ponga de manifiesto el bug.

Ahora bien, ¿en dónde nos interesa poner ese test? Vamos a intentar pensar un poco en esto.

Por un lado, los *endpoints* afectados deberían devolver una respuesta 400 ( *Bad Request* ) porque en este caso, lo que ocurre es que la *request* está mal construída y el *endpoint* no la entiende.

Según esto, tendría sentido añadir un test de aceptación. Sin embargo, también tenemos tests unitarios del controlador, que son mucho más rápidos y también nos permitirían comprobar que la respuesta tiene el código adecuado.

Por otro lado, debemos tomar en consideración qué componente se responsabiliza de validar qué cuestiones.

Así por ejemplo, si la *request* no trae ninguna *payload* o la estructura no incluye los campos requeridos, tiene sentido que el controlador sea el responsable de verificarlo y fallar en cuanto lo detecta. El test tiene sentido a nivel del controlador.

En cambio, si la *request* tiene la estructura correcta y se pueden encontrar los campos requeridos, puede que la validación de sus valores corresponda a capas más internas. Así, por ejemplo, si el valor de `task` en la *payload* es una cadena vacía el controlador puede intentar pasarlo al caso de uso y que sea el constructor de `Task` quien valide si ese valor es aceptable o no. El test, en este caso, sería en el nivel del caso de uso `AddTaskHandler`.

Esto abre entonces una nueva problemática para el controlador y es gestionar los errores o excepciones que vengan del caso de uso para devolver la respuesta de error adecuada.

Como se puede ver, se plantean un montón de circunstancias que nos obligan a intervenir en distintos niveles de la aplicación.

Un principio que podríamos tratar de seguir es que si falla algo en el nivel de aceptación debería tener un reflejo en el nivel unitario. El primer fallo nos indica que la aplicación tiene un defecto, mientras que el fallo en el nivel unitario nos indicaría el componente que falla.

Así que vamos a ir por partes, atacando cada uno de los problemas.

## Payload inválida

El supuesto que vamos a tratar de resolver es enviar una petición al *endpoint* que esté mal formada o vacía. En cualquier caso no incluye el campo `task`.

Empezaremos por el test de aceptación y vamos a intentar reproducir el error lanzando una petición al API con una payload inválida.

```

 1 
namespace
 
App\Tests\Katas\TodoList
;


 2 


 3 
use
 
Symfony\Bundle\FrameworkBundle\Client
;


 4 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


 5 
use
 
Symfony\Component\HttpFoundation\Response
;


 6 


 7 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


 8 
{


 9 
  
private
 
Client
 
$client
;


10 


11 

// ...


12 


13 
  
/** @test */


14 
  
public
 
function
 
asUserITryToAddTaskWithInvalidPayload
()
:
 
void


15 
  
{


16 
      
$this
->
client
->
request
(


17 
          
'POST'
,


18 
          
'/api/todo'
,


19 
          
[],


20 
          
[],


21 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


22 
          
json_encode
([
'bad payload'
],
 
JSON_THROW_ON_ERROR
)


23 
      
);


24 


25 
      
$response
 
=
 
$this
->
client
->
getResponse
();


26 


27 
      
self
::
assertEquals
(
400
,
 
$response
->
getStatusCode
());


28 


29 
      
$body
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


30 


31 
      
self
::
assertEquals
(
'Invalid payload'
,
 
$body
[
'error'
]);


32 
  
}


33 


34 

// ...


35 
}

```

El test falla porque el *endpoint* devuelve un error 500 en lugar del error 400 que sería deseable en este caso. ¿Qué podemos hacer ahora?

Pues nos moveremos al nivel del controlador, para ver qué podemos hacer allí al respecto. Y tendremos que escribir otro test caracterizando la misma situación.

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Application\AddTaskHandler
;


 4 
use
 
App\TodoList\Application\GetTaskListHandler
;


 5 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 6 
use
 
App\TodoList\Application\TaskListTransformer
;


 7 
use
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController
;


 8 
use
 
PHPUnit\Framework\TestCase
;


 9 
use
 
Symfony\Component\HttpFoundation\Request
;


10 


11 
class
 
TodoListControllerTest
 
extends
 
TestCase


12 
{


13 
  
private
 
const
 
TASK_DESCRIPTION
 
=
 
'Task Description'
;


14 
  
private
 
const
 
COMPLETED_TASK_ID
 
=
 
1
;


15 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


16 
  
private
 
TodoListController
 
$todoListController
;


17 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


18 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


19 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


20 


21 
  
protected
 
function
 
setUp
()
:
 
void


22 
  
{


23 
      
$this
->
addTaskHandler
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


24 
      
$this
->
getTaskListHandler
 
=
 
$this
->
createMock
(
GetTaskListHandler
::
class
);


25 
      
$this
->
taskListTransformer
 
=
 
$this
->
createMock
(
TaskListTransformer
::
class
);


26 
      
$this
->
markTaskCompletedHandler
 
=
 
$this
->
createMock
(
MarkTaskCompletedHandler
::
cla\


27 
ss
);


28 
      
$this
->
todoListController
 
=
 
new
 
TodoListController
(


29 
          
$this
->
addTaskHandler
,


30 
          
$this
->
getTaskListHandler
,


31 
          
$this
->
taskListTransformer
,


32 
          
$this
->
markTaskCompletedHandler


33 
      
);


34 
  
}


35 


36 


37 
  
// ...


38 


39 
   
/** @test */


40 
  
public
 
function
 
shouldFailWithBadRequestIfInvalidPayload
()
:
 
void


41 
  
{


42 
      
$request
 
=
 
new
 
Request
(


43 
          
[],


44 
          
[],


45 
          
[],


46 
          
[],


47 
          
[],


48 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


49 
          
json_encode
([
'invalid payload'
],
 
JSON_THROW_ON_ERROR
)


50 
      
);


51 


52 
      
$response
 
=
 
$this
->
todoListController
->
addTask
(
$request
);


53 


54 
      
self
::
assertEquals
(
400
,
 
$response
->
getStatusCode
());


55 


56 
      
$body
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


57 


58 
      
self
::
assertEquals
(
'Invalid payload'
,
 
$body
[
'error'
]);


59 
  
}


60 


61 
}

```

Fíjate que he eliminado que se haga alguna expectativa sobre el `mock` del caso de uso. En mi opinión se trata de un test que no aportaría nada en este caso y contribuye a acoplarnos a la implementación. Es cierto que eso ocurre en todos los test del controlador que tenemos hasta ahora, pero no hay razón para aumentar el acoplamiento.

Al ejecutar el test falla porque ya no encuentra el índice `task` cuando lo necesita en `TodoListController`:

```

1 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


2 
  
{


3 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


4 


5 
      
$this
->
addTaskHandler
->
execute
(
$payload
[
'task'
]);


6 


7 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


8 
  
}

```

Esto forma parte de la lógica del controlador por lo que no vamos a necesitar profundizar más. Si lo arreglamos aquí, habremos resuelto el problema.

Parece bastante claro que tenemos que chequear si la *payload* tiene la estructura correcta y responder en consecuencia:

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 


 4 
use
 
App\TodoList\Application\AddTaskHandler
;


 5 
use
 
App\TodoList\Application\GetTaskListHandler
;


 6 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 7 
use
 
App\TodoList\Application\TaskListTransformer
;


 8 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 9 
use
 
Symfony\Component\HttpFoundation\Request
;


10 
use
 
Symfony\Component\HttpFoundation\Response
;


11 


12 
class
 
TodoListController


13 
{


14 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


15 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


16 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


17 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


18 


19 
  
public
 
function
 
__construct
(


20 
      
AddTaskHandler
 
$addTaskHandler
,


21 
      
GetTaskListHandler
 
$getTaskListHandler
,


22 
      
TaskListTransformer
 
$taskListTransformer
,


23 
      
MarkTaskCompletedHandler
 
$markTaskCompletedHandler


24 
  
)
 
{


25 
      
$this
->
addTaskHandler
 
=
 
$addTaskHandler
;


26 
      
$this
->
getTaskListHandler
 
=
 
$getTaskListHandler
;


27 
      
$this
->
taskListTransformer
 
=
 
$taskListTransformer
;


28 
      
$this
->
markTaskCompletedHandler
 
=
 
$markTaskCompletedHandler
;


29 
  
}


30 


31 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


32 
  
{


33 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


34 


35 
      
if
 
(
!
isset
(
$payload
[
'task'
]))
 
{


36 
          
return
 
new
 
JsonResponse
([
'error'
 
=>
 
'Invalid payload'
],
 
Response
::
HTTP_BAD_RE\


37 
QUEST
);


38 
      
}


39 


40 
      
$this
->
addTaskHandler
->
execute
(
$payload
[
'task'
]);


41 


42 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


43 
  
}


44 


45 
  
# ...


46 
}

```

Con el test del controlador pasando, volvemos al de aceptación. Los ejecutamos todos y vemos que también pasan perfectamente.

Y con ello hemos resuelto el  *bug* .

## Valores de negocio no válidos

Una cosa es que el *payload* sea incorrecto estructuralmente, validación de la que se tiene que ocupar el controlador. Sin embargo, dado un *payload* estructuralmente válido, en el que el controlador pueda encontrar los valores que necesita, ¿qué ocurre si esos valores no son aceptables según las reglas de negocio?

Lo que ocurre es que la responsabilidad de detectar el problema está en los objetos de dominio, los cuales lanzarán excepciones que tienen que ir subiendo hasta que algún componente pueda gestionarlas.

Por ejemplo, en el caso de `Task`, esperamos que tenga alguna descripción. No ha sido definido en las historias de usuario, pero es algo que damos por hecho. Puede ocurrir, entonces, que la *payload* nos traiga un campo `task` con alguno de estos valores:

* `null`
* Un tipo de dato que no sea `string`
* Un string vacío o demasiado corto
* Un string de longitud suficiente

Los dos primeros puntos son particularmente técnicos. A nivel del controlador podríamos validar que `task` en un `string` y fallar si no es así.

Sin embargo, los dos últimos apuntan a reglas que tiene que definir negocio. Es decir, ¿consideraríamos aceptable una tarea con una descripción de dos caracteres? Es una decisión de negocio. Supongamos que nos dicen que nos basta con un carácter para admitir una cadena como descripción válida de una tarea, así que simplemente tendremos que controlar que no es una cadena vacía.

Esta regla, en todo caso, tendría que estar en el dominio, porque se trata de una regla de negocio.

Es más discutible la ubicación de las otras dos restricciones, que se pueden resumir en que el sistema no puede aceptar `task` si no es un `string`.

Pero lo mejor es ver esto partiendo de un test, así que vamos a introducir uno. En este caso, para comprobar qué pasa si `task` es `null`:

```

 1 
namespace
 
App\Tests\Katas\TodoList
;


 2 


 3 
use
 
Symfony\Bundle\FrameworkBundle\Client
;


 4 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


 5 
use
 
Symfony\Component\HttpFoundation\Response
;


 6 


 7 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


 8 
{


 9 
  
private
 
Client
 
$client
;


10 


11 
  
# ...


12 
  

13 
  
/** @test */


14 
  
public
 
function
 
asUserITryToAddTaskWithABadTaskDescription
()
:
 
void


15 
  
{


16 
      
$this
->
client
->
request
(


17 
          
'POST'
,


18 
          
'/api/todo'
,


19 
          
[],


20 
          
[],


21 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


22 
          
json_encode
([
'task'
 
=>
 
null
],
 
JSON_THROW_ON_ERROR
)


23 
      
);


24 


25 
      
$response
 
=
 
$this
->
client
->
getResponse
();


26 


27 
      
self
::
assertEquals
(
400
,
 
$response
->
getStatusCode
());


28 


29 
      
$body
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


30 


31 
      
self
::
assertEquals
(
'Invalid payload'
,
 
$body
[
'error'
]);


32 
  
}


33 


34 
  
# ...


35 
}

```

Es muy interesante comprobar que este test pasa. Posiblemente, el arreglo del bug anterior ha evitado que nos encontremos con este.

¿Merece la pena dejar este test aquí? Yo diría que no, ya que no hemos tenido que añadir nada en el código. Lo aprovecharé para probar qué ocurriría si enviamos un dato que no sea string, como un número.

```

 1 
namespace
 
App\Tests\Katas\TodoList
;


 2 


 3 
use
 
Symfony\Bundle\FrameworkBundle\Client
;


 4 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


 5 
use
 
Symfony\Component\HttpFoundation\Response
;


 6 


 7 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


 8 
{


 9 
  
private
 
Client
 
$client
;


10 


11 
  
# ...


12 
  

13 
  
/** @test */


14 
  
public
 
function
 
asUserITryToAddTaskWithABadTaskDescription
()
:
 
void


15 
  
{


16 
      
$this
->
client
->
request
(


17 
          
'POST'
,


18 
          
'/api/todo'
,


19 
          
[],


20 
          
[],


21 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


22 
          
json_encode
([
'task'
 
=>
 
12345
],
 
JSON_THROW_ON_ERROR
)


23 
      
);


24 


25 
      
$response
 
=
 
$this
->
client
->
getResponse
();


26 


27 
      
self
::
assertEquals
(
400
,
 
$response
->
getStatusCode
());


28 


29 
      
$body
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


30 


31 
      
self
::
assertEquals
(
'Invalid payload'
,
 
$body
[
'error'
]);


32 
  
}


33 


34 
  
# ...


35 
}

```

Este test falla por el siguiente motivo:

```

1 
TypeError
 
:
 
Argument
 
1
 
passed
 
to
 
App
\
TodoList
\
Application
\
AddTaskHandler
::
execute
()
 
must
 
\


2 
be
 
of
 
the
 
type
 
string
,
 
int
 
given

```

Es decir. `AddTaskHandler` espera que pasemos un `string` en `execute`, por lo que nunca va a admitir un dato que no lo sea. Esto nos plantea un problema interesante y es si preferiríamos forzar el tipo `string` para la descripción de modo que si viene, como es el caso, un número lo convierta y siga adelante.

En este ejemplo vamos a suponer que no queremos eso, que el tipo ha de ser `string` sí o sí.

Como hemos visto, el fallo se ha producido también en el controlador, al intentar invocar el caso de uso. Por tanto, nos vamos de nuevo al test del controlador.

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Application\AddTaskHandler
;


 4 
use
 
App\TodoList\Application\GetTaskListHandler
;


 5 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 6 
use
 
App\TodoList\Application\TaskListTransformer
;


 7 
use
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController
;


 8 
use
 
PHPUnit\Framework\TestCase
;


 9 
use
 
Symfony\Component\HttpFoundation\Request
;


10 


11 
class
 
TodoListControllerTest
 
extends
 
TestCase


12 
{


13 
  
private
 
const
 
TASK_DESCRIPTION
 
=
 
'Task Description'
;


14 
  
private
 
const
 
COMPLETED_TASK_ID
 
=
 
1
;


15 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


16 
  
private
 
TodoListController
 
$todoListController
;


17 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


18 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


19 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


20 


21 
  
protected
 
function
 
setUp
()
:
 
void


22 
  
{


23 
      
$this
->
addTaskHandler
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


24 
      
$this
->
getTaskListHandler
 
=
 
$this
->
createMock
(
GetTaskListHandler
::
class
);


25 
      
$this
->
taskListTransformer
 
=
 
$this
->
createMock
(
TaskListTransformer
::
class
);


26 
      
$this
->
markTaskCompletedHandler
 
=
 
$this
->
createMock
(
MarkTaskCompletedHandler
::
cla\


27 
ss
);


28 
      
$this
->
todoListController
 
=
 
new
 
TodoListController
(


29 
          
$this
->
addTaskHandler
,


30 
          
$this
->
getTaskListHandler
,


31 
          
$this
->
taskListTransformer
,


32 
          
$this
->
markTaskCompletedHandler


33 
      
);


34 
  
}


35 


36 
  
# ...


37 


38 
  
/** @test */


39 
  
public
 
function
 
shouldFailWithBadRequestIfInvalidTaskField
()
:
 
void


40 
  
{


41 
      
$request
 
=
 
new
 
Request
(


42 
          
[],


43 
          
[],


44 
          
[],


45 
          
[],


46 
          
[],


47 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


48 
          
json_encode
([
'task'
 
=>
 
12345
],
 
JSON_THROW_ON_ERROR
)


49 
      
);


50 


51 
      
$response
 
=
 
$this
->
todoListController
->
addTask
(
$request
);


52 


53 
      
self
::
assertEquals
(
400
,
 
$response
->
getStatusCode
());


54 


55 
      
$body
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


56 


57 
      
self
::
assertEquals
(
'Invalid payload'
,
 
$body
[
'error'
]);


58 
  
}


59 
}

```

El test del controlador falla de la misma forma que el de aceptación. A continuación implementamos lo necesario para hacerlo pasar.

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 


 4 
use
 
App\TodoList\Application\AddTaskHandler
;


 5 
use
 
App\TodoList\Application\GetTaskListHandler
;


 6 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 7 
use
 
App\TodoList\Application\TaskListTransformer
;


 8 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 9 
use
 
Symfony\Component\HttpFoundation\Request
;


10 
use
 
Symfony\Component\HttpFoundation\Response
;


11 
use
 
function
 
is_string
;


12 


13 
class
 
TodoListController


14 
{


15 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


16 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


17 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


18 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


19 


20 
  
public
 
function
 
__construct
(


21 
      
AddTaskHandler
 
$addTaskHandler
,


22 
      
GetTaskListHandler
 
$getTaskListHandler
,


23 
      
TaskListTransformer
 
$taskListTransformer
,


24 
      
MarkTaskCompletedHandler
 
$markTaskCompletedHandler


25 
  
)
 
{


26 
      
$this
->
addTaskHandler
 
=
 
$addTaskHandler
;


27 
      
$this
->
getTaskListHandler
 
=
 
$getTaskListHandler
;


28 
      
$this
->
taskListTransformer
 
=
 
$taskListTransformer
;


29 
      
$this
->
markTaskCompletedHandler
 
=
 
$markTaskCompletedHandler
;


30 
  
}


31 


32 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


33 
  
{


34 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


35 


36 
      
if
 
(
!
isset
(
$payload
[
'task'
]))
 
{


37 
          
return
 
new
 
JsonResponse
([
'error'
 
=>
 
'Invalid payload'
],
 
Response
::
HTTP_BAD_RE\


38 
QUEST
);


39 
      
}


40 


41 
      
if
 
(
!
is_string
(
$payload
[
'task'
]))
 
{


42 
          
return
 
new
 
JsonResponse
([
'error'
 
=>
 
'Invalid payload'
],
 
Response
::
HTTP_BAD_RE\


43 
QUEST
);


44 
      
}


45 


46 
      
$this
->
addTaskHandler
->
execute
(
$payload
[
'task'
]);


47 


48 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


49 
  
}


50 


51 
  
# ...


52 
}

```

Este cambio hace pasar el test, y es de esperar que también el de aceptación, así que lo comprobamos. Recuerda que es muy importante pasar todos los tests, no sólo el específico para el caso, ya que hay que asegurarse de que los cambios introducidos no alteran el comportamiento actual del sistema.

El test de aceptación pasa también. Ahora tenemos que pensar un par de cosas.

Por un lado, el código que hemos introducido es un poco feo y nos distrae del propósito del controlador. Necesitamos hacer un refactor que despeje un poco las cosas.

Esta es una posible solución:

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 


 4 
use
 
App\TodoList\Application\AddTaskHandler
;


 5 
use
 
App\TodoList\Application\GetTaskListHandler
;


 6 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 7 
use
 
App\TodoList\Application\TaskListTransformer
;


 8 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


 9 
use
 
Symfony\Component\HttpFoundation\Request
;


10 
use
 
Symfony\Component\HttpFoundation\Response
;


11 
use
 
function
 
is_string
;


12 


13 
class
 
TodoListController


14 
{


15 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


16 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


17 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


18 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


19 


20 
  
public
 
function
 
__construct
(


21 
      
AddTaskHandler
 
$addTaskHandler
,


22 
      
GetTaskListHandler
 
$getTaskListHandler
,


23 
      
TaskListTransformer
 
$taskListTransformer
,


24 
      
MarkTaskCompletedHandler
 
$markTaskCompletedHandler


25 
  
)
 
{


26 
      
$this
->
addTaskHandler
 
=
 
$addTaskHandler
;


27 
      
$this
->
getTaskListHandler
 
=
 
$getTaskListHandler
;


28 
      
$this
->
taskListTransformer
 
=
 
$taskListTransformer
;


29 
      
$this
->
markTaskCompletedHandler
 
=
 
$markTaskCompletedHandler
;


30 
  
}


31 


32 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


33 
  
{


34 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


35 


36 
      
if
 
(
!
$this
->
isValidPayload
(
$payload
))
 
{


37 
          
return
 
new
 
JsonResponse
([
'error'
 
=>
 
'Invalid payload'
],
 
Response
::
HTTP_BAD_RE\


38 
QUEST
);


39 
      
}


40 


41 
      
$this
->
addTaskHandler
->
execute
(
$payload
[
'task'
]);


42 


43 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


44 
  
}


45 


46 
  
# ...


47 


48 
  
private
 
function
 
isValidPayload
(
array
 
$payload
)
:
 
bool


49 
  
{


50 
      
return
 
isset
(
$payload
[
'task'
])
 
&&
 
is_string
(
$payload
[
'task'
]);


51 
  
}


52 
}

```

Es una primera aproximación. Podríamos avanzar más en ella, pero de momento es suficiente.

La otra cuestión es la siguiente. Los tests de aceptación que hemos añadido nos han servido para reproducir los bugs y guiarnos en la solución. Sin embargo, en el nivel unitario del controlador hemos hecho prácticamente el mismo test. Es más, el test de aceptación verifica exactamente el comportamiento que el test del controlador, ya que es éste último el que tiene toda la responsabilidad sobre ese comportamiento.

Esta duplicación no siempre es útil. De hecho, para negocio, a quien interesa el test de aceptación, no le preocupa demasiado el tipo de problemas técnicos que estamos verificando. En cambio, en el nivel unitario este tipo de detalles es más relevante.

Así que en caso de tener tests en el nivel de aceptación que son idénticos a otros en el nivel unitario, es preferible eliminar los de aceptación si no aportan valor a negocio, teniendo cubierta la misma circunstancia en los unitarios.

Así que nosotros vamos a eliminar esos tests antes de continuar.

## Garantizando reglas de dominio

Nuestro siguiente tests verificará que una descripción vacía, aunque sea un `string`, no generará una tarea nueva. Lo pondremos en el test de aceptación:

```

 1 
namespace
 
App\Tests\Katas\TodoList
;


 2 


 3 
use
 
Symfony\Bundle\FrameworkBundle\Client
;


 4 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


 5 
use
 
Symfony\Component\HttpFoundation\Response
;


 6 


 7 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


 8 
{


 9 
  
private
 
Client
 
$client
;


10 


11 
  
# ...


12 
  

13 
  
/** @test */


14 
  
public
 
function
 
asUserITryToAddTaskWithAnEmptyTaskDescription
()
:
 
void


15 
  
{


16 
      
$this
->
client
->
request
(


17 
          
'POST'
,


18 
          
'/api/todo'
,


19 
          
[],


20 
          
[],


21 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


22 
          
json_encode
([
'task'
 
=>
 
''
],
 
JSON_THROW_ON_ERROR
)


23 
      
);


24 


25 
      
$response
 
=
 
$this
->
client
->
getResponse
();


26 


27 
      
self
::
assertEquals
(
400
,
 
$response
->
getStatusCode
());


28 


29 
      
$body
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


30 


31 
      
self
::
assertEquals
(
'Task description should not be empty'
,
 
$body
[
'error'
]);


32 
  
}


33 


34 
  
# ...


35 
}

```

Este test ya indica una violación de una regla de negocio. Este es el error que genera:

```

1 
Failed asserting that 201 matches expected 400.

2 
Expected :400

3 
Actual   :201
```

Nos indica que se estarían creando tareas con la descripción vacía como si fuesen válidas. Tenemos que profundizar en la aplicación para ver dónde deberíamos controlar el error.

Así que vamos al controlador. Pero éste no tiene que saber nada de las reglas del negocio ya que está en la capa de Infraestructura. Sin embargo, tiene que encargarse de dar la respuesta HTTP adecuada y eso sólo es posible si el caso de uso le comunica de alguna forma que ha habido problemas.

La mejor forma que tiene de hacerlo es lanzando una excepción que el controlador capturará devolviendo una respuesta adecuada.

De este modo, el test del controlador podría quedar así:

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Application\AddTaskHandler
;


 4 
use
 
App\TodoList\Application\GetTaskListHandler
;


 5 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 6 
use
 
App\TodoList\Application\TaskListTransformer
;


 7 
use
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController
;


 8 
use
 
InvalidArgumentException
;


 9 
use
 
PHPUnit\Framework\TestCase
;


10 
use
 
Symfony\Component\HttpFoundation\Request
;


11 


12 
class
 
TodoListControllerTest
 
extends
 
TestCase


13 
{


14 
  
private
 
const
 
TASK_DESCRIPTION
 
=
 
'Task Description'
;


15 
  
private
 
const
 
COMPLETED_TASK_ID
 
=
 
1
;


16 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


17 
  
private
 
TodoListController
 
$todoListController
;


18 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


19 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


20 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


21 


22 
  
protected
 
function
 
setUp
()
:
 
void


23 
  
{


24 
      
$this
->
addTaskHandler
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


25 
      
$this
->
getTaskListHandler
 
=
 
$this
->
createMock
(
GetTaskListHandler
::
class
);


26 
      
$this
->
taskListTransformer
 
=
 
$this
->
createMock
(
TaskListTransformer
::
class
);


27 
      
$this
->
markTaskCompletedHandler
 
=
 
$this
->
createMock
(
MarkTaskCompletedHandler
::
cla\


28 
ss
);


29 
      
$this
->
todoListController
 
=
 
new
 
TodoListController
(


30 
          
$this
->
addTaskHandler
,


31 
          
$this
->
getTaskListHandler
,


32 
          
$this
->
taskListTransformer
,


33 
          
$this
->
markTaskCompletedHandler


34 
      
);


35 
  
}


36 
  

37 
  
# ...


38 
  

39 
  
/** @test */


40 
  
public
 
function
 
shouldFailWithBadRequestIfTaskDescriptionIsEmpty
()
:
 
void


41 
  
{


42 
      
$exceptionMessage
 
=
 
'Task description should not be empty'
;


43 
      
$exception
 
=
 
new
 
InvalidArgumentException
(
$exceptionMessage
);


44 
      

45 
      
$this
->
addTaskHandler


46 
          
->
method
(
'execute'
)


47 
          
->
willThrowException
(
$exception
)


48 
          
->
with
(
''
);


49 


50 


51 
      
$request
 
=
 
new
 
Request
(


52 
          
[],


53 
          
[],


54 
          
[],


55 
          
[],


56 
          
[],


57 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


58 
          
json_encode
([
'task'
 
=>
 
''
],
 
JSON_THROW_ON_ERROR
)


59 
      
);


60 


61 
      
$response
 
=
 
$this
->
todoListController
->
addTask
(
$request
);


62 


63 
      
self
::
assertEquals
(
400
,
 
$response
->
getStatusCode
());


64 


65 
      
$body
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


66 


67 
      
self
::
assertEquals
(
$exceptionMessage
,
 
$body
[
'error'
]);


68 
  
}


69 
}

```

Como se puede ver, simulamos que el caso de uso lanza una excepción y el test falla porque no se captura y, por tanto, no se devuelve una respuesta adecuada. Para no complicar la solución no voy a crear una excepción de dominio, cosa que haría en un proyecto real.

Hagamos pasar el test.

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 


 4 
use
 
App\TodoList\Application\AddTaskHandler
;


 5 
use
 
App\TodoList\Application\GetTaskListHandler
;


 6 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 7 
use
 
App\TodoList\Application\TaskListTransformer
;


 8 
use
 
InvalidArgumentException
;


 9 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


10 
use
 
Symfony\Component\HttpFoundation\Request
;


11 
use
 
Symfony\Component\HttpFoundation\Response
;


12 
use
 
function
 
is_string
;


13 


14 
class
 
TodoListController


15 
{


16 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


17 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


18 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


19 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


20 


21 
  
public
 
function
 
__construct
(


22 
      
AddTaskHandler
 
$addTaskHandler
,


23 
      
GetTaskListHandler
 
$getTaskListHandler
,


24 
      
TaskListTransformer
 
$taskListTransformer
,


25 
      
MarkTaskCompletedHandler
 
$markTaskCompletedHandler


26 
  
)
 
{


27 
      
$this
->
addTaskHandler
 
=
 
$addTaskHandler
;


28 
      
$this
->
getTaskListHandler
 
=
 
$getTaskListHandler
;


29 
      
$this
->
taskListTransformer
 
=
 
$taskListTransformer
;


30 
      
$this
->
markTaskCompletedHandler
 
=
 
$markTaskCompletedHandler
;


31 
  
}


32 


33 
  
public
 
function
 
addTask
(
Request
 
$request
)
:
 
Response


34 
  
{


35 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


36 


37 
      
if
 
(
!
$this
->
isValidPayload
(
$payload
))
 
{


38 
          
return
 
new
 
JsonResponse
([
'error'
 
=>
 
'Invalid payload'
],
 
Response
::
HTTP_BAD_RE\


39 
QUEST
);


40 
      
}


41 


42 
      
try
 
{


43 
          
$this
->
addTaskHandler
->
execute
(
$payload
[
'task'
]);


44 
      
}
 
catch
 
(
InvalidArgumentException
 
$invalidTaskDescription
)
 
{


45 
          
return
 
new
 
JsonResponse
([
'error'
 
=>
 
$invalidTaskDescription
->
getMessage
()],
 
R\


46 
esponse
::
HTTP_BAD_REQUEST
);


47 
      
}


48 


49 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_CREATED
);


50 
  
}


51 


52 
   
# ...


53 
}

```

El test unitario del controlador ha pasado. Sin embargo, el test de aceptación no lo hace. Esto es porque el caso de uso no lo hemos tocado todavía. Tenemos que descender un poco más y hacer un test que pueda fallar para que nos diga qué implementar.

Pero primero, examinemos el código:

```

 1 
namespace
 
App\TodoList\Application
;


 2 


 3 
use
 
App\TodoList\Domain\Task
;


 4 
use
 
App\TodoList\Domain\TaskRepository
;


 5 


 6 
class
 
AddTaskHandler


 7 
{


 8 
  
/** @var TaskRepository */


 9 
  
private
 
TaskRepository
 
$taskRepository
;


10 


11 
  
public
 
function
 
__construct
(
TaskRepository
 
$taskRepository
)


12 
  
{


13 
      
$this
->
taskRepository
 
=
 
$taskRepository
;


14 
  
}


15 


16 
  
public
 
function
 
execute
(
string
 
$taskDescription
)
:
 
void


17 
  
{


18 
     
$id
 
=
 
$this
->
taskRepository
->
nextIdentity
();


19 


20 
     
$task
 
=
 
new
 
Task
(
$id
,
 
$taskDescription
);


21 


22 
     
$this
->
taskRepository
->
store
(
$task
);


23 
  
}


24 
}

```

Como se puede ver, el punto en que se debería lanzar la excepción es cuando se crea una tarea (`Task`), pero no hay razón para que sea el caso de uso quien verifique que `$taskDescription` tiene una longitud suficiente.

En su lugar, tiene sentido que esta lógica esté en `Task`. Al fin y al cabo, el caso de uso no es un lugar para aplicar reglas de negocio, sino para coordinar objetos de dominio que son quienes tienen la responsabilidad de mantenerlas.

Así que tendríamos que ir un poco más adentro y modificar el test de `Task` para que garantice que siempre se construye de forma consistente, con una descripción que tiene al menos un carácter. En caso de que la descripción esté vacía, lanzaremos la excepción.

```

 1 
namespace
 
App\Tests\TodoList\Domain
;


 2 


 3 
use
 
App\TodoList\Domain\Task
;


 4 
use
 
PHPUnit\Framework\TestCase
;


 5 
use
 
InvalidArgumentException
;


 6 


 7 
class
 
TaskTest
 
extends
 
TestCase


 8 
{


 9 
  
/** @test */


10 
  
public
 
function
 
shouldNotAllowEmptyDescription
()
:
 
void


11 
  
{


12 
      
$this
->
expectException
(
InvalidArgumentException
::
class
);


13 


14 
      
new
 
Task
(
1
,
 
''
);


15 
  
}


16 


17 
  
/** @test */


18 
  
public
 
function
 
shouldProvideRepresentation
()
:
 
void


19 
  
{


20 
      
$expected
 
=
 
'[ ] 1. Task Description'
;


21 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


22 


23 
      
$representation
 
=
 
$task
->
representedAs
(
'[:check] :id. :description'
);


24 


25 
      
self
::
assertEquals
(
$expected
,
 
$representation
);


26 
  
}


27 


28 
  
/** @test */


29 
  
public
 
function
 
shouldMarkTaskCompleted
()
:
 
void


30 
  
{


31 
      
$expected
 
=
 
'[√] 1. Task Description'
;


32 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


33 
      
$task
->
markCompleted
();


34 


35 
      
$representation
 
=
 
$task
->
representedAs
(
'[:check] :id. :description'
);


36 


37 
      
self
::
assertEquals
(
$expected
,
 
$representation
);


38 
  
}


39 
}

```

Ahora quedaría implementarlo.

```

 1 
namespace
 
App\TodoList\Domain
;


 2 


 3 
use
 
InvalidArgumentException
;


 4 


 5 
class
 
Task


 6 
{


 7 
  
private
 
int
 
$id
;


 8 
  
private
 
string
 
$description
;


 9 
  
private
 
bool
 
$completed
;


10 


11 
  
public
 
function
 
__construct
(
int
 
$id
,
 
string
 
$description
)


12 
  
{


13 
      
$this
->
id
 
=
 
$id
;


14 


15 
      
if
 
(
$description
 
===
 
''
)
 
{


16 
          
$exceptionMessage
 
=
 
'Task description should not be empty'
;


17 
          
throw
 
new
 
InvalidArgumentException
(
$exceptionMessage
);


18 
      
}


19 


20 
      
$this
->
description
 
=
 
$description
;


21 
      
$this
->
completed
 
=
 
false
;


22 
  
}


23 


24 
  
public
 
function
 
id
()
:
 
int


25 
  
{


26 
      
return
 
$this
->
id
;


27 
  
}


28 


29 
  
public
 
function
 
representedAs
(
string
 
$format
)
:
 
string


30 
  
{


31 
      
$values
 
=
 
[


32 
          
':check'
 
=>
 
$this
->
completed
 
?
 
'√'
 
:
 
' '
,


33 
          
':id'
 
=>
 
$this
->
id
,


34 
          
':description'
 
=>
 
$this
->
description


35 
      
];


36 
      
return
 
strtr
(
$format
,
 
$values
);


37 


38 
  
}


39 


40 
  
public
 
function
 
markCompleted
()
:
 
void


41 
  
{


42 
      
$this
->
completed
 
=
 
true
;


43 
  
}


44 
}

```

Esta implementación es suficiente para que pase el test unitario. Veamos si también pasan los tests en los demás niveles. Así es, todos los tests unitarios siguen pasando y también lo hace el test de aceptación.

El test de aceptación que acabamos de introducir lo dejaremos ahí porque tiene significado de negocio. Además, el test del controlador en este caso sólo verifica que éste es capaz de gestionar la excepción lanzada por la capa de dominio, mientras que el test de Task verifica que ésta se tiene que construir con una descripción adecuada.

## Tareas no encontradas

Otro defecto de nuestra aplicación tiene que ver con intentar marcar como completada una tarea que no existe. Actualmente, el *endpoint* devolverá un error 500, cuando lo correcto sería un 404 indicando que el recurso que se quiere modificar no existe.

El siguiente test de aceptación lo pone de manifiesto:

```

 1 
namespace
 
App\Tests\Katas\TodoList
;


 2 


 3 
use
 
Symfony\Bundle\FrameworkBundle\Client
;


 4 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


 5 
use
 
Symfony\Component\HttpFoundation\Response
;


 6 


 7 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


 8 
{


 9 
  
private
 
Client
 
$client
;


10 


11 
  
# ...


12 
  

13 
  
/** @test */


14 
  
public
 
function
 
asUserITryToMarkNotExistentTasksAsCompleted
()
:
 
void


15 
  
{


16 
      
$this
->
givenIHaveAddedTasks
(


17 
          
[


18 
              
'Write a test that fails'
,


19 
              
'Write code to make the test pass'
,


20 
          
]


21 
      
);


22 


23 
      
$response
 
=
 
$this
->
apiMarkTaskCompleted
(
3
);


24 


25 
      
self
::
assertEquals
(
404
,
 
$response
->
getStatusCode
());


26 
  
}


27 
  

28 
  
# ...


29 
}

```

El resultado es:

```

1 
Failed asserting that 500 matches expected 404.
```

Además de que hay un error en:

```

1 
"Undefined offset: 3" at /application/src/TodoList/Infrastructure/Persistence/FileTaskRep\

2 
ository.php
```

El error de base se produce en el repositorio. Sin embargo, vamos a proceder sistemáticamente. Como hemos visto en el ejemplo anterior, el error puede manifestarse de distintas maneras en las diferentes capas o niveles de la aplicación, por lo que tenemos que ir paso por paso, decidir si ese error tiene que manifestarse de algún modo e implementar el comportamiento necesario.

El controlador, como ya hemos visto anteriormente, es responsable de interpretar el problema y expresarlo con un error 404 en la respuesta. Por tanto, espera que el caso de uso le comunique eso con una excepción. En la práctica, significa que ese controlador tiene que reaccionar a una excepción determinada que lanzará o relanzará el caso de uso.

Así que expresamos eso en un test.

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Application\AddTaskHandler
;


 4 
use
 
App\TodoList\Application\GetTaskListHandler
;


 5 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 6 
use
 
App\TodoList\Application\TaskListTransformer
;


 7 
use
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController
;


 8 
use
 
InvalidArgumentException
;


 9 
use
 
PHPUnit\Framework\TestCase
;


10 
use
 
OutOfBoundsException
;


11 
use
 
Symfony\Component\HttpFoundation\Request
;


12 


13 
class
 
TodoListControllerTest
 
extends
 
TestCase


14 
{


15 
  
private
 
const
 
TASK_DESCRIPTION
 
=
 
'Task Description'
;


16 
  
private
 
const
 
COMPLETED_TASK_ID
 
=
 
1
;


17 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


18 
  
private
 
TodoListController
 
$todoListController
;


19 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


20 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


21 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


22 


23 
  
protected
 
function
 
setUp
()
:
 
void


24 
  
{


25 
      
$this
->
addTaskHandler
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


26 
      
$this
->
getTaskListHandler
 
=
 
$this
->
createMock
(
GetTaskListHandler
::
class
);


27 
      
$this
->
taskListTransformer
 
=
 
$this
->
createMock
(
TaskListTransformer
::
class
);


28 
      
$this
->
markTaskCompletedHandler
 
=
 
$this
->
createMock
(
MarkTaskCompletedHandler
::
cla\


29 
ss
);


30 
      
$this
->
todoListController
 
=
 
new
 
TodoListController
(


31 
          
$this
->
addTaskHandler
,


32 
          
$this
->
getTaskListHandler
,


33 
          
$this
->
taskListTransformer
,


34 
          
$this
->
markTaskCompletedHandler


35 
      
);


36 
  
}


37 


38 
  
# ...


39 
  

40 
  
/** @test */


41 
  
public
 
function
 
shouldFailWithNotFoundIdCompletingNotExistentTask
()
:
 
void


42 
  
{


43 
      
$exceptionMessage
 
=
 
'Task 3 doesn\'t exist'
;


44 
      
$exception
 
=
 
new
 
OutOfBoundsException
(
$exceptionMessage
);


45 


46 
      
$this
->
markTaskCompletedHandler


47 
          
->
method
(
'execute'
)


48 
          
->
willThrowException
(
$exception
);


49 


50 
      
$request
 
=
 
new
 
Request
(


51 
          
[],


52 
          
[],


53 
          
[],


54 
          
[],


55 
          
[],


56 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


57 
          
json_encode
([
'completed'
 
=>
 
true
],
 
JSON_THROW_ON_ERROR
)


58 
      
);


59 


60 
      
$response
 
=
 
$this
->
todoListController
->
markTaskCompleted
(
self
::
COMPLETED_TASK_ID
,
\


61 
 
$request
);


62 


63 
      
self
::
assertEquals
(
400
,
 
$response
->
getStatusCode
());


64 


65 
      
$body
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


66 


67 
      
self
::
assertEquals
(
$exceptionMessage
,
 
$body
[
'error'
]);


68 
  
}


69 


70 
}

```

Como era de esperar, el test del controlador fallará porque no se captura la excepción simulada en el  *mock* . Nos toca implementar el código para hacerlo:

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Application\AddTaskHandler
;


 4 
use
 
App\TodoList\Application\GetTaskListHandler
;


 5 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 6 
use
 
App\TodoList\Application\TaskListTransformer
;


 7 
use
 
InvalidArgumentException
;


 8 
use
 
OutOfBoundsException
;


 9 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


10 
use
 
Symfony\Component\HttpFoundation\Request
;


11 
use
 
Symfony\Component\HttpFoundation\Response
;


12 
use
 
function
 
is_string
;


13 


14 
class
 
TodoListController


15 
{


16 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


17 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


18 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


19 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


20 


21 
  
public
 
function
 
__construct
(


22 
      
AddTaskHandler
 
$addTaskHandler
,


23 
      
GetTaskListHandler
 
$getTaskListHandler
,


24 
      
TaskListTransformer
 
$taskListTransformer
,


25 
      
MarkTaskCompletedHandler
 
$markTaskCompletedHandler


26 
  
)
 
{


27 
      
$this
->
addTaskHandler
 
=
 
$addTaskHandler
;


28 
      
$this
->
getTaskListHandler
 
=
 
$getTaskListHandler
;


29 
      
$this
->
taskListTransformer
 
=
 
$taskListTransformer
;


30 
      
$this
->
markTaskCompletedHandler
 
=
 
$markTaskCompletedHandler
;


31 
  
}


32 


33 
  
# ...


34 
  

35 
  
public
 
function
 
markTaskCompleted
(
int
 
$taskId
,
 
Request
 
$request
)
:
 
Response


36 
  
{


37 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


38 


39 
      
try
 
{


40 
          
$this
->
markTaskCompletedHandler
->
execute
(
$taskId
,
 
$payload
[
'completed'
]);


41 
      
}
 
catch
 
(
OutOfBoundsException
 
$taskNotFound
)
 
{


42 
          
return
 
new
 
JsonResponse
([
'error'
 
=>
 
$taskNotFound
->
getMessage
()],
 
Response
::
H\


43 
TTP_NOT_FOUND
);


44 
      
}


45 


46 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_OK
);


47 
  
}


48 


49 
  
# ...


50 
}

```

Dado que ahora el test pasa en el controlador, volvemos al nivel de aceptación. Este nivel todavía falla porque, de hecho, no se lanza realmente ninguna excepción en el flujo de esta acción.

Necesitamos ir un poco más adentro.

Si examinamos la capa de Aplicación, el caso de uso tiene poco que hacer. Al igual que en el problema anterior, su trabajo es delegar en objetos de dominio, por lo que son estos los que deben fallar. Como he señalado antes, estoy usando excepciones genéricas, pero en proyectos reales usaríamos también excepciones del dominio en distintos niveles. Por ejemplo, una `TaskNotFound` que perfectamente podría extender de `OutOfBoundsException`.

Así que no haremos nada en el caso de uso, pero observamos que el responsable de decir que una tarea no existe será el repositorio. La primera línea del método `execute` es clara.

```

 1 
namespace
 
App\TodoList\Application
;


 2 


 3 


 4 
use
 
App\TodoList\Domain\TaskRepository
;


 5 


 6 
class
 
MarkTaskCompletedHandler


 7 
{


 8 
  
private
 
TaskRepository
 
$taskRepository
;


 9 


10 
  
public
 
function
 
__construct
(
TaskRepository
 
$taskRepository
)


11 
  
{


12 
      
$this
->
taskRepository
 
=
 
$taskRepository
;


13 
  
}


14 


15 
  
public
 
function
 
execute
(
int
 
$taskId
,
 
bool
 
$completed
)
:
 
void


16 
  
{


17 
      
$task
 
=
 
$this
->
taskRepository
->
retrieve
(
$taskId
);


18 


19 
      
if
 
(
$completed
)
 
{


20 
          
$task
->
markCompleted
();


21 
      
}


22 


23 
      
$this
->
taskRepository
->
store
(
$task
);


24 
  
}


25 
}

```

No merece la pena escribir un test que simule que el repositorio lanza una excepción y el caso de uso no hace nada. Si el caso de uso capturase excepciones que vienen de un nivel más interno para relanzarlas como una excepción distinta, una técnica que podríamos denominar de  *anidado de excepciones* , entonces sí lo haríamos para verificar eso.

Por tanto, nos vamos al nivel del repositorio y hacemos un test:

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\Persistence
;


 2 


 3 
use
 
App\Lib\FileStorageEngine
;


 4 
use
 
App\TodoList\Domain\Task
;


 5 
use
 
App\TodoList\Domain\TaskRepository
;


 6 
use
 
App\TodoList\Infrastructure\Persistence\FileTaskRepository
;


 7 
use
 
PHPUnit\Framework\TestCase
;


 8 
use
 
Symfony\Component\DependencyInjection\Exception\OutOfBoundsException
;


 9 


10 
class
 
FileTaskRepositoryTest
 
extends
 
TestCase


11 
{


12 
  
private
 
FileStorageEngine
 
$fileStorageEngine
;


13 
  
private
 
TaskRepository
 
$taskRepository
;


14 


15 
  
public
 
function
 
setUp
()
:
 
void


16 
  
{


17 
      
$this
->
fileStorageEngine
 
=
 
$this
->
createMock
(
FileStorageEngine
::
class
);


18 
      
$this
->
taskRepository
 
=
 
new
 
FileTaskRepository
(
$this
->
fileStorageEngine
);


19 
  
}


20 


21 
  
# ...


22 
  

23 
  
/** @test */


24 
  
public
 
function
 
shouldFailIfTaskNotFound
()
:
 
void


25 
  
{


26 
      
$storedTasks
 
=
 
[


27 
          
1
 
=>
 
new
 
Task
(
1
,
 
'Write a test that fails'
),


28 
          
2
 
=>
 
new
 
Task
(
2
,
 
'Write code to make the test pass'
),


29 
      
];


30 


31 
      
$this
->
fileStorageEngine


32 
          
->
method
(
'loadObjects'
)


33 
          
->
willReturn
(


34 
              
$storedTasks


35 
          
);


36 


37 
      
$this
->
expectException
(
OutOfBoundsException
::
class
);


38 
      
$this
->
taskRepository
->
retrieve
(
3
);


39 
  
}


40 
}

```

El test falla puesto que no se lanza la excepción. Así que vamos al código de producción:

```

 1 
namespace
 
App\TodoList\Infrastructure\Persistence
;


 2 


 3 


 4 
use
 
App\Lib\FileStorageEngine
;


 5 
use
 
App\TodoList\Domain\Task
;


 6 
use
 
App\TodoList\Domain\TaskRepository
;


 7 
use
 
OutOfBoundsException
;


 8 


 9 
class
 
FileTaskRepository
 
implements
 
TaskRepository


10 
{


11 
  
private
 
FileStorageEngine
 
$fileStorageEngine
;


12 


13 
  
public
 
function
 
__construct
(
FileStorageEngine
 
$fileStorageEngine
)


14 
  
{


15 
      
$this
->
fileStorageEngine
 
=
 
$fileStorageEngine
;


16 
  
}


17 


18 
  
# ...


19 
  

20 
  
public
 
function
 
retrieve
(
int
 
$taskId
)
:
 
Task


21 
  
{


22 
      
$tasks
 
=
 
$this
->
findAll
();


23 


24 
      
if
 
(
!
isset
(
$tasks
[
$taskId
]))
 
{


25 
          
throw
 
new
 
OutOfBoundsException
(


26 
              
sprintf
(
'Task %s doesn\'t exist'
,
 
$taskId
)


27 
          
);


28 
      
}


29 


30 
      
return
 
$tasks
[
$taskId
];


31 
  
}


32 


33 
  
# ...


34 
}

```

Con esta sencilla solución hacemos pasar el test. Ejecutamos de nuevo el test de aceptación para ver si el problema está resuelto.

## Resolviendo defectos

Una conclusión interesante sobre lo que acabamos de hacer es que, en realidad, resolver bugs no es más que implementar un comportamiento inexistente en el software. En este contexto, prefiero usar el término *defecto* en lugar de  *bug* .

Es más, se podría argumentar que este capítulo más que tratar de resolución de  *bugs* , trata de añadir características al software que se habían dejado atrás de manera consciente o no. En la vida real, este tipo de cosas se suele reportar como  *bug* , aunque nosotros sepamos que es una *feature* no desarrollada todavía o que no tuvimos en cuenta en su momento.

De hecho, al desarrollar el software usando TDD normalmente evitamos el tipo de defectos que se asocia habitualmente con  *bugs* , como podría ser un problema de tipado o algún despiste en el código que el lenguaje, por la razón que sea, permita que pase desapercibido.

En cualquier caso, el procedimiento es más o menos el siguiente:

* Lo primero es reproducir el *bug* mediante un test en el nivel más externo posible. Lo más seguro es que se manifieste en el test de aceptación y es lo esperable si es un problema detectado por las usuarias. Pero eso puede depender del contexto también.
* Seguidamente, vamos al siguiente nivel de la aplicación, intentando reproducir el mismo *bug* con un test unitario. Habrá niveles en que esto no sea posible y el test pase. Como hemos visto en el último ejemplo, la manifestación del *bug* en cada nivel puede ser diferente o puede no darse incluso. Si no podemos demostrar el *bug* en ese nivel, nos vamos al siguiente.
* En cada nivel, implementamos código para hacer que el test que demuestra el *bug* pase. Una vez que los tests de ese nivel están en verde, volvemos al test de aceptación.
* Si el test de aceptación continúa sin pasar, tendremos que ir un nivel más adentro en la aplicación, crear un test que describa el *bug* y resolverlo. Después de eso, volvemos al nivel de aceptación hasta que el test vuelva a pasar.
* En el momento en que el test de aceptación pase, es que ya está resuelto el defecto.

# 25 Introducción de nuevas características

En el capítulo anterior comentábamos que desde el punto del desarrollo basado en TDD los defectos pueden considerarse casi como *features* no definidas inicialmente. Otra forma de verlo es que son *features* cuando nos las piden explícitamente y son defecto cuando van implícitas en otra  *feature* , pero no las hemos desarrollado.

Es decir, cuando decimos que queremos poder marcar una tarea como completada, por seguir con nuestro proyecto de lista de tareas, se asume que debería evitarse que el sistema se rompa si intentamos marcar una tarea inexistente. Por eso diríamos que esa feature tenía un defecto y es lo que hemos arreglado en el capítulo anterior.

Pero en este capítulo vamos a tratar sobre cómo añadir nuevas prestaciones a un software existente utilizando una aproximación TDD. Y, como cabe esperar, en realidad no vamos a introducir cambios en nuestra metodología. Seguiremos empezando con un test de aceptación y profundizando en la aplicación y los cambios necesarios.

Con todo se trata de un escenario distinto. Un nuevo comportamiento puede requerir modificar unidades de software existentes y necesitamos que los cambios no rompan funcionalidad ya creada.

## Nueva historia de usuario

La siguiente petición de negocio es permitir editar una tarea existente.

### US-4

* As a user
* I want to modify a existing task in the list
* So that, I can express my ideas better

Inicialmente esta historia requiere crear un nuevo *endpoint* con el que cambiar la información de una tarea.

```

1 
PUT /api/todo/{taskId}

```

Si nuestra aplicación tiene un *front-end* es posible que necesitemos un *endpoint* para recuperar la información de la tarea que queremos editar, a fin de poder rellenar el formulario con los datos actuales. En ese caso, sería:

```

1 
GET /api/todo/{taskId}

```

En ambos casos, el procedimiento será el mismo: empezaremos creando un test de aceptación, iniciando el proceso de desarrollo. Lo que sí nos encontraremos es que algunos componentes necesarios están ya creados.

```

 1 
namespace
 
App\Tests\Katas\TodoList
;


 2 


 3 
use
 
Symfony\Bundle\FrameworkBundle\Client
;


 4 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


 5 
use
 
Symfony\Component\HttpFoundation\Response
;


 6 


 7 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


 8 
{


 9 
  
private
 
Client
 
$client
;


10 


11 
  
# ...


12 
  

13 
  
public
 
function
 
asUserIWantToModifyAnExistingTask
()
:
 
void


14 
  
{


15 
      
$this
->
givenIHaveAddedTasks
(


16 
          
[


17 
              
'Write a test that fails'
,


18 
              
'Write code to make the test pass'
,


19 
          
]


20 
      
);


21 


22 
      
$this
->
client
->
request
(


23 
          
'PUT'
,


24 
          
'/api/todo/2'
,


25 
          
[],


26 
          
[],


27 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


28 
          
json_encode
([
'task'
 
=>
 
'Write production code to make the test pass'
],
 
JSON_T\


29 
HROW_ON_ERROR
)


30 
      
);


31 


32 
      
$putResponse
 
=
 
$this
->
client
->
getResponse
();


33 
      

34 
      
self
::
assertEquals
(
204
,
 
$putResponse
->
getStatusCode
());


35 


36 
      
$response
 
=
 
$this
->
whenIRequestTheListOfTasks
();


37 
      
$this
->
thenICanSeeAddedTasksInTheList
(


38 
          
[


39 
              
'[ ] 1. Write a test that fails'
,


40 
              
'[ ] 2. Write production code to make the test pass'
,


41 
          
],


42 
          
$response


43 
      
);


44 
  
}


45 
  

46 
  
# ...


47 
}

```

Así que ejecutamos el test para ver qué nos dice. Como era de esperar, el *endpoint* no se puede encontrar porque no tenemos la ruta, así que empezamos por definirla.

```

 1 
api_add_task
:


 2 
  
path
:
 
/api/todo


 3 
  
controller
:
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController::addTask


 4 
  
methods
:
 
[
'POST'
]


 5 


 6 
api_get_task_list
:


 7 
  
path
:
 
/api/todo


 8 
  
controller
:
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController::getTaskList


 9 
  
methods
:
 
[
'GET'
]


10 


11 
api_mark_task_completed
:


12 
  
path
:
 
/api/todo/{taskId}


13 
  
controller
:
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController::markTaskComp\


14 
leted


15 
  
methods
:
 
[
'PATCH'
]


16 


17 
api_edit_task
:


18 
  
path
:
 
/api/todo/{taskId}


19 
  
controller
:
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController::modifyTask


20 
  
methods
:
 
[
'PUT'
]

```

Al volver a lanzar el test tras este cambio, nos indicará que no una acción en el controlador para responder a esta ruta.

```

1 
"The controller for URI "/api/todo/2" is not callable. Expected method "modifyTask"
```

Así que tendremos que añadir una nueva acción vacía.

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Application\AddTaskHandler
;


 4 
use
 
App\TodoList\Application\GetTaskListHandler
;


 5 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 6 
use
 
App\TodoList\Application\TaskListTransformer
;


 7 
use
 
InvalidArgumentException
;


 8 
use
 
OutOfBoundsException
;


 9 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


10 
use
 
Symfony\Component\HttpFoundation\Request
;


11 
use
 
Symfony\Component\HttpFoundation\Response
;


12 
use
 
function
 
is_string
;


13 


14 
class
 
TodoListController


15 
{


16 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


17 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


18 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


19 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


20 


21 
  
public
 
function
 
__construct
(


22 
      
AddTaskHandler
 
$addTaskHandler
,


23 
      
GetTaskListHandler
 
$getTaskListHandler
,


24 
      
TaskListTransformer
 
$taskListTransformer
,


25 
      
MarkTaskCompletedHandler
 
$markTaskCompletedHandler


26 
  
)
 
{


27 
      
$this
->
addTaskHandler
 
=
 
$addTaskHandler
;


28 
      
$this
->
getTaskListHandler
 
=
 
$getTaskListHandler
;


29 
      
$this
->
taskListTransformer
 
=
 
$taskListTransformer
;


30 
      
$this
->
markTaskCompletedHandler
 
=
 
$markTaskCompletedHandler
;


31 
  
}


32 


33 
  
# ...


34 
  

35 
  
public
 
function
 
modifyTask
(
int
 
$taskId
,
 
Request
 
$request
)
:
 
Response


36 
  
{


37 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s'
,
 
__METHOD__
));


38 
  
}


39 


40 
  
# ...


41 
}

```

En la nueva ejecución del test, el error será:

```

1 
RuntimeException: "Implement App\TodoList\Infrastructure\EntryPoint\Api\TodoListControlle\

2 
r::modifyTask"
```

Lo que nos dice que tenemos que entrar al nivel unitario para implementar esta acción en el controlador. Todo este ciclo te sonará porque es lo que hemos estado haciendo en toda esta parte del libro.

Pero lo cierto es que esta rutina es algo positivo. En cada momento siempre tenemos una tarea concreta que afrontar, ya sea crear un test, ya sea código de producción, y no tenemos que preocuparnos de ninguna otra cosa. El test de aceptación nos va diciendo qué hacer, y en cada nivel sólo tenemos que pensar en ese componente concreto.

A nosotras ahora nos toca implementar el controlador. Como ya sabemos, en esta fase tenemos que diseñar. Básicamente es una acción similar a la de añadir una tarea, pero en este caso recibimos el id de la tarea que vamos a cambiar y su nueva descripción.

Necesitaremos un caso de uso que expresa esta intención de las usuarias al que le pasaremos los dos datos que necesitamos. Si todo va como es debido, devolvemos la respuesta 204 (no content).

Añadimos un test que recoge todo esto:

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Application\AddTaskHandler
;


 4 
use
 
App\TodoList\Application\GetTaskListHandler
;


 5 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 6 
use
 
App\TodoList\Application\TaskListTransformer
;


 7 
use
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController
;


 8 
use
 
InvalidArgumentException
;


 9 
use
 
PHPUnit\Framework\TestCase
;


10 
use
 
OutOfBoundsException
;


11 
use
 
Symfony\Component\HttpFoundation\Request
;


12 


13 
class
 
TodoListControllerTest
 
extends
 
TestCase


14 
{


15 
  
private
 
const
 
TASK_DESCRIPTION
 
=
 
'Task Description'
;


16 
  
private
 
const
 
COMPLETED_TASK_ID
 
=
 
1
;


17 
  
private
 
const
 
TASK_ID
 
=
 
1
;


18 


19 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


20 
  
private
 
TodoListController
 
$todoListController
;


21 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


22 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


23 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


24 
  
private
 
UpdateTaskHandler
 
$updateTaskHandler
;


25 


26 
  
protected
 
function
 
setUp
()
:
 
void


27 
  
{


28 
      
$this
->
addTaskHandler
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


29 
      
$this
->
getTaskListHandler
 
=
 
$this
->
createMock
(
GetTaskListHandler
::
class
);


30 
      
$this
->
taskListTransformer
 
=
 
$this
->
createMock
(
TaskListTransformer
::
class
);


31 
      
$this
->
markTaskCompletedHandler
 
=
 
$this
->
createMock
(
MarkTaskCompletedHandler
::
cla\


32 
ss
);


33 
      
$this
->
updateTaskHandler
 
=
 
$this
->
createMock
(
UpdateTaskHandler
::
class
);


34 


35 
      
$this
->
todoListController
 
=
 
new
 
TodoListController
(


36 
          
$this
->
addTaskHandler
,


37 
          
$this
->
getTaskListHandler
,


38 
          
$this
->
taskListTransformer
,


39 
          
$this
->
markTaskCompletedHandler
,


40 
          
$this
->
updateTaskHandler


41 
      
);


42 
  
}


43 


44 
  
# ...


45 
  

46 
  
/** @test */


47 
  
public
 
function
 
shouldModifyATask
()
:
 
void


48 
  
{


49 
      
$this
->
updateTaskHandler


50 
          
->
expects
(
self
::
once
())


51 
          
->
method
(
'execute'
)


52 
          
->
with
(
self
::
TASK_ID
,
 
self
::
TASK_DESCRIPTION
);


53 


54 
      
$request
 
=
 
new
 
Request
(


55 
          
[],


56 
          
[],


57 
          
[],


58 
          
[],


59 
          
[],


60 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


61 
          
json_encode
([
'task'
 
=>
 
self
::
TASK_DESCRIPTION
],
 
JSON_THROW_ON_ERROR
)


62 
      
);


63 


64 
      
$response
 
=
 
$this
->
todoListController
->
modifyTask
(
self
::
TASK_ID
,
$request
);


65 


66 
      
self
::
assertEquals
(
204
,
 
$response
->
getStatusCode
());


67 
  
}


68 


69 
  
# ...


70 
}

```

Si ejecutamos el test nos pedirá crear el caso de uso `UpdateTaskHandler`.

```

1 
namespace
 
App\TodoList\Application
;


2 


3 
class
 
UpdateTaskHandler


4 
{


5 
}

```

Y seguidamente nos pedirá introducir el método `execute`.

```

1 
namespace
 
App\TodoList\Application
;


2 


3 
class
 
UpdateTaskHandler


4 
{


5 
  
public
 
function
 
execute
()


6 
  
{


7 
      
throw
 
new
 
\RuntimeException
(
sprintf
(
'Implement %s'
,
 
__METHOD__
));


8 
  
}


9 
}

```

Una vez que tenemos eso ya nos vuelve a pedir implementar la acción del controlador. Así que vamos a ello:

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Application\AddTaskHandler
;


 4 
use
 
App\TodoList\Application\GetTaskListHandler
;


 5 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 6 
use
 
App\TodoList\Application\UpdateTaskHandler
;


 7 
use
 
App\TodoList\Application\TaskListTransformer
;


 8 
use
 
InvalidArgumentException
;


 9 
use
 
OutOfBoundsException
;


10 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


11 
use
 
Symfony\Component\HttpFoundation\Request
;


12 
use
 
Symfony\Component\HttpFoundation\Response
;


13 
use
 
function
 
is_string
;


14 


15 
class
 
TodoListController


16 
{


17 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


18 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


19 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


20 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


21 
  
private
 
UpdateTaskHandler
 
$updateTaskHandler
;


22 


23 
  
public
 
function
 
__construct
(


24 
      
AddTaskHandler
 
$addTaskHandler
,


25 
      
GetTaskListHandler
 
$getTaskListHandler
,


26 
      
TaskListTransformer
 
$taskListTransformer
,


27 
      
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
,


28 
      
UpdateTaskHandler
 
$updateTaskHandler


29 
  
)
 
{


30 
      
$this
->
addTaskHandler
 
=
 
$addTaskHandler
;


31 
      
$this
->
getTaskListHandler
 
=
 
$getTaskListHandler
;


32 
      
$this
->
taskListTransformer
 
=
 
$taskListTransformer
;


33 
      
$this
->
markTaskCompletedHandler
 
=
 
$markTaskCompletedHandler
;


34 
      
$this
->
updateTaskHandler
 
=
 
$updateTaskHandler
;


35 
  
}


36 


37 
  
# ...


38 


39 
  
public
 
function
 
modifyTask
(
int
 
$taskId
,
 
Request
 
$request
)
:
 
Response


40 
  
{


41 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


42 


43 
      
$this
->
updateTaskHandler
->
execute
(
$taskId
,
 
$payload
[
'task'
]);


44 


45 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_NO_CONTENT
);


46 
  
}


47 


48 
  
# ...


49 
}

```

Y el test unitario del controlador ya pasa. Si volvemos al test de aceptación, como corresponde ahora, nos dirá que es lo que tenemos que hacer a continuación:

```

1 
RuntimeException: "Implement App\TodoList\Application\UpdateTaskHandler::execute"
```

Así que nos toca meternos en la capa de Aplicación. De nuevo, tenemos que diseñar este nivel, que nos plantea un problema interesante.

En principio hemos definido que lo que se puede cambiar en la tarea es su descripción, por lo que esta acción tiene que respetar el estado actual del flag de completado. Así que queremos obtener la tarea guardada, modificar su descripción y guardarla.

Por tanto, pediremos la tarea al repositorio, la cambiaremos y la guardaremos de nuevo.

```

 1 
namespace
 
App\Tests\TodoList\Application
;


 2 


 3 
use
 
App\TodoList\Application\UpdateTaskHandler
;


 4 
use
 
App\TodoList\Domain\Task
;


 5 
use
 
App\TodoList\Domain\TaskRepository
;


 6 
use
 
PHPUnit\Framework\TestCase
;


 7 


 8 
class
 
UpdateTaskHandlerTest
 
extends
 
TestCase


 9 
{


10 


11 
  
private
 
const
 
TASK_ID
 
=
 
1
;


12 


13 
  
public
 
function
 
testShouldUpdateATask
()
:
 
void


14 
  
{


15 
      
$task
 
=
 
new
 
Task
(
self
::
TASK_ID
,
 
'Task Description'
);


16 
      
$taskRepository
 
=
 
$this
->
createMock
(
TaskRepository
::
class
);


17 
      
$taskRepository


18 
          
->
method
(
'retrieve'
)


19 
          
->
with
(
self
::
TASK_ID
)


20 
          
->
willReturn
(
$task
);


21 
      
$taskRepository


22 
          
->
expects
(
self
::
once
())


23 
          
->
method
(
'store'
)


24 
          
->
with
(
new
 
Task
(
self
::
TASK_ID
,
 
'New Task Description'
));


25 


26 
      
$updateTaskHandler
 
=
 
new
 
UpdateTaskHandler
(
$taskRepository
);


27 


28 
      
$updateTaskHandler
->
execute
(
self
::
TASK_ID
,
 
'New Task Description'
);


29 
  
}


30 
}

```

Cuando ejecutamos el test, nos pedirá implementar el caso de uso, puesto que el repositorio ya está definido con anterioridad.

La implementación seguramente nos forzará a introducir algún nuevo método en `Task`, de modo que se pueda actualizar la descripción. Esta implementación, por ejemplo:

```

 1 
namespace
 
App\TodoList\Application
;


 2 


 3 
use
 
App\TodoList\Domain\TaskRepository
;


 4 


 5 
class
 
UpdateTaskHandler


 6 
{


 7 


 8 
  
private
 
TaskRepository
 
$taskRepository
;


 9 


10 
  
public
 
function
 
__construct
(
TaskRepository
 
$taskRepository
)


11 
  
{


12 
      
$this
->
taskRepository
 
=
 
$taskRepository
;


13 
  
}


14 


15 
  
public
 
function
 
execute
(
int
 
$taskId
,
 
string
 
$newTaskDescription
)
:
 
void


16 
  
{


17 
      
$task
 
=
 
$this
->
taskRepository
->
retrieve
(
$taskId
);


18 


19 
      
$task
->
updateDescription
(
$newTaskDescription
);


20 


21 
      
$this
->
taskRepository
->
store
(
$task
);


22 
  
}


23 
}

```

He elegido esta implementación para simplificar, sin embargo, a medida que hago esta prueba se me ocurren algunas ideas que podrían ser interesantes en un caso de uso realista, como podría ser aplicar cierta inmutabilidad. Es decir, en lugar de actualizar el objeto `Task`, crearíamos uno nuevo con nuevos valores.

Pero dejaremos estos refinamientos para otra ocasión. Si ejecutamos el test, nos dirá que `Task` carece del método `updateDescription`, que tendremos que desarrollar con ayuda de un test unitario.

```

 1 
namespace
 
App\Tests\TodoList\Domain
;


 2 


 3 
use
 
App\TodoList\Domain\Task
;


 4 
use
 
PHPUnit\Framework\TestCase
;


 5 
use
 
InvalidArgumentException
;


 6 


 7 
class
 
TaskTest
 
extends
 
TestCase


 8 
{


 9 
  
/** @test */


10 
  
public
 
function
 
shouldNotAllowEmptyDescription
()
:
 
void


11 
  
{


12 
      
$this
->
expectException
(
InvalidArgumentException
::
class
);


13 


14 
      
new
 
Task
(
1
,
 
''
);


15 
  
}


16 


17 
  
/** @test */


18 
  
public
 
function
 
shouldProvideRepresentation
()
:
 
void


19 
  
{


20 
      
$expected
 
=
 
'[ ] 1. Task Description'
;


21 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


22 


23 
      
$representation
 
=
 
$task
->
representedAs
(
'[:check] :id. :description'
);


24 


25 
      
self
::
assertEquals
(
$expected
,
 
$representation
);


26 
  
}


27 


28 
  
/** @test */


29 
  
public
 
function
 
shouldMarkTaskCompleted
()
:
 
void


30 
  
{


31 
      
$expected
 
=
 
'[√] 1. Task Description'
;


32 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


33 
      
$task
->
markCompleted
();


34 


35 
      
$representation
 
=
 
$task
->
representedAs
(
'[:check] :id. :description'
);


36 


37 
      
self
::
assertEquals
(
$expected
,
 
$representation
);


38 
  
}


39 


40 
  
/** @test */


41 
  
public
 
function
 
shouldUpdateDescription
()
:
 
void


42 
  
{


43 
      
$expected
 
=
 
'[ ] 1. New Task Description'
;


44 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


45 
      
$task
->
updateDescription
(
'New Task Description'
);


46 


47 
      
$representation
 
=
 
$task
->
representedAs
(
'[:check] :id. :description'
);


48 


49 
      
self
::
assertEquals
(
$expected
,
 
$representation
);


50 
  
}


51 


52 
}

```

Para hacer pasar el test tenemos que introducir el método.

```

 1 
namespace
 
App\TodoList\Domain
;


 2 


 3 
use
 
InvalidArgumentException
;


 4 


 5 
class
 
Task


 6 
{


 7 
  
private
 
int
 
$id
;


 8 
  
private
 
string
 
$description
;


 9 
  
private
 
bool
 
$completed
;


10 


11 
  
public
 
function
 
__construct
(
int
 
$id
,
 
string
 
$description
)


12 
  
{


13 
      
$this
->
id
 
=
 
$id
;


14 


15 
      
if
 
(
$description
 
===
 
''
)
 
{


16 
          
$exceptionMessage
 
=
 
'Task description should not be empty'
;


17 
          
throw
 
new
 
InvalidArgumentException
(
$exceptionMessage
);


18 
      
}


19 


20 
      
$this
->
description
 
=
 
$description
;


21 
      
$this
->
completed
 
=
 
false
;


22 
  
}


23 


24 
  
public
 
function
 
id
()
:
 
int


25 
  
{


26 
      
return
 
$this
->
id
;


27 
  
}


28 


29 
  
public
 
function
 
representedAs
(
string
 
$format
)
:
 
string


30 
  
{


31 
      
$values
 
=
 
[


32 
          
':check'
 
=>
 
$this
->
completed
 
?
 
'√'
 
:
 
' '
,


33 
          
':id'
 
=>
 
$this
->
id
,


34 
          
':description'
 
=>
 
$this
->
description


35 
      
];


36 
      
return
 
strtr
(
$format
,
 
$values
);


37 


38 
  
}


39 


40 
  
public
 
function
 
markCompleted
()
:
 
void


41 
  
{


42 
      
$this
->
completed
 
=
 
true
;


43 
  
}


44 


45 
  
public
 
function
 
updateDescription
(
string
 
$newTaskDescription
)
:
 
void


46 
  
{


47 
      
$this
->
description
 
=
 
$newTaskDescription
;


48 
  
}


49 
}

```

El test pasa, pero nos hemos dado cuenta un problema. Hace nada hemos implementado una validación para impedir que `Task::description` pueda ser una cadena vacía. Para asegurar que cumplimos esta regla de negocio, deberíamos introducir otro test que lo verifique e implementar la respuesta que queramos dar a este caso.

Sin embargo esto no lo hemos cubierto en el nivel de aceptación o en el del controlador. ¿Qué deberíamos hacer entonces? ¿Resolverlo ahora y añadir tests en los otros niveles después o esperar y añadir esa protección en una nueva iteración?

Personalmente creo que la mejor respuesta es tomar nota de esto y resolverlo en un nuevo ciclo. Es importante centrarnos ahora en la característica que estamos desarrollando y terminar este ciclo.

Por tanto, al hacer pasar el test unitario de `Task`, volvemos primero al test de `UpdateTaskHandler` y comprobamos si ya pasa, cosa que ocurre.

Y con este nivel en verde, probamos de nuevo en el de aceptación, que también pasa sin más problemas.

El resultado es que la nueva historia está implementada, aunque como hemos descubierto necesitamos hacer una iteración para prevenir el problema de intentar cambiar las descripción de una historia con un valor no válido.

¿Lo hubiésemos podido prevenir antes? Puede ser, sin embargo, igualmente necesitaríamos introducir tests en los distintos niveles, al igual que hicimos en el capítulo anterior. El valor de usar TDD es justamente desarrollar una serie de hábitos de pensamiento y una cierta automatización. En otras palabras, desarrollar una disciplina y llegar a todos los objetivos paso a paso.

## Completar la historia

En cualquier caso, todo nuevo comportamiento del sistema tendría que estar definido mediante un test. Así que necesitaremos un test para incluir el cumplimiento de la regla de negocio, lo que nos lleva de nuevo al nivel de aceptación.

Puesto que es una regla de negocio, este test lo conservaremos después.

```

 1 
namespace
 
App\Tests\Katas\TodoList
;


 2 


 3 
use
 
Symfony\Bundle\FrameworkBundle\Client
;


 4 
use
 
Symfony\Bundle\FrameworkBundle\Test\WebTestCase
;


 5 
use
 
Symfony\Component\HttpFoundation\Response
;


 6 


 7 
class
 
TodoListAcceptanceTest
 
extends
 
WebTestCase


 8 
{


 9 
  
private
 
Client
 
$client
;


10 


11 
  
# ..


12 


13 
  
/** @test */


14 
  
public
 
function
 
asUserITryToUpdateTaskWithAnEmptyTaskDescription
()
:
 
void


15 
  
{


16 
      
$this
->
givenIHaveAddedTasks
(


17 
          
[


18 
              
'Write a test that fails'
,


19 
              
'Write code to make the test pass'
,


20 
          
]


21 
      
);


22 


23 
      
$this
->
client
->
request
(


24 
          
'PUT'
,


25 
          
'/api/todo/1'
,


26 
          
[],


27 
          
[],


28 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


29 
          
json_encode
([
'task'
 
=>
 
''
],
 
JSON_THROW_ON_ERROR
)


30 
      
);


31 


32 
      
$response
 
=
 
$this
->
client
->
getResponse
();


33 


34 
      
self
::
assertEquals
(
400
,
 
$response
->
getStatusCode
());


35 


36 
      
$body
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


37 


38 
      
self
::
assertEquals
(
'Task description should not be empty'
,
 
$body
[
'error'
]);


39 
  
}


40 


41 
  
# ...


42 
}

```

El test falla:

```

1 
Failed asserting that 204 matches expected 400.
```

Lo que nos indica que se pueden crear tareas y modificarlas vaciando la descripción.

Ahora veamos cómo solucionar esto. Con la información disponible no tenemos una pista sobre dónde hay que intervenir.

Matizo: obviamente sabemos que hay que añadir una validación en el método `updateDescription` que hemos añadido en `Task`. Sin embargo saltarnos los pasos sólo nos llevaría a generar *puntos ciegos* en el desarrollo. No basta con lanzar una excepción desde `Task`, tenemos que asegurarnos de que el componente adecuado la captura y reacciona de la forma adecuada. Proceder sistemáticamente nos ayudará a evitar estos riesgos.

De hecho, el componente que tiene la responsabilidad de comunicarse en primera instancia con el test de aceptación es el controlador y, como ya hemos visto, es quien produce el código de respuesta que evaluamos en el test de aceptación. Por tanto, es el primer lugar en el que vamos a intervenir. Por supuesto, definiendo con un test el comportamiento que esperamos.

```

 1 
namespace
 
App\Tests\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Application\AddTaskHandler
;


 4 
use
 
App\TodoList\Application\GetTaskListHandler
;


 5 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 6 
use
 
App\TodoList\Application\UpdateTaskHandler
;


 7 
use
 
App\TodoList\Application\TaskListTransformer
;


 8 
use
 
App\TodoList\Infrastructure\EntryPoint\Api\TodoListController
;


 9 
use
 
InvalidArgumentException
;


10 
use
 
PHPUnit\Framework\TestCase
;


11 
use
 
OutOfBoundsException
;


12 
use
 
Symfony\Component\HttpFoundation\Request
;


13 


14 
class
 
TodoListControllerTest
 
extends
 
TestCase


15 
{


16 
  
private
 
const
 
TASK_DESCRIPTION
 
=
 
'Task Description'
;


17 
  
private
 
const
 
COMPLETED_TASK_ID
 
=
 
1
;


18 
  
private
 
const
 
TASK_ID
 
=
 
1
;


19 


20 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


21 
  
private
 
TodoListController
 
$todoListController
;


22 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


23 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


24 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


25 
  
private
 
UpdateTaskHandler
 
$updateTaskHandler
;


26 


27 
  
protected
 
function
 
setUp
()
:
 
void


28 
  
{


29 
      
$this
->
addTaskHandler
 
=
 
$this
->
createMock
(
AddTaskHandler
::
class
);


30 
      
$this
->
getTaskListHandler
 
=
 
$this
->
createMock
(
GetTaskListHandler
::
class
);


31 
      
$this
->
taskListTransformer
 
=
 
$this
->
createMock
(
TaskListTransformer
::
class
);


32 
      
$this
->
markTaskCompletedHandler
 
=
 
$this
->
createMock
(
MarkTaskCompletedHandler
::
cla\


33 
ss
);


34 
      
$this
->
updateTaskHandler
 
=
 
$this
->
createMock
(
UpdateTaskHandler
::
class
);


35 


36 
      
$this
->
todoListController
 
=
 
new
 
TodoListController
(


37 
          
$this
->
addTaskHandler
,


38 
          
$this
->
getTaskListHandler
,


39 
          
$this
->
taskListTransformer
,


40 
          
$this
->
markTaskCompletedHandler
,


41 
          
$this
->
updateTaskHandler


42 
      
);


43 
  
}


44 


45 
  
# ...


46 
  

47 
  
/** @test */


48 
  
public
 
function
 
shouldFailWithBadRequestIfTaskDescriptionIsEmptyWhenUpdating
()
:
 
void


49 
  
{


50 
      
$exceptionMessage
 
=
 
'Task description should not be empty'
;


51 
      
$exception
 
=
 
new
 
InvalidArgumentException
(
$exceptionMessage
);


52 


53 
      
$this
->
updateTaskHandler


54 
          
->
method
(
'execute'
)


55 
          
->
willThrowException
(
$exception
)


56 
          
->
with
(
1
,
 
''
);


57 


58 


59 
      
$request
 
=
 
new
 
Request
(


60 
          
[],


61 
          
[],


62 
          
[],


63 
          
[],


64 
          
[],


65 
          
[
'CONTENT-TYPE'
 
=>
 
'json/application'
],


66 
          
json_encode
([
'task'
 
=>
 
''
],
 
JSON_THROW_ON_ERROR
)


67 
      
);


68 


69 
      
$response
 
=
 
$this
->
todoListController
->
modifyTask
(
1
,
 
$request
);


70 


71 
      
self
::
assertEquals
(
400
,
 
$response
->
getStatusCode
());


72 


73 
      
$body
 
=
 
json_decode
(
$response
->
getContent
(),
 
true
);


74 


75 
      
self
::
assertEquals
(
$exceptionMessage
,
 
$body
[
'error'
]);


76 
  
}


77 


78 
}

```

Al ejecutar el test en este nivel, vemos que falla porque se tira la excepción y no se controla. Implementamos la gestión de excepciones exactamente igual que en la acción de crear.

```

 1 
namespace
 
App\TodoList\Infrastructure\EntryPoint\Api
;


 2 


 3 
use
 
App\TodoList\Application\AddTaskHandler
;


 4 
use
 
App\TodoList\Application\GetTaskListHandler
;


 5 
use
 
App\TodoList\Application\MarkTaskCompletedHandler
;


 6 
use
 
App\TodoList\Application\UpdateTaskHandler
;


 7 
use
 
App\TodoList\Application\TaskListTransformer
;


 8 
use
 
InvalidArgumentException
;


 9 
use
 
OutOfBoundsException
;


10 
use
 
Symfony\Component\HttpFoundation\JsonResponse
;


11 
use
 
Symfony\Component\HttpFoundation\Request
;


12 
use
 
Symfony\Component\HttpFoundation\Response
;


13 
use
 
function
 
is_string
;


14 


15 
class
 
TodoListController


16 
{


17 
  
private
 
AddTaskHandler
 
$addTaskHandler
;


18 
  
private
 
GetTaskListHandler
 
$getTaskListHandler
;


19 
  
private
 
TaskListTransformer
 
$taskListTransformer
;


20 
  
private
 
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
;


21 
  
private
 
UpdateTaskHandler
 
$updateTaskHandler
;


22 


23 
  
public
 
function
 
__construct
(


24 
      
AddTaskHandler
 
$addTaskHandler
,


25 
      
GetTaskListHandler
 
$getTaskListHandler
,


26 
      
TaskListTransformer
 
$taskListTransformer
,


27 
      
MarkTaskCompletedHandler
 
$markTaskCompletedHandler
,


28 
      
UpdateTaskHandler
 
$updateTaskHandler


29 
  
)
 
{


30 
      
$this
->
addTaskHandler
 
=
 
$addTaskHandler
;


31 
      
$this
->
getTaskListHandler
 
=
 
$getTaskListHandler
;


32 
      
$this
->
taskListTransformer
 
=
 
$taskListTransformer
;


33 
      
$this
->
markTaskCompletedHandler
 
=
 
$markTaskCompletedHandler
;


34 
      
$this
->
updateTaskHandler
 
=
 
$updateTaskHandler
;


35 
  
}


36 


37 
  
# ...


38 
  

39 
  
public
 
function
 
markTaskCompleted
(
int
 
$taskId
,
 
Request
 
$request
)
:
 
Response


40 
  
{


41 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


42 


43 
      
try
 
{


44 
          
$this
->
markTaskCompletedHandler
->
execute
(
$taskId
,
 
$payload
[
'completed'
]);


45 
      
}
 
catch
 
(
OutOfBoundsException
 
$taskNotFound
)
 
{


46 
          
return
 
new
 
JsonResponse
([
'error'
 
=>
 
$taskNotFound
->
getMessage
()],
 
Response
::
H\


47 
TTP_NOT_FOUND
);


48 
      
}


49 


50 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_OK
);


51 
  
}


52 


53 
  
public
 
function
 
modifyTask
(
int
 
$taskId
,
 
Request
 
$request
)
:
 
Response


54 
  
{


55 
      
$payload
 
=
 
$this
->
obtainPayload
(
$request
);


56 


57 
      
try
 
{


58 
          
$this
->
updateTaskHandler
->
execute
(
$taskId
,
 
$payload
[
'task'
]);


59 
      
}
 
catch
 
(
\InvalidArgumentException
 
$invalidTaskDescription
)
 
{


60 
          
return
 
new
 
JsonResponse
([
'error'
 
=>
 
$invalidTaskDescription
->
getMessage
()],
 
R\


61 
esponse
::
HTTP_BAD_REQUEST
);


62 
      
}


63 


64 
      
return
 
new
 
JsonResponse
(
''
,
 
Response
::
HTTP_NO_CONTENT
);


65 
  
}


66 


67 
  
# ...


68 
}

```

Esto hace que el test de controlador pase. Si chequeamos el test de aceptación vemos que sigue dando el mismo error.

El siguiente nivel es el caso de uso, que como hemos visto antes, es irrelevante porque simplemente dejará subir la excepción. Como ya sabemos, es `Task` quien se debe responsabilizar, así que ahora es el momento de abordar ese cambio, definiendo el comportamiento deseado en el test:

```

 1 
namespace
 
App\Tests\TodoList\Domain
;


 2 


 3 
use
 
App\TodoList\Domain\Task
;


 4 
use
 
PHPUnit\Framework\TestCase
;


 5 
use
 
InvalidArgumentException
;


 6 


 7 
class
 
TaskTest
 
extends
 
TestCase


 8 
{


 9 
  
/** @test */


10 
  
public
 
function
 
shouldNotAllowEmptyDescription
()
:
 
void


11 
  
{


12 
      
$this
->
expectException
(
InvalidArgumentException
::
class
);


13 


14 
      
new
 
Task
(
1
,
 
''
);


15 
  
}


16 


17 
  
/** @test */


18 
  
public
 
function
 
shouldProvideRepresentation
()
:
 
void


19 
  
{


20 
      
$expected
 
=
 
'[ ] 1. Task Description'
;


21 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


22 


23 
      
$representation
 
=
 
$task
->
representedAs
(
'[:check] :id. :description'
);


24 


25 
      
self
::
assertEquals
(
$expected
,
 
$representation
);


26 
  
}


27 


28 
  
/** @test */


29 
  
public
 
function
 
shouldMarkTaskCompleted
()
:
 
void


30 
  
{


31 
      
$expected
 
=
 
'[√] 1. Task Description'
;


32 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


33 
      
$task
->
markCompleted
();


34 


35 
      
$representation
 
=
 
$task
->
representedAs
(
'[:check] :id. :description'
);


36 


37 
      
self
::
assertEquals
(
$expected
,
 
$representation
);


38 
  
}


39 


40 
  
/** @test */


41 
  
public
 
function
 
shouldUpdateDescription
()
:
 
void


42 
  
{


43 
      
$expected
 
=
 
'[ ] 1. New Task Description'
;


44 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


45 
      
$task
->
updateDescription
(
'New Task Description'
);


46 


47 
      
$representation
 
=
 
$task
->
representedAs
(
'[:check] :id. :description'
);


48 


49 
      
self
::
assertEquals
(
$expected
,
 
$representation
);


50 
  
}


51 


52 
  
/** @test */


53 
  
public
 
function
 
shouldFailUpdatingWithInvalidDescription
()
:
 
void


54 
  
{


55 
      
$this
->
expectException
(
InvalidArgumentException
::
class
);


56 


57 
      
$task
 
=
 
new
 
Task
(
1
,
 
'Task Description'
);


58 
      
$task
->
updateDescription
(
''
);


59 
  
}


60 
}

```

Al no haber nada implementado, el test fallará.

Empezamos con una implementación bastante obvia:

```

 1 
namespace
 
App\TodoList\Domain
;


 2 


 3 
use
 
InvalidArgumentException
;


 4 


 5 
class
 
Task


 6 
{


 7 
  
private
 
int
 
$id
;


 8 
  
private
 
string
 
$description
;


 9 
  
private
 
bool
 
$completed
;


10 


11 
  
public
 
function
 
__construct
(
int
 
$id
,
 
string
 
$description
)


12 
  
{


13 
      
$this
->
id
 
=
 
$id
;


14 


15 
      
if
 
(
$description
 
===
 
''
)
 
{


16 
          
$exceptionMessage
 
=
 
'Task description should not be empty'
;


17 
          
throw
 
new
 
InvalidArgumentException
(
$exceptionMessage
);


18 
      
}


19 


20 
      
$this
->
description
 
=
 
$description
;


21 
      
$this
->
completed
 
=
 
false
;


22 
  
}


23 


24 
  
public
 
function
 
id
()
:
 
int


25 
  
{


26 
      
return
 
$this
->
id
;


27 
  
}


28 


29 
  
public
 
function
 
representedAs
(
string
 
$format
)
:
 
string


30 
  
{


31 
      
$values
 
=
 
[


32 
          
':check'
 
=>
 
$this
->
completed
 
?
 
'√'
 
:
 
' '
,


33 
          
':id'
 
=>
 
$this
->
id
,


34 
          
':description'
 
=>
 
$this
->
description


35 
      
];


36 
      
return
 
strtr
(
$format
,
 
$values
);


37 


38 
  
}


39 


40 
  
public
 
function
 
markCompleted
()
:
 
void


41 
  
{


42 
      
$this
->
completed
 
=
 
true
;


43 
  
}


44 


45 
  
public
 
function
 
updateDescription
(
string
 
$newTaskDescription
)
:
 
void


46 
  
{


47 
      
if
 
(
$newTaskDescription
 
===
 
''
)
 
{


48 
          
$exceptionMessage
 
=
 
'Task description should not be empty'
;


49 
          
throw
 
new
 
InvalidArgumentException
(
$exceptionMessage
);


50 
      
}


51 


52 
      
$this
->
description
 
=
 
$newTaskDescription
;


53 
  
}


54 
}

```

El test unitario de `Task` ya está en verde. Antes de nada, volvemos a lanzar el test de aceptación para ver si hemos resuelto el problema y no nos hemos dejado ningún cabo suelto. Y todo funciona.

Sin embargo, podríamos refactorizar un poco nuestra solución, ya que estamos intentando mantener la misma regla de negocio en dos lugares. Deberíamos unificarlo. Para ello utilizaremos auto-encapsulación. Es decir, crearemos un método privado con el cual asignar el valor de la descripción y validarlo. Así queda `Task` con este cambio.

```

 1 
namespace
 
App\TodoList\Domain
;


 2 


 3 
use
 
InvalidArgumentException
;


 4 


 5 
class
 
Task


 6 
{


 7 
  
private
 
int
 
$id
;


 8 
  
private
 
string
 
$description
;


 9 
  
private
 
bool
 
$completed
;


10 


11 
  
public
 
function
 
__construct
(
int
 
$id
,
 
string
 
$description
)


12 
  
{


13 
      
$this
->
id
 
=
 
$id
;


14 
      

15 
      
$this
->
setDescription
(
$description
);


16 


17 
      
$this
->
completed
 
=
 
false
;


18 
  
}


19 


20 
  
public
 
function
 
id
()
:
 
int


21 
  
{


22 
      
return
 
$this
->
id
;


23 
  
}


24 


25 
  
public
 
function
 
representedAs
(
string
 
$format
)
:
 
string


26 
  
{


27 
      
$values
 
=
 
[


28 
          
':check'
 
=>
 
$this
->
completed
 
?
 
'√'
 
:
 
' '
,


29 
          
':id'
 
=>
 
$this
->
id
,


30 
          
':description'
 
=>
 
$this
->
description


31 
      
];


32 
      
return
 
strtr
(
$format
,
 
$values
);


33 


34 
  
}


35 


36 
  
public
 
function
 
markCompleted
()
:
 
void


37 
  
{


38 
      
$this
->
completed
 
=
 
true
;


39 
  
}


40 


41 
  
public
 
function
 
updateDescription
(
string
 
$newTaskDescription
)
:
 
void


42 
  
{


43 
      
$this
->
setDescription
(
$newTaskDescription
);


44 
  
}


45 


46 
  
private
 
function
 
setDescription
(
string
 
$description
)
:
 
void


47 
  
{


48 
      
if
 
(
$description
 
===
 
''
)
 
{


49 
          
$exceptionMessage
 
=
 
'Task description should not be empty'
;


50 
          
throw
 
new
 
InvalidArgumentException
(
$exceptionMessage
);


51 
      
}


52 


53 
      
$this
->
description
 
=
 
$description
;


54 
  
}


55 
}

```

Y con esto, hemos implementado la nueva historia de usuario. Te habrás dado cuenta de que en todos los casos, ya sean nuevas historias de usuario, modificación de prestaciones o corrección de defectos, nuestro procedimiento es siempre el mismo. Definir el comportamiento deseado del sistema mediante un test y añadir el código de producción que sea necesario para hacerlo pasar.

# Epílogo

# 26 TDD y calidad de vida (la tuya)

Ya sea como empleados o freelance vendemos nuestro tiempo y trabajo a empresas y clientes. Una cosa que distingue nuestra profesión de otras es el hecho de que vendemos trabajo intelectual. A veces, incluso, trabajo intelectual de alto nivel.

Así que cuidar de nuestra mente e inteligencia parece ser una actividad razonable que deberíamos practicar con frecuencia.

Hay mucha gente en el mundo del desarrollo de software que piensa, o incluso afirma, que hacer testing es duro o caro. Y eso sin mencionar el Test Driven Development. Pero lo que queremos demostrar es que TDD es el camino más recomendable si quieres tener una vida más sana en el campo del desarrollo de software.

Pero primero, veamos un par de cuestiones acerca de cómo funciona nuestro cerebro.

## Conocimiento en el mundo, conocimiento en la cabeza

### Puertas

¿Sabes utilizar una puerta? ¿Segura? ¿Has visto alguna vez una puerta con manual de instrucciones? Yo sí. Montones de ellas en realidad: todas esas que tienen letreros indicando si se debe empujar o tirar. Me apuesto algo a que te has encontrado con más de una de esas.

¿Te has visto alguna vez ante una puerta cerrada sin saber cómo abrirla? Yo sí. De hecho las hay por docenas en el mundo, como puertas deslizantes con sensores que no están bien ajustados, o puertas que abren hacia adentro cuando todo indica que abren hacia fuera.

El caso es que una puerta debería ser algo fácil de usar y no siempre sucede. La forma en que se usa una puerta debería ser obvia, ¿no?

### Interruptores

¿Y qué tal si hablamos de interruptores? Me refiero a esos paneles de interruptores cuya disposición no está relacionada con la de las luces que controlan. A veces están situados en lugares en donde no se pueden ver las lámparas y necesitas probar varias veces hasta encontrar la combinación secreta que enciende la lámpara que quieres.

La relación entre un interruptor y la lámpara que controla debería ser obvia, ¿no?

### Hablemos de lo obvio

Cuando hablamos de algo obvio, nos referimos a conocimiento que no deberíamos tener que buscar en nuestra cabeza. El conocimiento está ahí, en el mundo. Sólo tenemos que usarlo mientras hacemos otras cosas. Queremos poder abrir puertas y encender luces sin tener que pensar ni una fracción de segundo acerca de ello.

Por eso, cuando nos vemos obligadas a pensar en cosas que deberían ser obvias, estamos desperdiciando parte de nuestro recursos mentales, utilizando espacio en nuestra memoria de trabajo que preferiríamos, o incluso deberíamos, estar empleando en otros propósitos.

El *conocimiento está en el mundo* cuando todas las pistas que necesitamos para usar o interactuar con un objeto están presentes en el objeto mismo. Por eso no necesitamos preocuparnos, razonar o recordar cómo utilizarlos. Si necesitamos hacerlo, es decir cuando necesitamos razonar o recordar instrucciones, tenemos que poner el conocimiento en nuestra cabeza para poder alcanzar nuestro objetivo.

Por esto, si disponemos de más conocimiento en el mundo cuando ejecutamos una tarea, necesitamos menos  *conocimiento la cabeza* , dejando espacio libre en ella que podemos usar para pensar mejor acerca de lo que estamos haciendo.

Cuanto menos tengamos que pensar en la forma de usar las herramientas, más podemos pensar el lo que estamos haciendo con ellas.

Pero, ¿de cuánto espacio disponemos en nuestra memoria de trabajo?

Bueno…, el caso es que no mucho.

## La capacidad de nuestra memoria de trabajo

Disponemos de una capacidad de almacenamiento prácticamente infinita es nuestra memoria. Piensa en ella como un enorme e inteligente disco duro que puede guardar recuerdos y datos durante años. No se trata de un almacén pasivo. De hecho, reconstruye nuestra memoria constantemente para guardar y recuperar cosas. Esto es importante, porque cuando lo pensamos, necesitamos usar nuestra memoria de trabajo para mantener los datos que estamos usando. Muy parecido a un ordenador.

Sin embargo, nuestra memoria de trabajo es bastante diferente de nuestra memoria a largo plazo. Hay quien la llama “memoria a corto plazo” y hay quien “memoria de trabajo”. Creo que podemos verla como un procesador, con algunos registros que pueden almacenar una cantidad limitada de unidades de información llamadas *chunks* mientras trabaja. Los *chunks* pueden tener un tamaño variable, pero son unidades significativas.

Como nos dedicamos a la programación, una buena forma de entender de estos *chunks* es pensar que son punteros que indican posiciones de memoria. En esas posiciones puede haber estructuras de cualquier tamaño. A veces son muy pequeñas, como una letra o un número, y otras veces son enormes.

¿Puedes recordar un número de teléfono? Me apuesto a que has agrupado los dígitos de modo que sólo tines dos o tres números que retener.

Esto es porque nuestro procesador puede manejar un número limitado de  *chunks* . Este número es aproximadamente 7 (más o menos dos). Es algo que varía con la edad y entre los individuos, pero es una aproximación muy buena. Por tanto, intentamos ahorrar tantos registros como podemos, agrupando la información en  *chunks* , y manteniendo alguno de los registros libre.

¿Qué sucede ti llenamos todos los registros? Pues la precisión y la velocidad al realizar la tarea disminuyen, aumentando los errores. En general, el desempeño es peor si tratamos de mantener muchas cosas en nuestra memoria de trabajo al mismo tiempo.

Por supuesto, se trata de una sobre simplificación. Sin embargo, creo que puedes hacerte una idea. Podemos reducir la sobrecarga si ponemos el conocimiento el mundo, en lugar de mantenerlo en nuestra cabeza, con lo que nuestro desempeño será mejor en cualquier tarea.

Puedes poner conocimiento fuera de la memoria de trabajo mediante la práctica. Eso es lo que ocurre cuando introducimos una nueva técnica, intentamos aplicar una novedad del lenguaje de programación o utilizar una nueva herramienta. Al principio vamos lentos y cometemos errores. Necesitamos tiempo para automatizar cosas en nuestra mente mientras ponemos conocimiento en el mundo.

Es hora de volver al objetivo principal de este artículo. Hablemos acerca de nuestra vida como desarrolladora.

## Un día en la vida

### Programando sin test

Analicemos por un momento qué sucede cuando programamos sin hacer tests.

De hecho, en realidad siempre hacemos tests, pero con frecuencia tendemos a que sean manuales. Lo llamamos “depurar”. Usamos un proceso de prueba y error: ¿Esto funciona? ¿No…? Prueba otra vez. ¿Sí…? Sigue adelante.

Intentamos escribir código y verificar que funciona al mismo tiempo que lo escribimos, hasta que nos parece que está terminado. Tras eso, intentamos verificar que el código funciona como un todo. Entonces descubrimos que habíamos olvidado algunos detalles… Tras eso, desplegamos y descubrimos nuevos detalles que no funcionan, así que necesitamos corregirlos.

Al final del día, nos encontramos con grandes dolores de cabeza y bajo la impresión de habernos perdido algo.

Esto sucede porque intentamos mantener toda la información en la cabeza al mismo tiempo (recuerda que tiene capacidad limitada). Nos sobrecargamos nosotras mismas. La mejor estrategia es hacer una lista de metas y tareas, y ayudarnos a mantener cierta organización y foco con estos soportes externos.

Por ejemplo: escribir un simple *endpoint* para una API necesita un montón de cosas:

1. Una acción en un controlador
2. Una ruta a ese controlador
3. Un caso de uso o comando que ejecute la acción
4. Probablemente una o más entidades de dominio y su repositorio
5. La definición en el contenedor de dependencias
6. Posiblemente algún servicio
7. La definición del mismo en el contenedor de dependencias
8. Un objeto de respuesta
9. etc.

Con esto nuestra memoria se sobrecarga ya que superamos ampliamente los 7+/-2 items. Esto explica por qué nos sentimos cansadas y estresadas, con el sentimiento de que podríamos haber olvidado algo. E inseguras sobre los que estamos haciendo o si nos hemos dejado atrás algo importante.

Así que, echemos una mirada a cómo ejecutaríamos el mismo proceso, esta vez con testing al final.

### Programando con tests al final

En realidad es casi lo mismo, pero ahora hay tests al final del proceso. La clase de tests que automatizamos.

El resultado final es mejor, porque ahora tenemos más confianza con el código. Pero seguimos teniendo ese mismo dolor de cabeza al final del día.

Sí. Hemos hecho la misma cantidad de trabajo, con la misma sobrecarga mental y con el añadido de tener que escribir una suite de tests, mientras nuestro cerebro nos grita: “¡Hey! ¡Pero si el trabajo está terminado! ¿Qué estás haciendo?”

En estas condiciones, puede que nuestros tests no sean los mejores tests del mundo. Ni la suita cubra todos los escenarios posible.

De hecho, ya estamos cansadas cuando empezamos la fase de testing. Esto explica por qué mucha gente piensa que el testing es duro y hasta que es doloroso.

Así que los test mejoran nuestra confianza en el código, pero al coste de obligarnos a un montón de trabajo extra. Nuestra vida no es mejor con tests, incluso si dormimos mejor por la noche. Entonces, ¿qué es lo que está mal?

Para mejorar tu vida deberías probar una aproximación diferente. Debería probar Test Driven Development.

### Programando con TDD

En esto consiste TDD: una cosa cada vez y posponer decisiones.

* Un test sencillo que falle: no escribas código mientras no tengas un test.
* Añade código que haga pasar el test: no escribas ni más ni menos de lo necesario.
* Revisa el código para mejorar cosas, pero no implementes nada nuevo y mantienes los tests existentes pasando.

Veamos el proceso desde el punto de vista de nuestro modelo de la memoria de trabajo. Cuando escribimos el primer test que falla estamos enfocándonos en este test. Por tanto, no tenemos que poner atención a nada más fuera de eso. Escribir el test también significa que ponemos el conocimiento que necesitamos en el mundo. Nuestra memoria está casi desocupada.

A continuación, nos enfocamos en escribir el código necesario para hacer que el test pase. El conocimiento que necesitamos está en el test, no en nuestra cabeza, y es lo que necesitamos para conseguir el objetivo inmediato.

Solo tenemos que pensar en una forma de hacer que el test pase. Si es el primer test, sólo necesitamos escribir la implementación más obvia que sea posible. Incluso si esa implementación es tan simple como devolver la misma respuesta esperada por el test.

Y una vez que el test ha pasado, podemos echar un vistazo al código y ver si podemos hacer mejoras mediante refactoring. No tenemos que añadir prestaciones. Debemos mantener el test pasando mientras ordenamos las cosas, eliminando duplicación innecesaria, introduciendo mejores nombres, etc.

Repetiremos el ciclo hasta tener la funcionalidad completamente implementada. No necesitamos escribir tests extras, no tenemos el riesgo de haber olvidado nada. Nuestra cabeza no duele. Hemos usado el cerebro para pensar evitando la sobrecarga.

No es magia, es TDD. Por supuesto, para lograr esto se necesita entrenamiento. TDD es una herramienta intelectual, y el uso de una herramienta debe automatizarse. Por tanto, deberías hacer ejercicios, como las katas, tanto individualmente, como con la ayuda de colegas, en una comunidad de práctica, de la forma que mejor te convenga a ti o a tu equipo. Practicar, practicar y practicar. Una vez que seas capaz de proceder paso a paso, descubrirás que estás más feliz y menos estresada en el medio y largo plazo.

## Un consejo final

Almacena la mayor cantidad de conocimiento que necesites en el mundo: usa un backlog, usa post-its, escribe una lista de tareas, dibujas esquemas, modelos, mapas conceptuales… Liberta tu cabeza y deja espacio para trabajar en una cosa cada vez.

TDD es más que escribir tests. Es poner el conocimiento que necesitas en el código y liberar tu mente. Es posponer decisiones hasta el momento en que estés lista para tomarlas.

De verdad, prueba TDD, tu vida como desarrolladora mejorará.

# Notas

# Conceptos básicos de TDD

## ¿Qué es TDD y por qué debería importarme?

**1**https://en.wikipedia.org/wiki/Test-driven_development[↩](https://leanpub.com/tddcourse/read#fnref-fn1)

**2**http://derekbarber.ca/blog/2012/03/27/why-test-driven-development/[↩](https://leanpub.com/tddcourse/read#fnref-fn2)

**3**https://pdfs.semanticscholar.org/ad0f/dd36aa09d25b739b1649bfa5e20c9e46eb65.pdf[↩](https://leanpub.com/tddcourse/read#fnref-fn3)

**4**https://digitalcommons.calpoly.edu/cgi/viewcontent.cgi?referer=&httpsredir=1&article=1027&context=csse_fac[↩](https://leanpub.com/tddcourse/read#fnref-fn4)

**5**https://www.thedroidsonroids.com/blog/pros-of-tdd-test-driven-development-for-business[↩](https://leanpub.com/tddcourse/read#fnref-fn5)

**6**https://medium.com/@philborlin/tdd-is-about-design-not-testing-e42af0b28475[↩](https://leanpub.com/tddcourse/read#fnref-fn6)

**7**https://codurance.com/2015/05/12/does-tdd-lead-to-good-design/[↩](https://leanpub.com/tddcourse/read#fnref-fn7)

**8**https://www.thoughtworks.com/insights/blog/using-tdd-influence-design[↩](https://leanpub.com/tddcourse/read#fnref-fn8)

## Coding-dojo y katas

**1**https://pragprog.com/titles/tpp20/the-pragmatic-programmer-20th-anniversary-edition/[↩](https://leanpub.com/tddcourse/read#fnref-fn9)

**2**https://katalyst.codurance.com[↩](https://leanpub.com/tddcourse/read#fnref-fn10)

**3**https://kata-log.rocks/index.html[↩](https://leanpub.com/tddcourse/read#fnref-fn11)

**4**http://codingdojo.org[↩](https://leanpub.com/tddcourse/read#fnref-fn12)

**5**http://codekata.com[↩](https://leanpub.com/tddcourse/read#fnref-fn13)

**6**http://agilekatas.co.uk[↩](https://leanpub.com/tddcourse/read#fnref-fn14)

**7**http://www.butunclebob.com/ArticleS.UncleBob.TheProgrammingDojo)[↩](https://leanpub.com/tddcourse/read#fnref-fn15)

**8**http://codingdojo.org/WhatIsCodingDojo/[↩](https://leanpub.com/tddcourse/read#fnref-fn16)

**9**https://link.springer.com/chapter/10.1007%2F11499053_54[↩](https://leanpub.com/tddcourse/read#fnref-fn17)

# TDD clásica

## Las leyes de TDD

**1**http://butunclebob.com/ArticleS.UncleBob.TheThreeRulesOfTdd[↩](https://leanpub.com/tddcourse/read#fnref-fn18)

**2**https://www.youtube.com/watch?v=AoIfc5NwRks[↩](https://leanpub.com/tddcourse/read#fnref-fn19)

**3**http://www.javiersaldana.com/articles/tech/refactoring-the-three-laws-of-tdd[↩](https://leanpub.com/tddcourse/read#fnref-fn20)

**4**https://es.slideshare.net/CiaranMcNulty/tdd-with-phpspec[↩](https://leanpub.com/tddcourse/read#fnref-fn21)

**5**https://qualitycoding.org/3-laws-tdd/[↩](https://leanpub.com/tddcourse/read#fnref-fn22)

**6**https://martinfowler.com/bliki/TestDrivenDevelopment.html[↩](https://leanpub.com/tddcourse/read#fnref-fn23)

**7**https://blog.cleancoder.com/uncle-bob/2014/12/17/TheCyclesOfTDD.html[↩](https://leanpub.com/tddcourse/read#fnref-fn24)

## Fizz Buzz

**1**http://codingdojo.org/kata/FizzBuzz/[↩](https://leanpub.com/tddcourse/read#fnref-fn25)

**2**https://jesuslc.com/2016/02/17/kata-fizzbuzz/)[↩](https://leanpub.com/tddcourse/read#fnref-fn26)

**3**https://kata-log.rocks/fizz-buzz-kata)[↩](https://leanpub.com/tddcourse/read#fnref-fn27)

**4**https://www.youtube.com/watch?v=BV86r2k6QI8)[↩](https://leanpub.com/tddcourse/read#fnref-fn28)

**5**https://www.youtube.com/watch?v=JyRouDwzCoo)[↩](https://leanpub.com/tddcourse/read#fnref-fn29)

**6**https://cloudnative.ly/which-order-to-write-your-tests-7ea2937761a1)[↩](https://leanpub.com/tddcourse/read#fnref-fn30)

**7**https://www.linkedin.com/learning/unit-testing-and-test-driven-development-in-python/example-tdd-session-the-fizzbuzz-kata)[↩](https://leanpub.com/tddcourse/read#fnref-fn31)

## Evolución del comportamiento mediante tests

**1**http://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html[↩](https://leanpub.com/tddcourse/read#fnref-fn32)

**2**https://codurance.com/2015/05/18/applying-transformation-priority-premise-to-roman-numerals-kata/[↩](https://leanpub.com/tddcourse/read#fnref-fn33)

**3**http://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html[↩](https://leanpub.com/tddcourse/read#fnref-fn34)

**4**http://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html[↩](https://leanpub.com/tddcourse/read#fnref-fn32)

## Prime Factors

**1**http://butunclebob.com/ArticleS.UncleBob.ThePrimeFactorsKata[↩](https://leanpub.com/tddcourse/read#fnref-fn35)

**2**http://butunclebob.com/ArticleS.UncleBob.ThePrimeFactorsKata[↩](https://leanpub.com/tddcourse/read#fnref-fn35)

**3**http://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html[↩](https://leanpub.com/tddcourse/read#fnref-fn32)

## NIF

**1**https://franiglesias.github.io/iniciacion-tdd/[↩](https://leanpub.com/tddcourse/read#fnref-fn36)

## Resolviendo la Kata NIF

**1**https://flaviocopes.com/golang-is-go-object-oriented/[↩](https://leanpub.com/tddcourse/read#fnref-fn37)

## Bowling game

**1**http://butunclebob.com/files/downloads/Bowling%20Game%20Kata.ppt[↩](https://leanpub.com/tddcourse/read#fnref-fn38)

**2**https://ronjeffries.com/xprog/articles/acsbowling/[↩](https://leanpub.com/tddcourse/read#fnref-fn39)

## Greeting

**1**https://github.com/testdouble/contributing-tests/wiki/Greeting-Kata[↩](https://leanpub.com/tddcourse/read#fnref-fn40)

# *Outside-in* TDD

**1**https://www.codurance.com/publications/2017/10/23/outside-in-design[↩](https://leanpub.com/tddcourse/read#fnref-fn41)

**2**https://www.youtube.com/watch?v=24vzFAvOzo0[↩](https://leanpub.com/tddcourse/read#fnref-fn42)

## Enfoques en TDD

**1**https://codurance.com/2015/05/12/does-tdd-lead-to-good-design/[↩](https://leanpub.com/tddcourse/read#fnref-fn43)

**2**https://codurance.com/2017/10/23/outside-in-design/[↩](https://leanpub.com/tddcourse/read#fnref-fn44)

**3**https://github.com/testdouble/contributing-tests/wiki/Detroit-school-TDD[↩](https://leanpub.com/tddcourse/read#fnref-fn45)

**4**https://github.com/testdouble/contributing-tests/wiki/London-school-TDD[↩](https://leanpub.com/tddcourse/read#fnref-fn46)

**5**https://en.wikipedia.org/wiki/Extreme_programming#Origins[↩](https://leanpub.com/tddcourse/read#fnref-fn47)

**6**http://blog.testdouble.com/posts/2014-01-25-the-failures-of-intro-to-tdd/[↩](https://leanpub.com/tddcourse/read#fnref-fn48)

**7**https://www2.ccs.neu.edu/research/demeter/related-work/extreme-programming/MockObjectsFinal.PDF[↩](https://leanpub.com/tddcourse/read#fnref-fn49)

**8**http://coding-is-like-cooking.info/2013/04/the-london-school-of-test-driven-development/[↩](https://leanpub.com/tddcourse/read#fnref-fn50)

**9**http://coding-is-like-cooking.info/2013/04/outside-in-development-with-double-loop-tdd/[↩](https://leanpub.com/tddcourse/read#fnref-fn51)

**10**http://coding-is-like-cooking.info/2013/05/tell-dont-ask-object-oriented-design/[↩](https://leanpub.com/tddcourse/read#fnref-fn52)

## Proyecto Todo-List

**1**https://alistair.cockburn.us/hexagonal-architecture/[↩](https://leanpub.com/tddcourse/read#fnref-fn60)
