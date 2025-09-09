package Assignments.Assignment4.Problem2;


public interface SensorInterface {
    String sensorType = null;
    String getSensorType();
    double getReading();
    String getLocation();
    void getLastUpdated();
    String performAction();
}
