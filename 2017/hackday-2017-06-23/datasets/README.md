![graph-image](http://static.springer.com/spcom/sites/sgw/images/logo-springernature.svg)

![SpringerNature SciGraph](https://github.com/springernature/scigraph/wiki/images/SpringerNature.png)

# SciGraph Datasets

Welcome to the [Springer Nature SciGraph](http://www.springernature.com/scigraph) project. On this page you can find information about the SciGraph datasets we are making available for the SciGraph Hack Day.

## Table of Contents

* [Datasets](#datasets)
* [Ontology](#ontology)

## Datasets

The dataset contains around 1.1 billion triples (0.75 explicit). The following figure provides an overview of how the main types relate to each other, and how many instances they have. 

![scigraph-hack-day-2017-06-23](https://github.com/springernature/scigraph/wiki/images/scigraph-hack-day-2017-06-23.png)

## Ontology

You can inspect the ontology classes and properties via this [documentation page](http://ontologies.scigraph.com/#core).

The ontology source file is available [here](https://github.com/springernature/scigraph/blob/master/2017/hackday-2017-06-23/datasets/sg-core-ontology.ttl).  

## Elasticsearch

- 3 indexes available: articles + journals, book chapters + books, and grants
- ES model is a flattened version of the ontology model (e.g. journal info denormalized into article info) 
- Fields names generally the same: 'object_type.property'

## Disclaimer

- Preview version just for the hack day - please do not redistribute 
- Internal dataset, contains extra fields  
- Quality: it's a work in progress (feedback please!)

