import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.10"
    id("org.jetbrains.dokka") version "1.9.0"
    application
}

buildscript {
    dependencies {
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.9.0")
    }
}

group = "org.antop"
version = "1.0.0"


repositories {
    mavenCentral()
    flatDir {
        dir("libs")
    }
}

dependencies {
    implementation(fileTree("libs"))
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("org.springframework:spring-core:6.0.4")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("javax.persistence:javax.persistence-api:2.2")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.9.10")
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.9.1")
    implementation("org.kodein.di:kodein-di:7.19.0")
    implementation("com.github.salomonbrys.kotson:kotson:2.5.0")
    implementation("com.beust:klaxon:5.6")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-runner-junit5:5.7.2")
    testImplementation("io.kotest:kotest-assertions-core:5.7.2")
    testImplementation("io.kotest:kotest-property:5.7.2")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
