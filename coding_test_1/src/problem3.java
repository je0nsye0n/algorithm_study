import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class problem3 {
    public static void main(String[] args) throws NumberFormatException, IOException { // 예외처리 해줘야함 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 받는거 
        int n = Integer.parseInt(br.readLine()); //문자열로만 받을 수 있어서 형변환
        Queue<Integer> queue = new LinkedList<Integer>();
        
        StringTokenizer st;
        
        for(int i=0; i < n; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	
        	switch(st.nextToken()) {
        	
        	case "push":
        		queue.offer(Integer.parseInt(st.nextToken()));
        		break;
        		
        	case "pop":
        		if(!queue.isEmpty())  System.out.println(queue.poll());
        		else System.out.println("-1");
        		break;
        		
        	case "size":
        		System.out.println(queue.size());
        		break;
        		
        	case "empty" :
        		if(!queue.isEmpty()) System.out.println("0");
        		else System.out.println("1");
        		
        		break;

        	case "front" :
        		if(!queue.isEmpty())System.out.println(queue.peek());	
        		else System.out.println("-1");
        		break;
        		
        	case "back" :
        		if(!queue.isEmpty())System.out.println(((LinkedList<Integer>) queue).getLast());	
        		else System.out.println("-1");
        	}
        	
        	 
        }
    }
}