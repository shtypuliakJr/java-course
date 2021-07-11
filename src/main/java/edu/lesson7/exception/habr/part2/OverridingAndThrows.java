package edu.lesson7.exception.habr.part2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingAndThrows {
    // предок пугает IOException и InterruptedException
    public void f() throws IOException, InterruptedException {
    }
}

class Child1 extends OverridingAndThrows {
    // а потомок пугает только потомком IOException
    @Override
    public void f() throws FileNotFoundException {
    }
}

class Child2 extends OverridingAndThrows {

    //overridden method does not throw 'java.lang.Exception'
//    @Override
//    public void f() throws Exception {}
}
