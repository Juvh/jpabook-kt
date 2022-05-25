package juv.study.books.jpakt.jointable.onetoone

import javax.persistence.*

@Entity(name = "JoinTableO2OChild")
@Table(name = "join_table_o2o_children")
class Child(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "childId")
    val id: Long? = null,

    var name: String,
) {
}