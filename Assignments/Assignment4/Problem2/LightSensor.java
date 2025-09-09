package Assignments.Assignment4.Problem2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements  SensorInterface {
    private final String sensorType="Light";
    private final double lightLevel;
    private final String location;
    private String lastUpdated;

    public LightSensor(double lightLevel,String location){
        this.lightLevel=lightLevel;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return sensorType;
    }

    @Override
    public double getReading() {
        return lightLevel;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void getLastUpdated() {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        this.lastUpdated= currentTime.format(formatter).toUpperCase();
    }

    @Override
    public String performAction() {
        if(lightLevel < 100)
        {
            return "Turn on the Light";
        }
        return "Light is Sufficient";
    }
    @Override
    public String toString(){
        return "\nSensor Type : "+sensorType+
                "\nReading : "+this.lightLevel+
                "\nLocation : "+this.location+
                "\nLast Updated : "+this.lastUpdated+
                "\nAction : "+ this.performAction();
    }
}
