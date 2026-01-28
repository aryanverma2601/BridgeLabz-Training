import java.util.*;

public class LexicalTwist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        if (word1.trim().contains(" ")) {
            System.out.println(word1 + " is an invalid word");
            return;
        }

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();

        if (word2.trim().contains(" ")) {
            System.out.println(word2 + " is an invalid word");
            return;
        }

        StringBuilder sb = new StringBuilder(word1.toLowerCase());

        sb.reverse();

        if(sb.toString().equals(word2)){

            sb = new StringBuilder(sb.toString().toLowerCase());

            for(int i=0;i<sb.length();i++){
                char ch = sb.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    sb.setCharAt(i,'@');
                }
            }

            System.out.println(sb.toString());
        }
        
        else{
            sb.reverse().append(word2);

            sb = new StringBuilder(sb.toString().toUpperCase());
            int vowelCount = 0;
            int consonantCount = 0;
            Set<Character> vowels = new LinkedHashSet<>();
            Set<Character> consonants = new LinkedHashSet<>();

            for(int i=0;i<sb.length();i++){
                char ch = sb.charAt(i);

                if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                    vowels.add(ch);
                    vowelCount++;
                }
                else if((ch >= 'A' && ch <= 'Z')){
                    consonants.add(ch);
                    consonantCount++;
                }
            }

            if(vowelCount > consonantCount){
                int count = 2;

                for(char ch : vowels){
                    if(count == 0) break;
                    System.out.print(ch + " ");
                    count--;
                }
            }
            else if(consonantCount > vowelCount){
                int count = 2;

                for(char ch : consonants){
                    if(count == 0) break;
                    System.out.print(ch + " ");
                    count--;
                }
            }

            else  {
                System.out.println("Vowels and consonants are equal");
            }

        }


        sc.close();


    }
    
}
