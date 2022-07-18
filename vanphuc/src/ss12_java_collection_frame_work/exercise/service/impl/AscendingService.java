package ss12_java_collection_frame_work.exercise.service.impl;

import ss12_java_collection_frame_work.exercise.model.Product;

import java.util.Comparator;

public class AscendingService implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (o1.getPrice() - o2.getPrice());
    }
}
