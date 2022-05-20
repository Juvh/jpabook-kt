package juv.study.books.jpakt.practice

import javax.persistence.*

@Entity
@Table(name = "items")
class Item(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String,

    var price: Int,

    var stockQuantity: Int,

    @ManyToMany(mappedBy = "items")
    var categories: MutableList<Category> = mutableListOf()
) {
    @OneToMany(mappedBy = "item")
    var orderItems: MutableList<OrderItem> = mutableListOf()
}