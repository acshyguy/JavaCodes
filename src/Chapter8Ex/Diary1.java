package Chapter8Ex;

import java.util.ArrayList;
import java.util.Date;

public class Diary1 {
    private String name;
    private Date dateCreated = new Date();
    private ArrayList<Entry1> input = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ArrayList<Entry1> getInput() {
        return input;
    }

    public void setInput(ArrayList<Entry1> input) {
        this.input = input;
    }

    public void addEntry(Entry1 input2) {
        input.add(input2);
    }
    public Entry1 getEntry(int index) {
        return input.get(index);
    }



    public void getAllEntry(int index) {
        for (int i = 0; i < input.size(); i++) {
            System.out.print(getEntry(i));

        }
    }

}
