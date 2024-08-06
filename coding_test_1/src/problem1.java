import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class problem1 {
    public static void main(String[] args) throws NumberFormatException, IOException { // 예외처리 해줘야함 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 받는거 
        int n = Integer.parseInt(br.readLine()); //문자열로만 받을 수 있어서 형변환
        generateSequences(n); //재귀
    }

    public static void generateSequences(int n) {
        Stack<Integer> stack = new Stack<>(); // 스택 만들기
        StringBuilder result = new StringBuilder(); // 모든 결과를 저장할 StringBuilder
        backtrack(n, 1, stack, new StringBuilder(), 0, result); //여기서 new StringBuilder은 한 재귀당 생길 수열
        System.out.print(result); // 한 번에 출력
    }

    private static void backtrack(int n, int pushIndex, Stack<Integer> stack, StringBuilder sequence, int length, StringBuilder result) { 
        if (length == n) { //길이가 같으면 
            result.append(sequence.toString().trim()).append("\n"); // 각 수열을 결과에 추가 trim으로 양옆 공백제거 
            return;
        }
        
        // Pop: 스택에서 숫자를 꺼낼 수 있을 때
        if (!stack.isEmpty()) {
            int popped = stack.pop();
            int prevLength = sequence.length(); //빼지 않은 상태에서의 수열을 만들기 위해서 
            sequence.append(popped).append(" "); // 수열 생성
            backtrack(n, pushIndex, stack, sequence, length + 1, result); // 뺸상태로 수열 
            sequence.setLength(prevLength); // 상태 복구 
            stack.push(popped); // 스택에 다시 넣기 
        }
        
        // Push: 스택에 다음 숫자를 넣을 수 있을 때
        if (pushIndex <= n) { 
            stack.push(pushIndex); // 스택에 수 넣기 
            backtrack(n, pushIndex + 1, stack, sequence, length, result); // 넣은거로 재귀
            stack.pop(); // 상태 복구
        }
    }
}