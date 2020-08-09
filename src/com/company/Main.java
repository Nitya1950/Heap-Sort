package com.company;

public class Main {

    public static void main(String[] args) {
        int array[]={15,12,4,2,9,18,23,19,8,3,11,10,5,1};
        Heap heap=new Heap();
        for( int element : array )
            heap.insert(element);
        heap.print();
        heap.sort();
        heap.print();


    }
}
