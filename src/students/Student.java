package students;

public class Student {
    final static int NUM_OF_LESSONS = 7;
    String surname;
    boolean[] visits;
    int[] marks;

    public Student(String surname){
        this.surname = surname;
        this.visits = new boolean[NUM_OF_LESSONS];
        this.marks = new int[NUM_OF_LESSONS];
    }
    public void setMarks(int mark, int lessonNum) {
        marks[lessonNum - 1] = mark;
    }

    public void setVisits(boolean visit, int lessonNum) { visits[lessonNum - 1] = visit;
    }


}







