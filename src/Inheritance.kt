open class GrandParentsHouse(){
    var room=1
    var material="mud"
    open fun describe(){
        println("House is made up of $material and has $room room")
    }
}
open class ParentHouse: GrandParentsHouse(){
    init {
        room=3
        material="concrete"
    }
    override fun describe(){
        println("House is made up of $material")
        println("It has $room room")
    }
}
class ChildHouse(val types:String): ParentHouse(){
    var type=types
    init{
        room=5
    }
    override fun describe(){
        super.describe()
        println("House type: $type and rooms: $room")
    }
}
fun main(){
    val grandParentsHouse= GrandParentsHouse()
    grandParentsHouse.describe()
    val parentsHouse= ParentHouse()
    parentsHouse.describe()
    val childHouse= ChildHouse("Modern")
    childHouse.describe()
}