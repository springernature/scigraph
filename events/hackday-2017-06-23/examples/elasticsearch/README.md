# Elasticsearch

The queries below can be executed against your Elasticsearch instance: `<your-vm-ip-address>:9200`.

## Articles with Contributions and Affiliations

To search for "Palaeozoic osteichthyan", run the following Elasticsearch query (see [articleContributionsAffiliationsJournal.json](example-output/articleContributionsAffiliationsJournal.json)):

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
````
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
````

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