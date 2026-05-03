import java.util.*;

public class Funcs {
    public static void main(String[] args) {
        MyVector v1 = new MyVector(new ArrayList<>())
    }


    public static MyVector findClosesCluster(MyVector vector, List<MyVector> centroids) {
        Map<MyVector,Double> nearest = new HashMap<>();

        for(MyVector centroid : centroids) {
            nearest.put(centroid,KNNFunctions.calculateEuclideanDistance(vector, centroid));
        }
        return Collections.max(nearest.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
