package net.jeefuse.mda.annotations.site;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 查看详细.
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE,ElementType.FIELD})
public @interface ViewDetail {

}
