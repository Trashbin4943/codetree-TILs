n=int(input())
num=list(map(int,input().split()))

diff=[]
for i in range (n):
    for j in range (i+1,n):
        apex=num[j]-num[i]
        diff.append(apex)

print(min(diff))