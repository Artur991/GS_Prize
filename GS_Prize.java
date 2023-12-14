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
}