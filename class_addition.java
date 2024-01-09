public TestMain
{
  public static void main(String p[])
  {
    Addition a1 = new Addition();
    Addition a2 = new Addition();
    Addition a3 = new Addition();
    
    a1.setReal();
    a1.setImg();
    a2.setReal();
    a2.setImg();
    a3.sum(a1,a2);
    
    System.out.println("The addtion is:");
    a3.display();
  }
}
class Addition 
{
  private int real;
  private int img;
  Scanner s= new Scanner(System.in);
  void setreal()
  {
   System.out.println("Enter Real number :");
   real = s1.nextInt();
  }
  void setImg()
  {
    System.out.println("Enter Imaginary number:");
    img = s1.nextInt();
  }
  int getReal()
  {
    return real; 
  }
  int getImg()
  {
    return img;
  }
  void sum(Addition a1, Addition a2)
  {
    real=a1.real+a2.real;
    img=a2.img+a2.img;
  }
  void display()
  {
    System.out.println("Real="+real);
    System.out.println("img="+img+"i");
  }
}