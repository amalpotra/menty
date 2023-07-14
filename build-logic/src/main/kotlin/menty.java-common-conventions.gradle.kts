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
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:2022.0.3")
        }
        constraints {
        }
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
