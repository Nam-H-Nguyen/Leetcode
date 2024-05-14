
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        str1 = {}
        str2 = {}
        
        for letter in s:
            str1[letter] = str1.get(letter, 0) + 1

        for letter in t:
            str2[letter] = str2.get(letter, 0) + 1

        return str1 == str2

            

test = Solution()
print(test.isAnagram(s = "anagram", t = "agaram")) # 4