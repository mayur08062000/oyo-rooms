public class StudentToString {
    String name;
    int age;
    String rollnumber;
    String house;


    public StudentToString(String name, int age, String rollnumber, String house) {
        this.name = name;
        this.age = age;
        this.rollnumber = rollnumber;
        this.house = house;
    }

    public String toString(){
        return "Student Details : {name:"+name
                +", age:"+age
                +", roll number :" +rollnumber
                +" ,house :"+house+"}";
    }

    public static void main(String[] args) {
        StudentToString Stusent1 = new StudentToString("mayur",24,"06","building1");
        System.out.println(Stusent1);
    }
}
