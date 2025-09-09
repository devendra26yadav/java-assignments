package Assignments.Assignment4.Problem2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor  implements SensorInterface{
    private final int soundLevel;
    private final String location;
    private  String lastUpdated;
    private final String sensorType="Sound";
    public SoundSensor(int soundLevel,String location){
        this.soundLevel=soundLevel;
        this.location=location;
    }

    @Override
    public String getSensorType() {
        return sensorType;
    }

    @Override
    public double getReading() {
        return soundLevel;
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
        if(soundLevel>70){
            return "Turn on noise cancellation";
        }
        return "Sound level is within normal range";
    }
    @Override
    public String toString(){
        return "\nSensor Type : "+sensorType+
                "\nReading : "+this.soundLevel+
                "\nLocation : "+this.location+
                "\nLast Updated : "+this.lastUpdated+
                "\nAction : "+ this.performAction();
    }
}
