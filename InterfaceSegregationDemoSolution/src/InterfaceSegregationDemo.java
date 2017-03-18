import com.sun.swing.internal.plaf.synth.resources.synth_sv;
import javafx.concurrent.WorkerStateEvent;
import org.omg.CORBA.IRObject;

/**
 * Created by glab on 10/22/16.
 */

 class MainDemo{

    public static void main(String [] args)
    {
        //IWorkable workable = new Worker();
        IWorker w = new Worker();
        InterfaceSegregationDemo isg = new InterfaceSegregationDemo();
        isg.setWorker(w);
        isg.getWorker();
        IRobot r = new Robot();
        isg.setRobot(r);
        isg.getRobot();
    }

}


public class InterfaceSegregationDemo {


   IWorker worker;
    IRobot robot;

    public void setRobot(IRobot r){
        robot = r;

    }
    public void getRobot(){
        robot.Charge();
        robot.Work();
    }

    public void setWorker(IWorker w) {
        worker=w;
    }

    public void getWorker() {
        worker.Work();
        worker.Feed();
    }


}

interface IWorkable{

    void Work();

}

interface IFeedable{

      void Feed();

}

interface IChargable{

    void Charge();

}

interface IWorker extends IWorkable , IFeedable{

    @Override
    void Work();

    @Override
    void Feed();
}

interface IRobot extends IWorkable , IChargable{

    @Override
    void Work();

    @Override
    void Charge();
}

class Worker implements IWorker{

    @Override
    public void Work() {
        System.out.println("Worker Work");
    }

    @Override
    public void Feed() {

        System.out.println("Worker Feed");
    }
}


class Robot implements IRobot{

    @Override
    public void Work() {
        System.out.println("Robot Work");

    }

    @Override
    public void Charge() {
        System.out.println("Robot Feed");
    }
}