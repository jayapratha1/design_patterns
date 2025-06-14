public final class SingletonEagerLoading {
    //Instance created at class Loading time
    private static final SingletonEagerLoading instance = new SingletonEagerLoading();

    //Constructor made private to avoid object creation
    private SingletonEagerLoading() {}

    //Return the Singleton Object
    public static SingletonEagerLoading getInstance() {
        return instance;
    }
}
