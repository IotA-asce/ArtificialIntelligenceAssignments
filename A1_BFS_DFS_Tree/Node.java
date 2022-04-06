public class Node
{
    
    // ... VALUE TO BE STORED IN THE NODE
    private int value;          
    // ... BRANCHES, SINCE NO OF BRANCHES ARE NON-SPECIFIC 
    // ... ... DYNAMICALLY ALLOCATED ARRAY IS IMPLEMENTED
    private Node[] leaves;      

    // ... RETURNS VALUE STORED IN THE NODE                             
    public int getValue()
    {
        return this.value;
    }

    // SET THE VALUE IN THE NODE 
    public int setValue(int value)
    {
        this.value = value;
    }

    public boolean setNoOfBranches(int BRN_NUM)
    {
        this.leaves = new Node[BRN_NUM];
    }

    public boolean setValueInLeaves(int[] values)
    {
        boolean state = true;
        try{

            for (int i = 0; i < this.leaves.length; i++)
            {
                leaves[i] = new Node();
                leaves[i].setValue(values[i]);
            }       
        } catch (error){
            System.out.println("ERROR");
        }

    }
}