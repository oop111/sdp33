class PowerAdapter implements Laptop {
    private PowerSource powerSource;
    private Laptop laptop;

    public PowerAdapter(PowerSource powerSource, Laptop laptop) {
        this.powerSource = powerSource;
        this.laptop = laptop;
    }

    public void charge() {
        powerSource.supplyPower();
        laptop.charge();
    }
}