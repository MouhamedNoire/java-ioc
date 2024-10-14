package metier;

import dao.DaoImpl;
import dao.IDao;

/** we create an implemantation of the interface IMetier**/
public class MetierImpl implements IMetier{
    private IDao dao ;

    /**
     *
     * Now here we create a construcor with argument better than the setter
     */
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    /**in polymorphism we can affect to a class mother the class daughter thats implement her **/
    @Override
    public double calcul (){
        double t  = dao.getData();
        double res  = t * 23;
        return res;
    }

    /**
     * its for injecting in the variable dao an object
     * of a class thats implement the interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
