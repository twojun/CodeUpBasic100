# CodeUpBasic100
1. 코딩테스트 대비를 위해 코드업 기초 100문제를 풀고 기록하는 Repository입니다.
2. Java 언어로 풀이를 작성했습니다.

=========================================

# 1. StringTokenizer</br>
(1) 코딩 테스트에서 입출력 단위 관련으로 많이 사용되는 StringTokenizer</br></br>

(2) BufferedReader를 통해 입력 받은 문자열을 파라미터로 넘어온 구분자를 기준으로 하는 토큰 단위로 나누기 위한 클래스를 말함</br></br>

(3) 특이한 점은 내부 동작 방식인데 하나의 StringTokenizer 객체가 nextToken() 메서드가 동작함에 따라 토큰의 현재 인덱스 을 별도로 저장하면서 동작하기 때문에 다른 구분자에 대한 문자열을 기반으로 토큰을 생성하려면 새로운 객체를 생성해 줘야 한다는 점이다.</br></br></br></br></br>



# 2. 정수 최댓값 확인 : Math.max(para1, para2)  </br>
- ex) Math.max(Math.max(para1, para2), para3)</br></br></br></br></br>



# 3. 배열 오름차순 정렬 </br>
   Arrays.sort(arr);</br></br></br></br></br>



# 4. StringBuilder</br>
(1) StringBuilder는 문자열을 효과적으로 다루기 위해 자바에서 제공하는 기본 문자열 클래스이며 기존 String클래스가 갖는 불변성을 떠나 StringBuilder는 가변성을 가진다.</br></br>
(2) 문자열의 추가, 삭제 등 다양한 작업이 가능하다.</br></br>
(3) thread-safe하지 않기 때문에 스레드 안정성을 고려한다면 StringBuffer를 사용한다.</br></br>

(4) StringBuilder sb = new StringBuilder(String_type);</br>
(5) reverse() : 문자열 뒤집기</br></br></br></br></br>



# 5. Integer Class </br>
- Wrapper class </br></br>

(1) 문자열로 변환</br>
- Integer.toString(정수타입);</br></br></br></br></br></br>



# 6. Collections.sort()</br>
- 객체를 대상으로 sorting (기본값 : 오름차순) </br>

int count = Integer.parseInt(br.readLine()); </br>
List<Integer> list = new ArrayList<>();</br>

for (int i = 0; i < count; i++) { </br>
    list.add(Integer.parseInt(br.readLine()));</br>
}</br>

Collections.sort(list); </br>
