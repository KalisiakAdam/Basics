package designPatternsAndThreads;

/**
 * Created by kalisiaczki on 11.06.2017.
 */
public class EqualsAndHashes {

    private String name;
    private int number;
    private int luckynumber;

    public EqualsAndHashes(String name, int number, int luckynumber) {
        this.name = name;
        this.number = number;
        this.luckynumber = luckynumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualsAndHashes)) return false;

        EqualsAndHashes that = (EqualsAndHashes) o;

        if (number != that.number) return false;
        if (luckynumber != that.luckynumber) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + number;
        result = 31 * result + luckynumber;
        return result;
    }
}
