package Assignment;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        File f1=new File("C:\\Users\\cse20-018\\Desktop\\MrJomo\\src\\Assignment\\words.txt"); //Creation of File Descriptor for input file
        String[] words=null;    //Initialize the word Array
        int wc=0;     // Initialize word count to zero
        FileReader fr = new FileReader(f1);    //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr);    //Creation of BufferedReader object
        String s;
        while((s=br.readLine())!=null)    //Reading Content from the file
        {
            words=s.split(" ");   //Split the word using space
            wc=wc+words.length;   //increase the word count for each word
        }
        fr.close();
        System.out.println("There are " + wc + " words in this file");    //Print the word count
    }
}
