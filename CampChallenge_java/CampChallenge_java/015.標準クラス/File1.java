
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class File1 {
    public static void main(String[]args) throws IOException{
        File fp = new File("text.txt");
        FileWriter fw = new FileWriter(fp);
        fw.write("佐藤美穂です。26歳です。");
        fw.close();
    }
}
