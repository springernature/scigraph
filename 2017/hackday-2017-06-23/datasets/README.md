![graph-image](http://static.springer.com/spcom/sites/sgw/images/logo-springernature.svg)

![SpringerNature SciGraph](https://github.com/springernature/scigraph/wiki/images/SpringerNature.png)

# SciGraph Datasets

Welcome to the [Springer Nature SciGraph](http://www.springernature.com/scigraph) project. On this page you can find information about the SciGraph datasets we are making available for the SciGraph Hack Day.

## Table of Contents

* [Datasets](#datasets)
* [Classes and Properties](#classes-and-properties)

## Datasets

![scigraph-hack-day-2017-06-23](https://github.com/springernature/scigraph/wiki/images/scigraph-hack-day-2017-06-23.png)

## Classes and Properties

<a name="Top">
Models for the main classes in the datasets are described below:

* [Affiliation](#Affiliation)
* [Article](#Article)
* ~[ArticleType](#ArticleType)~
* [Book](#Book)
* [BookChapter](#BookChapter)
* [BookEdition](#BookEdition)
* [BookSeries](#BookSeries)
* [CategorizationEvent](#CategorizationEvent)
* [Conference](#Conference)
* [ConferenceSeries](#ConferenceSeries)
* [Contribution](#Contribution)
* ~[FieldOfResearchCode](#FieldOfResearchCode)~
* [Grant](#Grant)
* [IndexCheckEvent](#IndexCheckEvent)
* [Journal](#Journal)
* [JournalBrand](#JournalBrand)
* ~[ProductMarketCode](#ProductMarketCode)~
* ~[Relation](#Relation)~
* [Subject](#Subject)
* ~[TechnicalArticleType](#TechnicalArticleType)~

Note that those classes indicated with strikethrough are taxonomies for which no data model is currently reported.

---

<a name="Affiliation"></a>
### Class: Affiliation

| Field | 	Property | 	Datatype | Example |
| --- | --- | --- | --- |
| _(Type)_ | 	rdf:type	 | sg:Affiliation | 	sg:Affiliation |
| _(ID)_	 | sg:scigraphId	 | xsd:string	 | "ee0bc4b9b663c28602d16fed10b8c867" |
| .					 | | | |
| _**Name**_	 | | | |
| Name | 	sg:publishedName | xsd:string	 | "Org Name"	 |
| Order | 	sg:order | xsd:integer	 | 1	 |
| . | | | |
| _**Organization**_	 | | | |
| Organization | 	sg:hasOrganization | 	rdfs:Resource	 | <http://www.grid.ac/...>	 |

---

<a name="Article"></a>
### Class: Article

| Field | 	Property | 	Datatype | Example |
| --- | --- | --- | --- |
| _(Type)_ | 	rdf:type	 | sg:Article | 	sg:Article |  
| _(ID)_ | 	sg:scigraphId	 | xsd:string | 	"8ba89261543322df04dfe9aa9cf0b2dc" |
| .					 | | | |
| _**Identity**_	 | | | |
| DOI	 | sg:doi | 	xsd:string	 | "10.1038/npjschz.2014.6" |
| DOI Link	 | sg:doiLink | 	rdfs:Resource	 | <http://dx.doi.org/...> |
| .					 | | | |
| _**Label**_	 | | | |
| Language (Original)	 | sg:language | 	xsd:string	 | "English" |
| Title	 | sg:title | 	xsd:string	 | "Title ..." |
| Abstract | 	sg:abstract | xsd:string	 | "Description ..."  |
| Title (Translated)	 | sg:titleTranslated | 	rdf:langString	 | "Title ..."@en |
| Abstract (Translated) | 	sg:abstractTranslated | rdf:langString	 | "Description ..."@en  |
| .					 | | | |
| _**Contributor**_	 | | | |
| Contributor | sg:hasContribution | 	sg:Contribution | contributions:... |
| .					 | | | |
| _**Publisher**_	 | | | |
| Year | sg:publicationYear | 	xsd:gYear| "2014"^^	xsd:gYear |
| Year Month | sg:publicationYearMonth | 	xsd:gYearMonth | "2014-07"^^	xsd:gYearMonth |
| Date | sg:publicationDate | 	xsd:date | "2014-07-21"^^xsd:date |
| Webpage	 | sg:webpage | 	rdfs:Resource	 | <http://...> |
| .					 | | | |
| _**Description**_	 | | | |
| FOR Code | sg:hasFieldOfResearchCode | 	rdfs:Resource	 | <http://purl.org/au-research/vocabulary/anzsrc-for/...> |
| Subject | sg:hasSubject | 	sg:Subject | subjects:... |
| .					 | | | |
| _**Source**_	 | | | |
| Journal | sg:hasJournal| 	sg:Journal | journals:... |
| Volume | sg:volume | 	xsd:string | "12" |
| Issue | sg:issue | 	xsd:string | "134" |

---

<a name="ArticleType"></a>
### Class: ArticleType

---

<a name="Book"></a>
### Class: Book

| Field | 	Property | 	Datatype | Example |
| --- | --- | --- | --- |
| (Type) | 	rdf:type	 | sg:Book | 	sg:Book|
| (ID)	 | sg:scigraphId	 | xsd:string	 | "b8d06d8960b1224f088cb5664e98d562" |
| .					 | | | |
| _**Identity**_	 | | | |
| DDS ID | sg:ddsId	 | xsd:string	 | "86185684" |
| DOI | 	sg:doi	 | xsd:string	 | "10.1007/978-3-662-10656-3"	 |
| ISBN | 	sg:isbn | xsd:string	 | "978-3-662-10656-3"	 |
| .					 | | | |
| _**Reference**_	 | | | |
| Edition	 | 	sg:hasBookEdition | sg:BookEdition | book-editions:TBD-2 |
| Conference	 | 	sg:hasConference | sg:Conference | conferences:TBD-2 |
| .					 | | | |
| _**Other**_	 | | | |
| Medium	 | sg:medium | 	xsd:string	 | "Book" |
| Short Title	 | sg:shortTitle | 	xsd:string	 | "Short title ..." |

---

<a name="BookChapter"></a>
### Class: BookChapter

| Field | 	Property | 	Datatype | Example |
| --- | --- | --- | --- |
| (Type) | 	rdf:type	 | sg:BookChapter | 	sg:BookChapter |
| (ID)	 | sg:scigraphId	 | xsd:string	 | "186d09b6d0b4b74efccbb0ca088ecde4"	 |
| .					 | | | |
| _**Identity**_	 | | | |
| DDS ID | sg:ddsId	 | xsd:string	 | "Chap1" |
| DOI | 	sg:doi	 | xsd:string	 | "10.1007/978-3-662-10656-3_1"	 |
| .					 | | | |
| _**Label**_	 | | | |
| Language	 | sg:language	 | xsd:string	 | "English" |
| Title	 | sg:title | 	xsd:string	 | "Title ..." |
| Title&nbsp;(XML) | sg:titleXml | 	xsd:string	 | "Title (XML) ..." |
| Subtitle	 | sg:subtitle | 	xsd:string	 | "Subtitle ..." |
| Subtitle&nbsp;(XML)	 | sg:subtitleXml | 	xsd:string	 | "Subtitle (XML) ..." |
| Abstract | 	sg:abstract | xsd:string	 | "Description ..."  |
| .					 | | | |
| _**Contributor**_	 | | | |
| Contributor | sg:hasContribution | 	sg:Contribution | contributions:... |
| .					 | | | |
| _**Reference**_	 | | | |
| Has Book | sg:hasBook | sg:Book	 | books:... |
| .					 | | | |
| _**???**_	 | | | |
| Chapter Number | 	sg:chapterNumber | xsd:string	 | "1"	 |
| First Page | 	sg:pageFirst | xsd:string	 | "1"	 |
| Last Page | 	sg:pageLast | xsd:string	 | "23"	 |
| .					 | | | |
| _**Publisher**_	 | | | |
| Copyright Holder	 | 	sg:copyrightHolder | xsd:string	 | "Name ..."	 |
| Copyright Year	 | 	sg:copyrightYear	 | xsd:gYear	 | "2005"^^xsd:gYear	 |
| .					 | | | |
| _**Rights**_	 | | | |
| Chapter Rights	 | sg:metadataRights, sg:abstractRights, sg:bodyPdfRights, sg:bodyHtmlRights, sg:bibliographyRights, sg:esmRights | xsd:string	 | "OpenAccess" |

---
<a name="BookEdition"></a>
### Class: BookEdition

| Field | 	Property | 	Datatype | Example |
| --- | --- | --- | --- |
| (Type) | 	rdf:type	 | sg:BookEdition | 	sg:BookEdition |
| (ID)	 | sg:scigraphId	 | xsd:string	 | "c6a3a2c5533022519407029f38d214fa" |
| .					 | | | |
| _**Identity**_	 | | | |
| DDS ID | sg:ddsId	 | xsd:string	 | "41427" |
| Edition Number| sg:editionNumber	 | xsd:string	 | "1" |
| Intellectual Unit | sg:intellectualUnitId	 | xsd:string	 | "39334" |
| .					 | | | |
| _**Label**_	 | | | |
| Language	 | sg:language	 | xsd:string	 | "English" |
| Title	 | sg:title | 	xsd:string	 | "Title ..." |
| Subtitle	 | sg:subtitle | 	xsd:string	 | "Subtitle ..." |
| .					 | | | |
| _**Contributor**_	 | | | |
| Contributor | sg:hasContribution | 	sg:Contribution | contributions:... |
| .					 | | | |
| _**Publisher**_	 | | | |
| Publisher	 | sg:publisher	 | xsd:string	 | "..." |
| Copyright Holder	 | 	sg:copyrightHolder | xsd:string	 | "..."	 |
| Copyright Year	 | 	sg:copyrightYear	 | xsd:gYear	 | "2016"^^xsd:gYear	 |
| .					 | | | |
| _**Description**_	 | | | |
| Book Type | sg:bookType | 	xsd:string |  "..." |
| (Subject Areas/Disciplines)	 | sg:hasProductMarketCode | sg:ProductMarketCode | product-market-codes:T123456	 |
| Description	 | sg:description	 | xsd:string	 | "..." |
| Volume	 | sg:volume	 | xsd:string	 | "..." |

---

<a name="BookSeries"></a>
### Class: BookSeries

| Field | 	Property | 	Datatype | Example |
| --- | --- | --- | --- |
| (Type) | 	rdf:type	 | sg:BookSeries | 	sg:BookSeries |
| (ID)	 | sg:scigraphId	 | xsd:string	 | "c6a3a2c5533022519407029f38d214fa" |
| .					 | | | |
| _**Identity**_	 | | | |
| DDS ID | sg:ddsId	 | xsd:string	 | "41427" |
| ISSN (Electronic) | sg:issnElectronic	 | xsd:string	 | "1" |
| ISSN (Print) | sg:issnPrint	 | xsd:string	 | "39334" |
| .					 | | | |
| _**Label**_	 | | | |
| Language	 | sg:language	 | xsd:string	 | "English" |
| Title	 | sg:title | 	xsd:string	 | "Title ..." |
| Short Title	 | sg:shortTitle | 	xsd:string	 | "Short title ..." |
| .					 | | | |
| _**Description**_	 | | | |
| Description	 | sg:description	 | xsd:string	 | "English" |
| Category	 | sg:category | 	xsd:string	 | "Title ..." |
| .					 | | | |

---

<a name="CategorizationEvent"></a>
### Class: CategorizationEvent

| Field | 	Property | 	Datatype | Example |
| --- | --- | --- | --- |
| (Type) | 	rdf:type	 | sg:CategorizationEvent < sg:AnnotationEvent | 	sg:CategorizationEvent |
| (ID) | 	sg:scigraphId	 | xsd:string | 	"5255e536016ade27543c4682acaebd07" |
| .					 | | | |
| Date	 | 	sg:date	 | xsd:date	 | "2010-10-27"^^xsd:date	 |
| Source | 	sg:annotationAgent | xsd:string	 |"Molecular Connections"	 |
| | 	sg:hasAnnotationAgent | sg:Agent	 | organizations:....	 |
| Thing | 	sg:hasAnnotationThing | sg:Thing	 | articles:...	 |
| Category | 	sg:hasAnnotationCategory | sg:Category	 | subjects:...	 |
| | 	sg:annotationCategory | rdfs:Literal	 | "..."	 |
| Score | 	sg:score| xsd:decimal	 | 1.0	 |

---

<a name="Conference"></a>
### Class: Conference

| Field | 	Property | 	Datatype | Example |
| --- | --- | --- | --- |
| (Type) | 	rdf:type	 | sg:Conference | 	sg:Conference |
| (ID) | 	sg:scigraphId	 | xsd:string | 	"..." |
| .					 | | | |
| Acronym	 | 	sg:acronym	 | xsd:string	 | "NAME"	 |
| City	 | 	sg:city | xsd:string	 | "City"	 |
| Country	 | 	sg:country | xsd:string	 | "Country"	 |
| End Date	 | 	sg:dateEnd	 | xsd:string	 | "2010-10-27"^^xsd:date	 |
| Name	 | 	sg:name | xsd:string	 | "Conference Name"	 |
| Number	 | 	sg:number | xsd:integer | 2	 |
| Series Number	 | 	sg:hasConferenceSeries | sg:ConferenceSeries |
| Start Date	 | 	sg:dateStart | xsd:string	 | "2010-10-24"	^^xsd:date |
| Year	 | 	sg:year | xsd:gYear	 | "2010"^^xsd:gYear	 |

---

<a name="ConferenceSeries"></a>
### Class: ConferenceSeries

| Field | 	Property | 	Datatype | Example |
| --- | --- | --- | --- |
| (Type) | 	rdf:type	 | sg:	ConferenceSeries | 	sg:ConferenceSeries |
| (ID)	 | sg:scigraphId	 | xsd:string	 | "7653"	 |
| .					 | | | |
| Name	 | sg:name | 	xsd:string	 | "Name ..." |
| DBLP ID | 	sg:dblpId	 | xsd:string	 | "..."	 |

---

<a name="Contribution"></a>
### Class: Contribution

| Field | 	Property | 	Datatype | Example |
| --- | --- | --- | --- |
| _(Type)_ | 	rdf:type	 | sg:Contribution | 	sg:Contribution |
| _(ID)_	 | sg:scigraphId	 | xsd:string	 | "98b6a65500b47022e1f5a8b1b9d6cc68" |
| .					 | | | |
| _**Name**_	 | | | |
| Family Name | 	sg:publishedFamilyName | xsd:string	 | "Family Name"	 |
| Given Name | 	sg:publishedGivenName | xsd:string	 | "Given Name"	 |
| Name | 	sg:publishedName | xsd:string	 | "Full Name"	 |
| .					 | | | |
| _**Other**_	 | | | |
| Corresponding? | 	sg:isCorresponding | xsd:boolean | true	 |
| Order | 	sg:order | xsd:integer	 | 1	 |
| Role | 	sg:role | xsd:string	 | "editor"	 |
| .					 | | | |
| _**Affiliation**_	 | | | |
| Affiliation | 	sg:hasAffiliation | sg:Affiliation | affiliations:...  |

---

<a name="FieldOfResearchCode"></a>
### Class: FieldOfResearchCode

---

<a name="Grant"></a>
### Class: Grant

| Field | 	Property | 	Datatype | Example |
| --- | --- | --- | --- |
| _(Type)_ | 	rdf:type	 | sg:Grant | 	sg:Grant |
| _(ID)_	 | sg:scigraphId	 | xsd:string	 | "81dc9bdb52d04dc20036dbd8313ed055" |
| .					 | | | |
| _**Label**_	 | | | |
| Language (Original)	 | sg:language | 	xsd:string	 | "English" |
| Title	 | sg:title | 	xsd:string	 | "Title ..." |
| Abstract | 	sg:abstract | xsd:string	 | "Description ..."  |
| Title (Translated)	 | sg:titleTranslated | 	rdf:langString	 | "Title ..."@en |
| Abstract (Translated) | 	sg:abstractTranslated | rdf:langString	 | "Description ..."@en  |
| .					 | | | |
| _**Contributor**_	 | | | |
| PI | sg:hasContribution | sg:Contribution	 | contributors:... |
| .					 | | | |
| _**Funder**_	 | | | |
| Funding Amount | 	sg:fundingAmount	 | xsd:decimal	 | 13021970.0 |
| Funding Currency | 	sg:fundingCurrency	 | xsd:string	 | "USD"	 |
| Funder | 	sg:hasFundingOrganization | rdfs:Resource	 | <http://grid.ac/...>	 |
| Recipient | sg:hasRecipientOrganization | rdfs:Resource | <http://grid.ac/...>	 |
| Start Year | 	sg:startYear	 | xsd:gYear	 | "2007"^^xsd:gYear |
| End Year | 	sg:endYear	 | xsd:gYear	 | "2014"^^xsd:gYear |
| License | sg:license | 	xsd:string | "..." |
| Web Page | 	sg:webpage | rdfs:Resource	 | <http://...>	 |
| . | 		|	 | |
| _**Description**_	 | | | |
| FOR Code | 	sg:hasFieldOfResearchCode | rdfs:Resource	 | <http://purl.org/au-research/...> |
| . | 		|	 | |
| _**Publication**_	 | | | |
| Publication | sg:hasFundedPublication | sg:Article	 | articles:... |

---

<a name="IndexCheckEvent"></a>
### Class: IndexCheckEvent

| Field | 	Property | 	Datatype | Example |
| --- | --- | --- | --- |
| (Type) | 	rdf:type	 | sg:IndexCheckEvent < sg:AnnotationEvent | 	sg:IndexCheckEvent |
| (ID) | 	sg:scigraphId	 | xsd:string | 	"5255e536016ade27543c4682acaebd07" |
| .					 | | | |
| Date	 | 	sg:date	 | xsd:date	 | "2010-10-27"^^xsd:date	 |
| Source | 	sg:annotationAgent | xsd:string	 |"Molecular Connections"	 |
| | 	sg:hasAnnotationAgent | sg:Agent	 | organizations:....	 |
| Thing | 	sg:hasAnnotationThing | sg:Thing	 | articles:...	 |

---

<a name="Journal"></a>
### Class: Journal

| Field | 	Property | 	Datatype | Example |
| --- | --- | --- | --- |
| _(Type)_ | 	rdf:type	 | sg:Journal | 	sg:Journal |
| _(ID)_ | 	sg:scigraphId	 | xsd:string | 	"d41d8cd98f00b204e9800998ecf8427e" |
| .					 | | | |
| _**Identity**_	 | | | |
| ISSN	 | sg:issn | 		xsd:string	 | "1234-5678" |
| DOI	 | sg:doi | 		xsd:string	 | "10.1234/..."|
| .					 | | | |
| _**Journal Brand**_	 | | | |
| Journal Brand | sg:hasJournalBrand | 	sg:JournalBrand	 | journal-brands:... |
| .					 | | | |
| _**Format**_	 | | | |
| Medium	 | sg:medium | 		xsd:string	 | "Electronic" |
| .					 | | | |
| _**Access**_	 | | | |
| Active?	 | sg:isActivePublication | 		xsd:boolean	 | true |
| .					 | | | |
| _**History**_	 | | | |
| Historical?	 | sg:isHistoricalJournal | 		xsd:boolean	 | true |

---

<a name="JournalBrand"></a>
### Class: JournalBrand

| Field | 	Property | 	Datatype | Example |
| --- | --- | --- | --- |
| _(Type)_ | 	rdf:type	 | sg:JournalBrand | 	sg:JournalBrand |
| _(ID)_ | 	sg:scigraphId	 | xsd:string | 	"d41d8cd98f00b204e9800998ecf8427e" |
| .					 | | | |
| _**Label**_	 | | | |
| Language	 | sg:language | 	xsd:string	 | "English" |
| Title	 | sg:title | 	xsd:	string	 | "Title" |
| Short Title | sg:shortTitle | 		xsd:string	 | "Short Title" |
| Subtitle | sg:subtitle | 	xsd:	string	 | "Subtitle" |
| .					 | | | |
| _**Publisher**_	 | | | |
| Imprint	 | sg:imprint | 	xsd:	string	 | "Imprint" |
| Publisher	 | sg:publisher | 		xsd:string	 | "Publisher" |
| Homepage	 | sg:webpage | 	rdfs:Resource	 | <http://...> |
| Copyright	 | sg:copyrightHolder | 		xsd:string	 | "..." |
| .					 | | | |
| _**Coverage**_	 | | | |
| Title Added Year | sg:titleAddedYear | xsd:gYear | "2005"^^xsd:gYear |
| Start Year | sg:startYear | xsd:gYear | "1981"^^xsd:gYear |
| End Year | sg:endYear | xsd:gYear | "1996"^^xsd:gYear |
| Start Volume | sg:volumeStart | xsd:string | "1" |
| End Volume | sg:volumeEnd | xsd:string | "43" |
| Total Volumes | sg:volumeCount | xsd:integer | 43 |
| .					 | | | |
| _**Access**_	 | | | |
| OpenAccess	 | sg:openAccess | xsd:	string	 | "Fully Open Access" |

---

<a name="ProductMarketCode"></a>
### Class: ProductMarketCode

---

<a name="Relation"></a>
### Class: Relation

---

<a name="Subject"></a>
### Class: Subject

| Field | 	Property* | 	Datatype | Example |
| --- | --- | --- | --- |
| _(Type)_ | 	rdf:type	 | 	sg:Subject | 	sg:Subject |
| | 	rdf:type	 | skos:Concept | 	skos:Concept |
| _(ID)_ | sg:id	 | xsd:string	 | "biological-sciences" |
| .					 | | | |
| Related | sg:related | 	sg:Subject	 | subjects:... |
| Replaced By | sg:replacedBy | 	sg:Subject	 | subjects:...  |
| Replaces | sg:replaces | 	sg:Subject	 | subjects:...  |
| Webpage | sg:webpage | 	rdfs:Resource	 | <http://www.nature.com/subjects/...>  |
| . |  | 	 |  |
| . |  | 	 |  |
| _**Label**_	 | | | |
| Label | rdfs:label | 	xsd:string	 | "..." |
| Alt Label | skos:altLabel | 	rdf:langString	 | "..."@en |
| Definition | skos:definition | 	rdf:langString	 | "..."@en |
| Pref Label | skos:prefLabel | 	rdf:langString	 | "..."@en |
| . |  | 	 |  |
| _**Structure**_	 | | | |
| Broader | skos:broader | 	skos:Concept	 | subjects:...  |
| Narrower | skos:narrower | 	skos:Concept	 | subjects:...  |
| In Scheme | skos:inScheme | skos:ConceptScheme	 | subjects:  |
| Top Concept Of | skos:topConceptOf | 	skos:ConceptScheme	 | subjects: |
| . |  | 	 |  |
| _**Note**_	 | | | |
| Note | skos:note | 		xsd:string	 | "..." |

---

<a name="TechnicalArticleType"></a>
### Class: TechnicalArticleType
