M = int(input())
N = int(input())
result = []

for i in range(M, N+1):
    if i < 2:
        continue
    for j in range(2, int(i**0.5) + 1):
        if i % j == 0:
            break
    else:
        result.append(i)

if result:
    print(sum(result))
    print(min(result))
else:
    print(-1)
