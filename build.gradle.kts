plugins {
    java
    id("org.springframework.boot") version "2.3.5.RELEASE"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

group = "org.example.bug"
description = "springfox nondeterministic generation"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {

    val lombokVersion = "1.18.16"

    annotationProcessor("javax.annotation:javax.annotation-api:1.3.2")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    // Lombok
    compileOnly("org.projectlombok:lombok:${lombokVersion}")
    testImplementation("org.projectlombok:lombok:${lombokVersion}")
    annotationProcessor("org.projectlombok:lombok:${lombokVersion}")
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:0.2.0")
    testAnnotationProcessor("org.projectlombok:lombok:${lombokVersion}")
    testAnnotationProcessor("org.projectlombok:lombok-mapstruct-binding:0.2.0")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("io.springfox:springfox-boot-starter:3.0.0")
    implementation("io.springfox:springfox-swagger2:3.0.0")
    implementation("io.springfox:springfox-swagger-ui:3.0.0")

    implementation("org.webjars.bower:swagger-ui:2.1.8-M1")
    compileOnly("org.jetbrains:annotations:20.1.0")
}
