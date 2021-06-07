package varGet

class Box <T>{
    var array :ArrayList<T> = ArrayList()
    var size : Int
        get() = array.size
        set(value) {
            var tmpArray : ArrayList<T> = array.clone() as ArrayList<T>
            array= ArrayList(array.size + value)
            for ( i in tmpArray){
                array.add(i)
            }
        }
    val isEmpt :Boolean
        get() = this.size ==0

    fun add(a : T){
        array.add(a)
    }

    override fun toString():String{
        return array.toString()
    }

    fun getCapacity():Int{
        return array.count()
    }
    fun remove(a:T){
        array.remove(a)
    }
}