package com.api.eletronx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class SitemapController {

    @GetMapping(value = "/sitemap.xml", produces = MediaType.APPLICATION_XML_VALUE)
    public String getSitemap() {
        return """
                <?xml version="1.0" encoding="UTF-8"?>
                <urlset xmlns="http://www.sitemaps.org/schemas/sitemap/0.9">
                    <url>
                        <loc>https://eletronx.com/</loc>
                        <lastmod>2025-05-23</lastmod>
                        <changefreq>weekly</changefreq>
                        <priority>1.0</priority>
                    </url>
                    <url>
                        <loc>https://eletronx.com/apresentacao</loc>
                        <lastmod>2025-05-23</lastmod>
                        <changefreq>monthly</changefreq>
                        <priority>0.8</priority>
                    </url>
                    <url>
                        <loc>https://eletronx.com/produtos</loc>
                        <lastmod>2025-05-23</lastmod>
                        <changefreq>weekly</changefreq>
                        <priority>0.9</priority>
                    </url>
                    <url>
                        <loc>https://eletronx.com/termos</loc>
                        <lastmod>2025-05-23</lastmod>
                        <changefreq>yearly</changefreq>
                        <priority>0.4</priority>
                    </url>
                </urlset>
                """;
    }
}