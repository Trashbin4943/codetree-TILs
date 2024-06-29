n=int(input())
num=list(map(int,input().split()))
a=0
for i in (num):
    if num.count(i)==2:
        while i in num:
            num.remove(i)

if num==[]:
    print(-1)
else:
    print(max(num))