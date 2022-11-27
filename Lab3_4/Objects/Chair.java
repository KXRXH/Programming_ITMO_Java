package Lab3_4.Objects;

import Lab3_4.Persons.Person;
import Lab3_4.Persons.PersonState;

public class Chair extends ObjectCreatedByAMan {
    private boolean IsOccupied;
    private Person OccupiedBy;

    public Chair(State currentState, Material material, boolean isOccupied) {
        super(currentState, material);
        IsOccupied = isOccupied;
    }

    public final boolean isOccupied() {
        return IsOccupied;
    }

    public final Person getPerson() {
        return OccupiedBy;
    }

    public final void setOccupied(Person person, boolean isOccupied) {
        if (IsOccupied != isOccupied) {
            IsOccupied = isOccupied;
            OccupiedBy = person;
            if (IsOccupied) {
                person.setState(PersonState.SIT);
            } else
                person.setState(PersonState.STAND);
        } else {
            System.out.println("Стул уже " + (isOccupied ? "занят" : "свободен"));
        }
    }

    @Override
    public boolean equals(Object otherBook) {
        // Check if the object is the same by hashcode
        if (otherBook.getClass().isInstance(this)) {
            return (this == otherBook);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (IsOccupied ? 1 : 0) * 31 + OccupiedBy.hashCode();
    }

    @Override
    public String toString() {
        return "Стул{" +
                "Материал = " + this.getMaterial().toString() +
                ", Состояние = " + this.getState().toString() +
                ", Занят = " + (IsOccupied ? "Да, Занят(Person) = " + OccupiedBy.getName() : "Нет") +
                '}';
    }
}
