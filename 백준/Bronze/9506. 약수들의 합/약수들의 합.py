nums = [int(x) for x in iter(lambda: input(), "-1")]

for i in range(len(nums)):
  sum = 0
  result = []
  x = nums[i]

  for j in range(1, x):
    if x % j == 0:
      result.append(j)
  for k in result:
    sum += k 

  if sum == x:
    print(x, " = ", " + ".join(str(i) for i in result), sep="")
  else:
    print(x, "is NOT perfect.")