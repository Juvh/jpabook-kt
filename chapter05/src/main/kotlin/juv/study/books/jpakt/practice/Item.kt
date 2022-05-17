package juv.study.books.jpakt.practice

import javax.persistence.*

@Entity
@Table(name = "items")
class Item(
    @Id
    @GeneratedValue
    val id: Long? = null,

    val name: String,

    var price: Int,

    var stockQuantity: Int
) {
    @OneToMany(mappedBy = "item")
    var orderItems: MutableList<OrderItem> = mutableListOf()
}