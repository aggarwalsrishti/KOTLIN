class Car1{
    var model: String
    var color: String
    constructor(model:String){
        this.model=model
        this.color="No color"
        println("Model constructor")
    }
    constructor(model:String, color:String){
        this.model=model
        this.color=color
        println("Model and color Constructor")
    }
    fun horn(){
        println("$color $model horn : beep beep")
    }
}
fun main(){
    val car1=Car1("Hyundai Creta")
    val car2=Car1("Creta","Red")
    car1.horn()
    car2.horn()
}