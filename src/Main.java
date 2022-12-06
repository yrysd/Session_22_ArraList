import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(100);
        arrayList.add("Samira");
        arrayList.add("Ainazik");
        arrayList.add("Aigerim");
        arrayList.add("Saltanat");
        arrayList.add("Kanykei");
        arrayList.add("Aigerim");

        Iterator<String > iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Yryskeldi");
        arrayList2.add("Altynbek");
        arrayList2.add("Aigerim");



//        arrayList.retainAll(arrayList1);
//        System.out.println(arrayList);

//        ArrayList<String> list = new ArrayList<>(
//                Arrays.asList("Aijamal","Maksat","Rahim")
//        );
//        System.out.println(list);

//        System.out.println(arrayList.contains("Ainazik"));
//
//        System.out.println(arrayList.isEmpty());
//
//        System.out.println("arrayList.get(4) = " + arrayList.get(4));
//        System.out.println(arrayList.lastIndexOf("Aigerim"));
//        System.out.println("arrayList.indexOf(\"Aigerim\") = " + arrayList.indexOf("Aigerim"));
//
//        ArrayList<String> arraList2 = new ArrayList<>();
//        arraList2.add("Baytik");
//        arraList2.add("Yryskeldi");


//        System.out.println(arrayList);
//        System.out.println(arraList2);
//
//        arrayList.addAll(arraList2);
//        System.out.println("------------");
//        System.out.println("arrayList = "+arrayList);
//        System.out.println("arrayList2 = "+arraList2);

//        arrayList.addAll(2,arraList2);
//        System.out.println("arrayList = "+arrayList);

//        arrayList.clear();
//        System.out.println(arrayList);



    }
}