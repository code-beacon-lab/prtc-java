package thricky;

import java.util.ArrayList;

public class ListScopeTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        scopeTest(list); // list를 반환하지 않아도 전역으로 처리된다.

        for(String s: list) {
            System.out.println("s = " + s);
        }
    }

    private static void scopeTest(ArrayList<String> list) {
        list.add("test1");
        list.add("test2");
        list.add("test3");
    }
}
