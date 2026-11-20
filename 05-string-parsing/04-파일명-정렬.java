import java.util.*;

class Solution {
        public static class File {
        String original;
        String head;
        int number;

        public File(String original, String head, int number) {
            this.original = original;
            this.head = head;
            this.number = number;
        }
    }

    public String[] solution(String[] files) {

        // 파일을 저장할 리스트
        ArrayList<File> list = new ArrayList<>();

        // 파일 파싱
        for (String file : files) {
            int startIndex = 0;
            int endIndex = 0;

            // HEAD는 숫자가 등장하지 않는다.
            // 따라서 숫자가 나오기 전까지를 구한다.
            while (endIndex < file.length() && !Character.isDigit(file.charAt(endIndex))) {
                endIndex++;
            }

            // HEAD 부분
            String head = file.substring(startIndex, endIndex)
                    .toLowerCase();

            startIndex = endIndex;

            while (endIndex < file.length() && Character.isDigit(file.charAt(endIndex)) && endIndex - startIndex < 5) {
                endIndex++;
            }

            // NUMBER 부분
            int number = Integer.valueOf(file.substring(startIndex, endIndex));

            // 리스트에 저장
            list.add(new File(file, head, number));
        }

        // 특정 기준으로 정렬하기
        // HEAD는 사전순으로, NUMBER는 오름차순으로
        list.sort(Comparator.comparing((File a) -> a.head).thenComparingInt(a -> a.number));

        return list.stream()
                .map(file -> file.original)
                .toArray(String[]::new);

    }
}
