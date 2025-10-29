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

// You might need to update this path to your sketchbook location
val sketchbook = "${System.getProperty("user.home")}/Documents/Processing"

dependencies {
    implementation("org.processing:core:4.4.10")
    implementation(fileTree("$sketchbook/libraries").apply { include("**/*.jar") })
}

kotlin {
    jvmToolchain(17)
}
