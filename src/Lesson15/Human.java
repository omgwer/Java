package Lesson15;

public class Human {
    private String gender;
    private Integer age;
    private Double weight;
    private StringBuilder name;

    Human(String gender) {
        this.gender = gender;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public StringBuilder getName() {
        StringBuilder newName = new StringBuilder(name);
        return newName;
    }

    public void setAge(Integer age) {
        if ((0 < age) && (age <= 99)) {
            this.age = age;
        } else {
            System.out.println("Error input age= " + age + " unavailable");
        }
    }

    public Integer getAge() {
        return age;
    }
}

class Test1 {
    public static void main(String[] args) {
        Human human = new Human("pony");
        human.setWeight(22.3);
        human.setAge(23);
        human.setName(new StringBuilder("Fedor"));
        var c =human.getName().append("!!!32");

        System.out.println("Age = " + human.getAge());
        System.out.println("Weight = " + human.getWeight());
        System.out.println("Weight = " + c);

    }
}



