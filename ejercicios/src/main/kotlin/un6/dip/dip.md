# [Principios S.O.L.I.D.]

SOLID es el acrónimo que acuñó **Michael Feathers**, basándose en los principios de la programación orientada a objetos
que **Robert C. Martin** había recopilado en el año 2000 en su paper ["_Design Principles and Design
Patterns_"](http://www.cvc.uab.es/shared/teach/a21291/temes/object_oriented_design/materials_adicionals/principles_and_patterns.pdf)
.

Ocho años más tarde, el _tío Bob_ siguió compendiando consejos y buenas prácticas de desarrollo y se convirtió en el
padre del código limpio con su célebre libro _'Clean Code'_.

Entre los objetivos de tener en cuenta estos 5 principios a la hora de escribir código encontramos:

- Crear un **software eficaz**: que cumpla con su cometido y que sea **robusto y estable**.
- Escribir un **código limpio y flexible** ante los cambios: que se pueda modificar fácilmente según necesidad, que
  sea **reutilizable y mantenible**.
- Permitir **escalabilidad**: que acepte ser ampliado con nuevas funcionalidades de manera ágil.

En este sentido la aplicación de los principios SOLID está muy relacionada con la comprensión y el uso de [**patrones de
diseño**](https://es.wikipedia.org/wiki/Patr%C3%B3n_de_dise%C3%B1o), que nos permitirán mantener una **alta cohesión** y, por tanto, un **bajo acoplamiento** de software. En
definitiva, desarrollar un software de calidad.

El acoplamiento se refiere al **grado de interdependencia que tienen dos unidades de software entre sí**, entendiendo
por unidades de software: clases, subtipos, métodos, módulos, funciones, bibliotecas, etc.

Si dos unidades de software son completamente independientes la una de la otra, decimos que están desacopladas.

La cohesión de software es el **grado en que elementos diferentes de un sistema permanecen unidos para alcanzar un mejor
resultado** que si trabajaran por separado. Se refiere a la forma en que podemos agrupar diversas unidades de software
para crear una unidad mayor.

Los principios SOLID son eso: principios, es decir, **buenas prácticas** que pueden ayudar a escribir un mejor código:
más limpio, mantenible y escalable.

Como indica el propio Robert C. Martin en su artículo “_Getting a SOLID start_” no se trata de reglas, ni leyes, ni
verdades absolutas, sino más bien soluciones de sentido común a problemas comunes. Son heurísticos, basados en la
experiencia: “se ha observado que funcionan en muchos casos; pero no hay pruebas de que siempre funcionen, ni de que
siempre se deban seguir.”

Dice el _tío Bob_, que SOLID nos ayuda a categorizar lo que es un buen o mal código y es innegable que un código limpio
tenderá más a salir airoso del “control de calidad de código” WTFs/Minute. Consejo: cuando estés revisando un código,
lleva la cuenta de cuántas veces por minuto sale de tu boca un WTF?.

![WTFs/Minute](https://profile.es/pro/wp-content/media/code-quality-measurement-WTF.png)

Los 5 principios SOLID son:

- [**S - Principio de Responsabilidad Única** ("_Single Responsibility
  Principle_" - SRP)](https://es.wikipedia.org/wiki/Principio_de_responsabilidad_%C3%BAnica)

Este principio establece que cada módulo o clase debe tener **responsabilidad sobre una sola parte de la funcionalidad**
proporcionada por el software y esta responsabilidad debe estar encapsulada en su totalidad por la clase. Todos sus
servicios deben estar estrechamente alineados con esa responsabilidad.

- [**O - Principio de
  Abierto/Cerrado** ("Open/Closed Principle" - OCP)](https://es.wikipedia.org/wiki/Principio_de_abierto/cerrado)

Este principio establece que **«una entidad de software (clase, módulo, función, etc.) debe quedar abierta para su
extensión, pero cerrada para su modificación»**. Es decir, se debe poder extender el comportamiento de la entidad pero
sin modificar su código fuente.

- [**L - Principio de Substitución de
  Liskov** ("Liskov Substitution Principle" - LSP)](https://es.wikipedia.org/wiki/Principio_de_sustituci%C3%B3n_de_Liskov)

Este principo puede definirse como: **«cada clase que hereda de otra puede usarse como su padre sin necesidad de conocer
las diferencias entre ellas»**.

- [**I - Principio de Segregación de la
  Interfaz** ("Interface Segregation Principle" - ISP)](https://es.wikipedia.org/wiki/Principio_de_segregaci%C3%B3n_de_la_interfaz)

Este principio establece que los clientes de un programa dado sólo deberían conocer **aquellos métodos del programa que
realmente usan, y no aquellos que no necesitan usar**.

- [**D - Principio de Inversión de
  Dependencias** ("Dependency Inversion Principle" - DIP)](https://es.wikipedia.org/wiki/Inyecci%C3%B3n_de_dependencias)

Este principio consta de dos partes:

1. **Módulos de alto nivel no deben depender de módulos de bajo nivel**. Ambos deben depender de abstracciones.

2. **Abstracciones no deberían depender de detalles**. Los detalles debieran depender de abstracciones.

## _"Dependency Inversion Principle"_

![DIP](https://raw.githubusercontent.com/alxgcrz/apuntes-principios-solid/master/images/dependency_inversion_principle_thumb.jpg)

La idea general de este principio es tan simple como importante: los módulos de alto nivel, que brindan una lógica
compleja, deben ser fácilmente reutilizables y no verse afectados por los cambios en los módulos de bajo nivel, que
brindan funciones de utilidad. Para lograr eso, se deben introducir una abstracción que desacople los módulos de alto y
bajo nivel entre sí.

La definición de este principio según **Robert C. Martin** consta de dos partes:

- Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deberían depender de abstracciones.
- Las abstracciones no deben depender de los detalles. Los detalles deben depender de las abstracciones.

Un importante detalle de esta definición es que tanto los módulos de alto nivel como los de bajo nivel dependen de una
abstracción. Por tanto no se invierte la dirección de la dependencia como cabría esperar por el nombre del principio
sino que se divide la dependencia entre los módulos de alto y bajo nivel introduciendo una abstracción entre ellos.

Si se han aplicado correctamente el *__"Open/Closed Principle"__* y el *__"Liskov Substitution Principle"__* también se
ha aplicado este principio.

El *__"Open/Closed Principle"__* requiere que el componente esté abierto a extensión pero cerrado a modificación. Se
puede lograr introduciendo interfaces para las que puede proporcionar diferentes implementaciones. La interfaz en sí
misma está cerrada a modificaciones y puede ampliarse fácilmente proporcionando una nueva implementación de interfaz.

Sus implementaciones deben seguir el *__"Liskov Substitution Principle"__* para que pueda reemplazarlas con otras
implementaciones de la misma interfaz sin "romper" la aplicación o sistema.

### Implementación

En el ejemplo tenemos la clase `Driver` que tiene una dependencia con la clase `RacingCar` ya que en su constructor se
instancia un objeto de la clase `RacingCar`:

```kt
open class RacingCar(private var remainingFuel: Int) {
    private var power = 0
    fun accelerate() {
        increasePower()
        decrementFuel()
    }

    open protected fun decrementFuel() {
        remainingFuel--
    }

    open protected fun increasePower() {
        power++
    }

}

class Driver {
    val racingCar: RacingCar
    init {
        racingCar = RacingCar(100)
    }

    fun increaseSpeed() {
        racingCar.accelerate()
    }

}
```

Para introducir una abstracción que desacople ambas clases creamos la interfaz `Car` de forma que la clase `Driver` en
su constructor recibirá un objeto que implementa dicha interfaz. En el ejemplo la clase `RacingCar` implementa dicha
interfaz pero si hemos aplicado correctamente los otros principios podremos utilizar otras implementaciones y ampliar la
funcionalidad del sistema sin que se produzcan errores.

![Diagram](https://raw.githubusercontent.com/alxgcrz/apuntes-principios-solid/master/src/solid/dip/dip_solution_diagram.png)

```Kt
interface Car {
    fun accelerate()
}

open class RacingCar(private var remainingFuel: Int) : Car {
    private var power = 0
    override fun accelerate() {
        increasePower()
        decrementFuel()
    }

    open protected fun decrementFuel() {
        remainingFuel--
    }

    open protected fun increasePower() {
        power++
    }

}

class Driver(car: Car) {
    val racingCar: Car

    init {
        racingCar = RacingCar(100)
    }

    fun increaseSpeed() {
        racingCar.accelerate()
    }

}
```

Este principio está relacionado con el concepto de [*"Inyección de
Dependencias"*](https://es.wikipedia.org/wiki/Inyecci%C3%B3n_de_dependencias) ya que será otro sistema el que _'
inyecte'_ en tiempo de ejecución la implementación que requiera la clase en el constructor.

---

## Links

- <https://es.wikipedia.org/wiki/SOLID>
- <https://blogs.msdn.microsoft.com/cdndevs/2009/07/15/the-solid-principles-explained-with-motivational-posters/>
- <https://profile.es/blog/principios-solid-desarrollo-software-calidad/>
- <https://www.baeldung.com/java-liskov-substitution-principle>
- <https://github.com/revilofe/_principios-SOLID_/edit/main/README.md>

## License

[![Licencia de Creative Commons](https://i.creativecommons.org/l/by-sa/4.0/80x15.png)](http://creativecommons.org/licenses/by-sa/4.0/)  
Esta obra está bajo
una [licencia de Creative Commons Reconocimiento-Compartir Igual 4.0 Internacional](http://creativecommons.org/licenses/by-sa/4.0/)
.
