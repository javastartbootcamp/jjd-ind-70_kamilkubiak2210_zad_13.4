package pl.javastart.task;

public class Main {

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static void main(String[] args) {

        // tutaj możesz przeprowadzać manualne testy listy

        // lista powinna być parametryzowana (analogicznie jak java.util.ArrayList czy java.util.LinkedList)
        CustomList<String> customListOfStrings = new CustomList();
        CustomList<Integer> customListOfIntegers = new CustomList();
        customListOfStrings.add("a");
        customListOfStrings.add("b");
        customListOfStrings.add("c");
        customListOfStrings.add("d");
        customListOfStrings.add("e");
        customListOfStrings.add("f");
        customListOfStrings.add("g");
        customListOfStrings.add("h");
        customListOfStrings.add("i");
        customListOfStrings.add("j");
        customListOfStrings.add("k");
        String string = customListOfStrings.toString();
        System.out.println(string);
        int size = customListOfStrings.size();
        System.out.println("size: " + size);
        customListOfStrings.remove(1);
        System.out.println("remove index 1");
        String string1 = customListOfStrings.toString();
        System.out.println(string1);
        int size1 = customListOfStrings.size();
        System.out.println("size: " + size1);
        String index1 = customListOfStrings.get(1);
        System.out.println("index 1 = " + index1);
        customListOfStrings.add(1, "C");
        System.out.println("replace index 1 to \"C\"");
        String string2 = customListOfStrings.toString();
        System.out.println(string2);

        String s = customListOfStrings.get(22);
        System.out.println(s);

    }
}
