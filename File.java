
package javaapplication123;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class File {
   public static void writewithBayt(String fileName, String text) throws Exception {
       FileWriter f=new FileWriter(fileName);
       BufferedWriter b=new BufferedWriter(f);
       b.write(text);
       b.close();
   }
   public static void writewithAppend(String fileName, String text) throws Exception {
       FileWriter f=new FileWriter(fileName,true);
       BufferedWriter b=new BufferedWriter(f);
       b.write(text);
       b.close();
   }
   public static String readBayt(String fileName) throws Exception{
       InputStream is=new FileInputStream(fileName);
       InputStreamReader r=new InputStreamReader(is);
       BufferedReader b=new BufferedReader(r);
       String line=null;
       String result=" ";
       while((line=b.readLine())!= null){
           result+=line+"\n";
                  }
       return result;
   }
   public static void writeByte(String fileName, byte []text) throws Exception{
       FileOutputStream f=new FileOutputStream(fileName);
       f.write(text);
       f.flush();
       f.close();
   }
   
   public static byte[] readbyte(String fileName){
       FileInputStream f=null;
       byte []arr=new byte [(int)fileName.length()];
       try{
           f=new FileInputStream(fileName);
           f.read(arr);
           f.close();
           for (int i = 0; i <arr.length; i++) {
               System.out.print((char)arr[i]);
           }
       } catch (Exception ex){
           ex.printStackTrace();
       } return arr;
   }
   
   
   
   
}
