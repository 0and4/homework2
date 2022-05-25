package hw2;
import java.util.Scanner;
abstract class Stack{
	abstract int length();
	abstract String pop();
	abstract boolean push(String ob);
}
class StringStack extends Stack {
	private String stack[];
	int size,top;
	StringStack(int size){
		this.size=size;
		stack=new String[this.size];
		top=this.size;
	}
	@Override
	int length() {
		return size; //스택의 크기(길이) 리턴
	}
	@Override
	String pop() {
		int tmp=top;
		top++;
		return stack[tmp]; //입력받은 값만큼의 크기인 스택을 리턴
	}
	@Override
	boolean push(String ob) {
		if(top>0) {
			stack[top-1]=ob;
			top--;
			return true; //문자열을 top에서부터 저장(push)
		}
		else
			return false;
	}
}
public class StackManager {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String val;
		StringStack stack=new StringStack(5);
		while(true) {
			System.out.print(">> ");
			for(int i=0;i<stack.length();i++) {
				val=sc.next();
				stack.push(val); //문자열을 5개 읽어 스택 객체 저장
			}
			int len=stack.length();
			if(len==0) {
				System.out.print("현재 스택에 저장된 문자열 없음");
			}
			else {
				for(int i=0;i<len;i++) {
					System.out.print(stack.pop()+" ");
				}
			}
			break;
		}
	}

}
