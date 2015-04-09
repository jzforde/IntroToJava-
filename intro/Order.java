package intro;
import java.io.Serializable;

public class Order implements Serializable
{
	private static final long serialVersionUID = 1L; 
	private int id; 
	private String name;
	
	public Order(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Order [id=" + id + ", name=" + name + "]";
	} 
}

