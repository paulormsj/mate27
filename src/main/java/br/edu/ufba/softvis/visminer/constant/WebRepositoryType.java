package br.edu.ufba.softvis.visminer.constant;

/**
 * @version 0.9
 * Web repository types.
 */
public enum WebRepositoryType {

	GITHUB(1);
	
	private int id;
	
	private WebRepositoryType(int id){
		this.id = id;
	}
	
	/**
	 * @return Web repository type id.
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * @param id
	 * @return Web repository type with given id.
	 */
	public static WebRepositoryType parse(int id){
		
		for(WebRepositoryType repoServType : WebRepositoryType.values()){
			if(repoServType.getId() == id){
				return repoServType;
			}
		}

		throw new IllegalArgumentException("Does not exists WebRepositoryType with id "+id);
		
	}
	
}
