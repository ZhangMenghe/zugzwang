package org.cytoscape.zugzwang.internal.customgraphics.charts.line;

import java.util.Map;

import javax.swing.Icon;
import javax.swing.JComponent;

import org.cytoscape.application.CyApplicationManager;
import org.cytoscape.util.swing.IconManager;
import org.cytoscape.view.presentation.customgraphics.CyCustomGraphics2;
import org.cytoscape.view.presentation.customgraphics.CyCustomGraphics2Factory;
import org.cytoscape.view.presentation.property.values.CyColumnIdentifierFactory;
import org.cytoscape.zugzwang.internal.customgraphics.charts.ViewUtils;

public class LineChartFactory implements CyCustomGraphics2Factory<LineLayer> {
	
	private final CyApplicationManager appMgr;
	private final IconManager iconMgr;
	private final CyColumnIdentifierFactory colIdFactory;
	
	public LineChartFactory(final CyApplicationManager appMgr, final IconManager iconMgr,
			final CyColumnIdentifierFactory colIdFactory) {
		this.appMgr = appMgr;
		this.iconMgr = iconMgr;
		this.colIdFactory = colIdFactory;
	}
	
	@Override
	public CyCustomGraphics2<LineLayer> getInstance(final String input) {
		return new LineChart(input, colIdFactory);
	}

	@Override
	public CyCustomGraphics2<LineLayer> getInstance(final CyCustomGraphics2<LineLayer> chart) {
		return new LineChart((LineChart)chart, colIdFactory);
	}
	
	@Override
	public CyCustomGraphics2<LineLayer> getInstance(final Map<String, Object> properties) {
		return new LineChart(properties, colIdFactory);
	}

	@Override
	public String getId() {
		return LineChart.FACTORY_ID;
	}
	
	@Override
	public Class<? extends CyCustomGraphics2<LineLayer>> getSupportedClass() {
		return LineChart.class;
	}

	@Override
	public String getDisplayName() {
		return "Line";
	}
	
	@Override
	public Icon getIcon(int width, int height) {
		return ViewUtils.resizeIcon(LineChart.ICON, width, height);
	}
	
	@Override
	public JComponent createEditor(final CyCustomGraphics2<LineLayer> chart) {
		return new LineChartEditor((LineChart)chart, appMgr, iconMgr, colIdFactory);
	}
	
	@Override
	public String toString() {
		return getDisplayName();
	}
}
