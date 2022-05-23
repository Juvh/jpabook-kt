package juv.study.books.jpakt.compositekey.nonidentify.idclass

import javax.persistence.*

@Entity(name = "NoIdentifyIdClassChild")
@Table(name = "no_identify_id_class_children")
class Child(
    @Id
    val id: String,

    @ManyToOne
    @JoinColumns(
        value = [
            JoinColumn(name = "parentId1", referencedColumnName = "id1"),
            JoinColumn(name = "parentId2", referencedColumnName = "id2")
        ]
    )
    var parent: Parent? = null
) {

}