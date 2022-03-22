
public class GenericClass<K,T,E,V>{
	private K fieldK;
	private T  fieldT;
	private E fieldE;
	private V fieldV;
	
	//arguments contructor
	public GenericClass(K fieldK, T fieldT, E fieldE, V fieldV){
		this.fieldK = fieldK;
		this.fieldT = fieldT;
		this.fieldE = fieldE;
		this.fieldV = fieldV;
	}
	
	public void shownNameClass() {
		System.out.println(fieldK.getClass().getName() +" \n" + 
							fieldT.getClass().getName()+" \n" +
							fieldE.getClass().getName()+" \n" +
							fieldV.getClass().getName());
	}
}
