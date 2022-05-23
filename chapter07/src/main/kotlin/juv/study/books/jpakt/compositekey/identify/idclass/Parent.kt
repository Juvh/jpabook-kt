package juv.study.books.jpakt.compositekey.identify.idclass

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass
import javax.persistence.Table

@Entity(name = "IdentifyIdClassParent")
@Table(name = "identify_id_class_parents")
class Parent(
    @Id
    @Column
    val id: String,

    val name: String
) {
}