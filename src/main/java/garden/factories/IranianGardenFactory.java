package garden.factories;

import garden.flowers.Flower;
import garden.flowers.Khatmi;
import garden.trees.Chenar;
import garden.trees.Tree;

public class IranianGardenFactory implements GardenFactory{
    @Override
    public Tree createTree() {
        return new Chenar();
    }

    @Override
    public Flower createFlower() {
        return new Khatmi();
    }
}
