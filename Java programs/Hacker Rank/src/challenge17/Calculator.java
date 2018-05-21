package challenge17;

class Calculator 
    
    {
    
    public int power(int n, int p) throws Exception
        {
        if((n>=0)&&(p>=0))
            
       { 
            int result =1;
            for (int i=1;i<=p;i++)
            {
            result = result * n;
        }
        return result;
       }
        else
            {
            throw new Exception("n and p should be non-negative");
        }
        
    }
}