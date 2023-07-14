package arraylist_recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class KPC {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        String str = scn.next(); // 768
        ArrayList<String> list = kpc(str);
        System.out.println(list);
    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> kpc(String str) { // 678
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0); // 6
        String ros = str.substring(1);
        //faith
        ArrayList<String> rres = kpc(ros);
        ArrayList<String> myResult = new ArrayList<>();
        String charCode = codes[ch-'0'];
        for(int i=0; i<charCode.length(); i++){
            char code = charCode.charAt(i);
            for (String rstr: rres){
                myResult.add(code+rstr);
            }
        }
        return myResult;
    }
}
