## Organization

Mappings files are named as *source* namespace to *target* namespace, using standard namespace prefixes:
```
    source--target.ttl
```

So, for SciGraph (```sg:```) to FOAF (```foaf:```) mappings, we have a mappings file as follows: 
```
    sg--foaf.ttl
```

Note that we use a double dash separator (```--```) as either source or target namespaces may include dashes.  

The main organization for mappings files is by *target* namespace. So e.g. under ```production``` we would have mappings to ```fabio``` and ```foaf``` namespaces as:

* [production/](https://github.com/springernature/knowledge-graph/blob/master/models/mappings/production/) 
  * ...
  * [fabio/](https://github.com/springernature/knowledge-graph/blob/master/models/mappings/production/fabio/) 
    * [sg--fabio.ttl](https://github.com/springernature/knowledge-graph/blob/master/models/mappings/production/fabio/sg--fabio.ttl) 
  * [foaf/](https://github.com/springernature/knowledge-graph/blob/master/models/mappings/production/foaf/) 
    * [sg--foaf.ttl](https://github.com/springernature/knowledge-graph/blob/master/models/mappings/production/foaf/sg--foaf.ttl) 
  * ...

## Structure

The mappings files are structured as simple Turtle files with a standard layout.

```
## Source namespace
@prefix ...

## Relation namespace
@prefix ...

## Target namespace
@prefix ...

## Mappings
{source} {relation} {target} .
...
```

## Example – Ontologies

For ontologies we use the well-known prefix, e.g. for SciGraph  we use ```sg:```.

```
## Source namespace
@prefix sg: <http://www.springernature.com/scigraph/ontologies/core/> .

## Relation namespace
@prefix owl: <http://www.w3.org/2002/07/owl#> .

## Target namespace
@prefix bibo: <http://purl.org/ontology/bibo/> .

##  Mappings - classes
sg:Article owl:equivalentClass bibo:Article .
sg:Event owl:equivalentClass bibo:Event .
...

##  Mappings - properties
sg:doi owl:equivalentProperty bibo:doi .
sg:issn owl:equivalentProperty bibo:issn .
...
```

## Example – Taxonomies

For taxonomies we use our local prefixes, e.g. for SciGraph subjects we use ```subjects:```.

```
## Source namespace
@prefix subjects: <http://www.springernature.com/scigraph/things/subjects/> .

## Relation namespace
@prefix skos: <http://www.w3.org/2004/02/skos/core#> .

## Target namespace
@prefix dbpedia: <http://dbpedia.org/resource/> .

##  Mappings - instances
subjects:3d-reconstruction skos:closeMatch dbpedia:3D_reconstruction .
subjects:abiotic skos:closeMatch dbpedia:Abiotic .
...
```

