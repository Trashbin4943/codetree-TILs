numli=[]
for j in range (7):
    num=list(map(int,input().split()))
    numli.append(num)

for i in range (3):
    for k in range(3):
        print(numli[i][k]*numli[i+4][k],end=" ")
    print()