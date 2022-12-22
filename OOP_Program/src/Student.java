
public class Student {
	//attribute
	public String name;
	public int score;
	
	public void setName(String Name) {
		name = Name;
	}
	public String getName(){
		return name;
	}
	public void setScore(int Score) {
		score = Score;
	}
	public int getScore() {
		return score;
	}
	public boolean checkscore() {
		return (score>=0&&score<=100)?true:false;
	}
	public boolean isPass() {
		return (score>=50)?true:false;
	}
}
