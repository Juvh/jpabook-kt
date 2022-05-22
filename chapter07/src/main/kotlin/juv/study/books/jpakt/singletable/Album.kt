package juv.study.books.jpakt.singletable

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.persistence.Table

@Entity(name = "SingleTableAlbum")
@DiscriminatorValue(value = "A")
class Album(
    name: String,
    price: Int,
    val artist: String
) : Item(name = name, price = price) {
}