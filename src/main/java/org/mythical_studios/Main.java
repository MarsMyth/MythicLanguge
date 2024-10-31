package org.mythical_studios;

import org.mythical_studios.init.Init;
import org.mythical_studios.systems.MythicSystem;

// This is what you need to create a Window with icons

import org.mythical_studios.windows.*;
import java.awt.*;

// Int & String maker

import static org.mythical_studios.strings.NewInts.newInt;
import static org.mythical_studios.strings.NewStrings.newString;

public class Main {

    public static void onRun(Init init) {

        // Application logic here

        var name = newString("Mythic+");
        var version = newInt(1.0);

        MythicSystem.print("Welcome to " + name + " and my current version is " + version);
    }
}