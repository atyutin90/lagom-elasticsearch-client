package org.taymyr.lagom.elasticsearch.search.dsl

import org.taymyr.lagom.elasticsearch.search.dsl.query.Query
import org.taymyr.lagom.elasticsearch.search.dsl.query.aggregation.Aggregation

/**
 * See [Elasticsearch Docs](https://www.elastic.co/guide/en/elasticsearch/reference/current/search-request-body.html)
 *
 * @param aggs See [Elasticsearch Docs](https://www.elastic.co/guide/en/elasticsearch/reference/current/search-aggregations.html)
 */
data class SearchRequest(
    val query: Query,
    val from: Int? = null,
    val size: Int? = null,
    val aggs: Map<String, Aggregation>? = null
)