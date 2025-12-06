//funcion main

fun main(){

    //Creo una lista que contenga empleados
    val listaEmpleados = listOf<Employee>(
        Developer("Dario", 1000.0),
        Manager("Marta", 1500.0),
        Designer("Diego", 2000.0)
    )

    //Recorro la lista y ejecuto los metodos de cada empleado
    for (e in listaEmpleados) {
        println("---")

        //uso el metodo definido de la clase abstracta
        e.details()

        println("")

        //uso los metodos sobreescritos por sus clases correspondientes
        e.work()
        println("El bonus anual es de ${e.calculateAnnualBonus()}")
        e.evaluatePerformance()
    }
}


