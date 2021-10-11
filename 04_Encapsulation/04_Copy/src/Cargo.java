public class Cargo {
    private final Dimensions dimensions;
    private final int weight;
    private final String deliveryAdress;
    private final boolean canOverturn;
    private final String regNumber;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions, int weight, String deliveryAdress, boolean canOverturn, String regNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAdress = deliveryAdress;
        this.canOverturn = canOverturn;
        this.regNumber = regNumber;
        this.isFragile = isFragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, deliveryAdress, canOverturn, regNumber, isFragile);
    }

    public int getWeight() {
        return weight;
    }

    public Cargo setWeight(int weight) {
        return new Cargo(dimensions, weight, deliveryAdress, canOverturn, regNumber, isFragile);
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public Cargo setDeliveryAdress(String deliveryAdress) {
        return new Cargo(dimensions, weight, deliveryAdress, canOverturn, regNumber, isFragile);
    }

    public boolean isCanOverturn() {
        return canOverturn;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isFragile() {
        return isFragile;
    }
}

