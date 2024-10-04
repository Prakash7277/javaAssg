
package assg3;

class Outer {
    int outer_x = 100;
    void test(){
        Inner inner = new Inner();inner.display();
    }
    static int count=0;
   
    Outer(){
        count++;
        System.out.println(count);
        
    }
   
    class Inner{
        void display(){
            System.out.println("Display : outer x = "+outer_x);
        }
    }
}

public class InnerOuter {
    
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        Outer o1 = new Outer();
        Outer o2 = new Outer();
        Outer o3 = new Outer ();
        
    }
}
