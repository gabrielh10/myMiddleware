package middleware;

import java.util.ArrayList;

public class RequestBody {
    private ArrayList<Object> params = new ArrayList<Object>();

    public RequestBody(ArrayList<Object> params){
        this.params = params;
    }

    public ArrayList<Object> getParams() {
        return params;
    }
}
