n, m = map(int, input().split())

basket = []
for i in range(1, n+1):
  basket.append(i)

for _ in range(m):
  a, b = map(int, input().split())
  basket[a-1], basket[b-1] = basket[b-1], basket[a-1]

print(*basket)