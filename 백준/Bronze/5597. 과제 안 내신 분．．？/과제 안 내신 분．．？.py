student = []
for i in range(1, 31):
  student.append(i)

submit = [int(input()) for _ in range(28)]

for i in range(28):
  if submit[i] in student:
    student.remove(submit[i])

print(min(student))
print(max(student))