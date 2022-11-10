package Lab3.Interfaces;

import Lab3.Objects.State;

public interface NotAlive {
    State getState();
    void setState(State newState);
}
