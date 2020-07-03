README - Jinxin Hu 963171

For Linux and MacOS users, firstly use command ”javac *.java” in the terminal under the extracted folder to generate class files, then input “java Main” with parameters to execute the program. Options of parameters are listed as following:
	G	-Use Global Edit Distance to analyze the misspelling words with dictionary. 
	N 2 -Use 2-Gram method to analyze the misspelling words with dictionary. 
	N 3	-Use 3-Gram method to analyze the misspelling words with dictionary. 
For Windows users, build a java project using an IDE like Eclipse and run with the above configuration parameters.

All these methods will take around 10 to 15 minutes to process the data(depending on the hardware environment).

Briefly, “java Main G” and “java Main N 3” are valid commands to run the program. After its completion, the summary will be provided in the terminal, including its precision, amount of predictions, run time and so on. Additionally, corresponding text files named ”Output_GED.txt”, or “Output_3Gram.txt” will be generated in the same folder for further analysis which includes all misspelling words and its predictions.
