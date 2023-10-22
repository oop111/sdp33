public class Main {
    public static void main(String[] args) {
        PowerSource solarPower = new SolarPowerSource();
        Laptop acerLaptop = new AcerLaptop();
        Laptop macbookLaptop = new MacbookLaptop();
        Laptop lenovoLaptop = new LenovoLaptop();

        Laptop adapterForSolar = new PowerAdapter(solarPower, acerLaptop);
        Laptop adapterForGeneratorMac = new PowerAdapter(new GeneratorPowerSource(), macbookLaptop);
        Laptop adapterForGenerator = new PowerAdapter(new GeneratorPowerSource(), lenovoLaptop);

        adapterForSolar.charge();
        adapterForGenerator.charge();
        adapterForGeneratorMac.charge();
    }
}
