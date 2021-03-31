import com.mongodb.*;
import com.mongodb.client.*;
import java.net.UnknownHostException;
import org.bson.Document;
import javax.print.Doc;
import org.bson.types.ObjectId;

public class DatabaseInterface {

    public static ConnectionString connString = new ConnectionString(
        "mongodb+srv://test-user-01:testPass01@mediform-cluster-1.t6zjg.mongodb.net/test?authSource=admin&replicaSet=atlas-2ds9so-shard-0&readPreference=primary&appname=MongoDB%20Compass&ssl=true"
        );
    public static MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connString)
        .retryWrites(true)
        .build();
    public static MongoClient mongoClient = MongoClients.create(settings);

    public static MongoDatabase database = mongoClient.getDatabase("MediForm");
    public static MongoCollection<Document> collectionUser = database.getCollection("user");
    public static MongoCollection<Document> collectionPatient = database.getCollection("patient");

    public static void main(String[] args) throws UnknownHostException{
        Document testDoc = new Document("_id", new ObjectId());
        Document testDoc2 = new Document();
        testDoc.append("field1", testDoc2.append("field2", "value"));
        collectionUser.insertOne(testDoc);
    }

    public static void findUser(User user) {

    }

    public static void savePatient(Patient patient) {
        Document patientDocument = new Document("_id", new ObjectId());
        Document regForm = new Document();
        regForm.append("name", patient.getName())
            .append("address", patient.getAddress())
            .append("phone", patient.getPhone())
            .append("dataOfBirth", patient.getDateOfBirth())
            .append("emergencyContactName", patient.getEmergencyContactName())
            .append("emergencyContactNumber", patient.getEmergencyContactNumber())
            .append("insurance", patient.getInsurance())
            .append("insuranceProvider", patient.getInsuranceProvider())
            .append("insuranceID", patient.getInsuranceID())
            .append("primaryPhysician", patient.getPrimaryPhysician())
            .append("currentMedication", patient.getCurrentMedication())
            .append("medicationName", patient.getMedicationName())
            .append("medicalHistory", patient.getMedicalHistory())
            .append("symptoms", patient.getSymptoms())
            .append("dateOfVisit", patient.getDateOfVisit());

        Document medication = new Document();
        medication.append("pain", patient.getPain())
            .append("anticoagulant", patient.getAnticoagulant())
            .append("antiretroviral", patient.getAntiretroviral())
            .append("betaBlocker", patient.getBetaBlocker())
            .append("insulin", patient.getInsulin())
            .append("antiInflammatory", patient.getAntiInflammatory())
            .append("ursodiol", patient.getUrsodiol())
            .append("calciumReducer", patient.getCalciumReducer());

        Document test = new Document();
        test.append("nucleicAcid", patient.getNucleicAcid())
            .append("coagulationPanel", patient.getCoagulationPanel())
            .append("dheaSulfateSerum", patient.getDheaSulfateSerum())
            .append("cReactiveProtein", patient.getcReactiveProtein())
            .append("alc", patient.getAlc())
            .append("xray", patient.getXray())
            .append("ctScan", patient.getCtScan())
            .append("mri", patient.getMri())
            .append("urinalysis", patient.getUrinalysis())
            .append("stoolCultures", patient.getStoolCultures());

        Document diagnosis = new Document();
        diagnosis.append("brokenBone", patient.getBrokenBone())
            .append("heartAttack", patient.getHeartAttack())
            .append("laceration", patient.getLaceration())
            .append("hivAIDS", patient.getHivAIDS())
            .append("liverFailure", patient.getLiverFailure())
            .append("kidneyFailure", patient.getKidneyFailure())
            .append("diabetes", patient.getDiabetes())
            .append("IBD", patient.getInfammatoryBowlDisease())
            .append("stroke", patient.getStroke())
            .append("tornMuscleTendon", patient.getTornMuscleTendon());

        Document medForm = new Document();
        medForm.append("height", patient.getHeight())
            .append("height", patient.getHeight())
            .append("weight", patient.getWeight())
            .append("temperature", patient.getTemperature())
            .append("bloodPressure", patient.getBloodPressure())
            .append("pulseRate", patient.getPulseRate())
            .append("assignedPhysician", patient.getAssignedPhysician())
            .append("isAdmit", patient.getAdmit())
            .append("medication", medication)
            .append("test", test)
            .append("diagnosis", diagnosis);

        Document notes = new Document();

        patientDocument.append("patientID", patient.getPatientID());
        patientDocument.append("regForm", regForm);
        patientDocument.append("medForm", medForm);
        patientDocument.append("notes", notes);
    }

    public static void findPatient(){
        
    }
}
