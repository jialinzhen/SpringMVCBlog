package com.waylau.spring.boot.blog.utils;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.apache.commons.lang.StringUtils;
/**
 * ConstraintViolationException 处理器.
 * 
 * @since 1.0.0 2017年5月29日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class ConstraintViolationExceptionHandler {
	 /**
     * 获取批量异常信息
     * @param e
     * @return
     */
    public static String getMessage(ConstraintViolationException e) {
        List<String> msgList = new ArrayList<>();
        for (ConstraintViolation<?> constraintViolation : e.getConstraintViolations()) {
            msgList.add(constraintViolation.getMessage());
        }
        String messages = StringUtils.join(msgList.toArray(), ";");
        return messages;
    }
}
