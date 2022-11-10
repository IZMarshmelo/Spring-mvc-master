package web.model;

public class Car {
    private int series;
    private String model;
    private double enginePower;

    public Car(int series, String model, double enginePower) {
        this.series = series;
        this.model = model;
        this.enginePower = enginePower;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }
}
