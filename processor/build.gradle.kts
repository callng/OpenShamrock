plugins {
    kotlin("jvm")
    id("com.google.devtools.ksp") version "2.1.21-2.0.1"
    kotlin("plugin.serialization") version "2.1.21"
}

ksp {
    arg("autoserviceKsp.verify", "true")
    arg("autoserviceKsp.verbose", "true")
}

dependencies {
    implementation(project(":annotations"))
    implementation("com.google.auto.service:auto-service-annotations:1.1.1")
    implementation("com.google.devtools.ksp:symbol-processing-api:2.1.21-2.0.1")
    implementation("com.squareup:kotlinpoet:2.2.0")

    implementation(DEPENDENCY_PROTOBUF)
    implementation(kotlinx("serialization-protobuf", "1.6.2"))

    ksp("dev.zacsweers.autoservice:auto-service-ksp:1.1.0")
}