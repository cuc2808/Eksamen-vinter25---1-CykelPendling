public class Calculator {

    public static int moneyMadeInAYear = 0;

    public int ClimateTaxRefund(){

        moneyMadeInAYear = 0;

        for (String key : Months.getMonthKeys()) {
            moneyMadeInAYear = moneyMadeInAYear + monthTaxRefund(key);
        }

        return moneyMadeInAYear;
    }

    public int monthTaxRefund(String key){

        int moneyMadeInMonth = 0;
        int monthValue;

        if(Months.summerSeason.contains(key)){
            monthValue = Months.months.get(key);
            moneyMadeInMonth = monthValue * 10;
            if(monthValue > 20){
                moneyMadeInMonth = moneyMadeInMonth + 50;
            }
        } else if(Months.winterSeason.contains(key)){
            monthValue = Months.months.get(key);
            moneyMadeInMonth = monthValue * 15;
            if(monthValue > 20){
                moneyMadeInMonth = moneyMadeInMonth + 50;
            }
        }

        return moneyMadeInMonth;
    }

    public double CO2Spared(){
        double CO2WeightInKG = 0;
        for (String key : Months.getMonthKeys()) {
            CO2WeightInKG = CO2WeightInKG + (Months.months.get(key) * 2.6);
        }
        return CO2WeightInKG;
    }

    public int treesSpared(){
        double CO2WeightInKG = CO2Spared();
        int amountOfTrees = (int)(CO2WeightInKG/20);
        return amountOfTrees;
    }

}
