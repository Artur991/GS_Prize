import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GS_Prize {
    private List<GS> toys;
    private List<GS> prizeToys;

public GS_Prize() {
    toys = new ArrayList<>();
    prizeToys = new ArrayList<>();
}
public void addToy(int id, String name, int quantity, double weight) {
    GS toy = new GS(id, name, quantity, weight);
    toys.add(toy);
}
public void setToyWeight(int id, double weight) {
    for (GS toy : toys) {
        if (toy.getId() == id) {
            toy.setWeight(weight);
            break;
        }
    }
}
public void play() {
    double totalWeight = 0;
    for (GS toy : toys) {
        totalWeight += toy.getWeight();
    }
    Random rand = new Random();
    double randomNumber = rand.nextDouble() * totalWeight;
    GS prizeToy = null;
    for (GS toy : toys) {
        if (randomNumber < toy.getWeight()) {
            prizeToy = toy;
            break;
        }
        randomNumber -= toy.getWeight();
    }
    if (prizeToy != null && prizeToy.getQuantity() > 0) {
        prizeToys.add(prizeToy);
        prizeToy.setQuantity(prizeToy.getQuantity() - 1);
    }
}

}