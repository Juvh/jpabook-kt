package juv.study.books.jpakt.compositekey.identify.embeddedid

import javax.persistence.*

@Entity(name = "IdentifyEmbeddedIdChild")
@Table(name = "identify_embedded_id_children")
class Child(
    @EmbeddedId
    val id: ChildId,

    val name: String,

    @ManyToOne
    @MapsId(value = "parentId")
    @JoinColumn(name = "parentId")
    var parent: Parent? = null
) {

}