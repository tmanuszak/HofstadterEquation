# HofstadterEquation

The Hofstadter Q sequence is defined as follows
## Q(1) = Q(2) = 1, Q(n) = Q(n - Q(n - 1)) + Q(n - Q(n - 2)), n > 2
This program also allows for differents integers, including negative, as starting values.


The first few terms of the original sequence are

1, 1, 2, 3, 3, 4, 5, 5, 6, 6, 6, 8, 8, 8, 10, 9, 10, 11, 11, 12, ... (sequence A005185 in the OEIS)
https://oeis.org/A005185

Hofstadter named the terms of the sequence "Q numbers"; thus the Q number of 6 is 4. The presentation of the Q sequence in Hofstadter's book is actually the first known mention of a meta-Fibonacci sequence in literature.

While the terms of the Fibonacci sequence are determined by summing the two preceding terms, the two preceding terms of a Q number determine how far to go back in the Q sequence to find the two terms to be summed. The indices of the summation terms thus depend on the Q sequence itself.

Q(1), the first element of the sequence, is never one of the two terms being added to produce a later element; it is involved only within an index in the calculation of Q(3).

Although the terms of the Q sequence seem to flow chaotically, like many meta-Fibonacci sequences its terms can be grouped into blocks of successive generations. In case of the Q sequence, the k-th generation has 2k members. Furthermore, with g being the generation that a Q number belongs to, the two terms to be summed to calculate the Q number, called its parents, reside by far mostly in generation g − 1 and only a few in generation g − 2, but never in an even older generation.

Most of these findings are empirical observations, since virtually nothing has been proved rigorously about the Q sequence so far. It is specifically unknown if the sequence is well-defined for all n; that is, if the sequence "dies" at some point because its generation rule tries to refer to terms which would conceptually sit left of the first term Q(1).
