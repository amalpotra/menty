plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.3.2")
    implementation("io.spring.gradle:dependency-management-plugin:1.1.5")
    implementation("io.freefair.gradle:lombok-plugin:8.6")
}
