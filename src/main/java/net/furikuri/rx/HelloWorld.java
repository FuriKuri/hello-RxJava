package net.furikuri.rx;

import rx.Observable;
import rx.functions.Action1;

public class HelloWorld {
    public static void main(String[] args) {
        hello("Ben", "George");
    }

    public static void hello(String... names) {
        Observable.from(names).subscribe(new Action1<String>() {

            @Override
            public void call(String s) {
                System.out.println("Hello " + s + "!");
            }

        });
    }
}
