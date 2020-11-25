#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the insertionSort1 function below.
def insertionSort1(n, arr):
    # Store the unsorted key
    key = arr[n-1]
    # Iterate over the sorted array for the right,
    # If key is greater, then put it in i + 1
    # If the key is smaller, ith value to i + 1, make i = i - 1 
    i = n - 1
    while i >= 0:
        if i == 0:
            arr[i] = key
            break
        elif arr[i-1] < key:
            arr[i] = key
            break
        else:
            arr[i] = arr[i-1]
            i = i - 1
        printArray(arr)
    printArray(arr)


def printArray(arr):
    for i in arr:
        print(i, end = ' ')
    print()
if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    insertionSort1(n, arr)
