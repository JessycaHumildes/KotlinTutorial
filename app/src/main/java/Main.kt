import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {

////    for (i in 1..10) {
//        val dracula = VampyreKing("Dracula")
//        println(dracula)
//
//        dracula.lives = 0
//        do{
//            if (dracula.dodges()) {
//                dracula.lives +=1
//                continue
//            }
//            if (dracula.runAway()) {
//                println("Dracula ran away")
//                break
//            } else {
//                dracula.takeDamage(12)
//            }
//        }while (dracula.lives > 0)
//    println("------------------------------------")

    val conan = Player("Conan")
        conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.getLoot(Loot("Ring of Speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
//    conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.showInventory()

    conan.dropLoot("Gold Ring")
    conan.showInventory()

    conan.dropLoot("Silver Ring")
    conan.showInventory()

    val dropped = conan.dropLoot("Somtg not present")
    println(dropped)

    println(conan.dropLoot("Smtg else"))

    if (conan.dropLoot("A Bit of Junk")){
        println("Junk Dropped")

    }else{
        println("Hou dont have any Junk")
    }

}
