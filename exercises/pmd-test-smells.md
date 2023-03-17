# Detecting test smells with PMD

In folder [`pmd-documentation`](../pmd-documentation) you will find the documentation of a selection of PMD rules designed to catch test smells.
Identify which of the test smells discussed in classes are implemented by these rules.

Use one of the rules to detect a test smell in one of the following projects:

- [Apache Commons Collections](https://github.com/apache/commons-collections)
- [Apache Commons CLI](https://github.com/apache/commons-cli)
- [Apache Commons Math](https://github.com/apache/commons-math)
- [Apache Commons Lang](https://github.com/apache/commons-lang)

Discuss the test smell you found with the help of PMD and propose here an improvement.
Include the improved test code in this file.

## Answer

With the rule JunitTestContainsTooManyAsserts their is a bad smell detected here : /Apache_maths/commons-math/commons-math-legacy-core/src/test/java/org/apache/commons/math4/legacy/core/jdkmath/AccurateMathTest.java:1252:.
  
The test should have been divided into many tests to have better readability in case of errors.