'''Caesar Cipher
 * Caesar Cipher Encryption is done by replacing each letter with the letter at 3 positions to the left.
 * e.g. 'a' is replaced with 'x','b' with 'y',...,'d' with 'a' and so on.
 * 
 * Given a ciphertext encrypted with Caeser cipher as input string find the corresponding plaintext and return the plaintext as output string.
 * 
 * Note - All the characters are in the lower case for input and output strings.
 * 
 * Input Specification
 * Input1: the ciphertext
 * Output Specification
 * Return the corresponding plaintext.
 * 
 * Example 1:
 * Input1: nrfzh
 * Output: quick
 * Explanation: Since encryption is done by replacing each letter with the letter at 3 positions to the left, therefore to decrypt, we need to find letters at 3 positions to the right.
 * The alphabet at 3 positions to the right of 'n' if 'q'.
 * Similarly, the alphabets at 3 positions to the right of 'r','f','z' and 'h' are 'u','i','c'and'k' respectively.
 * Therefore, "nrfzh" is decrypted as "quick"
 * 
 * Example 2:
 * Input1: phqgh
 * Output: sktjk
'''

def cipher(s):
    a = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
    sl = list(s)
    result = ""
    for i in sl:
        index = a.index(i)
        if index<23:
            result += a[index+3]
        elif index>=23:
            result += a[index-23]
    print(result)


s = input()
cipher(s)
