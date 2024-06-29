n=int(input())
num=list(map(int,input().split()))

for i in (num):
    if num.count(i)>1:
        while i in num:
            num.remove(i)
for j in num:
    if num.count(j)>1:
        while j in num:
            num.remove(j)

if num==[]:
    print(-1)
else:
    print(max(num))