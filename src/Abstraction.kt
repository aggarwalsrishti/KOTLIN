abstract class Vehicle{
    //cannot create object
    //2 types of func body me abstract other like normal
    abstract fun startEngine()
    fun horn(){
        println("Peep peep")
    }
}
class Car3: Vehicle(){
    override fun startEngine(){}
}