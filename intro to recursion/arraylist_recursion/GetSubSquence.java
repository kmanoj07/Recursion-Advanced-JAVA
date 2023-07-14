package arraylist_recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSquence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> result = gss(str);
        System.out.println(result);
    }

    // Expectation -> gss("abC") - will return the sub sequence 2 ^ len = 2 ^ 3 -> 8
    /*
        [
            "---",
            "--c",
            "-b-",
            "-bc",
            "a--",
            "a-c",
            "ab-",
            "abc"
        ]
     */
    // faith -> gss(bc) -> for smaller string, it will return sub seq
    /*
        [
            "--",
            "-c",
            "b-",
            "bc"
        ]
    */
    // Meet Faith to expectation
    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rosss = gss(ros);

        ArrayList<String> myResult = new ArrayList<>();
        for (String rstr: rosss){
            myResult.add(""+rstr); // it will not include the ch
        }
        for(String rstr: rosss){
            myResult.add(ch+rstr); // it will include the ch
        }
        return  myResult;
    }
}
