package juv.study.books.jpakt.jointable.manytomany

import javax.persistence.*

@Entity(name = "JoinTableM2MParent")
@Table(name = "join_table_m2m_parents")
class Parent(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parentId")
    val id: Long? = null,

    var name: String,

    @ManyToMany
    @JoinTable(
        name = "m2m_parent_child",
        joinColumns = [JoinColumn(name = "parentId")],
        inverseJoinColumns = [JoinColumn(name = "childId")]
    )
    var child: MutableList<Child> = mutableListOf()

) {
}