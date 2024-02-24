package Week1dan2;

import java.util.Scanner;
public class StringLexicography {
    public static String capitalizeFirstChar(String str){
        if((str == null)||(str.isEmpty())){
            return str;
        }
        return (Character.toUpperCase(str.charAt(0)) + str.substring(1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        int totalLength = string1.length() + string2.length();
        System.out.println(totalLength);

        if(string1.compareTo(string2) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String str1 = capitalizeFirstChar(string1);
        String str2 = capitalizeFirstChar(string2);

        System.out.println(str1 +" "+ str2);
    }
}
