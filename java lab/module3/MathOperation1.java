
public class MathOperation1 {
    private static int add(int num1, int num2){
        return num1+num2;
    }
    private static double add(double num1,double num2){
        return num1+num2;
    }
    private static  int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static void main(String[] args) {
        System.out.println("Additon of Two Integers: "+add(2,4));
        System.out.println("Additon of Two Doulbe: "+add(2.0,4.9));
        System.out.println("Additon of Three Integers: "+add(2,4,9));
    }

}
