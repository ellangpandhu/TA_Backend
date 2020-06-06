-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2020 at 11:10 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `server_ibc`
--

-- --------------------------------------------------------

--
-- Table structure for table `sinyal`
--

CREATE TABLE `sinyal` (
  `id` varchar(256) NOT NULL,
  `username` varchar(256) DEFAULT NULL,
  `password` varchar(512) DEFAULT NULL,
  `secret_key` varchar(256) DEFAULT NULL,
  `state` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sinyal`
--

INSERT INTO `sinyal` (`id`, `username`, `password`, `secret_key`, `state`) VALUES
('j10', '10j', '10j', '2', 0),
('j12', '12j', '12j', '3', 0),
('mj10', '10mj', '10mj', '1', 0);

-- --------------------------------------------------------

--
-- Table structure for table `tc`
--

CREATE TABLE `tc` (
  `id` varchar(256) NOT NULL,
  `username` varchar(256) NOT NULL,
  `password` varchar(512) NOT NULL,
  `secret_key` varchar(256) NOT NULL,
  `state` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tc`
--

INSERT INTO `tc` (`id`, `username`, `password`, `secret_key`, `state`) VALUES
('10at', '10at', '10at', '1', 0),
('10bt', '10bt', '10bt', '2', 0),
('10ct', '10ct', '10ct', '3', 0),
('11t', '11t', '11t', '4', 0),
('12t', '12t', '12t', '5', 0),
('13at', '13at', '13at', '6', 0),
('13bt', '13bt', '13bt', '7', 0),
('14at', '14at', '14at', '8', 0),
('14bt', '14bt', '14bt', '9', 0),
('14ct', '14ct', '14ct', '10', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sinyal`
--
ALTER TABLE `sinyal`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `sinyal_id_uindex` (`id`),
  ADD UNIQUE KEY `sinyal_secret_key_uindex` (`secret_key`),
  ADD UNIQUE KEY `sinyal_username_uindex` (`username`);

--
-- Indexes for table `tc`
--
ALTER TABLE `tc`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `tc_secret_key_uindex` (`secret_key`),
  ADD UNIQUE KEY `tc_username_uindex` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
