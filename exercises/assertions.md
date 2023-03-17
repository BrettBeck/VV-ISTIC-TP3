# On assertions

Answer the following questions:

1. The following assertion fails `assertTrue(3 * .4 == 1.2)`. Explain why and describe how this type of check should be done.

2. What is the difference between `assertEquals` and `assertSame`? Show scenarios where they produce the same result and scenarios where they do not produce the same result.

3. In classes we saw that `fail` is useful to mark code that should not be executed because an exception was expected before. Find other uses for `fail`. Explain the use case and add an example.

4. In JUnit 4, an exception was expected using the `@Test` annotation, while in JUnit 5 there is a special assertion method `assertThrows`. In your opinion, what are the advantages of this new way of checking expected exceptions?

## Answer

1. It fails because strict comparison between floats are not possible because of the approximations. With Junit you can provide a delta to compensate, or using the comparators < or > can work depending of the situation
2. Equals is used to compare objects content while Same compare objects reference

```java
    String a = new String("hello");
    String b = new String("hello");
    assertEquals(a,b) // returns true
    assertSame(a,b) // Returns false
```
3.
4. the assertThrows assertion can be used to gain more control on tests scenarios. it also improves readability of the test cases.