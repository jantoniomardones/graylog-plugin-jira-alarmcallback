package com.acmecorp;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

/**
 * Implement the PluginMetaData interface here.
 */
public class JiraAlarmCallbackMetaData implements PluginMetaData {
    private static final String PLUGIN_PROPERTIES = "com.acmecorp.graylog-plugin-jira-alarmcallback/graylog-plugin.properties";

    @Override
    public String getUniqueId() {
        return "com.acmecorp.JiraAlarmCallbackPlugin";
    }

    @Override
    public String getName() {
        return "JiraAlarmCallback";
    }

    @Override
    public String getAuthor() {
        return "jose <jose.mardones@ngtsec.com>";
    }

    @Override
    public URI getURL() {
        return URI.create("https://github.com/jose_mardones");
    }

    @Override
    public Version getVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "version", Version.from(0, 0, 0, "unknown"));
    }

    @Override
    public String getDescription() {
        // TODO Insert correct plugin description
        return "Description of JiraAlarmCallback plugin";
    }

    @Override
    public Version getRequiredVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "graylog.version", Version.from(0, 0, 0, "unknown"));
    }

    @Override
    public Set<ServerStatus.Capability> getRequiredCapabilities() {
        return Collections.emptySet();
    }
}
