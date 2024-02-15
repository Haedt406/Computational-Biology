def binarySearch(pattern, sequence, suffixArray):
    low = 0
    high = len(sequence) - 1
    while low <= high:
        mid = (low + high) // 2
        # matches = ""
        suffix = sequence[suffixArray[mid]:]
        if pattern == suffix[:len(pattern)]:
            return suffixArray[mid]
        elif pattern < suffix[:len(pattern)]:
            high = mid - 1
        else:
            low = mid + 1
    return -1  

def buildSuffixArray(sequence):
    global n
    n = len(sequence)
    global suffixes
    suffixes = [(sequence[i:], i+1) for i in range(n)]
    suffixes.sort()
    suffixArray = [suffix[1] for suffix in suffixes]
    # for i in suffixArray:
    #     suffixArray.sort()
    # fobprint(suffixes[suffixArray[i]])
    return suffixArray


with open('input.fasta', 'r') as file:
    header = file.readline()
    sequence = file.readline().strip() + '$'
suffixArray = buildSuffixArray(sequence)
# print(suffixes)
for i, sa in enumerate(suffixArray):
    print(f'SA[{i+1}] = {sa} Sequence: {sequence[i:]}')

pattern = input("Enter pattern to find: ")
# print(sequence[:-1])
result = binarySearch(pattern, sequence[:-1], suffixArray)

if result != -1:
    # if(result-2) >= 0 :
    print(f'Pattern "{pattern}" found at position {result}.')
    # else:
    #     print(len(suffixArray))
    #     print(abs(result-2))
    #     n = len(suffixArray) - abs(result-2)
    #     print(f'Pattern "{pattern}" found at position {result} and {n}')
else:
    print(f'Pattern "{sequence}" not found in the sequence.')