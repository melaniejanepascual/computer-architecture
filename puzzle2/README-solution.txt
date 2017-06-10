Puzzle #2: Dates and Timezones

Twitter has users around the world.  We need to be able to represent time in
our databases so that when we display the time of a tweet, no matter where you
are on the planet you see the time in the right timezone.  The safest way we do
this is to store time in milliseconds from the epoch.  When we retrieve the time,
we convert it to the proper display timezone.

In this exercise you can use JavaDoc to research which Java libraries to use
to solve the coding problem.
https://docs.oracle.com/javase/7/docs/api/

Fill in the missing pieces of Java code.  The answers will be the solution to
the puzzle.

SOLUTION:

There is a Java-solution file for the code.

The output should look like this:

bash-3.2$ javac Puzzle2.java 
bash-3.2$ java Puzzle2
2013/11/07 16:00:00
2013/11/07 16:00:00
2013/11/07 16:00:00
2013/11/07 16:00:00
2013/11/07 16:00:00
2013/11/07 16:00:00
2013/11/07 16:00:00

So the solution is: 4pm Nov. 7, 2013
