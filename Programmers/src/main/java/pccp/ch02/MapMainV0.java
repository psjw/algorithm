package pccp.ch02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

//Array 장점 + List 장점 => 유연하면서도 빠르게 값을 찾아낼 수 있는
//Map : Key -> hash function -> hash -> bucket index -> Data
//
//HashMap : not sync
//Hashtable : sync
//ConccurentHashMap : sync + high concurrency


class MyData1 {
    int v;

    public MyData1(int v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "[" + v + "]";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MyData1 myData1 = (MyData1) object;
        return v == myData1.v;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(v);
    }
}

public class MapMainV0 {
    public static void main(String[] args) {
//        Map<String, Integer> map = new Hashtable<>();
//        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.putIfAbsent("A", 10);
        map.putIfAbsent("D", 10);
        map.replace("A", 10, 11);
        map.replace("B", 2, 11);
        map.remove("B", 3);
        System.out.println(map.remove("D", 10));
        System.out.println("map = " + map);
        System.out.println("map.get(\"A\") = " + map.get("A"));
        System.out.println("map.get(\"C\") = " + map.get("C"));
        System.out.println("map.getOrDefault(\"C\",-1) = " + map.getOrDefault("C", -1));
        System.out.println("map.values() = " + map.values());
        System.out.println("map.keySet() = " + map.keySet());

        method1(map);


        Map<MyData1, Integer> myMap = new ConcurrentHashMap<>();
        myMap.put(new MyData1(1), 1);
        myMap.put(new MyData1(2), 2);
        myMap.replace(new MyData1(1), 1, 11);
        method2(myMap);
    }

    static void method1(Map<String, Integer> map) {

    }

    static void method2(Map<MyData1, Integer> myMap) {
        System.out.println(myMap.remove(new MyData1(2), 3));
        System.out.println("myMap = " + myMap);
        System.out.println("myMap.get(new MyData1(1)) = " + myMap.get(new MyData1(1)));
        System.out.println("myMap.getOrDefault(new MyData1(1), -1) = " + myMap.getOrDefault(new MyData1(1), -1));
        System.out.println("myMap.values() = " + myMap.values());
        System.out.println("myMap.keySet() = " + myMap.keySet());
    }
}
