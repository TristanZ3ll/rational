import java.util.Scanner;
class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first rational number: ");
        String numerator1 = input.nextLine();
        String denom1 = input.nextLine();
        System.out.println("Enter the second rational number: ");
        String numerator2 = input.nextLine();
        String denom2 = input.nextLine();
        Rational rational1 = new Rational(numerator1, denom1);
        Rational rational2 = new Rational(numerator2, denom2);
        
        System.out.println(rational1.toString()+ " + " + rational2.toString()+" = "+ rational1.add(rational2));
        System.out.println(rational1.toString()+ " - " + rational2.toString()+" = "+ rational1.subtract(rational2));
        System.out.println(rational1.toString()+ " * " + rational2.toString()+" = "+ rational1.multiply(rational2));
        System.out.println(rational1.toString()+ " / " + rational2.toString()+" = "+ rational1.divide(rational2));
        System.out.print(rational2.toString() + " is " + rational2.doubleValue());
        input.close();
}
}