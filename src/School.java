abstract public class School
{
   private int enrollment;
//   private String schoolName;
   public abstract void describeLevel();
   public abstract void schoolName(String name);
   public void setEnrollment(int students)
   {
      enrollment = students;
   }
   public int getEnrollment()
   {
      return enrollment;
   }

   //create method is set and get school names
//   public void setName(String name)
//   {
//      schoolName = name;
//   }
//   public String getName()
//   {
//      return schoolName;
//   }
}