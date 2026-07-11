class Car(){
    var name=""
    var model=""
    var color=""
    var engine=""
    fun horn(){
        println("$model car sounds- Beep Beep")
    }
    fun carColor(col: String){
        color=col
        println("car's color is $color")
    }
}
fun main(){
    val car1= Car()
    car1.name="abc"
    car1.model="xyz"
    car1.engine="pepper"
    car1.horn()
    car1.carColor("blue")
}