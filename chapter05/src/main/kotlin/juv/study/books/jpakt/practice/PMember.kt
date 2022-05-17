package juv.study.books.jpakt.practice

import javax.persistence.*

@Entity
@Table(name = "p_members")
class PMember(
    @Id
    @GeneratedValue
    val id: Long? = null,
    var name: String?,
    var city: String?,
    var street: String?,
    var zipcode: String?
) {
    @OneToMany(mappedBy = "member")
    var orders: MutableList<Order> = mutableListOf()
}