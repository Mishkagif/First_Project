import java.util.*;

public class New_Generics {
    public static void main(String[] args) {
        //Легкий Масив-лист
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello,dear World");
        strings.add("2");


        System.out.println(strings.get(0));
        strings.remove("2");
        System.out.println(strings.get(0));

//Легкий Лінкед-Лист
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        System.out.println(list);

//ХешСет
        HashSet<String> set = new HashSet<>();
        set.add("2");
        set.add("1");
        System.out.println(set);

        //ЛінкедХешСет
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set.add("2");
        set.add("3");
        System.out.println(set);

        //HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Dulyak", 27);
        map.put("Misha", 27);
        map.put("Dulyak", 26);
        System.out.println(map.containsKey("Dulyak"));
        System.out.println(map.get("Dulyak"));

      //Linked HashMap
        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
        map.put("glass", 1);
        map.put("cup", 2);
        System.out.println(map);
    }


}

