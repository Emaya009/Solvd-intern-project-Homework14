package pharmacy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pharmacy.DAOimpl.AddressesDAOImpl;
import pharmacy.DAOimpl.CustomerDAOImpl;
import pharmacy.DAOimpl.DoctorsDAOImpl;
import pharmacy.DAOimpl.GenericDAOImpl;
import pharmacy.InterfacesDAo.AddressDAO;
import pharmacy.InterfacesDAo.CustomerDAO;
import pharmacy.InterfacesDAo.DoctorsDAO;
import pharmacy.Services.ManufacturersService;
import pharmacy.model.Addresses;
import pharmacy.model.Customers;
import pharmacy.model.Doctors;
import pharmacy.model.Manufacturers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    private static final Logger logger = LogManager.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) throws SQLException {

        try (Connection connection = (Connection) DatabaseConnection.getConnection()) {
            //Addresses Table Insert,getAll,delete,get record based on address_id,update queries execution
            AddressDAO addressDAO = new AddressesDAOImpl(connection);
           Addresses newAddress = new Addresses(334, "40 Avalene pkway", "Georgia", "Atlanta", "United States");
           addressDAO.saveAddress(newAddress);
            logger.info("New address added successfully");
            logger.info("Print details of all the address from the table");
            List<Addresses> addressesList = addressDAO.getAllAddress();
            addressesList.forEach(System.out::println);
            addressDAO.deleteAddress(60);
            logger.info("Address deleted successfully");
            logger.info("Address detail for the address_id entered is: " + addressDAO.getAddress(334));

          /*  Optional<Addresses> existingAddress=Addresses.stream().findfirst();
            if(existingAddress.isPresent() == true) {
                existingAddress.get().setAddress_id(3001);
                addressDAO.updateAddress(existingAddress.get());
                logger.info(existingAddress);
                logger.info("Address updated successfully");
            }
*/
            // Customers Table Insert,getAll,delete,get record based on address_id,update queries execution
            CustomerDAO customerDAO = new CustomerDAOImpl(connection);
            Customers newCustomer = new Customers(4125, 334, "Reo", "Lawrence", "6542389041");
            customerDAO.saveCustomer(newCustomer);
            logger.info("New Customer added successfully");
            logger.info("Print details of all the customers from the table");
            List<Customers> customersList = customerDAO.getAllCustomers();
            customersList.forEach(System.out::println);
            customerDAO.deleteCustomer(5362);
            logger.info("Address deleted successfully");
            logger.info("Address detail for the address_id entered is: " + addressDAO.getAddress(1246));

       /*     Optional<Customers> existingCustomer = Customer.stream().findfirst();
            if (existingCustomer.isPresent() == true) {
                existingCustomer.get().setCustomer_id(156);
                customerDAO.updateCustomer(existingCustomer.get());
                logger.info(existingCustomer);
                logger.info("Customer updated successfully");
            }
*/
// Doctors Table Insert,getAll,delete,get record based on address_id,update queries execution
            DoctorsDAO doctorsDAO = new DoctorsDAOImpl(connection);
           Doctors newDoctor = new Doctors(334, 6718, "Rachel", "Suan", "7772628532", "racheal12@gmail.com");
           doctorsDAO.saveId(newDoctor);
            logger.info("New Doctor added successfully");
            logger.info("Print details of all the doctors from the table");
            List<Doctors> doctorsList = doctorsDAO.getAll();
            doctorsList.forEach(System.out::println);
           doctorsDAO.deleteId(2341);
            logger.info("Doctors deleted successfully");
            logger.info("Doctor detail for the doctor_id entered is: " + doctorsDAO.getId(1221));

          /*  Optional<Doctors> existingDoctor=Doctors.stream().findfirst();
            if(existingDoctor.isPresent() == true) {
                existingDoctor.get().setDoctor_id(156);
                customerDAO.updateDoctor(existingDoctor.get());
                logger.info(existingDoctor);
                logger.info("Doctor updated successfully");
            }
          */
            // Test the GenericDAOImpl for create method
            GenericDAOImpl<Manufacturers> manufacturersGenericDAO = new GenericDAOImpl<>(connection, Manufacturers.class);
            //Inserting new record into manufacturers table
            Manufacturers manufacturers = new Manufacturers(2324, "Antacin pharmacy", "A2132", 416);

            try {
                manufacturersGenericDAO.create(manufacturers);
                logger.info("Entry made into manufacturers table.");
            } catch (Exception e) {
                System.err.println("An error occurred while inserting the record:");
                e.printStackTrace();
            }

            // Test the GenericDAOImpl for getById method
            manufacturersGenericDAO = new GenericDAOImpl<>(connection, Manufacturers.class);

//        Get manufacturer by ID
            int manufacturerId = 3272;
            Manufacturers manufacturers1 = manufacturersGenericDAO.getById(manufacturerId);
            logger.info(manufacturers1);

            //   GenericDAOImpl  for update method
            manufacturersGenericDAO = new GenericDAOImpl<>(connection, Manufacturers.class);
//        // Create a Manufacturer object with the original data
            Manufacturers manufacturers2 = new Manufacturers(444, "Appollo Pharma", "BM342342", 45675);
//         Set the updated values for the Manufacturer
            manufacturers2.setManufacture_name("Vadamalayan Pharma");
            manufacturers2.setAddress_id_manufacturer(77);

            // Call the update method
            manufacturersGenericDAO.update(manufacturers2);

            // Check the updated data in the database or log statements
            // Retrieve the manufacturer from the database and print its details
            Manufacturers updatedManufacturer = manufacturersGenericDAO.getById(manufacturers2.getManufacture_id());
            logger.info(updatedManufacturer);

            // Test the GenericDAOImpl of delete method
            //Create an instance of the GenericDAOImpl with the Manufacturer class
            GenericDAOImpl<Manufacturers> manufacturersGenericDAO1 = new GenericDAOImpl<>(connection, Manufacturers.class);

            //Create a new manufacturer to be deleted
            Manufacturers manufacturers3 = new Manufacturers(6567, "Bigban pharma", "C43545", 1233);
            try {
                //Create the manufacturer in the db
                manufacturersGenericDAO1.create(manufacturers3);
                logger.info("Manufacturer created and inserted into the database.");
                //Delete the manufacturer from the db
                manufacturersGenericDAO1.delete(manufacturers3);
                logger.info("Manufacturer deleted from the db");
            } catch (Exception e) {
                logger.info("An error occured while deleting the manufacturer. ");
                e.printStackTrace();
            }

            //  Test the getAll method
            // Instantiate the GenericDAOImpl and other dependencies
            GenericDAOImpl<Manufacturers> manufacturersGenericDAO2 = new GenericDAOImpl<>(connection, Manufacturers.class);

            // Call the getAll() method
            ManufacturersService manufacturersService = new ManufacturersService(manufacturersGenericDAO);

            //Call the getAllUsers() method
            List<Manufacturers> manufacturersList = manufacturersService.getAllManufacturers();

            // Verify the results
            System.out.println("Print the details of all the manufacturers:");
            for (Manufacturers manufacturers4 : manufacturersList) {
                System.out.println(manufacturers4);
            }

        }
    }
}



