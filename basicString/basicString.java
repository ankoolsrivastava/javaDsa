package basicString;

import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.Scanner;

public class basicString {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str1 = "ankool";
        String str2 = "ankool";
        String str3 = "Ankool";

        String s = new String("Srivastava");
        System.out.println(str3 + " " + s);

        String st = "   aNKool   ";
        System.out.println(st.length());
        String a = st.trim();
        System.out.println(a.length());

        System.out.println(st.toUpperCase());

        System.out.println(st.toLowerCase());

        String sr = "My Name Is Ankool Srivastava";
        System.out.println(sr.substring(0, 5));

        System.out.println(sr.contains("Name"));

        String sr1 = "  ";
        System.out.println(sr1.isEmpty());

        String sr2 = "   ";
        System.out.println(sr1.isBlank());

        int num = 5123;
        String str = String.valueOf(num);
        System.out.println(num + 1);
        System.out.println(str + 1);

        String name = "Ankool Srivastava";
        System.out.println(name.startsWith("Ankoo"));
        System.out.println(name.endsWith("Ankoo"));

        String name1 = "Ankool";
        char[] crr = name1.toCharArray();
        //print the char array
        for (char ch : crr) {
            System.out.println("Value of char: " + ch);
        }


        //split -> output -> String array
        String input = "My, name, is, Ankool, Srivastava";
        String[] words = input.split(", ");
        for (String str4 : words) {
            System.out.println(str4);
        }
        //replace character
        String name2 = "bnkool";
        name2 = name2.replace('b', 'a');
        System.out.println(name2);



        //to access character;
        System.out.println(str3.charAt(2));
   //}

    //COMPARING STRING
    if(str1==str2){
        System.out.println("Pointing to same reference");
    }
    else{
        System.out.println("Not pointing");
    }
    if(str1.equals(str2)){
        System.out.println("liternal matches");
    }
    else{
        System.out.println("Not matching");
    }
    if(str1.equals(str3)){
        System.out.println("Lternal matches");
    }
    else {
        System.out.println("Not matches");
    }
    if(str1.equalsIgnoreCase(str3)){
        System.out.println("Liternal matches despite of cases");
    }
    else{
        System.out.println("case error");
    }

    // TAKING INPUT IN STRING
        System.out.println("Enter your String1");
        String strr2=sc.nextLine();
        System.out.println(strr2);

        System.out.println("Enter your String2");
        String strr =sc.next();
        System.out.println(strr);



    }
}

