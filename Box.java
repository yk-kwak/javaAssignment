import java.util.Scanner;

public class Box{
	public static void main(String args[]){
		double w;
		double h;
		double area;
		double perimeter;
		Scanner input = new Scanner(System.in); //Scanner 객체 선언
		System.out.print("밑변은? ");
		w = input.nextDouble();
		System.out.print("높이는? ");
		h = input.nextDouble();

		area = w * h;
		perimeter = 2 *(w+h);
		
		System.out.println("사각형의 넓이 : "+area);
		System.out.println("사각형의 둘레 : "+perimeter);
	}
}