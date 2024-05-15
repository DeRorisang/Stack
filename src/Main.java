import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String orWord = "Primo"; .
        String reversed = reversedWord(orWord);
        System.out.println("Original word: " + orWord);
        System.out.println("Reversed word: " + reversed);

//        System.out.println(reversedWord("Primo"));
    }

    public static String reversedWord(String word) {
        Stack<Character> stackOfChar = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stackOfChar.push(word.charAt(i));
        }

        String reversed = "";
        while (!stackOfChar.isEmpty()) {
            reversed += stackOfChar.pop();
        }
        return reversed;
    }
}