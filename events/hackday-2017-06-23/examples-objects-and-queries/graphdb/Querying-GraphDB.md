# Querying GraphDB

The queries below can be executed in your GraphDB Workbench: `<aws public dns>:7200/sparql`.

## Article, Contribution and Affiliation Objects

To look up the article with DOI `10.1038/nature13195` about "Palaeozoic osteichthyan" (see [q1.rq](q1.rq)):

```
PREFIX sg: <http://www.springernature.com/scigraph/ontologies/core/>
describe ?s
where {   
        ?s a sg:Article .
        ?s sg:doi "10.1038/nature13195"
}
```

Below is the result in TriG format:

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

To also retrieve information about the associated contribution and affiliation objects (see [q2.rq](q2.rq)):

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

This results in the following.

```
@prefix sg: <http://www.springernature.com/scigraph/ontologies/core/> .
@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .
@prefix sgg: <http://www.springernature.com/scigraph/graphs/> .
@prefix : <http://www.ontotext.com/connectors/elasticsearch#> .
@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
@prefix sesame: <http://www.openrdf.org/schema/sesame#> .
@prefix owl: <http://www.w3.org/2002/07/owl#> .
@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .
@prefix fn: <http://www.w3.org/2005/xpath-functions#> .

{
	<http://www.springernature.com/scigraph/things/articles/787e60fcaf79211c91c6fb0b47c1d30b> a rdfs:Resource , sg:Article , sg:Publication , sg:Thing ;
		sg:hasFieldOfResearchCode <http://purl.org/au-research/vocabulary/anzsrc-for/2008/0602> , <http://purl.org/au-research/vocabulary/anzsrc-for/2008/06> ;
		sg:hasJournalBrand <http://www.springernature.com/scigraph/things/journal-brands/012496b06989edb434c6b8e1d0b0a7db> ;
		rdfs:label "A Palaeozoic shark with osteichthyan-like branchial arches" ;
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
	
	<http://www.springernature.com/scigraph/things/contributions/957d15a04d259a8c71d155ce6cd727d3> a sg:Contribution , sg:Thing , sg:Event ;
		sg:scigraphId "957d15a04d259a8c71d155ce6cd727d3" ;
		sg:publishedFamilyName "Pradel" ;
		sg:publishedGivenName "Alan" ;
		sg:publishedName "Alan Pradel" ;
		sg:order "1"^^xsd:integer ;
		sg:isCorresponding "true"^^xsd:boolean ;
		sg:role "author" ;
		sg:hasAffiliation <http://www.springernature.com/scigraph/things/affiliations/9f72a4cda960f55c472c157d7fbc5ebc> .
	
	<http://www.springernature.com/scigraph/things/articles/787e60fcaf79211c91c6fb0b47c1d30b> sg:hasContribution <http://www.springernature.com/scigraph/things/contributions/957d15a04d259a8c71d155ce6cd727d3> .
	
	<http://www.springernature.com/scigraph/things/affiliations/9f72a4cda960f55c472c157d7fbc5ebc> a sg:Affiliation , sg:Thing , sg:Event ;
		sg:scigraphId "9f72a4cda960f55c472c157d7fbc5ebc" ;
		sg:publishedName "Department of Vertebrate Paleontology, American Museum of Natural History" ;
		sg:order "1"^^xsd:integer .
	
	<http://www.springernature.com/scigraph/things/contributions/957d15a04d259a8c71d155ce6cd727d3> sg:hasAffiliation <http://www.springernature.com/scigraph/things/affiliations/9f72a4cda960f55c472c157d7fbc5ebc> .
	
	<http://www.springernature.com/scigraph/things/articles/787e60fcaf79211c91c6fb0b47c1d30b> a rdfs:Resource , sg:Article , sg:Publication , sg:Thing ;
		sg:hasFieldOfResearchCode <http://purl.org/au-research/vocabulary/anzsrc-for/2008/0602> , <http://purl.org/au-research/vocabulary/anzsrc-for/2008/06> ;
		sg:hasJournalBrand <http://www.springernature.com/scigraph/things/journal-brands/012496b06989edb434c6b8e1d0b0a7db> ;
		rdfs:label "A Palaeozoic shark with osteichthyan-like branchial arches" ;
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
	
	<http://www.springernature.com/scigraph/things/contributions/57f1dd212005dc599bc28b3a0e867775> a sg:Contribution , sg:Thing , sg:Event ;
		sg:scigraphId "57f1dd212005dc599bc28b3a0e867775" ;
		sg:publishedFamilyName "Maisey" ;
		sg:publishedGivenName "John G." ;
		sg:publishedName "John G. Maisey" ;
		sg:order "2"^^xsd:integer ;
		sg:isCorresponding "true"^^xsd:boolean ;
		sg:role "author" ;
		sg:hasAffiliation <http://www.springernature.com/scigraph/things/affiliations/d4a81c6957105dd68703c853e41b6ede> .
	
	<http://www.springernature.com/scigraph/things/articles/787e60fcaf79211c91c6fb0b47c1d30b> sg:hasContribution <http://www.springernature.com/scigraph/things/contributions/57f1dd212005dc599bc28b3a0e867775> .
	
	<http://www.springernature.com/scigraph/things/affiliations/d4a81c6957105dd68703c853e41b6ede> a sg:Affiliation , sg:Thing , sg:Event ;
		sg:scigraphId "d4a81c6957105dd68703c853e41b6ede" ;
		sg:publishedName "Department of Vertebrate Paleontology, American Museum of Natural History" ;
		sg:order "1"^^xsd:integer .
	
	<http://www.springernature.com/scigraph/things/contributions/57f1dd212005dc599bc28b3a0e867775> sg:hasAffiliation <http://www.springernature.com/scigraph/things/affiliations/d4a81c6957105dd68703c853e41b6ede> .
	
	<http://www.springernature.com/scigraph/things/articles/787e60fcaf79211c91c6fb0b47c1d30b> a rdfs:Resource , sg:Article , sg:Publication , sg:Thing ;
		sg:hasFieldOfResearchCode <http://purl.org/au-research/vocabulary/anzsrc-for/2008/0602> , <http://purl.org/au-research/vocabulary/anzsrc-for/2008/06> ;
		sg:hasJournalBrand <http://www.springernature.com/scigraph/things/journal-brands/012496b06989edb434c6b8e1d0b0a7db> ;
		rdfs:label "A Palaeozoic shark with osteichthyan-like branchial arches" ;
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
	
	<http://www.springernature.com/scigraph/things/contributions/44d1d1208f8fcfbfec1f4cb6ce485bea> a sg:Contribution , sg:Thing , sg:Event ;
		sg:scigraphId "44d1d1208f8fcfbfec1f4cb6ce485bea" ;
		sg:publishedFamilyName "Tafforeau" ;
		sg:publishedGivenName "Paul" ;
		sg:publishedName "Paul Tafforeau" ;
		sg:order "3"^^xsd:integer ;
		sg:isCorresponding "false"^^xsd:boolean ;
		sg:role "author" ;
		sg:hasAffiliation <http://www.springernature.com/scigraph/things/affiliations/39f56a948a56a0c6292077ea9df54b72> .
	
	<http://www.springernature.com/scigraph/things/articles/787e60fcaf79211c91c6fb0b47c1d30b> sg:hasContribution <http://www.springernature.com/scigraph/things/contributions/44d1d1208f8fcfbfec1f4cb6ce485bea> .
	
	<http://www.springernature.com/scigraph/things/affiliations/39f56a948a56a0c6292077ea9df54b72> a sg:Affiliation , sg:Thing , sg:Event ;
		sg:scigraphId "39f56a948a56a0c6292077ea9df54b72" ;
		sg:publishedName "European Synchrotron Radiation Facility, BP 220" ;
		sg:order "1"^^xsd:integer .
	
	<http://www.springernature.com/scigraph/things/contributions/44d1d1208f8fcfbfec1f4cb6ce485bea> sg:hasAffiliation <http://www.springernature.com/scigraph/things/affiliations/39f56a948a56a0c6292077ea9df54b72> .
	
	<http://www.springernature.com/scigraph/things/articles/787e60fcaf79211c91c6fb0b47c1d30b> a rdfs:Resource , sg:Article , sg:Publication , sg:Thing ;
		sg:hasFieldOfResearchCode <http://purl.org/au-research/vocabulary/anzsrc-for/2008/0602> , <http://purl.org/au-research/vocabulary/anzsrc-for/2008/06> ;
		sg:hasJournalBrand <http://www.springernature.com/scigraph/things/journal-brands/012496b06989edb434c6b8e1d0b0a7db> ;
		rdfs:label "A Palaeozoic shark with osteichthyan-like branchial arches" ;
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
	
	<http://www.springernature.com/scigraph/things/contributions/334226141057acfbe5578cccdab5af94> a sg:Contribution , sg:Thing , sg:Event ;
		sg:scigraphId "334226141057acfbe5578cccdab5af94" ;
		sg:publishedFamilyName "Mapes" ;
		sg:publishedGivenName "Royal H." ;
		sg:publishedName "Royal H. Mapes" ;
		sg:order "4"^^xsd:integer ;
		sg:isCorresponding "false"^^xsd:boolean ;
		sg:role "author" ;
		sg:hasAffiliation <http://www.springernature.com/scigraph/things/affiliations/3f342f084d1cd2b4974b3b3c6820365e> .
	
	<http://www.springernature.com/scigraph/things/articles/787e60fcaf79211c91c6fb0b47c1d30b> sg:hasContribution <http://www.springernature.com/scigraph/things/contributions/334226141057acfbe5578cccdab5af94> .
	
	<http://www.springernature.com/scigraph/things/affiliations/3f342f084d1cd2b4974b3b3c6820365e> a sg:Affiliation , sg:Thing , sg:Event ;
		sg:scigraphId "3f342f084d1cd2b4974b3b3c6820365e" ;
		sg:publishedName "Department of Geological Sciences, Ohio University" ;
		sg:order "1"^^xsd:integer .
	
	<http://www.springernature.com/scigraph/things/contributions/334226141057acfbe5578cccdab5af94> sg:hasAffiliation <http://www.springernature.com/scigraph/things/affiliations/3f342f084d1cd2b4974b3b3c6820365e> .
	
	<http://www.springernature.com/scigraph/things/articles/787e60fcaf79211c91c6fb0b47c1d30b> a rdfs:Resource , sg:Article , sg:Publication , sg:Thing ;
		sg:hasFieldOfResearchCode <http://purl.org/au-research/vocabulary/anzsrc-for/2008/0602> , <http://purl.org/au-research/vocabulary/anzsrc-for/2008/06> ;
		sg:hasJournalBrand <http://www.springernature.com/scigraph/things/journal-brands/012496b06989edb434c6b8e1d0b0a7db> ;
		rdfs:label "A Palaeozoic shark with osteichthyan-like branchial arches" ;
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
	
	<http://www.springernature.com/scigraph/things/contributions/90f3a74b48f81d174a4b363777a7c655> a sg:Contribution , sg:Thing , sg:Event ;
		sg:scigraphId "90f3a74b48f81d174a4b363777a7c655" ;
		sg:publishedFamilyName "Mallatt" ;
		sg:publishedGivenName "Jon" ;
		sg:publishedName "Jon Mallatt" ;
		sg:order "5"^^xsd:integer ;
		sg:isCorresponding "false"^^xsd:boolean ;
		sg:role "author" ;
		sg:hasAffiliation <http://www.springernature.com/scigraph/things/affiliations/ea95df3e802f2c1e35b789f33a6c0f3d> .
	
	<http://www.springernature.com/scigraph/things/articles/787e60fcaf79211c91c6fb0b47c1d30b> sg:hasContribution <http://www.springernature.com/scigraph/things/contributions/90f3a74b48f81d174a4b363777a7c655> .
	
	<http://www.springernature.com/scigraph/things/affiliations/ea95df3e802f2c1e35b789f33a6c0f3d> a sg:Affiliation , sg:Thing , sg:Event ;
		sg:scigraphId "ea95df3e802f2c1e35b789f33a6c0f3d" ;
		sg:publishedName "School of Biological Sciences, Washington State University" ;
		sg:order "1"^^xsd:integer .
	
	<http://www.springernature.com/scigraph/things/contributions/90f3a74b48f81d174a4b363777a7c655> sg:hasAffiliation <http://www.springernature.com/scigraph/things/affiliations/ea95df3e802f2c1e35b789f33a6c0f3d> .
}

```

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
