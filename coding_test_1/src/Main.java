import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class problem4 {
    public static void main(String[] args) throws NumberFormatException, IOException { // 예외처리 해줘야함 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 받는거 
        int n = Integer.parseInt(br.readLine()); //문자열로만 받을 수 있어서 형변환
        LinkedList<Integer> queue = new LinkedList<Integer>();
        
        StringBuilder output = new StringBuilder();
        
        StringTokenizer st;
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if (!queue.isEmpty()) output.append(queue.remove()).append("\n");
                    else output.append("-1\n");
                    break;

                case "size":
                    output.append(queue.size()).append("\n");
                    break;

                case "empty":
                    if (!queue.isEmpty()) output.append("0\n");
                    else output.append("1\n");
                    break;

                case "front":
                    if (!queue.isEmpty()) output.append(queue.peek()).append("\n");
                    else output.append("-1\n");
                    break;

                case "back":
                    if (!queue.isEmpty()) output.append(queue.peekLast()).append("\n");
                    else output.append("-1\n");
                    break;
            }
        }

        System.out.print(output.toString()); // Output everything at once
        	 
        
    }
}
