# 코딩테스트 알고리즘 문제집

> C++ 기준 · 프로그래머스 / SWEA / 코드트리 / LeetCode

## 목차

- [01. 배열·해시](#topic-01) — 6문제
- [02. 정렬·비교 함수·구간](#topic-02) — 5문제
- [03. 스택·큐·단조 스택](#topic-03) — 5문제
- [04. 힙·우선순위 큐·정렬된 집합](#topic-04) — 6문제
- [05. 문자열·파싱](#topic-05) — 8문제
- [06. 누적 합·차분 배열·누적 전처리](#topic-06) — 6문제
- [07. 투 포인터·슬라이딩 윈도](#topic-07) — 6문제
- [08. 구현·시뮬레이션](#topic-08) — 10문제
- [09. 순열](#topic-09) — 5문제
- [10. 조합](#topic-10) — 5문제
- [11. 완전탐색](#topic-11) — 5문제
- [12. 깊이 우선 탐색 — DFS](#topic-12) — 6문제
- [13. 너비 우선 탐색 — BFS·상태 공간](#topic-13) — 8문제
- [14. 백트래킹](#topic-14) — 6문제
- [15. 비트마스킹](#topic-15) — 5문제
- [16. 그리디](#topic-16) — 5문제
- [17. 라인 스위핑](#topic-17) — 5문제
- [18. 이분 탐색·매개변수 탐색](#topic-18) — 5문제
- [19. 동적 계획법 — DP](#topic-19) — 8문제
- [20. 최장 증가 부분 수열 — LIS](#topic-20) — 5문제
- [21. 최장 공통 부분 수열 — LCS](#topic-21) — 5문제
- [22. 다익스트라](#topic-22) — 5문제
- [23. 플로이드–워셜·전이적 폐쇄](#topic-23) — 5문제
- [24. 벨만–포드](#topic-24) — 5문제
- [25. 유니온 파인드](#topic-25) — 5문제
- [26. 최소 신장 트리 — MST](#topic-26) — 5문제
- [27. 위상 정렬](#topic-27) — 5문제
- [28. 트리·트리 DP](#topic-28) — 5문제
- [29. 펜윅 트리 — Fenwick Tree](#topic-29) — 5문제
- [B. SWEA 종합 구현·탐색](#swea-practice) — 10문제
- [C. 코드트리 기출 기반 실전](#codetree-practice) — 25문제
- [교차 복습 목록](#cross-review)
- [풀이 기록 양식](#study-log)

## A. 알고리즘별 복습

<a id="topic-01"></a>

### 01. 배열·해시 · 6문제

학습 목표: 빈도 집계, 중복 제거, 키 설계와 평균 조회 복잡도를 설명한다.

- [x] **001 · 개념** [LC 1. Two Sum](https://leetcode.com/problems/two-sum/) — 합이 목표값이 되는 두 원소의 인덱스를 찾는다.
- [x] **002 · 개념** [LC 217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) — 배열에 중복 값이 존재하는지 판별한다.
- [x] **003 · 기본** [PG 42576. 완주하지 못한 선수](https://school.programmers.co.kr/learn/courses/30/lessons/42576) — 중복 이름을 포함한 빈도 집계를 연습한다.
- [x] **004 · 기본** [PG 42577. 전화번호 목록](https://school.programmers.co.kr/learn/courses/30/lessons/42577) — 접두사 관계를 검사한다.
- [x] **005 · 응용** [PG 42578. 의상](https://school.programmers.co.kr/learn/courses/30/lessons/42578) — 종류별 집계와 경우의 수를 결합한다.
- [x] **006 · 응용** [PG 92334. 신고 결과 받기](https://school.programmers.co.kr/learn/courses/30/lessons/92334) — 중복 신고 제거와 사용자별 상태를 관리한다.
#### 풀이 기록

| 문제 | 막혔던 점 · 배운 점 |
|---|---|
| 전화번호 목록 | 사전순 정렬하면 접두사가 같은 번호가 모이므로 인접한 번호만 비교하면 된다. |
| 신고 결과 받기 | 중복 신고를 제거한 경우에만 횟수를 증가시켜야 한다. 신고당한 사람을 기준으로 신고자 집합을 저장하면 별도 카운트가 필요 없다. |

<a id="topic-02"></a>

### 02. 정렬·비교 함수·구간 · 5문제

학습 목표: 사용자 정의 비교 기준을 설계하고 정렬로 탐색과 구간 처리를 단순화한다.

- [x] **007 · 개념** [LC 912. Sort an Array](https://leetcode.com/problems/sort-an-array/) — 배열을 정렬한다. 병합 정렬을 직접 구현한다.
- [x] **008 · 기본** [PG 42748. K번째수](https://school.programmers.co.kr/learn/courses/30/lessons/42748) — 구간을 추출하고 정렬한다.
- [x] **009 · 응용** [PG 42747. H-Index](https://school.programmers.co.kr/learn/courses/30/lessons/42747) — 정렬한 배열에서 조건을 만족하는 경계를 찾는다.
- [x] **010 · 응용** [PG 42746. 가장 큰 수](https://school.programmers.co.kr/learn/courses/30/lessons/42746) — 문자열 결합 결과를 기준으로 비교한다.
- [x] **011 · 개념** [LC 56. Merge Intervals](https://leetcode.com/problems/merge-intervals/) — 겹치는 구간을 합친다.

<a id="topic-03"></a>

### 03. 스택·큐·단조 스택 · 5문제

학습 목표: 처리 순서와 미해결 원소를 관리하고 단조 스택의 불변식을 설명한다.

- [ ] **012 · 기본** [PG 12909. 올바른 괄호](https://school.programmers.co.kr/learn/courses/30/lessons/12909) — 괄호의 유효성을 검사한다.
- [ ] **013 · 응용** [PG 42586. 기능개발](https://school.programmers.co.kr/learn/courses/30/lessons/42586) — 배포 순서와 묶음을 관리한다.
- [ ] **014 · 응용** [PG 42583. 다리를 지나는 트럭](https://school.programmers.co.kr/learn/courses/30/lessons/42583) — 큐와 시간 흐름을 구현한다.
- [ ] **015 · 개념** [LC 739. Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) — 각 날짜에서 더 따뜻한 날까지 기다릴 일수를 구한다.
- [ ] **016 · 응용** [PG 42584. 주식가격](https://school.programmers.co.kr/learn/courses/30/lessons/42584) — 단조 스택으로 가격 하락 시점을 처리한다.

<a id="topic-04"></a>

### 04. 힙·우선순위 큐·정렬된 집합 · 6문제

학습 목표: 최솟값·최댓값 추출, 상위 K개 유지, 양끝 삭제에 맞는 자료구조를 고른다.

- [ ] **017 · 개념** [LC 1046. Last Stone Weight](https://leetcode.com/problems/last-stone-weight/) — 가장 무거운 두 돌을 반복해서 꺼내 처리한다.
- [ ] **018 · 개념** [LC 215. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) — 배열의 K번째 큰 값을 크기 K의 힙으로 찾는다.
- [ ] **019 · 기본** [PG 42626. 더 맵게](https://school.programmers.co.kr/learn/courses/30/lessons/42626) — 최솟값 두 개를 반복해서 결합한다.
- [ ] **020 · 응용** [PG 42628. 이중우선순위큐](https://school.programmers.co.kr/learn/courses/30/lessons/42628) — multiset으로 최소·최대 삭제를 구현한다.
- [ ] **021 · 응용** [PG 42627. 디스크 컨트롤러](https://school.programmers.co.kr/learn/courses/30/lessons/42627) — 도착 시간과 작업 선택을 분리한다.
- [ ] **022 · 응용** [PG 12927. 야근 지수](https://school.programmers.co.kr/learn/courses/30/lessons/12927) — 가장 큰 작업량을 줄이는 선택을 구현한다.

<a id="topic-05"></a>

### 05. 문자열·파싱 · 8문제

학습 목표: 토큰화, 정규화, 진법·시간 변환과 여러 문자열 규칙을 구현한다.

- [ ] **023 · 기본** [PG 81301. 숫자 문자열과 영단어](https://school.programmers.co.kr/learn/courses/30/lessons/81301) — 문자열을 스캔하며 토큰을 판별한다.
- [ ] **024 · 기본** [PG 72410. 신규 아이디 추천](https://school.programmers.co.kr/learn/courses/30/lessons/72410) — 명세의 규칙을 순서대로 적용한다.
- [ ] **025 · 응용** [PG 64065. 튜플](https://school.programmers.co.kr/learn/courses/30/lessons/64065) — 중첩된 표현을 파싱하고 집합을 처리한다.
- [ ] **026 · 응용** [PG 17686. 파일명 정렬](https://school.programmers.co.kr/learn/courses/30/lessons/17686) — 문자와 숫자를 분해하고 정렬한다.
- [ ] **027 · 응용** [PG 17677. 뉴스 클러스터링](https://school.programmers.co.kr/learn/courses/30/lessons/17677) — 문자열 전처리와 다중집합을 구현한다.
- [ ] **028 · 응용** [PG 17683. 방금그곡](https://school.programmers.co.kr/learn/courses/30/lessons/17683) — 시간과 음표 표현을 정규화한다.
- [ ] **029 · 응용** [PG 17687. N진수 게임](https://school.programmers.co.kr/learn/courses/30/lessons/17687) — 진법 변환과 출력 순서를 구현한다.
- [ ] **030 · 응용** [PG 60058. 괄호 변환](https://school.programmers.co.kr/learn/courses/30/lessons/60058) — 규칙에 따라 문자열을 분할하고 변환한다.

<a id="topic-06"></a>

### 06. 누적 합·차분 배열·누적 전처리 · 6문제

학습 목표: 구간 조회와 구간 갱신을 구분하고 1·2차원 누적 배열을 만든다.

- [ ] **031 · 개념** [LC 303. Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/) — 변하지 않는 배열의 여러 구간 합을 구한다.
- [ ] **032 · 개념** [LC 304. Range Sum Query 2D - Immutable](https://leetcode.com/problems/range-sum-query-2d-immutable/) — 행렬의 직사각형 구간 합을 구한다.
- [ ] **033 · 개념** [LC 1109. Corporate Flight Bookings](https://leetcode.com/problems/corporate-flight-bookings/) — 여러 구간에 값을 더한 최종 배열을 구한다.
- [ ] **034 · 응용** [PG 68646. 풍선 터트리기](https://school.programmers.co.kr/learn/courses/30/lessons/68646) — 접두·접미 최솟값을 전처리한다.
- [ ] **035 · 도전** [PG 72414. 광고 삽입](https://school.programmers.co.kr/learn/courses/30/lessons/72414) — 시간 구간을 집계하고 누적 합을 적용한다.
- [ ] **036 · 도전** [PG 92344. 파괴되지 않은 건물](https://school.programmers.co.kr/learn/courses/30/lessons/92344) — 2차원 차분 배열로 구간 갱신을 처리한다.

<a id="topic-07"></a>

### 07. 투 포인터·슬라이딩 윈도 · 6문제

학습 목표: 포인터 이동의 근거와 구간 내 상태를 유지하는 방법을 설명한다.

- [ ] **037 · 개념** [LC 167. Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) — 정렬된 배열에서 합이 목표값인 두 수를 찾는다.
- [ ] **038 · 개념** [LC 209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) — 양수 배열에서 합이 기준 이상인 가장 짧은 연속 구간을 찾는다.
- [ ] **039 · 개념** [LC 3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) — 중복 문자가 없는 가장 긴 연속 구간을 찾는다.
- [ ] **040 · 응용** [PG 178870. 연속된 부분 수열의 합](https://school.programmers.co.kr/learn/courses/30/lessons/178870) — 양수 수열에서 구간을 늘리고 줄인다.
- [ ] **041 · 응용** [PG 131127. 할인 행사](https://school.programmers.co.kr/learn/courses/30/lessons/131127) — 고정 길이 구간의 빈도를 관리한다.
- [ ] **042 · 응용** [PG 67258. 보석 쇼핑](https://school.programmers.co.kr/learn/courses/30/lessons/67258) — 모든 종류를 포함하는 최소 구간을 찾는다.

<a id="topic-08"></a>

### 08. 구현·시뮬레이션 · 10문제

학습 목표: 한 턴의 처리 순서, 동시 갱신, 좌표 변환과 예외 조건을 설계한다.

- [ ] **043 · 기본** [PG 64061. 크레인 인형뽑기 게임](https://school.programmers.co.kr/learn/courses/30/lessons/64061) — 격자와 스택을 함께 처리한다.
- [ ] **044 · 응용** [PG 42888. 오픈채팅방](https://school.programmers.co.kr/learn/courses/30/lessons/42888) — 이벤트 기록과 최종 사용자 상태를 분리한다.
- [ ] **045 · 응용** [PG 17680. 캐시](https://school.programmers.co.kr/learn/courses/30/lessons/17680) — LRU 규칙을 명세대로 구현한다.
- [ ] **046 · 응용** [PG 77485. 행렬 테두리 회전하기](https://school.programmers.co.kr/learn/courses/30/lessons/77485) — 경계를 따라 값을 이동하고 보존한다.
- [ ] **047 · 응용** [PG 60057. 문자열 압축](https://school.programmers.co.kr/learn/courses/30/lessons/60057) — 압축 단위를 바꿔가며 시뮬레이션한다.
- [ ] **048 · 응용** [PG 92341. 주차 요금 계산](https://school.programmers.co.kr/learn/courses/30/lessons/92341) — 시간·입출차 기록·예외를 처리한다.
- [ ] **049 · 응용** [PG 17679. 프렌즈4블록](https://school.programmers.co.kr/learn/courses/30/lessons/17679) — 동시 제거와 아래로 떨어지는 과정을 분리한다.
- [ ] **050 · 응용** [PG 118667. 두 큐 합 같게 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/118667) — 상태 변화와 반복 종료 조건을 설계한다.
- [ ] **051 · 도전** [PG 60059. 자물쇠와 열쇠](https://school.programmers.co.kr/learn/courses/30/lessons/60059) — 회전·이동·겹침 검사를 구현한다.
- [ ] **052 · 도전** [PG 60061. 기둥과 보 설치](https://school.programmers.co.kr/learn/courses/30/lessons/60061) — 설치·삭제 후 전체 상태의 유효성을 검사한다.

<a id="topic-09"></a>

### 09. 순열 · 5문제

학습 목표: 순서가 다른 선택을 구별하고 중복 값·사전순·원형 배치에 적용한다.

- [ ] **053 · 개념** [LC 46. Permutations](https://leetcode.com/problems/permutations/) — 서로 다른 원소의 모든 순열을 만든다.
- [ ] **054 · 개념** [LC 47. Permutations II](https://leetcode.com/problems/permutations-ii/) — 중복 값이 있는 배열의 서로 다른 순열을 만든다.
- [ ] **055 · 응용** [SWEA 6808. 규영이와 인영이의 카드게임](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWgv9va6HnkDFAW0) — 카드 순서를 열거하고 결과를 집계한다.
- [ ] **056 · 응용** [PG 12936. 줄 서는 방법](https://school.programmers.co.kr/learn/courses/30/lessons/12936) — 경우의 수를 이용해 K번째 순열을 구한다.
- [ ] **057 · 도전** [PG 60062. 외벽 점검](https://school.programmers.co.kr/learn/courses/30/lessons/60062) — 친구 투입 순서와 원형 구간을 처리한다.

복습 과제: 순열을 재귀와 `next_permutation`으로 각각 생성해 차이를 확인한다.

<a id="topic-10"></a>

### 10. 조합 · 5문제

학습 목표: 선택 순서를 무시하는 경우를 생성하고 중복 계산을 막는다.

- [ ] **058 · 개념** [LC 77. Combinations](https://leetcode.com/problems/combinations/) — 1부터 N까지의 수에서 K개를 고르는 조합을 만든다.
- [ ] **059 · 기본** [PG 131705. 삼총사](https://school.programmers.co.kr/learn/courses/30/lessons/131705) — 세 원소를 선택해 조건을 검사한다.
- [ ] **060 · 응용** [PG 12977. 소수 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/12977) — 세 수의 조합과 소수 판정을 결합한다.
- [ ] **061 · 응용** [PG 72411. 메뉴 리뉴얼](https://school.programmers.co.kr/learn/courses/30/lessons/72411) — 조합별 등장 빈도를 집계한다.
- [ ] **062 · 응용** [SWEA 4012. 요리사](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWIeUtVakTMDFAVH) — 두 집합으로 분할할 조합을 열거한다.

<a id="topic-11"></a>

### 11. 완전탐색 · 5문제

학습 목표: 탐색 공간과 총 연산량을 계산하고 후보를 빠짐없이 검사한다.

- [ ] **063 · 기본** [PG 42840. 모의고사](https://school.programmers.co.kr/learn/courses/30/lessons/42840) — 반복 패턴을 비교한다.
- [ ] **064 · 기본** [PG 42842. 카펫](https://school.programmers.co.kr/learn/courses/30/lessons/42842) — 가능한 가로·세로를 검사한다.
- [ ] **065 · 기본** [SWEA 2001. 파리 퇴치](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PzOCKAigDFAUq) — 모든 정사각형 구간을 검사한다.
- [ ] **066 · 응용** [PG 84512. 모음 사전](https://school.programmers.co.kr/learn/courses/30/lessons/84512) — 가능한 문자열을 정해진 순서로 열거한다.
- [ ] **067 · 응용** [PG 150368. 이모티콘 할인행사](https://school.programmers.co.kr/learn/courses/30/lessons/150368) — 중복 선택과 두 단계 목적함수를 처리한다.

<a id="topic-12"></a>

### 12. 깊이 우선 탐색 — DFS · 6문제

학습 목표: 그래프 표현, 방문 처리, 연결 요소와 탐색 결과 집계를 구현한다.

- [ ] **068 · 기본** [SWEA 1219. 길찾기](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV14geLqABQCFAYD) — 정점 사이의 도달 가능성을 검사한다.
- [ ] **069 · 개념** [LC 200. Number of Islands](https://leetcode.com/problems/number-of-islands/) — 격자에서 연결된 육지 덩어리의 개수를 센다.
- [ ] **070 · 개념** [LC 695. Max Area of Island](https://leetcode.com/problems/max-area-of-island/) — 격자에서 가장 큰 육지 덩어리의 넓이를 구한다.
- [ ] **071 · 응용** [PG 43162. 네트워크](https://school.programmers.co.kr/learn/courses/30/lessons/43162) — 인접 행렬의 연결 요소를 센다.
- [ ] **072 · 응용** [PG 86971. 전력망을 둘로 나누기](https://school.programmers.co.kr/learn/courses/30/lessons/86971) — 간선 제거 후 연결 요소 크기를 비교한다.
- [ ] **073 · 응용** [PG 154540. 무인도 여행](https://school.programmers.co.kr/learn/courses/30/lessons/154540) — 연결된 격자 영역의 값을 집계한다.

<a id="topic-13"></a>

### 13. 너비 우선 탐색 — BFS·상태 공간 · 8문제

학습 목표: 무가중치 최단 거리, 다중 시작점과 추가 상태를 포함한 방문 배열을 설계한다.

- [ ] **074 · 기본** [SWEA 1226. 미로1](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV14vXUqAGMCFAYD) — 큐와 방문 배열로 미로를 탐색한다.
- [ ] **075 · 기본** [PG 1844. 게임 맵 최단거리](https://school.programmers.co.kr/learn/courses/30/lessons/1844) — 격자 최단 거리를 구한다.
- [ ] **076 · 개념** [LC 994. Rotting Oranges](https://leetcode.com/problems/rotting-oranges/) — 여러 시작점에서 동시에 퍼지는 데 걸리는 시간을 구한다.
- [ ] **077 · 응용** [PG 159993. 미로 탈출](https://school.programmers.co.kr/learn/courses/30/lessons/159993) — 경유 지점을 포함한 최단 거리를 구한다.
- [ ] **078 · 응용** [PG 169199. 리코쳇 로봇](https://school.programmers.co.kr/learn/courses/30/lessons/169199) — 미끄러지는 한 번의 이동을 간선으로 정의한다.
- [ ] **079 · 응용** [PG 87694. 아이템 줍기](https://school.programmers.co.kr/learn/courses/30/lessons/87694) — 좌표 확대와 도형의 경계를 표현한다.
- [ ] **080 · 응용** [PG 43163. 단어 변환](https://school.programmers.co.kr/learn/courses/30/lessons/43163) — 단어를 정점으로 보고 한 글자씩 바꾸는 최소 횟수를 구한다.
- [ ] **081 · 도전** [PG 60063. 블록 이동하기](https://school.programmers.co.kr/learn/courses/30/lessons/60063) — 위치·방향·회전을 포함한 상태를 관리한다.

<a id="topic-14"></a>

### 14. 백트래킹 · 6문제

학습 목표: 선택과 복구, 가지치기, 중복 상태와 다음 선택 후보를 관리한다.

- [ ] **082 · 기본** [SWEA 5215. 햄버거 다이어트](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWT-lPB6dHUDFAVT) — 선택·미선택과 제한 조건을 구현한다.
- [ ] **083 · 응용** [PG 87946. 피로도](https://school.programmers.co.kr/learn/courses/30/lessons/87946) — 방문 순서를 탐색한다.
- [ ] **084 · 응용** [SWEA 1244. 최대 상금](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV15Khn6AN0CFAYD) — 교환 횟수와 중복 상태를 관리한다.
- [ ] **085 · 응용** [PG 92342. 양궁대회](https://school.programmers.co.kr/learn/courses/30/lessons/92342) — 자원 배분과 동점 기준을 처리한다.
- [ ] **086 · 응용** [PG 64064. 불량 사용자](https://school.programmers.co.kr/learn/courses/30/lessons/64064) — 매칭을 탐색하고 결과 집합의 중복을 제거한다.
- [ ] **087 · 도전** [PG 92343. 양과 늑대](https://school.programmers.co.kr/learn/courses/30/lessons/92343) — 상태별로 방문 가능한 다음 후보를 관리한다.

<a id="topic-15"></a>

### 15. 비트마스킹 · 5문제

학습 목표: 집합의 추가·삭제·포함·교집합·부분집합을 비트 연산으로 표현한다.

- [ ] **088 · 개념** [LC 191. Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) — 정수에서 켜진 비트의 개수를 센다.
- [ ] **089 · 개념** [LC 338. Counting Bits](https://leetcode.com/problems/counting-bits/) — 0부터 N까지 각 정수의 켜진 비트 개수를 구한다.
- [ ] **090 · 개념** [LC 78. Subsets](https://leetcode.com/problems/subsets/) — 부분집합을 비트마스크로 모두 만든다.
- [ ] **091 · 응용** [PG 77885. 2개 이하로 다른 비트](https://school.programmers.co.kr/learn/courses/30/lessons/77885) — 비트 패턴을 관찰하고 조작한다.
- [ ] **092 · 응용** [PG 42890. 후보키](https://school.programmers.co.kr/learn/courses/30/lessons/42890) — 속성 부분집합과 최소성을 비트로 검사한다.

<a id="topic-16"></a>

### 16. 그리디 · 5문제

학습 목표: 선택 기준을 정하고 그 선택이 최적해를 잃지 않는 근거를 설명한다.

- [ ] **093 · 개념** [LC 55. Jump Game](https://leetcode.com/problems/jump-game/) — 각 위치의 최대 점프 길이가 주어질 때 끝에 도달 가능한지 판별한다.
- [ ] **094 · 응용** [PG 42885. 구명보트](https://school.programmers.co.kr/learn/courses/30/lessons/42885) — 정렬 후 유리한 짝을 선택한다.
- [ ] **095 · 응용** [PG 181188. 요격 시스템](https://school.programmers.co.kr/learn/courses/30/lessons/181188) — 열린 구간의 경계를 처리한다.
- [ ] **096 · 응용** [PG 12987. 숫자 게임](https://school.programmers.co.kr/learn/courses/30/lessons/12987) — 이길 수 있는 매칭을 선택한다.
- [ ] **097 · 응용** [PG 42883. 큰 수 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/42883) — 앞자리 선택과 단조 스택을 결합한다.

<a id="topic-17"></a>

### 17. 라인 스위핑 · 5문제

학습 목표: 이벤트를 정렬하고 같은 좌표에서의 처리 순서와 활성 구간을 관리한다.

- [ ] **098 · 개념** [LC 1094. Car Pooling](https://leetcode.com/problems/car-pooling/) — 구간별 승하차를 반영해 차량 정원 초과 여부를 판정한다.
- [ ] **099 · 개념** [LC 1288. Remove Covered Intervals](https://leetcode.com/problems/remove-covered-intervals/) — 다른 구간에 완전히 포함되는 구간을 제거한다.
- [ ] **100 · 개념** [LC 2406. Divide Intervals Into Minimum Number of Groups](https://leetcode.com/problems/divide-intervals-into-minimum-number-of-groups/) — 같은 그룹의 구간이 겹치지 않도록 하는 최소 그룹 수를 구한다.
- [ ] **101 · 응용** [PG 155651. 호텔 대실](https://school.programmers.co.kr/learn/courses/30/lessons/155651) — 입실·청소 종료 이벤트로 필요한 객실 수를 구한다.
- [ ] **102 · 도전** [PG 17676. 추석 트래픽](https://school.programmers.co.kr/learn/courses/30/lessons/17676) — 밀리초 구간과 최대 동시 처리량을 계산한다.

<a id="topic-18"></a>

### 18. 이분 탐색·매개변수 탐색 · 5문제

학습 목표: 탐색 구간, 하한·상한과 단조적인 판정 함수를 설계한다.

- [ ] **103 · 개념** [LC 704. Binary Search](https://leetcode.com/problems/binary-search/) — 정렬된 배열에서 목표값을 찾는다.
- [ ] **104 · 개념** [LC 34. Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) — 목표값이 처음·마지막으로 나타나는 위치를 찾는다.
- [ ] **105 · 응용** [PG 43238. 입국심사](https://school.programmers.co.kr/learn/courses/30/lessons/43238) — 주어진 시간 안에 처리 가능한 인원을 판정한다.
- [ ] **106 · 응용** [PG 64062. 징검다리 건너기](https://school.programmers.co.kr/learn/courses/30/lessons/64062) — 건널 수 있는 인원에 대한 단조성을 이용한다.
- [ ] **107 · 도전** [PG 86053. 금과 은 운반하기](https://school.programmers.co.kr/learn/courses/30/lessons/86053) — 복수 자원의 운반 가능 조건을 판정한다.

<a id="topic-19"></a>

### 19. 동적 계획법 — DP · 8문제

학습 목표: 상태·점화식·초깃값·계산 순서와 0/1 선택의 갱신 방향을 설명한다.

- [ ] **108 · 개념** [LC 70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) — 1칸 또는 2칸씩 올라가는 방법의 수를 센다.
- [ ] **109 · 개념** [LC 198. House Robber](https://leetcode.com/problems/house-robber/) — 인접한 원소를 함께 고르지 않고 합을 최대화한다.
- [ ] **110 · 응용** [PG 43105. 정수 삼각형](https://school.programmers.co.kr/learn/courses/30/lessons/43105) — 경로의 최댓값을 누적한다.
- [ ] **111 · 응용** [PG 42898. 등굣길](https://school.programmers.co.kr/learn/courses/30/lessons/42898) — 장애물이 있는 격자의 경로 수를 센다.
- [ ] **112 · 응용** [PG 12913. 땅따먹기](https://school.programmers.co.kr/learn/courses/30/lessons/12913) — 직전 열의 선택을 포함해 상태를 설계한다.
- [ ] **113 · 개념** [LC 322. Coin Change](https://leetcode.com/problems/coin-change/) — 목표 금액을 만드는 최소 동전 수를 구한다.
- [ ] **114 · 개념** [LC 416. Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/) — 배열을 합이 같은 두 집합으로 나눌 수 있는지 판정한다.
- [ ] **115 · 도전** [PG 42895. N으로 표현](https://school.programmers.co.kr/learn/courses/30/lessons/42895) — 사용 횟수별 가능한 결과 집합을 결합한다.

<a id="topic-20"></a>

### 20. 최장 증가 부분 수열 — LIS · 5문제

학습 목표: O(N²) DP와 O(N log N) 방법을 비교하고 길이·개수·수쌍 상태를 구분한다.

- [ ] **116 · 개념** [LC 300. Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) — 엄격히 증가하는 가장 긴 부분 수열의 길이를 구한다.
- [ ] **117 · 기본** [SWEA 3307. 최장 증가 부분 수열](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWBOKg-a6l0DFAWr) — 같은 개념을 한국어 문제와 표준 입출력으로 복습한다.
- [ ] **118 · 개념** [LC 334. Increasing Triplet Subsequence](https://leetcode.com/problems/increasing-triplet-subsequence/) — 길이 3의 증가 부분 수열이 있는지 판별한다.
- [ ] **119 · 개념** [LC 646. Maximum Length of Pair Chain](https://leetcode.com/problems/maximum-length-of-pair-chain/) — 앞 수쌍의 끝보다 다음 수쌍의 시작이 크도록 최대한 연결한다.
- [ ] **120 · 개념** [LC 673. Number of Longest Increasing Subsequence](https://leetcode.com/problems/number-of-longest-increasing-subsequence/) — 최장 증가 부분 수열의 개수를 길이와 함께 계산한다.

복습 과제: 첫 문제를 O(N²) DP와 O(N log N) 이분 탐색으로 각각 구현한다. 이분 탐색에서 유지하는 배열과 실제 LIS 복원을 구분한다.

<a id="topic-21"></a>

### 21. 최장 공통 부분 수열 — LCS · 5문제

학습 목표: 두 인덱스의 DP, 일치·불일치 전이와 삭제 비용으로의 확장을 이해한다.

- [ ] **121 · 개념** [LC 1143. Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/) — 두 문자열의 최장 공통 부분 수열 길이를 구한다.
- [ ] **122 · 기본** [SWEA 3304. 최장 공통 부분 수열](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWBOHEx66kIDFAWr) — 한국어 문제에서 LCS 점화식을 다시 구현한다.
- [ ] **123 · 개념** [LC 583. Delete Operation for Two Strings](https://leetcode.com/problems/delete-operation-for-two-strings/) — 두 문자열을 같게 만들기 위한 최소 삭제 횟수를 구한다.
- [ ] **124 · 개념** [LC 1035. Uncrossed Lines](https://leetcode.com/problems/uncrossed-lines/) — 두 배열의 같은 값을 교차하지 않게 연결하는 최대 개수를 구한다.
- [ ] **125 · 개념** [LC 712. Minimum ASCII Delete Sum for Two Strings](https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/) — 문자열을 같게 만들기 위한 삭제 문자 코드 값의 합을 최소화한다.

복습 과제: 첫 LCS 문제에서 길이뿐 아니라 가능한 LCS 문자열 하나도 직접 복원한다. LCS와 연속 부분 문자열을 구분한다.

<a id="topic-22"></a>

### 22. 다익스트라 · 5문제

학습 목표: 우선순위 큐와 거리 배열을 분리하고 상태·경로 비용을 모델링한다.

- [ ] **126 · 개념** [LC 743. Network Delay Time](https://leetcode.com/problems/network-delay-time/) — 한 시작점에서 모든 정점으로 신호가 도착하는 데 필요한 시간을 구한다.
- [ ] **127 · 응용** [SWEA 1249. 보급로](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV15QRX6APsCFAYD) — 칸별 진입 비용을 갖는 격자의 최단 거리를 구한다.
- [ ] **128 · 응용** [PG 12978. 배달](https://school.programmers.co.kr/learn/courses/30/lessons/12978) — 정해진 거리 이내의 도달 정점을 센다.
- [ ] **129 · 도전** [PG 67259. 경주로 건설](https://school.programmers.co.kr/learn/courses/30/lessons/67259) — 위치와 진입 방향별 거리를 관리한다.
- [ ] **130 · 도전** [PG 118669. 등산코스 정하기](https://school.programmers.co.kr/learn/courses/30/lessons/118669) — 다중 시작점과 경로의 최대 간선 비용을 관리한다.

<a id="topic-23"></a>

### 23. 플로이드–워셜·전이적 폐쇄 · 5문제

학습 목표: 모든 정점 쌍의 최단 거리와 도달 관계를 구분하고 경유 정점 순서를 설명한다.

- [ ] **131 · 개념** [LC 1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance](https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/) — 거리 제한 이내에 도달 가능한 이웃이 가장 적은 도시를 구한다.
- [ ] **132 · 응용** [PG 72413. 합승 택시 요금](https://school.programmers.co.kr/learn/courses/30/lessons/72413) — 모든 분기 지점의 비용을 비교한다.
- [ ] **133 · 응용** [PG 49191. 순위](https://school.programmers.co.kr/learn/courses/30/lessons/49191) — 승패 관계의 전이적 폐쇄로 확정 가능한 순위를 센다.
- [ ] **134 · 응용** [SWEA 5643. 키 순서](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWXQsLWKd5cDFAUo) — 키 비교 관계의 도달 가능성을 계산한다.
- [ ] **135 · 응용** [SWEA 1263. 사람 네트워크2](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV18P2B6Iu8CFAZN) — 정점별 거리 합을 비교한다.

<a id="topic-24"></a>

### 24. 벨만–포드 · 5문제

학습 목표: 간선 완화, 반복 횟수, 도달 불가능 정점과 음수 사이클 판정을 구현한다.

앞에서 푼 문제 3개를 벨만–포드로 다시 푼다. 중복을 숨기지 않고 교차 복습으로 표시했다. 아래 제출 문제에는 음수 사이클 판정이 직접 포함되지 않으므로 단원 끝의 자체 검증도 수행한다.

- [ ] **136 · 개념** [LC 743. Network Delay Time](https://leetcode.com/problems/network-delay-time/) — 간선 목록을 반복 완화하는 방식으로 다시 구현한다. **교차 복습: 22. 다익스트라**
- [ ] **137 · 응용** [PG 12978. 배달](https://school.programmers.co.kr/learn/courses/30/lessons/12978) — 다익스트라 대신 벨만–포드로 구현하고 복잡도를 비교한다. **교차 복습: 22. 다익스트라**
- [ ] **138 · 응용** [SWEA 1795. 인수의 생일 파티](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV4xuqCqBeUDFAUx) — 정방향·역방향 그래프를 각각 완화해 왕복 비용을 구한다.
- [ ] **139 · 개념** [LC 787. Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/) — 경유 횟수 제한 안의 최소 비용을 이전 단계 배열로 계산한다.
- [ ] **140 · 개념** [LC 1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance](https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/) — 시작점마다 완화해 플로이드–워셜 결과와 비교한다. **교차 복습: 23. 플로이드–워셜·전이적 폐쇄**

**추가 검증 — 제출 문제 수에 포함하지 않음**

아래 작은 그래프로 직접 만든 벨만–포드 함수를 검증한다. 정점은 0부터 시작하며 간선은 `(출발, 도착, 가중치)`다.

| 경우 | 그래프와 시작점 | 확인할 결과 |
| --- | --- | --- |
| 음수 간선·사이클 없음 | 정점 3개, 시작 0, `(0,1,4)`, `(0,2,5)`, `(1,2,-2)` | 거리 `[0,4,2]` |
| 도달 가능한 음수 사이클 | 정점 3개, 시작 0, `(0,1,1)`, `(1,2,-2)`, `(2,1,-2)` | 시작점에서 도달 가능한 음수 사이클 검출 |
| 도달 불가능한 음수 사이클 | 정점 4개, 시작 0, `(0,1,3)`, `(2,3,-2)`, `(3,2,-2)` | 2·3은 도달 불가. 시작점 기준 검사에서는 음수 사이클로 판정하지 않음 |

`dist[u]`가 무한대인 경우 완화하지 않는다. 전체 그래프의 음수 사이클을 검사할 때와 단일 시작점에서 도달 가능한 음수 사이클을 검사할 때의 초기화 차이를 설명한다.

<a id="topic-25"></a>

### 25. 유니온 파인드 · 5문제

학습 목표: 대표 원소, 경로 압축, 크기·랭크에 따른 합치기와 연결성을 이해한다.

- [ ] **141 · 기본** [SWEA 3289. 서로소 집합](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWBJKA6qr2oDFAWr) — 합치기와 같은 집합 여부 질의를 구현한다.
- [ ] **142 · 응용** [SWEA 7465. 창용 마을 무리의 개수](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWngfZVa9XwDFAQU) — 집합의 개수를 관리한다.
- [ ] **143 · 개념** [LC 547. Number of Provinces](https://leetcode.com/problems/number-of-provinces/) — 인접 행렬로 주어진 연결 집합의 개수를 센다.
- [ ] **144 · 개념** [LC 684. Redundant Connection](https://leetcode.com/problems/redundant-connection/) — 추가하면 사이클이 생기는 간선을 찾는다.
- [ ] **145 · 도전** [PG 64063. 호텔 방 배정](https://school.programmers.co.kr/learn/courses/30/lessons/64063) — 다음 빈 방을 가리키는 경로를 압축한다.

<a id="topic-26"></a>

### 26. 최소 신장 트리 — MST · 5문제

학습 목표: 유니온 파인드와 크루스칼을 연결하고 프림과의 차이를 설명한다.

- [ ] **146 · 기본** [SWEA 3124. 최소 스패닝 트리](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV_mSnmKUckDFAWb) — 간선 정렬과 크루스칼의 기본을 구현한다.
- [ ] **147 · 응용** [PG 42861. 섬 연결하기](https://school.programmers.co.kr/learn/courses/30/lessons/42861) — 모든 섬을 최소 비용으로 연결한다.
- [ ] **148 · 응용** [SWEA 1251. 하나로](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV15StKqAQkCFAYD) — 좌표에서 간선 비용을 만들고 MST를 구성한다.
- [ ] **149 · 개념** [LC 1584. Min Cost to Connect All Points](https://leetcode.com/problems/min-cost-to-connect-all-points/) — 맨해튼 거리로 모든 점을 연결하는 최소 비용을 프림으로 구한다.
- [ ] **150 · 도전** [PG 62050. 지형 이동](https://school.programmers.co.kr/learn/courses/30/lessons/62050) — 격자의 이동 문제를 MST로 모델링한다.

복습 과제: `섬 연결하기`를 크루스칼과 프림으로 각각 구현해 비교한다.

<a id="topic-27"></a>

### 27. 위상 정렬 · 5문제

학습 목표: 진입 차수, 선행 관계, 사이클과 가능한 순서를 처리한다.

- [ ] **151 · 개념** [LC 207. Course Schedule](https://leetcode.com/problems/course-schedule/) — 선수 과목 관계를 지키며 모든 과목을 이수할 수 있는지 판정한다.
- [ ] **152 · 개념** [LC 210. Course Schedule II](https://leetcode.com/problems/course-schedule-ii/) — 가능한 과목 이수 순서를 하나 만든다.
- [ ] **153 · 응용** [SWEA 1267. 작업순서](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV18TrIqIwUCFAZN) — 선행 작업 관계에서 처리 순서를 구한다.
- [ ] **154 · 개념** [LC 802. Find Eventual Safe States](https://leetcode.com/problems/find-eventual-safe-states/) — 어느 경로로 가도 사이클에 빠지지 않는 정점을 역방향 그래프로 구한다.
- [ ] **155 · 도전** [PG 67260. 동굴 탐험](https://school.programmers.co.kr/learn/courses/30/lessons/67260) — 이동 가능 조건과 선행 방문 관계를 결합한다.

<a id="topic-28"></a>

### 28. 트리·트리 DP · 5문제

학습 목표: 부모·깊이·후위 처리를 이해하고 서브트리 결과와 선택 상태를 결합한다.

- [ ] **156 · 개념** [LC 104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) — 이진 트리의 최대 깊이를 구한다.
- [ ] **157 · 개념** [LC 543. Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) — 트리에서 두 정점 사이 가장 긴 경로의 간선 수를 구한다.
- [ ] **158 · 응용** [PG 42892. 길 찾기 게임](https://school.programmers.co.kr/learn/courses/30/lessons/42892) — 트리를 구성하고 전위·후위 순회한다.
- [ ] **159 · 응용** [PG 76503. 모두 0으로 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/76503) — 후위 순회로 서브트리 값을 부모에게 전달한다.
- [ ] **160 · 도전** [PG 133500. 등대](https://school.programmers.co.kr/learn/courses/30/lessons/133500) — 선택·미선택 상태를 갖는 트리 DP를 구현한다.

<a id="topic-29"></a>

### 29. 펜윅 트리 — Fenwick Tree · 5문제

학습 목표: lowbit, 점 갱신, 접두 합, 빈도와 순위 질의의 연결을 이해한다.

첫 문제는 누적 합 단원의 문제를 펜윅 트리로 다시 구현하는 교차 복습이다. 마지막 표 편집은 응용 단계이며, 누적 빈도로 K번째 원소를 찾는 연산을 먼저 연습한다.

- [ ] **161 · 개념** [LC 303. Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/) — 동일한 구간 합 질의를 펜윅 트리로 다시 구현해 누적 합과 비교한다. **교차 복습: 06. 누적 합·차분 배열·누적 전처리**
- [ ] **162 · 개념** [LC 307. Range Sum Query - Mutable](https://leetcode.com/problems/range-sum-query-mutable/) — 원소 갱신과 구간 합 질의를 함께 처리한다.
- [ ] **163 · 개념** [LC 1395. Count Number of Teams](https://leetcode.com/problems/count-number-of-teams/) — 세 원소가 증가 또는 감소하는 인덱스 조합의 수를 빈도 트리로 센다.
- [ ] **164 · 개념** [LC 1409. Queries on a Permutation With Key](https://leetcode.com/problems/queries-on-a-permutation-with-key/) — 질의한 값을 맨 앞으로 옮길 때 현재 위치를 누적 빈도로 계산한다.
- [ ] **165 · 도전** [PG 81303. 표 편집](https://school.programmers.co.kr/learn/courses/30/lessons/81303) — 행의 삭제·복구와 K번째 살아 있는 행을 관리한다.

<a id="swea-practice"></a>

## B. SWEA 종합 구현·탐색 · 10문제

SWEA 모의 역량테스트를 활용한 종합 연습이다. 실제 채용 기출과 구분하며, A에서 배운 알고리즘을 선택·상태 복구·동시 갱신에 적용한다.

- [ ] **166 · 응용** [SWEA 1952. 수영장](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PpFQaAQMDFAUq) — 완전탐색과 DP 풀이를 비교한다.
- [ ] **167 · 응용** [SWEA 2115. 벌꿀채취](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5V4A46AdIDFAWu) — 구간 선택과 부분집합 탐색을 결합한다.
- [ ] **168 · 응용** [SWEA 4008. 숫자 만들기](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWIeRZV6kBUDFAVH) — 연산자 선택과 중복 처리를 구현한다.
- [ ] **169 · 응용** [SWEA 1949. 등산로 조성](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PoOKKAPIDFAUq) — 지형을 바꾸는 DFS와 상태 복구를 구현한다.
- [ ] **170 · 응용** [SWEA 1953. 탈주범 검거](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PpLlKAQ4DFAUq) — 터널의 연결 방향을 고려해 BFS한다.
- [ ] **171 · 도전** [SWEA 2112. 보호 필름](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5V1SYKAaUDFAWu) — 가지치기와 최소 변경 횟수를 구한다.
- [ ] **172 · 응용** [SWEA 4013. 특이한 자석](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWIeV9sKkcoDFAVH) — 회전 여부 결정과 실제 회전을 분리한다.
- [ ] **173 · 응용** [SWEA 2382. 미생물 격리](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV597vbqAH0DFAVl) — 동시 이동·충돌·병합을 처리한다.
- [ ] **174 · 응용** [SWEA 5644. 무선 충전](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWXRDL1aeugDFAUo) — 이동·범위·충전기 조합을 처리한다.
- [ ] **175 · 도전** [SWEA 5656. 벽돌 깨기](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWXRQm6qfL0DFAUo) — 선택 탐색·연쇄 제거·중력을 결합한다.

<a id="codetree-practice"></a>

## C. 코드트리 기출 기반 실전 · 25문제

삼성 기출 기반 20문제와 현대차그룹 HSAT 5문제를 별도로 푼다. 코드트리의 삼성 목록은 실제 출제를 바탕으로 제작한 변형·유사 문제를 포함한다. HSAT은 현대차그룹의 코딩 인증평가이며, 개별 채용 시험과 동일한 전형을 뜻하지 않는다.

실전 점검에서는 아래 학습 포인트를 가리고 문제 설명부터 읽는다. 전체 상태, 한 턴의 처리 순서, 동점 기준, 경계 조건을 적은 뒤 구현한다.

### C1. 삼성 기출 기반 1 — 격자·상태 변화 · 5문제

- [ ] **176 · 실전** [코드트리 · 바이러스 검사](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/virus-detector/description) — 올림 계산과 정수 범위를 점검한다.
- [ ] **177 · 실전** [코드트리 · 청소는 즐거워](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/cleaning-is-joyful/description) — 나선 이동과 방향별 좌표 변환을 구현한다.
- [ ] **178 · 실전** [코드트리 · 예술성](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/artistry/description) — 그룹 탐색·인접 관계·회전을 결합한다.
- [ ] **179 · 실전** [코드트리 · 나무박멸](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/tree-kill-all/description) — 성장·번식·지속 시간을 관리한다.
- [ ] **180 · 실전** [코드트리 · 코드트리 빵](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/codetree-mon-bread/description) — BFS·이동 우선순위·진입 금지를 처리한다.

### C2. 삼성 기출 기반 2 — 복합 시뮬레이션 · 5문제

- [ ] **181 · 실전** [코드트리 · 메이즈 러너](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/maze-runner/description) — 이동과 부분 정사각형 회전을 구현한다.
- [ ] **182 · 실전** [코드트리 · 포탑 부수기](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/destroy-the-turret/description) — 다중 정렬 기준과 경로 복원을 구현한다.
- [ ] **183 · 실전** [코드트리 · 왕실의 기사 대결](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/royal-knight-duel/description) — 직사각형의 충돌과 연쇄 이동을 구현한다.
- [ ] **184 · 실전** [코드트리 · 루돌프의 반란](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/rudolph-rebellion/description) — 우선순위·충돌·밀려남을 처리한다.
- [ ] **185 · 실전** [코드트리 · 고대 문명 유적 탐사](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/ancient-ruin-exploration/description) — 회전 후보 비교와 연쇄 제거를 구현한다.

### C3. 삼성 기출 기반 3 — 공간·그래프·자료구조 · 5문제

- [ ] **186 · 실전** [코드트리 · 마법의 숲 탐색](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/magical-forest-exploration/description) — 복합 도형과 연결 이동을 처리한다.
- [ ] **187 · 실전** [코드트리 · 메두사와 전사들](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/medusa-and-warriors/description) — 최단 경로·시야·이동 규칙을 결합한다.
- [ ] **188 · 실전** [코드트리 · 미지의 공간 탈출](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/escape-unknown-space/description) — 공간 연결과 시간에 따른 이동 제약을 모델링한다.
- [ ] **189 · 실전** [코드트리 · 코드트리 투어](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/codetree-tour/description) — 최단 경로와 상품 관리를 결합한다.
- [ ] **190 · 실전** [코드트리 · 개구리의 여행](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/frog-journey/description) — 이동 상태를 그래프로 모델링한다.

### C4. 삼성 기출 기반 4 — 최근 문제·명령 처리 · 5문제

- [ ] **191 · 실전** [코드트리 · 아기 고래의 첫 항해](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/baby-whale-first-voyage/description) — 여러 이동 조건과 우선순위를 구현한다.
- [ ] **192 · 실전** [코드트리 · 코디의 향수 공방](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/perfume-workshop/description) — 명령 처리와 DP 상태 설계를 연습한다.
- [ ] **193 · 실전** [코드트리 · 가로등 설치](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/street-light-installation/description) — 명령과 우선순위 큐의 상태를 관리한다.
- [ ] **194 · 실전** [코드트리 · AI 로봇청소기](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/ai-robot/description) — 격자의 이동·청소 규칙을 구현한다.
- [ ] **195 · 실전** [코드트리 · 택배 하차](https://www.codetree.ai/ko/frequent-problems/samsung-sw/problems/delivery-service/description) — 상자의 상태와 하차 순서를 관리한다.

### C5. 현대차그룹 HSAT · 5문제

- [ ] **196 · 실전** [코드트리 · 보안 담당자](https://www.codetree.ai/ko/frequent-problems/hsat/problems/security-manager/description) — 불확정 상태를 포함한 조건을 판정한다.
- [ ] **197 · 실전** [코드트리 · 도로 보수 로봇](https://www.codetree.ai/ko/frequent-problems/hsat/problems/road-repair-robot/description) — 매개변수 탐색과 판정 함수를 구성한다.
- [ ] **198 · 실전** [코드트리 · 배터리 효율 최적화 하기](https://www.codetree.ai/ko/frequent-problems/hsat/problems/optimizing-battery-efficiency/description) — 도형 배치와 탐색을 수행한다.
- [ ] **199 · 실전** [코드트리 · 디지털 로직 패턴 검사](https://www.codetree.ai/ko/frequent-problems/hsat/problems/check-digital-logic-pattern/description) — 패턴과 해시를 처리한다.
- [ ] **200 · 실전** [코드트리 · 편안한 워크숍](https://www.codetree.ai/ko/frequent-problems/hsat/problems/easy-workshop/description) — 조건을 읽고 DP 상태를 설계한다.

<a id="cross-review"></a>
