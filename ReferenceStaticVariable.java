public class ReferenceStaticVariable {
  static String name;
  public ReferenceStaticVariable() {}
  public ReferenceStaticVariable(String name) {
    this.name = name;
  }
  public static void main(String[] args) {
    ReferenceStaticVariable reference = new ReferenceStaticVariable();
    reference.checkName();
  }
  public void checkName() {
   ReferenceStaticVariable reference1 =  new ReferenceStaticVariable("danny");
   System.out.println(reference1.name);
   ReferenceStaticVariable reference2 =  new ReferenceStaticVariable("benny");
   System.out.println(reference1.name); // name이 클래스 변수 이므로, 모든 객체가 하나의 값을 바라본다.
  }
}
