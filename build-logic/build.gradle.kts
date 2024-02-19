plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.2.1")
    implementation("io.spring.gradle:dependency-management-plugin:1.1.4")
    implementation("io.freefair.gradle:lombok-plugin:8.6")
}
