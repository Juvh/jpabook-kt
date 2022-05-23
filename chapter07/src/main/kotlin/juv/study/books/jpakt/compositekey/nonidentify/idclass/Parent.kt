package juv.study.books.jpakt.compositekey.nonidentify.idclass

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass
import javax.persistence.Table

@Entity(name = "NoIdentifyIdClassParent")
@Table(name = "no_identify_id_class_parents")
@IdClass(ParentId::class)
class Parent(
    @Id
    @Column
    val id1: String,

    @Id
    @Column
    val id2: String,

    val name: String
) {
}