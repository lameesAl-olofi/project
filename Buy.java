//--------------------------------------------------------
//يحتوي كلاس الشراء على الكميه الدواء
//واسم الدواء الذي تم شرائه وتاريخ عمليه الشراء وكم عدد الدواء المشترى وكم سعر كل دواء تم شرائه
//والرقم الذي يعرف الصيدلي الذي اشتراء الدواء ويحتوي على داله تزيد من عدد كميه الدواء كل ما تم شؤاء دواء جديد ويحتوي على داله
//تحسب اجمالي سعر كل دواء تم شرائه
//-------------------------------------------------------
//contaion class Buy on the quantity of medicine and name of the drug that was purchased and date of parchase
//process and number of medicin Buyer and price of each medication has been purchased and number the pharmacist
//who buy medicine it contians the functions of the number of quantity of medicine all the new medicine
//has been purchased  it contians the functions  total of all the price of each drug was purchased
//------------------------------------------------------------------------------






public class Buy extends Medicines{
    private  int idpharmacy ;
    private  int qty ;
    private String nameMedicine=" ";//اسم الدواء
    private int [] DateBuy;
    private int NumberBuyMedicine;//كم عددد الدواء
    private double PriceBuyMedicine;// سعر الدواء

    public Buy(int id, String medicinesName, double price, int qty, int idpharmacy, int qty1, String nameMedicine, int[] dateBuy, int numberBuyMedicine, double priceBuyMedicine) {
        super(id, medicinesName, price);
        this.idpharmacy = idpharmacy;
        this.qty = qty1;
        this.nameMedicine = nameMedicine;
        DateBuy = dateBuy;
        NumberBuyMedicine = numberBuyMedicine;
        PriceBuyMedicine = priceBuyMedicine;
    }

    public int[] getDateBuy() {
        return DateBuy;
    }

    public int getPharmacy() {
        return idpharmacy;
    }

    public void setPharmacy(int pharmacy) {
        this.idpharmacy = pharmacy;
    }

    public void setDateBuy(int[] dateBuy) {
        DateBuy = dateBuy;
    }

    public String getNameMedicine() {
        return nameMedicine;
    }

    public void setNameMedicine(String nameMedicine) {
        this.nameMedicine = nameMedicine;
    }

    public int getNumberBuyMedicine() {
        return NumberBuyMedicine;
    }

    public void setNumberBuyMedicine(int numberBuyMedicine) {
        NumberBuyMedicine = numberBuyMedicine;
    }

    public double getPriceBuyMedicine() {
        return PriceBuyMedicine;
    }

    public void setPriceBuyMedicine(double priceBuyMedicine) {
        PriceBuyMedicine = priceBuyMedicine;
    }

    public void qty(int qty){
        qty=qty+NumberBuyMedicine;
    }

    public void Sumprice(double sumprice){
        sumprice=NumberBuyMedicine+PriceBuyMedicine;
    }
}

