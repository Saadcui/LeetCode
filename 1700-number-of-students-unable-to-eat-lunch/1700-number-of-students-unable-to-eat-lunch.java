class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];

        // Count students who prefer each type
        for (int student : students) {
            count[student]++;
        }

        // Process sandwiches from top to bottom
        for (int sandwich : sandwiches) {
            if (count[sandwich] == 0) {
                break;
            }

            count[sandwich]--;
        }

        return count[0] + count[1];
    }
}
