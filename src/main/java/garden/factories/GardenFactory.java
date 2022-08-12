package garden.factories;

import garden.flowers.Flower;
import garden.trees.Tree;

public interface GardenFactory {
    Tree createTree();
    Flower createFlower();
}
