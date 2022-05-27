package juv.study.books.jpakt.collection

import entityManagerFactory
import juv.study.books.jpakt.embedded.Address

fun main() {
    save()
    find()
    update()

    entityManagerFactory.close()
}

private fun save() {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction

    tx.begin()

    val member = Member(homeAddress = Address(city = "City", street = "999 street", zipcode = "98765"))
    member.favoriteFoods.add("짬뽕")
    member.favoriteFoods.add("자장면")
    member.favoriteFoods.add("광어")
    member.favoriteFoods.add("양장피")

    member.addressHistory.add(Address(city = "Seoul", street = "Seoul-ro", zipcode = "11111"))
    member.addressHistory.add(Address(city = "Busan", street = "Busan-ro", zipcode = "22222"))

    entityManager.persist(member)

    tx.commit()
    entityManager.close()
}

private fun find() {
    val entityManager = entityManagerFactory.createEntityManager()
    val member = entityManager.find(Member::class.java, 1L)

    println("==== get homeAddress")
    val homeAddress = member.homeAddress

    println("==== get favoriteFoods")
    val favoriteFoods = member.favoriteFoods

    println("==== iterate favoriteFoods")
    for (favoriteFood in favoriteFoods) {
        println(favoriteFood)
    }

    println("==== get addressHistory")
    val addressHistory = member.addressHistory
    println(addressHistory)

    entityManager.close()
}

private fun update() {
    val entityManager = entityManagerFactory.createEntityManager()
    val tx = entityManager.transaction

    tx.begin()

    val member = entityManager.find(Member::class.java, 1L)

    println("==== update favoriteFoods")
    member.favoriteFoods.remove("짬뽕")
    member.favoriteFoods.add("참치")

    println("==== update addressHistory")
    member.addressHistory.removeFirst()
    member.addressHistory.add(Address(city = "Seoul", street = "Seoul-ro", zipcode = "12211"))

    tx.commit()
    entityManager.close()
}