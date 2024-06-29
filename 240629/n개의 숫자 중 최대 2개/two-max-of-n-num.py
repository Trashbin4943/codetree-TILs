n=int(input())
num=list(map(int,input().split()))
num.sort(reverse=True)

print(num[0],end=" ")
print(num[1])