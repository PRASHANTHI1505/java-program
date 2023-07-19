
import java.util.Scanner;
class StudentGrade
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Six Subject Marks :");
		int tel = input.nextInt();
		int hindi = input.nextInt();
		int eng = input.nextInt();
		int mat = input.nextInt();
		int sci= input.nextInt();
    int soc=input.nextInt();
		int total = tel+hindi+eng+mat+sci+soc;
		float percentage = total/6;
		System.out.println("Total :"+total);
		System.out.println("Percentage :"+percentage);	
		if(percentage>=90)
			System.out.println("Grade A");
		else if(percentage>=80)
			System.out.println("Grade B");
		else if(percentage>=70)
			System.out.println("Grade C");
		else if(percentage>=60)
			System.out.println("Grade D");
		else if(percentage>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
}