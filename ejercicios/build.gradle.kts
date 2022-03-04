//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

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
    implementation("org.junit.jupiter:junit-jupiter:5.7.0")
    implementation("com.google.code.gson:gson:2.8.5") // GSON -> DataClass
    implementation("io.github.microutils:kotlin-logging-jvm:2.1.20") // LOGGER
    implementation("org.slf4j:slf4j-simple:1.7.32") // LOGGER
    implementation("de.m3y.kformat:kformat:0.9") //KFORMAT
    implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3.4") //Kotlinx-cli
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