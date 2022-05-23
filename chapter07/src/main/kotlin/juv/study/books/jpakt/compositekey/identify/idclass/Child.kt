package juv.study.books.jpakt.compositekey.identify.idclass

import javax.persistence.*

@IdClass(ChildId::class)
@Entity(name = "IdentifyIdClassChild")
@Table(name = "identify_id_class_children")
class Child(
    @Id
    @ManyToOne
    @JoinColumn(name = "parentId")
    val parent: Parent,

    @Id
    @Column
    val childId: String,

    var name: String
) {

}