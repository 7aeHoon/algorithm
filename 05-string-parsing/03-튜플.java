import java.util.*;

class Solution {
    public int[] solution(String s) {

        // 맵
        HashMap<Integer, Integer> map = new HashMap<>();

        String[] nums = s.replaceAll("[{}]", "")
                .split(",");

        for (String num : nums) {
            int value = Integer.parseInt(num);
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        // 키를 뽑아서 리스트에 담기
        List<Integer> list = new ArrayList<>(map.keySet());

        // 키의 값 내림차순을 기준으로 키를 정렬
        list.sort((k1, k2) -> {
            return Integer.compare(map.get(k2), map.get(k1));
        });

        return list.stream()
                .mapToInt(k -> k)
                .toArray();
    }
}
