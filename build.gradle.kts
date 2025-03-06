plugins {
    kotlin("jvm") version "2.1.0"
    jacoco
    application
}

group = "com.likhitskiy.netologykotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}

tasks.test {
    useJUnit()
}

kotlin {
    jvmToolchain(17)
}

tasks.test {
    finalizedBy(tasks.jacocoTestReport) // report is always generated after tests run
}