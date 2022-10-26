def hailstone(n):
  if n == 1:
    return n
  
  if n % 2 == 0:
    return n + hailstone(n//2)
  
  return n + hailstone(3 * n + 1)

print(hailstone(int(input())))