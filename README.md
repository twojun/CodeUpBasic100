# CodeUpBasic100
1. 코딩테스트 대비를 위한 Repository입니다.
2. Java 언어로 풀이를 작성했습니다.

=========================================</br></br></br></br>




# 1. StringTokenizer</br>
(1) 코딩 테스트에서 입출력 단위 관련으로 많이 사용되는 StringTokenizer</br></br>

(2) BufferedReader를 통해 입력 받은 문자열을 파라미터로 넘어온 구분자를 기준으로 하는 토큰 단위로 나누기 위한 클래스를 말함</br></br>

(3) 특이한 점은 내부 동작 방식인데 하나의 StringTokenizer 객체가 nextToken() 메서드가 동작함에 따라 토큰의 현재 인덱스 을 별도로 저장하면서 
동작하기 때문에 다른 구분자에 대한 문자열을 기반으로 토큰을 생성하려면 새로운 객체를 생성해 줘야 한다는 점이다.</br></br></br></br></br></br>



# 2. java.lang.Math
2-1. Math.max(param1, param2)</br>
- 정수의 최댓값을 비교해 출력한다.
- ex) Math.max(Math.max(para1, para2), para3)</br></br></br></br>


2-2. Math.sqrt(int n)  
- n의 제곱수 판별해서 반환한다. 반환형은 실수형이므로 type-casting 필요 </br> </br></br></br></br></br>





# 3. 배열 </br>
3-1. 배열 오름차순 정렬 
- Arrays.sort(arr);</br></br></br></br>


3-1. 배열의 참조 특성</br>
- 배열도 객체이기 때문에 아래와 같은 연산이 가능

      for (int i = 0; i < K; i++) {
            int[] newArr = new int[N - 1];
            for (int j = 0; j < N - 1; j++) {
                newArr[j] = arr[j + 1] - arr[j]; // 인접한 두 원소의 차이를 계산하여 새로운 배열에 저장
            }
            arr = newArr; // 새로운 배열로 갱신
            N--; // 배열의 길이 감소
        }
- 이런 경우 newArr의 참조 주소값이 arr 참조 주소에 덮어씌워지므로 arr 배열의 참조 변수는 newArr 배열의 참조변수를 가르키게 된다.</br></br></br></br></br></br>






# 4. StringBuilder</br>
(1) StringBuilder는 문자열을 효과적으로 다루기 위해 자바에서 제공하는 기본 문자열 클래스이며 기존 String클래스가 갖는 불변성을 떠나 StringBuilder는 가변성을 가진다.</br></br>
(2) 문자열의 추가, 삭제 등 다양한 작업이 가능하다.</br></br>
(3) thread-safe하지 않기 때문에 스레드 안정성을 고려한다면 StringBuffer를 사용한다.</br></br>

(4) StringBuilder sb = new StringBuilder(String_type);</br>
(5) reverse() : 문자열 뒤집기</br></br></br></br>



4-1. StringBuilder.setCharAt(int index, char c);
- 문자열의 특정 인덱스를 다른 문자로 변환 가능하다. </br>
- parameter(변환 인덱스, 변환할 문자)</br></br>

- 적용 코드</br>

        for (int i = 0; i < my_string.length(); i++) {
            sb.append(my_string.charAt(i));  // hello
        }
        
        sb.setCharAt(num1, my_string.charAt(num2));
        sb.setCharAt(num2, my_string.charAt(num1));
        
        return String.valueOf(sb);   // hlelo

</br></br></br></br></br></br>







# 5. java.lang.String </br>
5-1. String.toLowerCase(), toUpperCase(), 
- String 클래스에서 사용 가능, 대소문자 변환 </br></br></br></br>



5-2. String.valueOf(Object[] obj ... primitive type)
- 기본형 타입 데이터를 문자열로 변환한다.</br></br></br></br></br></br></br>










# 6. java.lang.Integer Class </br>
- Wrapper class </br></br>

6-1. 문자열로 변환</br>
- Integer.toString(정수타입);</br></br></br>


6-2. Integer.toString()
- 정수 > 문자열 변환 </br> </br></br></br></br></br></br></br>







# 7. java.lang.Character</br>
- Wrapper class </br></br>

7-1. Character.getNumericValue(ch)</br>
- 문자를 정수로 변환 (JAVA 11, java.lang package)</br></br></br></br>



7-2. Character.isLowerCase(), isUpperCase()</br>
- 문자의 대/소문자 여부 판단, return : boolean type</br></br></br></br></br></br>









# 8.Collections.sort()</br>
- 객체를 대상으로 sorting (기본값 : 오름차순) </br>

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb);

        br.close();
</br></br></br></br></br></br>




# 9. Java Regular Expression(정규표현식)</br>
(1) 정규표현식은, 특정 문자열이 정해진 규칙(regex)대로 표현되어 있는지 검증하는 식이다. </br></br></br></br></br></br>






# 9. PS를 하며 기록.. </br>
9-1. WrapperClass.valueOf(primitive type)
- 기본형 타입 데이터를 해당하는 Wrapper class 객체로 변환</br></br></br></br></br></br>






# 10. Java Stream API</br>
10-1. 리스트의 중복된 요소를 삭제</br>

        for (int num : list) {
            list2.add(num % 42);
        }

        Collections.sort(list2);
        
        List<Integer> deleteDuplicateElements = list2.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(deleteDuplicateElements.size());

(1) .stream() : 요소들을 스트림 형태로 변환 </br>
(2) .distinct() : 요소의 중복을 제거  </br>
(3) collect(Collectors.toList()) : 새로운 형태의 리스트로 반환 </br> </br>

백준 문제를 풀면서 작성했던 코드이다. list2의 요소들을 스트림으로 변환하고 요소들의 중복을 제거하는 distinct(), 
마지막으로 collect(Collectors.toList()) 메서드를 사용하여 중복이 제거된 요소를 포함하는 새로운 리스트가 반환된다.








