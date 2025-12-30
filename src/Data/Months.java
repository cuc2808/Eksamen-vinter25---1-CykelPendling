package Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class Months {

    public static HashMap<String, Integer> months = new HashMap();

    public static ArrayList winterSeason = new ArrayList<>();
    public static ArrayList summerSeason = new ArrayList<>();

    public Months(){
        establishMonths();
        establishSeasons();
    }

    public static Set<String> getMonthKeys(){
        return months.keySet();
    }

    public void establishMonths(){
        months.put("JANUAR",0);
        months.put("FEBRUAR",0);
        months.put("MARTS",0);
        months.put("APRIL",0);
        months.put("MAJ",0);
        months.put("JUNI",0);
        months.put("JULI",0);
        months.put("AUGUST",0);
        months.put("SEPTEMBER",0);
        months.put("OKTOBER",0);
        months.put("NOVEMBER",0);
        months.put("DECEMBER",0);
    }

    public void establishSeasons(){
        //april to oktober
        summerSeason.add("APRIL");
        summerSeason.add("MAJ");
        summerSeason.add("JUNI");
        summerSeason.add("JULI");
        summerSeason.add("AUGUST");
        summerSeason.add("SEPTEMBER");
        summerSeason.add("OKTOBER");

        //november to marts
        winterSeason.add("NOVEMBER");
        winterSeason.add("DECEMBER");
        winterSeason.add("JANUAR");
        winterSeason.add("FEBRUAR");
        winterSeason.add("MARTS");
    }

    /* Unused:
    public void setMonthValue(String month,int value){
        months.replace(month, value);
    }

    public int getMonthValue(String month){
        return months.get(month);
    }
    */


}
