package ca.matwrz.talksignal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class HelloWorldTest {

    @Test
    void testGetHelloWorld() {
        assertThat(HelloWorld.getHelloWorld()).isEqualTo("Hello World");
    }
}