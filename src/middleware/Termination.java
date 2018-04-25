package middleware;

public class Termination {
    private Object result;

    public Termination(Object result) {
        this.result = result;
    }

    public Termination() {

    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
