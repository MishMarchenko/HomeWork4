import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Dmitry");
        System.out.println("The obligatory part of the homework is stored under the number 1");
        System.out.println("Tasks with an asterisk lies under the number 2");
        System.out.println("What would you like to check?");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 1){
            firstPart();
        }else if (i == 2){
            palindrome();
            System.out.println("Now i can check the validity of the Ukrainian number");
            System.out.println("Add number, please");
            System.out.println(regex(scanner.next()));
        }else {
            System.out.println("Sorry, I have only two types of tasks)");
        }
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
    public static void firstPart(){
        System.out.println("Welcome to work with Strings");
        String str = "Hello";
        String str2 = "World";
        String str3 = " ";
        System.out.println(str + " " + str2);
        System.out.println(str.concat(str3).concat(str2));
        System.out.println(f(str + " %s", str2));

        String concat = "Concatenation"; //Логика работает, можно подставлять любое слово с четным колтичеством символов, оно выведит середину
        int a = concat.length() / 2 - 1;
        int b = concat.length() / 2 + 1;
        System.out.println(concat.substring(a, b));

        String name1 = "Mikhail"; // тоже вроде правильно понял задание, таргет есть, а дальше любые стринги можно подставлять и менять между собой
        String name2 = "Kristanna"; // но вот не понял как оформить, чтоб одним методом делать формат как выше. что сделать, чтобы метод ниже(f) был универсальный для любого числа строк?
        String lastName1 = "Marchenko";
        String lastName2 = "Loken";
        String faculty = "QA";
        System.out.println(String.format("Student is %s %s %s", name1, lastName1, faculty));
        System.out.println(String.format("Student is %s %s %s", name2, lastName2, faculty));
    }
    public static String f(String target, String aim){
        return String.format(target, aim);
    }
    public static boolean regex(String target){
        Pattern pattern = Pattern.compile("^((\\+380)([0-9]{9}))$");
        Matcher matcher = pattern.matcher(target);
        return matcher.matches();
    }
}