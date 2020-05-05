# Lexical Analyzer Kotlin
The lexical analyzer, this component of a compiler can be used independently to treat files where it is necessary to execute an action based on the recognition of the symbols that interest us. In this document, the system described consists of the error handling tool. Error handling reads tokens and uses automata to validate the string. If an error is detected, this tool sends a message with information about the error.

##  INTRODUCTION

The following document is written as an academic work, also expecting to obtain an assertive competence; show a set and development of implementing a lexical analyzer, hoping that they will be very useful for those who read it.
The compiler derives its name from the way it works, analyzing the source code and collecting the instructions. The compilation process is a sequence of several phases. The purpose of this article is to understand the tasks performed by the lexical analyzer and how they are performed. This article describes how to build one of the phases of a compiler, the lexicon. for a programming language, in this case for PASCAL.
II. Theoretical Framework
For the lexical analyzer to achieve the objective of dividing the input into parts, it must be able to decide for each of these parts whether it is a separate component and, if applicable, what type. In a natural way, the concept of lexical category arises, which is a type of elementary symbol of the programming language. For example: identifiers, keywords, whole numbers, etc.

## A. Previously
A Lexicon Analyzer, also known as a Scanner, has the function of reading the source code and creating tokens from the symbol table, the tokens are groups of entities (identifiers, reserved words, separators, etc). The main function is to group them in lexemes the input characters of the source code and produce as output a token sequence for each lexeme in the source program. The obtained tokens will be sent to the parser. For this, it interacts with the symbol table. It is easy to recognize the pattern that describes the lexemes that coincide when they are read in the entry, but in certain languages, it is not so obvious when a lexeme corresponds to a token of an instance. For example:
Begin <is the reserved word to start a program in pascal> End. <Is the way how the reserved word end ends a sentence in pascal>
You can investigate certain ways to optimize the important task of reading the source program, but this task becomes difficult since you often look for one or more characters beyond the next lexeme to ensure that you have the correct lexeme, so that To be able to specify patterns of lexemes, regular expressions are used, since all the possible patterns can not be expressed, if we can specify the types of patterns that we really need for the tokens.
## B. Theorems on which the analyzer is based
Performing a lexical analyzer is a task that requires a certain kind of programming, that is, not every language can compile an interpreter, since the use of tokens requires the use of a memory or a buffer that will be stored in the computer, when understand this, you can treat the problem using memory banks as stacks or complete very long finite automata that do the task recursively, I followed by certain transition diagrams seen in class and then explain.
State transition diagrams are used flow diagrams that are converted from patterns, it has states that are node connections, each state represents a condition that could occur during the process of exploring the input, looking for a lexeme that matches one of various patterns.
The lines are directed from one state to another of the state transition diagram, each line is labeled by a symbol or set of symbols.
If we are in a certain state s, and the next entry symbol is a, we look for a line that leaves state s and is labeled by a (and perhaps by other symbols as
2 well). If we find that line, we advance the advance pointer and enter the state of the transition diagram of states to which that line takes us.
## C. Breakdown of the used automata
At the heart of the transition is the formalism known as finite automata. For each state q and each transition by words, obtaining an overview and symbol of entry to. representative of the operation. We start with the instructions of the program, starting with the sentence by the conditionals in this case the If:
Ilustración 1, automata condiconal if
Then we continue with the loops that are the for and the while
Ilustración 2, automata bucle for
Ilustración 3, automata bucle while
Ilustración 4, automata bucle repeat
A more general breakdown of how the program was developed showed an automaton which represents a whole process in the language joining each of the automata of the cycles.
Undoubtedly this last automaton served to take the base and carry out the elaboration of the Programming Code, elaborated in KOTLIN.
## D. Sequence of the steps for the development and solution of the problem
For the creation of the program on the pascal lexical analyzer, some points were presented to be analyzed with the structure of the automatons, since when performing them by seres depending on the function of each of the reserved words, making one in general was more difficult than expected
## E. Results and conclusions
The results obtained are unsatisfactory, although performing a lexical analyzer involves hard work, a use of complex tokens and more advanced programming, the project served as a perfect guide to learn the concepts or
Ilustración 5, automata pascal 3 basic principles of operation and understand how an automaton , it leads to a great algorithm in a code compiler.
This project leaves us a great knowledge because if a compiler was not really made as such, if we wanted to make one of the pillars for a compiler to work in the best way if it is the lexical analyzer.
Glossary—
1. Alphabet: Alphabet is a finite and non-empty set of symbols, letters or characters such as: the letters of the alphabet, the digits of the decimal system, the arithmetic operators, etc.
2. Automaton: An automaton is an information processing machine that receives a set of input signals, and produces in correspondence a set of output signals.
3. Status: is the summary of what happened (previous entries) until a certain time so the machine can remember "what has happened in the past." A machine can have a certain number of states corresponding to a certain number of different kinds of past stories. A machine with a finite number of states is called a machine or finite state automaton
4. Regular expressions: It is a notation that allows to define in a precise way a language about an alphabet. A regular expression is constructed from simpler regular expressions using a set of defining rules.
5. Grammar: A grammar is a formal entity to specify, in a finite way, a set of sentences, or chains of symbols, potentially infinite (and that constitutes a language). The strings or words of a language are generated by the grammar, starting with a string consisting of a particular symbol called the initial symbol and successively rewriting the string, according to a finite set of rules or productions.
6. Languages: From the linguistic point of view, a language is a finite or infinite set of sentences, each of them of finite lengths and constructed by concatenation from a finite number of elements. From the computer point of view, a language is a formal notation to describe algorithms or functions that will be executed by a computer. However, the first definition is valid for both points of view
