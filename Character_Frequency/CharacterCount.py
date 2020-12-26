''' Program to count each character's frequency
Example:
Input: banana
Output: a3b1n2
'''
def frequency(input1):
    l = list(input1)
    x= list(set(l))
    x.sort()
    result=""
    for i in range(0,len(x)):
        count=0
        for j in range(0,len(l)):
            if x[i]==l[j]:
                count +=1
        result += x[i]+str(count)
    print(result)
            
s = input()
frequency(s)
