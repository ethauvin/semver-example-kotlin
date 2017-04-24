import com.beust.kobalt.*
import com.beust.kobalt.plugin.apt.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*

// ./kobaltw run
// ./kobaltw java:run

val bs = buildScript {
    repos(file("K:/maven/repository"))
}

val kotlin_version = "1.1.1"
val processorJar = "net.thauvin.erik:semver:0.9.7"

val p = project {

    name = "semver-example-kotlin"
    group = "com.example"
    artifactId = name
    version = "0.1"

    kapt {
        // needed
    }

    dependencies {
        apt(processorJar)
        compileOnly(processorJar)
        compileOnly("org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version",
                "org.jetbrains.kotlin:kotlin-stdlib-js:$kotlin_version")
    }

    dependenciesTest {
        // compile("org.testng:testng:6.11")
    }

    assemble {
        jar {
        }
    }

    application {
        mainClass = "com.example.Main"
    }
}

val java = project(p) {
    name = "java"

    kapt {
        // needed
    }

    application {
        mainClass = "com.example.Example"
    }
}