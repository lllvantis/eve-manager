package tk.vantis.model;

import java.time.LocalDateTime;

/**
 * BaseBean
 * Created by Vantis on 2016/3/25.
 */

abstract class BaseBean {
    private LocalDateTime created;
    private String creator;
    private LocalDateTime modified;
    private String modifier;

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
}
