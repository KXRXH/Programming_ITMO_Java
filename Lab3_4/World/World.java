package Lab3_4.World;

import Lab3_4.Objects.ObjectState;
import Lab3_4.Objects.SomeObject;
import Lab3_4.People.Man;
import Lab3_4.People.State;

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
        System.out.println("Создан мир с гравитацией " + gravity);
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
        System.out.println("Гравитация в мире изменилась на " + gravity);
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
                for (Man man : People) {
                    switch (man.getState()) {
                        case FlyAndSleep -> man.setState(State.Sleep);
                        case FlyAndRead -> man.setState(State.Read);
                        default -> man.setState(State.Stand);
                    }
                }
                // Перебираем все объекты в мире и меняем их состояние на "летает"
                for (SomeObject object : Objects) {
                    object.setState(ObjectState.Fly);
                }
            }

            // Земная гравитация
            case Earth -> {
                for (Man man : People) {
                    switch (man.getState()) {
                        case FlyAndSleep -> man.setState(State.Sleep);
                        case FlyAndRead -> man.setState(State.Read);
                        default -> man.setState(State.Stand);
                    }
                }
                // Перебираем все объекты в мире и меняем их состояние на "стоит"
                for (SomeObject object : Objects) {
                    object.setState(ObjectState.Stand);
                }
            }
        }
    }
}
