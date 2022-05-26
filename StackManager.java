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
		this.stack=new String[size];
		this.top=-1;
	}
	@Override
	int length() {
		return size;
	}
	@Override
	String pop() {
		if(top==-1) {
			return null;
		}
		else {
			return stack[top--];
		}
	}
	@Override
	boolean push(String ob) {
		if(top==size-1) {
			return false;
		}
		else {
			stack[++top]=ob;
			return true;
		}
	}
}
public class StackManager {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		String val=sc.nextLine();
		String[] words=val.split(" ");
		int size=words.length;
		StringStack stack=new StringStack(size);
		while(true) {
			for(int i=0;i<size;i++) {
				stack.push(words[i]);
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
