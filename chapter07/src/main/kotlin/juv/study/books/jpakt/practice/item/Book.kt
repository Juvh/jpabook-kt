package juv.study.books.jpakt.practice.item

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("BOOK")
class Book(
    name: String,
    price: Int,
    stockQuantity: Int,

    val author: String,
    val isbn: String
) : Item(name = name, price = price, stockQuantity = stockQuantity) {
}