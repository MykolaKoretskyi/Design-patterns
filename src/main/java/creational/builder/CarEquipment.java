package creational.builder;

import java.util.StringJoiner;

public class CarEquipment {

  private boolean climateControl;
  private boolean subwoofer;
  private boolean autopilot;
  private boolean panoramicRoof;
  private boolean allWheelDrive;
  private boolean leatherInterior;

  @Override
  public String toString() {

    StringJoiner carEquipment = new StringJoiner(", ", "[", "]");

    addIf(carEquipment, climateControl, "Climate control");
    addIf(carEquipment, subwoofer, "Subwoofer");
    addIf(carEquipment, autopilot, "Autopilot");
    addIf(carEquipment, panoramicRoof, "Panoramic roof");
    addIf(carEquipment, allWheelDrive, "All-wheel drive");
    addIf(carEquipment, leatherInterior, "Leather interior");

    return carEquipment.toString();
  }

  private void addIf(StringJoiner carEquipment, boolean isPresent, String option) {
    if (isPresent) {
      carEquipment.add(option);
    }
  }

  public void setClimateControl(boolean climateControl) {
    this.climateControl = climateControl;
  }

  public void setSubwoofer(boolean subwoofer) {
    this.subwoofer = subwoofer;
  }

  public void setAutopilot(boolean autopilot) {
    this.autopilot = autopilot;
  }

  public void setPanoramicRoof(boolean panoramicRoof) {
    this.panoramicRoof = panoramicRoof;
  }

  public void setAllWheelDrive(boolean allWheelDrive) {
    this.allWheelDrive = allWheelDrive;
  }

  public void setLeatherInterior(boolean leatherInterior) {
    this.leatherInterior = leatherInterior;
  }
}
