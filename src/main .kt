fun main() {
    var car = Car("Ford", "Mustang", "red", 6)
    car.carry(20)
    car.identity()
    car.calculateParkingFees(6)

    var bus = Bus("Ram promaster", "collins bus corp", "blue", 34)
    var trip = bus.maxTripFare(70.30)
    println(trip)

    var maximum = car.calculateParkingFees(7)
    println(maximum)
}

open class Car(var make: String, var model: String, var color: String, var capacity: Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else {
            println("overcapacity by $x people")
        }
    }

    fun identity() {
        println("I am a $color $make $model")
    }

    open fun calculateParkingFees(hours: Int): Int {
        var parkingFees = hours * 20
        return (parkingFees)
    }
}

//Question 2
open class Bus(model: String, make: String, color: String, capacity: Int) : Car(model, make, color, capacity) {
    fun maxTripFare(fare: Double): Double {
        var maximumAmount = fare * capacity
        return (maximumAmount)
    }

    override fun calculateParkingFees(hours: Int): Int {
        var product = capacity * hours
        return (product)

    }
}