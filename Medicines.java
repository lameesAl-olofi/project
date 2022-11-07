import java.util.Arrays;
import java.util.Objects;
/*
كلاس للادوية يحتوي على اسم الدواء ورقم الذي يميز الدواء عن غيره ةتاريخ الانتاج و تاريخ الانتهاء و اسم مورد الدواء وسعر كل دواء ويحتوي على داله to String
وداله equals
 */

/*
 chass medicine It contains the name of the drug and a number
that distinguishes the drug from others,
the date of production,
the expiry date,
the name of the drug supplier
and the price of each drug and contains a function to String and the function equals
 */

public class Medicines {
        //Variables
        private  int id = 0; // رقم دواء
        private String medicinesName; //اسم الدواء
        private double price;  // سعر الدواء

        private int[] expiryDate; //تاريخ الاانتهاء
        private int[] productionDate;// تاريخ الانتاج

        private String NameSupplier; //اسم الشركة المصنعة

        private  int qty; // كمية دواء

        //Constructor
        public Medicines(int id, String medicinesName, double price) {

        }

        public Medicines(int[] expiryDate, int[] productionDate) {
                this.id = id;
                this.medicinesName = medicinesName;
                this.price = price;
                this.expiryDate = expiryDate;
                this.productionDate = productionDate;
                this.NameSupplier =NameSupplier ;
                this.qty = qty;
        }

        //Methods
        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public int getQty() {
                return qty;
        }

        public void setQty(int qty) {
                this.qty = qty;
        }

        public String getMedicinesName() {
        return medicinesName;
        }

        public void setMedicinesName(String medicinesName) {
        this.medicinesName = medicinesName;
        }

        public double getPrice() {
        return price;
        }

        public void setPrice(double price) {
        this.price = price;
        }

        public String getExpiryDate() {
             int x =expiryDate[0],y=expiryDate[1];
             return x+" / "+y;
        }

        public void setExpiryDate(int[] expiryDate) {
                this.expiryDate = expiryDate;
        }

        public String getProductionDate() {
                int x =productionDate[0], y=productionDate[1];
                return x+" / "+y;
        }

        public void setProductionDate(int[] productionDate) {
                this.productionDate = productionDate;
        }

        public String getNameSupplier() {return NameSupplier ;}

        public void setNameSupplier(String NameSupplier) {this.NameSupplier = NameSupplier;}
//------------------------------------------------------------------------------------

        public String print() {
                return
                        "id: " + id +
                        "\nMedicine Name: " + medicinesName +
                        "\nPrice: " + price +
                        "\nExpiry Date: " + getExpiryDate()+
                        "\nProductionDate: " + getProductionDate() +
                        "\nNameSupplier: " + NameSupplier +
                        "\nQty: " + qty +
                         "\n________________________________________________________________________\n";
        }

        @Override
        public String toString() {
                return "Medicines{" +
                        "id=" + id +
                        ", medicinesName='" + medicinesName + '\'' +
                        ", price=" + price +
                        ", expiryDate=" + Arrays.toString(expiryDate) +
                        ", productionDate=" + Arrays.toString(productionDate) +
                        ", company='" +  + '\'' +
                        ", qty=" + qty +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Medicines medicines = (Medicines) o;
                return id == medicines.id && Double.compare(medicines.price, price) == 0 && qty == medicines.qty && Objects.equals(medicinesName, medicines.medicinesName) && Arrays.equals(expiryDate, medicines.expiryDate) && Arrays.equals(productionDate, medicines.productionDate) && Objects.equals(NameSupplier, medicines.NameSupplier);
        }


}
