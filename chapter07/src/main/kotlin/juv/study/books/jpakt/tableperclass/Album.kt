package juv.study.books.jpakt.tableperclass

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.persistence.Table

@Entity(name = "TablePerClassAlbum")
@Table(name = "table_per_class_albums")
class Album(
    name: String,
    price: Int,
    val artist: String
) : Item(name = name, price = price) {
}