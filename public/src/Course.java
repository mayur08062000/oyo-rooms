public class Course {
    static int maxCapicity=100;
    String CourseName;
    int price;
    int enrollment;

    String[] enrolledStudents;

    Course(String CourseName){
        this.CourseName = CourseName;
        this.enrollment=0;
        this.enrolledStudents = new String[maxCapicity];
    }



   static void setMaxCapicity(int maxCapicity){
       Course.maxCapicity = maxCapicity;


   }

   void enrolledStudent(String studentName){
       enrolledStudents[enrollment]=studentName;
       enrollment++;
   }

   void  unenrolledStudents(String studentName){
       System.out.println("Student Removed");
       enrollment--;
   }


   Course online = new Course("internet");
}
