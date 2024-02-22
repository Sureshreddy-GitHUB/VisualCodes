import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		String str="(aa)";
		Stack<Character> s=new Stack<>();
		int i;
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='{'||ch=='('||ch=='[')
			{
				s.push(ch);
			}
			else if(!s.isEmpty())
			{
				if(ch=='}'&&s.pop()!='{')
				break;
				else if(ch==')'&&s.pop()!='(')
				break;
				else if(ch==']'&&s.pop()!='[')
				break;
			}
			else 
				break;
		}
		if(s.isEmpty()&&i==str.length())
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("Not valid");
		}
	}
}
//suresh reddy