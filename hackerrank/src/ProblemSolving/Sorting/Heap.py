class Heap:
    A = [0]
    size = 0

## Left child of a given node
def left(i):
    return 2*i


## Right child of a given node
def right(i):
    return 2*i +1

## Parent of a given node
def parent(i):
    return i // 2



## Insert min value in the given heap
def insert_min_heap(heap, value):
    heap.A.append(value)
    heap.size += 1
    min_heapify(heap, parent(heap.size))


## Corrects the violation on a given sub heap
## Precondition: the whole heap is a correct min heap except that sub heap
def min_heapify(heap, i):
        rightChild = right(i)
        leftChild = left(i)
        if leftChild <= heap.size and heap.A[leftChild] < heap.A[i]:
            min = leftChild
        if rightChild <= heap.size and heap.A[rightChild] < heap.A[i]:
            if not min or heap.A[rightChild] < heap.A[min]:
                min = rightChild
        if min:
            swap(min, i, heap.A)
            min_heapify(heap, parent(i))
      



## Swaps the two given indexes with each other
def swap(first, second, A):
    temp = A[first]
    A[first] = A[second]
    A[second] = temp

## Gets the minimum
def min(heap):
    return heap.A[1]


## Get and delete the minimum
def extract_min(heap):
    min = heap.A[1]
    heap.A[1] = heap.A[heap.size]
    heap.A[heap.size] = min
    min_heapify(heap, 1)




heap = Heap()
insert_min_heap(heap, 3)
insert_min_heap(heap, 4)
insert_min_heap(heap, 5)
insert_min_heap(heap, 2)
insert_min_heap(heap, 9)
