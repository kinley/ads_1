/**
 * Created by Almaz on 01.05.2014.
 */
public class Bool {
    private boolean array_value[];
    private boolean []array_default = {false, false, false, false};

    public Bool(){
        this.array_value = array_default;
    }

    public Bool(boolean[] array_value){
        this.array_value = array_value;
    }

    public boolean[] getArray_value() {
        return array_value;
    }

    public void setArray_value(boolean[] array_value) {
        this.array_value = array_value;
    }

    public Bool BooleanAnd(Bool Func){
        boolean array[] = Func.getArray_value();
        for (int i = 0; i <= 3; i++)
            array[i] = (this.array_value[i] && array[i]);
        this.setArray_value(array);
        Bool FuncReturn = new Bool(this.getArray_value());
        return FuncReturn;
    }

    public Bool BooleanOr(Bool Func){
        boolean array[] = Func.getArray_value();
        for (int i = 0; i <= 3; i++)
            array[i] = (this.array_value[i] || array[i]);
        this.setArray_value(array);
        Bool FuncReturn = new Bool(this.getArray_value());
        return FuncReturn;
    }

    public Bool BooleanNot(){
        boolean array[] = getArray_value();
        for (int i = 0; i <= 3; i++)
            array[i] = (!this.array_value[i]);
        this.setArray_value(array);
        Bool FuncReturn = new Bool(this.getArray_value());
        return FuncReturn;
    }
}
