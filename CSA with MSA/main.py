import random
import sys
import socket
import time
import numpy as np
from minineedle import needle, smith, core
import miniseq
sequences = []

np.set_printoptions(threshold=sys.maxsize)
def main():
    print("Center Star Algorithm with Multiple Sequence Alignment")
    print("-----------------------------------\n") 
    
with open('input.FASTA') as f:
    sequences = f.read().splitlines() 
# max([len(sequences) for ele in sequences])
# sorted(sequences,key=lambda x: (x[0],x[1]))

# sorted(max([len(ele) for ele in row]))
print(sequences)
alpha = 0
beta = -1
c = -1
highest=-100
finalAlign = np.zeros(((len(sequences)),len(sequences)))
for i in range(len(sequences)):
    for j in range(len(sequences)):
        alignment: needle.NeedlemanWunsch[str] = needle.NeedlemanWunsch(sequences[j], sequences[i])
        alignment.change_matrix(core.ScoreMatrix(alpha,beta,c))
        alignment.align()
        alignment.get_score()
        finalAlign[j][i] = alignment.get_score()
for i in range(len(sequences)):
    if(highest < sum(finalAlign[i])):
        highest = sum(finalAlign[i])
        center = i

# print(finalAlign)
# print(highest)
print(i)
centerSequence = sequences[i-1]
print(centerSequence)

for i in range(len(sequences)):
    alignment: needle.NeedlemanWunsch[str] = needle.NeedlemanWunsch(centerSequence, sequences[i])
    alignment.change_matrix(core.ScoreMatrix(alpha,beta,c))
    alignment.align()
    print(alignment)    
    
# updatedSeq = [sequences[0] for sub_list in sequences]
sequences.sort()
sequencesTemp = sequences[0]
sequences[center] = sequencesTemp
sequences[0] = centerSequence
print("after sort", sequences)

for i in range(len(sequences)):
    alignment: needle.NeedlemanWunsch[str] = needle.NeedlemanWunsch(centerSequence, sequences[i])
    alignment.change_matrix(core.ScoreMatrix(alpha,beta,c))
    alignment.align()
    print(alignment)    


# for i in range(len(sequences)):
#     try:
#         if(centerSequence[i][j] != sequences[i][j] and len(sequences[i]) != len(sequences[i])):
#             if (sequences[i][j]):
#                 sequences[i][j] += "_"
#     except:
#         continue
# print(sequences)
    # dictionary = {}
    # with open('test.txt') as f:
    #     count = sum(1 for _ in f)
    # dictionary = {}
    # numOfSeq = 0
    # with open(file) as f:
    #     lines = f.readlines()
    #     for line in lines:
    #         numOfSeq+=1
    #     print(numOfSeq)
    # arrayOfSeq = np.array([('', 0)])range(numOfSeq))
    # print(arrayOfSeq)
    # firstSeq = np.array(['', 999])
    # secondSeq = np.array(['', 999])
#     count =0
#     firstSeq = ""
#     secSeq = ""
#     with open(file) as f:
#         lines = f.readlines()
#         for line in lines:
#             count+=1
#             if (count%2 == 0):
#                 if(count ==2):
#                     firstSeq = line
#                 elif(count ==4):
#                     secSeq = line

#     print(firstSeq)
#     # print(len(firstSeq))
#     print(secSeq)
#     # array = np.array([[len(firstSeq) + 1] len(secSeq)+1])
#     array = np.zeros(shape=(len(secSeq),len(firstSeq)))
#     # print(array)
#     for i in range(0, len(secSeq)):
#         if (i == 0):
#             continue
#         else:
#             array[i][0] = array[i-1][0] + mismatch
#     for i in range(0, len(firstSeq)):
#         if (i == 0):
#             continue
#         else:
#             array[0][i] = array[0][i-1] + mismatch
#     print(array)
#     for i in range(1, len(secSeq)):
#         for j in range(1, len(firstSeq)):
#             print(firstSeq[j-1] + " " + secSeq[i-1])
#             if (firstSeq[j-1] == secSeq[i-1]):
#                 array[i][j] = array[i-1][j-1] + match
#             elif (firstSeq[j-1] != secSeq[i-1]):
#                 array[i][j] = array[i-1][j-1] + mismatch
#             # else
#     optimalAlign = firstSeq[len(firstSeq)-1]
#     # print(array)
#     for i in range(len(secSeq)-1, 1,-1):
#         for j in range(len(firstSeq)-1, 1,-1):
#             # optimalAlign= optimalAlign+ firstSeq[j-1]
#             # print(optimalAlign)

#             # print("here")
#             if(array[i-2][j-2]> array[i-1][j-2] and array[i-2][j-2]> array[i][j-1]):
#                 print("here")
#                 optimalAlign+=firstSeq[j-1]
#                 i-=1
#                 j-=1
#             elif(array[i-1][j-1]< array[i][j-1] and array[i+1][j]< array[i][j-1]):
#                 optimalAlign+=firstSeq[j-1]
#                 i-=1
#                 j-=1
#             elif(array[i-1][j-1]< array[i+1][j] and array[i+1][j]> array[i][j-1]):
#                 optimalAlign+=firstSeq[j]
#                 i-=1
#                 j-=1
                
#     print(optimalAlign)
#     # for seqences in arrayOfSeq:
#     #     print(seqences)
#         # firstSeq = lines.
#         # array_2d = [[0 for j in range(cols)] for i in range(rows)]

# main()