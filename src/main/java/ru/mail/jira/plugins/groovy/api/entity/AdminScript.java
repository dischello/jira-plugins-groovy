package ru.mail.jira.plugins.groovy.api.entity;

import net.java.ao.OneToMany;
import net.java.ao.schema.NotNull;
import net.java.ao.schema.StringLength;

public interface AdminScript extends AbstractScript {
    @NotNull
    void setUuid(String uuid);
    String getUuid();

    @NotNull
    @StringLength(StringLength.UNLIMITED)
    void setScriptBody(String scriptBody);
    String getScriptBody();

    @StringLength(StringLength.UNLIMITED)
    void setParameters(String parameters);
    String getParameters();

    @OneToMany(reverse = "getScript")
    AdminScriptChangelog[] getChangelogs();
}
