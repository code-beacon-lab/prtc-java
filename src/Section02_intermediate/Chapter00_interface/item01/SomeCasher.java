package Section02_intermediate.Chapter00_interface.item01;

public class SomeCasher implements SomeService {
    @Override
    public void serveSomething() {
        System.out.println("serve coffee");
    }
}
