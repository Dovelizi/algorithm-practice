package com.lizi.year2023.month6;

/**
 * @author lizi
 * @since 2023-06-16
 **/
public class SynchronizeTest {
    public void method(){
        synchronized (this) {  // 锁的是调用该method方法的实例对象this
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "+++++++" + i);
            }
        }
    }
}
