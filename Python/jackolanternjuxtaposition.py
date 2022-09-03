'''
N: num of eye designs, T: num of nose designs
M: num of mouth designs
Output: number of different possible designs
'''
n, t, m = map(int, input().split())
print(int(n * t * m))