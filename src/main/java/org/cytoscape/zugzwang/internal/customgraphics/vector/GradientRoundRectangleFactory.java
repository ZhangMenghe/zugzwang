package org.cytoscape.zugzwang.internal.customgraphics.vector;

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

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.cytoscape.view.presentation.customgraphics.CyCustomGraphics;
import org.cytoscape.view.presentation.customgraphics.CyCustomGraphicsFactory;
import org.cytoscape.zugzwang.internal.customgraphics.CustomGraphicsManager;

/**
 * Create instance of a GradientOvalLayer
 * 
 */
public class GradientRoundRectangleFactory implements CyCustomGraphicsFactory {

	private static final Class<? extends CyCustomGraphics> TARGET_CLASS = GradientRoundRectangleLayer.class;
	private String entry[];

	private final CustomGraphicsManager manager;
	
	public GradientRoundRectangleFactory(final CustomGraphicsManager manager) {
		this.manager = manager;
	}

	public String getPrefix() { return "rectanglegradient"; }
	public boolean supportsMime(String mimeType) { return false; }
	
	/**
	 * Generate Custom Graphics object from a string.
	 */
	public CyCustomGraphics parseSerializableString(String entryStr) {
		String[] entry = entryStr.split(",");
		if (entry == null || entry.length < 2) {
			return null;
		}
		return new GradientRoundRectangleLayer(Long.parseLong(entry[0]));
	}

	public CyCustomGraphics getInstance(String input) {
		return new GradientRoundRectangleLayer(manager.getNextAvailableID());
	}

	public CyCustomGraphics getInstance(URL input) { return null; }

	public Class<? extends CyCustomGraphics> getSupportedClass() { return TARGET_CLASS; }

}
