public class ComplexMatrix {

    ComplexNumber[][] ComplexMatrix;
    int rows, columns;


    public ComplexMatrix(int rows, int columns) {
        ComplexMatrix = new ComplexNumber[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                ComplexMatrix[i][j] = new ComplexNumber(Math.round(Math.random() * 10), Math.round(Math.random() * 10));
            }
        }

        this.rows = rows;
        this.columns = columns;
    }


    public void PrintComplexMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                ComplexMatrix[i][j].PrintComplexNumber();
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static ComplexMatrix SumComplexMatrix(ComplexMatrix matrix1, ComplexMatrix matrix2) {
        ComplexMatrix result = new ComplexMatrix(matrix1.rows, matrix1.columns);

        if (matrix1.rows == matrix2.rows && matrix1.columns == matrix2.columns) {

            for (int i = 0; i < matrix1.rows; i++) {
                for (int j = 0; j < matrix1.columns; j++) {
                    result.ComplexMatrix[i][j] = ComplexNumber.SumComplexNumbers(matrix1.ComplexMatrix[i][j], matrix2.ComplexMatrix[i][j]);
                }
            }

            return result;
        }

        System.out.println("Операцию совершить невозможно");

        return null;

    }

    public static ComplexMatrix DifComplexMatrix(ComplexMatrix matrix1, ComplexMatrix matrix2) {
        ComplexMatrix result = new ComplexMatrix(matrix1.rows, matrix1.columns);

        if (matrix1.rows == matrix2.rows && matrix1.columns == matrix2.columns) {

            for (int i = 0; i < matrix1.rows; i++) {
                for (int j = 0; j < matrix1.columns; j++) {
                    result.ComplexMatrix[i][j] = ComplexNumber.DifComplexNumbers(matrix1.ComplexMatrix[i][j], matrix2.ComplexMatrix[i][j]);
                }
            }

            return result;

        }

        System.out.println("Операцию совершить невозможно");

        return null;

    }

    public static ComplexMatrix TransComplexMatrix(ComplexMatrix matrix) {
        ComplexMatrix result = new ComplexMatrix(matrix.columns, matrix.rows);

        for (int i = 0; i < matrix.columns; i++) {
            for (int j = 0; j < matrix.rows; j++) {
                result.ComplexMatrix[i][j] = matrix.ComplexMatrix[j][i];
            }
        }

        return result;
    }

    public static ComplexMatrix MulComplexMatrix(ComplexMatrix matrix1, ComplexMatrix matrix2) {
        ComplexMatrix result = new ComplexMatrix(matrix1.rows, matrix2.columns);

        if (matrix1.columns == matrix2.rows) {


            for (int i = 0; i < matrix1.rows; i++) {
                for (int j = 0; j < matrix2.columns; j++) {

                    ComplexNumber tmp1 = new ComplexNumber(0, 0);
                    for (int x = 0; x < matrix1.columns; x++) {
                        ComplexNumber tmp2 = ComplexNumber.MulComplexNumbers(matrix1.ComplexMatrix[i][x], matrix2.ComplexMatrix[x][j]);
                        tmp1 = ComplexNumber.SumComplexNumbers(tmp1, tmp2);
                    }
                    result.ComplexMatrix[i][j] = tmp1;

                }
            }
            return result;

        }

        System.out.println("Операцию совершить невозможно");

        return null;
    }

}

