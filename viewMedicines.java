import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class viewMedicines implements Interface {
    //Variables
    ControlMedicine c;
    Scanner in;
    int id;

    //Constructor
    public viewMedicines() {
        c = new ControlMedicine();
        in = new Scanner(System.in);
    }

    //Methods
    public void start() throws IOException {
        while (true) {
            System.out.print("1-Add New medicine.\n2-View All medicines.\n3-Search For medicine.\n5-Modify medication data.\n5-Delete medicine.\n6-Exit.\nChoice:");
            //a
//            String choiceAsString = in.nextLine();
//            int choice = Integer.parseInt(choiceAsString);

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    find();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    delete();
                    break;
                case 6: {
                    System.out.println("Good Bye");
                    System.exit(0);
                }

                default: {
                    System.out.println("Input error!\nPlease try again.");
                    //a
                    System.exit(0);
                }
                break;
            }
        }

    }
    //___________________________________________________________________________

    public void add() throws IOException {
        int[] expiryDate = new int[2], productionDate = new int[2];
        double price;
        String medicinesName, company;
        int qty;
        id = id + 1;

        System.out.println("ID:" + id);

        System.out.print("Name:");
        medicinesName = in.next();

        System.out.print("Production Date:\nMonth:");
        productionDate[0] = in.nextInt();
        System.out.print("Year:");
        productionDate[1] = in.nextInt();

        System.out.print("Expiry Date:\nMonth:");
        expiryDate[0] = in.nextInt();
        System.out.print("Year:");
        expiryDate[1] = in.nextInt();

        System.out.print("Price:");
        in.useLocale(Locale.ENGLISH);
        price = in.nextDouble();

        System.out.print("Company:");
        company = in.next();

        System.out.print("Qty: ");
        qty = in.nextInt();

        if (expiryDate[0] > 0 && productionDate[0] > 0 && expiryDate[1] > 0 && productionDate[1] > 0 && price > 0 && qty > 0) {
            {
                c.addNewMedicine(id, medicinesName, price, expiryDate, productionDate, company, qty);
                c.writeFile();
                System.out.println("Added successfully.");
            }
            if (expiryDate[0] <= 0 || expiryDate[1] <= 0) {
                System.out.println("Input error!  the Expiry Date must be bigger than 0.");
                inputError();
            }
            if (productionDate[0] <= 0 || productionDate[1] <= 0) {
                System.out.println("Input error!  the Production Date must be bigger than 0.");
                inputError();
            }
            if (price <= 0) {
                System.out.println("Input error!  the Price must be bigger than 0.");
                inputError();
            }
            if (qty <= 0) {
                System.out.println("Input error!  the qty must be bigger than 0.");
                inputError();
            }

        }
    }
    //______________________________________________________________________________________________________________

    public void view() throws FileNotFoundException {
        ArrayList<Medicines> all = c.viewAllMedicines();
        for (Medicines medicines : all) {
            if (medicines != null) {
                c.readFile();
                }
        }
    }
    //______________________________________________________________________________________________________________

    public void find() {
        System.out.println("Enter medicine name: ");
        String nameFind = in.next();
        Medicines s = c.searchForMedicine(nameFind);
        if (s != null)
            System.out.println(s.getId() + "\t\t" + s.getMedicinesName() + "\t\t" + s.getPrice() + "\t\t" + s.getProductionDate() + "\t\t" + s.getExpiryDate() + "\t\t" + s.getNameSupplier() + "\t\t" + s.getQty());
        else
            System.out.println("No medicine with this name.");
    }


//______________________________________________________________________________________________________________

    public void update() {
        System.out.println("Enter medicine name: ");
        String nameFind = in.next();
        Medicines s = c.searchForMedicine(nameFind);
        if (s != null) {
            System.out.println("Enter the thing you want to modify:\n1-Medicines Name\n2-Price \n3-Expiry Date \n4-Production Date\n5-Company\n6-Qty");
            //a
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the new Medicines Name: ");
                    s.setMedicinesName(in.next());
                    break;
                case 2:
                    System.out.println("Enter the new Price: ");
                    s.setPrice(in.nextInt());
                    break;
                case 3:
                    System.out.println("Enter the new Expiry Date: ");
                    int[] arr = new int[2];
                    for (int i = 0; i < 2; i++) {
                        arr[i] = in.nextInt();
                    }
                    s.setExpiryDate(arr);
                    break;
                case 4:
                    System.out.println("Enter the new Production Date: ");
                    int[] arr2 = new int[2];
                    for (int i = 0; i < 2; i++) {
                        arr2[i] = in.nextInt();
                    }
                    s.setProductionDate(arr2);
                case 5:
                    System.out.println("Enter the new NameSupplier: ");
                    s.setNameSupplier(in.next());
                    break;
                case 6:
                    System.out.println("Enter the new Qty: ");
                    s.setQty(in.nextInt());
                    break;
                default:
                    System.out.println("Input error! Please try again.");
                    //a
            }
            System.out.println("Modified Successfully.");
        } else
            System.out.println("No medicine with this name.");

    }

    //______________________________________________________________________________________________________________
    public void delete() {
        System.out.println("Enter medicine name: ");
        String nameDelete = in.next();
        boolean s = c.deleteMedicine(nameDelete);
        if (s)
            System.out.println("deleted Successfully.");
        else
            System.out.println("No medicine with this name.");


    }
//______________________________________________________________________________________________________________

    @Override
    public void inputError() throws IOException {
        System.out.print("Enter 1 to again or 2 to go back to menu or 0 to exit: ");
        int choice = in.nextInt();
        switch (choice) {
            case 0:
                id = id - 1;
                System.out.println("Bye.");
                System.exit(0);
                break;
            case 1:
                id = id - 1;
                add();
                break;
            case 2:
                id = id - 1;
                start();
                break;
        }
    }
//______________________________________________________________________________________________________________

}
