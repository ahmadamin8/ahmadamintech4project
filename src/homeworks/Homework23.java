package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {

    //Task 1

    public static TreeMap<String, String> parseData(String str){
        TreeMap<String, String> dataTable = new TreeMap<>();
        while (str.contains("{")){
            String key = str.substring(str.indexOf("{") + 1, str.indexOf("}"));
            str = str.substring(str.indexOf("}"));
            String value = str.contains("{") ? str.substring(str.indexOf("}") + 1, str.indexOf("{")) : str.substring(1);
            if (str.contains("{")) str = str.substring(str.indexOf("{"));
            dataTable.put(key, value);
        }
        return dataTable;
    }

    //Task 2

    public static double calculateTotalPrice1( Map<String, Integer> overallMap){
        double price = 0.00;
        HashMap<String, Double> firstMap = new HashMap<>();
        firstMap.put("Apple", 2.00);
        firstMap.put("Orange", 3.29);
        firstMap.put("Mango", 4.99);
        firstMap.put("Pineapple", 5.25);

        for(String element: overallMap.keySet()){
            price += overallMap.get(element) * firstMap.get(element);
        }
        return price;
    }

    //Task 3

    public static double calculateTotalPrice2(Map<String, Integer> totalPrice){
        Map<String, Double> allPrices = new HashMap<>();
        allPrices.put("Apple", 2.00);
        allPrices.put("Orange", 3.29);
        allPrices.put("Mango", 4.99);

        double finalPrice = 0;
        for(String element: totalPrice.keySet()){
            for (int i = 1; i < totalPrice.get(element) + 1; i++) {
                if(totalPrice.containsKey("Apple") && i % 2 == 1) finalPrice += allPrices.get(element) / 2.00;
                else if(totalPrice.containsKey("Mango") & i % 4 == 0) {
                }else finalPrice += allPrices.get(element);
            }
        }
        return Math.round(finalPrice * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println("-----TASK1-----");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));
        System.out.println("-----TASK2-----");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Mango", 1);
        System.out.println(calculateTotalPrice1(map));
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 2);
        map1.put("Pineapple", 1);
        map1.put("Orange", 3);
        System.out.println(calculateTotalPrice1(map1));
        System.out.println("-----TASK3-----");
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Apple", 4);
        map2.put("Mango", 8);
        map2.put("Orange", 3);
        System.out.println(calculateTotalPrice2(map2));
    }


}
