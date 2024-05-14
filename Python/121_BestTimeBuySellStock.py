
class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        buy = prices[0]
        profit = 0

        for i in range(1, len(prices)):
            if prices[i] < buy:
                buy = prices[i]
            elif prices[i] - buy > profit:
                profit = prices[i] - buy 
        return profit    

test = Solution()
print(test.maxProfit([7,1,5,3,6,4])) # 5
print(test.maxProfit([7,6,4,3,1])) # 0