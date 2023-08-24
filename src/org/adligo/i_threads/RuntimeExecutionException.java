package org.adligo.i_threads;



/**
 * This is a surrogate for the checked ExecutionException
 * that can be thrown by Functions (Consumers, Suppliers).
 *  
 * @author scott<br/><br/>
 *
 * <pre><code>
 *  ---------------- Apache ICENSE-2.0 --------------------------
 *
 * Copyright 2022 Adligo Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </code></pre>
 */
public class RuntimeExecutionException extends RuntimeException {
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private static String getMessage(Exception x) {
    //x.printStackTrace();
    String message = x.getMessage();
    if (message != null) {
      if ("<null>".equals(message)) {
        return " RuntimeExecutionException ";
      } else {
        return message;
      }
    } else {
      return " RuntimeExecutionException ";
    }
    
  }
  public RuntimeExecutionException(Exception x) {
    super(getMessage(x), x);
  }
  
}
