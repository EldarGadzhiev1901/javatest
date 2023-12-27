public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.addProduct(new Drink("Latte", 99, 300, 70));
        vm.addProduct(new Drink("Capuccino", 99, 300, 70));
        vm.addProduct(new Drink("DoubleEspresso", 65, 70, 90));
        vm.addProduct(new Drink("Tea", 70, 300, 95));
        

        System.out.println(vm);

    }
}