import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {

    private final double[] results;
    private final Summary summary;
    private class Summary {

        private final double mean;
        private final double stddev;
        private final double confidenceLo;
        private final double confidenceHi;
        private Summary() {

            mean = StdStats.mean(results);
            stddev = StdStats.stddev(results);

            double delta = 1.96 * stddev / Math.sqrt(results.length);
            confidenceLo = mean - delta;
            confidenceHi = mean + delta;
        }
    }

    public PercolationStats(int n, int t)  {
        if ((n <= 0) || (t <= 0)) {
            throw new IndexOutOfBoundsException("Exeption");
        }

        results = new double[t];
        performMonteCarloSimulation(n, t);
        summary = new Summary();
    }

    private void performMonteCarloSimulation(int n, int T) {

        for (int t = 0; t < T; t++) {
            int openSitesNum = singleMonteCarloSimulation(n);

            results[t] = (double) openSitesNum / (n * n);
        }
    }
    private int singleMonteCarloSimulation(int N) {

        Percolation percolation = new Percolation(N);

        int openSitesNum = 0;

        do {

            int i, j;
            do {
                i = StdRandom.uniform(1, N + 1);
                j = StdRandom.uniform(1, N + 1);
            } while (percolation.isOpen(i, j));

            percolation.open(i, j);
            openSitesNum++;
        } while (!percolation.percolates());

        return openSitesNum;
    }

    public double mean() {
        return summary.mean;
    }

    public double stddev() {
        return summary.stddev;
    }

    public double confidenceLo() {
        return summary.confidenceLo;
    }

    public double confidenceHi() {
        return summary.confidenceHi;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);

        PercolationStats percolationStats = new PercolationStats(N, T);
        StdOut.printf("mean                    = %.16f\n", percolationStats.mean());
        StdOut.printf("stddev                  = %.16f\n", percolationStats.stddev());
        StdOut.printf("95%% confidence interval = %.16f, %.16f", percolationStats.confidenceLo(), percolationStats.confidenceHi());
    }

    }

