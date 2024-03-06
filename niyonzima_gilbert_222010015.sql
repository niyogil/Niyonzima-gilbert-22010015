-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 09:08 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ur_students_saving_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `id` int(11) NOT NULL,
  `name` varchar(250) NOT NULL,
  `balance` varchar(50) NOT NULL,
  `transaction` varchar(50) NOT NULL,
  `date` varchar(250) NOT NULL,
  `amount deposit` varchar(250) NOT NULL,
  `amount withdraw` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`id`, `name`, `balance`, `transaction`, `date`, `amount deposit`, `amount withdraw`) VALUES
(1, 'innovation', '30000', 'withdraw', '12/08/2024', '1000', '20000'),
(2, 'mutsinzi', '40000', 'deposit', '3/09/2023', '20000', '5000'),
(3, 'delice', '50000', 'withdraw/deposit', '20/02/2023', '2400', '25000'),
(4, 'grace', '70000', 'deposit', '09/12/2023', '70000', '0');

-- --------------------------------------------------------

--
-- Table structure for table `accountant`
--

CREATE TABLE `accountant` (
  `id` int(11) NOT NULL,
  `name` varchar(250) NOT NULL,
  `address` varchar(50) NOT NULL,
  `qualification` varchar(50) NOT NULL,
  `phone_number` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `accountant`
--

INSERT INTO `accountant` (`id`, `name`, `address`, `qualification`, `phone_number`, `email`) VALUES
(1, 'kagabo', 'muhanga', 'A0', '0787234156', 'kagabo@gmail.com'),
(34, 'tdfd', 'bvgs', 'sadefr', 'sadfd', 'arf');

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(50) NOT NULL,
  `age` varchar(10) NOT NULL,
  `phone_number` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `name`, `address`, `age`, `phone_number`, `email`) VALUES
(1, 'ngumire', 'gicumbi', '15', '0782345678', 'ngumire@gmail.com'),
(2, 'dcdf', 'aasfd', '34', '097', 'fggffh'),
(3, 'sele', 'rubavu', '23', '0782734521', 'sele@gmail.com'),
(34, 'kanani', 'huye', '23', '078666666', 'kanani@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE `manager` (
  `id` int(11) NOT NULL,
  `name` varchar(250) NOT NULL,
  `age` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `qualification` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `manager`
--

INSERT INTO `manager` (`id`, `name`, `age`, `address`, `qualification`, `email`) VALUES
(1, 'kabera', 'musanze', '20', 'A0', 'kabera@gmail.com'),
(3, 'radc', 'dcfvqe', '34', 'cs', 'sdcfv');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `faculty` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `reg_number` varchar(50) NOT NULL,
  `password` varchar(250) NOT NULL,
  `confirm password` varchar(250) NOT NULL,
  `gender` varchar(250) NOT NULL,
  `address` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `name`, `faculty`, `phone`, `email`, `reg_number`, `password`, `confirm password`, `gender`, `address`) VALUES
(1, 'gilbert', '222010015', 'gilbert@gmail.com', 'BIT', '0787109054', '123', '123', 'male', 'nyagatare'),
(3, 'jhgf', 'kjhgf', 'uyf', 'hg', 'hgf', 'hgf', 'hgf', 'hgf', 'hgf'),
(4, 'kamanzi', '2346', 'kamanzi@gmail.com', 'governancy', '0789955643', '321', '321', 'male', 'kigali');

-- --------------------------------------------------------

--
-- Table structure for table `students profile`
--

CREATE TABLE `students profile` (
  `id` int(250) NOT NULL,
  `name` varchar(250) NOT NULL,
  `reg number` varchar(250) NOT NULL,
  `gender` varchar(250) NOT NULL,
  `faculty` varchar(250) NOT NULL,
  `phone number` varchar(250) NOT NULL,
  `email` varchar(250) NOT NULL,
  `address` varchar(250) NOT NULL,
  `password` varchar(250) NOT NULL,
  `confirm password` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `accountant`
--
ALTER TABLE `accountant`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=987;

--
-- AUTO_INCREMENT for table `accountant`
--
ALTER TABLE `accountant`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `manager`
--
ALTER TABLE `manager`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2346;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
