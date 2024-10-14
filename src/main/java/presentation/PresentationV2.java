package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
       try{
           Scanner  scanner = new Scanner(new File("config.txt"));
           //DaoImpl d = new DaoImpl()
           String daoClassname = scanner.nextLine();
           /** Association dynamique with Class forName**/
           Class cDAO = Class.forName(daoClassname);
           /** Instanciate the class dynamicly**/
           IDao dao  = (IDao) cDAO.getConstructor().newInstance();
           //MetierImpl metier  = new MetierImpl(d)
           String metierClassname = scanner.nextLine();
           Class cMetier = Class.forName(metierClassname);
           IMetier metier  = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

           System.out.println("RES= "+metier.calcul());
       } catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
}
