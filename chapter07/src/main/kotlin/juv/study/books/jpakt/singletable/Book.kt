package juv.study.books.jpakt.singletable

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.persistence.Table

@Entity(name = "SingleTableBook")
@DiscriminatorValue(value = "B")
class Book(
    name: String,
    price: Int,
    val author: String
) : Item(name = name, price = price)