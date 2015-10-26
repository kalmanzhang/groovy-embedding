This is an example exploring ways to integrate groovy with java code, with a view to enable quick protoyping
by using groovy features and reloading of changes on the fly.
The idea is to run the app and to prototype in groovy with the app running with the option to turn the running code
to java at the end.

To run type 
gradle bootRun

To type enter:
 curl http://localhost:8080/greeting

You with get the Hello world greeting:
 
   Hello, world! 

From the "hello.featurex.Dependency.message", now if you edit the message and change it to 
   Hello, world2!
And do    
   curl http://localhost:8080/greeting
   
You will get back:
   Hello, world2!

No restart required!

 
Editing and changing the groovy ReloadTest will return a diferent response evrey time  