# GraphDB

The queries below can be executed in your GraphDB Workbench: `<your-vm-ip-address>:7200/sparql`.

## 1. Article, Contribution and Affiliation Objects

* **Article Object:** To retrieve information about the article with DOI `10.1038/nature13195`, see [get-article-by-doi.rq](example-queries/get-article-by-doi.rq), and see [get-article-by-doi-result.ttl](example-results/get-article-by-doi-result.ttl) for the result in Turtle format.

* **Article, Contribution and Affiliation Objects:** To retrieve information about the associated contribution and affiliation objects (see [get-article-by-doi-with-contributions-affiliations.rq](example-queries/get-article-by-doi-with-contributions-affiliations.rq)),
 and see [get-article-by-doi-with-contributions-affiliations-result.ttl](example-results/get-article-by-doi-with-contributions-affiliations-result.ttl) for the result in Turtle format.

## 2. Journal and JournalBrand Objects

* **Journal and JournalBrand Objects:** To retrieve information about a journal and journal brand object (see [get-journal-brand-by-title-with-journal.rq](example-queries/get-journal-brand-by-title-with-journal.rq),
 and see [get-journal-brand-by-title-with-journal-result.ttl](example-results/get-journal-brand-by-title-with-journal-result.ttl) for the result in Turtle format.

## 3. BookEdition, Book and BookChapter Objects

* **BookEdition and Book Objects:** To retrieve information about a book using the ISBN, see [get-book-book-editions-by-isbn.rq](example-queries/get-book-by-isbn-with-book-edition.rq),
  and see [get-book-book-editions-by-isbn-result.ttl](example-results/get-book-by-isbn-with-book-edition-result.ttl) for the result in Turtle format.

* **Book and BookChapter Objects:** To retrieve information about a book and its chapters, see [get-book-chapters.rq](example-queries/get-book-by-isbn-with-book-chapters.rq),
    and see [get-book-chapters-result.ttl](example-results/get-book-by-isbn-with-book-chapters-result.ttl) for the result in Turtle format.

## 4. Grant Objects

* **Grant Object:** To retrieve information about a grant, see [get-grant.rq](example-queries/get-grant.rq),
    and see [get-grant-result.ttl](example-results/get-grant-result.ttl) for the result in Turtle format.
