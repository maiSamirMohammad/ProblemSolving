class Solution {
    fun maxProfit(prices: IntArray): Int {
     if (prices==null || prices.isEmpty()){
        return 0
     }
     var minPrice= Int.MAX_VALUE
     var maxProfit= 0
     for (price in prices){
        if (price < minPrice){
            minPrice=price
        }else{
            maxProfit= maxOf(maxProfit, price-minPrice)
        }
     }
     return maxProfit
    }
}