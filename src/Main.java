import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to work with Strings");
        String str = "Hello";
        String str2 = "World";
        String str3 = " ";
        System.out.println(str + " " + str2);
        System.out.println(str.concat(str3).concat(str2));
        System.out.println(f(str + " %s", str2));

        String concat = "Concatenation";
        System.out.println(concat.substring(5, 7));
        palindrome();

    }
    public static String f(String target, String aim){
        return String.format(target, aim);
    }
    public static void palindrome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I can check if a word is a palindrome!");
        System.out.println("Add a word, please");
        String str = scanner.nextLine();
        StringBuilder word = new StringBuilder(str);
        word.reverse();
        String str2 = word.toString();
        if(str.equalsIgnoreCase(str2)){
            System.out.println("Is palindrome");
        }else {
            System.out.println("Is not palindrome");
        }
    }
}