<!-- $theme: default
page_number: true
footer: Java - Module 4 Homework
-->
# Home Work 

# Note : Outputs expected to get after fixing errors if you notice any
1). Consider the following 4 declarations:
```
   a). int i =10;
   b). static int i=10;
   c). public void m1()  { System.out.println(i); }
   d). public static void m1() { System.out.println(i); }
```   
  Within the same class which of the following declarations are valid.
    1). a & c
	2). a & d
	3). b & c
	4). b & d

 -----------------------------------------------------------------------------
2). What will be the output of below code: 
```
  class Sample {
   int i=10;
   static int j=20;
    
   public static void main(String args[]) {
     System.out.println(i+"...."+j); 
         Sample s1=new Sample();
         s1.i=100;
         s1.j=200;
     System.out.println(s1.i+"...."+s1.j); 	  
	 Sample s2=new Sample();
     System.out.println(s2.i+"...."+s2.j); 	  
         s2.j=2000;
     System.out.println(s1.i+"...."+s1.j); 
     
     }	  
  }
  ```
-----------------------------------------------------------------------------

 3). Which of the following classes are tightly encapsulated ?
```
   class A { private int x=10; }
   class B extends A { int y=20; }
   
   class C { int a=10; }
   class D extends C { private int b=10; }
   class E extends D { private int c=5; } 
  ```
 
-----------------------------------------------------------------------------
 4). What will be the output of below code:
 ```
   class Test {
   int x;
	 
   Test() {
   this.x=10;
   super();	}
	 
   public static void main(String args[]) {
	 Test t=new Test();
	 System.out.println(t.x); }	  
  }
  ```
 -----------------------------------------------------------------------------
 5). Get output of below :
 ```
 public class Engine {}
 public class Vehicle extends Engine { }
  
  public class BMW {
  public void getSpares(Engine e1)
         {System.out.println("Engine");}
  public void getSpares(Vehicle v1)
         {System.out.println("Vehicle");}
  public static void main(String args[]) {
   BMW b=new BMW();
   Engine e = new Engine();
   b.getSpares(e); 
   Vehicle v = new Vehicle();
   b.getSpares(v);
   Engine e1 = new Vehicle();
   b.getSpares(e1);   
  }
 }
 ```
-----------------------------------------------------------------------------
 6). Get output of below :
```
package pack1;
public class A {
    protected void sayHi(){ System.out.println(" Hi ");}
}

package pack2;
import pack1.A;
public class B extends A 
{
    public static void main(String[] args) 
    {
        B b = new B();
        b.sayHi();
        
        A a = new A();
        a.sayHi();
        
        A a1 = new B();
        a1.sayHi();          
    }
}
```
-----------------------------------------------------------------------------
7). Get output of below :
```
public class HiHello {
    public void sayHi() {
        System.out.println("Hi"); }

    public static void sayHello() {
        sayHi();
        System.out.println("Hello");
    }

    public void sayBye() {
        sayHi();
        System.out.println("Bye"); }

    public static void main(String[] args) {
        sayHello();
        sayBye();
        HiHello h = new HiHello();
        h.sayHi();
        h.sayHello();
        h.sayBye();  }
}
```
-----------------------------------------------------------------------------
8). Get output of below :
```
public class Test1 {
    private int x;
    public void setX(int x){ this.x =x; }
    public int getX() { return x; }
    public void addTwo(){
        int x = getX();
        x= x+2;        
        System.out.println("Inside Method :"+ getX());
        }
    
    public static void main(String[] args){
        Test1 t1 = new Test1();
        t1.setX(5);
        System.out.println("Before addTwo: "+t1.getX());
        t1.addTwo();
        System.out.println("After addTwo: "+t1.getX());       
    }
}
```
-----------------------------------------------------------------------------
