n, m = map(int, input().split())

basket = []
for i in range(1, n+1):
  basket.append(i)

for _ in range(m):
  i, j = map(int, input().split())

  for x in range((j-i+1)//2):
        basket[i-1+x], basket[j-1-x] = basket[j-1-x], basket[i-1+x]

print(*basket)