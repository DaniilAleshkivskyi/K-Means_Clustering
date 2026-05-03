import java.util.List;

public record Cluster(List<MyVector> centroids, List<MyVector> nearest) {
    public Cluster(List<MyVector> centroids, List<MyVector> nearest) {
        this.centroids = centroids;
        this.nearest = nearest;
    }

    public static void main(String[] args) {
        System.out.println("lalala");
    }
}
