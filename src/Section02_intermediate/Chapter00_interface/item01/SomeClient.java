package Section02_intermediate.Chapter00_interface.item01;

import java.util.Arrays;

public class SomeClient {
    public static void main(String[] args) {
        SomeService coffeeCasher = new SomeCasher();
        if(coffeeCasher instanceof SomeService)
            System.out.println("instance");
    }
}
