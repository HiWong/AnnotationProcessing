package wang.imallen.blog.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于标识属于某类工厂的类
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface Factory {
    /**
     * 工厂名
     * @return
     */
    Class type();

    /**
     * 决定哪个item应该被实例化的id
     * @return
     */
    String id();
}
