import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Что вы хотите сделать?\n\n" +
                "Комплексные числа:\n" +
                "1 - Сложить\n" +
                "2 - Вычесть\n" +
                "3 - Умножить\n\n" +
                "Комплексные матрицы:\n" +
                "4 - Сложить\n" +
                "5 - Вычесть\n" +
                "6 - Умножить\n" +
                "7 - Транспонировать\n");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        switch (num) {
            case 1:
                ComplexNumber first1 = new ComplexNumber();
                ComplexNumber second1 = new ComplexNumber();

                System.out.print("Первое число:  ");
                first1.PrintComplexNumber();
                System.out.print("\nВторое число:  ");
                second1.PrintComplexNumber();

                System.out.print("\nСумма:  ");
                ComplexNumber.SumComplexNumbers(first1, second1).PrintComplexNumber();
                break;

            case 2:
                ComplexNumber first2 = new ComplexNumber();
                ComplexNumber second2 = new ComplexNumber();

                System.out.print("Первое число:  ");
                first2.PrintComplexNumber();
                System.out.print("\nВторое число:  ");
                second2.PrintComplexNumber();

                System.out.print("\nРазность:  ");
                ComplexNumber.DifComplexNumbers(first2, second2).PrintComplexNumber();
                break;

            case 3:
                ComplexNumber first3 = new ComplexNumber();
                ComplexNumber second3 = new ComplexNumber();

                System.out.print("Первое число:  ");
                first3.PrintComplexNumber();
                System.out.print("\nВторое число:  ");
                second3.PrintComplexNumber();

                System.out.print("\nПроизведение:  ");
                ComplexNumber.MulComplexNumbers(first3, second3).PrintComplexNumber();
                break;

            case 4:
                System.out.println("Введите число строк и столбцов первой матрицы");
                Scanner in41 = new Scanner(System.in);
                int row41 = in41.nextInt();
                Scanner in42 = new Scanner(System.in);
                int column42 = in42.nextInt();

                System.out.println("Введите число строк и столбцов второй матрицы");
                Scanner in43 = new Scanner(System.in);
                int row43 = in43.nextInt();
                Scanner in44 = new Scanner(System.in);
                int column44 = in44.nextInt();


                ComplexMatrix first4 = new ComplexMatrix(row41, column42);
                ComplexMatrix second4 = new ComplexMatrix(row43, column44);

                System.out.println("Первая матрица:");
                first4.PrintComplexMatrix();
                System.out.println("\nВторая матрица:");
                second4.PrintComplexMatrix();
                System.out.println();

                System.out.println("Сумма матриц:");
                ComplexMatrix.SumComplexMatrix(first4, second4).PrintComplexMatrix();

                break;

            case 5:
                System.out.println("Введите число строк и столбцов первой матрицы");
                Scanner in51 = new Scanner(System.in);
                int row51 = in51.nextInt();
                Scanner in52 = new Scanner(System.in);
                int column52 = in52.nextInt();

                System.out.println("Введите число строк и столбцов второй матрицы");
                Scanner in53 = new Scanner(System.in);
                int row53 = in53.nextInt();
                Scanner in54 = new Scanner(System.in);
                int column54 = in54.nextInt();


                ComplexMatrix first5 = new ComplexMatrix(row51, column52);

                ComplexMatrix second5 = new ComplexMatrix(row53, column54);

                System.out.println("Первая матрица:");
                first5.PrintComplexMatrix();
                System.out.println("\nВторая матрица:");
                second5.PrintComplexMatrix();
                System.out.println();

                System.out.println("Разность матриц:");
                ComplexMatrix.DifComplexMatrix(first5, second5).PrintComplexMatrix();

                break;

            case 6:
                System.out.println("Введите число строк и столбцов первой матрицы");
                Scanner in61 = new Scanner(System.in);
                int row61 = in61.nextInt();
                Scanner in62 = new Scanner(System.in);
                int column62 = in62.nextInt();

                System.out.println("Введите число строк и столбцов второй матрицы");
                Scanner in63 = new Scanner(System.in);
                int row63 = in63.nextInt();
                Scanner in64 = new Scanner(System.in);
                int column64 = in64.nextInt();


                ComplexMatrix first6 = new ComplexMatrix(row61, column62);

                ComplexMatrix second6 = new ComplexMatrix(row63, column64);

                System.out.println("Первая матрица:");
                first6.PrintComplexMatrix();
                System.out.println("\nВторая матрица:");
                second6.PrintComplexMatrix();
                System.out.println();

                System.out.println("Произведение матриц:");
                ComplexMatrix.MulComplexMatrix(first6, second6).PrintComplexMatrix();

                break;

            case 7:

                System.out.println("Введите число строк и столбцов");

                Scanner in71 = new Scanner(System.in);
                int row71 = in71.nextInt();
                Scanner in72 = new Scanner(System.in);
                int column72 = in72.nextInt();

                ComplexMatrix first7 = new ComplexMatrix(row71, column72);

                System.out.println("\nИсходная матрица:");
                first7.PrintComplexMatrix();
                System.out.println();

                System.out.println("Транспонированная матрица:");
                ComplexMatrix.TransComplexMatrix(first7).PrintComplexMatrix();

                break;

        }
    }
}