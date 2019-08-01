package com.lixiaoran.test;

import org.junit.Test;
import org.w3c.dom.ls.LSInput;
import sun.awt.ScrollPaneWheelScroller;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class LxrTest {

    @Test
    public void test01(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();

        System.out.print(df.format(date));
    }
    @Test
    public void test02(){
        String[][] a = new String[1][];

        a = new String[6][];

        System.out.print(a.length);
    }

    @Test
    public void test03(){
        Integer a = 36 ;
        Integer b = 8;

        System.out.println(a/b);

        System.out.println(a%b);
    }
    @Test
    public void test04(){
        Map<Long, List> map = new HashMap<Long, List>(16);
        List<Long> list1 = new ArrayList<Long>();
        list1.add(1L);
        list1.add(2L);
        list1.add(3L);
        list1.add(4L);
        map.put(1L,list1);

        List<Integer> list2 = new ArrayList<Integer>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        map.put(2L,list2);
        list1 = null;

        list1.forEach( o -> System.out.println(o));

//        System.out.println(map.get(2L).get(0).equals(1));
    }

    @Test
    public  void  test05(){
        java.lang.String s = "{'minClassNumber':25,'maxClassNumber':40,'minElectiveClassNumber':25,'maxElectiveClassNumber':40,'classCourseGroupNumber':'3','fixCourseData':['2824236131663874','2824236131794945','2824236132122626'],'everyElectiveClassCountData':{'2824236131565570':2,'2824236131663874':0,'2824236131794945':1,'2824236131926018':1,'2824236132122626':0,'2824236132237313':1},'scoreBalance':true,'genderBalance':false}";
        Object o = s;
        System.out.println(o);
    }

    @Test
    public void test06(){
        int[] array = {1,1,1,5,5,8,9};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        int count_2 = 0;
        for(int i=0;i<array.length;i=i+count){
            if(i==array.length-1){
                break;
            }
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }
                continue;
            }
            if(count>count_2){
                count_2 = count;
                map.put(count_2, array[i]);
            }

        }
        System.out.println(map.get(count_2));
    }
    @Test
    public void test07(){
        List<java.lang.String> a = new ArrayList<java.lang.String>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        a.add("6");
        a.add("7");
        a.remove("7");
        System.out.println(a.toString());
    }

    @Test
    public void test08(){
        Long start = System.currentTimeMillis();
        long sum = 0L;
        for(long i=0;i<Integer.MAX_VALUE;i++){
            sum += i;
        }
        System.out.println(sum);
        Long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    @Test
    public void test09(){
        String s = null;
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.remove("1");
        Boolean flag = (s == null || s.split(",").length>0);
        System.out.println(list);
    }
    @Test
    public void test10(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(7);
        list.add(7);
        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }
    @Test
    public void test11(){
        Integer[] arr = {0,1,2,3,4,5,6,7,8,9};
        int a = Arrays.binarySearch(arr,5);
        System.out.println(a);
    }
    @Test
    public void test12(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        List<Integer> list1 = new ArrayList();
        list1.add(1);
        System.out.println(list.containsAll(list1));
    }
    @Test
    public void test13(){
        String s1 = "123aaaaa";
        String s2 = "123AAAAA";
        System.out.println(s1.equalsIgnoreCase(s2));
    }
    @Test
    public void test14(){
        Map<Integer,Integer> map = new HashMap<>(16);
        for(int i=0;i<10;i++){
            map.put(i,i);
        }
        map.forEach((k,v)->System.out.println(k+"-"+v));
    }

    @Test
    public void test15(){
        List<String> list = new ArrayList<>();
        list.add("AA");
        list.add("SSDD");
        list.add("QQQdd");
        List<String> list1 = list.stream().map(name -> name.toLowerCase()).collect(Collectors.toList());
        list1.forEach(name -> System.out.println(name));
    }

    @Test
    public void test16(){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
    }
    @Test
    public void test17(){
        String s = "122";

        s = s.substring(0,1);
        System.out.println(s);
    }
    @Test
    public void test18(){
       String[][] str = new String[1][];
       str[0] = new String[1];
       str[0][0] = "1";
       System.out.println(str);
    }
    @Test
    public void test19(){
        String str = ";;;;1";
        String[] arr = str.split(";");
        System.out.println(arr.length);
        
    }
    @Test
    public void test20(){
        List<String> list1 = new ArrayList<>();
        list1.add("11");
        list1.add("21");
        list1.add("22");
        list1.add("23");
        
        List<String> list2 = new ArrayList<>();
        list2.add("12");
        list2.add("31");
        list2.add("32");
        list2.add("33");
        List<String> list3 = new ArrayList<>(list1);
        list3.retainAll(list2);
        System.out.println(list3.toString());
    }

}
