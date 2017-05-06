import com.beust.kobalt.*
import com.beust.kobalt.plugin.apt.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*

// ./kobaltw run runJava

val bs = buildScript {
    repos(localMaven())
}

val kotlin_version = "1.1.2"
val processorJar = "net.thauvin.erik:semver:1.0.0"

// ./kobalt run runJava

val p = project {

    name = "example"
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

    application {
        taskName = "runJava"
        mainClass = "com.example.Example"
    }
}