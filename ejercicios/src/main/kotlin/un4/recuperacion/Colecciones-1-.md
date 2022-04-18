# 44 - Colecciones

Kotlin provee un amplio abanico de clases para administrar colecciones de datos.

Ya vimos algunas de las clases que permiten administrar colecciones:

* Para tipos de datos básicos (se encuentran optimizadas)
  ```Kt
  ByteArray 
  ShortArray
  LongArray
  FloatArray
  DoubleArray
  BooleanArray
  CharArray
  ```
* Para cualquier tipo de dato:
  ```Kt
  Array
  ```
* ```Kt
  List
  MutableList
  ```
* ```Kt
  Map
  MutableMap
  ```
* ```Kt
  Set
  MutableSet
  ```

Ya trabajamos en conceptos anteriores con los arreglos que almacenan tipos de datos básicos y con la clase Array que nos permite almacenar cualquier tipo de dato. En los próximos conceptos veremos las clases List, Map y Set.

Para administrar listas (List), mapas (Map) y conjuntos (Set) hay dos grandes grupos: mutables (es decir que luego de ser creada podemos agregar, modificar y borrar elementos) e inmutables (una vez creada la colección no podemos modificar la estructura)
