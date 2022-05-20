package juv.study.books.jpakt.practice

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
) {
    @OneToMany(mappedBy = "member")
    var orders: MutableList<Order> = mutableListOf()
}