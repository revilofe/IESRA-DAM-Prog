import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
}

group = "me.usuario"
version = "1.0-SNAPSHOT"

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.7.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    //useJUnit()
    useJUnitPlatform()

}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}