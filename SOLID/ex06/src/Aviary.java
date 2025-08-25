class Aviary implements IFly{
    public void fly(){
        System.out.println("Flap!");
    }
    public void release(IFly b){
        b.fly();
        System.out.println("Released");
    }
}