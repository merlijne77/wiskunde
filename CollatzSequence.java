/**
 * 
 * Neem een willekeurig geheel getal n als beginwaarde en bereken een 
 * volgend getal door de regels:
 *
 *  als n even is, deel het door 2
 *  als n oneven is, vermenigvuldig het met 3 en tel er 1 bij op
 *
 * Het vermoeden is dat als men dit proces vaak genoeg herhaalt, men  
 * uiteindelijk bij het getal 1 uitkomt. Dit vermoeden is voor het eerst  
 * geformuleerd door Lothar Collatz in 1937. Tot op heden is het vermoeden nog 
 * niet bevestigd of weerlegd.
 *  
 * @author hdziedzic
 *
 */


package ProgrammingByDoing;

import java.util.Scanner;
 
public class CollatzSequence {
 
private static int stepsTaken;
private static int width;
private static int n;
private static int even=2;
 
    public static void main (String [] args){
        int largest = 0;
        String welcome = "In 1937, Lothar Collatz proposed that no matter\n"
                + "what number you begin with the sequence eventually reaches\n"
                + "1. This is widely believed to be true, but has never been\n"
                + "formally proved. Give me a number and i will show the outcome "
                + "of the principle";
        Scanner keyboard = new Scanner(System.in);
        System.out.println(welcome);
        n = keyboard.nextInt();
     
        while ( n != 1 ) {
            if (largest < n) {
                largest = n;
                }
             
            if (n % 2 == 0) {//als n even is voer uit
                even();
            }
            else {oneven();
            }
        }
         
        System.out.println("\nSteps taken to reach 1: " + stepsTaken);
        System.out.println("The largest number is: " + largest);
        keyboard.close();
         
    } 
        
    	private static void makingRows() {//methode om rijen van 10 te maken.
            if (width>9) {
                System.out.print("\n");
                width = 0;
        }
            }
        
        private static void even() {
        	System.out.print((n/=even) + "\t");//deelt n met outcome(2) tot het geen even nummer meer is
            stepsTaken++;
            width++;
            makingRows();
        }
       
        private static void oneven() {
    	   System.out.print((n = ( (n * 3 ) + 1)) + "\t");
           stepsTaken++;
           width++;
           makingRows();
       }
 }
        

//nog zorgen dat largest nummer nooit het input nummer is.