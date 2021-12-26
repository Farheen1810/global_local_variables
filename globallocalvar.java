
public class globallocalvar {
public static int a=2;
    public void locvar()
 {
     int a=3;//This is a local variable//
     System.out.println(a);

 }
    public static void main(String[] args) {
    System.out.println(a);
    globallocalvar gl=new globallocalvar();
    gl.locvar();
}
    
}
