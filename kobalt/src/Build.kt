
import com.beust.kobalt.buildScript
import com.beust.kobalt.localMaven
import com.beust.kobalt.plugin.application.application
import com.beust.kobalt.plugin.apt.apt
import com.beust.kobalt.plugin.apt.kapt
import com.beust.kobalt.plugin.java.javaCompiler
import com.beust.kobalt.plugin.packaging.assemble
import com.beust.kobalt.project

// ./kobaltw run runJava

val bs = buildScript {
    repos(localMaven())
}

val kotlin_version = "1.1.51"
val processorJar = "net.thauvin.erik:semver:1.0.1"

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
        compileOnly("org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version")
    }

    dependenciesTest {
        // compile("org.testng:testng:6.11")
    }

    javaCompiler {
        args("-source", "1.8", "-target", "1.8")
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