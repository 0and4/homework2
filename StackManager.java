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
		return size; //������ ũ��(����) ����
	}
	@Override
	String pop() {
		int tmp=top;
		top++;
		return stack[tmp]; //�Է¹��� ����ŭ�� ũ���� ������ ����
	}
	@Override
	boolean push(String ob) {
		if(top>0) {
			stack[top-1]=ob;
			top--;
			return true; //���ڿ��� top�������� ����(push)
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
				stack.push(val); //���ڿ��� 5�� �о� ���� ��ü ����
			}
			int len=stack.length();
			if(len==0) {
				System.out.print("���� ���ÿ� ����� ���ڿ� ����");
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
