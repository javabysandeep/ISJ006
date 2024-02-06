<<<<<<<< HEAD:src/_10_collectionFramework/listImpl/Demo1.java
package _10_collectionFramework.listImpl;
========
package _10_collectionFramework.list;
>>>>>>>> 93ef722a3444e7b54d0413ca0851d6446f70f292:src/_10_collectionFramework/list/Demo1.java

public class Demo1 {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(10);
        array.add("abc");
        array.add("xyz");
        array.add(true);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);
        System.out.println("Size " + array.size());
        for (Object temp : array.array) {
            System.out.println(temp);
        }
    }
}
