class Solution:
    def climbStairs(self, n: int) -> int:
        if n == 0 or n ==1:
            return 1
        else:
            return climbStairs(n-1) + climbStairs(n-2)    
        

print(climbStairs(4))