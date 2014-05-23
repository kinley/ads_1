package Exercise_2;

public class homework2 {

    public static void check ( String s )
    {
        for (int i = 0; i<s.length()/2; i++ )                       // в цикле сравниваем первую часть слова со второй
        {
            if (s.charAt(i)!=s.charAt(s.length() - 1 - i)){
                System.out.println("Не палиндром");
                return;                                             // Выход из метода
            }
        }

        System.out.println("Палиндром");
    }

    public static void main (String[]args){
        check("шалаш");
    }
}
