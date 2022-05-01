import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.boot)
    alias(libs.plugins.dependencyManagement)
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.kotlinPluginSpring)
}

group = "samples"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.jacksonKotlin)
    implementation(libs.kotlinReflect)
    implementation(libs.kotlinJdk)
    testImplementation(libs.bootTest)
    implementation(libs.guava)
    implementation(libs.bootWeb)

    // Implementation own api
    implementation(project(":api-service"))
    /*
    * Implementation other api service
    * Hardcode to file as local example, need link to published artifact
    */
    implementation(files("../../gradle-toml/api-service/build/libs/api-service-0.0.1-SNAPSHOT-plain.jar"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
