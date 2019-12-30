
public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        this.cashInRegister = 1000; 
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven>=2.5) {
        	this.cashInRegister+=2.5; 
        	economicalSold++; 
        	return cashGiven - 2.5; 
        }
        else {
        	return cashGiven; 
        }
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven>=4.0) {
        	cashInRegister+=4.0;
        	gourmetSold++; 
        	return cashGiven - 4.0; 
        }
        else {
        	return cashGiven; 
        }
    }
    
    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= 2.5) {
        	economicalSold++; 
        	card.pay(2.5);
        	return true;
        }
        else {
        	return false; 
        }
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= 4.0) {
        	gourmetSold++;
        	card.pay(4.0);
        	return true;
        }
        else {
        	return false; 
     }
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
    	if (sum > 0.0) {
    		card.loadMoney(sum); 
    		this.cashInRegister += sum; 
    		
    	}
    }
    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
    
    
    

    // ...
}

  