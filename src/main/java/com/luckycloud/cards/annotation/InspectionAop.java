package com.luckycloud.cards.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//aop
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InspectionAop {
}
