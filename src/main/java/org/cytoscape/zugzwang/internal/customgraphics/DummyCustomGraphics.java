package org.cytoscape.zugzwang.internal.customgraphics;

/*
 * #%L
 * Cytoscape Ding View/Presentation Impl (ding-presentation-impl)
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2006 - 2013 The Cytoscape Consortium
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 2.1 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

import java.awt.Image;


@SuppressWarnings({ "unchecked", "rawtypes" })
public final class DummyCustomGraphics extends AbstractZZCustomGraphics {
	
	public DummyCustomGraphics(Long id, String displayName) {
		super(id, displayName);
	}

	@Override
	public Image getRenderedImage() {
		return NullCustomGraphics.DEF_IMAGE;
	}

	@Override
	public String toString() {
		return "DummyCustomGraphics (" + id + ") " + displayName;
	}

	@Override
	public String toSerializableString() {
		return makeSerializableString(displayName);
	}
}