package org.example;

public class DeliveryPrinter {
    private Sorter sorter;

    public DeliveryPrinter(Sorter sorter) {
        this.sorter = sorter;
    }

    public void print(){
        sorter.sort();
    }
}
