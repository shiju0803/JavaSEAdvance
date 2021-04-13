package com.shiju.annotate;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author shiju
 * @date 2021/04/13 11:02
 */
//表示Test注解在运行时生效
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Test1 {

}
