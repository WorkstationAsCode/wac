plugins {
    kotlin("jvm") version "1.5.21"
    application
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "com.github.workstationascode.wac"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.20.2")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("com.github.workstationascode.wac.WAC")
}

tasks.withType<Jar> {
    archiveClassifier.set("alone")
    manifest {
        attributes["Main-Class"] = application.mainClass.get()
    }
}

tasks.withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
    minimize()
    archiveClassifier.set(null as String?)
}
