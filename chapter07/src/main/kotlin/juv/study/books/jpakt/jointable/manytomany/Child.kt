package juv.study.books.jpakt.jointable.manytomany

import javax.persistence.*

@Entity(name = "JoinTableM2MChild")
@Table(name = "join_table_m2m_children")
class Child(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "childId")
    val id: Long? = null,

    var name: String
) {
}