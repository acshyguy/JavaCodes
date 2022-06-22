package tdd;

public class Position {
    private int row;

    private  int colunm;

    public Position(int row, int column) {
        this.row = row;
        this.colunm = column;
    }

    public int getRow() {
        return row;
    }
    public int getColunm() {
        return colunm;
    }
    public boolean equals(Object input) {
        Position compared = (Position) input;
        if (row == compared.getRow() && colunm == compared.getColunm())
            return true;

        return false;
    }

    @Override
    public String toString(){
        return "Position{"+
                "row="+row+
                ", column="+colunm+
                "}";
    }


}


