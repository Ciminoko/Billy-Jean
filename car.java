public class сar {
    String model;
    String type;

    public сar(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String toString() {
        return "сar: " + model + " Type: " + type;
    }

    public boolean compareModelIgnoreCase(String anotherModel) {
        return model.equalsIgnoreCase(anotherModel);
    }

    public static void main(String[] args) {
        сar trueno = new сar("Trueno AE86", "Sports сar");
        System.out.println(trueno.toString());

        String comparisonModel = "Trueno AE86";
        boolean isEqualModel = trueno.compareModelIgnoreCase(comparisonModel);

        if (isEqualModel) {
            System.out.println("Model of the car is equal to the comparison string (case-insensitive).");
        } else {
            System.out.println("Model of the car is not equal to the comparison string (case-insensitive).");
        }
    }
}
