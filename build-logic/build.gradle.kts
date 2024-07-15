plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.2.4")
    implementation("io.spring.gradle:dependency-management-plugin:1.1.6")
    implementation("io.freefair.gradle:lombok-plugin:8.6")
}
