package com.gla.stream_assignment.lambda.q3;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {

    public static void main(String[] args) {

        List<String> alerts = Arrays.asList(
                "Emergency: Heart Rate High",
                "Reminder: Take Medicine",
                "Emergency: Blood Pressure Low",
                "Info: Daily Checkup"
        );

        // 🔹 Predicate for filtering emergency alerts
        Predicate<String> isEmergency = alert -> alert.startsWith("Emergency");

        System.out.println("Filtered Alerts:");
        alerts.stream()
                .filter(isEmergency)
                .forEach(System.out::println);
    }
}