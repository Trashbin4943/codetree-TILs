n,m=map(int,input().split())

listing=[
    [0 for i in range (m)]
    for j in range (n)
]
cnt=0
for o in range (m):
    if o%2==0:
        for k in range (n):
            listing[k][o]=cnt
            cnt+=1
    else:
        for k in range (n-1,-1,-1):
            listing[k][o]=cnt
            cnt+=1

for row in range (n):
    for line in range (m):
        print(listing[row][line],end=" ")
    print()