# ElectionData
A java app that was used to analyze the data gathered in the MHS Mock Election. 

It works by having a list of categories that mark a demographic and a list of categories that allow you
to determine what that demographic voted. For example, you could select Male, Republican as the demographic
and Hillary Clinton as the vote, and the app would split out what percent of Male Republicans voted for Clinton.
It works by first splitting all the data (in a CSV) into a easy-to-use object format (Election Result).
It then scans through all the Election Results for resutls that match the conditions selected and spits out
a percentage. It uses my JavaUpdater library and stores the CSV on the Thaumavor sever. 
