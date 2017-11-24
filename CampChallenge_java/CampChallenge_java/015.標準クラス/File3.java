import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
*
* @author 美穂
*/
public class File3 {
    public static void main(String[]args) throws IOException{

        File fl=new File("log.txt");
        FileWriter fw=new FileWriter(fl);
        FileReader fr=new FileReader(fl);
        BufferedReader br=new BufferedReader(fr);

        Date start = new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        fw.write(sdf.format(start)+"開始");

        LinkedList<String>array=new LinkedList<String>();

        array.offer("唐揚げ定食");
        array.offer("焼肉定食");
        array.offer("ホイコーロー定食");
        array.offer("サバの味噌煮定食");

        System.out.println(array);


        Date end = new Date();
        fw.write(sdf.format(end)+"終了");
        fw.close();

        System.out.print(br.readLine());
        
        }
}



