def list = [1, 2, 3, 4, 5]

// Solution 1: Using collect
def doubledList = list.collect { it * 2 }
println doubledList // Output: [2, 4, 6, 8, 10]

// Solution 2: Using collect with closure
def doubledList2 = list.collect { num -> num * 2 }
println doubledList2 // Output: [2, 4, 6, 8, 10]

// Solution 3:  Creating a new list in each loop (less efficient but demonstrates alternative handling)
def doubledList3 = []
list.each { doubledList3 << it * 2 }
println doubledList3 // Output: [2, 4, 6, 8, 10]