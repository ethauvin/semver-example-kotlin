package com.example

import net.thauvin.erik.semver.Version
import java.text.SimpleDateFormat

@Version(properties = "version.properties", type = "kt")
class Main {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            val sdf = SimpleDateFormat("EEE, d MMM yyyy 'at' HH:mm:ss z")
            println("-----------------------------------------------------")

            println("  ${GeneratedVersion.project} ${GeneratedVersion.version}")

            println("    Built on:       " + sdf.format(GeneratedVersion.buildDate))
            println("    Major:          ${GeneratedVersion.major}")
            println("    Minor:          ${GeneratedVersion.minor}")
            println("    Patch:          ${GeneratedVersion.patch}")
            println("    PreRelease:     ${GeneratedVersion.preReleaseWithPrefix()}")
            println("    BuildMetaData:  ${GeneratedVersion.buildMetaWithPrefix()}")

            println("-----------------------------------------------------")
        }
    }
}