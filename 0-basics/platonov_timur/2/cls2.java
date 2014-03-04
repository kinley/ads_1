// TASK 0.2
// строка - палиндром?

import java.lang.String;

public class cls2 {
    public static void CheckPal(String s) {
        s = s.toLowerCase(); // на случай заглавных букв
        for (int i = 0; i < (s.length()/2); i++)
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                System.out.println("No!");
                return; // прерывание программы
            }
        System.out.println("Yes!");
    }

    // ##### MAIN #####
    public static void main(String[] args) {
        CheckPal("Malayalam");
    }
}