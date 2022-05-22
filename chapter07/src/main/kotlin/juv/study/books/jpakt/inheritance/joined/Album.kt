package juv.study.books.jpakt.inheritance.joined

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.persistence.Table

@Entity(name = "JoinedAlbum")
@Table(name = "joined_albums")
@DiscriminatorValue(value = "A")
class Album(
    name: String,
    price: Int,
    val artist: String
) : Item(name = name, price = price) {
}