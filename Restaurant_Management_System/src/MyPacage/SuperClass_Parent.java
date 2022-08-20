
package MyPacage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class SuperClass_Parent {
    public double Fish;
    public double ChickenBurger;
    public double ChickenFry;
    public double ChickenCurry;
    public double ExpensiveLambMeat;
    
    public double MilkShake;
    public double Cocacola;
    public double MountainDew;
    public double PepsiDrink;
    public double ChocMilkshake;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    public double GetAmount(){
        Meals=Fish+ChickenBurger+ChickenFry+ChickenCurry+ExpensiveLambMeat;
        Drinks=MilkShake+Cocacola+PepsiDrink+MountainDew+ChocMilkshake;
        TotalofMD=Meals+Drinks;
        AllTotalofMD=TotalofMD;
        return AllTotalofMD;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Restaurant Management System",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    //====================================================
    
    public double pFish=3.56;
    public double pChickenBurger=2.95;
    public double pChickenFry=3.98;
    public double pChickenCurry=2.65;
    public double pExpensiveLambMeat=3.64;
    
    public double pMilkShake=2.10;
    public double pCocacola=2.20;
    public double pPepsiDrink=2.50;
    public double pMountainDew=1.95;
    public double pChocMilkshake=2.37;
    
    //===========================================================
    
    public double mcTax=0.90;
    
    public Double cFindTax(double cAmount){
        double FindTax=cAmount-(cAmount*mcTax);
        return FindTax;
    }
    
    //============================================================
}
