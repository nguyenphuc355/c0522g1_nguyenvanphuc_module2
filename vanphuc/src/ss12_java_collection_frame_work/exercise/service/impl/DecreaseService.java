package ss12_java_collection_frame_work.exercise.service.impl;

import ss12_java_collection_frame_work.exercise.model.Product;

import java.util.Comparator;

public class DecreaseService implements Comparator <Product>{
    @Override
    public int compare(Product o1, Product o2) {
        return (o2.getPrice()-o1.getPrice());
    }
}
