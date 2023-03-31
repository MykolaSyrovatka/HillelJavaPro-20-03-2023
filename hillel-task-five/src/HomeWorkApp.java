public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(inRange(7,2));
        isPositivePrint(-1);
        System.out.println(isPositiveBoolean(0));
        printN("Test", 5);
        System.out.println(isHigh(400));
    }

    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign(){
        int a = 3;
        int b = -3;
        System.out.println((a+b)>=0?"Сума позитивна":"Сума негативна");
    }

    public static void printColor(){
        int value = 0;
        if(value<=0){
            System.out.println("Червоний");
        } else if (value>0 && value<=100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    public static void compareNumbers(){
        int a = 3;
        int b = 4;
        System.out.println(a>=b?"a >= b":"a < b");
    }

    public static boolean inRange(int a, int b){
        return a+b>=10&&a+b<=20;
    }

    public static void isPositivePrint(int a){
        System.out.println(a>=0?"Число додатнє":"Число від’ємне");
    }

    public static boolean isPositiveBoolean(int a){
        return !(a>=0);
    }

    public static void printN(String str, int n){
       for (int i = 0; i<n; i++){
           System.out.println(str);
       }
    }

    public static boolean isHigh(int year){
        if (year%4==0 && !(year%100==0)){
            return true;
        } else if (year%400==0){
            return true;
        } else {
            return false;
        }
    }
}
