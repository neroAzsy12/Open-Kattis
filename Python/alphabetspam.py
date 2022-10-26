word = input()

white = 0
upper = 0
lower = 0
symbol = 0

word_len = len(word)

for char in word:
    if char == '_':
        white += 1
    elif ord(char) >= 65 and ord(char) <= 90:
        upper += 1
    elif ord(char) >= 97 and ord(char) <= 122:
        lower += 1
    else:
        symbol += 1

print(white / word_len)
print(lower / word_len)
print(upper / word_len)
print(symbol / word_len)