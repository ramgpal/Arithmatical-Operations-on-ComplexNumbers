import java.util.*;
class complex {
    int real;
    int imaginary;
    public complex(int r,int i) {
        real=r;
        imaginary=i;
    }
    public static complex Add(complex a , complex b) {
        return new complex((a.real+b.real),(a.imaginary+b.imaginary));
    }
    public static complex  Diff(complex a,complex b) {
        return new complex((a.real-b.real),(a.imaginary-b.imaginary));
    }  
    public static complex Product(complex a,complex b) {
        return new complex(((a.real*b.real)-(a.imaginary*b.imaginary)),((a.real*b.imaginary)+(a.imaginary*b.real)));
}
public void PrintComplex() {
    if(imaginary==0 && real!=0) {
        System.out.println(real);
    }
   else if(imaginary!=0 && real==0) {
    System.out.println(imaginary +"i" );
}
else {
System.out.println(real+"+"+imaginary+"i" );
}
 } }
 class Main
 {
public static void main(String[] args) {
    complex c=new complex(4,5);
    complex d=new complex(9,4);
    complex e=complex.Add(c,d);
    complex f=complex.Diff(c,d);
    complex g=complex.Product(c,d);
    e.PrintComplex();
    f.PrintComplex();
    g.PrintComplex();
} 
}
