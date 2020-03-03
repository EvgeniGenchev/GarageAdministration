package gencho;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Garage Invoice system.");
        var scanner = new Scanner(System.in);
        System.out.println("What's the capacity of the garage?");
        var capacity = scanner.nextInt();

        var garage = new GarageData(capacity);
        var menu = new Menu();

        while(true){
            menu.printMenu();
            var option = scanner.nextInt();

            switch (option){
                case 1: {
                    AddANewCar(scanner, garage);
                }
                break;
                case 2: {
                    SetInvoice(scanner, garage);
                }
                break;
                case 3: {
                    GetInvoice(scanner , garage);
                }
                break;
                case 4: {
                    PrintCar(scanner, garage);
                }
                break;
                case 5: {
                   PrintInvoices(garage);
                }
                break;
                default:
                    break;
            }

            if (option == 0){
                break;
            }
        }

    }

    public static void AddANewCar(Scanner scanner, GarageData garage){
        System.out.println("Enter the registration of the car");
        var reg = scanner.next();
        System.out.println("Enter the color of the car");
        var color = scanner.next();
        System.out.println("Enter the build year of the car");
        var buildYear = scanner.nextInt();
        garage.addCar(reg, color, buildYear);
    }

    public static void SetInvoice(Scanner scanner ,GarageData garage){
        System.out.println("Enter the registration of the car");
        var reg = scanner.next();
        System.out.println("Enter the invoice amount of the car");
        var amount = scanner.nextDouble();
        garage.setInvoiceFor(reg, amount);
    }

    public static void GetInvoice(Scanner scanner ,GarageData garage){
        System.out.println("Enter the registration of the car");
        var reg = scanner.next();
        System.out.println("The invoice is: " + garage.getInvoiceFor(reg));
    }

    public static void PrintCar(Scanner scanner, GarageData garage){
        System.out.println("There are " + garage.count + " cars.");
        System.out.println("For which car should I print the info?");
        var index = scanner.nextInt();
        garage.printCarInfo(index - 1);
    }

    public static void PrintInvoices(GarageData garage){
        System.out.println("The sum of invoices is: " + garage.calculateTotalInvoices());
    }

}







