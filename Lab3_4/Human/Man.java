package Lab3_4.Human;

import Lab3_4.Objects.Chair;

public interface Man {
    default String getName() {
        return "Неизвестно";
    }

    default Mood getMood() {
        return Mood.Neutral;
    }

    void setMood(Mood mood);

    default State getState() {
        return State.Stand;
    }

    void setState(State state);

    void sitOnChair(Chair chair);
}
