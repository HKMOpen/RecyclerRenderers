/*
* Copyright (C) 2015 Pedro Paulo de Amorim.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.github.ppamorim.sample.domain.model;

import com.github.ppamorim.recyclerrenderers.interfaces.Renderable;
import com.github.ppamorim.sample.R;

public class Console implements Renderable {

  private String name;
  private String imageUrl;

  public Console(String name, String imageUrl) {
    this.name = name;
    this.imageUrl = imageUrl;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  @Override public int getRenderableResourceId(int position) {
    switch (position % 2) {
      case 0:
        return R.layout.adapter_console;
      default:
        return R.layout.adapter_console_alternative;
    }
  }

}
