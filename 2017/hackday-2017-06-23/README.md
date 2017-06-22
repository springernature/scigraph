# SciGraph Hack Day (23rd June 2017)

## Quick Start

1. Ask the organisers for the IP address of your VM
1. Append a **port number** to the IP address (see the next section) to access a data source 

#### Accessing the Databases

* GraphDB: `http://<your-vm-ip-address>:7200`
* Elasticsearch: `http://<your-vm-ip-address>:9200/_plugin/head`
* Kibana: `http://<your-vm-ip-address>:5601`

#### Advanced: Logging in to your VM

This won't be necessary in most cases, but if you know what you're doing here's the details:

1. Ask the organisers for the IP address of your VM
1. Download the [RSA private key](https://drive.google.com/open?id=0BxTNjwMyIXOoclE2VHdhaWtyLXM)
1. Fix permissions: `chmod 400 ./Downloads/scigraph.env`
1. Log in: `ssh -i scigraph.env ubuntu@<your-vm-ip-address>`
 

## Documentation 

Please use the following links to get started with the SciGraph data.

#### Data model

* [Datasets](https://github.com/springernature/scigraph/tree/master/2017/hackday-2017-06-23/datasets)
* [Classes & Properties](http://ontologies.scigraph.com/#core)
* [Querying GraphDB: SPARQL documentation](https://www.w3.org/TR/rdf-sparql-query) 
* [Querying Elasticsearch: API documentation](https://www.elastic.co/guide/en/elasticsearch/reference/2.4/query-dsl.html) 

#### Code Examples

* [GraphDB](examples/graphdb)
* [Elasticsearch](examples/elasticsearch)
* [Kibana](examples/kibana)
* [Sample Apps](examples/apps)

## Hacking Ideas 

Here are some general themes to consider:

* *Data Visualization*: Develop insightful dashboards on top of our data, e.g. visually appealing journal or institutional pages
* *Information Retrieval*: Text data mine our abstracts and grants description texts to better understand what the content is really about by extracting contained facts
* *Linked Data Browsing*: develop an intuitive and innovative approach to simply browse our linked data offering, making it easy and fun to explore -rather than to search- on top of linked data
* *Predictive Analytics*: train a model using SciGraph data, e.g. funding patterns, to be able to predict the future for an institute or a journal based on their past - the data is there!

*Note:* More specific ideas around these themes can be found (and edited) using this [Google doc](https://docs.google.com/document/d/1LFiM2V-nX0lMqGgnfekaPwGQ4b7tYMi7CcFFFyyPESc/edit?usp=sharing). 


## Comms Channels

Come talk to us if you get stuck. Alternatively, you can use one of the following channels:

* Twitter: please use the hashtag [\#SN_HackDay](https://twitter.com/hashtag/SN_HackDay)
* [Slack](https://sn-hackday.slack.com)
* If you want to share your code then please ask the organisers to invite you to [SN-HackDay](https://github.com/SN-HackDay) on GitHub

## Disclaimer

Just a reminder - all of the data accessible on the hack day is available under a *CC-BY-NC license*, so feel free to use it for research and experimentation but not for commercial purposes. 
