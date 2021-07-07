package informationofpatient;

import java.util.Scanner;

public class Inputter {

    public static Scanner sc = new Scanner(System.in);

    public static int InputerInt(String msg) {
        System.out.println(msg);
        int age = Integer.parseInt(sc.nextLine());
        return age;
    }

    public static String InputerString(String msg) {
        System.out.println(msg);
        String sex = sc.nextLine();
        return sex;
    }

}
