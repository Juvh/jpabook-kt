object Version {
    const val hibernate = "5.6.7.Final"
    const val h2_database = "2.1.210"
}

plugins {
    kotlin("jvm") version "1.6.10"
    kotlin("kapt") version "1.6.10"
    kotlin("plugin.noarg") version "1.6.10"
    kotlin("plugin.allopen") version "1.6.10"
}
noArg {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.Embeddable")
    annotation("javax.persistence.MappedSuperclass")
    annotation("NoArg")
}
allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.Embeddable")
    annotation("javax.persistence.MappedSuperclass")
    annotation("juv.study.books.jpakt.NoArg")
}

group = "juv.study.books.jpakt.chapter10"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    // https://mvnrepository.com/artifact/org.hibernate/hibernate-core
    implementation("org.hibernate:hibernate-core:${Version.hibernate}")

    // https://mvnrepository.com/artifact/com.querydsl/querydsl-jpa
    api("com.querydsl:querydsl-jpa:5.0.0")

    // https://mvnrepository.com/artifact/com.querydsl/querydsl-apt
    kapt("com.querydsl:querydsl-apt:5.0.0:jpa")

    // https://mvnrepository.com/artifact/com.h2database/h2
    implementation("com.h2database:h2:${Version.h2_database}")
}