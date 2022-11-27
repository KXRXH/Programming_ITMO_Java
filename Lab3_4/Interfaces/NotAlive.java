package Lab3_4.Interfaces;

import Lab3_4.Objects.State;

public interface NotAlive {
    State getState();
    void setState(State newState);
}
