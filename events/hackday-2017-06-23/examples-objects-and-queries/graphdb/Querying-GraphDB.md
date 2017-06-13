# [\#SN-Scigraph](https://twitter.com/hashtag/sn-scigraph) Hackday 2017-06-23

## Article with Contributions and Affiliations
Searching the article on "Palaeozoic osteichthyan" with DOI "10.1038/nature13195"

Execute the query on GraphDb Workbench http://<aws public dns>:7200/sparql

Query q1.rq
```
PREFIX sg: <http://www.springernature.com/scigraph/ontologies/core/>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX sgg: <http://www.springernature.com/scigraph/graphs/>
describe ?s
where {   
        ?s a sg:Article .
        ?s sg:doi "10.1038/nature13195"
    
}
```

RDF Object / Trig

```
@prefix sg: <http://www.springernature.com/scigraph/ontologies/core/> .
@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .
@prefix sgg: <http://www.springernature.com/scigraph/graphs/> .
@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
@prefix sesame: <http://www.openrdf.org/schema/sesame#> .
@prefix owl: <http://www.w3.org/2002/07/owl#> .
@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .
@prefix fn: <http://www.w3.org/2005/xpath-functions#> .

{
	<http://www.springernature.com/scigraph/things/articles/787e60fcaf79211c91c6fb0b47c1d30b> a sg:Article ;
		sg:hasFieldOfResearchCode <http://purl.org/au-research/vocabulary/anzsrc-for/2008/0602> ;
		sg:hasJournalBrand <http://www.springernature.com/scigraph/things/journal-brands/012496b06989edb434c6b8e1d0b0a7db> ;
		sg:scigraphId "787e60fcaf79211c91c6fb0b47c1d30b" ;
		sg:doi "10.1038/nature13195" ;
		sg:doiLink <http://dx.doi.org/10.1038/nature13195> ;
		sg:pageStart "608" ;
		sg:pageEnd "611" ;
		sg:title "A Palaeozoic shark with osteichthyan-like branchial arches" ;
		sg:abstract "The evolution of serially arranged, jointed endoskeletal supports internal to the gills—the visceral branchial arches—represents one of the key events in early jawed vertebrate (gnathostome) history, because it provided the morphological basis for the subsequent evolution of jaws1,2,3,4,5. However, until now little was known about visceral arches in early gnathostomes6,7,8,9,10,11,12,13,14,15,16,17, and theories about gill arch evolution were driven by information gleaned mostly from both modern cartilaginous (chondrichthyan) and bony (osteichthyan) fishes. New fossil discoveries can profoundly affect our understanding of evolutionary history, by revealing hitherto unseen combinations of primitive and derived characters18,19. Here we describe a 325 million year (Myr)-old Palaeozoic shark-like fossil that represents, to our knowledge, the earliest identified chondrichthyan in which the complete gill skeleton is three-dimensionally preserved in its natural position. Its visceral arch arrangement is remarkably osteichthyan-like, suggesting that this may represent the common ancestral condition for crown gnathostomes. Our findings thus reinterpret the polarity of some arch features of the crown jawed vertebrates and invert the classic hypothesis, in which modern sharks retain the ancestral condition3,20. This study underscores the importance of early chondrichthyans in resolving the evolutionary history of jawed vertebrates." ;
		sg:hasContribution <http://www.springernature.com/scigraph/things/contributions/957d15a04d259a8c71d155ce6cd727d3> , <http://www.springernature.com/scigraph/things/contributions/57f1dd212005dc599bc28b3a0e867775> , <http://www.springernature.com/scigraph/things/contributions/44d1d1208f8fcfbfec1f4cb6ce485bea> , <http://www.springernature.com/scigraph/things/contributions/334226141057acfbe5578cccdab5af94> , <http://www.springernature.com/scigraph/things/contributions/90f3a74b48f81d174a4b363777a7c655> ;
		sg:publicationYearMonth "2014-04"^^xsd:gYearMonth ;
		sg:publicationYear "2014"^^xsd:gYear ;
		sg:coverYearMonth "2014-05"^^xsd:gYearMonth ;
		sg:coverYear "2014"^^xsd:gYear ;
		sg:volume "509" ;
		sg:issue "7502" ;
		sg:hasJournal <http://www.springernature.com/scigraph/things/journals/723ba46cf7980ad6089b3da0ba4b0b47> , <http://www.springernature.com/scigraph/things/journals/5ea8996a5bb089dd0562d3bfe24eaad9> ;
		sg:issnElectronic "1476-4687" ;
		sg:issnPrint "0028-0836" ;
		sg:ddsIdJournalBrand "41586" ;
		sg:publicationDate "2014-04-16"^^xsd:date ;
		sg:npgId "nature13195" ;
		sg:hasArticleType <http://www.springernature.com/scigraph/things/article-types/research> ;
		sg:coverDate "2014-05-29"^^xsd:date ;
		sg:hasSubject <http://www.springernature.com/scigraph/things/subjects/palaeontology> .
}
```

Including in the response information of the associated contribution and affiliation objects using q2.rq
```
PREFIX sg: <http://www.springernature.com/scigraph/ontologies/core/>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX sgg: <http://www.springernature.com/scigraph/graphs/>
PREFIX : <http://www.ontotext.com/connectors/elasticsearch#>
describe ?s ?c ?a
where {   
        ?s a sg:Article .
        ?s sg:doi "10.1038/nature13195" .
 		?s sg:hasContribution ?c   .
    	?c sg:hasAffiliation ?a
}
```


