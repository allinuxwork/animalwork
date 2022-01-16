package animalwork;

    public abstract class Animal {

        private boolean isSleeping = false;

        abstract void voice();

        public void speak(){
            if (!isSleeping){
                voice();
            } else {
                System.out.println("Животное издавать звуки не может - спит");
            }
        }

        public void sleep(){
            isSleeping = true;
            System.out.println("Животное спит");
        }

        public void eat() {
            isSleeping = false;
            System.out.println("Животное просыпается и может поесть");
        }
}
