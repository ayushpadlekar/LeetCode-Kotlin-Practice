// 119. Pascal's Triangle II
// Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

// Example 1:
// Input: rowIndex = 3
// Output: [1,3,3,1]

// Example 2:
// Input: rowIndex = 0
// Output: [1]

// Example 3:
// Input: rowIndex = 1
// Output: [1,1]


// 4 lists + 2 for loops
class Solution {
    fun getRow(rowIndex: Int): List<Int> {
    
    var list2: MutableList<MutableList<Int>> = mutableListOf()
        
    var firstRow: MutableList<Int> = mutableListOf()
    firstRow.add(1)
    list2.add(firstRow)

    for(i in 1..rowIndex) {

        var row: MutableList<Int> = mutableListOf()
        row.add(1)
        var prevRow: MutableList<Int> = list2.get(i-1)

        for(j in 0 until i-1) {
            row.add(prevRow[j] + prevRow[j + 1])
        }
        row.add(1)

        list2.add(row)
    }
    
    return list2[rowIndex]
    }
}
