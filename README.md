# maxWord
MAx Word


The LongestWordUtil has 2 functions for computing the longest word in a sentence
Assumption: Some punctuation marks such as . , ! have been excluded. There are more characters to exclude but this is an MVP.

1) longestWord1 utilizes the java stream api to iterate through the split words (by space) and then flatten the split by excluding
   some irrelevant punctuation marks (E.g. . , !) and then reduce the map to only the string with the max element.



2) longestWord2 has a more classic approach of implementing the algorithm of looping through the string without utilizing
   the java stream API.