// 이진 변환 방법
// 1. x의 모든 0을 제거
// 2. x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 변환

// 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 

class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        
        var cnt = 0
        var cnt_zero = 0
        var str = s
       
       
        while (str != "1"){
            
            cnt_zero += str.count{it == '0'}
            
            str = str.replace("0", "")
            
            str = str.length.toString(2)
            
            cnt++
        }
        answer = intArrayOf(cnt, cnt_zero)
        return answer
    }
}