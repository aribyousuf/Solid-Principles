/**
 * Created by mM on 3/18/2017.
 */
public class Testing {

    public static void main(String [] args)
    {
        Arithmetic a = new Arithmetic();
        Calculator c = new Calculator();

        OutputUtility ou = new OutputUtility();

        ou.Print(a.Add(5,6));
        ou.Print(a.Sub(17,5));
        ou.Print(a.Mul(5,6));
        ou.Print(a.Div(15,3));
        ou.Print(c.Mod(6,2));



    }
}
