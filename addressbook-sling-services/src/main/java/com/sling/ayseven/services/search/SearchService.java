package com.sling.ayseven.services.search;

import java.util.List;

import org.apache.sling.api.resource.ResourceResolver;

public interface SearchService {

	List<String> search(ResourceResolver resourceResolver, String query);
}
