package Study.B;

class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        Student student = (Student) obj;
        return this.studentNum == student.studentNum;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(studentNum);
    }
}