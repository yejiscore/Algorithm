n, m = list(map(int, input().split()))

basket = []
for i in range(n):
    basket.append(i+1)

for _ in range(m):
    a, b = list(map(int, input().split()))
    
    for i in range((b-a+1)//2):
        basket[a-1+i], basket[b-1-i] = basket[b-1-i], basket[a-1+i]

print(*basket)