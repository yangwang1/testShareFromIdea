package com.yangwang.java;

/**
 * 创建多线程的方式二：实现Runnable接口
 * 1.创建一个实现了Runnable接口的类
 * 2.实现类去实现Runnable中的抽象方法：run()
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 *
 * 比较创建线程的两种方式
 * 开发中：优先选择：实现Runnable接口的方式
 * 原因：1.实现的方式没有类的单继承的局限性
 *      2.实现的方式更适合来处理多个线程有共享数据的情况
 * 联系：Thread类也实现了Runnable接口
 * 相同点：都需要重写run方法，将需要的逻辑声明在方法中。
 *
 * @author yangwang
 * @date 2020-08-13-4:44
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        Runnable1 r1 = new Runnable1();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}

class Runnable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println("偶数：" + i);
            }
        }
    }
}
