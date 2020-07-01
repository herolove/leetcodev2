//package org.example.leetcode;
//
//import java.util.concurrent.locks.LockSupport;
//
///**
// * @Description TODO
// * @Author zhangtao02
// * @Date 2020/7/1
// **/
//public class ReadWriteLock {
//    private int read;
//    private int write;
//
//    public boolean lockRead() {
//        if (write > 0) {
//            try {
//                synchronized (this) {
//                    wait();
//                }
//            } catch (Exception e) {
//                return false;
//            }
//        }
//        read++;
//        return true;
//    }
//
//    public void unReadLock() {
//        --read;
//    }
//
//    public boolean lockWrite(){
//
//    }
//}
