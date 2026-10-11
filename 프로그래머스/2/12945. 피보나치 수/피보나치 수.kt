// 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴

class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var pre1 = 0
        var pre2 = 1
        
        if(n < 2){
            return n
        }
        
        for (i in 0 until n-1){
            
            answer = (pre1 + pre2)%1234567
            pre1 = pre2
            pre2 = answer
        }
        
        return answer
    }
}