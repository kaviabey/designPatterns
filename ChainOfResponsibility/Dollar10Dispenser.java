package ChainOfResponsibility;

public class Dollar10Dispenser  implements  DispenseChain{

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain)
    {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur)
    {
        if(cur.getAmount() >= 10)
        {
            int num   =  cur.getAmount()/10;
            int remainder  = cur.getAmount()%10;
            System.out.println("Dispensing" + num +" 1-$ note");
            if(remainder != 0)
                 this.chain.dispense(new Currency(remainder));

            else
                this.chain.dispense(cur);
        }
    }
}
