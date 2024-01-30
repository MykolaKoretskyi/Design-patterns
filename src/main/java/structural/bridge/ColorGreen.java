package structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColorGreen implements IColor {

  private static final Logger log = LoggerFactory.getLogger(ColorGreen.class);

  @Override
  public void fillColor() {
    log.info("Fill color is green");
  }

}
