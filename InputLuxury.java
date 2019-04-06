/*
	곽연경 2018111380
	문자 입력받아서 럭셔리헬로우자바 만들기 프로그램입니다.
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputLuxury{
	public static void main(String args[]){
		
		String str1;
		int num1=0;
		Scanner in = new Scanner(System.in);

		System.out.print("라인문자는? (문자 1개만 입력해 주세요. 1개 이상 입력하더라도 맨 처음 문자 1개만 사용됩니다.) :");
		str1 = in.nextLine();				//라인 문자를 받을때 단순히 char로 하는거라고 생각했는데,
							//API를 확인해보니 return타입이 char은 없었던것 같다.
							//그래서 String으로 리턴하는 타입을 사용해보자고 생각했고
							//nextInt()와 유사하게 생긴.. next가 들어가는 모양이고 리턴타입이 String인 nextLine()을 사용했다.
		char ch1 = str1.charAt(0);			//한 개의 문자만을 받기 위해서 여러개의 문자를 입력하더라도 한 개만 고르기 위해서 charAt()를 사용
							//그런데 charAt()을 사용하는 방법은 괄호 안에 몇번째 글자를 고를건지 숫자를 입력하면 된다.
							//()괄호 안에 입력하는 수는, 배열과 같다. 맨 첫번째 글자의 인덱스는 0	
		while(true){
			try{	
							//길이를 입력할 때 정수가 아닌 것을 입력하면 다시 입력
				System.out.print("문자 길이는? ");		
				num1 = in.nextInt();	//문자 길이는 정수이니 nextInt()를 사용했다.
				if(num1<1){		//문자 길이를 1미만으로 입력했을때 if에서 걸림
					System.out.println("문자 길이를 1 미만으로 입력하셨습니다. 다시 입력해 주세요.\n");
					continue;
				}

				printCharacter(ch1,num1);
				System.out.println("Hello, Java!");
				printCharacter(ch1,num1);

				break;				//제대로 출력 된 경우 종료
			}catch(InputMismatchException e){
				System.out.println("InputMismatchException(int 범위 내의 정수를 입력해 주세요.)");
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