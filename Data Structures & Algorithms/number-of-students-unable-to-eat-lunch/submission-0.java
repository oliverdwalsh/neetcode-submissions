class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        // first student takes sandwich or else moves to the end
        // next student repeats until no more matches
        // return size of students

        // use stack but revert arrary first?  

        // Stack s = new Stack<>();

        // for(int student : students){
        //     s.push(student);
        // }

        int studentsOne = 0;
        int studentsZero = 0; 


        // while(!done)
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