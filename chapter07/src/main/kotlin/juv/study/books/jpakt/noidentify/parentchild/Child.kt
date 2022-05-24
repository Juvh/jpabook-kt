package juv.study.books.jpakt.noidentify.parentchild

import javax.persistence.*

@Entity(name = "NoIdentifyPCChild")
@Table(name = "no_identify_pc_children")
class Child(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "childId")
    val id: Long? = null,
    var name: String,

    @ManyToOne
    @JoinColumn(name = "parentId")
    val parent: Parent? = null
) {
}