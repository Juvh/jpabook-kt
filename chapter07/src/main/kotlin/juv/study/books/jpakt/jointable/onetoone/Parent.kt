package juv.study.books.jpakt.jointable.onetoone

import javax.persistence.*

@Entity(name = "JoinTableO2OParent")
@Table(name = "join_table_o2o_parents")
class Parent(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parentId")
    val id: Long? = null,

    var name: String,

    @OneToOne
    @JoinTable(
        name = "o2o_parent_child",
        joinColumns = [JoinColumn(name = "parentId")],
        inverseJoinColumns = [JoinColumn(name = "childId")]
    )
    var child: Child? = null

) {
}