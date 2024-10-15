Implement a solution to the grid problem using A* search in Java. A starter code is provided for
you to help you start the project. Your Java code will primarily be marked on its correctness with
respect to the two grid problems. We will also check the implementation of the heuristic in your
solution.
Programming language: Java
The starter code can be found in the package uk.ac.hw.macs.search, which is a set of classes that
can be used to represent a search problem. To implement a specific search problem, you will need
to do the following:
1. Define a class that implements the State interface. This should include the following:
(a) A method for determining whether a state is a goal state (isGoal())
(b) A method for computing the heuristic value of a state (getHeuristic())
2. Define a class that implements the SearchOrder interface. This interface has one public
method, addToFringe, that is used to add a set of nodes to the frontier. You can use the
costs and/or heuristic values to determine the order that nodes are added to the frontier
2
The classes in the uk.ac.hw.macs.search.example package show examples of these two interfaces being used to implement depth-first search and breadth-first search, as well as a simple
integer-based state. The Main class in this package shows an example of how to use the classes.
To solve the problem, you will need to implement the following:
1. An encoding of the state in the grid by implementing the State interface appropriately,
including methods for detecting a goal state and computing a heuristic value. You should use
the Manhattan distance heuristic for generating heuristic values in your search.
2. A class implementing A* search by implementing the SearchOrder interface and implementing
addToFringe appropriately.
Test your code on the two grid problems provided by running A* search on them
and capture the output. Submit the code used for the implementation of the problem. Make
sure your code includes appropriate comments in the parts of the code you implemented. Do not
change any of the classes in the uk.ac.hw.macs.search package: we will test your implementation
against the provided versions of these classes.
