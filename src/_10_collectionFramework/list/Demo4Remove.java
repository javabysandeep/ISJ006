<<<<<<<< HEAD:src/_10_collectionFramework/listImpl/Demo4Remove.java
package _10_collectionFramework.listImpl;
========
package _10_collectionFramework.list;
>>>>>>>> 93ef722a3444e7b54d0413ca0851d6446f70f292:src/_10_collectionFramework/list/Demo4Remove.java

import java.util.ArrayList;

public class Demo4Remove {
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

        //remove single element either specifying index or element itself
        arrayList1.remove(0);
        arrayList1.remove(null);
        arrayList1.remove(true);
        System.out.println("after removal operation");
        System.out.println(arrayList1);

    }
}
