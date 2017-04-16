package com.example;

import java.text.SimpleDateFormat;

public class Example {
    public static void main(final String... args) {
        final SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy 'at' HH:mm:ss z");

        System.out.println("-- From Java ----------------------------------------");

        System.out.println("  " + GeneratedVersion.project + ' ' + GeneratedVersion.version);

        System.out.println("    Built on:       " + sdf.format(GeneratedVersion.buildDate));
        System.out.println("    Major:          " + GeneratedVersion.major);
        System.out.println("    Minor:          " + GeneratedVersion.minor);
        System.out.println("    Patch:          " + GeneratedVersion.patch);
        System.out.println("    PreRelease:     " + GeneratedVersion.preRelease);
        System.out.println("    BuildMetaData:  " + GeneratedVersion.buildMeta);

        System.out.println("-----------------------------------------------------");
    }
}