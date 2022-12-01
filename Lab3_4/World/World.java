package Lab3_4.World;

import Lab3_4.Human.Man;
import Lab3_4.Human.State;
import Lab3_4.Objects.ObjectState;
import Lab3_4.Objects.SomeObject;
import Lab3_4.Objects.Weight;

import java.util.ArrayList;

public class World {
    private final ArrayList<Man> People;
    private final ArrayList<SomeObject> Objects;
    private Gravity WorldGravity;

    /**
     * @param gravity гравитация мира
     */
    public World(Gravity gravity) {
        People = new ArrayList<>();
        Objects = new ArrayList<>();
        WorldGravity = gravity;
        System.out.println("Создан мир с гравитацией " + gravity + " (G = " + gravity.getGravityValue() + ")");
    }

    /**
     * @return количество людей в мире
     */
    public Integer getPeopleCount() {
        return People.size();
    }

    /**
     * @return количество объектов в мире
     */
    public Integer getObjectsCount() {
        return Objects.size();
    }

    /**
     * @param index индекс человека в списке людей
     * @return человек, соответствующий индексу
     */
    public Man getMan(int index) {
        return People.get(index);
    }

    /**
     * @param man человек, который нужно добавить в мир
     */
    public void addMan(Man man) {
        People.add(man);
        updateGravity();
    }

    /**
     * @param index индекс объекта в списке
     * @return объект, соответствующий индексу
     */
    public Object getObject(int index) {
        return Objects.get(index);
    }

    /**
     * @param object объект, который нужно добавить в мир
     */
    public void addObject(SomeObject object) {
        Objects.add(object);
        updateGravity();
    }

    /**
     * @return Возвращает гравитацию мира
     */
    public Gravity getWorldGravity() {
        return WorldGravity;
    }

    /**
     * @param gravity гравитация, которую нужно установить
     */
    public void updateWorldGravity(Gravity gravity) {
        if (WorldGravity == gravity) {
            System.out.println("Гравитация в мире уже " + gravity);
            return;
        }
        WorldGravity = gravity;
        updateGravity();
        System.out.println("Гравитация в мире изменилась на " + gravity + " (G = " + gravity.getGravityValue() + ")");
    }

    /**
     * Обновляет гравитацию в мире
     */
    private void updateGravity() {
        switch (WorldGravity) {
            // Невесомость
            case Zero -> {
                // Перевод всех людей и переводим их состояние на "полет"
                for (Man man : People) {
                    switch (man.getState()) {
                        case Read -> man.setState(State.FlyAndRead);
                        case Sleep -> man.setState(State.FlyAndSleep);
                        default -> man.setState(State.Fly);
                    }
                }
                // Перебираем все объекты в мире и меняем их состояние на "летающий"
                for (SomeObject object : Objects) {
                    object.setState(ObjectState.Fly);
                }
            }
            // Низкая гравитация
            case Low -> {
                changeGravityForPeople();
                // Состояние завасит от веса
                for (SomeObject object : Objects) {
                    if (object.getWeight() == Weight.Heavy) {
                        object.setState(ObjectState.Stand);
                        continue;
                    }
                    object.setState(ObjectState.Fly);
                }
            }

            // Земная гравитация
            case Earth -> {
                changeGravityForPeople();
                // Перебираем все объекты в мире и меняем их состояние на "стоит"
                for (SomeObject object : Objects) {
                    object.setState(ObjectState.Stand);
                }
            }
        }
    }

    // Changing state for low and Earth gravity
    private void changeGravityForPeople() {
        for (Man man : People) {
            switch (man.getState()) {
                case FlyAndSleep -> {
                    System.out.println(man.getName() + " падает на землю и просыпается.");
                    man.setState(State.Lie);
                }
                case FlyAndRead -> man.setState(State.Read);
                default -> man.setState(State.Stand);
            }
        }
    }
}
