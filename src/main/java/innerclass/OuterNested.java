package innerclass;

public class OuterNested {

    private String nonStaticMember;
    private static String staticMember;

    static class Nested {
        public void foo() {
            staticMember = "foo";
            // nonStaticMember = "foo"; static inner classes can only access static members of the outer class
        }
    }
}
