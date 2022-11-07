/*
كلاس البيع يحتوي على عدد الدواء الذي تم بيعه و الرقم الذي يميز الدواء ن غيره واسم الدواء وسعر الدواء وكميه الدواء
وتاريخ بيع الدواء وداله تحسب كم عدد الدواء المتبقي وداله تحسب الربح بعد كل دواء تم بيعه
 */

/*
 class The sell contains the number of the drug that was sold,
 the number that distinguishes the drug from others,
 the name of the drug,
  the price of the drug and the quantity of the drug
The date of sale of the drug,
 a function that calculates how many drugs are left,
 and a function that calculates the profit after each drug sold
 */



public class sell extends Medicines {
    private int NumberBuyMedicine;//كم عددد الدواء
    private int[] DataSell;
    private double priceSell;

    public sell(int id, String medicinesName, double price, int numberBuyMedicine, int[] dataSell, double priceSell) {
        super(id, medicinesName, price);
        NumberBuyMedicine = numberBuyMedicine;
        DataSell = dataSell;
        this.priceSell = priceSell;
    }

    public double getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(double priceSell) {
        this.priceSell = priceSell;
    }

    public int[] getDataSell() {
        return DataSell;
    }

    public void setDataSell(int[] dataSell) {
        DataSell = dataSell;
    }

    public int getNumberBuyMedicine() {
        return NumberBuyMedicine;
    }

    public void setNumberBuyMedicine(int numberBuyMedicine) {
        NumberBuyMedicine = numberBuyMedicine;
    }

    public void qty(int qty) {
        qty = qty - NumberBuyMedicine;
        System.out.println(qty);
    }

}/*
نفعل داله احتساب الربح في ال main  نعرف منغير من نوع دبل ونساويه ب داله القت تبع اbuy -داله القت تبع sell
*/