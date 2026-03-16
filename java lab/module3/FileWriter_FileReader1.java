import java.io.*;

public class FileWriter_FileReader1 {
    public static void main(String [] arg) throws IOException{
        FileWriter fw=new FileWriter("Introduction.txt");
        fw.write("Name: Avjeet");
        fw.write("Id: 21240094");
        fw.close();
        FileWriter fw2=new FileWriter("College.txt");
        fw2.write(" College: Ucer");
        fw2.close();

        FileReader fr=new FileReader("Introduction.txt");
        FileWriter fw3=new FileWriter("Summary.txt");
        int name;
        while((name=fr.read())!=-1){
            fw3.write((char)name);

        }
        fr.close();
        FileReader fr2=new FileReader("College.txt");
        while((name=fr2.read())!=-1){
            fw3.write((char)name);
        }
        fr2.close();
        fw3.close();
        FileReader fr3=new FileReader("Summary.txt");
        int a;
        while((a=fr3.read())!=-1){
            System.out.print((char)a);
        }
        fr3.close();


        }
}
