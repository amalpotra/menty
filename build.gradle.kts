subprojects {
    group = "com.menty"

    apply {
        plugin("java")
    }

    repositories {
        mavenCentral()
    }

    afterEvaluate {
        dependencies {
            // Add shared dependencies here
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
