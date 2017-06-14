# Elasticsearch

The queries below can be executed against your Elasticsearch instance: `<your-vm-ip-address>:9200`.

## Index *sg_docs_articles* : Articles with Contributions and Affiliations

This search uses the index *sg_docs_articles*, which links each article with
the corresponding contributions, affiliations, grants, and journal.

To search for "Palaeozoic osteichthyan", run the following Elasticsearch query (see [articleContributionsAffiliationsJournal.json](example-queries/articleContributionsAffiliationsJournal.json)):

```
{
  "query": {
    "bool": {
      "must": [
        {
          "wildcard": {
            "title": "*Palaeozoic*osteichthyan*"
          }
        }
      ],
      "must_not": [ ],
      "should": [ ]
    }
  },
  "from": 0,
  "size": 10,
  "sort": [ ],
  "aggs": { }
}
```

For example, using cURL:
```
curl -XPOST <your-ip-address>:9200/sg_docs_articles_a/_search?pretty=true -d @articleContributionsAffiliationsJournal.json
```

This produces the following result (see [articleContributionsAffiliationsJournal-output.json](example-output/articleContributionsAffiliationsJournal-output.json)).

```
{
  "took": 621,
  "timed_out": false,
  "_shards": {
    "total": 5,
    "successful": 5,
    "failed": 0
  },
  "hits": {
    "total": 1,
    "max_score": 1,
    "hits": [
      {
        "_index": "sg_docs_articles_a",
        "_type": "semantic-index",
        "_id": "http://www.springernature.com/scigraph/things/articles/787e60fcaf79211c91c6fb0b47c1d30b",
        "_score": 1,
        "_source": {
          "journalIssn": [
            "1476-4687",
            "0028-0836"
          ],
          "subject": "Palaeontology",
          "journalId": "41586",
          "journalPublisher": "Nature Publishing Group UK",
          "abstract": "The evolution of serially arranged, jointed endoskeletal supports internal to the gills—the visceral branchial arches—represents one of the key events in early jawed vertebrate (gnathostome) history, because it provided the morphological basis for the subsequent evolution of jaws1,2,3,4,5. However, until now little was known about visceral arches in early gnathostomes6,7,8,9,10,11,12,13,14,15,16,17, and theories about gill arch evolution were driven by information gleaned mostly from both modern cartilaginous (chondrichthyan) and bony (osteichthyan) fishes. New fossil discoveries can profoundly affect our understanding of evolutionary history, by revealing hitherto unseen combinations of primitive and derived characters18,19. Here we describe a 325 million year (Myr)-old Palaeozoic shark-like fossil that represents, to our knowledge, the earliest identified chondrichthyan in which the complete gill skeleton is three-dimensionally preserved in its natural position. Its visceral arch arrangement is remarkably osteichthyan-like, suggesting that this may represent the common ancestral condition for crown gnathostomes. Our findings thus reinterpret the polarity of some arch features of the crown jawed vertebrates and invert the classic hypothesis, in which modern sharks retain the ancestral condition3,20. This study underscores the importance of early chondrichthyans in resolving the evolutionary history of jawed vertebrates.",
          "title": "A Palaeozoic shark with osteichthyan-like branchial arches",
          "contribution": [
            {
              "publishedName": "Alan Pradel",
              "affiliation": {
                "publishedName": "Department of Vertebrate Paleontology, American Museum of Natural History"
              },
              "order": "1"
            },
            {
              "publishedName": "John G. Maisey",
              "affiliation": {
                "publishedName": "Department of Vertebrate Paleontology, American Museum of Natural History"
              },
              "order": "2"
            },
            {
              "publishedName": "Paul Tafforeau",
              "affiliation": {
                "publishedName": "European Synchrotron Radiation Facility, BP 220"
              },
              "order": "3"
            },
            {
              "publishedName": "Royal H. Mapes",
              "affiliation": {
                "publishedName": "Department of Geological Sciences, Ohio University"
              },
              "order": "4"
            },
            {
              "publishedName": "Jon Mallatt",
              "affiliation": {
                "publishedName": "School of Biological Sciences, Washington State University"
              },
              "order": "5"
            }
          ],
          "scigraphId": "787e60fcaf79211c91c6fb0b47c1d30b",
          "_chains": [
            127290894,
            127290895,
            127290893,
            203965644,
            127315963,
            207227844
          ],
          "publicationYear": "2014",
          "_transaction_origin": 129526970,
          "fieldOfResearchCode": [
            "ECOLOGY",
            "BIOLOGICAL SCIENCES"
          ],
          "_graphdb_id": 129526970,
          "doiLink": "http://dx.doi.org/10.1038/nature13195",
          "publicationDate": "2014-04-16",
          "issnElectronic": "1476-4687",
          "journalTitle": "Nature",
          "doi": "10.1038/nature13195",
          "issnPrint": "0028-0836"
        }
      }
    ]
  }
}
```

## Index *sg_docs_grants*: Grants

We have set up an index *sg_docs_grants*, which links each grant with
the corresponding contributions, affiliations, and articles.

To search for a grant on "Genomics", run the following Elasticsearch query
(see [grantOnGenomics.json](example-queries/grantOnGenomics.json)):

```
{
  "query": {
    "bool": {
      "must": [
        {
          "wildcard": {
            "abstract": "genomics"
          }
        }
      ],
      "must_not": [ ],
      "should": [ ]
    }
  },
  "from": 0,
  "size": 10,
  "sort": [ ],
  "aggs": { }
}
```

Sample Response
```
{
  "took": 1647,
  "timed_out": false,
  "_shards": {
    "total": 5,
    "successful": 5,
    "failed": 0
  },
  "hits": {
    "total": 10398,
    "max_score": 1,
    "hits": [
      {
        "_index": "sg_docs_articles_b",
        "_type": "semantic-index",
        "_id": "http://www.springernature.com/scigraph/things/articles/050aa3f8b92ae214d6fb8828099fe3b9",
        "_score": 1,
        "_source": {
          "journalIssn": "1752-0509",
          "journalOpenAccess": "Fully Open Access",
          "journalId": "12918",
          "language": "English",
          "journalPublisher": "BioMed Central",
          "abstract": "Abstract BackgroundThe large amount of literature in the post-genomics era enables the study of gene interactions and networks using all available articles published for a specific organism. MeSH is a controlled vocabulary of medical and scientific terms that is used by biomedical scientists to manually index articles in the PubMed literature database. We hypothesized that genome-wide gene-MeSH term associations from the PubMed literature database could be used to predict implicit gene-to-gene relationships and networks. While the gene-MeSH associations have been used to detect gene-gene interactions in some studies, different methods have not been well compared, and such a strategy has not been evaluated for a genome-wide literature analysis. Genome-wide literature mining of gene-to-gene interactions allows ranking of the best gene interactions and investigation of comprehensive biological networks at a genome level. ResultsThe genome-wide GenoMesh literature mining algorithm was developed by sequentially generating a gene-article matrix, a normalized gene-MeSH term matrix, and a gene-gene matrix. The gene-gene matrix relies on the calculation of pairwise gene dissimilarities based on gene-MeSH relationships. An optimized dissimilarity score was identified from six well-studied functions based on a receiver operating characteristic (ROC) analysis. Based on the studies with well-studied Escherichia coli and less-studied Brucella spp., GenoMesh was found to accurately identify gene functions using weighted MeSH terms, predict gene-gene interactions not reported in the literature, and cluster all the genes studied from an organism using the MeSH-based gene-gene matrix. A web-based GenoMesh literature mining program is also available at: http://genomesh.hegroup.org. GenoMesh also predicts gene interactions and networks among genes associated with specific MeSH terms or user-selected gene lists. ConclusionsThe GenoMesh algorithm and web program provide the first genome-wide, MeSH-based literature mining system that effectively predicts implicit gene-gene interaction relationships and networks in a genome-wide scope.",
          "title": "A genome-wide MeSH-based literature mining system predicts implicit gene-to-gene relationships and networks",
          "contribution": [
            {
              "publishedName": "Zuoshuang Xiang",
              "affiliation": [
                {
                  "publishedName": "University of Michigan",
                  "gridName": "University of Michigan–Ann Arbor",
                  "location": {
                    "lon": "-83.738224",
                    "lat": "42.278306"
                  },
                  "gridId": "http://www.grid.ac/institutes/grid.214458.e",
                  "countryName": "United States",
                  "homePage": "https://www.umich.edu/"
                },
                {
                  "publishedName": "University of Michigan",
                  "gridName": "University of Michigan–Ann Arbor",
                  "location": {
                    "lon": "-83.738224",
                    "lat": "42.278306"
                  },
                  "gridId": "http://www.grid.ac/institutes/grid.214458.e",
                  "countryName": "United States",
                  "homePage": "https://www.umich.edu/"
                },
                {
                  "publishedName": "University of Michigan",
                  "gridName": "University of Michigan–Ann Arbor",
                  "location": {
                    "lon": "-83.738224",
                    "lat": "42.278306"
                  },
                  "gridId": "http://www.grid.ac/institutes/grid.214458.e",
                  "countryName": "United States",
                  "homePage": "https://www.umich.edu/"
                },
                {
                  "publishedName": "University of Michigan",
                  "gridName": "University of Michigan–Ann Arbor",
                  "location": {
                    "lon": "-83.738224",
                    "lat": "42.278306"
                  },
                  "gridId": "http://www.grid.ac/institutes/grid.214458.e",
                  "countryName": "United States",
                  "homePage": "https://www.umich.edu/"
                }
              ],
              "order": "1"
            },
            {
              "publishedName": "Tingting Qin",
              "affiliation": {
                "publishedName": "Medical University of South Carolina",
                "gridName": "Medical University of South Carolina",
                "location": {
                  "lon": "-79.951921",
                  "lat": "32.786599"
                },
                "gridId": "http://www.grid.ac/institutes/grid.259828.c",
                "countryName": "United States",
                "homePage": "http://academicdepartments.musc.edu/musc/"
              },
              "order": "2"
            },
            {
              "publishedName": "Zhaohui S Qin",
              "affiliation": [
                {
                  "publishedName": "Emory University",
                  "gridName": "Emory University",
                  "location": {
                    "lon": "-84.32401",
                    "lat": "33.792787"
                  },
                  "gridId": "http://www.grid.ac/institutes/grid.189967.8",
                  "countryName": "United States",
                  "homePage": "http://www.emory.edu/home/index.html"
                },
                {
                  "publishedName": "Emory School of Medicine",
                  "gridName": "Emory University",
                  "location": {
                    "lon": "-84.32401",
                    "lat": "33.792787"
                  },
                  "gridId": "http://www.grid.ac/institutes/grid.189967.8",
                  "countryName": "United States",
                  "homePage": "http://www.emory.edu/home/index.html"
                }
              ],
              "order": "3"
            },
            {
              "publishedName": "Yongqun He",
              "affiliation": [
                {
                  "publishedName": "University of Michigan",
                  "gridName": "University of Michigan–Ann Arbor",
                  "location": {
                    "lon": "-83.738224",
                    "lat": "42.278306"
                  },
                  "gridId": "http://www.grid.ac/institutes/grid.214458.e",
                  "countryName": "United States",
                  "homePage": "https://www.umich.edu/"
                },
                {
                  "publishedName": "University of Michigan",
                  "gridName": "University of Michigan–Ann Arbor",
                  "location": {
                    "lon": "-83.738224",
                    "lat": "42.278306"
                  },
                  "gridId": "http://www.grid.ac/institutes/grid.214458.e",
                  "countryName": "United States",
                  "homePage": "https://www.umich.edu/"
                },
                {
                  "publishedName": "University of Michigan",
                  "gridName": "University of Michigan–Ann Arbor",
                  "location": {
                    "lon": "-83.738224",
                    "lat": "42.278306"
                  },
                  "gridId": "http://www.grid.ac/institutes/grid.214458.e",
                  "countryName": "United States",
                  "homePage": "https://www.umich.edu/"
                },
                {
                  "publishedName": "University of Michigan",
                  "gridName": "University of Michigan–Ann Arbor",
                  "location": {
                    "lon": "-83.738224",
                    "lat": "42.278306"
                  },
                  "gridId": "http://www.grid.ac/institutes/grid.214458.e",
                  "countryName": "United States",
                  "homePage": "https://www.umich.edu/"
                }
              ],
              "order": "4"
            }
          ],
          "scigraphId": "050aa3f8b92ae214d6fb8828099fe3b9",
          "articleType": "OriginalPaper",
          "_chains": [
            204019881,
            203994681,
            9938,
            204019403,
            16660,
            203989870,
            16663,
            204026222,
            37113,
            34444
          ],
          "publicationYear": "2013",
          "_transaction_origin": 1214983,
          "fieldOfResearchCode": [
            "GENETICS",
            "BIOLOGICAL SCIENCES"
          ],
          "_graphdb_id": 1214983,
          "doiLink": "http://dx.doi.org/10.1186/1752-0509-7-S3-S9",
          "publicationDate": "2013-10-16",
          "issnElectronic": "1752-0509",
          "journalTitle": "BMC Systems Biology",
          "doi": "10.1186/1752-0509-7-S3-S9"
        }
      },
      ...
    ]
  }
}
```

See [grantOnGenomics-output.json](example-output/grantOnGenomics-output.json).

## Index *sg_docs_book_chapters*: Books and Chapters

We have set up an index *sg_docs_books_chapters*, which links each chapter with
the corresponding book, contributions, affiliations.

To search for a chapter on "Submarine", run the following Elasticsearch query
(see [chapterOnSubmarines.json](example-queries/chapterOnSubmarines.json)):

```
{
  "query": {
    "bool": {
      "must": [
        {
          "wildcard": {
            "title": "*submarine*"
          }
        }
      ],
      "must_not": [ ],
      "should": [ ]
    }
  },
  "from": 0,
  "size": 10,
  "sort": [ ],
  "aggs": { }
}
```

Sample Response
```
{
  "took": 524,
  "timed_out": false,
  "_shards": {
    "total": 5,
    "successful": 5,
    "failed": 0
  },
  "hits": {
    "total": 21,
    "max_score": 1,
    "hits": [
      {
        "_index": "sg_docs_book_chapters_b",
        "_type": "semantic-index",
        "_id": "http://www.springernature.com/scigraph/things/book-chapters/df0ae6345479b585137b4eb6d0d6fc8b",
        "_score": 1,
        "_source": {
          "book": {},
          "pageFirst": "276",
          "language": "En",
          "abstract": "Abstract A collaborative program of work was set up between STC Submarine Systems Ltd. (now part of the Northern Telecom group), and the School of Systems Engineering at Portsmouth Polytechnic. The aim of the work has been to establish methodologies (not necessarily new ones) which can be used to formalise methods of design, and to apply these to current design problems within the company. This also includes the representation of these methodologies through practical applications within an expert system tool. We also wish to show how formal techniques can be used to uncover areas of missing knowledge.",
          "title": "Representation of the design to manufacture methodology of the armour protection element of the fibre optic submarine cable within an expert system",
          "pageLast": "283",
          "contribution": [
            {
              "publishedName": "Darren Bayliss",
              "affiliation": {
                "publishedName": "STC Submarine Systems & Portsmouth Polytechnic"
              },
              "order": "1"
            },
            {
              "publishedName": "Sharon Berry",
              "affiliation": {
                "publishedName": "STC Submarine Systems & Portsmouth Polytechnic"
              },
              "order": "2"
            },
            {
              "publishedName": "David Curtis",
              "affiliation": {
                "publishedName": "STC Submarine Systems & Portsmouth Polytechnic"
              },
              "order": "3"
            },
            {
              "publishedName": "Bernard Cox",
              "affiliation": {
                "publishedName": "STC Submarine Systems & Portsmouth Polytechnic"
              },
              "order": "4"
            }
          ],
          "scigraphId": "df0ae6345479b585137b4eb6d0d6fc8b",
          "copyrightHolder": "Springer-Verlag",
          "copyrightYear": "1992",
          "_transaction_origin": 163070820,
          "_graphdb_id": 163070820,
          "ddsId": "Chap30",
          "doi": "10.1007/BFb0024979"
        }
      },
      ...
    ]
  }
}
```

See [chapterOnSubmarines-output.json](example-output/chapterOnSubmarines-output.json).

## Aggregating Articles By Journal

This query will list the top 20 journals (by article count) and the number of
journals in each.

### Elastic Search Query and Sample Response

Query articlesByJournal.json:
```
{
   "query": {
      "bool": {
         "must": [
            {
               "match_all": {}
            }
         ],
         "must_not": [],
         "should": []
      }
   },
   "from": 0,
   "size": 0,
   "sort": [],
   "aggs": {
       "JournalNames" : {
            "terms" : {
                "field" : "journalTitle"
            }
        }
   }
}
```

Sample Response
```
{
   "took": 257,
   "timed_out": false,
   "_shards": {
      "total": 5,
      "successful": 5,
      "failed": 0
   },
   "hits": {
      "total": 8808627,
      "max_score": 0,
      "hits": []
   },
   "aggregations": {
      "JournalNames": {
         "doc_count_error_upper_bound": 14425,
         "sum_other_doc_count": 5797283,
         "buckets": [
            {
               "key": "Nature",
               "doc_count": 389742
            },
            {
               "key": "Scientific American",
               "doc_count": 195125
            },
            {
               "key": "Reactions Weekly",
               "doc_count": 126541
            },
            {
               "key": "Analytical and Bioanalytical Chemistry",
               "doc_count": 98627
            },
            {
               "key": "Inpharma Weekly",
               "doc_count": 83708
            },
            {
               "key": "Pediatric Research",
               "doc_count": 42496
            },
            {
               "key": "Scientific Reports",
               "doc_count": 40873
            },
            {
               "key": "Journal of Molecular Medicine",
               "doc_count": 37116
            },
            {
               "key": "Journal of Materials Science",
               "doc_count": 35323
            },
            {
               "key": "Russian Chemical Bulletin",
               "doc_count": 35208
            }
         ]
      }
   }
}
```

See [articlesByJournal-output.json](example-output/articlesByJournal-output.json).

## Listing Recent Open Access Articles

This query will list the 10 most recent open-access articles.
We use a filter to restrict the articles, and a sort criterion to
list them in descending order of publication date.

### Elastic Search Query and Sample Response

Query recentOpenAccessArticles.json:
```
{
   "query": {
       "filtered": {
          "query": {
            "match_all" : {}
          },
          "filter": {
            "term": {
              "journalOpenAccess": "Fully Open Access"
            }
          }
       }
   },
   "from": 0,
   "size": 10,
   "sort": [
        {
            "publicationDate": {
                "order": "desc"
            }
        }
    ]
}
```

Sample Response
```
{
   "took": 733,
   "timed_out": false,
   "_shards": {
      "total": 5,
      "successful": 5,
      "failed": 0
   },
   "hits": {
      "total": 453419,
      "max_score": null,
      "hits": [
         {
            "_index": "sg_docs_articles_b",
            "_type": "semantic-index",
            "_id": "http://www.springernature.com/scigraph/things/articles/8df6d8e3399e3fff758736d3332b5d76",
            "_score": null,
            "_source": {
               "journalIssn": "2198-4093",
               "journalOpenAccess": "Fully Open Access",
               "journalId": "40730",
               "language": "English",
               "journalPublisher": "Laboratory of Stem Cell Research and Application",
               "abstract": "Abstract Introduction:Bone marrow derived MSCs (BM-MSCs) and adipose derived MSCs (AD-MSCs) are among the types of stem cells most commonly studied. Our study aims to compare the therapeutic efficacy of allograft AD-MSCs versus BM-MSCs in a mouse model of hindlimb ischemia. Methods:AD-MSCs were isolated from belly fat and BM-MSCs were isolated from femur bone marrow. They were used to treat mice with acute hindlimb ischemia. Treatment efficacy was compared among 4 groups: injected with BM-MSCs, injected with AD-MSCs, non-treated and injected with phosphate buffered saline. Mice in the groups were evaluated for the following: necrosis grade of leg, leg edema, blood flow, muscle cell restructure and new blood vessel formation. Results:Results showed that AD-MSC transplantation significantly recovered acute limb ischemia, with 76.5% of mice fully recovered, while the ratio was only 48.5% in BM-MSC transplanted group, and 0% in the non-treated and PBS groups. Evaluation of leg edema, blood flow, muscle cell restructure and new blood vessel formation also supported the observation that AD-MSC transplantation was superior over BM-MSC transplantation. Conclusion:Therefore, AD-MSCs may serve as the more suitable MSC for hindlimb ischemia treatment and angiogenesis therapy.",
               "title": "Adipose derived stem cell transplantation is better than bone marrow mesenchymal stem cell transplantation in treating hindlimb ischemia in mice",
               "contribution": [
                  {
                     "publishedName": "Ngoc Bich Vu",
                     "affiliation": {
                        "publishedName": "Vietnam National University"
                     },
                     "order": "1"
                  },
                  {
                     "publishedName": "Lan Thi Phi",
                     "affiliation": {
                        "publishedName": "Vietnam National University"
                     },
                     "order": "2"
                  },
                  {
                     "publishedName": "Thuy Thi-Thanh Dao",
                     "affiliation": {
                        "publishedName": "Vietnam National University"
                     },
                     "order": "3"
                  },
                  {
                     "publishedName": "Ha Thi-Ngan Le",
                     "affiliation": {
                        "publishedName": "Vietnam National University"
                     },
                     "order": "4"
                  },
                  {
                     "publishedName": "Van Thanh Ta",
                     "affiliation": {
                        "publishedName": "Hanoi Medical University"
                     },
                     "order": "5"
                  },
                  {
                     "publishedName": "Phuc Van Pham",
                     "affiliation": [
                        {
                           "publishedName": "Vietnam National University"
                        },
                        {
                           "publishedName": "Vietnam National University"
                        }
                     ],
                     "order": "6"
                  }
               ],
               "scigraphId": "8df6d8e3399e3fff758736d3332b5d76",
               "articleType": "OriginalPaper",
               "_chains": [
                  972255,
                  972252,
                  203994754,
                  203989869,
                  203989893
               ],
               "publicationYear": "2019",
               "_transaction_origin": 122829680,
               "fieldOfResearchCode": [
                  "CLINICAL SCIENCES",
                  "CARDIORESPIRATORY MEDICINE AND HAEMATOLOGY",
                  "MEDICAL AND HEALTH SCIENCES"
               ],
               "_graphdb_id": 122829680,
               "doiLink": "http://dx.doi.org/10.7603/s40730-016-0046-0",
               "publicationDate": "2019-09-29",
               "issnElectronic": "2198-4093",
               "journalTitle": "Biomedical Research and Therapy",
               "doi": "10.7603/s40730-016-0046-0"
            },
            "sort": [
               1569715200000
            ]
         },
        ...
      ]
   }
}
```

See [recentOpenAccessArticles-output.json](example-output/recentOpenAccessArticles-output.json).

## Using the Full Text index to query using a search term

This query will list the 10 most recent Nature articles
with the term 'artificial intelligence' in their abstract

### Elastic Search Query and Sample Response

Query queryFullText.json:
```
{
   "query": {
       "filtered": {
         "query": {
              "match_phrase": {
                 "abstract": "artificial intelligence"
              }
         },
         "filter": {
            "term": {
              "journalOpenAccess": "Fully Open Access"
            }
          }
       }
   },
   "from": 0,
   "size": 10,
   "sort": [
      {
         "publicationDate": {
            "order": "desc"
         }
      }
   ]
}
```

Sample Response
```
{
   "took": 418,
   "timed_out": false,
   "_shards": {
      "total": 5,
      "successful": 5,
      "failed": 0
   },
   "hits": {
      "total": 76,
      "max_score": null,
      "hits": [
         {
            "_index": "sg_docs_articles_b",
            "_type": "semantic-index",
            "_id": "http://www.springernature.com/scigraph/things/articles/fa931bd36a4e66111a3950b4aec27a66",
            "_score": null,
            "_source": {
               "journalIssn": "2197-3768",
               "journalOpenAccess": "Fully Open Access",
               "journalId": "40638",
               "language": "English",
               "journalPublisher": "Springer Berlin Heidelberg",
               "abstract": "Abstract Exploration in an unknown environment is an elemental application for mobile robots. In this paper, we outlined a reinforcement learning method aiming for solving the exploration problem in a corridor environment. The learning model took the depth image from an RGB-D sensor as the only input. The feature representation of the depth image was extracted through a pre-trained convolutional-neural-networks model. Based on the recent success of deep Q-network on artificial intelligence, the robot controller achieved the exploration and obstacle avoidance abilities in several different simulated environments. It is the first time that the reinforcement learning is used to build an exploration strategy for mobile robots through raw sensor information.",
               "title": "Mobile robots exploration through cnn-based reinforcement learning",
               "contribution": [
                  {
                     "publishedName": "Lei Tai",
                     "affiliation": {
                        "publishedName": "City University of Hong Kong"
                     },
                     "order": "1"
                  },
                  {
                     "publishedName": "Ming Liu",
                     "affiliation": [
                        {
                           "publishedName": "City University of Hong Kong"
                        },
                        {
                           "publishedName": "HKUST"
                        }
                     ],
                     "order": "2"
                  }
               ],
               "scigraphId": "fa931bd36a4e66111a3950b4aec27a66",
               "articleType": "OriginalPaper",
               "_chains": [
                  2777072,
                  203994698,
                  203994826,
                  203989963,
                  203989868,
                  2777069
               ],
               "publicationYear": "2016",
               "_transaction_origin": 3905417,
               "fieldOfResearchCode": [
                  "ARTIFICIAL INTELLIGENCE AND IMAGE PROCESSING",
                  "COGNITIVE SCIENCE",
                  "PSYCHOLOGY AND COGNITIVE SCIENCES",
                  "INFORMATION AND COMPUTING SCIENCES"
               ],
               "_graphdb_id": 3905417,
               "doiLink": "http://dx.doi.org/10.1186/s40638-016-0055-x",
               "publicationDate": "2016-12-21",
               "issnElectronic": "2197-3768",
               "journalTitle": "Robotics and Biomimetics",
               "doi": "10.1186/s40638-016-0055-x"
            },
            "sort": [
               1482278400000
            ]
         },
         ...
      ]
   }
}
```

See [queryFullText-output.json](example-output/queryFullText-output.json).