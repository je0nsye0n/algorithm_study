import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class problem5 {
    public static void main(String[] args) throws NumberFormatException, IOException { // 예외처리 해줘야함 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 받는거 
        int n = Integer.parseInt(br.readLine()); //문자열로만 받을 수 있어서 형변환
        
        LinkedList<Integer> queue = new LinkedList<Integer>();
        
        StringTokenizer st;
        
        int max = 0;
        int maxStudentNum = 0;
        int currentNum = 0;
        
        for(int i =0; i < n; i++) {
        
        	st = new StringTokenizer(br.readLine(), " ");
        	
        	switch (st.nextToken()){
        	
        	case "1" :
        		int studentNumber = Integer.parseInt(st.nextToken());
        		queue.add(studentNumber);
        		currentNum++;
        		
        		if(currentNum > max) {
        			max = currentNum;
        			maxStudentNum = studentNumber;
        		}else if(currentNum == max && maxStudentNum > studentNumber) {
        			maxStudentNum = studentNumber;
        		}
        		break;
        		
        	case "2":
        		queue.remove();
        		currentNum--;
        		break;
        	}
        }
        
        System.out.println(max + " " + maxStudentNum);
        
    }
}