plugins {
    kotlin("jvm") version "2.3.21"
}

group = "org.lugo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
val ev_version = "1.0.2"
dependencies {
    testImplementation(kotlin("test"))
    // Source: https://mvnrepository.com/artifact/org.jsoup/jsoup
    implementation("org.jsoup:jsoup:1.23.2")
    // Source: https://mvnrepository.com/artifact/commons-validator/commons-validator
    implementation("commons-validator:commons-validator:1.11.0")
    implementation("org.magicwerk.brownies:brownies-collections:0.9.24")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}