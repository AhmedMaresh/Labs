public class CounterHM1 {
    private int value;

    /**
     * Default Constructor initialize counter value by zero
     */
    public CounterHM1( ){value=0;}
    /**
     * increase counter value by one
     */
    public void click(){value=value+1;}
    /**
     * Display current counter value
     * @return current counter value
     */
    public int getValue(){return value;}

    /**
     * Reset The Value to Zero Again
     */
    public void reset(){value=0;}

    /**
     * Undo an Accidental Button Click
     */
    public void undo(){
        value=value-1;}
    }

