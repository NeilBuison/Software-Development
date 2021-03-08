public class Person
{
  private String Fname;
  private String Lname;
  
  public String getName(){
    return Fname;
  }
  public String getName(){
    return Lname:
  }
  
  public class Person {
    String fname;
    String lname;
  
    
    public static void main (String[]args){
      Person p = new Person();
      
      p.setFname("Neil Patrick");
      p.setLname("Buison");
      System.out.println(p.getFname());
      System.out.println(p.getLname());
      
      p.printDetails();
    }
    
    public void setFname(String Fname){
      this.fname=fname;
    }
    public void setlname(String lname){
      this.Lname=Lname;
    }
    
    public String getFname(){
      return this.Fname;
    }
    public String getLname(){
      return this.Lname;
    }
    
    public void printDetails(){
      System.out.println(getFname + " " + getLname);
    }
  }

    
  
  
