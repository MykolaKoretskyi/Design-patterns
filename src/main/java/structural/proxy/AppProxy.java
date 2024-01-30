package structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This program implements the proxy pattern, which is a structural design pattern that allows you
 * to substitute special substitute objects for real objects. These objects intercept calls to the
 * original object, allowing you to do something before or after the call is passed to the
 * original.
 */

public class AppProxy {

  private static final Logger log = LoggerFactory.getLogger(AppProxy.class);

  public static void main(String[] args) {

    ISite site = new ProxySite(new Site());
    log.info(site.getPage(1));
    log.info(site.getPage(2));
    log.info(site.getPage(1));
    log.info(site.getPage(2));
    log.info(site.getPage(3));
    log.info(site.getPage(3));
  }

}
