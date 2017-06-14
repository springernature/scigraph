# SciGraph Hack Day (23rd June 2017)

## Data model

* [Documentation](https://github.com/springernature/knowledge-graph/wiki) 
* [Data Model](https://github.com/springernature/knowledge-graph/wiki/Data:-Data-Model)
* [Classes & Properties](http://ontologies.scigraph.com/core/v1.0.0/dendogram/index.htm)
* [Querying GraphDB](https://www.w3.org/TR/rdf-sparql-query) 

## Logging in to your VM

1. Ask the organisers for the IP address of your VM
1. Download the [RSA private key](https://drive.google.com/open?id=0BxTNjwMyIXOoclE2VHdhaWtyLXM)
1. Fix permissions: `chmod 400 ./Downloads/scigraph.pem.env`
1. Log in: `ssh -i scigraph.pem.env ubuntu@<your-vm-ip-address>`

## What's running

* GraphDB: `http://<your-vm-ip-address>:7200`
* Elasticsearch: `http://<your-vm-ip-address>:9200/_plugin/head`
* Kibana: `http://<your-vm-ip-address>:5601`
 
If you need to, you can start and stop these as follows:

* `sudo /etc/init.d/graphdb-service start|stop`
* `sudo /etc/init.d/elasticsearch start|stop`
* `sudo /etc/init.d/kibana start|stop`

## Examples

* [GraphDB](examples/graphdb)
* [Elasticsearch](examples/elasticsearch)
* [Kibana](examples/kibana)

## Comms Channels

* Twitter: please use the hashtag [\#sn-scigraph](https://twitter.com/hashtag/sn-scigraph).
* [Slack?]
