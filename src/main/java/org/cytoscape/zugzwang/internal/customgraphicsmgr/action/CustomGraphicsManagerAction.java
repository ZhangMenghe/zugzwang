package org.cytoscape.zugzwang.internal.customgraphicsmgr.action;

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


import java.awt.event.ActionEvent;

import org.cytoscape.application.swing.AbstractCyAction;
import org.cytoscape.service.util.CyServiceRegistrar;
import org.cytoscape.zugzwang.internal.customgraphics.CustomGraphicsManager;
import org.cytoscape.zugzwang.internal.customgraphicsmgr.ui.CustomGraphicsBrowser;
import org.cytoscape.zugzwang.internal.customgraphicsmgr.ui.CustomGraphicsManagerDialog;


public class CustomGraphicsManagerAction extends AbstractCyAction 
{	
	private static final long serialVersionUID = -4582671383878015609L;
	
	private final CustomGraphicsManager cgManager;
	private final CustomGraphicsBrowser browser;
	private final CyServiceRegistrar serviceRegistrar;

	public CustomGraphicsManagerAction(final CustomGraphicsManager cgManager,
								       final CustomGraphicsBrowser browser,
								       final CyServiceRegistrar serviceRegistrar)
	{
		super("Open Image Manager...");
		setPreferredMenu("View");
		setMenuGravity(10.0f);
		
		this.cgManager = cgManager;
		this.browser = browser;
		this.serviceRegistrar = serviceRegistrar;
	}

	@Override
	public void actionPerformed(ActionEvent evt) 
	{
		final CustomGraphicsManagerDialog dialog = new CustomGraphicsManagerDialog(cgManager, browser, serviceRegistrar);
		dialog.setVisible(true);
	}
}
