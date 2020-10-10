package cd.get.ready.algorithms;

import java.util.*;

public class DogWalker {
    public int numberOfWalksCalculator(int[] dogSizes){

        int numberOfWalks = 0;
        Map<Integer, Integer> hMap  = new HashMap<>();

        for (int i = 0; i < dogSizes.length; i++) {
            if (!hMap.containsKey(dogSizes[i])) {
                hMap.put(dogSizes[i], 1);
            }
            else {
                hMap.put(dogSizes[i], hMap.get(dogSizes[i]) + 1);
            }
        }

        Collection<Integer> hMapValues = hMap.values();
        Integer[] valuesArray = hMapValues.toArray(new Integer[hMapValues.size()]);

        for (int j = 0; j < valuesArray.length; j++) {
            int additionalWalks = ((valuesArray[j] + 1) / 2);
            numberOfWalks += additionalWalks;
        }

        return numberOfWalks;
    }
}