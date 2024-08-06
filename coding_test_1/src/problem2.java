import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class problem2 {
    public static void main(String[] args) throws NumberFormatException, IOException { // 예외처리 해줘야함 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 받는거 
        int n = Integer.parseInt(br.readLine()); //문자열로만 받을 수 있어서 형변환
        Stack<Integer> stack = new Stack<>(); 
        
        StringTokenizer st;
        
        for(int i=0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	
        	switch(st.nextToken()) {
        	
        	case "push":
        		stack.push(Integer.parseInt(st.nextToken()));
        		break;
        		
        	case "pop":
        		if(!stack.empty())  System.out.println(stack.pop());
        		else System.out.println("-1");
        		break;
        		
        	case "size":
        		System.out.println(stack.size());
        		break;
        		
        	case "empty" :
        		if(!stack.empty()) System.out.println("0");
        		else System.out.println("1");
        		
        		break;

        	case "top" :
        		if(!stack.empty())System.out.println(stack.lastElement());	
        		else System.out.println("-1");
        		break;
        		
        	}
        	
        	 
        }
    }
}