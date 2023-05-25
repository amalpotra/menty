plugins {
    id("menty.java-application-conventions")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web") {
        exclude(group = "org.springframework.boot", module = "spring-boot-starter-tomcat")
    }
    implementation("org.springframework.cloud:spring-cloud-config-server")
    implementation("org.springframework.boot:spring-boot-starter-undertow")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
