import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.matsim.api.core.v01.Scenario;
import org.matsim.core.scenario.ScenarioUtils;
import org.matsim.api.core.v01.network.Network;
import org.matsim.api.core.v01.network.NetworkWriter;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.utils.geometry.CoordinateTransformation;
import org.matsim.core.utils.geometry.transformations.TransformationFactory;
import org.matsim.core.utils.io.OsmNetworkReader;
import org.xml.sax.SAXException;

/**
 * WARNING: This class uses methods and classes that are non-API. Result: This
 * class will very probably not work with future versions of matsim. Keep matsim
 * jar file & matsim libraries that work with this version if you want to be on
 * the safe side.
 */
@SuppressWarnings("deprecation")
public class Osm2matsim {
    public static final String UTM33N = 
    "PROJCS[\"WGS_1984_UTM_Zone_33N\",GEOGCS[\"GCS_WGS_1984\",DATUM[\"D_WGS_1984\",SPHEROID[\"WGS_1984\",6378137,298.257223563]],PRIMEM[\"Greenwich\",0],UNIT[\"Degree\",0.017453292519943295]],PROJECTION[\"Transverse_Mercator\"],PARAMETER[\"latitude_of_origin\",0],PARAMETER[\"central_meridian\",15],PARAMETER[\"scale_factor\",0.9996],PARAMETER[\"false_easting\",500000],PARAMETER[\"false_northing\",0],UNIT[\"Meter\",1]]";


    public static void main(String[] args) throws SAXException, 
    	ParserConfigurationException, IOException  {
        String osm = "C:\\Users\\ASUS\\Desktop\\ACADEMIC SEM 08\\FYP\\MATSim\\Osm2Matsim - Converter\\map.osm";
        Scenario scenario = ScenarioUtils.createScenario(ConfigUtils.createConfig()) ;
        Network network = scenario.getNetwork();
        CoordinateTransformation coordinatetransform = TransformationFactory
                .getCoordinateTransformation(TransformationFactory.WGS84,
                        TransformationFactory.WGS84_UTM35S);
        OsmNetworkReader osmnetreader = new OsmNetworkReader(network, coordinatetransform);
        osmnetreader.parse(osm);
        new NetworkWriter(network).write("C:\\Users\\ASUS\\Desktop\\ACADEMIC SEM 08\\FYP\\MATSim\\Osm2Matsim - Converter\\map.xml");


        // the remaining lines of code are necessary to create a ESRI shape file 
        //of the matsim network
          
//          sc.getConfig().global().setCoordinateSystem(UTM33N);
//          
//          FeatureGeneratorBuilder builder = new FeatureGeneratorBuilder(net);
//          builder.setWidthCoefficient(0.01);
//          builder.setFeatureGeneratorPrototype(PolygonFeatureGenerator.class);
//          builder
//          .setWidthCalculatorPrototype(CapacityBasedWidthCalculator.class); new
//          
//          Links2ESRIShape(net,"D:/mostafa/matsim-0.1.1/data/tools/osmosis-0.36/bin/merged-network.shp",builder).write();
//         
    }
}