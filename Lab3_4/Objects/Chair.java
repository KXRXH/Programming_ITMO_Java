package Lab3_4.Objects;

import Lab3_4.Human.Man;


public class Chair extends SomeObject {
    private final Integer LegsCount;
    private final Integer ChairId;
    private Man SittingMan = null;

    public Chair(Material material, Integer legsCount, ObjectState state) {
        super(state, Weight.Light, material);
        LegsCount = legsCount;
        ChairId = (int) (Math.random() * 1000);
    }

    public Integer getLegsCount() {
        return LegsCount;
    }

    public void setSittingMan(Man man) {
        if (getState() == ObjectState.Fly) {
            System.out.println("Стул летит, на него нельзя сесть");
            return;
        }
        if (SittingMan != null) {
            System.out.println("На стуле уже сидит " + SittingMan.getName());
            return;
        }
        SittingMan = man;
        man.setState(Lab3_4.Human.State.Sit);
        System.out.println("На стуле#" + getChairId() + " сидит " + SittingMan.getName());
    }

    @Override
    public void setState(ObjectState state) {
        if (State == state) {
            return;
        }
        switch (state) {
            case Fly -> {
                if (SittingMan != null) {
                    System.out.println(SittingMan.getName() + " падает со стула");
                    SittingMan = null;
                }
                State = state;
                System.out.println("Стул#" + this.getChairId() + " теперь " + state.toString().toLowerCase());
            }
            case Stand -> {
                System.out.println("Стул#" + this.getChairId() + " падает на землю");
                State = state;
            }
        }
        System.out.println("Стул#" + ChairId + " теперь " + state.toString().toLowerCase());
        this.State = state;
    }

    public Integer getChairId() {
        return ChairId;
    }

    @Override
    public String toString() {
        return "Стул с количеством ножек: " + this.getLegsCount() + " | Состояние: " +
                this.getState().toString().toLowerCase() + " | Сидит на нем: " +
                (SittingMan == null ? "Никто" : SittingMan.getName());
    }

    @Override
    public int hashCode() {
        return this.getLegsCount().hashCode() + SittingMan.hashCode() + this.Material.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        return obj instanceof Chair && this.hashCode() == obj.hashCode();
    }
}

