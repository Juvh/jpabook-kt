package juv.study.books.jpakt.jointable.onetomany

import javax.persistence.*

@Entity(name = "JoinTableO2MParent")
@Table(name = "join_table_o2m_parents")
class Parent(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parentId")
    val id: Long? = null,

    var name: String,

    @OneToMany
    @JoinTable(
        name = "o2m_parent_child",
        joinColumns = [JoinColumn(name = "parentId")],
        inverseJoinColumns = [JoinColumn(name = "childId")]
    )
    var child: MutableList<Child> = mutableListOf()

) {
}