/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeeyescount;

/**
 *
 * @author andreadewong
 */
public class SnakeEyesCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int die1, die2;
        dieloop: while (true){
            die1 = (int)(Math.random()*6)+1; //choose random die value
            die2 = (int)(Math.random()*6)+1;
            System.out.println(die1 + " "+die2); //print dice
            if (die1==1 && die2==1){
                System.out.println("Snake Eyes!!!");
                break dieloop;
            }
            else{
                System.out.println("Not snake eyes :(");
            }
        }
    }
    
}
