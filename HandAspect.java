package com.icebartech.certificate.aop;

import com.icebartech.certificate.aop.anno.Log;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.icebartech.core.vo.QueryParam.eq;
import static com.icebartech.core.vo.QueryParam.in;


/**
 * @author Created by liuao on 2019/7/13.
 * @desc
 */
@Component
@Aspect
@Slf4j
public class HandAspect {

    private final String POINT_CUT = "execution(* com.icebartech.certificate.certificate.*.*.*(..))";

    @Pointcut(POINT_CUT)
    private void pointcut() {
    }

    @After(value = "@annotation(data)")
    public void after(JoinPoint joinPoint, Log data) {
        log.info("data{}",data);
    }

}
