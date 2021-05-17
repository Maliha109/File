
package javaapplication123;

public class JavaApplication123 {

    public static void main(String[] args) throws Exception {
       /* File.writewithBayt("text.txt", "Hello");
        File.writewithAppend("text.txt", "Salam");
        String s=File.readBayt("text.txt");
        System.out.println(s); 
               */
        
        String s="Hello world";
        byte [] text= s.getBytes();
        File.writeByte("t.txt", text);
        
        byte []arr=File.readbyte("t.txt");
        System.out.println(new String(arr));
    }
    
}
