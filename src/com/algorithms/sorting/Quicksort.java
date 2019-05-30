///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.algorithms.sorting;
//
///**
// *
// * @author Arun
// */
//public class Quicksort {
//
//    public static void sort(Comparable[] a) {
//        StdRandom.shuffle(a); // Eliminate dependence on input.
//        sort(a, 0, a.length - 1);
//    }
//
//    private static void sort(Comparable[] a, int lo, int hi) {
//        if (hi <= lo) {
//            return;
//        }
//        int j = partition(a, lo, hi); // Partition (see page 291).
//        sort(a, lo, j - 1); // Sort left part a[lo .. j-1].
//        sort(a, j + 1, hi); // Sort right part a[j+1 .. hi].
//    }
//
//    private static boolean less(Comparable v, Comparable w) {
//        return v.compareTo(w) < 0;
//    }
//
//    private static void exch(Comparable[] a, int i, int j) {
//        Comparable temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//    }
//
//    public static void show(Comparable[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//
//    }
//
//    public static boolean isSorted(Comparable[] a) {
//        for (int i = 1; i < a.length; i++) {
//            if (less(a[i], a[i - 1])) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//}
