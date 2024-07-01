listing=[]
for a in range (4):
    listing.append(list(map(int,input().split())))

cnt=0
for i in range (4):
    for k in range (i+1):
        cnt+=listing[i][k]

print(cnt)