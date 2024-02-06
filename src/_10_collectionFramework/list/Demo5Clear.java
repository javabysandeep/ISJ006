<<<<<<<< HEAD:src/_10_collectionFramework/listImpl/Demo5Clear.java
package _10_collectionFramework.listImpl;
========
package _10_collectionFramework.list;
>>>>>>>> 93ef722a3444e7b54d0413ca0851d6446f70f292:src/_10_collectionFramework/list/Demo5Clear.java

import java.util.ArrayList;

public class Demo5Clear {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList<>();
        arrayList1.add(100);
        arrayList1.add(200);
        arrayList1.add(300);
        arrayList1.add(0, 400);
        arrayList1.add(null);
        arrayList1.add(null);
        arrayList1.add(null);
        arrayList1.add(true);
        arrayList1.add("this is string data");
        System.out.println("before removal operation");
        System.out.println(arrayList1);

        //remove all elements
        arrayList1.clear();
        System.out.println("after removal operation");
        System.out.println(arrayList1);

    }
}
