package juv.study.books.jpakt.practice.item

import juv.study.books.jpakt.practice.category.Category
import juv.study.books.jpakt.practice.order.OrderItem
import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@Table(name = "items")
abstract class Item(
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