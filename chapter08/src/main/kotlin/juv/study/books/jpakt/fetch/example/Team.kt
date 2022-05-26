package juv.study.books.jpakt.fetch.example

import javax.persistence.*

@Entity(name = "FetchExTeam")
@Table(name = "fetch_ex_teams")
class Team(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val teamId: Long? = null,
) {
}