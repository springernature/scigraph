# GraphDB

The queries below can be executed in your GraphDB Workbench: `<your-vm-ip-address>:7200/sparql`.

## Article, Contribution and Affiliation Objects

[Maybe make this a table with links to queries and results]

* **Article Object:** To look up the article with DOI `10.1038/nature13195` about "Palaeozoic osteichthyan", see [get-article-by-doi.rq](get-article-by-doi.rq), and see [result-for-get-article-by-doi.ttl](result-for-get-article-by-doi.ttl) for the result in Turtle format.

* **Article with contributions and affiliations Objects:** To also retrieve information about the associated contribution and affiliation objects (see [get-article-by-doi-with-contributions-affiliations.rq](get-article-by-doi-with-contributions-affiliations.rq)), 
 and see [result-for-get-article-by-doi-with-contributions-affiliations.ttl](result-for-get-article-by-doi-with-contributions-affiliations.ttl) for the result in Turtle format.

* **Journal and JournalBrands Objects:** To also retrieve information about the associated journal and journal brand objects (see [get-journalbrand-by-title-with-journal.rq](get-journalbrand-by-title-with-journal.rq)), 
 and see [result-for-get-journalbrand-by-title-with-journal.ttl](result-for-get-journalbrand-by-title-with-journal.ttl) for the result in Turtle format.




## Journal and JournalBrand Objects

```
PREFIX sg: <http://www.springernature.com/scigraph/ontologies/core/>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX sgg: <http://www.springernature.com/scigraph/graphs/>
PREFIX : <http://www.ontotext.com/connectors/elasticsearch#>
describe  ?j ?jb
where {   
        ?s a sg:Article .
        ?s sg:doi "10.1038/nature13195" .
		?s sg:hasJournal ?j .
    	?s sg:hasJournalBrand ?jb
}
```
