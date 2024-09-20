def checkPalindrome(str,first,last):
    if first>=last:
        print("yes")
        return
    if str[first]!=str[last]:
        print("no")
        return
    checkPalindrome(str,first+1,last-1)
def checkPalindrome2(str,first,last):
    if first>=last:
        return True
    if str[first]!=str[last]:
        return False
    return checkPalindrome2(str,first+1,last-1)
        

name=input("enter a string : ")
#method 1 without return type
checkPalindrome(name,0,len(name)-1)
check=checkPalindrome2(name,0,len(name)-1)
if check:
    print("yes")
else:
    print("no")    
