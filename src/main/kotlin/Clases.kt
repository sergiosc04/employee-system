//Clases e interfaz

interface Evaluable{
    fun evaluatePerformance(): Unit
}

//Clase abstracta que sera usada en las demas
abstract class Employee(val name: String, val salary: Double) : Evaluable{

    abstract fun work()
    abstract fun calculateAnnualBonus(): Double

    //funcion ya definida
    fun details(){
        println("Detalles del empleado\nnombre: $name, salario: $salary")
    }
}

class Developer (name: String, salary: Double) : Employee(name, salary) {
    override fun work() {
        println("Desarrollador $name trabaja con salario de $salary")
    }

    override fun calculateAnnualBonus(): Double {
        return salary*(20.0/100)
    }

    override fun evaluatePerformance(): Unit {
        println("El desarrollador trabaja bien")
    }
}

class Manager (name: String, salary: Double) : Employee(name, salary) {
    override fun work() {
        println("Manager $name trabaja con salario de $salary")
    }

    override fun calculateAnnualBonus(): Double {
        return salary*(20.0/100)
    }


    override fun evaluatePerformance(): Unit {
        println("El manager trabaja regular")
    }
}

class Designer (name: String, salary: Double) : Employee(name, salary) {
    override fun work() {
        println("Diseñador $name trabaja con salario de $salary")
    }

    override fun calculateAnnualBonus(): Double {
        return salary*(15.0/100)
    }

    override fun evaluatePerformance(): Unit {
        println("El diseñador trabaja mal")
    }
}