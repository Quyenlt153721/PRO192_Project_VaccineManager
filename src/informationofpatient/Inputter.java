
package informationofpatient;

import java.util.Scanner;


public class Inputter {
    public static Scanner sc = new Scanner(System.in);
    public static String Inputername(String msg){
        System.out.println(msg);
        String name = sc.nextLine();
        return name;
    }
    public static int InputerAge(String msg){
        System.out.println(msg);
        int age = Integer.parseInt(sc.nextLine());
        return age;
    }
    public static String InputerSex(String msg){
        System.out.println(msg);
        String sex = sc.nextLine();
        return sex;
    }
    public static String InputerAddress(String msg){
        System.out.println(msg);
        String Address = sc.nextLine();
        return Address;
    }
    public static String InputerPhone(String msg){
        System.out.println(msg);
        String Phone = sc.nextLine();
        return Phone;
    }
    public static String InputerSotheBHYT(String msg){
        System.out.println(msg);
        String sothe = sc.nextLine();
        return sothe;
    }
    
}
