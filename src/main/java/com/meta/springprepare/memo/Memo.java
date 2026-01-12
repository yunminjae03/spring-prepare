package com.meta.springprepare.memo;

import java.util.Date;

import lombok.*;

@Getter
@Setter
//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor

public class Memo {
  private final String username;
  private String title;
  private String contents;
  private Date createAt;
  private Date updatedAT;

  public Memo(String username, Date updatedAT) {
    this.username = username;
    this.updatedAT = updatedAT;
  }

  public void writeMemo() {
  }

}
