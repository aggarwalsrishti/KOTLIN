class Student(){
    // class -> blueprint
    var name=""
    var rollNo=0
    fun doHomeWork(){
        println("Home Work Done")
    }
    fun introduce(){
        println("I am $name and I am $rollNo")
    }
}
fun main(){
    val student1 = Student() //object created of student1
    println(student1)
    student1.name="Rahul"
    student1.rollNo=18
    student1.doHomeWork()
    student1.introduce()
    val student2 = Student()
    println(student2)
    student2.name="Riya"
    student2.rollNo=20
    student2.doHomeWork()
    student2.introduce()
}