package juv.study.books.jpakt.one2many

import javax.persistence.*

@Entity(name = "One2ManyTeam")
@Table(name = "otm_teams")
class Team(
    @Id
    @GeneratedValue
    val id: Long? = null,
    val name: String
) {
    @OneToMany
    @JoinColumn(name = "teamId")    // teamId of otm_members table
    var members: MutableList<Member> = mutableListOf()
}