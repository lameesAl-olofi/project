/*
 كلاس خاص بالصيدلي فيها اسمه ورقمه واسم الفرع الذي يعمل به و رقم الفرع
                   ودواله لتعديل كلاَ من : اسمه, رقمه, اسم الفرع, رقم الفرع
 */
/*
يحتوي كلاس الصيدلي على اسم الصيدلي والرقم الذي يميز الصيدلي واراتب الصيدلي وكلمه سر للصيدلي واسم الفرع ورقم الموظف(تلفون) ورقم الفرع ويحتوي على داله To String
,وداله equals
 */
/*
Contain class pharmacist The name of the pharmacist,
 the number that distinguishes the pharmacist,
  the pharmacist's salary,
  a password for the pharmacist,
  the name of the branch,
   the employee's number (telephone) and the branch number and it contains a function  To String
   and function equals
 */
import java.util.Objects;

public class Pharmacist {

    //Variables
    private String PharmacistName; // اسم الصيدلي

    private  int id; // رقم الصيدلي

    private double salary; //راتب الصيدلي
    private int password; //كلمة السر حق الصيدلي
    private String branchName; //اسم الفرع

     private int NmberPhone;//رقم الموظف
    private int branchNo; //رقم الفرع


    //Constructor


    public Pharmacist(String pharmacistName, int id, double salary, int password, String branchName, int nmberPhone, int branchNo) {
        PharmacistName = pharmacistName;
        this.id = id;
        this.salary = salary;
        this.password = password;
        this.branchName = branchName;
        NmberPhone = nmberPhone;
        this.branchNo = branchNo;
    }


    public Pharmacist(int password, String pharmacistName, double salary, String branchName, int branchNo, int i) {
        PharmacistName = pharmacistName;
        this.id = 0;
        this.salary=0;
        this.password=password;
        this.branchName = "";
        this.branchNo = 0;
        NmberPhone =0;
    }

    public Pharmacist() {
    }
    //Methods

    public int getNmberPhone() {
        return NmberPhone;
    }

    public void setNmberPhone(int nmberPhone) {
        NmberPhone = nmberPhone;
    }

    public String getPharmacistName() {
        return PharmacistName;
    }

    public void setPharmacistName(String pharmacistName) {
        PharmacistName = pharmacistName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(int branchNo) {
        this.branchNo = branchNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacist that = (Pharmacist) o;
        return id == that.id && Double.compare(that.salary, salary) == 0 && password == that.password && branchNo == that.branchNo && Objects.equals(PharmacistName, that.PharmacistName) && Objects.equals(branchName, that.branchName);
    }

    @Override
    public String toString() {
        return "Pharmacist{" +
                "PharmacistName='" + PharmacistName + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", password=" + password +
                ", branchName='" + branchName + '\'' +
                ", branchNo=" + branchNo +
                '}';
    }

    public String print() {
        return
                "PharmacistName: '" + PharmacistName + '\'' +
                ", id: " + id +
                ", salary: " + salary +
                ", password: " + password +
                ", branchName: '" + branchName + '\'' +
                ", branchNo: " + branchNo ;
    }
}
