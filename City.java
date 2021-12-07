package travelsalesman;

import java.util.ArrayList;
import java.util.List;

public class City {
	private Integer id, x_direction,y_direction;
	
	//private List<City> neigbours = new ArrayList<City>();
	
	private boolean Visited = false;

	public City(Integer id, Integer x_direction, Integer y_direction) {
		//super();
		this.id = id;
		this.x_direction = x_direction;
		this.y_direction = y_direction;
		//this.neigbours = neigbours;
		//Visited = visited;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getX_direction() {
		return x_direction;
	}

	public void setX_direction(Integer x_direction) {
		this.x_direction = x_direction;
	}

	public Integer getY_direction() {
		return y_direction;
	}

	public void setY_direction(Integer y_direction) {
		this.y_direction = y_direction;
	}

	/*public List<City> getNeigbours() {
		return neigbours;
	}

	public void setNeigbours(List<City> neigbours) {
		this.neigbours = neigbours;
	}*/

	public boolean isVisited() {
		return Visited;
	}

	public void setVisited(boolean visited) {
		Visited = visited;
	}
	
	public int calculateDistanceBtwCityToNeigbour(City c) {
		int distance =  (int)Math.sqrt((Math.pow(this.getX_direction() - c.getX_direction() , 2) + Math.pow(this.getY_direction() - c.getY_direction()  , 2)));
		return distance;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", x_direction=" + x_direction + ", y_direction=" + y_direction + ", Visited="
				+ Visited + "]";
	}
	
	
	
	
}
