package com.allst.jvalgo.queue;

import java.util.Scanner;

/**
 * 使用数组模拟环形队列
 * @author YiYa
 * @since 2020-02-17 上午 12:26
 */
public class ArrayAnnularQueue {

    public static void main(String[] args) {
        ArrayAnnularQ arrayQ = new ArrayAnnularQ(4);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show) : 显示队列");
            System.out.println("e(exit) : 退出程序");
            System.out.println("a(add) : 添加队列");
            System.out.println("g(get) : 取出队列");
            System.out.println("h(head) : 查看队列头");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    arrayQ.listQueue();
                    break;
                case 'a':
                    System.out.println("输入一个数: ");
                    int value = scanner.nextInt();
                    arrayQ.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = arrayQ.getQueue();
                        System.out.printf("取出的数据为: %d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = arrayQ.showQueue();
                        System.out.printf("队列头的数据为: %d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出~~~");
    }

}

/**
 * 使用数组模拟队列，编写一个ArrayQ类
 */
class ArrayAnnularQ {
    // 数组最大容量
    private int maxSize;
    // 队列头
    private int front;
    // 队列尾
    private int rear;
    private int[] arr;  // 存放数据， 模拟队列
    // 创建队列构造器
    public ArrayAnnularQ (int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }

    /**
     * 判断队列中存储是否满了
     * @return      结果
     */
    public boolean isFull () {
        return (rear + 1) % maxSize == front;
    }

    /**
     * 判断队列是否为空
     * @return      结果
     */
    public boolean isEmpty () {
        return front == rear;
    }

    /**
     * 添加数据
     */
    public void addQueue (int n) {
        if (isFull()) {
            System.out.println("队列满了， 不能添加数据");
            return;
        }
        arr[rear] = n;
        rear = (rear + 1) % maxSize;
    }

    /**
     * 取数据
     * @return      结果
     */
    public int getQueue () {
        if (isEmpty()) {
            throw new RuntimeException("队列空， 不能取数据");
        }
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    /**
     * 显示队列所有数据
     */
    public void listQueue () {
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d] = %d\n", i % maxSize, arr[i % maxSize]);
        }
    }

    /**
     * 显示队列的头部数据
     * @return      结果
     */
    public int showQueue () {
        if (isEmpty()) {
            throw new RuntimeException("队列为空~~~");
        }
        return arr[front];
    }

    /**
     * 队列有效数据个数
     * @return      结果
     */
    public int size () {
        return (rear + maxSize - front) % maxSize;
    }
}