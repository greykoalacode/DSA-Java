import java.util.ArrayList;
import java.util.List;

public class MyHashMap
{
    private List<String> keys;
    private List<Integer> values;

    public MyHashMap()
    {
        // Implement the Constructor(s).
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void insert(String key, int value)
    {
        // Implement the insert(k, v) function.
        int existingKeyIndex = keys.indexOf(key);
        if(existingKeyIndex != -1){
            values.remove(values.get(existingKeyIndex));
            values.add(value);
        } else {

            this.keys.add(key);
            this.values.add(value);
        }
    }

    public int get(String key)
    {

        // Implement the get(k) function.
        for(int i = 0; i < keys.size(); i++){
            if(key.equals(keys.get(i))){
                return values.get(i);
            }
        }
        return -1;
    }

    public void remove(String key)
    {
        // Implement the remove(k) function.
        int existingKeyIndex = keys.indexOf(key);
        if(existingKeyIndex != -1){
            values.remove(values.get(existingKeyIndex));
            keys.remove(key);

        }
    }

    public boolean search(String key)
    {
        // Implement the search(k) function. 

        return keys.contains(key);
    }

    public int getSize()
    {
        // Implement the getSize() function.
        return keys.size();
    }

    public boolean isEmpty()
    {
        // Implement the isEmpty() function.
        return keys.size() == 0 && values.size() == 0;
    }

}