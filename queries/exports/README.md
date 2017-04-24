## Export Queries

The SPARQL queries presented here were used to generate our [public datasets](https://github.com/springernature/scigraph/wiki#downloads) using the SHACL [shapes files](https://github.com/springernature/scigraph/tree/master/shapes) as publishing 'views' on our internal triplestore.

Since SHACL shapes are expressed in RDF they can be loaded into a triplestore and queried as data export specifications.

The basic plan then is as follows. Build a ```CONSTRUCT``` query for each dataset where for each class we set up an inner ```SELECT``` query which queries the shapes graph for a corresponding ```sh:targetClass``` to get the allowed list of properties and then filter on class and property. 

### Example Export Query: 2012-articles.rq

In the example below we develop our query for the 2012 articles dataset (```springernature-scigraph-2012-articles.2017-02-15.nt```). Here we have ```sgg:shapes.exports``` as the shapes graph.

In this query we are querying for article instances (type ```sg:Article```) and allowed properties for data export.

```
construct {
    ?s ?p ?o
}
where {
        {
            select distinct ?p
            where {
                graph sgg:shapes.exports {
                    ?shape sh:targetClass sg:Article .
                    ?shape sh:property [ sh:predicate ?p ] .
                }
            }
        }
        ?s a sg:Article .
        ?s ?p ?o .
    }
```

In practice, we add a couple further restrictions: a publication date and a requirement that each article has a journal.

```
construct {
    ?s ?p ?o
}
where {
        bind ( "2012"^^xsd:gYear as ?year )
        {
            ...
        }
        ?s a sg:Article .
        ?s sg:publicationYear ?year .
        ?s sg:hasJournal [] .
        ?s ?p ?o .
    }
```

Lastly we need that secondary types (contributions, affiliations) are also included. We add these by making a ```UNION``` over separate queries for articles, contributions, affiliations as shown below. Note especially how the restrictions on primary objects are reinforced on secondary objects by using property paths (and in particular, reverse property paths). 

```
construct {
    ?s ?p ?o
}
where {
    {
        bind ( "2012"^^xsd:gYear as ?year )
        {
            select distinct ?p
            where {
                graph sgg:shapes.exports {
                    ?shape sh:targetClass sg:Article .
                    ?shape sh:property [ sh:predicate ?p ] .
                }
            }
        }
        ?s a sg:Article .
        ?s sg:publicationYear ?year .
        ?s sg:hasJournal [] .
        ?s ?p ?o .
    }
    union
    {
        bind ( "2012"^^xsd:gYear as ?year )
        {
            select distinct ?p
            where {
                graph sgg:shapes.exports {
                    ?shape sh:targetClass sg:Contribution .
                    ?shape sh:property [ sh:predicate ?p ] .
                }
            }
        }
        ?s a sg:Contribution .
        ?s ^sg:hasContribution/sg:publicationYear ?year .
        ?s ^sg:hasContribution/sg:hasJournal [] .
        ?s ?p ?o .
    }
    union
    {
        bind ( "2012"^^xsd:gYear as ?year )
        {
            select distinct ?p
            where {
                graph sgg:shapes.exports {
                    ?shape sh:targetClass sg:Affiliation .
                    ?shape sh:property [ sh:predicate ?p ] .
                }
            }
        }
        ?s a sg:Affiliation .
        ?s ^sg:hasAffiliation/^sg:hasContribution/sg:publicationYear ?year .
        ?s ^sg:hasAffiliation/^sg:hasContribution/sg:hasJournal [] .
        ?s ?p ?o .
    }
}
```


