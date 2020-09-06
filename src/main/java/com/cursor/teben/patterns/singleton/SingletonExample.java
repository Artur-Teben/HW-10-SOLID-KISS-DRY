package com.cursor.teben.patterns.singleton;

public final class SingletonExample {
    private static SingletonExample singletonExample;
    private static String message = "I am the only and unique object";

    public static synchronized SingletonExample getInstance() {
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }

    private SingletonExample() {}

    public static void expandMessage(String msg) {
        message += msg + "\n";
    }

    public void showMessage() {
        System.out.println(message);
    }
}
