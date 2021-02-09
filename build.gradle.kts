plugins {
    java
    `java-test-fixtures`
    id("com.github.ben-manes.versions")
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
    testFixturesApi("org.assertj:assertj-core:3.19.0")

    testImplementation("org.mockito:mockito-core:3.7.7")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.1")
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

    dependencyUpdates {
        checkConstraints = true
        resolutionStrategy {
            componentSelection {
                all {
                    val rejected = listOf("alpha", "beta", "rc", "cr", "m", "preview", "b", "ea")
                        .map { qualifier -> Regex("(?i).*[.-]$qualifier[.\\d-+]*") }
                        .any { it.matches(candidate.version) }
                    if (rejected) {
                        reject("Release candidate")
                    }
                }
            }
        }
    }
}
