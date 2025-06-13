package common.non_jpa.annotation;

import common.non_jpa.exception.GlobalExceptionHandler;
import common.non_jpa.pageable.PageableConfig;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

@Import({
    PageableConfig.class,
    GlobalExceptionHandler.class
})
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableCommonModule {

}
