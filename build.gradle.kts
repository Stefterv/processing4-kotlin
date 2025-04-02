plugins {
    kotlin("jvm") version "2.0.0"
}

tasks.wrapper.configure {
    enabled = false
}

repositories {
    mavenCentral()
    maven("https://jogamp.org/deployment/maven")
}

dependencies {
    implementation("org.processing:core:4.3.4")
}

kotlin {
    jvmToolchain(17)
}