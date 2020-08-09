package com.company;

public class Heap {

    private int[] a;
    int nextindex;
    int lastUnsortedIndex;
    Heap(){
        a=new int[100];
        nextindex=0;


    }
    private void heapify(int num) {
        while (num > 0 && a[num] > a[(num - 1) / 2]) {
            int temp = a[num];
            a[num] = a[(num - 1) / 2];
            a[(num - 1) / 2] = temp;
            heapify((num - 1) / 2);
        }
    }
    private int getLeftChildIndex(int index){
        return (2*index)+1;
    }
    private int getRightChildIndex(int index)
    {
        return (index*2)+2;
    }
    private void swap(int e,int b){
        int temp=a[e];
        a[e]=a[b];
        a[b]=temp;
    }
    private void siftdown(int index){
        int leftindex=getLeftChildIndex(index);
        int rightindex=getRightChildIndex(index);
        if(leftindex>lastUnsortedIndex)
            return;
        if(rightindex>lastUnsortedIndex)
        {
            if(a[index]<a[leftindex])
            {
                swap(index,leftindex);
                siftdown(leftindex);
            }

        }
        else
        {
            if(a[leftindex]>a[rightindex])
            {
                if(a[index]<a[leftindex])
                {
                    swap(index,leftindex);
                    siftdown(leftindex);
                }

            }
            else
            {
                if(a[index]<a[rightindex])
                {
                    swap(index,rightindex);
                    siftdown(rightindex);
                }

            }
        }



    }

    public void insert(int num){
        a[nextindex]=num;
        heapify(nextindex);
        nextindex++;

    }
    public void sort(){
        lastUnsortedIndex=nextindex-1;
        while(lastUnsortedIndex>0)
        {
            swap(0,lastUnsortedIndex);
            lastUnsortedIndex--;
            siftdown(0);

        }

    }
    public void print()
    {
        for(int i=0;i<nextindex;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }



}
