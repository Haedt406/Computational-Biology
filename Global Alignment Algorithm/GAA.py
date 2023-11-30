import random
import sys
import socket
import time
import numpy as np
np.set_printoptions(threshold=sys.maxsize)
def main():
    print("<Global Alignment Algorithm>")
    print("-----------------------------------\n") 
    n = list(sys.argv)                                                                
    match = int(n[1])                                            #takes arguments from the command line to use as variables
    mismatch = int(n[2])
    insertDelete = int(n[3])
    file = (n[4])
    print("match:", match)
    print("mismatch:", mismatch)
    print("insertDelete:", insertDelete)
    print("file:", file)
    
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
    count =0
    firstSeq = ""
    secSeq = ""
    with open(file) as f:
        lines = f.readlines()
        for line in lines:
            count+=1
            if (count%2 == 0):
                if(count ==2):
                    firstSeq = line
                elif(count ==4):
                    secSeq = line

    print(firstSeq)
    # print(len(firstSeq))
    print(secSeq)
    # array = np.array([[len(firstSeq) + 1] len(secSeq)+1])
    array = np.zeros(shape=(len(secSeq),len(firstSeq)))
    # print(array)
    for i in range(0, len(secSeq)):
        if (i == 0):
            continue
        else:
            array[i][0] = array[i-1][0] + mismatch
    for i in range(0, len(firstSeq)):
        if (i == 0):
            continue
        else:
            array[0][i] = array[0][i-1] + mismatch
    print(array)
    for i in range(1, len(secSeq)):
        for j in range(1, len(firstSeq)):
            print(firstSeq[j-1] + " " + secSeq[i-1])
            if (firstSeq[j-1] == secSeq[i-1]):
                array[i][j] = array[i-1][j-1] + match
            elif (firstSeq[j-1] != secSeq[i-1]):
                array[i][j] = array[i-1][j-1] + mismatch
            # else
    optimalAlign = firstSeq[len(firstSeq)-1]
    # print(array)
    for i in range(len(secSeq)-1, 1,-1):
        for j in range(len(firstSeq)-1, 1,-1):
            # optimalAlign= optimalAlign+ firstSeq[j-1]
            # print(optimalAlign)

            # print("here")
            if(array[i-2][j-2]> array[i-1][j-2] and array[i-2][j-2]> array[i][j-1]):
                print("here")
                optimalAlign+=firstSeq[j-1]
                i-=1
                j-=1
            elif(array[i-1][j-1]< array[i][j-1] and array[i+1][j]< array[i][j-1]):
                optimalAlign+=firstSeq[j-1]
                i-=1
                j-=1
            elif(array[i-1][j-1]< array[i+1][j] and array[i+1][j]> array[i][j-1]):
                optimalAlign+=firstSeq[j]
                i-=1
                j-=1
                
    print(optimalAlign)
    # for seqences in arrayOfSeq:
    #     print(seqences)
        # firstSeq = lines.
        # array_2d = [[0 for j in range(cols)] for i in range(rows)]

main()