import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class viewPharmacist implements Interface{
    //Variables
    ControlPharmacist c;
    Scanner in;
    int id;
    int password;

    //Constructor
    public viewPharmacist() {
        c = new ControlPharmacist();
        in = new Scanner(System.in);
    }
//----------------------------------------------------

    //Methods
    public void start() throws FileNotFoundException {
        while (true) {
            System.out.print("1-Add New Pharmacist.\n2-View All Pharmacist.\n3-Search For Pharmacist.\n4-Modify Pharmacist data.\n5-Delete.\n6-Exit.\nChoice:");
//            String choiceAsString = in.nextLine();
//            int choice = Integer.parseInt(choiceAsString);
            int choice = in.nextInt();
            switch (choice) {
                case 1 : add();break;
                case 2 : view();break;
                case 3 : find();break;
                case 4 : update();break;
                case 5 : delete();break;
                case 6 : System.out.println("Good Bye");break;
                default: {
                    System.out.println("Input error!\nPlease try again.");
                    start();
                    System.exit(0);
                }
                break;
            }
        }
    }

    //___________________________________________________________________________
    public void add() throws FileNotFoundException {
        int branchNo = 0;
        double salary;
        String PharmacistName, branchName = null;
        id = id + 1;

        System.out.println("ID:" + id);

        System.out.print("Name:");
        //  لا تعمل! nextLine
        PharmacistName = in.next();

        System.out.print("Salary:");
        in.useLocale(Locale.ENGLISH);
        salary = in.nextDouble();


        System.out.print("Branch Name:");
        branchName = in.next();
        //بناء على اختياره لاسم الفرع سيظهر رقم الفرع**
        System.out.print("Branch Number:");
        branchNo = in.nextInt();
        //تجنب تكرار كلمة السر**
        //توليد كلمة سر من "عدد مليي ثانية من تاريخ 1/1/1970 الى تاريخ الوقت الذي تم به استدعاء هذه الدالة"
        System.out.print("Password: ");
        Date d = new Date();
        password = (int) (d.getTime() % 100000000);
        System.out.println(password);
        //check return 1 في تكرار
        //!(c.checkForDuplicate(new Pharmacist(id, PharmacistName, salary, branchName, branchNo, (int) password)))
        if (salary > 0 && branchNo > 0  ) {
            c.addNewPharmacist(id, PharmacistName, salary, branchName, branchNo, (int) password);
            System.out.println("Added successfully.");
        }
        //**
        if (salary <= 0) {
            System.out.println("Input error!  the Salary must be bigger than 0.");
            inputError();
        }
        if (branchNo <= 0) {
            System.out.println("Input error!  the Branch Number must be bigger than 0.");
            inputError();
        }
        if (salary <= 0 && branchNo <=0) {
            System.out.println("Input error!  the Salary and the the Branch Number must be bigger than 0.");
            inputError();
        }
        if (c.checkForDuplicate(new Pharmacist(id, PharmacistName, salary, branchName, branchNo, (int) password))){
            System.out.println("These pharmacist data already exist.");
            inputError();}
    }
    //______________________________________________________________________________________________________________

    @Override
    public void inputError() throws FileNotFoundException {
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

    public void view() throws FileNotFoundException {
        ArrayList<Pharmacist> all = c.viewAllPharmacist();
        for (Pharmacist pharmacist : all) {
            if (pharmacist != null) {
                c.readFile();
            }
        }
    }
    //______________________________________________________________________________________________________________

    public void find() {
        System.out.println("Enter pharmacist name: ");
        String nameFind = in.next();
        Pharmacist s = c.searchForPharmacist(nameFind);
        if (s != null)
            System.out.println(s.getId() + "\t\t" + s.getPharmacistName()+ "\t\t" + s.getSalary()+ "\t\t" + s.getBranchName() + "\t\t" + s.getBranchNo());
        else
            System.out.println("No pharmacist with this name.");
    }


//______________________________________________________________________________________________________________

    public void update() {
        System.out.println("Enter pharmacist name: ");
        String nameFind = in.next();
        Pharmacist s = c.searchForPharmacist(nameFind);
        if (s != null)
        {
            System.out.println("Enter the thing you want to modify:\n1-pharmacist Name\n2-Salary \n3-Branch Name \n4-Branch Number");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the new Pharmacist Name: ");
                    s.setPharmacistName(in.next());
                    break;
                case 2:
                    System.out.println("Enter the new Salary: ");
                    s.setSalary(in.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter the new Branch Name: ");
                    s.setBranchName(in.next());
                    break;
                case 4:
                    System.out.println("Enter the new Branch Number: ");
                    s.setBranchNo(in.nextInt());

                default:
                    System.out.println("Input error! Please try again.");
            }
            System.out.println("Modified Successfully.");
        }
        else
            System.out.println("No medicine with this name.");

    }
    //______________________________________________________________________________________________________________
    public void delete(){
        System.out.println("Enter Pharmacist name: ");
        String nameDelete = in.next();
        boolean s = c.deletePharmacist(nameDelete);
        if (s)
            System.out.println("deleted Successfully.");
        else
            System.out.println("No Pharmacist with this name.");
    }
}
