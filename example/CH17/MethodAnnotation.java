package onlyfun.caterpillar;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface MethodAnnotation {}