
/*
كلاس المخزن يحتوي على تاريخ شراء الدواء وتاريخ تخزين الدواء
وداله تحسب كم للدواء مخزن
 */
/*
class store Contains the date of purchase of the drug and the date of storage of the drug
A function that calculates how much medicine is stored
 */

public class TheStore extends Buy{
    private int[] DateStor;
    public TheStore( int[] dateBuy, int[] dateStor) {
        super(dateBuy);
        DateStor = dateStor;
    }
public void HowManyDateStor(int s){
    int dateBuy=0;
    int dateStor = 0;
    s=dateBuy-dateStor;
    System.out.println(s);

}

    }

