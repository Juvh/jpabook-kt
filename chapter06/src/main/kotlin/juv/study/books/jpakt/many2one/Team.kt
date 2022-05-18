package juv.study.books.jpakt.many2one

import javax.persistence.*

@Entity(name = "Many2OneTeam")
@Table(name = "mto_teams")
class Team(
    @Id
    @GeneratedValue
    val id: Long? = null,
    val name: String
) {
    @OneToMany(mappedBy = "team")
    var members: MutableList<Member> = mutableListOf()

    fun addMember(member: Member) {
        if (!this.members.contains(member)) {
            this.members.add(member)
        }
        if (member.team != this) {
            member.team = this
        }
    }
}