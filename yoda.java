import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class yoda {
public static void main (String[]args){
	System.out.println("diga algo");
	Scanner scan = new Scanner(System.in);
	String dicho = scan.nextLine(); 
	
	
	////////////
	Stack<String> unStack = new Stack<>();
	StringTokenizer tk = new StringTokenizer(dicho);
	
	while (tk.hasMoreTokens()){
		unStack.push(tk.nextToken());
	}
	//////////////
	
	System.out.println('"' +dicho + '"'+"\n\n" +" no, no!  el maestro diria : \n\"" + "\n****************");
	
		while (!unStack.isEmpty()){
			System.out.print(unStack.pop());
			System.out.print(" ");
			}
		System.out.println('"');
		}
	///////////

}