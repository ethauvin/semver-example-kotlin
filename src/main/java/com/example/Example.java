package com.example;

import java.text.SimpleDateFormat;

public class Example {
    public static void main(final String... args) {
        final SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy 'at' HH:mm:ss z");

        System.out.println("-- From Java ----------------------------------------");

        System.out.println("  " + GeneratedVersion.Companion.getProject() + ' '
                + GeneratedVersion.Companion.getVersion());

        System.out.println("    Built on:       " + sdf.format(GeneratedVersion.Companion.getBuildDate()));
        System.out.println("    Major:          " + GeneratedVersion.Companion.getMajor());
        System.out.println("    Minor:          " + GeneratedVersion.Companion.getMinor());
        System.out.println("    Patch:          " + GeneratedVersion.Companion.getPatch());
        System.out.println("    PreRelease:     " + GeneratedVersion.Companion.getPreRelease());
        System.out.println("    BuildMetaData:  " + GeneratedVersion.Companion.getBuildMeta());

        System.out.println("-----------------------------------------------------");
    }
}