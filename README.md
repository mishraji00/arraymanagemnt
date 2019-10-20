#Project to demo integer array manipulations. 

###Available endpoints. 

####_1. `/health`_ 
    Request type **GET** returns OK 200 if api is up and running.
####_2. `/mergeInt`_ 
    Request type **POST** accepts values as int[] and does operation.
####_3. `/mergeArray`_
    Request type **POST** accepts values as ArrayList and does operation.
####_4. `/mergeList`_
    Request type **POST** accepts values as List<Integer> and does operation.


_sample input for all post requests._ 

{"value1":[1,2,3,7],"value2":[2,4,5]}