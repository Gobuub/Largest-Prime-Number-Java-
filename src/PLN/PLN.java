package PLN;

import java.util.Vector;

public class PLN {

    public double n;
    
    
    public PLN(double n){
        this.n = n;
    }
  
    public double isPrime(double num) 
	{
		double x = 2;
		if (num <=1) 
		{
			return 1;
		}
		else {
			while (x*x <= num) {
				if (num%x==0) {
					return 0;
				}
				x++;
			}		
		return 1;
		}
	}

    public void Pln(double n){
        
        Vector<Double> factor = new Vector<Double>();

        if (n < 0){
            System.out.println(n+ " es un número negativo, debes introducir un número positivo");

        }
        else{
            double i = 2;
            double num = n;

            while (i*i <= n){
                
                double prime = isPrime(i);

                if (prime == 1 && num%i==0){
                    num = num / i;
                    //System.out.println(i);
                    factor.add(i);
                    

                    if (num%i==0){
                        while(num%i == 0){
                            num = num / i;
                            //System.out.println(num);
                        }
                    }
                    else{
                        
                        num = Math.ceil(num*i);
                        //System.out.println(num);
                        //num = Math.round(num);
                        //System.out.println(num);

                        i++;
                    }
                }
                else {
                    i++;
                }

            }
        }
        
        /*for(int j=0; j<factor.size(); j++){

            double number = factor.get(j);
            System.out.println(number);

        }*/

        System.out.println("El factorial primo más alto de "+ n+ " es " + factor.lastElement());
    }
}
