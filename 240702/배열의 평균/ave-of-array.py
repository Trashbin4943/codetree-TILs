listing=[]
for i in range (2):
    listing.append(list(map(int,input().split())))

for j in range (2):
    garo=0
    for k in range (4):
        garo+=listing[j][k]
    avv=garo/4
    print(f"{avv:.1f}",end=" ")
print()

for m in range (4):
    sero=0
    for n in range (2):
        sero+=listing[n][m]
    avv2=sero/2
    print(f"{avv2:.1f}",end=" ")
print()

sumval=sum(listing[0])+sum(listing[1])
print(f"{sumval/8:.1f}")