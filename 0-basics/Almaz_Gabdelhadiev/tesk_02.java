import java.util.Scanner;

public class Polindrom {

    public static boolean Polindrom(String text){
        char[] textInCharArray = text.toCharArray();
        for(int i = 0; i < text.length()/2; i++){
            if(textInCharArray[i] != textInCharArray[text.length() - i - 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Введите текст: ");
        String text;
        Scanner sc = new Scanner(System.in);
        text =  sc.next();
        if(Polindrom(text)){
            System.out.print("Да");
        } else {
            System.out.print("Нет");
        }
    }
}