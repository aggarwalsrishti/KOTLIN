class Student1(val name: String, val rollNo: Int){
    fun introduce(){
        println("I am $name and roll no is $rollNo")
    }
}
fun main(){
    val student =Student1("Riya", 20)
    student.introduce()
}