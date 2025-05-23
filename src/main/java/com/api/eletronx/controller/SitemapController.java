package com.api.eletronx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SitemapController {

    @GetMapping(value = "/sitemap.xml", produces = "application/xml")
    public String sitemap() {
        return """
                <?xml version="1.0" encoding="UTF-8"?>
                <urlset xmlns="http://www.sitemaps.org/schemas/sitemap/0.9">
                    <url>
                        <loc>https://eletronx.com/</loc>
                        <changefreq>weekly</changefreq>
                        <priority>1.0</priority>
                    </url>
                    <url>
                        <loc>https://eletronx.com/contato</loc>
                        <changefreq>monthly</changefreq>
                        <priority>0.8</priority>
                    </url>
                </urlset>
                """;
    }
}