package lab10;



/**
 * <p>This class is to represents a college student. with the name and the home address
 * and the score he has, this class is read by TestStudent program to present the name
 * of the student and the home address of the student it is also use to calculate the 
 * average score of this student.</p>
 * @author Lewis
 * @author Loftus
 * @author Zhong Cheng
 * @version 1.0
 */
public class Student {
    /**<p> 
     * First name of this student. </p>
     */
    private String firstName;

    /**
     * <p> Last name of this student.</p> 
     */
    private String lastName;

    /**
     * <p> First score of this student.</p>
     */
    private int scores1;
    /**
     * <p> Second score of this student.</p>
     */
    private int scores2;
    /**
     * <p> Third score of this student.</p>
     */
    private int scores3;

    /**
    *<p> Constructor: Sets up this student with the specified values.</p>
    * @param first The first name of the student
    * @param last The last name of the student
    * @param home The home address of the student
    * @param school The school address of the student
    */
    public Student(String first, String last) {
        firstName = first;
        lastName = last;
        scores1=0;
        scores2=0;
        scores3=0;
    }
    
    /**
     * <p>Constructor: Sets up this student with the specified values.</p>
     * @param first The first name of the student
     * @param last The last name of the student
     * @param home The home address of the student
     * @param school The school address of the student
     * @param s1 The test score for number 1
     * @param s2 The test score for number 2
     * @param s3 The test score for number 3
     */
    public Student(String first, String last,int s1, int s2, int s3) {
        firstName = first;
        lastName = last;
        scores1=s1;
        scores2=s2;
        scores3=s3;
    }
    
    /**
     *<p> Constructor: Sets up this student's scores to 0 <p>
     */
    public Student(){
    	
    	 firstName = "";
         lastName = "";
    	 scores1=0;
         scores2=0;
         scores3=0;
    }
    
    /**
     * <p>set the scores for a given test number</p>
     * @param number The number of test
     * @param score The score to the test
     */
    public void setTestScore(int number, int score){
    	
    	if(number==1){
    		scores1=score;
    	}else if(number==2){
    		scores2=score;
    	}else if(number==3){
    		scores3=score;
    	}
    }
    
    /**
     * 
     * @param number The number of test
     * @return score The score for test number
     */
    public int getTestScore(int number){
    	
    	if(number==1){
    		return scores1;
    	}else if(number==2){
    		return scores2;
    	}else if(number==3){
    		return scores3;
    	}else{
    		return -1;
    	}
    }
    
    /**
     * 
     * @return average The score of three test number
     */
    public float average(){
    	
    	return (float) ((scores1+scores2+scores3)/3.0);
    }

    /**
    * <p>Returns a string description of this Student object.</p>
    * @return result Formatted name and addresses of student
    */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result +="Test score 1:\n"+scores1+"\n";
        result +="Test score 2:\n"+scores2+"\n";
        result +="Test score 3:\n"+scores3+"\n";
        result +="Average:\n"+average();
        
        return result;
    }
}

