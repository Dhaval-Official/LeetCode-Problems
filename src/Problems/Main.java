package Problems;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s = "aaabbc";

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        int temp;

        for(int i=0;i<s.length();i++) {

            if(hm.containsKey(s.charAt(i))) {

                temp = hm.get(s.charAt(i));
                hm.put(s.charAt(i),++temp);

            } else {

                hm.put(s.charAt(i),1);
            }

        }

        System.out.println(hm);

    }
}
/*
for (int i = 1; i <= 5; i++) {
        if (i == 3)
        continue;
        System.out.print(i + " ");
}
Map<String, String> map = new HashMap<>();
map.put(null, "A");
map.put(null, "B");
System.out.println(map);

Sindhu Kumarthi
12:15 PM
class Test {
    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }

    Test() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Test();
    }
}

Sindhu Kumarthi
12:17 PM
public void test(Object o) {
    System.out.println("Object");
}

public void test(String s) {
    System.out.println("String");
}

public static void main(String[] args) {
    new Test().test(null);
}

Sindhu Kumarthi
12:18 PM
int[] arr = new int[5];
System.out.println(arr[5]);
StringBuilder sb = new StringBuilder("Hi");
sb.append(" Java");
System.out.println(sb);

Sindhu Kumarthi
12:20 PM
public static int test() {
    try {
        return 10;
    }
    finally {
        return 20;
    }
}

public static void main(String[] args) {
    System.out.println(test());
}

Sindhu Kumarthi
12:21 PM
try {
        System.out.println("Try");
int a = 10 / 0;
}
        catch (Exception e) {
        System.out.println("Catch");
}
        finally {
        System.out.println("Finally");
}

 */