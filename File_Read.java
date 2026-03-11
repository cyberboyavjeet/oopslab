import java.io.*;
import java.util.*;
public class File_Read{
    public static void main(String[] args) {
        String data=null;
        try {
            File myfile=new File("javabatch.txt");
            Scanner sc=new Scanner(myfile);
            while(sc.hasNextLine()){
                
                data=sc.nextLine();
            }
            System.out.println(data);
            int vol=0,con=0,sp=0,wd=0;
            for(int i=0;i<data.length();++i){
            if(data.charAt(i)=='a'|| data.charAt(i)=='e' || data.charAt(i)=='i' ||data.charAt(i)=='o'||  data.charAt(i)=='u'){

                vol +=1;}
            else con +=1;
            if(data.charAt(i)==' '){
                sp +=1;
            }
            
            }
            System.out.println("Vowel: "+vol);
            System.out.println("Consonants: "+con);
            System.out.println("Space: "+sp);
            System.out.println("Words: "+(sp+1));
        } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            
        }
    }
}