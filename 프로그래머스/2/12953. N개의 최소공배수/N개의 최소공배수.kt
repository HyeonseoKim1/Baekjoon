// n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수

class Solution {
    
    
    // 최대공약수
    fun gcd(n:Int, m:Int): Int{
        if(m == 0) return n
        return gcd(m,n%m)
    }

    
    fun solution(arr: IntArray): Int {

        var gcd = gcd(arr[0],arr[1])
        var answer =  arr[0] / gcd *arr[1]
        
        for (i in 2..arr.size-1){
            gcd = gcd(answer,arr[i])
            answer = answer / gcd * arr[i]
        }
         
        return answer
    }
}