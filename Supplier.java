/*
كلاس المورد يحتوي اسم المورد ورقم تلفونه واسماء الادويه الذي تم توريدها للصيدليه وعدد الادويه التي تم توريدها للصيدليه
 */

/*
class supplier It contains the name of the supplier,
his phone number,
 the names of the medicines that were supplied to the pharmacy,
  and the number of medicines that were supplied to the pharmacy.
 */

public class Supplier {

    private String NameSupplier;
    private int NumberPhoneSupplier;
    private String NameMidicnesSupplier;
    private int NumberMidicnesSupplier;

    public Supplier(String nameSupplier, int numberPhoneSupplier, String nameMidicnesSupplier, int numberMidicnesSupplier) {
        NameSupplier = nameSupplier;
        NumberPhoneSupplier = numberPhoneSupplier;
        NameMidicnesSupplier = nameMidicnesSupplier;
        NumberMidicnesSupplier = numberMidicnesSupplier;
    }

    public String getNameSupplier() {
        return NameSupplier;
    }

    public void setNameSupplier(String nameSupplier) {
        NameSupplier = nameSupplier;
    }

    public int getNumberPhoneSupplier() {
        return NumberPhoneSupplier;
    }

    public void setNumberPhoneSupplier(int numberPhoneSupplier) {
        NumberPhoneSupplier = numberPhoneSupplier;
    }

    public String getNameMidicnesSupplier() {
        return NameMidicnesSupplier;
    }

    public void setNameMidicnesSupplier(String nameMidicnesSupplier) {
        NameMidicnesSupplier = nameMidicnesSupplier;
    }

    public int getNumberMidicnesSupplier() {
        return NumberMidicnesSupplier;
    }

    public void setNumberMidicnesSupplier(int numberMidicnesSupplier) {
        NumberMidicnesSupplier = numberMidicnesSupplier;
    }

}
