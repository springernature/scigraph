# SciGraph Hack Day (23rd June 2017)

## Data model

* [Datasets](https://github.com/springernature/scigraph/tree/master/events/hackday-2017-06-23/datasets)
* [Classes & Properties](http://ontologies.scigraph.com/core/v1.0.0/dendogram/index.html)
* [Querying GraphDB](https://www.w3.org/TR/rdf-sparql-query) 
* [Querying Elasticsearch](https://www.elastic.co/guide/en/elasticsearch/reference/2.4/query-dsl.html) 

## Quick Start

1. Ask the organisers for the IP address of your VM
1. Append a port number to the IP address (see the next section) to access a data source 

## Data Services and Ports

* GraphDB: `http://<your-vm-ip-address>:7200`
* Elasticsearch: `http://<your-vm-ip-address>:9200/_plugin/head`
* Kibana: `http://<your-vm-ip-address>:5601`

## Advanced: Logging in to your VM

1. Ask the organisers for the IP address of your VM
1. Download the [RSA private key](https://drive.google.com/open?id=0BxTNjwMyIXOoclE2VHdhaWtyLXM)
1. Fix permissions: `chmod 400 ./Downloads/scigraph.env`
1. Log in: `ssh -i scigraph.env ubuntu@<your-vm-ip-address>`
 
If you need to, you can start and stop these as follows (note: you must be logged in first, see below for more info):

* `sudo /etc/init.d/graphdb-service start|stop`
* `sudo /etc/init.d/elasticsearch start|stop`
* `sudo /etc/init.d/kibana start|stop`

## Code Examples

* [GraphDB](examples/graphdb)
* [Elasticsearch](examples/elasticsearch)
* [Kibana](examples/kibana)
* [Sample Apps](examples/apps)

## Comms Channels

* Twitter: please use the hashtag [\#sn-scigraph](https://twitter.com/hashtag/sn-scigraph)
* [Slack](https://sn-hackday.slack.com)
* If you want to share your code then please ask the organisers to invite you to [SN-HackDay](https://github.com/SN-HackDay) on GitHub
