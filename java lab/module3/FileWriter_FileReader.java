import java.io.*;
public class FileWriter_FileReader{
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("Intro.txt");
        fw.write("ID  , Name   , Address\n  ");
        fw.write("21240094   ,Avjeet   ,prayagraj\n");
        fw.close();

        //Read
        FileReader fr=new FileReader("Intro.txt");
        int name;
        while ((name=fr.read())!=-1) {
            System.out.print((char)name); 
        }
        fr.close();

    }
}