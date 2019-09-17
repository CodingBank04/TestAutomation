package qaInterviewprep;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseStringManual {
    public static String reverseString(String str) {
        String newString="";
        for (int i= str.length()-1 ; i>=0 ; i--) {
            newString =newString +str.charAt(i);

        }
        return newString;
    }
    public static void reverseArrayList(ArrayList<String> arr){
        ArrayList<String> reversed =new ArrayList<String>();
        for (int i=arr.size()-1; i>=0; i--){
            reversed.add(reverseString(arr.get(i)));

        }
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        ArrayList<String> myArray =new ArrayList<String>(Arrays.asList("automation ", "bootcamp"));
        System.out.println(myArray);

        String newString="automation";
        System.out.println(reverseString(newString));
    }

}
