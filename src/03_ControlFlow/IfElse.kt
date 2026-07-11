package `03_ControlFlow`

fun main(){
    val age=20
    if (age>=18){
        println("CAN VOTE")
    }
    else{
        println("CANNOT VOTE")
    }
    if (age in 18..30){
        println("youth")
    }
    else{
        println("not youth")
    }
}