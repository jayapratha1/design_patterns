//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Lazy Initialization of Singleton Object
        SingletonLazyLoading s1 = SingletonLazyLoading.getInstance();
        //Return Eager Initialization Object
        SingletonEagerLoading s2 = SingletonEagerLoading.getInstance();

    }
}