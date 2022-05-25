package juv.study.books.jpakt.practice.item

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("ALBUM")
class Album(
    name: String,
    price: Int,
    stockQuantity: Int,

    val artist: String,
    val etc: String? = null
) : Item(name = name, price = price, stockQuantity = stockQuantity) {
}