package com.lemo.cmx.argumentresolver;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Created by 罗选通 on 2017/12/14.
 */
public class ReportArgumentResolver implements HandlerMethodArgumentResolver {
  /**
   * Whether the given {@linkplain MethodParameter method parameter} is
   * supported by this resolver.
   *
   * @param parameter the method parameter to check
   * @return {@code true} if this resolver supports the supplied parameter; {@code false} otherwise
   */
  @Override
  public boolean supportsParameter(MethodParameter parameter) {
    return false;
  }

  /**
   * Resolves a method parameter into an argument value from a given request.
   * A {@link ModelAndViewContainer} provides access to the model for the
   * request. A {@link WebDataBinderFactory} provides a way to create
   * a {@link WebDataBinder} instance when needed for data binding and
   * type conversion purposes.
   *
   * @param parameter     the method parameter to resolve. This parameter must have previously been
   *                      passed to {@link #supportsParameter} which must have returned {@code
   *                      true}.
   * @param mavContainer  the ModelAndViewContainer for the current request
   * @param webRequest    the current request
   * @param binderFactory a factory for creating {@link WebDataBinder} instances
   * @return the resolved argument value, or {@code null}
   * @throws Exception in case of errors with the preparation of argument values
   */
  @Override
  public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
    return null;
  }
}
