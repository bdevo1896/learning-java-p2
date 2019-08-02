
public class Pokemon {
	
	private String name, type,move;
	private int str, def,hp;
	
	public Pokemon(String name, String type){
		this.name = name;
		this.type = type;
		hp = 50 + Magic.random(50);
		def = Magic.random(9)+1;
		str = 10 + Magic.random(10);
		move = "";
	}
	
	public String getName(){
		return name;
	}
	
	public String getType(){
		return type;
	}
	
	public int getStrength(){
		return str;
	}
	
	public int getDefense(){
		return def;
	}
	
	public int getHealth(){
		return hp;
	}
	
	public String getMoveUsed(){
		return move;
	}
	
	public void setMove(String moveUsed){
		move = moveUsed;
	}
	
	public void hurt(int hitpoints){
		hp -= hitpoints;
	}

}
