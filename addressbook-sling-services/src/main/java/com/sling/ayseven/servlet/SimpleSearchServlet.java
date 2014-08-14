package com.sling.ayseven.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sling.ayseven.services.search.SearchService;

/**
 * A Servlet example which calls the Search Service registered by path
 */
@Component
@Service(Servlet.class)
@Properties({ @Property(name="service.description", value="Search Service"),
    @Property(name="service.vendor", value="The Apache Software Foundation"),
    @Property(name="sling.servlet.paths", value="/contactsearch")
})
public class SimpleSearchServlet extends SlingSafeMethodsServlet {
    
    private final Logger log = LoggerFactory.getLogger(SimpleSearchServlet.class);

    @Reference
    private SearchService searchService;
    
    @Override
    protected void doGet(SlingHttpServletRequest request,
            SlingHttpServletResponse response) throws ServletException,
            IOException {
        
    	log.info("doGet");
    	final String query = request.getParameter("q");
    	log.debug("query: {}", query);
    	
    	final List<String> result = this.searchService.search(request.getResourceResolver(), query);
    	
    	for (String path : result) response.getWriter().write(path + "\n");
    }

}