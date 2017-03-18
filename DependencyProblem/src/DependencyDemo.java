import com.sun.swing.internal.plaf.synth.resources.synth_sv;

/**
 * Created by glab on 10/22/16.
 */
public class DependencyDemo {
}


class Manager{
Worker w;

    void Manage()
    {
        w.work();

    }

}

class Worker extends Manager{

    public void work(){

        System.out.println("Work");

    }
}

class SuperWorker extends Manager{

    public void work(){

        System.out.println("Work more");

    }

}

class LazyWorker extends Manager{

    public void work(){


        System.out.println("Work less");
    }

}