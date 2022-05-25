package juv.study.books.jpakt.proxy

import javax.persistence.*

@Entity(name = "ProxyTeam")
@Table(name = "proxy_teams")
class Team(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val memberId: Long? = null,

    var name: String
) {
}