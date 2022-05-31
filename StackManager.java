package hw2;
import java.util.Scanner;
abstract class Stack{
	abstract int length();
	abstract String pop();
	abstract boolean push(String ob);
}
class StringStack extends Stack {
	String stack[];
	int size,top;
	StringStack(int size){
		this.size=size;
		this.stack=new String[size];
		this.top=0;
	}
	@Override
	int length() {
		int len = 0;
		for(int i=0;i<size;i++) {
			if (stack[i]!=null) {
				len++;
			}
		}
		return len;
	}
	@Override
	String pop() {
		if(top<0) {
			return null;
		}
		else {
			top--;
			return stack[top];
		}
	}
	@Override
	boolean push(String ob) {
		if(top>=size) {
			return false;
		}
		else {
			stack[top++]=ob;
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
		for(int i=0;i<size;i++) {
			stack.push(words[i]);
		}
		int len=stack.length();
		if(len==0) { System.out.print("현재 스택에 저장된 문자열 없음"); }
		else {
			for(int i=0;i<len;i++) {
				System.out.print(stack.pop()+" ");
			}
		}
	}
}