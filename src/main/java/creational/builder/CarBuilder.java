package creational.builder;

public class CarBuilder {

  private final CarEquipment carEquipment = new CarEquipment();

  public CarBuilder setClimateControl(boolean climateControl) {
    carEquipment.setClimateControl(climateControl);
    return this;
  }

  public CarBuilder setSubwoofer(boolean subwoofer) {
    carEquipment.setSubwoofer(subwoofer);
    return this;
  }

  public CarBuilder setAutopilot(boolean autopilot) {
    carEquipment.setAutopilot(autopilot);
    return this;
  }

  public CarBuilder setPanoramicRoof(boolean panoramicRoof) {
    carEquipment.setPanoramicRoof(panoramicRoof);
    return this;
  }

  public CarBuilder setAllWheelDrive(boolean allWheelDrive) {
    carEquipment.setAllWheelDrive(allWheelDrive);
    return this;
  }

  public CarBuilder setLeatherInterior(boolean leatherInterior) {
    carEquipment.setLeatherInterior(leatherInterior);
    return this;
  }

  public CarEquipment build() {
    return carEquipment;
  }
}
