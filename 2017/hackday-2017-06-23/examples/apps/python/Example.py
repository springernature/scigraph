#! /usr/bin/env python

# pip install python-pip
# pip install SPARQLWrapper

from rdflib import Graph, URIRef
from rdflib.plugins.stores import sparqlstore

endpoint = 'http://<IP>:7200/repositories/<REPOSITORY>'
store = sparqlstore.SPARQLStore()
store.open(endpoint)

graph_name_ref = URIRef(u'http://www.springernature.com/scigraph/graphs/articles.dds')
ng = Graph(store,identifier=graph_name_ref)
store.bind('sg', 'http://www.springernature.com/scigraph/ontologies/core/')


q = 'select ?s ?t  where { ?s a sg:Article . ?s sg:title ?t  } limit 10 '
print(q)

for s, o in ng.query(q):
    print 'article Id:' +s + '\t article Title:' +o

print('End')




