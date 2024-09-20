import math
n=int(input("enter a number : "))
list=[]
for i in range(1,int(math.sqrt(n)+1)):
    if n%i==0:
        list.append(i)
        if i is not n//i:
            list.append(n//i)
print(sorted(list))        

