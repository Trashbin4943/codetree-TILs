n=int(input())
num=list(map(int,input().split()))

print(min(num),end=" ")
print(num.count(min(num)))