package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxySite implements ISite {

  private final ISite site;
  private final Map<Integer, String> cache;

  public ProxySite(ISite site) {
    this.site = site;
    this.cache = new HashMap<>();
  }

  @Override
  public String getPage(int num) {

    String page;

    if (cache.containsKey(num)) {
      page = "Retrieved from the ProxySite class cache: " + cache.get(num);
    } else {
      page = site.getPage(num);
      cache.put(num, page);
    }
    return page;
  }

}
