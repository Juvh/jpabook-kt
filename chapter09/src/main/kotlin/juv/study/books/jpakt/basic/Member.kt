package juv.study.books.jpakt.basic

import javax.persistence.*

@Entity(name = "BasicTypeMember")
@Table(name = "basic_type_members")
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String,
    var age: Int
) {
}