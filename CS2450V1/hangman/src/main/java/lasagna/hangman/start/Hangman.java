/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package lasagna.hangman.start;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.SwingUtilities;

/**
 *
 * @author nic
 */
public class Hangman 
{

    public static String fileMethod(int desire)throws Exception{
        File f = new File("highscores.txt");
        PrintWriter pw = new PrintWriter("highscores.txt");
        Scanner fileReader = new Scanner(f);
        
        
        
        pw.println(highScore1init+" "+highScore1);
        String one=" "+highScore1init+" "+highScore2;
        pw.println(highScore2init+" "+highScore2);
        String two=" "+highScore2init+" "+highScore2;
        pw.println(highScore3init+" "+highScore3);
        String three=" "+highScore3init+" "+highScore3;
        pw.println(highScore4init+" "+highScore4);
        String four=" "+highScore4init+" "+highScore4;
        pw.println(highScore5init+" "+highScore5);
        String five=" "+highScore5init+" "+highScore5;
       
        pw.close();
        String x =" ";
        if(desire==1){
             x = one;
        } else if(desire==2){
            x = two;
        } else if(desire==3){
            x=three;
        } else if(desire==4){
            x=four;
        } else if(desire==5){
            x=five;
        }
        
        return x;
    }
    public static int currentLowestScore;
public static int numberOfScores;
public static int highScore1;
public static int highScore2;
public static int highScore3;
public static int highScore4;
public static int highScore5; 
public static String highScore1init;
public static String highScore2init;
public static String highScore3init;
public static String highScore4init;
public static String highScore5init;
    
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
        menu ya = new menu();
        //game game = new game();
        //menu();
        ya.setVisible(true);
        //game.setVisible(true);
        //testing
        
    }

    
}

