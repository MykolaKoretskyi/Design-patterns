package behavioral.state;

import java.util.Set;

/**
 * The enumeration contains a list of the states of the Docum object, and for each value it
 * indicates the permissible value for changing the state.
 */

public enum State {

  DRAFT {
    @Override
    public Set<State> getAvailableStatuses() {
      return Set.of(MODERATION);
    }
  },
  MODERATION {
    @Override
    public Set<State> getAvailableStatuses() {
      return Set.of(PUBLISHED);
    }
  },
  PUBLISHED {
    @Override
    public Set<State> getAvailableStatuses() {
      return Set.of();
    }
  };

  public abstract Set<State> getAvailableStatuses();
}
