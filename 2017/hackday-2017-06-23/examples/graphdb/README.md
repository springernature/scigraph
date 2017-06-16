# GraphDB

The queries below can be executed in your GraphDB Workbench: `<your-vm-ip-address>:7200/sparql`.

## 1. Article, Contribution and Affiliation Objects

* **Article Object:** To retrieve information about the article with DOI `10.1038/nature13195` and with term "Palaeozoic osteichthyan", see [get-article-by-doi.rq](get-article-by-doi.rq), and see [result-for-get-article-by-doi.ttl](result-for-get-article-by-doi.ttl) for the result in Turtle format.

* **Article, Contribution and Affiliation Objects:** To retrieve information about the associated contribution and affiliation objects (see [get-article-by-doi-with-contributions-affiliations.rq](get-article-by-doi-with-contributions-affiliations.rq)),
 and see [result-for-get-article-by-doi-with-contributions-affiliations.ttl](result-for-get-article-by-doi-with-contributions-affiliations.ttl) for the result in Turtle format.

## 2. Journal and JournalBrand Objects

* **Journal and JournalBrand Objects:** To retrieve information about a journal and journal brand object (see [get-journalbrand-by-title-with-journal.rq](get-journalbrand-by-title-with-journal.rq)),
 and see [result-for-get-journalbrand-by-title-with-journal.ttl](result-for-get-journalbrand-by-title-with-journal.ttl) for the result in Turtle format.

## 3. BookEdition, Book and BookChapter Objects

* **BookEdition and Book Objects:** To retrieve information about a book either by using the ISBN code or the title (see queries  [get-book-bookeditions-by-isbn.rq](get-book-bookeditions-by-isbn.rq), [get-book-bookeditions-by-title.rq](get-book-bookeditions-by-title.rq)),
  and see [result-for-get-book-bookeditions-by-isbn.ttl](result-for-get-book-bookeditions-by-isbn.ttl) for the result in Turtle format.

* **Book and BookChapter Objects:** To retrieve information about a book and included chapters (see queries  [get-book-chapters.rq](get-book-chapters.rq)),
    and see [result-for-get-book-chapters.ttl](result-for-get-book-chapters.ttl) for the result in Turtle format.

## 4. Grant Objects

* **Grant Objects:** retrieve information of a grant (see queries  [get-grant.rq](get-grant.rq)),
    and see [result-for-get-grant.ttl](result-for-get-grant.ttl) for the result in Turtle format.
