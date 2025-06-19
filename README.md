
# XpressRental 🚗

**XpressRental** is a Java Swing-based desktop application that allows users to rent vehicles (Bike, Car, Van, Jeep) based on their preferences and calculate the final rental charges. This project demonstrates GUI design, user authentication, booking systems, and file I/O in Java.

---

## 🛠️ Features

- 🔐 **User Authentication**: Sign up and login system with validations.
- 🏠 **Home Page**: Accessible to all; guides users to login or explore options.
- 🚘 **Vehicle Selection**: Choose from Bike, Car, Van, or Jeep.
- 💰 **Cost Calculation**: Calculates final charge based on duration and optional fuel pass.
- 💾 **Booking Info Storage**: Booking and user details are saved to `.txt` files.
- ☕ **Swing GUI Components**: JFrame, JButton, JLabel, JTextField, JPanel, JComboBox.

---

## 📸 Screens & Flow

1. **Home Page (Pre-login)** – Company info, "Sign Up", "Login", and "Book Now" buttons.
2. **Login Page** – Allows existing users to log in and redirects to vehicle selection.
3. **Sign Up Page** – New users can register with validations (email, phone, password match).
4. **Home Page (Post-login)** – Now displays only "Book Now" to hire a vehicle.
5. **Vehicle Selection** – Choose your vehicle.
6. **Cost Calculation Page** – Insert duration, choose fuel pass, and see final cost.

---

## 🧮 Example Calculation Logic

- **Base Rates**: Van = 2500/day.
- **Fuel Pass (Optional)**: Adds 1500 LKR.
- **Discounts**:
  - 1–3 days → No discount.
  - 4–5 days → 5% discount.
  - 5 days → 9% discount.

---

## 🧱 Project Structure

```
XpressRental/
├── HomePage.java
├── Login.java
├── Signup.java
├── VehicleSelection.java
├── CostCalculationVehicleXX.java
├── LoginManager.java
├── User.java
├── User Details Sign Up.txt
├── booking_info_Van.txt
└── ...
```

---

## 🔧 Technologies Used

- **Java SE**
- **Java Swing**
- **OOP Principles** (Encapsulation, Inheritance, Singleton pattern)
- **File I/O** with `FileWriter`
- **JOptionPane** for alerts and messages

---

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/heyisula/xpressrental.git
   cd xpressrental
   ```

2. Open the project in your Java IDE (e.g., IntelliJ IDEA or NetBeans).

3. Compile and run the `HomePage.java` to start the application.

---

## ⚠️ Notes

- Admin login credentials are hardcoded:  
  **Username**: `admin`  
  **Password**: `1234`
- All user data is stored locally in plain text (not secure for production use).

---

## 📜 License

This project is for educational purposes and does not currently include a license.
