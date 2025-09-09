package creationalDesignPattern.builder;

public class CandidateInEligibleException extends RuntimeException{
     String m;
     CandidateInEligibleException(String m){
    	 super(m);
     }
}
