package com.qf.day52;

import java.util.TreeSet;

/**
 * 4. 随机一注双色球彩票，每一注双色球彩票由6个红球号码+1个篮球号码组成。
 * 红球是由1~32个无重复号码+1个1~16号的篮球号码组成。要求每次运行程序都
 * 能随机生成一组双色球彩票
 */
public class TestDemo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        while (treeSet.size() < 6) {
            treeSet.add((int) (Math.random() * 31) + 1);
        }
        System.out.println("红色球中奖号码："+treeSet+"\n蓝色球中奖号码："+((int) (Math.random() * 15) + 1));
    }
}
