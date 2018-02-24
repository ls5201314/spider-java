package com.matai.pager;

import com.github.pagehelper.PageHelper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class PagerAspect {

    @Before("execution(* com.matai.service..*.findList*(Integer, Integer, ..))")
    public void doPage(JoinPoint joinPoint) {
        PageHelper.startPage((Integer)joinPoint.getArgs()[0], (Integer)joinPoint.getArgs()[1]);
    }
}
