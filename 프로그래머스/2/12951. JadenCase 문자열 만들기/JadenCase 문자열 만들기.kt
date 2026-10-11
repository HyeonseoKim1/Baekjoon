// JadenCase : 각 단어의 첫 글자는 대문자, 나머지 글자는 전부 소문자로 만드는 문자열 포맷
// Kotlin의 split()은 List<String>(읽기 전용 리스트)를 반환 -> .toMutableList() 또는 map 사용

class Solution {
    fun solution(s: String): String {
        var answer = ""
        var lst = s.split(" ").map{it.lowercase()
                                    .replaceFirstChar{it.uppercase()}
        }
        
        print(lst)
        
        return lst.joinToString(" ")
  
    }
    
}