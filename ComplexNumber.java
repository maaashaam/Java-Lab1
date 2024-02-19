public class ComplexNumber {

    double re, im;


    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber() {
        this.re = Math.round(Math.random() * 5);
        this.im = Math.round(Math.random() * 5);
    }

    public void PrintComplexNumber() {
        if (im >= 0) {
            System.out.print(re + "+" + im + "i");
        } else {
            System.out.print(re + "" + im + "i");
        }
    }


    public static ComplexNumber SumComplexNumbers(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = new ComplexNumber(0, 0);

        result.re = number1.re + number2.re;
        result.im = number1.im + number2.im;

        return result;
    }

    public static ComplexNumber DifComplexNumbers(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = new ComplexNumber(0, 0);

        result.re = number1.re - number2.re;
        result.im = number1.im - number2.im;

        return result;
    }

    public static ComplexNumber MulComplexNumbers(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = new ComplexNumber(0, 0);

        result.re = (number1.re * number2.re - number1.im * number2.im);
        result.im = (number1.re * number2.im + number1.im * number2.re);

        return result;
    }
}