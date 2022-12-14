package Lab3_4.Objects;

import Lab3_4.Human.Person;


public class Chair extends SomeObject {
    private final Integer LegsCount;
    private final Integer ChairId;
    private Person SittingMan = null;

    public Chair(Material material, Integer legsCount, ObjectState state) {
        super(state, Weight.Light, material);
        LegsCount = legsCount;
        ChairId = (int) (Math.random() * 1000);
    }

    public Integer getLegsCount() {
        return LegsCount;
    }

    public void setSittingMan(Person man) {
        if (getState() == ObjectState.Fly) {
            System.out.println("Стул летит, на него нельзя сесть");
            return;
        }
        if (SittingMan != null) {
            System.out.println("\uD83E\uDDD2\uD83E\uDE91\uD83E\uDDD2 На стуле уже сидит " + SittingMan.getName() + " \uD83E\uDDD2\uD83E\uDE91\uD83E\uDDD2");
            return;
        }
        SittingMan = man;
        man.setState(Lab3_4.Human.State.Sit);
        System.out.println("\uD83E\uDDD2\uD83E\uDE91 На стуле#" + getChairId() + " сидит " + SittingMan.getName() + " \uD83E\uDDD2\uD83E\uDE91");
    }

    @Override
    public void setState(ObjectState state) {
        if (State == state) {
            return;
        }
        switch (state) {
            case Fly -> {
                if (SittingMan != null) {
                    System.out.println("\uD83C\uDF20 " + SittingMan.getName() + " падает со стула... \uD83C\uDF20");
                    SittingMan = null;
                }
                System.out.println("\uD83E\uDE91 Стул#" + this.getChairId() + " теперь " + state.toString().toLowerCase() + " \uD83E\uDE91");
            }
            case Stand -> {
                System.out.println("\uD83E\uDE91 Стул#" + this.getChairId() + " падает на землю \uD83E\uDE91");
            }
        }
        this.State = state;
    }

    public Integer getChairId() {
        return ChairId;
    }

    @Override
    public String toString() {
        return "\uD83E\uDE91 Стул с количеством ножек: " + this.getLegsCount() + " | Состояние: " + this.getState().toString().toLowerCase() + " | Сидит на нем: " + (SittingMan == null ? "Никто" : SittingMan.getName());
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

