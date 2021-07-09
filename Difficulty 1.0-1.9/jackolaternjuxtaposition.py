from sys import stdin, stdout

features = [int(x) for x in stdin.readline().split()]
stdout.write(str(features[0] * features[1] * features[2]) + '\n')