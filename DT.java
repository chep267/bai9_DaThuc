package DT;

import java.util.Scanner;
import java.util.LinkedList;

import static java.lang.Math.pow;

class heso{

}
public class Dathuc {
    int n;
    double[] hs;

    Dathuc(){
        n = 0;
    }
    Dathuc(int n1){
        n = n1;
        hs = new double[n+1];
    }


    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("\nNhap cac he so tu bac be den lon: ");
        for (int i = 0; i < n+1; i++) {
            hs[i] = sc.nextDouble();
        }
    }
    public void in(){
        System.out.print(hs[0]);
        for (int i = 1; i < n+1; i++) {
            System.out.print(" + "+"("+hs[i]+"x^"+i+")");
        }
    }

    public Dathuc cong(Dathuc p){
        if(n<p.n) {
            Dathuc d = new Dathuc(p.n);
            for (int i = 0; i < n+1; i++) {
                d.hs[i] = hs[i] + p.hs[i];
            }
            for (int i = n+1; i < p.n+1; i++) {
                d.hs[i] = p.hs[i];
            }
            return d;
        }
        else {
            Dathuc d = new Dathuc(n);
            for (int i = 0; i < p.n+1; i++) {
                d.hs[i] = hs[i] + p.hs[i];
            }
            for (int i = p.n; i < n+1; i++) {
                d.hs[i] = hs[i];
            }
            return d;
        }
    }

    public double tinh(double x){
        double s = 0;
        for (int i = 0; i < n+1; i++) {
           s += hs[i]*pow(x,i);
        }
        return s;
    }
    public static void main(String[] args) {
        int m,n;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.print("\nNhap bac cua da thuc 1: ");
            n= sc.nextInt();
            if(n<0) System.out.print("\nBac cua da thuc phai >= 0. Hay nhap lai! ");
        }while (n<0);
        Dathuc d1 = new Dathuc(n);
        d1.nhap();

        do {
            System.out.print("\nNhap bac cua da thuc 2: ");
            m= sc.nextInt();
            if(m<0) System.out.print("\nBac cua da thuc phai >= 0. Hay nhap lai! ");
        }while (m<0);
        Dathuc d2 = new Dathuc(m);
        d2.nhap();



        System.out.print("\nDa thuc vua nhap la: \n\tDa thuc 1: ");
        d1.in();
        System.out.print("\n\tDa thuc 2: ");
        d2.in();
        Dathuc d3 = d1.cong(d2);
        System.out.print("\nTong 2 DT la: ");
        d3.in();
        System.out.print("\nNhap gia tri x: ");
        Double x = sc.nextDouble();
        System.out.print("\nDT 1 tai x = "+x+" la: "+d1.tinh(x));
    }
}
