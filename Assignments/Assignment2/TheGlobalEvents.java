package Assignments.Assignment2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TheGlobalEvents {

    private static final String[] VALID_ZONES = {
            "America/Panama",
            "America/Chicago",
            "America/Indiana/Indianapolis",
            "America/Santiago",
            "America/Phoenix"
    };

    public static void eventsFormatting(String eventName, ZonedDateTime eventDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm '['VV']'");
        System.out.println("\n--- Event Details ---");
        System.out.println("Event: " + eventName);
        System.out.println("Date & Time: " + eventDateTime.format(formatter));
    }

    public static void timeZoneConverter(ZonedDateTime eventDateTime, String targetZone) {
        ZoneId targetZoneId = ZoneId.of(targetZone);
        ZonedDateTime converted = eventDateTime.withZoneSameInstant(targetZoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm '['VV']'");
        System.out.println("Converted Time: " + converted.format(formatter));
    }

    public static LocalDate dateValidation(String dateStr) {
        if (!dateStr.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return null;
        }
        String[] parts = dateStr.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        if (month < 1 || month > 12) return null;
        if (day < 1 || day > 31) return null;
        return LocalDate.of(year, month, day);

    }

    public static LocalTime validateTime(String timeStr) {
        if (!timeStr.matches("\\d{2}:\\d{2}")) {
            return null;
        }
        String[] parts = timeStr.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        if (hour < 0 || hour > 23) return null;
        if (minute < 0 || minute > 59) return null;

        return LocalTime.of(hour, minute);
    }

    public static boolean ValidatingZones(String zone) {
        for (String z : VALID_ZONES) {
            if (z.equals(zone)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String eventName;
        do {
            System.out.print("Enter Event Name: ");
            eventName = scanner.nextLine().trim();
            if (eventName.isEmpty()) {
                System.out.println("Event name cannot be empty.");
            }
        } while (eventName.isEmpty());


        LocalDate eventDate = null;
        while (eventDate == null) {
            System.out.print("Enter Event Date (yyyy-MM-dd): ");
            String dateInput = scanner.nextLine().trim();
            eventDate = dateValidation(dateInput);
            if (eventDate == null) {
                System.out.println("Invalid date. Example: 2025-09-20");
            }
        }

        LocalTime eventTime = null;
        while (eventTime == null) {
            System.out.print("Enter Event Time (HH:mm in 24hr format): ");
            String timeInput = scanner.nextLine().trim();
            eventTime = validateTime(timeInput);
            if (eventTime == null) {
                System.out.println("Invalid time. Example: 14:30");
            }
        }

        LocalDateTime localDateTime = LocalDateTime.of(eventDate, eventTime);

        ZoneId systemZone = ZoneId.systemDefault();
        ZonedDateTime eventDateTime = ZonedDateTime.of(localDateTime, systemZone);


        System.out.println("\nDay of Event: " + eventDate.getDayOfWeek());
        System.out.println("Leap Year : " + (eventDate.isLeapYear() ? "Yes" : "No"));


        long daysBetween = ChronoUnit.DAYS.between(LocalDate.now(), eventDate);
        if (daysBetween >= 0) {
            System.out.println("Days until event: " + daysBetween);
        } else {
            System.out.println("This event date is in the past");
        }

        eventsFormatting(eventName, eventDateTime);

        String targetZone;
        do {
            System.out.println("\nAvailable Time Zones:");
            for (String z : VALID_ZONES) {
                System.out.println(" - " + z);
            }
            System.out.print("Enter target time zone: ");
            targetZone = scanner.nextLine().trim();
            if (!ValidatingZones(targetZone)) {
                System.out.println("Invalid timezone. Please choose from the list above.");
            }
        } while (!ValidatingZones(targetZone));

        timeZoneConverter(eventDateTime, targetZone);

        scanner.close();
    }
}
/*
Sample Output:

Enter Event Name: Skydiving
Enter Event Date (yyyy-MM-dd): 2025-11-23
Enter Event Time (HH:mm in 24hr format): 14:26

Day of Event: SUNDAY
Leap Year : No
Days until event: 79

--- Event Details ---
Event: Sky Diving
Date & Time: Sunday, November 23, 2025 @ 14:26 [America/Chicago]

Available Time Zones:
 - America/Panama
 - America/Chicago
 - America/Indiana/Indianapolis
 - America/Santiago
 - America/Phoenix
Enter target time zone: America/Santiago
Converted Time: Sunday, November 23, 2025 @ 17:26 [America/Santiago]

*/


