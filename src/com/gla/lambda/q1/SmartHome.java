package com.gla.stream_assignment.lambda.q1;

public class SmartHome {

    public static void main(String[] args) {

        // Lambda for motion detection
        Runnable motionLight = () ->
                System.out.println("Lights ON (Motion detected)");

        // Lambda for night mode
        Runnable nightLight = () ->
                System.out.println("Dim lights ON (Night mode)");

        // Lambda for voice command
        Runnable voiceCommand = () ->
                System.out.println("Lights ON (Voice command)");

        // Execute behaviors
        motionLight.run();
        nightLight.run();
        voiceCommand.run();
    }
}