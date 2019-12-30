public class Reformatory {

	private int weightMeasuredCount = 0; 

	public int weight(Person person) {
       // returns the weight of the parameter
		this.weightMeasuredCount++; 
        return person.getWeight(); 
    }
    
    public void feed(Person person) { 
    	person.setWeight(person.getWeight()+1); 
    }
    
    public int totalWeightsMeasured() { 
    	return this.weightMeasuredCount; 
    }

    public static void main(String[] args) {
        Reformatory eastHelsinkiReformatory = new Reformatory();

        Person brian = new Person("Brian", 1, 110, 7);
        Person pekka = new Person("Pekka", 33, 176, 85);

        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(pekka);

        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);

        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());
    }
}
      