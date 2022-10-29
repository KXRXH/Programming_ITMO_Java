package Lab3.Objects;

import Lab3.Persons.Person;

import java.util.Arrays;

public class Chair extends SomeObject {
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
        } else {
            System.out.println("The chair is already " + (isOccupied ? "occupied" : "free"));
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
        return "Chair{" +
                "Material=" + this.getMaterial().toString() +
                ", State=" + this.getState().toString() +
                ", IsOccupied=" + IsOccupied +
                ", OccupiedBy=" + OccupiedBy +
                '}';
    }
}
