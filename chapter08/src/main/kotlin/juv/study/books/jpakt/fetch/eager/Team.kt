package juv.study.books.jpakt.fetch.eager

import javax.persistence.*

@Entity(name = "EagerTeam")
@Table(name = "eager_teams")
class Team(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val teamId: Long? = null,

    val name: String
) {
}