class Student{
   private String IDnumber;
   private int Numofcreds;
   private double Gradepoints;
   private int Points;

   public Student(){
   }
   public Student(String aIDnumber, int aNumofcreds, int aPoints){
       super();
       IDnumber=aIDnumber;
       Numofcreds=aNumofcreds;
       Points=aPoints;
       calculateGradePoint();
   }

   public String getIDnumber() {
       return IDnumber;
   }
   public void setIDnumber(String aIDnumber){
       IDnumber=aIDnumber;
   }
   public int getNumofcreds(){
       return Numofcreds;
   }
   public void setNumofcreds(int aNumofcreds){
       Numofcreds=aNumofcreds;
   }
   public int getPoints(){
       return Points;
   }
   public void setPoints(int aPoints){
       Points=aPoints;
   }
  
   public String toString(){
       return "ID: " + IDnumber + " NumberOfCredits: " + numofcreds + " Points: " + Points + " Grade Point: " + Gradepoints;
   }
   public void calculateGradePoint(){
       gradePoint=Points/(double)Numofcreds;
   }
}
