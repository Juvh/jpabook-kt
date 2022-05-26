package juv.study.books.jpakt.fetch.example

import javax.persistence.*

@Entity(name = "FetchExMember")
@Table(name = "fetch_ex_members")
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val memberId: Long? = null,

    val userName: String,
    var age: Int,

    @ManyToOne(fetch = FetchType.EAGER)
    var team: Team
) {
    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    val orders: MutableList<Order> = mutableListOf()
}