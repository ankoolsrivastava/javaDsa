package javaCollectionFrameworks.Collection.Queue.PriorityQueue;

public class Students implements Comparable<Students>{
    int age;
    String name;
    int weight;

    public Students(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }


    @Override
    public int compareTo(Students that) {
//        ascending order sort
//        if weight got same then compare it with name;

        if(this.weight==that.weight){
            return this.name.compareTo(that.name);
        }
        return this.weight-that.weight;

//        for descending order
//        return  that.weight-this.weight;
    }
}
