

package com.meta.springprepare.memo;

import java.util.Date;
import lombok.Generated;

public class Memo {
  private String username;
  private String title;
  private String contents;
  private Date createAt;
  private Date updatedAT;

  public void writeMemo() {
  }

  @Generated
  public String getUsername() {
    return this.username;
  }

  @Generated
  public String getTitle() {
    return this.title;
  }

  @Generated
  public String getContents() {
    return this.contents;
  }

  @Generated
  public Date getCreateAt() {
    return this.createAt;
  }

  @Generated
  public Date getUpdatedAT() {
    return this.updatedAT;
  }

  @Generated
  public void setUsername(final String username) {
    this.username = username;
  }

  @Generated
  public void setTitle(final String title) {
    this.title = title;
  }

  @Generated
  public void setContents(final String contents) {
    this.contents = contents;
  }

  @Generated
  public void setCreateAt(final Date createAt) {
    this.createAt = createAt;
  }

  @Generated
  public void setUpdatedAT(final Date updatedAT) {
    this.updatedAT = updatedAT;
  }
}
