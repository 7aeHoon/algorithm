class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();

        // 최소한으로 필요한 문자열의 길이
        int minLength = t * m;

        // n진법으로 변환할 정수(0부터 시작)
        int number = 0;

        StringBuilder sb = new StringBuilder();

        // 현재까지 문자열의 길이 < 목표치의 문자열 길이
        while (sb.length() < minLength) {
            // 특정 숫자를 n진법으로 변환한 문자열
            String str = Integer.toString(number++, n);
            // 문자열 붙이기
            sb.append(str.toUpperCase());
        }

        // 전체 문자열에서 t개만 추출하기
        for (int i = 0; i < t; i++) {
            int index = (p - 1) + (m * i);
            answer.append(sb.charAt(index));
        }

        return answer.toString();
    }
}
