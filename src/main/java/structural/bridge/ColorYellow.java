package structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColorYellow implements IColor {

  private static final Logger log = LoggerFactory.getLogger(ColorYellow.class);

  @Override
  public void fillColor() {
    log.info("Fill color is yellow");
  }

}
