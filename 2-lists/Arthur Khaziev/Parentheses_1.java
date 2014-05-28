import java.util.Stack;

public class Parentheses {
    private static final char L_PAREN = '(';
    private static final char R_PAREN = ')';
    private static final char L_BRACE = '{';
    private static final char R_BRACE = '}';
    private static final char L_BRACKET = '[';
    private static final char R_BRACKET = ']';

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();  //создаем стэк
        for (int i = 0; i < s.length(); i++) {                          //цикл проходящий по всем символам в слове

            if (s.charAt(i) == L_PAREN) stack.push(L_PAREN);            //если "(" добавляем в стэк

            else if (s.charAt(i) == L_BRACE) stack.push(L_BRACE);          // или если "{" добавляем в стэк

            else if (s.charAt(i) == L_BRACKET) stack.push(L_BRACKET);        // или если "[" добавляем в стэк

            else if (s.charAt(i) == R_PAREN) {                              // или если ")"
                if (stack.isEmpty()) return false;                          // если стэк пуст возвращаем false
                if (stack.pop() != L_PAREN) return false;                   // если верхний элемент стэка не равен "(" возвращаем false
            } else if (s.charAt(i) == R_BRACE) {                            // или если "}"
                if (stack.isEmpty()) return false;                          //если стэк пуст возвращаем false
                if (stack.pop() != L_BRACE) return false;                   // если верхний элемент стэка не равен "{" возвращаем false
            } else if (s.charAt(i) == R_BRACKET) {                          // или если "]"
                if (stack.isEmpty()) return false;                          // если стэк пуст возвращаем false
                if (stack.pop() != L_BRACKET) return false;                 // если верхний элемент стэка не равен "]" возвращаем false

        }
        return stack.isEmpty();                                             // если стэк пуст возвращем true  
    }

    public static void main(String[] args) {
        String s = "[()]{}{[()()]()}";
        System.out.println(isBalanced(s));
    }

}
