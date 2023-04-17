package meteo;

import java.time.LocalDateTime;

public class Adapter implements MeteoSensor{
    private SensorTemperature sensor;

    public Adapter(SensorTemperature sensor) {
        this.sensor = sensor;
    }

    @Override
    public int getId() {
        return sensor.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)sensor.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime date = LocalDateTime.of(sensor.year(), 1, 1, 0, 0);
        date=date.plusDays(sensor.day()-1);
        date=date.plusSeconds(sensor.second());
        return date;
    }
}
