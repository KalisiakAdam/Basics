import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private final boolean [][] grid2D;
    private WeightedQuickUnionUF weightedQuickUnionUF;
    private WeightedQuickUnionUF backweightedQuickUnionUF;
    private int n;
    private int counter = 0;

    public Percolation(int n) {

        weightedQuickUnionUF = new WeightedQuickUnionUF(n * n+2);
        backweightedQuickUnionUF = new WeightedQuickUnionUF(n*n+2);
        grid2D = new boolean[n][n];
        this.n = n;
    }

    private int upRoot() {
        return 0;
    }
    private int downRoot() {
        return n*n+1;
    }

    private int toOndDimension(int row, int col) {
        return (row-1)*n+col;
    }

    private void validateIndices(int row, int col)  {
        if (!isValidIndex(row) || !isValidIndex(col)) {
            throw new IndexOutOfBoundsException("Exeption");
        }
    }

    private boolean isValidIndex(int index) {
        return (index >= 1) && (index <= n);
    }

    public void open(int row, int col) {

        validateIndices(row, col);

        if (isOpen(row, col)) {
            return;
        }
            grid2D[row-1][col-1] = true;
            counter++;
            int oneDIndex = toOndDimension(row, col);

            if (row == 1) {
                weightedQuickUnionUF.union(upRoot(), oneDIndex);
                backweightedQuickUnionUF.union(upRoot(), oneDIndex);
            }

            if ((col > 1) && isOpen(row, col - 1)) {
                weightedQuickUnionUF.union(oneDIndex, toOndDimension(row, col - 1));
                backweightedQuickUnionUF.union(oneDIndex, toOndDimension(row, col - 1));
            }

            if ((col < n) && isOpen(row, col + 1)) {
                weightedQuickUnionUF.union(oneDIndex, toOndDimension(row, col + 1));
                backweightedQuickUnionUF.union(oneDIndex, toOndDimension(row, col + 1));
            }

            if (row == n) {
            weightedQuickUnionUF.union(downRoot(), oneDIndex);
            }

            if ((row < n) && isOpen(row + 1, col)) {

                weightedQuickUnionUF.union(oneDIndex, toOndDimension(row + 1, col));
                backweightedQuickUnionUF.union(oneDIndex, toOndDimension(row + 1, col));

            }
            if ((row > 1) && isOpen(row - 1, col)) {

                weightedQuickUnionUF.union(oneDIndex, toOndDimension(row - 1, col));
                backweightedQuickUnionUF.union(oneDIndex, toOndDimension(row - 1, col));
            }
        }

    public boolean isOpen(int row, int col) {
        validateIndices(row, col);
        return grid2D[row-1][col-1];
    }

    public boolean isFull(int row, int col) {
        validateIndices(row, col);
        return weightedQuickUnionUF.connected(upRoot(), toOndDimension(row, col));
    }

    public int numberOfOpenSites() {

        return counter;
    }

    public boolean percolates() {

        return weightedQuickUnionUF.connected(upRoot(), downRoot());
    }
}










