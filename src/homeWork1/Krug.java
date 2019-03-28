package homeWork1;

        public class Krug {
            private double okruj;

            public Krug(){

            }

            public Krug(double okruj) {
                this.okruj = okruj;
            }

            public double getOkruj() {
                return okruj;
            }

            public void setOkruj(double okruj) {
                this.okruj = okruj;
            }
            public void print(){
                System.out.printf("Окружность: %f",this.okruj);}
    }



