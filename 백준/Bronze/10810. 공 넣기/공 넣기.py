n, m = list(map(int, input().split()))

basket = []
for _ in range(n):
    basket.append(0)

for _ in range(m):
    a, b, c = list(map(int, input().split()))

    for i in range(a, b+1):
        basket[i-1] = c

print(*basket)