package hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Dictionary map = new Dictionary();
        System.out.println(map.put("Lala","Nana"));
        System.out.println(map.put("Lala","ooo"));
        System.out.println(map.put("papa","ooo"));
        System.out.println(map.put("nananana","mama"));
        System.out.println(map.get("Lala"));
        System.out.println(map.get("papa"));
        System.out.println(map.size());
        System.out.println(map.containsKey("Lala"));
        System.out.println(map.remove("Lala"));
        System.out.println(map.size());
        HashMap hashMap = new HashMap();
        System.out.println(map.entrySet());
        hashMap.put(6,4);
        hashMap.put(9,12);
        hashMap.put(50,4);
        map.putAll(hashMap);
        System.out.println(map.entrySet());
        System.out.println(map.size());

//        Set bb = map.entrySet();
//        System.out.println(bb);
//        map.remove("Lala");
//        System.out.println(bb);
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        HashMap hashMap = new HashMap();
//        hashMap.put(6,4);
//        hashMap.put(9,12);
//        hashMap.put(50,4);
//        Set dd = hashMap.entrySet();
//        System.out.println(dd);










    }
}
