fun main(){
    greeting()
    greeting("Ram")
    greeting("Ram" , "Gupta")
}
fun greeting(){
    println("Good Morning")
}
fun greeting(name : String){
    println("Good Morning $name")
}
fun greeting(firstName: String, lastName: String){
    println("Good Morning $firstName $lastName")
}