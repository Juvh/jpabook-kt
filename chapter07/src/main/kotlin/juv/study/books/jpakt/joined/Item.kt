package juv.study.books.jpakt.joined

import javax.persistence.*

@Entity(name = "JoinedItem")
@Table(name = "joined_items")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
class Item(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var name: String,
    var price: Int
) {
}