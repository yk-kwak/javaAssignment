import java.util.Scanner;

public class Box{
	public static void main(String args[]){
		double w;
		double h;
		double area;
		double perimeter;
		Scanner input = new Scanner(System.in); //Scanner ��ü ����
		System.out.print("�غ���? ");
		w = input.nextDouble();
		System.out.print("���̴�? ");
		h = input.nextDouble();

		area = w * h;
		perimeter = 2 *(w+h);
		
		System.out.println("�簢���� ���� : "+area);
		System.out.println("�簢���� �ѷ� : "+perimeter);
	}
}