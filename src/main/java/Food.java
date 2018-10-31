public class Food {
    double price;
    int quantity;
    double weight;

    Food () {
        this.price = 0.5;
        this.quantity = 1;
        this.weight = 0.1;
    }
    Food (double price, int quantity, double weight) {
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
    }
    Food (double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

}

