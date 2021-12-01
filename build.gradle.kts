import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
}

group = "de.philgamer"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots")

}

dependencies {
    testImplementation(kotlin("test"))
    implementation("net.axay:kspigot:1.17.4")
    compileOnly("org.spigotmc:spigot-api:1.18-R0.1-SNAPSHOT")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}