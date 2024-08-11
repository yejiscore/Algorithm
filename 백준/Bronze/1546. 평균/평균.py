average = int(input())
score = list(map(int, input().split()))

max_score = max(score)

new_score = 0

for i in range(average):
  new_score += score[i] / max_score * 100

print(new_score / average)