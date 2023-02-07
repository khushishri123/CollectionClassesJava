package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=201;i<=221;i++)
        {
            arr.add(i);
        }
        for(Integer i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        Map<Integer,String> mpp=new HashMap<>();
        mpp.put(1,"Khushi");
        mpp.put(2,"Stuti");
        mpp.put(3,"Ram");
        mpp.put(4,"Geeta");
        mpp.put(5,"Sita");
        for(Map.Entry<Integer,String> entry:mpp.entrySet())
        {
            System.out.println("Key : "+entry.getKey()+" Value: "+entry.getValue());
        }
        Stack<Integer> st=new Stack<>();
        for(int i=10;i<=100;i+=10)
        {
            st.push(i);
        }
        while(!st.isEmpty())
        {
           int i=st.pop();
           System.out.print(i+" ");
        }
        System.out.println();
    }
}