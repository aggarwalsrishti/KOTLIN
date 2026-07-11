class Car2(var model:String){
    var formattedModel=""
    init {
        formattedModel=model.uppercase()
        println(formattedModel)
    }
}
fun main(){
    val car=Car2("Hyundai Creta")
}