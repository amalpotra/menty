plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.1.3")
    implementation("io.spring.gradle:dependency-management-plugin:1.1.3")
    implementation("io.freefair.gradle:lombok-plugin:8.4")
}
