package juv.study.books.jpakt.compositekey.identify.idclass

import javax.persistence.*

@IdClass(GrandChildId::class)
@Entity(name = "IdentifyIdClassGrandChild")
@Table(name = "identify_id_class_grand_children")
class GrandChild(
    @Id
    @ManyToOne
    @JoinColumns(
        value = [
            JoinColumn(name = "parentId", referencedColumnName = "parentId"),
            JoinColumn(name = "childId", referencedColumnName = "childId")
        ]
    )
    val child: Child,

    @Id
    @Column
    val id: String,

    var name: String
) {
}