package Lecture3;

public class Fruit implements Comparable
{
    private String fruitName;
    private int fruitWeight;

    public Fruit()
    {
        fruitName = "";
    }
    public Fruit(String name, int weight)
    {
            fruitName = name;
            fruitWeight = weight;
     }
    public Fruit(String name)
    {
        fruitName = name;
    }
    public void setName(String name, int weight)
    {
        fruitName = name;
        fruitWeight = weight;
    }
    public String getName()
    {
        return fruitName;
    }
    public int getWeight()
    {
        return fruitWeight;
    }
    public int compareTo(Object o)
    {
        if ((o != null) &&
            (o instanceof Fruit))
        {
            Fruit otherFruit = (Fruit) o;
           int fruitNameCompResult = 
           fruitName.compareTo(otherFruit.fruitName);
            if (fruitNameCompResult == 0)
            {
                return fruitWeight - otherFruit.fruitWeight;
            }
            else {
                    return fruitNameCompResult;
                }
            }
                return -1; //Default if other object is not a Fruit
            }
        }
    