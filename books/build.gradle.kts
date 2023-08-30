plugins {
    id("java")
    id("application")
}

group = "com.distribuida"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

var helidonVersion = "3.2.2"

dependencies {
    implementation(enforcedPlatform("io.helidon:helidon-dependencies:${helidonVersion}"))

//    implementation("io.quarkus:quarkus-arc")
//    implementation("io.quarkus:quarkus-resteasy-reactive")
//    implementation("io.quarkus:quarkus-resteasy-reactive-jackson")
//    implementation("io.quarkus:quarkus-smallrye-health")
//
//    implementation("io.quarkus:quarkus-jdbc-postgresql")
//    implementation("io.quarkus:quarkus-hibernate-orm-panache")

    testImplementation("io.helidon.microprofile.cdi:helidon-microprofile-cdi:3.2.2")
    implementation("jakarta.ws.rs:jakarta.ws.rs-api:3.1.0")
    // https://mvnrepository.com/artifact/io.helidon.microprofile.config/helidon-microprofile-config
    implementation("io.helidon.microprofile.config:helidon-microprofile-config:3.2.2")

    implementation("jakarta.transaction:jakarta.transaction-api:2.0.1")
    implementation("org.postgresql:postgresql:42.6.0")
    // https://mvnrepository.com/artifact/jakarta.persistence/jakarta.persistence-api
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
    // https://mvnrepository.com/artifact/jakarta.enterprise/jakarta.enterprise.cdi-api
    compileOnly("jakarta.enterprise:jakarta.enterprise.cdi-api:4.0.1")
    // https://mvnrepository.com/artifact/io.helidon.fault-tolerance/helidon-fault-tolerance
    implementation("io.helidon.fault-tolerance:helidon-fault-tolerance:3.2.2")
    // https://mvnrepository.com/artifact/org.eclipse.microprofile.rest.client/microprofile-rest-client-api
    implementation("org.eclipse.microprofile.rest.client:microprofile-rest-client-api:3.0.1")
// https://mvnrepository.com/artifact/org.eclipse.microprofile.fault-tolerance/microprofile-fault-tolerance-api
    implementation("org.eclipse.microprofile.fault-tolerance:microprofile-fault-tolerance-api:4.0.2")
    //helidon microprofile open api dependency
    implementation("io.helidon.microprofile.openapi:helidon-microprofile-openapi:3.2.2")
    //helidon microprofile health dependency
    implementation("io.helidon.microprofile.health:helidon-microprofile-health:3.2.2")


    testImplementation("io.helidon.microprofile.cdi:helidon-microprofile-cdi:3.2.2")

}
