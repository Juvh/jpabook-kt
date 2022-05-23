package juv.study.books.jpakt.compositekey.nonidentify.embeddedid

import javax.persistence.*

@Entity(name = "NoIdentifyEmbeddedIdChild")
@Table(name = "no_identify_embedded_id_children")
class Child(
    @Id
    val id: String,

    val name: String,

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