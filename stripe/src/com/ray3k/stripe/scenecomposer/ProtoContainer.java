/*******************************************************************************
 * MIT License
 *
 * Copyright (c) 2020 Raymond Buckley
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package com.ray3k.stripe.scenecomposer;

import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.utils.Align;

class ProtoContainer extends ProtoActor implements SimSingleChild {
    public String name;
    public int alignment = Align.center;
    public ProtoDrawable background;
    public boolean fillX;
    public boolean fillY;
    public float minWidth = -1;
    public float minHeight = -1;
    public float maxWidth = -1;
    public float maxHeight = -1;
    public float preferredWidth = -1;
    public float preferredHeight = -1;
    public float padLeft;
    public float padRight;
    public float padTop;
    public float padBottom;
    public ProtoActor child;
    public Touchable touchable = Touchable.enabled;
}
