package com.icebartech.certificate.aop.anno;

import com.icebartech.certificate.aop.enums.LogType;

import java.lang.annotation.*;

/**
 * @author Created by liuao on 2019/7/16.
 * @desc
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    String value() default "";
    LogType name();
}

