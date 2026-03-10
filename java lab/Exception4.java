//Number formate error
public class Exception4 {
    static void main(String[] arg)
    {
        String str= "Abc";
        try{
        int num=Integer.parseInt(str);
        System.out.println("NUM= "+num);}
        catch(NumberFormatException ex){
            System.out.println("Error= "+ex.getMessage());

        }
        System.out.println("End of program");
    }
    
}
