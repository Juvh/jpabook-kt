package juv.study.books.jpakt.fetch.lazy

import javax.persistence.*

@Entity(name = "LazyTeam")
@Table(name = "lazy_teams")
class Team(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val teamId: Long? = null,

    val name: String
) {
}