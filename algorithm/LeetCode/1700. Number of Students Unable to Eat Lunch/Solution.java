class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] counts = new int[2];

        for(int student : students){
            counts[student]++;
        }

        int n = sandwiches.length;

        for(int sandwich : sandwiches){
            if(counts[sandwich] == 0){
                break;
            }

            if(n-- == 0){
                break;
            }

            counts[sandwich]--;
        }

        return n;
    }
}