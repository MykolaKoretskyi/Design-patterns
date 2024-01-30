package behavioral.state;

import static behavioral.state.State.DRAFT;
import static behavioral.state.State.MODERATION;
import static behavioral.state.State.PUBLISHED;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Docum {

  private static final Logger log = LoggerFactory.getLogger(Docum.class);
  private static final String CURRENT_STATUS = "Current document status: {}";
  private State state = DRAFT;

  public void publish() {

    if (state.getAvailableStatuses().contains(MODERATION)) {
      log.info(CURRENT_STATUS, state);
      log.info("The document has been created and will be submitted for moderation. "
          + "The object will change the entire state to MODERATION");
      state = MODERATION;
      return;
    }
    if (state.getAvailableStatuses().contains(PUBLISHED)) {
      log.info(CURRENT_STATUS, state);
      log.info("The document has been successfully moderated and corrected and will be published. "
          + "The object will change its state to PUBLISHED");
      state = PUBLISHED;
      return;
    }
    if (state == PUBLISHED) {
      log.info(CURRENT_STATUS, state);
      log.info("The document has been published. The state of the object will not change");
    }
  }

}
