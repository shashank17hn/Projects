
public class TreeNode {

	private int weight;
	public TreeNode left;
	public TreeNode right;
	
	TreeNode(int weight)
	{
		this.weight = weight;
		left = null;
		right = null;
	}
	
	public int getWeight()
	{
		return weight;
	}
}
