
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
public class Dealer1 extends Human1{
    ArrayList <Integer> cards = new ArrayList<Integer>();
    public Dealer1(){
        for(int i=1;i<=13;i++){
            for(int j=1;j<=4;j++){
                if(i>10){
                    cards.add(10);
                }else{
                    cards.add(i);
                }
            }
        }
    }
   
    Random rand = new Random();
    public ArrayList <Integer>deal(){
//        配列の作成
        ArrayList <Integer> dealCard = new ArrayList();
        
        for(int i=1;i<=2;i++){
            Integer index = rand.nextInt(cards.size());
            dealCard.add(cards.get(index));
//            質問：cards.getは必要か？deal Card.add(index);ではだめ？
//            回答：必要。nextIntでは要素の中から1枚取得するカードを指定しただけなので、まだgetしていない。  
            cards.remove(index);
        }
        return dealCard;
    }
    public ArrayList <Integer> hit(){
        ArrayList <Integer> hitCard = new ArrayList();
        Integer index = rand.nextInt(cards.size());
        Integer num = cards.get(index);
        cards.remove(index);
        hitCard.add(num);
        return hitCard;
    }
    @Override
    public int open() {
        int total = 0;
        for(int i=0;i<myCard.size();i++){
            total = total+myCard.get(i);
        }
        return total;
    }
//    openはmyCardを合計する

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
//    
}