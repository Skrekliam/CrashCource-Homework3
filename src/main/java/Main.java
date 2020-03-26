
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Student1",4);
        Student st2 = new Student();
        st2.setName("Student2");
        st2.setRating(3);
        Student st3 = new Student("Student3");
        st3.setRating(4.5f);
        System.out.println(st1.toString());
        System.out.println( st2.toString());
        System.out.println(st3.toString());
        System.out.println("Average rating:" +Student.averageRating(st1,st2,st3));
        st3.changeRating(2.5f);
        System.out.println("Average rating:" +Student.averageRating(st1,st2,st3));

    }
}
