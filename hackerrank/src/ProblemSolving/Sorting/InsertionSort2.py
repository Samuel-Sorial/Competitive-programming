#!/bin/python3

import math
import os
import random
import re
import sys

def insertionSort2(n, arr):
    # Start with key, at index 1
    k = 1
    # Loop through the array
    while k < n:
        key = arr[k]
        i = k - 1
        # if the key is less than previous, swap
        while i >= 0 and arr[i] > key:
            arr[i+1] = arr[i]
            i = i - 1
        arr[i+1] = key
        k = k + 1
        printArray(arr)


def printArray(arr):
    for i in arr:
        print(i, end = ' ')
    print()

if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    insertionSort2(n, arr)
