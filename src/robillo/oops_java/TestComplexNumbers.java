package robillo.oops_java;

import java.util.Scanner;

public class TestComplexNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        int choice = s.nextInt();

        if(choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        }
        else if(choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        }
        else {
            return;
        }
    }

    public static class ComplexNumbers {
        // Complete this class

        int re, im;

        ComplexNumbers(int re, int im) {
            this.re = re;
            this.im = im;
        }

        void plus(ComplexNumbers c2) {
            this.re += c2.re;
            this.im += c2.im;
        }

        void multiply(ComplexNumbers c2) {
            //(1 + i2)(2 + i3)
            // a    b  c    d
            int a = this.re;
            int b = this.im;

            int c = c2.re;
            int d = c2.im;

            this.re = a*c - b*d;
            this.im = a*d + b*c;

        }

        void print() {
            System.out.println(this.re + " + i" + this.im);
        }

    }
}
