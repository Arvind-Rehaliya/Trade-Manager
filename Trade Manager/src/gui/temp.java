
package gui;

import java.io.*;

public class temp {
     public static void main(String ... args) {
         File f = new File("C:\\Users\\Student\\Desktop\\ff");
         delete(f);
         System.out.println("done.");
          }
     private static String setBackSlash(String s) {
        char[] c;
        for(byte b=0; b<s.length(); b++) {
            if(s.charAt(b) == 92) {
                s += " "; c = s.toCharArray();
                for(int t = s.length()-1; t > b; t--) {
                    c[t] = c[t-1];
                }
                s = new String(c); ++b;
            }
        }
        return s;
    }
     private static void delete(File path) {
         File[] files = path.listFiles();
         for(File f: files) {
             if(f.isDirectory()) delete(f);
             else f.delete(); 
         } path.delete();
     }
     private String fuu(String s) { 
         String st = s.substring(0, s.length()-14);
         if(new File(st).exists()) System.out.println("Exists");
         return st;
     }
}
