package com.droidcba.keddit.api

import retrofit2.Call

/**
 * News API
 *
 * @author juancho.
 */
interface NewsAPI {
    fun getNews(after: String, limit: String): Call<RedditNewsResponse>
}