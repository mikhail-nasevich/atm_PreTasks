package cars;

public abstract class Auto {

      private String name;
        private String model;
        private double fuel;
        private int value;



    public String getName() {
            return name;
        }

        public String getModel() {
            return model;
        }

        public double getFuel() {
            return fuel;
        }

        public int getValue() {
            return value;
        }



        protected Auto(String name, String model, double fuel, int value){
            this.name=name;
            this.model=model;
            this.fuel=fuel;
            this.value=value;
        }


        public int getTotalValue() {
            return (value);
        }



}
