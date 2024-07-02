n,m=map(int,input().split())

arr1=[
    list(map(int,input().split()))
    for i in range (n)
]

arr2=[
    list(map(int,input().split()))
    for k in range (n)
]

arr3=[
    [0 for i in range (m)]
    for a in range (n)
]

for row in range (n):
    for line in range (m):
        if arr1[row][line] == arr2[row][line]:
            arr3[row][line]=0
        else:
            arr3[row][line]=1

for sero in range (n):
    for garo in range (m):
        print(arr3[sero][garo],end=" ")
    print()