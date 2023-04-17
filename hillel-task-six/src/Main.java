import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        String str = "qCwcerfdcvc";

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" ,
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        String word = words[(int)(Math.random()*words.length)];

        System.out.println(findSymbolOccurance(str, 'C'));
        System.out.println(findWordPosition("TestqwertyqwerTest", "Test"));
        System.out.println(stringReverse("Hello"));
        System.out.println(stringReverse2("Hello"));
        System.out.println(isPalindrome("qwertytrewq"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("а роза упала на лапу Азора"));

        toGuessWord(word);
    }


    public static int findSymbolOccurance(String str, char ch){
        int count = 0;
        if (!(str.length()==0)){
            char [] chars = str.toCharArray();
            for (int i=0; i<chars.length; i++){
                if (chars[i]==ch)
                    count++;
            }
            return count;
        } else {
            return count;
        }
    }



    public static int findWordPosition(String source, String target){
        int index = -1;

        if (source.length()!=0&&target.length()!=0) {

            char[] sources = source.toCharArray();
            char[] targets = target.toCharArray();

            for (int i = 0; i < sources.length; i++) {
                if (sources[i] == targets[0] && target.length() <= sources.length - i) {
                    m:
                    for (int j = 0; j < targets.length; j++) {
                        if (targets[j] == sources[j + i]) {
                            if (j == targets.length - 1) {
                                index = i;
                                break;
                            }
                        } else {
                            break m;
                        }
                    }
                }
                if (index>-1){
                    break;
                }
            }
        }
        return index;
    }

    public static String stringReverse(String str){
        if (str.length() > 0) {
            return new StringBuilder(str).reverse().toString();
        } else {
            return str;
        }
    }


    public static String stringReverse2(String str){
        char [] chars1 = str.toCharArray();
        char [] chars2 = new char[chars1.length];
        int count = 0;

        for (int i=chars1.length-1; i>=0; i--){
            chars2[count]=chars1[i];
            count++;
        }
        return new String(chars2);
    }

    public static boolean isPalindrome(String str){
        if (str.length()>0) {
            return str.toLowerCase().replaceAll("\\s", "")
                    .equals(new StringBuilder(str).reverse().toString()
                            .toLowerCase().replaceAll("\\s", ""));
        } else {
            return false;
        }
    }


    static void toGuessWord(String hiddenWord) {
        System.out.println("Напишіть яке слово зі списку загадала програма\n" +
                "apple\torange\tlemon\tbanana\tapricot\t\n" +
                "avocado\tbroccoli\tcarrot\tcherry\t\n" +
                "garlic\tgrape\tmelon\tleak\tkiwi\t\n" +
                "mango\tmushroom\tnut\tolive\t\n" +
                "pea\tpeanut\tpear\tpepper\tpineapple\t\n" +
                "pumpkin\tpotato");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userWord = null;
        try {
            userWord = new String(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        StringBuilder stringBuilder = new StringBuilder();

        if (hiddenWord.equalsIgnoreCase(userWord)){
            System.out.println("Вірно, це - " + hiddenWord);
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (userWord.length()>0){
            char [] charsHiddenWord = hiddenWord.toLowerCase().toCharArray();
            char [] charsUserWord = userWord.toLowerCase().toCharArray();

            for(int i=0; i<15; i++){
                if(i<charsHiddenWord.length & i<charsUserWord.length){
                    if (charsHiddenWord[i]==charsUserWord[i]){
                        stringBuilder.append(charsHiddenWord[i]);
                    } else {
                        stringBuilder.append('#');
                    }
                } else {
                    stringBuilder.append("#");
                }
            }
            System.out.println("Не вірно. Угадані вами літери - " + stringBuilder.toString()+
                    "\nСпробуйте ще раз");
            toGuessWord(hiddenWord);
        } else {
            System.out.println("Ви нічого не ввели. Спробуйте ще раз.");
            toGuessWord(hiddenWord);
        }
    }
}
