package com.lixiaoran.test;

class Mydata{
    volatile int number = 0;
    public void addTo60(){
        this.number = 60;
    }
    //请注意吃屎number前面是加了volatile修饰的，volatile不保证原子性
    public void addPlusPlus(){
        number++;
    }
}

/**
 * @author lixiaoran
 * @date 2019-05-30 15:20:39
 */
public class VolatileDemo {
    public static void main(String[] args) {

    }

    /**
     * volatile 可以保证可见性，及时通知其他线程，主物理内存中的值已被修改。
     */
    public static void seeOkByVlatile(){
        Mydata mydata = new Mydata();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(3000);
            }catch (Exception ex){
                ex.printStackTrace();
            }
            mydata.addTo60();
            System.out.println(Thread.currentThread().getName()+mydata.number);
        },"aaa").start();

        while (mydata.number == 0){

        }
        System.out.println(Thread.currentThread().getName()+mydata.number);
    }
}
