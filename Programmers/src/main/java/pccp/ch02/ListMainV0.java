package pccp.ch02;

import java.util.*;


// LinkedList
// List 인터페이스
// ArrayList (not sync)
// Vector (sync)


class MyData {
    int value;

    public MyData(int value) {
        this.value = value;
    }

    static MyData create(int value) {
        return new MyData(value);
    }

    @Override
    public String toString() {
        return "MyData{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MyData myData = (MyData) object;
        return value == myData.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}

public class ListMainV0 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 5);
        list.remove(2);

        System.out.println("list.get(2) = " + list.get(2));
        System.out.println("list.contains(5) = " + list.contains(5));
        System.out.println("list.contains(6) = " + list.contains(6));
        System.out.println("list = " + list);

        System.out.println("=============================");
        LinkedList<MyData> myDataLinkedList = new LinkedList<>();
        myDataLinkedList.add(MyData.create(1));
        myDataLinkedList.add(MyData.create(2));
        myDataLinkedList.add(MyData.create(3));
        System.out.println("myDataLinkedList = " + myDataLinkedList);
        //만약 equals 오버라이딩 안하면 false
        System.out.println("myDataLinkedList.contains(MyData.create(2)) = " + myDataLinkedList.contains(MyData.create(2)));
        System.out.println("myDataLinkedList.indexOf(MyData.create(3)) = " + myDataLinkedList.indexOf(MyData.create(3)));
        System.out.println("myDataLinkedList.size() = " + myDataLinkedList.size());
        System.out.println("myDataLinkedList.isEmpty() = " + myDataLinkedList.isEmpty());

        System.out.println("=============================");
        List<MyData> vectorList = new Vector<>(); //벡터형인데, 리스트형으로도 표현 가능하다.
        vectorList.add(MyData.create(1));
        vectorList.add(MyData.create(2));
        vectorList.add(MyData.create(3));
        method1(vectorList);
        System.out.println("vectorList = " + vectorList);

        System.out.println("=============================");
        List<MyData> arrayList = new ArrayList<>(); //벡터형인데, 리스트형으로도 표현 가능하다.
        arrayList.add(MyData.create(1));
        arrayList.add(MyData.create(2));
        arrayList.add(MyData.create(3));
        method1(arrayList);
        System.out.println("arrayList = " + arrayList);
    }

    private static void method1(List<MyData> list) {
        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
    }
}
