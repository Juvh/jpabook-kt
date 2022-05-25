package juv.study.books.jpakt.proxy

import javax.persistence.*

@Entity(name = "ProxyMember")
@Table(name = "proxy_members")
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val memberId: Long? = null,

    var userName: String,

    @ManyToOne
    var team: Team? = null
) {
}