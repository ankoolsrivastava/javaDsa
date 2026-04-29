package javaCollection.Set.HashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
// if we want to use the hashset on a custom class(Student) we need to override two methods -->
//      equals() and hashCode();


public class Student {
    int id;
    String name ;
    public Student(int id,String name){
        this.id=id;
        this.name=name;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    static void main(String[] args) {
        Set<Student> st=new HashSet<>();
        st.add(new Student(1,"Ankool"));
        st.add(new Student(2,"Anup"));
        st.add(new Student(1,"Ankool"));
        st.add(new Student(2,"Ankool"));
        System.out.println(st);

    }
}
