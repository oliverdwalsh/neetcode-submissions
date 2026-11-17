class Solution {
    // public int countStudents(int[] students, int[] sandwiches) {
    //     int studentsOne = 0;
    //     int studentsZero = 0; 

    //     for (int student : students) {
    //         if (student == 1) {
    //             studentsOne++;
    //         } else {
    //             studentsZero++;
    //         }
    //     }

    //     for(int sandwich : sandwiches){
    //         if (sandwich == 1 && studentsOne > 0) {
    //             studentsOne--;
    //         } else if (sandwich == 0 && studentsZero > 0){
    //             studentsZero--;
    //         } else {
    //             break;
    //         }
    //     }

    //     return studentsOne + studentsZero;
        
    // }

    public int countStudents(int[] students, int[] sandwiches){
        Deque<Integer> StudentsDeque = new ArrayDeque<>();
        Deque<Integer> SandwichesDeque = new ArrayDeque<>();

        for(int s : students) StudentsDeque.addLast(s);
        for(int s : sandwiches) SandwichesDeque.addLast(s);

        int attempts = 0;
        while(!SandwichesDeque.isEmpty() && attempts < SandwichesDeque.size()){
            if(StudentsDeque.peekFirst().equals(SandwichesDeque.peekFirst())){
                StudentsDeque.removeFirst();
                SandwichesDeque.removeFirst();
                attempts = 0;
            } else {
                int temp = StudentsDeque.removeFirst();
                StudentsDeque.addLast(temp);
                attempts++;
            }
        }
        return StudentsDeque.size();
    }
}