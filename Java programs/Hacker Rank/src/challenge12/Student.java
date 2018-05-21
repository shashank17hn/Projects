package challenge12;

class Student extends Person{
	private int[] testScores;
    
    String first;
    String last;
    int idno;
    int testScore[];
    int numScore ;
    
    Student(String fn, String ln ,int id, int[] test)
        {
      super(fn,ln,id);
      first = fn;
     last = ln;
     idno =id;
     testScore = test;
     
        
    }
    
    int total;
    float grade;
    String result;
    int counter =0;
    public String calculate()
        {
        for(int i=0;i< testScore.length; i++)
            {
       total = total + testScore[i];
            counter++;
        }
        grade = total/counter;
  
        if((grade > 89) && (grade < 101 ) )
            {
            result = "O";
        }
       else if((grade > 79) && (grade < 90) )
            {
            result = "E";
        }
        else if((grade > 69) && (grade < 80) )
            {
            result = "A";
        }
       else if((grade > 54) && (grade < 70 ))
            {
            result = "P";
        }
       else if((grade > 39) && (grade < 55 ))
            {
            result = "D";
        }
        else
            {
            result = "T";
        }
        return result;
        
        
    }
}