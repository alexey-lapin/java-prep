plugins {
    java
    `java-test-fixtures`
}

repositories {
    mavenCentral()
}

sourceSets {
    val sample by creating {
        val sourceSetName = name
        java {
            exclude("**")
        }
        resources {
            setSrcDirs(listOf("src/$sourceSetName/java"))
        }
    }
    test {
        compileClasspath += sample.output
        runtimeClasspath += sample.output
    }
}

dependencies {
    testFixturesApi("org.jooq:joor-java-8:0.9.13")
    testFixturesApi("org.assertj:assertj-core:3.18.1")

    testImplementation("org.mockito:mockito-core:3.7.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
        sourceCompatibility = JavaVersion.VERSION_1_8.majorVersion
        targetCompatibility = JavaVersion.VERSION_1_8.majorVersion
    }

    withType<Test> {
        useJUnitPlatform()
        val output = sourceSets.test.get().java.outputDir
        systemProperty("test.home", output)
    }
}
