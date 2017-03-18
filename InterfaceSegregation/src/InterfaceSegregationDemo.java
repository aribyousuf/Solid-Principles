/**
 * Created by glab on 10/22/16.
 */
public class InterfaceSegregationDemo {
}

interface IWorker{

   void work();
    void feed();
    void charge();

}

class Worker implements IWorker{

    @Override
    public void work() {
        System.out.println("Work");
    }

    @Override
    public void feed() {
        System.out.println("Feed");
    }

    @Override
    public void charge() {
        System.out.println("Charge");
    }
}
class robot implements IWorker{

    @Override
    public void work() {
        System.out.println("Work");
    }

    @Override
    public void feed() {
        System.out.println("Feed");
    }

    @Override
    public void charge() {
        System.out.println("Charge");
    }


}