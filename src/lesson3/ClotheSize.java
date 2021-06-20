package lesson3;

public enum ClotheSize {
    XXS(32){
        @Override
        public void getDescription() {
            System.out.println("To get size XXS");
        }
    }, XS(34){
        @Override
        public void getDescription() {
            System.out.println("To get size XS");
        }
    }, S(36){
        @Override
        public void getDescription() {
            System.out.println("To get size S");
        }
    }, M(38){
        @Override
        public void getDescription() {
            System.out.println("To get size M");
        }
    }, L(40){
        @Override
        public void getDescription() {
            System.out.println("To get size L");
        }
    };

    private int euroSize;

    ClotheSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public abstract void getDescription();
}
