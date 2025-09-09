package Assignments.Assignment4.Problem2;

public class SensorTest {

    public static void main(String[] args) {
        TemperatureSensor o1 = new TemperatureSensor(37, "Garden");
        LightSensor o2 = new LightSensor(145, "Living Room");
        SoundSensor o3 = new SoundSensor(71, "Bedroom");
        SoundSensor o4 = new SoundSensor(37, "Hall");
        LightSensor o5 = new LightSensor(90, "Reading Table");

        Object[] sensors = {o1, o2, o3, null,o4, o5};
        printObjectStatus(sensors);
    }

    public static void printObjectStatus(Object[] sensors) {
        if (sensors == null) {
            return;
        }
        for (Object obj : sensors) {
            if (obj != null) {
                switch (obj) {
                    case SoundSensor s -> {
                        s.getLastUpdated();
                        System.out.println(s);
                    }
                    case TemperatureSensor t -> {
                        t.getLastUpdated();
                        System.out.println(t);
                    }
                    case LightSensor l -> {
                        l.getLastUpdated();
                        System.out.println(l);
                    }
                    default -> {
                    }
                }
            }
        }
    }
}
