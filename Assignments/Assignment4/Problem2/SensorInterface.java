package Assignments.Assignment4.Problem2;


import java.time.LocalTime;

public interface SensorInterface {
    String sensorType = null;
    String getSensorType();
    double getReading();
    String getLocation();
    String getLastUpdated();
    String performAction();
}
