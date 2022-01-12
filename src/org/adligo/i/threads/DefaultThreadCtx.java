package org.adligo.i.threads;

/**
 * This interface contains the default implementation of {@link I_ThreadCtx}<br/>
 *  <br/>
 * @author scott<br/>
 * <br/>
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
 * @author scott
 * @see I_ThreadCtx
 */
public interface DefaultThreadCtx extends I_ThreadCtx {

  @Override
  default Thread newThread() {
    return new Thread();
  }

  @Override
  default void toggleInterruptFlag() {
    Thread.currentThread().interrupt();
  }
}
