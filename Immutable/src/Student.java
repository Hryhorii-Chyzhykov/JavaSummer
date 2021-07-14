public final class Student {
    private final String name;
    private final Age age;


    public Student(String name, Age age) {
        this.name = name;
        Age tempAge = new Age(age.getYearsOld());
        this.age = tempAge;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        return new Age(this.age.getYearsOld());
    }
    public Student setName (String name) {return new Student(name, this.age); }
    public  Student setAge (Age age) {return new Student(this.name, age); }
}
