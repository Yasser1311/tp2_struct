import java.util.Random;
public class squareSubMatrice {
    private int dimension;
    int[][] Matrix;
    private int firstLine;
    private int firstColumn;
    private int lastLine;
    private int lastColumn;

    public squareSubMatrice(int dimension, int[][] matrix, int firstLine, int firstColumn, int lastLine, int lastColumn) {
        this.dimension = dimension;
        this.Matrix = matrix;
        this.firstLine = firstLine;
        this.firstColumn = firstColumn;
        this.lastLine = lastLine;
        this.lastColumn = lastColumn;
    }

    public squareSubMatrice(int dimension, int firstLine, int firstColumn, int lastLine, int lastColumn) {
        this.dimension = dimension;
        Matrix = new int[dimension][dimension];
        this.firstLine = firstLine;
        this.firstColumn = firstColumn;
        this.lastLine = lastLine;
        this.lastColumn = lastColumn;
    }

    public squareSubMatrice clone() {
        int[][] matrixcopy = new int[dimension][dimension];
        for (int i = 0; i < getDimension(); i++)
            for (int j = 0; j < getDimension(); j++)
                matrixcopy[i][j] = Matrix[i][j];
        return new squareSubMatrice(dimension, matrixcopy, firstColumn, firstLine, lastColumn, lastLine);
    }

    public int getDimension() {
        return dimension;
    }

    public int getSubDimension() {
        return lastLine + 1 - firstLine;

    }

    /*EXO 2 */

    public int get(int row, int col) {
        return Matrix[row + firstLine][col + firstColumn];
    }

    public void set(int row, int col, int value) {
        Matrix[row + firstLine][col + firstColumn] = value;
    }

    public String toString() {
        int subDim = getSubDimension();
        String str = "";
        for (int i = 0; i < subDim; i++) {
            str += "[ " + get(i, 0);
            for (int j = 1; j < subDim; j++) {
                str += ", " + get(i, j);
            }
            str += "]\n";
        }
        return str;
    }
    public void sum(squareSubMatrice subMatrice){
        for (int i=0;i<getSubDimension();i++){
            for (int j=0; j<getSubDimension();j++)
                set(i,j,this.get(i,j) + subMatrice.get(i,j));
        }
    }
    public void fillOne(){
        for (int i=0; i <getSubDimension();i++){
            for(int j=0;j<getSubDimension();j++)
                set(i,j,1);

        }
    }
    public void fillRand(){
        Random random = new Random();
        for(int i=0;i<getSubDimension();i++){
            for(int j =0;j<getSubDimension();j++)
                set(i,j, random.nextInt(12));
        }
    }





}
