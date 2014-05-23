
public class SymbolTable {
    private LinkedList symbol_table;

    public SymbolTable() {
        this.symbol_table = new LinkedList();
    }

    public int getValue(String key) {
        return symbol_table.getValue(key);
    }

    public void insert(String key, int value) {
        if (!symbol_table.exist(key)) {
            symbol_table.add(key, value);
        }
        else {
            symbol_table.setValue(key, value);
        }
    }
}


