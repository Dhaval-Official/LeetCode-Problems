package Problems.Problems_NEXT;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello, World!!!");
        String s = "testing";
        int temp;


        ArrayList<Character> al = new ArrayList<Character>();
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

        for (int i=0;i<s.length() ;i++ ) {

            if(hm.containsKey(s.charAt(i))) {

                temp =hm.get(s.charAt(i));
                hm.put(s.charAt(i),++temp);


            } else {

                hm.put(s.charAt(i),1);
                al.add(s.charAt(i));

            }

        }
        System.out.println(hm);
        for(Character c: hm.keySet()) {

            if(hm.get(c) < 2) {
                System.out.print(c);
            }

        }
        // hm.sort();
        System.out.println();
//        int temp2;
//        for(int i=0;i<al.size();i++) {
//
//            temp2 = al.get(i)-'0';
//            System.out.print(temp2);
//            if(hm.get(temp2) == 1) {
//                System.out.print(temp2);
//                break;
//            }
//
//        }

        for(Character c: hm.keySet()) {

            if(hm.get(c) < 2) {
                System.out.print(c);
            }

        }


    }
}