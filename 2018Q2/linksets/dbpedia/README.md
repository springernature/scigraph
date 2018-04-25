#  Guideline to Produce Data with DBpedia Spotlight

This folder contains the produced named entity links for the 2017 article abstracts and for 2017 book chapter abstracts.

DBpedia Spotlight is a tool for automatically annotating text documents with DBpedia URIs.

[This repository](https://github.com/beyzayaman/quad-processor-util.git) is used to produce the data exploiting DBpedia Spotlight framework to discover the named entities.

The folder contains links where confidence values are 0,55 and support value is 20.

Number of distinct links overall: 89.138
Total no of distinct links per abstract: 1.646.342
No of total found links: 2.841.682

### Quick Start

Easiest way to get started exploring these data is to expand the compressed TTL files in the [dbpedia-backlinks folder](https://github.com/springernature/scigraph/tree/master/2018Q2/linksets/dbpedia/links/055-confidence/dbpedia-backlinks).

Each of these files contain simple mappings between SciGraph documents (articles, chapters) and DBPedia entities. The mappings are encoded in RDF using the `schema:mentions` predicate.

For example:

```
<http://scigraph.springernature.com/things/articles/000025e3062fde501f24ad1d106a3b6e#offset_585_597> <http://schema.org/mentions> <http://dbpedia.org/resource/Limit_point> <http://scigraph.springernature.com/things/articles/000025e3062fde501f24ad1d106a3b6e#nlptool=spotlight&confidence=1.0> .
<http://scigraph.springernature.com/things/articles/000025e3062fde501f24ad1d106a3b6e#offset_45_60> <http://schema.org/mentions> <http://dbpedia.org/resource/Inverse_problem> <http://scigraph.springernature.com/things/articles/000025e3062fde501f24ad1d106a3b6e#nlptool=spotlight&confidence=1.0> .
<http://scigraph.springernature.com/things/articles/000025e3062fde501f24ad1d106a3b6e#offset_77_94> <http://schema.org/mentions> <http://dbpedia.org/resource/Signal_processing> <http://scigraph.springernature.com/things/articles/000025e3062fde501f24ad1d106a3b6e#nlptool=spotlight&confidence=0.9999991378390711> .
```


### Credits 

This work has been carried out by Beyza Yaman in collaboration with the DBPedia and SciGraph teams, thanks to a research grant from Springer Nature. 

A technical article providing more info about this research will be made available soon. 


