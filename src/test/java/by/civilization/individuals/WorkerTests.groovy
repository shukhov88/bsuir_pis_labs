package by.civilization.individuals

import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

class WorkerTests {

    @BeforeMethod
    void doSomething() {
        println 'something that should be executed before test method'
    }

    @Test
    void test() {
        println 'test something'
    }

    @AfterMethod
    void after() {
        println 'something that should be executed after test method'
    }

}
