public class SchoolDemo
{
   public static void main(String[] args)
   {
       // high school
       HighSchool wilsonHigh = new HighSchool();
       wilsonHigh.setEnrollment(400);
       wilsonHigh.describeLevel();

       System.out.println("Enrollment is " +
          wilsonHigh.getEnrollment());
       //System.out.println("The name of the school is " + wilsonHigh.getName() + "\n");

       // high school name
       //wilsonHigh.setName("Wilson High School");
       //wilsonHigh.getName();
       wilsonHigh.schoolName("Wilson High School\n");


        // middle school
       MiddleSchool easternMiddle = new MiddleSchool();
       easternMiddle.setEnrollment(250);

       easternMiddle.describeLevel();
       System.out.println("Enrollment is " +
               easternMiddle.getEnrollment());
       //System.out.println("The name of the school is " + easterMiddle.getName());

       // middle school name
       //easternMiddle.setName("Eastern Middle School");
       //easternMiddle.getName();
       easternMiddle.schoolName("Eastern Middle School\n");


       // high school 2
       HighSchool pulaskiHigh = new HighSchool();
       pulaskiHigh.setEnrollment(1300);
       pulaskiHigh.describeLevel();

       System.out.println("Enrollment is " +
               pulaskiHigh.getEnrollment());
       //System.out.println("The name of the school is " + pulaskiHigh.getName() + "\n");

       // high school name
       //wilsonHigh.setName("Pulaski County High School");
       //wilsonHigh.getName();
       wilsonHigh.schoolName("Pulaski County High School");
   }
}