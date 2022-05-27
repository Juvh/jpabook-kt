package juv.study.books.jpakt.mapping

import javax.persistence.*

@Entity(name = "EmbeddedMappingMember")
@Table(name = "embedded_mapping_members")
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String,

    @Embedded
    var phoneNumber: PhoneNumber,

    @Embedded
    var homeAddress: Address,

    @Embedded
    @AttributeOverrides(
        value = [
            AttributeOverride(name = "city", column = Column(name = "companyCity")),
            AttributeOverride(name = "street", column = Column(name = "companyStreet")),
            AttributeOverride(name = "zipcode", column = Column(name = "companyZipcode"))
        ]
    )
    var companyAddress: Address
) {
}