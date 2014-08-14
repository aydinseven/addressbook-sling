package com.sling.ayseven.services.search.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;

import com.sling.ayseven.services.search.SearchService;

@Component
@Service
public class SearchServiceImpl implements SearchService {

	public List<String> search(ResourceResolver resourceResolver, final String query) {
		
		final List<String> result = new ArrayList<String>();
		
		if (null == query || 0 == query.length()) return result;
		
		final Resource contactsResource = resourceResolver.getResource("/addressbookdata/contacts");
		final Iterator<Resource> iterator = contactsResource.listChildren();
		while (iterator.hasNext()) {
			final Resource contactResource = iterator.next();
			if (contactResource.getName().toLowerCase().contains(query.toLowerCase())) {
				result.add(contactResource.getPath());
			} else {
				// check also ValueMap via contactResource.adaptTo(ValueMap.class)
			}
		}
		return result;
	}

}