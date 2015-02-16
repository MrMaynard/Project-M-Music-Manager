package pmm;

import java.io.BufferedReader;
import java.io.FileReader;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
import javax.swing.JOptionPane;

/*    */
/*    */ public class Nerd /*    */ {
    /*    */ public void write(String fileName, String s) /*    */ {
        /*    */ try /*    */ {

            //Method outside of JAR:
/* 20 */ PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            /* 21 */ writer.print(s);
            /* 22 */ writer.close();

        } catch (Exception e) {
            /* 23 */ JOptionPane.showMessageDialog(null, "Error, text file not found");
            /*    */        }
        /*    */    }
    /*    */

    /*    */
    /*    */ static String readFile(String path)
            /*    */ throws IOException /*    */ {
        String everything = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        }
        return everything;
    }
    /*    */ }
