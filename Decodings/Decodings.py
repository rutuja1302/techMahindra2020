'''Number of Decodings
Consider the following encoding scheme,
A->1, B->2,... Z->26
Given an encoding using this scheme(a string containing at most 1000 digits), find the number of possible decodings.
The function should return a string containing number of decodings
Note: The input string contains valid digits from 0 to 9 and there are no leading 0's, no extra trailing zeros and no to or more consecutive zeros

Input Specification:
Input1: the input string
Output:
Return a string representing the number of possible decodings.

Example 1:
Input1: 121
Output: 3

Example 2:
Input1: 12345
Output: 3
'''
#from itertools import permutations
def decode(input1):
    l = list(input1)
    decodes=[]
    for i in range(0,len(l)-1):
        d = int(l[i]+l[i+1])
        if d>=1 and d<=26:
            decodes.append(d)
    return str(len(decodes)+1)

#read input1
s = input()
print(decode(s))
