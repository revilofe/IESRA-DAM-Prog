# Relación 5.4

> Se evaluará el RAX, CE y

## 1. Representación del XML mediante DOM y jerarquía de clases

Para tratar un documento, utilizaremos la estructura que proporciona la API DOM

![](../../../resources/img/5_4/jerarquiaDOM.png)

Los objetos son los siguientes:

| Objeto | Descripción |
|---------------------------------------------	|------------------------	|
| Node | Es el tipo de datos básico del DOM. El resto de los tipos derivan de él.|
| Document | Un objeto Document representa el documento XML entero. Contiene el prólogo y el cuerpo del documento. |
| Element | Un objeto Element representa una etiqueta del documento XML.|
| Attr | Un objeto Attr representa un atributo.|
| Text | Un objeto Text hace referencia al contenido de una etiqueta. |
| Comment | Un objeto Comment hace referencia a un comentario.| 

Trasladado a un ejemplo:

Teniendo que el árbol está compuesto por nodos, que es el padre en la jerarquía:

![](../../../resources/img/5_4/XmlDescription.png) -->

Particularizamos a cada uno de los objetos (elementos, atributos, etc):

![](../../../resources/img/5_4/xml-book.png)

<!-- ![](../../../resources/img/5_4/html-tree.png)  -->

## 2. ¿Cómo leo un archivo XML o HTML con Kotlin y examino su contenido?

Aquí hay algunos fragmentos de código sobre cómo leer un archivo XML o Html con Kotlin y luego examinar los elementos
XML, sus atributos y valores.

El siguiente archivo XML se utiliza como archivo de muestra (items.xml):

~~~xml

<ItemSet>
  <Item type="T0" count="1">
    <Subitem>Valor T0.TT1</Subitem>
  </Item>
  <Item type="T1" count="2">
        <Subitem> Valor T1.TT1 </Subitem>
    </Item>
    <Item type="T2" count="1">
        <Subitem> Valor T2.TT1 </Subitem>
    </Item>
    <Item type="T3" count="1">
        <Subitem> Valor T3.TT1 </Subitem>
    </Item>
</ItemSet>
~~~
### Leer el archivo XML
El siguiente fragmento lee el archivo Xml y lo transforma en un documento:

~~~kt
fun readXml(pathName:String): Document 
{
    val xmlFile = File(pathName)
    return  DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlFile)
}
~~~
### Buscar un elemento en un árbol
Haciendo uso de `obtenerListaNodosPorNombre`, el siguiente fragmento de código devuelve una lista de nodos que cumplen el criterio de búsqueda.

~~~kt
/*
* Crea una lista de nodos cuyo nonmbre es tagname
*
* Ejemplo: Para el elemento item siguiente
* <item type = "T1" count = "1"> Value1 </item>
* <item type = "T2" count = "3"> Value2 </item>
* Si llamamos al método usando tagName="item", devuelve  [node, node] donde node.tagname="item"
*
*/
fun obtenerListaNodosPorNombre(doc: Document, tagName: String): MutableList<Node>
{
    val bookList: NodeList = doc.getElementsByTagName(tagName)
    val lista = mutableListOf<Node>()
    for (i in 0..bookList.length - 1)
        lista.add(bookList.item(i))
    return lista
}
~~~

### Obtener de elemento, los atributos y sus valores en un map
Haciendo uso de `obtenerAtributosEnMapKV`, el siguiente fragmento de código muestra cómo obtener un mapa de pares atributo=valor del elemento XML pasado por referencia.


~~~kt
/*
* Cree un mapa con todos los valores donde la key es 'attributeName' y su valor es 'attributeValue'
*
* Ejemplo: Para el elemento item siguiente
* <item type = "T1" count = "1"> Value1 </item>
* Devuelve  [type="T1", count="1"]
*
*/
fun obtenerAtributosEnMapKV(e: Element ):MutableMap<String, String>
{
    val mMap = mutableMapOf<String, String>()
    for(j in 0..e.attributes.length - 1)
        mMap.putIfAbsent(e.attributes.item(j).nodeName, e.attributes.item(j).nodeValue)
    return mMap
}

~~~

### Bibliografía

- [Clases Kotlin para la API DOM](https://kotlinlang.org/api/latest/jvm/stdlib/org.w3c.dom/)
- [Como leer XML en kotlin usando el DOM parser](https://turreta.com/2017/07/07/how-to-read-xml-in-kotlin-using-dom-parser/)

Relación 5.4
> Se evaluará el RAX, CE y1,y2

## 3. Puesta en práctica

> **NOTA** Con el [codigo que se da en el ejemplo](./XMLDocument.kt), reutilizando, es suficiente para hacer el ejercicio.

Implementar una clase `CatalogoLibrosXML` con sus métodos y propiedades. Usa los modificadores de acceso adecuado según
lo creas conveniente e intenta separar la funcionalidad en métodos que tengan sentido para la clase y que hagan una
única cosa.

### Propiedades

- Las que necesites.

### Métodos

- `constructor(cargador:String)`: Debe abortar si el fichero no existe o es incorrecto.
- `existeLibro(idLibro:String): Boolean`: Devuelve true si existe, `false` en caso contrario.
- `infoLibro(idLibro:String): Map<String,Any>`: Devuelve un `Map` con los atributos y valores del libro. Devolverá
  un `Map` vacío en caso contrario.

Ejemplo de lo que tendría que devolver `infoLibro` si recibe como parámetro `"bk101"` y existe un elemento en el fichero XML como este:
~~~
<book id="bk101">
    <author>Gambardella, Matthew</author>
    <title>XML Developer's Guide</title>
    <genre>Computer</genre>
    <price>44.95</price>
    <publish_date>2000-10-01</publish_date>
    <description>An in-depth look at creating applications with XML.</description>
</book>
~~~
Deberá devolver el `Map` siguiente (Ten en cuenta que también debe incluir el campo **id**):
~~~
["id":"bk101", "autor":"Gambardella", "title":"XML Developer's Guide", "genre":"Computer", "price":44.95, "publish_date":2000-10-01, "description":"An in-depth look at creating applications with XML."]
// price es de tipo Double 
// publish_date es de tipo Date
// el resto son String
~~~

> **NOTA:** Utiliza un método de Logger para mostrar información.

El ejercicio consistirá de dos partes:

1. Implementa la clase y sus métodos. 
2. Una función main en la que se prueba la clase. 
   
Ten en cuenta que para validar el ejercicio se utilizará el nombre de Clase y métodos que se indican arriba, por tanto, respétalos. 

### Evaluación
- La clase se ha diseñado adecuadamente, creando las propiedades y métodos necesarios y separando la funcionalidad.
- Se han utilizado los modificadores de privacidad adecuados. 
- La clase Funciona adecuadamente.

Adicionalmente se tendrá en cuenta:
- El código realizado es óptimo.
- El código realizado es limpio y está comentado.
- Se cumple requisitos de entrega.

### Condiciones de entrega
Se entrega la URL al repositorio, el repositorio será: 
- **privado**
- Compartido conmigo.
- El nombre del repositorio será `DAM1_id_iniciales` donde:
  - `id`: es el ide de la actividad, por ejemplo 5_1
  - `iniciales': son tus iniciales por ejemplo EFO las mias.
