n, m = list(map(int, input().split()))

# n개의 바구니 공간을 만들어준다.
# 공이 들어있지 않은 바구니는 0을 출력하라고 했으므로
# 모든 바구니를 0으로 설정한다.
# basket = [0, 0, 0, ... , 0]
basket = []
for _ in range(n):
  basket.append(0)

for _ in range(m):
  i, j, k = map(int, input().split())

  for x in range(i, j+1):
    basket[x-1] = k

print(*basket)