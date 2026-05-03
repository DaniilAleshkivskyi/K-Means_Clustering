import java.util.List;

public record Cluster(List<MyVector> centroids, List<MyVector> nearest) {
}
