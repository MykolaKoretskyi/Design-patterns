package structural.proxy;

public class Site implements ISite {


  @Override
  public String getPage(int num) {
    return "This is information from page number " + num + " of the Site class";
  }

}
