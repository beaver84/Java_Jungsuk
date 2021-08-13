package com.jungsuk.ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList();    //교집합
        ArrayList cha = new ArrayList();    //차집합
        ArrayList hap = new ArrayList();    //합집합

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        kyo.addAll(list1); // list1의 모든 요소를 kyo에 저장한다.
        kyo.retainAll(list2); // list2와 kyo의 공통요소만 남기고 삭제한다.

        cha.addAll(list1);
        cha.removeAll(list2); // cha에서 list2와 공통된 요소들을 모두 삭제한다.

        hap.addAll(list1); // list1의 모든 요소를 hap에 저장한다.
        hap.removeAll(kyo); // hap에서 kyo와 공통된 모든 요소를 삭제한다.
        hap.addAll(list2); // list2의 모든 요소를 hap에 저장한다.

        System.out.println("list1="+list1);
        System.out.println("list2="+list2);
        System.out.println("kyo="+kyo);
        System.out.println("cha="+cha);
        System.out.println("hap="+hap);
    }

//        /**
//         *  코드를 작성하시오
//         */
//
//        //합집합 구하기
//        hap = union(list1, list2);
//        //교집합 구하기
//        kyo = intersection(list1, list2);
//
//////        //차집합 구하기
//        list1.clear();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.removeAll(list2);
////        cha = list1;
////
////        //합집합 구하기
////        list1.clear();
////        list1.add(1);
////        list1.add(2);
////        list1.add(3);
////        list1.add(4);
////        list1.addAll(list2);
////        hap = list1;
//
////        list1.removeAll(list2);
////        cha = list1;
////        list1.addAll(list2);
////        hap = list1;
//
//        System.out.println("list1="+list1);
//        System.out.println("list2="+list2);
//        System.out.println("kyo="+kyo);
//        System.out.println("cha="+list1.toString());
//        System.out.println("hap="+hap);
//    }
//
//    public static <T> ArrayList<T> union(ArrayList<T> list1, ArrayList<T> list2) { // 합집합 메소드
//        Set<T> set = new HashSet<T>();
//        set.addAll(list1);
//        set.addAll(list2);
//        return new ArrayList<T>(set);
//    }
//
//    public static <T> ArrayList<T> intersection(ArrayList<T> list1, ArrayList<T> list2) { // 교집합 메소드
//        ArrayList<T> list = new ArrayList<T>();
//        for (T t : list1) {
//            if (list2.contains(t)) {
//                list.add(t);
//            }
//        }
//        return list;
//    }
}