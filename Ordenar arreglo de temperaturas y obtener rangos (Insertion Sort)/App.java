public class App {
    public static void main(String[] args) {
        TemperatureSort sorting = new TemperatureSort();
        double[] arr = {21.5, 19.2, 30.0, 26.7, 11.1, 27.9, 31.9, 10.8, 45.9, 7.9};

        System.out.println("Arreglo original:");
        sorting.printArray(arr);

        sorting.sort(arr);

        sorting.showResults(arr);
    }
}
