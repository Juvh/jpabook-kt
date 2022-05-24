package juv.study.books.jpakt.noidentify.parentchild

import javax.persistence.*

@Entity(name = "NoIdentifyPCParent")
@Table(name = "no_identify_pc_parents")
class Parent(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parentId")
    val id: Long? = null,
    var name: String
) {
}