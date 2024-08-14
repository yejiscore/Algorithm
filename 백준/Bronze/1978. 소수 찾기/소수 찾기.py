n = int(input())
nums = [int(x) for x in input().split()]
cnt = 0

for x in nums:
  for i in range(2, x+1):
    if x % i == 0:
      # 찾은 약수가 자기 자신이라면 소수
      if x == i:
        cnt += 1
      # 약수를 찾았으므로 더이상 볼 필요 없음
      break

print(cnt)