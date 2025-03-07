import java.util.Scanner;

public class complex_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of the first complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter imaginary part of the first complex number: ");
        double imag1 = sc.nextDouble();

        System.out.print("Enter real part of the second complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter imaginary part of the second complex number: ");
        double imag2 = sc.nextDouble();

        double resultReal = real1 + real2;
        double resultImaginary = imag1 + imag2;

        System.out.println("Sum of the complex numbers: " + resultReal + " + " + resultImaginary + "i");

    }
}

