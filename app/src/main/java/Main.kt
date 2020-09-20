import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {

    val tim = Player("Tim")
//    println(tim.name)
//    println(tim.lives)
//    println(tim.level)
//    println(tim.score)

    tim.Show()

    val louise = Player("Louise", 5)
    louise.Show()

    val newP = Player("newP", 4, 8)
    val newp2 = Player("newp2", 2, 5, 1000)
    newP.Show()
    newp2.Show()
    println(newP.weapon.name.toUpperCase())
    println(newP.weapon.damageInflicted)

    val axe = Weapon("Axe", 2)
    newp2.weapon= axe
    println(newp2.weapon.name)
    println(axe.name)

    axe.damageInflicted=24
    println(axe.damageInflicted)
    println(newp2.weapon.damageInflicted)

    tim.weapon = Weapon("Sword", 12)
//    println(tim.weapon.name)
    tim.Show()

    louise.weapon = tim.weapon
    louise.Show()

    tim.weapon = Weapon("Spear", 10)
//    println(tim.weapon.name)
    tim.Show()

    val redPotion = Loot("Red Potion", LootType.POTION, 7.5)
    tim.getLoot(redPotion)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.0)
    tim.getLoot(chestArmor)
    tim.showInventory()

    tim.getLoot(Loot("Ring of Protection +2", LootType.RING, 40.25))
    tim.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))
    tim.showInventory()

    if (tim.dropLoot(redPotion)){
        tim.showInventory()
    }else{
        println("You dont have ${redPotion.name}")
    }

    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.00)
    if (tim.dropLoot(bluePotion)){
        tim.showInventory()
    }else{
        println("You dont have ${bluePotion.name}")
    }
    if (tim.dropLoot("Invisibility Potion")){
        tim.showInventory()
    }else{
        println("You dont have an Invisibility Potion")
    }



}
