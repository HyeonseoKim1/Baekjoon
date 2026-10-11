// 원형 수열의 연속 부분 수열 합으로 만들 수 있는 수의 개수
// 최대 길이 = elements 크기

class Solution {
    fun solution(elements: IntArray): Int {
        var answer: Int = 0
        var sums = mutableSetOf<Int>()
        var nums = elements + elements
        //print(nums.contentToString())
        
        for (i in 1 until elements.size+1){
            for (j in 0 until elements.size){
                sums.add(nums.slice(j..j+i-1).sum())
            }
            
            //println("$i, $sums")
        }
        
        //print(sums)
        answer = sums.size
        
        return answer
    }
}