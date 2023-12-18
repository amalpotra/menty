plugins {
    id("io.freefair.lombok")
    id("io.spring.dependency-management")

    java
}

repositories {
    mavenCentral()
}

dependencies {
    dependencyManagement {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:2023.0.0")
        }
        constraints {
        }
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
