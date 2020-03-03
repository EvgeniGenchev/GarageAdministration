package gencho;

public class GarageData {

    private int capacity;
    public int count;
    private Car[] car;


    public GarageData(int capacity) {
        this.capacity = capacity;
        count = 0;
        car = new Car[capacity];
    }

    public void addCar(String registration, String color, int buildYear) {
        this.car[count] = new Car(registration, color ,buildYear, 0.0);
        count++;
    }

    public void setInvoiceFor(String registration, double amount) {
        for (var i = 0; i < count; i++) {
            if (this.car[i].registrationPlates.equals(registration)) {
                this.car[i].invoices = amount;
                break;
            }
        }
    }

    public double getInvoiceFor(String registration) {

        for (var i = 0; i < count; i++) {
            if (this.car[i].registrationPlates.equals(registration)) {
                return this.car[i].invoices;
            }
        }
        return 0.0;
    }

    public double calculateTotalInvoices(){

        var sum = 0.0;
        for (var i=0; i < count; i++){
            sum += this.car[i].invoices;
        }
        return sum;
    }

    void printCarInfo(int index){
        System.out.println( this.car[index].toString());

    }
}
