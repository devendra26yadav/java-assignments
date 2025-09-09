package Assignments.Assignment4.Problem2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor  implements  SensorInterface{
    private final String sensorType;
    private final double temperature;
    private final String location;
    private String lastUpdated;
    public TemperatureSensor(double temperature,String location){
        this.sensorType="Temperature";
        this.temperature=temperature;
        this.location=location;
    }

    @Override
    public String getSensorType() {
        return sensorType;
    }

    @Override
    public double getReading() {
        return temperature;
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
        if(temperature<18){
            return "Turn on the Heater";
        }
        else if(temperature >30){
            return "Turn on the AC";
        }
        return "Temperature is within the normal range";
    }
    @Override
    public String toString(){
        return "\nSensor Type : "+sensorType+
                "\nReading : "+this.temperature+
                "\nLocation : "+this.location+
                "\nLast Updated : "+this.lastUpdated+
                "\nAction : "+ this.performAction();
    }
}
