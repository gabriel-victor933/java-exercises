package duplicados;

import java.util.ArrayList;

public class Duplicados {
    
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        arr1.add("Morango");
        arr1.add("Banana");
        arr2.add("Banana");
        arr2.add("Morango");

        ArrayList<String> dupl = findDuplicates(arr1,arr2);

        for(String names : dupl){
            System.out.println(names);
        }

    }

    public static ArrayList<String> findDuplicates(ArrayList<String> arr1,ArrayList<String> arr2){
        ArrayList<String> duplicates = new ArrayList<>();
        for(String str : arr1){
            if(arr2.contains(str)){
                duplicates.add(str);
            }
        }
        return duplicates;
    }
}
