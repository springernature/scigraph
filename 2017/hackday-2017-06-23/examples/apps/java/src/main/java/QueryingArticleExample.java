import org.eclipse.rdf4j.model.Value;
import org.eclipse.rdf4j.query.BindingSet;
import org.eclipse.rdf4j.query.QueryLanguage;
import org.eclipse.rdf4j.query.TupleQuery;
import org.eclipse.rdf4j.query.TupleQueryResult;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.sparql.SPARQLRepository;

public class QueryingArticleExample {
    public static void main(String[] args) {
        String sparqlEndpoint = "http://<IP>:7200/repositories/<REPOSITORY>"; // fill IP and REPOSITORY
        Repository repo = new SPARQLRepository(sparqlEndpoint);
        repo.initialize();
        try (RepositoryConnection con = repo.getConnection()) {
            String queryString = "\n" +
                    "PREFIX sg: <http://www.springernature.com/scigraph/ontologies/core/>\n" +
                    "select ?s ?t where { \n" +
                    "\t?s a sg:Article .\n" +
                    "    ?s sg:title ?t\n" +
                    "} limit 10 \n";
            TupleQuery tupleQuery = con.prepareTupleQuery(QueryLanguage.SPARQL, queryString);
            try (TupleQueryResult result = tupleQuery.evaluate()) {
                while (result.hasNext()) {
                    BindingSet bindingSet = result.next();
                    Value articleId = bindingSet.getValue("s");
                    Value articleTitle = bindingSet.getValue("t");
                    System.out.print("s: "+articleId);
                    System.out.println("\t t: "+articleTitle);
                }
            }
        }
    }
}