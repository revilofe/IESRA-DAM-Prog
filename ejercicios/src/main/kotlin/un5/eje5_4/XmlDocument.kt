package un5.eje5_4

import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory


fun readXml(pathName: String): Document {
    val xmlFile = File(pathName)
    return  DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlFile)
}

fun obtenerAtributosEnMapKV(e: Element ):MutableMap<String, String>
{
    val mMap = mutableMapOf<String, String>()
    for(j in 0..e.attributes.length - 1)
        mMap.putIfAbsent(e.attributes.item(j).nodeName, e.attributes.item(j).nodeValue)
    return mMap
}

fun obtenerListaNodosPorNombre(doc: Document, tagName: String): MutableList<Node>
{
    val bookList: NodeList = doc.getElementsByTagName(tagName)
    val lista = mutableListOf<Node>()
    for(i in 0..bookList.length - 1)
        lista.add(bookList.item(i))
    return lista
}
fun main() {
    var xmlDoc = readXml("items.xml")
    println("Creo DOM")

    //https://runebook.dev/es/docs/dom/node/normalize
    xmlDoc.documentElement.normalize()

    println("Nodo raíz:" + xmlDoc.documentElement.nodeName)
    val lista = obtenerListaNodosPorNombre(xmlDoc,"Item")

    lista.forEach{
        if (it.getNodeType() === Node.ELEMENT_NODE) {
            val elem = it as Element
            val mMap = obtenerAtributosEnMapKV(it)

            println("- ${it.nodeName} - $mMap")
            println("`- Subitem: ${it.getElementsByTagName("Subitem").item(0).textContent}")
        }
    }
/*
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

*/


}