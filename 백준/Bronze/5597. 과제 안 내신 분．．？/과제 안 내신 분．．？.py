student = []
for i in range(1, 31):
  student.append(i)

for i in range(28):
  submit = int(input())
  if submit in student:
    student.remove(submit)

print(min(student))
print(max(student))