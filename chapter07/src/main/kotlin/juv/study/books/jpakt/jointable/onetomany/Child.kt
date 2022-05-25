package juv.study.books.jpakt.jointable.onetomany

import javax.persistence.*

@Entity(name = "JoinTableO2MChild")
@Table(name = "join_table_o2m_children")
class Child(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "childId")
    val id: Long? = null,

    var name: String,

    @ManyToOne(optional = false)
    @JoinTable(
        name = "o2m_parent_child",
        joinColumns = [JoinColumn(name = "childId")],
        inverseJoinColumns = [JoinColumn(name = "parentId")]
    )
    val parent: Parent
) {
}