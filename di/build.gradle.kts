plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(project(":data"))
    implementation(project(":domain"))
}