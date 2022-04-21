plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

defaultTasks("Clean","Run")
tasks.register("Clean") {
    doLast {
        println("Build Script Craig")
    }

    tasks.register("Run") {
        doLast {
            println("Build Script Craig")
        }
    }
    repositories {
        mavenCentral()
    }

    dependencies {
        // testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
        // https://mvnrepository.com/artifact/org.testng/testng
        testImplementation("org.testng:testng:7.4.0")


        // testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    //testImplementation("org.testing:testng:7.5")

        implementation("com.google.guava:guava:30.0-jre")
    }

    tasks.getByName<Test>("testing") {
        //useJUnitPlatform()
        useTestNG()
    }
}