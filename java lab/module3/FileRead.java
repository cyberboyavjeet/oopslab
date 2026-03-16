import java.io.*;
public class FileRead {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("Introduction.txt");
        FileReader fr2=new FileReader("College.txt");
        FileReader fr3=new FileReader("Summary.txt");
        FileReader fr4=new FileReader("Intro.txt");
        int a;
        while((a=fr.read())!=-1){
            System.out.print((char)a);

        }
        fr.close();
        while((a=fr2.read())!=-1){
            System.out.print((char)a);
        }
        fr2.close();
        while((a=fr4.read())!=-1){
            System.out.print((char)a);
        }
        fr3.close();
        while((a=fr4.read())!=-1){
            System.out.print((char)a);
        }
        fr4.close();


        
    }
    
}
