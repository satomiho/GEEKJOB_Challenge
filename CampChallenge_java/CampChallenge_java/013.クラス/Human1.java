
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
abstract public class Human1 {
    public abstract int open();
    public abstract void setCard (ArrayList <Integer> set);
    public abstract boolean checkSum();
    ArrayList <Integer> myCard = new ArrayList<Integer>();
}

