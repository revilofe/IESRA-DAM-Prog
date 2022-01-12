# Relación 5.4
> Se evaluará el RAX, CE y

## 1. ¿Cómo leo un archivo XML o html con Kotlin y examino su contenido? 
Aquí hay algunos fragmentos de código sobre cómo leer un archivo XML o Html con Kotlin y luego examinar los elementos XML, sus atributos y valores. 

El siguiente archivo XML se utiliza como archivo de muestra (items.xml):

~~~xml
<ItemSet>
    <Item type="T0" count="1">
        <Subitem> Valor T0.TT1 </Subitem>
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
* /
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
* /
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


## 2. Puesta en práctica
Implementar una clase `CatalogoLibrosXML` con sus métodos y propiedades. Usa los modificadores de acceso adecuado según lo creas conveniente e intenta separar la funcionalidad en métodos que tengan sentido para la clase y que hagan una única cosa. 
### Propiedades
- Las que necesites.
### Métodos
- `establecerPathAXMLFile(pathAXMLFile:String): Boolean`: Devuelve `true`, si el fichero existe y es correcto. `false` en caso contrario. 
- `existeLibro(idLibro:String): Boolean`: Devuelve true si existe, `false` en caso contrario
- `infoLibro(idLibro:String): Map<String,String>`: Devuelve un `Map` con los atributos y valores del libro. Devolverá un `Map` vacío en caso contrario. 


> **NOTA:** Utiliza un método de Logger para mostrar información.

El ejercicio consistirá en dos partes:

1. Implementa la clase y sus métodos. 
2. Una función main en la que se prueba la clase. 
   
Ten en cuenta que para validar el ejercicio se utilizará el nombre de Clase y métodos que se indican arriba, por tanto, respétalos. 

### Evaluación
- La clase se ha diseñado adecuadamente, creando las propiedades y métodos necesarios y separando la funcionalidad.
- Se han utilizado los modificacdores de privacidad adecuados. 
- La clase Funciona adecuadamente.

Adicionalmente se tendrá en cuenta:
- El código realizado es óptimo.
- El código realizado es limpio y está comentado.
- Se cumple requisitos de entrega.
