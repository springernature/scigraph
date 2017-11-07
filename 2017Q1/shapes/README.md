## Shapes

We use the [Shapes Constraint Language (SHACL)](https://www.w3.org/TR/shacl/) for publishing our RDF datasets. These shapes make use of a fairly simplistic interpretation of the SHACL spec.

Basically we maintain one shapes graph per export dataset. We define closed shapes for target classes only, with each shape being namespaced under our domain.

```
@prefix shapes: <http://www.springernature.com/scigraph/shapes/> .

shapes:Article
    a sh:Shape ;
    sh:targetClass sg:Article ;
    rdfs:label "RDF shape for the sg:Article model" ;
    sh:closed true ;
    ...
```

These shapes are used primarily for data extraction rather than validation, where SPARQL queries range over the SHACL shapes to build RDF datasets via a ```CONSTRUCT``` query type. See the [queries/](https://github.com/springernature/scigraph/tree/master/shapes/queries) folder for actual queries used. See also the wiki section [Classes and Properties](https://github.com/springernature/scigraph/wiki#classes-and-properties) for model descriptions.

(Note that we use a corresponding – but wider – set of shapes for data validation and restriction on our ETL import workflows.)

Some points of note:

* These shapes conform to an earlier version of the SHACL spec, ca. September 2016, when we forked the [TopBraid SHACL API](https://github.com/TopQuadrant/shacl) project. In particular, we make use use of the ```sh:Shape``` class, rather than ```sh:NodeShape```, and the ```sh:predicate``` property, rather than ```sh:path```.
* We have not yet defined any modularization techniques so some shapes are repeated more or less verbatim across different shapes graphs (see e.g. ```shapes:Contribution``` in [articles.ttl](https://github.com/springernature/scigraph/tree/master/shapes/articles.ttl) and [grants.ttl](https://github.com/springernature/scigraph/tree/master/shapes/grants.ttl))
* We also use shape definitions for our OWL ontology (see [ontologies.ttl](https://github.com/springernature/scigraph/tree/master/shapes/ontologies.ttl)) and SKOS concept schemes (see [subjects.ttl](https://github.com/springernature/scigraph/tree/master/shapes/subjects.ttl)) .
