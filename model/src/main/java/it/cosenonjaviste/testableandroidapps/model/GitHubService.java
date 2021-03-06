package it.cosenonjaviste.testableandroidapps.model;

import retrofit.http.GET;
import retrofit.http.Query;

public interface GitHubService {
    @GET("/search/repositories") RepoResponse listRepos(@Query("q") String query);
}