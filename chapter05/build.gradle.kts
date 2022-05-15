object Version {
    const val hibernate = "5.6.7.Final"
    const val h2_database = "2.1.210"
}

plugins {
    kotlin("jvm") version "1.6.10"
    kotlin("plugin.noarg") version "1.6.10"
    kotlin("plugin.allopen") version "1.6.10"
}
noArg {
    annotation("javax.persistence.Entity")
}
allOpen {
    annotation("javax.persistence.Entity")
}

group = "juv.study.books.jpakt.chapter05"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    // https://mvnrepository.com/artifact/org.hibernate/hibernate-core
    implementation("org.hibernate:hibernate-core:${Version.hibernate}")
    // https://mvnrepository.com/artifact/com.h2database/h2
    implementation("com.h2database:h2:${Version.h2_database}")
}