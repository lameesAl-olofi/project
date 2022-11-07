
/*
يحتوي كلاس  ControlPharmacist على عدة دوال
منها داله البحث على صيدلي
واضافه صيدلي
وحذف صيدلي والتحقق اذا كان يوجد هناك تكرار
 */
/*
class  ControlPharmacist on several functions
Including the search function for a pharmacist
Pharmacist added
And delete a pharmacist and check if there is a recurrence
 */




import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class ControlPharmacist {
    //Variables
    private final ArrayList<Pharmacist> allPharmacist = new ArrayList<>();

    //Constructor

    //----------------------------------------------------
//Methods
    public void addNewPharmacist(int id, String pharmacistName, double salary, String branchName, int branchNo, int password) {
        Pharmacist s = new Pharmacist(id, pharmacistName, salary, branchName, branchNo, password);
        allPharmacist.add(s);
    }
    //----------------------------------------------------

    public ArrayList<Pharmacist> viewAllPharmacist() {
        return allPharmacist;
    }
    //----------------------------------------------------

    public Pharmacist searchForPharmacist(String PharmacistName) {
        boolean found = false;
        int i = 0;
        while (!found && i < allPharmacist.size()) {
            if (allPharmacist.get(i) != null) {
                if (allPharmacist.get(i).getPharmacistName().equals(PharmacistName))
                    found = true;
                else
                    i++;
            } else
                i++;
        }
        if (i < allPharmacist.size())
            return allPharmacist.get(i);
        else
            return null;
    }
    //----------------------------------------------------

    private int searchForPharmacistIndex(String PharmacistName) {
        boolean found = false;
        int i = 0;
        while (!found && i < allPharmacist.size()) {
            if (allPharmacist.get(i) != null) {
                if (allPharmacist.get(i).getPharmacistName().equals(PharmacistName))
                    found = true;
                else
                    i++;
            } else
                i++;
        }
        if (i < allPharmacist.size())
            return i;
        else
            return -1;
    }
    //----------------------------------------------------

    public boolean deletePharmacist(String deleteName) {
        int index = searchForPharmacistIndex(deleteName);
        if (index != -1) {
            allPharmacist.remove(index);
            return true;
        } else return false;

    }

    //----------------------------------------------------
    //التحقق ان كان هناك تكرار او لا
    public boolean checkForDuplicate(Pharmacist p) {
        for (int i = 0; i < allPharmacist.size(); i++) {
            if (allPharmacist.get(i).equals(p))
                return true;
        }
        return false;
    }

    //----------------------------------------------------
    //الكتابة في ملف
    public void writeFile() {
        //تعريف الملف
        File file = new File("Pharmacist.txt");

        try {
            // انشاء ملف جديد اذا لم يكن موجود و الاضافة فيه
            if (file.createNewFile()) {
//                تم انشاء الملف سيقوم الان بالكتابة عليه
                try {
                    FileWriter writer = new FileWriter("Pharmacist.txt", true);
                    for (int i = 0; i < allPharmacist.size(); i++) {
                        writer.write(allPharmacist.get(i).print());
                    }
                    writer.close();
                } catch (Exception e) {
                    System.out.println("Error: " + Arrays.toString(e.getStackTrace()));
                }
            }

            // الاضافة الى ملف موجود مسبقا
            else {
                try {
                    FileWriter write = new FileWriter("Pharmacist.txt", true);
                    for (int i = 0; i < allPharmacist.size(); i++) {
                        write.write(allPharmacist.get(i).print());
//                        تم كتابة البيانات في الملف
                    }

                    write.close();
                } catch (Exception e) {
                    System.out.println("Error: " + Arrays.toString(e.getStackTrace()));
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + Arrays.toString(e.getStackTrace()));
        }

    }

    //----------------------------------------------------
    //القراءة من الملف
    public void readFile() throws FileNotFoundException {
        try {
            File file = new File("Pharmacist.txt");
            if (file.exists()) {
                // يبدأ بقراءة البيانات من الملف
                for (int i = 0; i < allPharmacist.size(); i++) {
                    System.out.println(allPharmacist.get(i).print());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + Arrays.toString(e.getStackTrace()));
        }
    }
}