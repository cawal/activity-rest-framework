# Tool Definition Metamodel

The Tool Definition Metamodel (TDM) intend to provide support for the automatic ordering of arguments for a exec/CLI call.
In this sense, the developer shall provide a TDM model containing descriptions of intended parameters and input/output files that will be used to execute some operation and the order of these arguments. Given this model, as well as mappings from the parameters/files descriptions to their real values, a builder engine can shall the sequence of strings used to call the operation. 
The creation of this string sequence can follow a linear approach from first to last argument description. 

## NOT INTENDED USES

The Tool Definition Metamodel DOES NOT intend to provide support for the creation of maps FROM the elements of an ordered (final) argument list that is used for a given exec/CLI call TO the descriptions of the parameters of files/directories present in the model.
Thus, the *interpretation* of a exec/CLI call *is not* intended.