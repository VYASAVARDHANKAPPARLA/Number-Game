package Internship;
import java.util.Scanner;
import java.util.Random;
public class task1nymbergame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random ob=new Random();
		String playagain;
		int totalscore = 0;
		System.out.println("wellcome to guessing game ");
		do {
			int targetno=ob.nextInt(100)+1;
			int attemp=0;
			int score=100;
			boolean guesscurrect=false;
			System.out.println("enter the no between 1 to 100");
			System.out.println("guess the number");
			while(!guesscurrect) {
				System.out.println("enter the guess");
				int guess=sc.nextInt();
				attemp++;
				if(guess<targetno) {
					System.out.println("Too low try again");
				}
				else if(guess>targetno) {
					System.out.println("Too High try again");
				}
				else {
					System.out.println("congragulations you guess the currect number ");
				}
				score -=10;
			}
			totalscore +=score;
			System.out.println("your score for this round is "+score);
			System.out.println("total score to find is "+totalscore);
			System.out.println("do you want to play again iam so happy ");
			playagain=sc.next().toLowerCase();
		}
		while(playagain.equals("yes")); {
			System.out.println("thank for playing your final score is :"+totalscore);
			
		}
		System.out.println("thank for playing the game your score is "+totalscore);
	}

}
