package onlyfun.caterpillar;

public @interface Process {
    public enum Current {NONE, REQUIRE, ANALYSIS, DESIGN, SYSTEM};

    Current current() default Current.NONE;
    String tester();
    boolean ok();
}