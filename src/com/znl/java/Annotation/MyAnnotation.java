package com.znl.java.Annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.PACKAGE,ElementType.METHOD})
@Inherited
public @interface MyAnnotation {

    String value() default "default";

}
