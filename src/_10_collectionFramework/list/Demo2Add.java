<<<<<<<< HEAD:src/_10_collectionFramework/listImpl/Demo2Add.java
package _10_collectionFramework.listImpl;
========
package _10_collectionFramework.list;
>>>>>>>> 93ef722a3444e7b54d0413ca0851d6446f70f292:src/_10_collectionFramework/list/Demo2Add.java

import java.util.ArrayList;

public class Demo2Add {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(0, 400);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(true);
        arrayList.add("this is string data");

        System.out.println(arrayList.toString());
    }
}
