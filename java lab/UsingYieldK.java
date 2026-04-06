public class UsingYieldK {
    public static void main(String[] args) {
        int day=2;
        String result=switch(day){
            case 1:{
                yield "Monday";
            }
            case 2:{
                yield "Tuesday";
            }
            case 3:{
                yield "Wednesday";
            }
            case 4:{
                yield "Thusday";
            }
            case 5: {
                yield "Friday";
            }
            case 6:{
                yield "Saturday";
            }
            default: {
                yield "Invalid choice!";
            }

        };
        System.out.println(result);
    }
    
}
