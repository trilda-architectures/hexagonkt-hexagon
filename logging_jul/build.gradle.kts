
plugins {
    id("java-library")
}

apply(from = "../gradle/kotlin.gradle")
apply(from = "../gradle/publish.gradle")
apply(from = "../gradle/dokka.gradle")

description = "Hexagon Java Util Logging adapter."

dependencies {
    "api"(project(":core"))
}