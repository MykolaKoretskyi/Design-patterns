package structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle extends Shape {

  private static final Logger log = LoggerFactory.getLogger(Circle.class);

  public Circle(IColor color) {
    super.color = color;
  }

  @Override
  public void draw() {
    log.info("Shape: O");
    color.fillColor();
  }

}
