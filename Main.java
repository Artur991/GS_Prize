public class Main {
    public static void main(String[] args) {
        GS_Prize store = new GS_Prize();
        store.addToy(1, "Toy 1", 10, 20);
        store.addToy(2, "Toy 2", 5, 10);
        store.addToy(3, "Toy 3", 20, 70);
        store.setToyWeight(2, 30);
        store.play();
    }
}