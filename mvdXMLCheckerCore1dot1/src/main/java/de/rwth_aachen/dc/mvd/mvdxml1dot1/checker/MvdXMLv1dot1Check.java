package de.rwth_aachen.dc.mvd.mvdxml1dot1.checker;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.bimserver.emf.IfcModelInterface;
import org.bimserver.plugins.deserializers.DeserializeException;

import de.rwth_aachen.dc.ifc.IfcModelInstance;
import de.rwth_aachen.dc.mvd.IssueReport;
import de.rwth_aachen.dc.mvd.beans.IssueBean;
import nl.tue.ddss.mvdxml1dot1.ifc_check.IfcMVDConstraintChecker;

public class MvdXMLv1dot1Check {

    public static IssueReport check(Path ifcFile, String mvdXMLFile) throws JAXBException, DeserializeException, IOException, URISyntaxException, org.opensource_bimserver.v1_40.plugins.renderengine.RenderEngineException {
	MvdXMLValidationRules mvdXML = new MvdXMLValidationRules(mvdXMLFile);

	IfcModelInstance model = new IfcModelInstance();
	IfcModelInterface bimserver_ifcModel = model.readModel(ifcFile, Paths.get("."));
	bimserver_ifcModel.fixInverseMismatches();
	List<MVDConstraint> constraints = mvdXML.getMVDConstraints();

	if (model.getIfcversion().isPresent()) {
	    IfcMVDConstraintChecker ifcChecker = new IfcMVDConstraintChecker(constraints, model.getIfcversion().get());
	    IssueReport issuereport = ifcChecker.checkModel(bimserver_ifcModel, ifcFile.toFile());
	    return issuereport;
	}

	return null;
    }

    public static List<IssueBean> checkModel4Web(Path ifcFile, String mvdXMLFile) throws JAXBException, DeserializeException, IOException, URISyntaxException, org.opensource_bimserver.v1_40.plugins.renderengine.RenderEngineException {
	List<IssueBean> issues = new ArrayList<>();
	MvdXMLValidationRules mvdXML = new MvdXMLValidationRules(mvdXMLFile);

	IfcModelInstance model = new IfcModelInstance();
	IfcModelInterface bimserver_ifcModel = model.readModel(ifcFile, Paths.get("."));
	bimserver_ifcModel.fixInverseMismatches();
	List<MVDConstraint> constraints = mvdXML.getMVDConstraints();

	if (model.getIfcversion().isPresent()) {
	    IfcMVDConstraintChecker ifcChecker = new IfcMVDConstraintChecker(constraints, model.getIfcversion().get());
	    IssueReport issuereport = ifcChecker.checkModel(bimserver_ifcModel, ifcFile.toFile());
	    issues.addAll(issuereport.getIssues());
	}

	return issues;
    }
}
