/*
يحتوي كلاس ControlMedicine على عدة دوال ومنها داله لا اضافه دواء جديد وداله لحذف دواء وداله للبحث عن دواء معين
وداله لعرض جميع الادويه الموجوده في الصيدلي

 */
/*
 class ControlMedicine It contains several functions,
 including a function not to add a new drug,
 a function to delete a drug,
 and a function to search for a specific drug
And a function to display all the medicines in the pharmacist
 */





import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;




public class ControlMedicine {
    //Variables
    protected final ArrayList<Medicines> allMedicines = new ArrayList<>();

    //Constructor
    public ControlMedicine() {
    }

    //----------------------------------------------------
    //Methods

    //اضافة دواء جديد
    public void addNewMedicine(int id, String medicinesName, double price, int[] expiryDate, int[] productionDate, String company, int qty) {
        Medicines s = new Medicines(expiryDate, productionDate);
        allMedicines.add(s);
    }

    //----------------------------------------------------
    //عرض كافة الادوية
    public ArrayList<Medicines> viewAllMedicines() {
        return allMedicines;
    }

    //----------------------------------------------------
    //البحث عن دواء معين
    public Medicines searchForMedicine(String MedicinesName) {
        boolean found = false;
        int i = 0;
        while (!found && i < allMedicines.size()) {
            if (allMedicines.get(i) != null) {
                if (allMedicines.get(i).getMedicinesName().equals(MedicinesName))
                    found = true;
                else
                    i++;
            } else
                i++;
        }
        if (i < allMedicines.size())
            return allMedicines.get(i);
        else
            return null;
    }

    //--------
    private int searchForMedicineIndex(String MedicinesName) {
        boolean found = false;
        int i = 0;
        while (!found && i < allMedicines.size()) {
            if (allMedicines.get(i) != null) {
                if (allMedicines.get(i).getMedicinesName().equals(MedicinesName))
                    found = true;
                else
                    i++;
            } else
                i++;
        }
        if (i < allMedicines.size())
            return i;
        else
            return -1;
    }

    //----------------------------------------------------
    //حذف دواء
    public boolean deleteMedicine(String deleteName) {
        int index = searchForMedicineIndex(deleteName);
        if (index != -1) {
            allMedicines.remove(index);
            return true;
        } else return false;

    }

    //----------------------------------------------------
    //الكتابة في ملف
    public void writeFile()  {
//
//        PrintWriter w = new PrintWriter(file);
//        for (int i = 0; i < allMedicines.size(); i++) {
//            w.write(allMedicines.get(i).print());
//        }
//        w.close();
        //تعريف الملف

        try {
          File file = new File("Medicine.txt");
            // انشاء ملف جديد اذا لم يكن موجود و الاضافة فيه
            if (file.createNewFile()) {
//                تم انشاء الملف سيقوم الان بالكتابة عليه
                try {
//                    PrintWriter writer = new PrintWriter("Medicine.txt");
                    FileWriter writer = new FileWriter("Medicine.txt");
                    for (int i = 0; i < allMedicines.size(); i++) {
                        writer.write(allMedicines.get(i).print());
                    }
                    writer.close();
                } catch (Exception e) {
                    System.out.println("Error: " + Arrays.toString(e.getStackTrace()));
                }
            }

//             الاضافة الى ملف موجود مسبقا
            else {
                try {
//                    PrintWriter writer = new PrintWriter("Medicine.txt");
                    FileWriter writer = new FileWriter("Medicine.txt", true);                    for (int i = 0; i < allMedicines.size(); i++) {
                        writer.write( allMedicines.get(i).print());
//                        تم كتابة البيانات في الملف
                    }

                    writer.close();
                } catch (Exception e) {
                    System.out.println("Error: "+Arrays.toString(e.getStackTrace()));
                }
            }
        } catch (Exception e) {
            System.out.println("Error: "+Arrays.toString(e.getStackTrace()));
        }

    }

    //----------------------------------------------------
    //القراءة من الملف
    public void readFile() throws FileNotFoundException {
//        Scanner in = new Scanner(file);
//
//        while (in.hasNextInt()) {
//            int id = in.nextInt();
//
//            String medicinesName = in.next();
//
//            int[] expiryDate = new int[2], productionDate = new int[2];
//            productionDate[0] = in.nextInt();
//            productionDate[1] = in.nextInt();
//
//            expiryDate[0] = in.nextInt();
//            expiryDate[1] = in.nextInt();
//
//            double price = in.nextDouble();
//
//            String company = in.next();
//
//            int qty = in.nextInt();
//
//            addNewMedicine(id, medicinesName, price, expiryDate, productionDate, company, qty);
//        }
//        in.close();
        try {
            File file = new File("Medicine.txt");
            if (file.exists()) {
                // يبدأ بقراءة البيانات من الملف
                for (int i = 0; i <allMedicines.size() ; i++) {
                    System.out.println(allMedicines.get(i).print());
                }
                }
        }
    catch(Exception e){
            System.out.println("Error: "+ Arrays.toString(e.getStackTrace()));
                    }


    }
}

