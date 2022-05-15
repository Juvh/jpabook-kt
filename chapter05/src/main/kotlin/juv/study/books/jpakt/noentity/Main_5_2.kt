package juv.study.books.jpakt.noentity

fun main() {
    val member1 = Member(1L, "User1")
    val member2 = Member(2L, "User2")
    val team = Team(1L, "Team1")

    member1.team = team
    member2.team = team

    val findTeam = member1.team
}