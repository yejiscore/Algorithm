n = int(input())
num_list = []

for _ in range(n):
    num = int(input())
    if num not in num_list:
        num_list.append(num)

num_list.sort()
for i in range(len(num_list)):
    print(num_list[i])