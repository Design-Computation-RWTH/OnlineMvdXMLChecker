/*******************************************************************************
*                                                                              *
* This file is part of IfcOpenShell.                                           *
*                                                                              *
* IfcOpenShell is free software: you can redistribute it and/or modify         *
* it under the terms of the Lesser GNU General Public License as published by  *
* the Free Software Foundation, either version 3.0 of the License, or          *
* (at your option) any later version.                                          *
*                                                                              *
* IfcOpenShell is distributed in the hope that it will be useful,              *
* but WITHOUT ANY WARRANTY; without even the implied warranty of               *
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the                 *
* Lesser GNU General Public License for more details.                          *
*                                                                              *
* You should have received a copy of the Lesser GNU General Public License     *
* along with this program. If not, see <http://www.gnu.org/licenses/>.         *
*                                                                              *
********************************************************************************/

/*******************************************************************************
*                                                                              *
* This class communicates with the JNI wrapper of IfcOpenShell. Note that,     *
* contrary to the Bonsma IFC engine, if the wrapper crashes it will take the   *
* BIMserver down with her. Since loading the wrapper involves loading a        *
* considerable binary into memory, it would have been better to make the       *
* System.load() call somewhere in IfcOpenShellEngine.java.                     *
*                                                                              *
********************************************************************************/

package org.ifcopenshell;

import java.io.InputStream;
import java.util.HashMap;

import org.opensource_bimserver.v1_40.plugins.renderengine.RenderEngineException;
import org.opensource_bimserver.v1_40.plugins.renderengine.RenderEngineFilter;
import org.opensource_bimserver.v1_40.plugins.renderengine.RenderEngineInstance;
import org.opensource_bimserver.v1_40.plugins.renderengine.RenderEngineModel;
import org.opensource_bimserver.v1_40.plugins.renderengine.RenderEngineSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IfcOpenShellModel implements RenderEngineModel {
	private static final Logger LOGGER = LoggerFactory.getLogger(IfcOpenShellModel.class);
	
	private String filename;
	private InputStream ifcInputStream;

	private HashMap<Integer,IfcOpenShellEntityInstance> instancesById;
	
	public IfcOpenShellModel(String filename, InputStream ifcInputStream) throws RenderEngineException {
		this.filename = filename;
		this.ifcInputStream = ifcInputStream;
	}

	@Override
	public void close() throws RenderEngineException {
		if (instancesById != null) {
			instancesById.clear();
		}
	}

	@Override
	public void generateGeneralGeometry() throws RenderEngineException {
		// We keep track of instances ourselves
		instancesById = new HashMap<Integer,IfcOpenShellEntityInstance>();
		
		final double t0 = (double) System.nanoTime();
		System.out.println("Generate geom: filename: "+filename);

		try (IfcGeomServerClient client = new IfcGeomServerClient(filename, ifcInputStream)) {
			for (IfcGeomServerClientEntity e : client) {
				if (e == null) break;
				
				// Store the instance in our dictionary
				IfcOpenShellEntityInstance instance = new IfcOpenShellEntityInstance(e);
				instancesById.put(e.getId(), instance);
			}
		} catch (Exception e) {
		    e.printStackTrace();
		    LOGGER.error(IfcGeomServerClient.class.getName(), e);
		}
		
		final double t1 = (double) System.nanoTime();
		
		LOGGER.info(String.format("Took %.2f seconds to obtain representations for %d entities", (t1-t0) / 1.E9, instancesById.size()));
	}

	@Override
	public RenderEngineInstance getInstanceFromExpressId(int oid) throws RenderEngineException {
		if ( instancesById.containsKey(oid) ) {
			return instancesById.get(oid);
		} else{
			return null;
		}
	}
	
	@Override
	public void setFormat(int format, int mask) throws RenderEngineException {
	}

	@Override
	public void setSettings(RenderEngineSettings settings) throws RenderEngineException {
	}

	@Override
	public void setFilter(RenderEngineFilter arg0) throws RenderEngineException {
		// TODO Auto-generated method stub
		
	}

}
