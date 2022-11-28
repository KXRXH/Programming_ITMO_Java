package Lab3_4;

import Lab3_4.Generator.Generator;
import Lab3_4.People.State;
import Lab3_4.World.Gravity;
import Lab3_4.World.World;

public class Lab3_4 {
    public static void main(String... args) {
        World world = new World(Gravity.Earth);
        world.addMan(Generator.generateNewMan());
        world.addMan(Generator.generateNewMan());
        world.getMan(0).setState(State.Read);
        System.out.println(world.getMan(0).getState());
        world.updateWorldGravity(Gravity.Zero);
        System.out.println(world.getMan(0).getState());
        world.updateWorldGravity(Gravity.Low);
        System.out.println(world.getMan(0).getState());
    }
}