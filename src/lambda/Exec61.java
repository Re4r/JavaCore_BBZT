package lambda;

public class Exec61 {

}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student: (");
        sb.append("name: '").append(name).append('\'');
        sb.append(", sex: ").append(sex);
        sb.append(", age: ").append(age);
        sb.append(", course: ").append(course);
        sb.append(", avgGrade: ").append(avgGrade);
        sb.append(')');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (getSex() != student.getSex()) return false;
        if (getAge() != student.getAge()) return false;
        if (getCourse() != student.getCourse()) return false;
        if (Double.compare(student.getAvgGrade(), getAvgGrade()) != 0) return false;
        return getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName().hashCode();
        result = 31 * result + (int) getSex();
        result = 31 * result + getAge();
        result = 31 * result + getCourse();
        temp = Double.doubleToLongBits(getAvgGrade());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
