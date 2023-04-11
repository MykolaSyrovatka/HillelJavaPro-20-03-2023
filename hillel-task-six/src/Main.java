public class Main {

    public static void main(String[] args) {
        String str = "qCwcerfdcvc";
        System.out.println(findSymbolOccurance(str, 'C'));
        methodOne();

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



    void findWordPosition(){

    }

    void stringReverse(){

    }

    void isPalindrome(){
        
    }

    static void methodOne(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" ,
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        String str = words[(int)(Math.random()*words.length)];

        System.out.println(str);

    }


}
