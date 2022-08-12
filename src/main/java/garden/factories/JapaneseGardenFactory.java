package garden.factories;

import garden.flowers.Flower;
import garden.flowers.JapaneseFlower;
import garden.trees.JapaneseTree;
import garden.trees.Tree;

public class JapaneseGardenFactory implements GardenFactory {
    @Override
    public Tree createTree() {
        return new JapaneseTree();
    }

    @Override
    public Flower createFlower() {
        return new JapaneseFlower();
    }
}
