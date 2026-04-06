public class SwitchCForJava8 {
    public static void main(String args[]){
        int day=3;
        String result=switch(day){
            case 1->"Monday";
            case 2->"Tuesday";
            case 3->"Wednesday";
            case 4->"Thusday";
            case 5->"Saturday";
            case 6->"Sunday";
            default ->"Invaild";

        };
        System.out.print(result);
    }
    
}
