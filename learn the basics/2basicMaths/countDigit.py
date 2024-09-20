import math

def method1(n):
    count=0
    while(n>0):
        count+=1
        n//=10
    print("by first method : ",count)

def method2(n):
    c=int(math.log10(n))+1       # if n//10 -> log10(n)+1    , if n//2 -> log2(n)+1
    print("by second method : ",c)

n=int(input("enter a number: "))
method1(n)
method2(n)