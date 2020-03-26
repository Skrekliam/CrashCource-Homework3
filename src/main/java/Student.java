public class Student {
    private String name;
    private float rating;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Student(){}
    public Student(String name){
        this.name = name;

    }
    public Student(String name,float rating){
        this.name = name;
        this.rating = rating;
    }

    public boolean betterStudent(Student obj1,Student obj2){

      return  obj1.getRating() > obj2.getRating();
    }
    @Override
    public String toString(){
        return  "Student name :" + this.name + " rating: " + this.rating;
    }
    public void changeRating( float rating){
        setRating(rating);
        System.out.println("Rating of " + name + " now is " + rating);
    }
    public static float averageRating(Student... rating ){
        double average=0;
        int cnt = 0;
        for (Student r: rating) {
            average += r.rating;
            cnt++;
        }
            return (float) (average/cnt);
        }
    }

