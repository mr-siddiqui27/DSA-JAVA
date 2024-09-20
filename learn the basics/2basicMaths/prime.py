import math
n=int(input("enter a number : "))
count=0
for i in range(1,int(math.sqrt(n))+1):
    if n%i==0:
        count+=1
        if i is not n//i:
            count+=1
if count==2:
    print("given number is a prime number :")
else:            
    print("gien number is not a prime number :")        

