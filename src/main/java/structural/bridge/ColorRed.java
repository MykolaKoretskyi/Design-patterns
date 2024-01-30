package structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColorRed implements IColor {

  private static final Logger log = LoggerFactory.getLogger(ColorRed.class);

  @Override
  public void fillColor() {
    log.info("Fill color is red");
  }

}
