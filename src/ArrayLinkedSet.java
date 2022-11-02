import java.util.*;

public class ArrayLinkedSet {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        long time1;
        long time2;
        time1=System.currentTimeMillis();
        System.out.println("\n"+time1);

        List<Student> studentArrayList = new ArrayList<>();
        for(int i=0;i<14000;i++) {
            Student studentObject = new Student();
            studentObject.setRollNo(i);
            studentArrayList.add(studentObject);
        }
        Student newStudent1 = new Student();
        newStudent1.setRollNo(14000);
        studentArrayList.add(newStudent1);
        for(Student eachStudent:studentArrayList) {
            System.out.print(eachStudent.getRollNo() + " ");
        }
        time2=System.currentTimeMillis();
        System.out.println("\n"+time2);
        System.out.println("Time measured for ArrayList in millisecond: "+(time2-time1)+" ms.");

        time1=System.currentTimeMillis();
        System.out.println("\n"+time1);
        List<Student> studentLinkedList = new LinkedList<>();
        for(int i=0;i<14000;i++) {
            Student studentObject = new Student();
            studentObject.setRollNo(i);
            studentLinkedList.add(studentObject);
        }
        Student newStudent2 = new Student();
        newStudent2.setRollNo(14000);
        studentLinkedList.add(newStudent2);
        for(Student eachStudent:studentLinkedList) {
            System.out.print(eachStudent.getRollNo() + " ");
        }
        time2=System.currentTimeMillis();
        System.out.println("\n"+time2);
        System.out.println("Time measured for LinkedList in millisecond: "+(time2-time1)+" ms.");

        time1=System.currentTimeMillis();
        System.out.println("\n"+time1);
        Set<Student> studentHashSet = new HashSet<>();
        for(int i=0;i<14000;i++) {
            Student studentObject = new Student();
            studentObject.setRollNo(i);
            studentHashSet.add(studentObject);
        }
        Student newStudent3 = new Student();
        newStudent3.setRollNo(14000);
        studentHashSet.add(newStudent3);
        for(Student eachStudent:studentHashSet){
            System.out.print(eachStudent.getRollNo()+" ");
        }
        time2=System.currentTimeMillis();
        System.out.println("\n"+time2);
        System.out.println("Time measured for HashSet in millisecond: "+(time2-time1)+" ms.");
    }
}
