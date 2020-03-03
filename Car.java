package gencho;

public class Car {
    public String registrationPlates;
    private String colors;
    private int buildYears;
    public double invoices;

    public Car(String registrationPlates, String colors, int buildYears, double invoices) {
        this.registrationPlates = registrationPlates;
        this.colors = colors;
        this.buildYears = buildYears;
        this.invoices = invoices;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registrationPlates='" + registrationPlates + '\'' +
                ", colors='" + colors + '\'' +
                ", buildYears=" + buildYears +
                '}';
    }


}
