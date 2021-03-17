import java.util.*
fun main () {
 namesArray("Beth","Stella","Daisi","Hannah")

    country()

    num()

    var name=student("Steph", "Botswana", "dark")
    println(name)



}

fun namesArray(a: String,b: String, c:String, d: String ): String {
    var namesArray= arrayOf("Beth", "Stella", "Daisi", "Hannah")
    println(Arrays.toString(namesArray))
    return (Arrays.toString(namesArray))

}

fun country() {
    var cities= arrayOf("harare", "mumbai", "dodoma", "jakarta")
    println(cities[0].capitalize()+","+cities[1].capitalize()+","+cities[2].capitalize()+","+cities[3])


}

fun num() {
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var total= numbers.component2() + numbers.component5()
    println(total)

    var index= numbers.indexOf(158)
    println(index)

    var int=numbers.sortedArray()
    for (element in int) {
        println(element)
    }
}

    fun student(name: String,country: String, complexion: String): String{
        var string= arrayOf(name,country,complexion)
        return(Arrays.toString(string))

    }



