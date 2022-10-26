n = int(input())

numerator = 0
denominator = 0

batting_list = [int(x) for x in input().split()]

for i in range(n):
  if batting_list[i] > -1:
    numerator += batting_list[i]
    denominator += 1

print(numerator / denominator)