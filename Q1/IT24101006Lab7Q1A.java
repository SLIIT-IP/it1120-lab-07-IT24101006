import java.util.Scanner;

public class IT24101006Lab7Q1A {

    public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int subject1, subject2, subject3, subject4;
	System.out.print("Enter subject Mark 1: ");
	subject1 = input.nextInt();

	System.out.print("Enter subject Mark 2: ");
	subject2 = input.nextInt();

	System.out.print("Enter subject Mark 3: ");
	subject3 = input.nextInt();

	System.out.print("Enter subject Mark 4: ");
	subject4 = input.nextInt();
	
	double average=(subject1 + subject2 + subject3 +subject4)/4.0;

	String grade;
	if (average>=75&&average<=100){
	grade="Distinction";

	}else if(average>=50&&average<75){
	grade="Credit";
	
	}else{
	grade="Fail";
	}
	
	System.out.printf("The average mark is:"+ average);
	System.out.printf("The overall grade is:"+ grade);
 }
}






 