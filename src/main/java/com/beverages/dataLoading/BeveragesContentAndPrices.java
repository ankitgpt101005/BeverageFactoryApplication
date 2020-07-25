package com.beverages.dataLoading;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static com.beverages.Utility.Constants.*;

public class BeveragesContentAndPrices {

    private BeveragesContentAndPrices() {
    }

    /*
     * getting default beverages content combination 
     */
    public static Map<String, List<String>> getBeveragesMap() {

        Map<String, List<String>> beveragesMap = new HashMap<>();
        beveragesMap.put(COFFEE, Arrays.asList(MILK, SUGAR, WATER));
        beveragesMap.put(CHAI, Arrays.asList(MILK, SUGAR, WATER));
        beveragesMap.put(BANANA_SMOOTHIE, Arrays.asList(MILK, SUGAR, WATER));
        beveragesMap.put(STRAWBERRY_SHAKE, Arrays.asList(WATER, MILK, SUGAR));
        beveragesMap.put(MOJITO, Arrays.asList(SUGAR, WATER, SODA, MINT));
        return beveragesMap;
    }

    /*
     * getting beverages content combination rates
     */
    public static Map<String, Double> getItemRates() {

        Map<String, Double> itemRates = new HashMap<>();

        itemRates.put(COFFEE, COFFEE_BEANS_PRICE + MILK_PRICE + WATER_PRICE + SUGAR_PRICE);

        itemRates.put(CHAI, TEA_LEAVES_PRICE + MILK_PRICE + WATER_PRICE + SUGAR_PRICE);

        itemRates.put(BANANA_SMOOTHIE, BANANA_PRICE + MILK_PRICE + WATER_PRICE + SUGAR_PRICE);

        itemRates.put(STRAWBERRY_SHAKE, STRAWBERRIES_PRICE + MILK_PRICE + WATER_PRICE + SUGAR_PRICE);

        itemRates.put(MOJITO, LEMON_PRICE + SODA_PRICE + WATER_PRICE + SUGAR_PRICE + MINT_PRICE);

        return itemRates;
    }

    


}

