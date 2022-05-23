import javax.persistence.Persistence

val entityManagerFactory = Persistence.createEntityManagerFactory("jpabook")

annotation class NoArg