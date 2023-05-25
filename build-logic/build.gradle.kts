plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.0.7")
    implementation("io.spring.gradle:dependency-management-plugin:1.1.0")
    implementation("io.freefair.gradle:lombok-plugin:8.0.1")
}
