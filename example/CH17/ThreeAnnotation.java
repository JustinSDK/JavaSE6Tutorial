package onlyfun.caterpillar;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Inherited;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ThreeAnnotation {
    String value();
    String name();
}