package creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * In this program, the Builder design pattern is implemented, allowing the creation of complex
 * objects step by step. The Builder pattern enables using the same construction code to obtain
 * different representations of objects.
 **/
public class AppBuildCar {

  private static final Logger log = LoggerFactory.getLogger(AppBuildCar.class);

  public static void main(String[] args) {

    CarEquipment carAudi = new CarBuilder()
        .setClimateControl(true)
        .setAutopilot(true)
        .setPanoramicRoof(true)
        .setAllWheelDrive(true)
        .setLeatherInterior(true)
        .build();
    log.info("Audi has such a configuration: {}", carAudi);

    CarEquipment carChevrolet = new CarBuilder()
        .setClimateControl(true)
        .setSubwoofer(true)
        .build();
    log.info("Chevrolet has such a configuration: {}", carChevrolet);

  }

}
