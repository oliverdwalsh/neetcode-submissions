class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int studentsOne = 0;
        int studentsZero = 0; 

        for (int student : students) {
            if (student == 1) {
                studentsOne++;
            } else {
                studentsZero++;
            }
        }

        for(int sandwich : sandwiches){
            if (sandwich == 1 && studentsOne > 0) {
                studentsOne--;
            } else if (sandwich == 0 && studentsZero > 0){
                studentsZero--;
            } else {
                break;
            }
        }

        return studentsOne + studentsZero;
        
    }
}