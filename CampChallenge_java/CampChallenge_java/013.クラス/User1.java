
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class User1 extends Human1{
    
    @Override
    public int open() {
        int total = 0;
        for(int i=0;i<myCard.size();i++){
            total = total+myCard.get(i);
        }
        return total;
    }

    @Override
    public void setCard(ArrayList <Integer> set) {
        for (int i=0;i<set.size();i++){
            myCard.add(set.get(i));
        }
    }

    @Override
    public boolean checkSum() {
        if (open()<17){
            return true;
        }else{
            return false;
        }  
    }
}   