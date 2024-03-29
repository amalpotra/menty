plugins {
    id("menty.java-common-conventions")
    id("org.springframework.boot")

    application
}

tasks {
    jar {
        enabled = false
    }
    bootJar {
        archiveFileName.set("${project.name}.jar")
    }
}
