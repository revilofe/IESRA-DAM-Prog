# Relación 9.3

> Se evaluará el RA9, CE todos

## 1. Descripción de la práctica

Una empresa desea llevar el control del inventario de los equipos de oficina que venden en cada una de sus tiendas. Para
ello el director de sistemas envío el requerimiento al DBA de la empresa. El Administrador de Base de Datos analizó la
situación del negocio y decidió realizar el siguiente diseño:

Un catálogo de tiendas (TIENDAS) para poder asociar a cada tienda con su respectivo inventario de equipos de oficina que
vende. En el catálogo se pretende guardar la siguiente información:

- ID_TIENDA (número identificador de 10 unidades y clave primaria)
- NOMBRE_TIENDA (cadena de 40 caracteres)
- DIRECCION_TIENDA (cadena de 200 caracteres)
  Dado que se han proporcionado los datos de las siguientes tiendas, es necesario ingresar dicha información en el
  catálogo de tiendas (TIENDAS).

Dado que se han proporcionado los datos de las siguientes tiendas, es necesario ingresar dicha información en el
catálogo de tiendas (TIENDAS)

```SQL
CREATE TABLE TIENDAS (ID_TIENDA NUMBER(10,0) CONSTRAINT PK_ID_TIENDA PRIMARY KEY, NOMBRE_TIENDA VARCHAR2(40), DIRECCION_TIENDA VARCHAR2(200) );
```
Los datos de la tiendas son los siguiente:

```SQL
INSERT INTO TIENDAS VALUES (1,'La Nena','Callejon de la Nena #123, Colonia Dulce Amor');
INSERT INTO TIENDAS VALUES (2,'La Virgen','Calle Rosa de Guadalupe #2, Colonia Bajo del Cerro');
INSERT INTO TIENDAS VALUES (3,'La Piscina','Avenida de los Charcos #78, Colonia El Mojado');
INSERT INTO TIENDAS VALUES (4,'El Churro','Calle el Pason #666, Colonia El Viaje');
INSERT INTO TIENDAS VALUES (5,'Don Pancho','Avenida del Reboso #1521, Colonia El Burro');

COMMIT;
```

Una tabla para poder almacenar el inventario (INVENTARIOS) de los equipos de oficina que se venden en cada tienda. En
dicha tabla pretende almacenar la siguiente información:

- ID_ARTICULO (número identificador de 10 unidades y clave primaria)
- NOMBRE (cadena de 50 caracteres)
- COMENTARIO (cadena de 200 caracteres)
- PRECIO (número de 10 unidades con 2 decimales)
- ID_TIENDA (número identificador referente al catálogo de TIENDAS)

Para tener un mejor control del inventario del equipo es necesario que cumpla las siguientes condiciones:

El identificador del producto (ID_ARTICULO) debe ser un valor único que identifique al artículo.

- El nombre del producto (NOMBRE) no se debe de duplicar y debe de ser único.
- El comentario del producto (COMENTARIO) no debe de contener valores nulos.
- El precio del producto (PRECIO) debe ser mayor a cero.
- El identificador de la tienda (ID_TIENDA) debe de hacer referencia al catálogo de TIENDAS que se definió
  anteriormente.
  
```SQL
CREATE TABLE INVENTARIOS (
ID_ARTICULO NUMBER(10,0) CONSTRAINT PK_ID_ARTICULO PRIMARY KEY, NOMBRE VARCHAR2(50) UNIQUE, COMENTARIO VARCHAR2(200) NOT
NULL, PRECIO NUMBER(10,2) CHECK(PRECIO>0), ID_TIENDA NUMBER(10,0) CONSTRAINT FK_ID_TIENDA REFERENCES TIENDAS(
ID_TIENDA) );
```

Una vez creada la tabla de INVENTARIOS, el Administrado de Base de Datos se percató que al consultar la información de
la tabla a través del campo ID_TIENDA, el desempeño y rapidez de la consulta podría ser deficiente. Por lo que recomendó
la creación de un índice.

```SQL
CREATE INDEX IDX_ID_TIENDA ON INVENTARIOS(ID_TIENDA);
```

Una vez atendidos los requerimientos anteriores, el departamento de contabilidad le ha indicado al Administrador de Base
de Datos que ingrese la información del inventario de los equipos de oficina que aparece a continuación.

```SQL
INSERT INTO INVENTARIOS VALUES (1,'CD-DVD','900 MB DE ESPACIO',35.50,5);
INSERT INTO INVENTARIOS VALUES (2,'USB-HP','32GB, USB 3.0',155.90,4);
INSERT INTO INVENTARIOS VALUES (3,'Laptop SONY','4GB RAM, 300 HDD, i5 2.6 GHz.',13410.07,3);
INSERT INTO INVENTARIOS VALUES (4,'Mouse Optico','700 DPI',104.40,2);
INSERT INTO INVENTARIOS VALUES (5,'Disco Duro','200 TB, HDD, USB 3.0',2300.00,1);
INSERT INTO INVENTARIOS VALUES (6,'Proyector TSHB','TOSHIBA G155',5500.00,5);

COMMIT;
```

## 2. Evaluación

Desarrollo de los objetos DAO para acceder a TIENDAS e INVENTARIOS

Dado que el dólar se ha encontrado en su valor máximo histórico en el país, los proveedores han incrementado un 15% el
valor de cada producto. Por lo que los gerentes de ventas han solicitado al Administrador de Base de Datos incrementar
un 15% el precio de los productos que cuyo valor sea mayor a $2,000.00 pesos.

Moder mostrar las tiendas, y los inventarios por tiendas.

## 3. Evaluación

Se tendrá en cuenta el uso de superclases, interfaces, clases abstractas, el uso de jerarquía de clases ya conocidas y
que nos las proporcionan kotlin, como por ejemplo List, Map, Set. etc.

Adicionalmente se tendrá en cuenta:

- El código realizado es óptimo.
- El código realizado es limpio y está comentado.
- Se cumple requisitos de entrega.

## 4. Condiciones de entrega

Se entrega la URL al repositorio, el repositorio será:

- **privado**
- Compartido conmigo.
- El nombre del repositorio será `DAM1_id_iniciales` donde:
    - `id`: es el ide de la actividad, por ejemplo 9_3
    - `iniciales': son tus iniciales por ejemplo EFO las mías.

## 5. Bibliografía

