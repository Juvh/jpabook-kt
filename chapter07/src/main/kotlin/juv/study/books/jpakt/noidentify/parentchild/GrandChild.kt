package juv.study.books.jpakt.noidentify.parentchild

import javax.persistence.*

@Entity(name = "NoIdentifyPCGrandChild")
@Table(name = "no_identify_pc_grand_children")
class GrandChild(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grandChildId")
    val id: Long? = null,
    var name: String,

    @ManyToOne
    @JoinColumn(name = "childId")
    val child: Child? = null
) {
}