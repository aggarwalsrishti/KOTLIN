fun main(){
    calculateMarks(maths=80,science=90,english=50)
    val percentage = calculatePercentage(245,300)
    println("Percentage: $percentage")
}
fun calculateMarks(maths: Int, science: Int, english: Int){
    val total= maths+science+english
    println("TOTAL: $total")
}
fun calculatePercentage(marks:Int , totalMarks:Int): Float{
    return (marks.toFloat() / totalMarks)*100
}