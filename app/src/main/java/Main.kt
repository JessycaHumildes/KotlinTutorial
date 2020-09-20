import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {

    val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampyre("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)

    val dracula = VampyreKing("Dracula")
    println(dracula)
    while (dracula.lives > 0) {
        if (dracula.runAway()) {
            println("Dracula ran away")
            break
        } else {
            dracula.takeDamage(12)
        }
    }

}

