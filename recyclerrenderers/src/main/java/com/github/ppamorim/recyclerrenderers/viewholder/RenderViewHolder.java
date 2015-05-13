/*
* Copyright (C) 2014 Alejandro Rodriguez Salamanca.
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
package com.github.ppamorim.recyclerrenderers.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.github.ppamorim.recyclerrenderers.interfaces.Renderable;

public abstract class RenderViewHolder<R extends Renderable> extends RecyclerView.ViewHolder {

  private final Context context;
  private R item;

  public RenderViewHolder(View itemView) {
    super(itemView);
    this.context = itemView.getContext();
  }

  public Context getContext() {
    return context;
  }

  public void setItem(R item) {
    this.item = item;
  }

  public R getItem() {
    return item;
  }

  public void onViewRecycled() { }

  public void onViewAttachedToWindow() { }

  public void onViewDetachedFromWindow() { }

  public abstract void onBindView(R item);

}
