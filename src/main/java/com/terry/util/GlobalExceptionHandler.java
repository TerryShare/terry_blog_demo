package com.terry.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Greated by Terry on 2018/8/27
 * Time: 10:42
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    public  static final String DEFAULT_ERROR_VIEW="error";

    public ModelAndView defailtErrotHandler(HttpServletRequest request,Exception e ){
        ModelAndView mav = new ModelAndView(); mav.addObject("exception", e);
        mav.addObject("url", request.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;

    }
}
