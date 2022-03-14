//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


// Variables
val exposedVersion: String by project
val h2Version: String by project

plugins {
    kotlin("jvm") version "1.6.10-RC"
    id("org.jetbrains.dokka") version "1.6.10"
    //plugins {
    //    id("org.jetbrains.kotlinx.kover") version "0.5.0-RC2"
    //}
}

repositories {
    mavenCentral()
}

group = "me.usuario"
version = "1.0-SNAPSHOT"

dependencies {

    // Exposed
    implementation("org.jetbrains.exposed:exposed-core:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-dao:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposedVersion")
    // Para manejar las fechas
    implementation("org.jetbrains.exposed:exposed-java-time:$exposedVersion")

    // Opcionales
    // Para manejar un pool de conexions mega rápido con HikariCP (no es obligatorio)
    // https://mvnrepository.com/artifact/com.zaxxer/HikariCP
    implementation("com.zaxxer:HikariCP:5.0.1")

    // BBDD H2
    implementation("com.h2database:h2:$h2Version")
    // BBDD POSTGRESQL
    implementation("org.postgresql:postgresql:42.3.1")

    // GSON -> DataClass - Trabajar con JSON
    implementation("com.google.code.gson:gson:2.8.5")

    // Logger
    implementation("io.github.microutils:kotlin-logging-jvm:2.1.20")
    implementation("org.slf4j:slf4j-simple:1.7.32")

    // KFORMAT - Formateo de la salida por tablas
    implementation("de.m3y.kformat:kformat:0.9")

    // Kotlinx-cli - Parseo de linea de comandos.
    implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3.4")

    // Testing
    implementation("org.junit.jupiter:junit-jupiter:5.7.0")
    testImplementation(kotlin("test"))

}

tasks.test {
    //useJUnit()
    useJUnitPlatform()

}
/*
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
 */