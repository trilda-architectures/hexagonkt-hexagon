
plugins {
    id("java-library")
}

apply(from = "../gradle/kotlin.gradle")
apply(from = "../gradle/publish.gradle")
apply(from = "../gradle/dokka.gradle")
apply(from = "../gradle/detekt.gradle")
apply(from = "../gradle/native.gradle")

dependencies {
    "api"(project(":core"))

    "testImplementation"(project(":serialization_jackson_yaml"))
}