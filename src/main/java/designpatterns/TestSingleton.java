package designpatterns;

/**
 * Created by florakalisa on 10/17/16.
 */
public class TestSingleton {

    public static void main(String[] args) {


    }
}

class Restaurant{

    private static Restaurant _singleton;

    private Restaurant(){
    }

    public static Restaurant getSingleton(){
        if(_singleton==null){
            _singleton = new Restaurant();
        }
        return _singleton;
    }

}
