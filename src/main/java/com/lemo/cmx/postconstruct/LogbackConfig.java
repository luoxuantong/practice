package com.lemo.cmx.postconstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.UrlResource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;

/**
 * Created by 罗选通 on 2017/10/25.
 */
public class LogbackConfig implements ServletContextListener {
  private static final Logger logger = LoggerFactory.getLogger(LogbackConfig.class);

  private static final String CONFIG_LOCATION = "logbackConfigLocation";

  @Override
  public void contextInitialized(ServletContextEvent event) {
// 从web.xml中加载指定文件名的日志配置文件
    String logbackConfigLocation = event.getServletContext().getInitParameter(CONFIG_LOCATION);
    String fn = event.getServletContext().getRealPath(logbackConfigLocation);
    try {
      UrlResource urlResource = new UrlResource(logbackConfigLocation);
      LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
      loggerContext.reset();
      JoranConfigurator joranConfigurator = new JoranConfigurator();
      joranConfigurator.setContext(loggerContext);
      //joranConfigurator.doConfigure(fn);
      joranConfigurator.doConfigure(urlResource.getFile().getAbsolutePath());
      logger.debug("loaded slf4j configure file  from {}", fn);
    } catch (JoranException e) {
      logger.error("can loading slf4j configure file from " + fn, e);
    } catch (Exception e) {
      logger.error(e.getMessage(), e);
    }
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {

  }
}
