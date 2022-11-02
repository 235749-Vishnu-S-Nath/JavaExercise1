/**
 * The type Student.
 */
class Student{
    private int rollNo;
    private String name;
    private int age;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets roll no.
     *
     * @return the roll no
     */
    public int getRollNo() {
        return rollNo;
    }

    /**
     * Sets roll no.
     *
     * @param rollNo the roll no
     */
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    /**
     * Instantiates a new Student.
     */
    Student(){}

    /**
     * Instantiates a new Student.
     *
     * @param rollNo the roll no
     * @param name   the name
     * @param age    the age
     */
    Student(int rollNo, String name, int age){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;

    }
}