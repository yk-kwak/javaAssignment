/*
	������ 2018111380
	���� �Է¹޾Ƽ� ���Ÿ���ο��ڹ� ����� ���α׷��Դϴ�.
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputLuxury{
	public static void main(String args[]){
		
		String str1;
		int num1=0;
		Scanner in = new Scanner(System.in);

		System.out.print("���ι��ڴ�? (���� 1���� �Է��� �ּ���. 1�� �̻� �Է��ϴ��� �� ó�� ���� 1���� ���˴ϴ�.) :");
		str1 = in.nextLine();				//���� ���ڸ� ������ �ܼ��� char�� �ϴ°Ŷ�� �����ߴµ�,
							//API�� Ȯ���غ��� returnŸ���� char�� �������� ����.
							//�׷��� String���� �����ϴ� Ÿ���� ����غ��ڰ� �����߰�
							//nextInt()�� �����ϰ� ����.. next�� ���� ����̰� ����Ÿ���� String�� nextLine()�� ����ߴ�.
		char ch1 = str1.charAt(0);			//�� ���� ���ڸ��� �ޱ� ���ؼ� �������� ���ڸ� �Է��ϴ��� �� ���� ���� ���ؼ� charAt()�� ���
							//�׷��� charAt()�� ����ϴ� ����� ��ȣ �ȿ� ���° ���ڸ� ������ ���ڸ� �Է��ϸ� �ȴ�.
							//()��ȣ �ȿ� �Է��ϴ� ����, �迭�� ����. �� ù��° ������ �ε����� 0	
		while(true){
			try{	
							//���̸� �Է��� �� ������ �ƴ� ���� �Է��ϸ� �ٽ� �Է�
				System.out.print("���� ���̴�? ");		
				num1 = in.nextInt();	//���� ���̴� �����̴� nextInt()�� ����ߴ�.
				if(num1<1){		//���� ���̸� 1�̸����� �Է������� if���� �ɸ�
					System.out.println("���� ���̸� 1 �̸����� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.\n");
					continue;
				}

				printCharacter(ch1,num1);
				System.out.println("Hello, Java!");
				printCharacter(ch1,num1);

				break;				//����� ��� �� ��� ����
			}catch(InputMismatchException e){
				System.out.println("InputMismatchException(int ���� ���� ������ �Է��� �ּ���.)");
				in.nextLine();
				System.out.println();
			}
		}
		
	}

	static void printCharacter(char ch, int num){
		for(int i=0; i<num; i++) System.out.print(ch);
		System.out.println();
	}
}