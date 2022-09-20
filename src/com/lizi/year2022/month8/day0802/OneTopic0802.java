package com.lizi.year2022.month8.day0802;


/**
 * @author lizi
 * @description TODO
 * @date 2022/8/2 08:50
 **/
public class OneTopic0802 {
    Integer[] arr = null;
    int front = 0, tail = -1, size = 0, flag = 0;
    public OneTopic0802(int k) {
        size = k;
        arr = new Integer[k];
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }else{
            tail++ ;
            tail %= size;
            arr[tail] = value;
            flag++ ;
            return true;
        }
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }else{
            front %= size;
            arr[front] = -1;
            front++ ;
            front %= size;
            flag-- ;
            return true;
        }
    }

    public int Front() {
        if (isEmpty()){
            return -1;
        }else{
            return arr[front];
        }
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }else{
            return arr[tail];
        }
    }

    public boolean isEmpty() {
        return flag == 0;
    }

    public boolean isFull() {
        return flag == size;
    }
/**
 ["MyCircularQueue","enQueue","enQueue","deQueue","enQueue","deQueue","enQueue","deQueue","enQueue","deQueue", "Front"]
 [[2],[1],[2],[],[3],[],[3],[],[3],[],[]]
 **/
    public static void main(String[] args) {
        OneTopic0802 queue = new OneTopic0802(2);
        queue.enQueue(2);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.deQueue();
        queue.enQueue(3);
        queue.deQueue();
        queue.enQueue(3);
        queue.deQueue();
        queue.enQueue(3);
        queue.deQueue();
        queue.Front();
    }
}
