import java.lang.Math.pow
import kotlin.math.sqrt

fun main() {

    //1
    val exercises : Int = 13
    var exercisesSolved : Int = 0
    exercisesSolved +=1

    //2
    val myAge : Int = 18
    exercisesSolved +=1

    //3
    var mean : Double = 18.00
    mean = (mean + 30)/2
    println(mean)
    println()
    exercisesSolved +=1

    //4
    val testNumber: Int = 15
    val evenOdd : Int = testNumber%2
    println(evenOdd)
    println()
    exercisesSolved +=1

    //5
    var answer: Int = (0+1+10)*10
    println(answer)
    println(answer shr 3)
    println()
    exercisesSolved +=1

    //6
    var age : Int = 16 // буду использовать var
    val a: Int = 46
    val b : Int = 10
    exercisesSolved +=1

    //7
    val answer1 : Int = (a*100)+b
    val answer2 : Int = (a*100)+(b*100)
    val answer3 : Int = (a*100)+(b/10)
    println(answer3)
    println()
    exercisesSolved +=1

    //8
    println((5*3) -(4/2)*2)
    println()
    exercisesSolved +=1

    //9
    val c : Double = 4.00
    val d : Double = 2.00
    val average : Double = (c+d)/2
    println(average)
    println()
    exercisesSolved +=1

    //10
    val fahrenheit : Double = 173.8
    val celcius : Double = ((fahrenheit-32)/1.8)
    println(celcius)
    println()
    exercisesSolved +=1

   //11
    val position : Int = 43
    val row : Int = (position/3)
    val column : Int = (position%4)
    println(row)
    println(column)
    println()
    exercisesSolved +=1

    //12
    val degress : Double = 540.00
    val pi : Int= 180
    val radius : Double = (degress/pi)
    println(radius)
    println()
    exercisesSolved +=1

    //13
    val x1 : Double = 4.00
    val y1 : Double = 2.00
    val x2 : Double = -5.00
    val y2 : Double = 2.00
    val distance : Double = sqrt(pow((x2-x1),2.00)+pow((y2-y1),2.00))
    println(distance)
    println()
    exercisesSolved +=1

}