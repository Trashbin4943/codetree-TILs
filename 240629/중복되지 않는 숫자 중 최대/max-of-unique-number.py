n=int(input())
num=list(map(int,input().split()))

for i in (num):
    if num.count(i)>=2:
        while i in num:
            num.remove(i)
    else:
        break

if num==[]:
    print(-1)
else:
    print(max(num))