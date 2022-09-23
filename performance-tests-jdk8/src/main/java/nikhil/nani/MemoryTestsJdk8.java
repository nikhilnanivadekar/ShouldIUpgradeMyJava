package nikhil.nani;

import java.util.*;

public class MemoryTestsJdk8 {
    public static void main(String[] args) throws InterruptedException {


        for (int k = 0; k < 5; k++) {

            Map<String, String> stringMap = new HashMap<>();
            List<String> stringList = new ArrayList<>();
            Set<String> stringSet = new HashSet<>();

            for (int i = 0; i < 7; i++) {
                int size = Double.valueOf(Math.pow(10, i)).intValue();

                for (int j = 0; j < size; j++) {
                    String aString = String.valueOf(j);
                    stringMap.put(aString, aString);
                    stringList.add(aString);
                    stringSet.add(aString);
                }

                printMemoryUtilizationUsingRuntime("String", size);
            }
            System.out.println("-----------------------------------------------------------");
        }
    }

    public static void printMemoryUtilizationUsingRuntime(String type, int size) throws InterruptedException {
        System.gc();
        Thread.sleep(1000);
        System.gc();
        Thread.sleep(1000);
        System.gc();
        Thread.sleep(1000);

        System.out.println("JDK8 " + type + " Size:" + size + " Memory:" + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 + " Kb");
    }
}