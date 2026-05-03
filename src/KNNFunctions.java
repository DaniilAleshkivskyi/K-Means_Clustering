import java.util.*;

public class KNNFunctions {
    public static double calculateEuclideanDistance(MyVector v1, MyVector v2) {
        double sum = 0;
        for (int i = 0; i < v1.values().size(); i++)
            sum += Math.pow((v1.values().get(i) - v2.values().get(i)), 2);
        return Math.sqrt(sum);
    }

    public static TreeMap<MyVector,Double> sortDistances(ArrayList<MyVector> neighbors, MyVector chosenOne) {
        ArrayList<Double> distances = new ArrayList<>();
        for (MyVector v : neighbors) {
            distances.add(calculateEuclideanDistance(chosenOne,v));
        }
        for (int i = 0; i < neighbors.size(); i++) {
            for (int j = i + 1; j < neighbors.size(); j++) {
                if (distances.get(i) < distances.get(j)) {
                    Collections.swap(neighbors, i, j);
                    Collections.swap(distances, j, i);
                }
            }
        }

        return null;
    }

    public static void findPredictedClass(ArrayList<MyVector> neighbors, MyVector chosenOne) {
        ArrayList<Double> distances = new ArrayList<>();
        for (MyVector v : neighbors) {
            distances.add(calculateEuclideanDistance(chosenOne,v));
        }
        for (int i = 0; i < neighbors.size(); i++) {
            for (int j = i + 1; j < neighbors.size(); j++) {
                if (distances.get(i) < distances.get(j)) {
                    Collections.swap(neighbors, i, j);
                    Collections.swap(distances, j, i);
                }
            }
        }
    }
}
