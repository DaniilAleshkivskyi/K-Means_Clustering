import java.util.ArrayList;
import java.util.List;

public class KMeans {
    int k;
    List<Cluster> clusters;

    public KMeans(int k) {
        this.k = k;
        clusters = new ArrayList<>();
    }
}
