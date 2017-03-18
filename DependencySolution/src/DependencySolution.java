/**
 * Created by glab on 10/22/16.
 */
public class DependencySolution {

    public static void main(String[] args){
        IWork w = new SuperWorker();
        Manager m = new Manager();
        m.setWork(w);
        m.get();

    }
}

class Manager{

    IWork worker;
    public void setWork(IWork w){
        worker=w;
    }
    public  void get(){
        worker.work();
    }

}


interface IWork{

    void work();
}

class Worker implements IWork{

    public void work(){

        System.out.println("Work");

    }
}

class SuperWorker implements IWork{

    public void work(){

        System.out.println("Work more");

    }

}

class LazyWorker implements IWork{

    public void work(){


        System.out.println("Work less");
    }

}