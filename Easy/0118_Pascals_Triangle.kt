// 118. Pascal's Triangle
// Given an integer numRows, return the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

// Example 1:
// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

// Example 2:
// Input: numRows = 1
// Output: [[1]]

// 3 Lists + 2 for loops
class Solution {
    fun generate(numRows: Int): List<List<Int>> {

        var list2: MutableList<MutableList<Int>> = mutableListOf()

        if(numRows == 0) return list2

        var firstRow: MutableList<Int> = mutableListOf()
        firstRow.add(1)
        list2.add(firstRow)
        if(numRows == 1) return list2

        for(i in 1 until numRows) {
            
            var row: MutableList<Int> = mutableListOf()
            row.add(1)
            var prevRow: MutableList<Int> = list2.get(i-1)
            
            for(j in 0 until i-1) {
                row.add(prevRow[j] + prevRow[j+1])
            }
            row.add(1)

            list2.add(row)
        }
        
        return list2
    }
}
