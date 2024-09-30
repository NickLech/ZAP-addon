plugins {
    id("java")
}

version = "0.0.1"
description = "A new description."

zapAddOn {
    addOnName.set("migt")
    zapVersion.set("2.15.0")

    manifest {
        author.set("FBK")
        extensions {
            register("org.example.ExtensionZAP")

        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.json:json:20240303") // Versione aggiornata di org.json
    implementation("com.nimbusds:nimbus-jose-jwt:9.31") // Versione aggiornata di nimbus-jose-jwt
    implementation("org.bouncycastle:bcpkix-jdk15on:1.70") // Versione aggiornata di bcpkix-jdk15on
    implementation("com.google.code.gson:gson:2.10.1") // Versione aggiornata di Gson
    implementation("org.seleniumhq.selenium:selenium-java:4.13.0") // Versione aggiornata di selenium-java
    implementation("org.apache.santuario:xmlsec:3.0.0") // Versione aggiornata di xmlsec
    implementation("com.sun.xml.security:xml-security-impl:1.0") // Versione aggiornata di xml-security-impl
    implementation("com.jayway.jsonpath:json-path:2.9.0") // Versione aggiornata di json-path
    implementation("net.minidev:json-smart:2.4.10") // Versione aggiornata di json-smart
    implementation("org.apache.httpcomponents:httpclient:4.5.14") // Versione aggiornata di httpclient
    implementation("org.apache.httpcomponents:httpcore:4.4.16") // Versione aggiornata di httpcore
    implementation("com.networknt:json-schema-validator:1.0.78") // Versione aggiornata di json-schema-validator
    implementation("org.apache.commons:commons-text:1.10.0") // Versione aggiornata di commons-text
    implementation("commons-codec:commons-codec:1.16.0")
    implementation("org.zaproxy:zap:2.15.0")
    implementation("org.zaproxy:zap-clientapi:1.14.0")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

crowdin {
    configuration {
        val resourcesPath = "org/zaproxy/addon/${zapAddOn.addOnId.get()}/resources/"
        tokens.put("%messagesPath%", resourcesPath)
        tokens.put("%helpPath%", resourcesPath)
    }
}

//tasks.register<Wrapper>("wrapper") {
//    gradleVersion = "5.6.4"
//}

tasks.register("prepareKotlinBuildScriptModel") {}
