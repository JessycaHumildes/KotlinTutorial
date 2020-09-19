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
    tim.inventory.add(redPotion)
    tim.showInventory()
    println(tim)
}
