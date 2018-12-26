# Activity-REST framework

A framework to support execution of command line tools and other jobs
automatically based on a Analysis Activity Description Model.

## Supporting new Job / Functional Entity Types 

For each new FunctionalEntity in the AADM metamodel, some classes must be created and correctly registered in the Activity-REST framework:

1. Implement Job ou extend Abstract Job to execute the new job based on some configuration.;
2. Implement a new JobBuilder to create job of the new kind based in the AnallysisActivity model and the FunctionalEntity. Don't forget to verify if the FunctionalEntity received by the method is of a class supported by your builder;
3. Add the new builder in the JobFactoryImpl's map.

TODO: Better registration handling.