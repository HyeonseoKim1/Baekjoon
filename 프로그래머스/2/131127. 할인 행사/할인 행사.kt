class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer = 0
        val map = mutableMapOf<String,Int>()
        
        for (i in want.indices){
            map[want[i]] = number[i]
        }
        
        for (i in 0..discount.size - 10){
            val period = discount.slice(i..i+9)
        
            val periodMap = mutableMapOf<String,Int>()
            for(item in period){
                periodMap[item] = (periodMap[item] ?:0) +1
            }
            
            var chk = 1
            for((key,value) in map) {
                if(periodMap.getOrDefault(key,0) < value){
                    chk = 0
                    break
                }
            }
            
            answer += chk
        }

        return answer
    }
}