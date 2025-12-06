//Clases e interfaz

interface Evaluable{
    fun evaluatePerformance(): Unit
}

abstract class Employee(val name: String, val salary: Double) : Evaluable{

    abstract fun work()
    abstract fun calculateAnnualBonus(): Double
    fun details(){
        println("Detalles del empleado\n nombre: $name, salario: $salary")
    }
}

class Developer (name: String, salary: Double) : Employee(name, salary) {
    override fun work() {
        println("Desarrollador $name trabaja con salario de $salary")
    }

    override fun calculateAnnualBonus(): Double {
        return salary*100/10
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
        return salary*100/20
    }


    override fun evaluatePerformance(): Unit {
        println("El manager trabaja aceptable")
    }
}

class Designer (name: String, salary: Double) : Employee(name, salary) {
    override fun work() {
        println("Diseñador $name trabaja con salario de $salary")
    }

    override fun calculateAnnualBonus(): Double {
        return salary*100/15
    }

    override fun evaluatePerformance(): Unit {
        println("El diseñador trabaja mal")
    }
}