package innerclass;

public class OuterInner {

    private String member;

    class Inner {
        //public static String thisIsNotPossible;

        public void foo() {
            member = "foo";
        }
    }
}
