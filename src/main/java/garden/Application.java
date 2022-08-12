package garden;

import garden.factories.GardenFactory;
import garden.flowers.Flower;
import garden.trees.Tree;

public class Application {
    private Tree tree;
    private Flower flower;

    public Application(GardenFactory gardenFactory) {
        tree = gardenFactory.createTree();
        flower = gardenFactory.createFlower();
    }

    public void look() {
        tree.look();
        flower.look();
    }
}
