package juv.study.books.jpakt.practice.member

import juv.study.books.jpakt.practice.order.Order
import juv.study.books.jpakt.practice.BaseEntity
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "members")
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var name: String?,
    var city: String?,
    var street: String?,
    var zipcode: String?
) : BaseEntity(createdAt = LocalDateTime.now()) {
    @OneToMany(mappedBy = "member")
    var orders: MutableList<Order> = mutableListOf()
}