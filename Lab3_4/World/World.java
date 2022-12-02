package Lab3_4.World;

import Lab3_4.Exceptions.BadIndexException;
import Lab3_4.Human.Man;
import Lab3_4.Human.State;
import Lab3_4.Objects.ObjectState;
import Lab3_4.Objects.SomeObject;
import Lab3_4.Objects.Weight;

import java.util.ArrayList;

public class World {
    private ArrayList<Man> People;
    private ArrayList<SomeObject> Objects;
    private Lab3_4.World.Gravity WorldGravity;

    /**
     * @param gravity гравитация мира
     */
    public World(Gravity gravity) {
        People = new ArrayList<>();
        Objects = new ArrayList<>();
        WorldGravity = gravity;
        System.out.println("\uD83C\uDF0E Создан мир с гравитацией " + gravity + " (G = " + gravity.getGravityValue()
                + ") \uD83C\uDF0E");
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

    public void info() {
        System.out.println("\uD83C\uDF0E Гравитация в мире: G=" + getWorldGravity().getGravityValue() + " \uD83C\uDF0E");
        System.out.println("\uD83E\uDDCD В мире " + getPeopleCount() + " человек(а) \uD83E\uDDCD");
        System.out.println("\uD83E\uDE91 В мире " + getObjectsCount() + " объект(ов|а) \uD83E\uDE91");

    }

    public void apocalypse() {
        People = null;
        Objects = null;
        System.out.println("\uD83D\uDCA3 Наступил конец света... \uD83D\uDCA3\n" +
                "⢿⣿⣿⣿⣭⠹⠛⠛⠛⢿⣿⣿⣿⣿⡿⣿⠷⠶⠿⢻⣿⣛⣦⣙⠻⣿\n" +
                "⣿⣿⢿⣿⠏⠀⠀⡀⠀⠈⣿⢛⣽⣜⠯⣽⠀⠀⠀⠀⠙⢿⣷⣻⡀⢿\n" +
                "⠐⠛⢿⣾⣖⣤⡀⠀⢀⡰⠿⢷⣶⣿⡇⠻⣖⣒⣒⣶⣿⣿⡟⢙⣶⣮\n" +
                "⣤⠀⠀⠛⠻⠗⠿⠿⣯⡆⣿⣛⣿⡿⠿⠮⡶⠼⠟⠙⠊⠁⠀⠸⢣⣿\n" +
                "⣿⣷⡀⠀⠀⠀⠀⠠⠭⣍⡉⢩⣥⡤⠥⣤⡶⣒⠀⠀⠀⠀⠀⢰⣿⣿\n" +
                "⣿⣿⡽⡄⠀⠀⠀⢿⣿⣆⣿⣧⢡⣾⣿⡇⣾⣿⡇⠀⠀⠀⠀⣿⡇⠃\n" +
                "⣿⣿⣷⣻⣆⢄⠀⠈⠉⠉⠛⠛⠘⠛⠛⠛⠙⠛⠁⠀⠀⠀⠀⣿⡇⢸\n" +
                "⢞⣿⣿⣷⣝⣷⣝⠦⡀⠀⠀⠀⠀⠀⠀⠀⡀⢀⠀⠀⠀⠀⠀⠛⣿⠈\n" +
                "⣦⡑⠛⣟⢿⡿⣿⣷⣝⢧⡀⠀⠀⣶⣸⡇⣿⢸⣧⠀⠀⠀⠀⢸⡿⡆\n" +
                "⣿⣿⣷⣮⣭⣍⡛⠻⢿⣷⠿⣶⣶⣬⣬⣁⣉⣀⣀⣁⡤⢴⣺⣾⣽⡇");
    }

    /**
     * @param index индекс человека в списке людей
     * @return человек, соответствующий индексу
     */
    public Man getMan(int index) throws BadIndexException {
        if (index < 0 || index >= getPeopleCount()) {
            throw new BadIndexException("Человека с индексом " + index + " не существует");
        }
        return People.get(index);
    }

    /**
     * @param man человек, который нужно добавить в мир
     */
    public Man addMan(Man man) {
        People.add(man);
        updateGravity();
        return man;
    }

    /**
     * @param index индекс объекта в списке
     * @return объект, соответствующий индексу
     */
    public Object getObject(int index) {
        if (index < 0 || index >= getObjectsCount()) {
            throw new BadIndexException("Объекта с индексом " + index + " не существует");
        }
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
            System.out.println("\uD83C\uDF0E Гравитация в мире уже " + gravity + " \uD83C\uDF0E");
            return;
        }
        WorldGravity = gravity;
        updateGravity();
        System.out.println("\uD83C\uDF0E Гравитация в мире изменилась: G=" + gravity.getGravityValue() + " \uD83C\uDF0E");
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
