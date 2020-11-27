package com.waseem.demo.masermodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author waseem.khan since 27/11/20.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class LogEvent implements Serializable {

  private static final long serialVersionUID = -4366793772706162934L;

  private LogLevelDetail logLevelDetail;
  private Date timeStamp;
  private String data;
}
