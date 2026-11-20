package programmers;

public class P68646 {

    public static void main(String[] args) {

    }

    public int solution(int[] a) {
        int answer = 0;
        // 배열 사이즈
        int size = a.length;

        // 인덱스 기준 왼쪽 최소값 저장
        int[] leftMin = new int[size];
        // 인덱스 기준 오른쪽 최소값 저장
        int[] rightMin = new int[size];

        int min = Integer.MAX_VALUE;

        // 왼쪽 최소값 탐색
        for (int i = 0; i < size; i++) {
            min = Math.min(a[i], min);
            leftMin[i] = min;
        }

        // 최소값 초기화
        min = Integer.MAX_VALUE;

        // 오른쪽 최소값 탐색
        for (int i = size - 1; 0 <= i; i--) {
            min = Math.min(a[i], min);
            rightMin[i] = min;
        }

        // 전체 순회
        for (int i = 0; i < size; i++) {
            if (leftMin[i] < a[i] && rightMin[i] < a[i]) {
                continue;
            }
            answer++;
        }

        return answer;
    }
}
