-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 08 Okt 2018 pada 03.56
-- Versi server: 10.1.31-MariaDB
-- Versi PHP: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inputan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `inputan`
--

CREATE TABLE `inputan` (
  `kodekursi` varchar(50) NOT NULL,
  `film` varchar(50) NOT NULL,
  `studio` varchar(50) NOT NULL,
  `pendapatan` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `inputan`
--

INSERT INTO `inputan` (`kodekursi`, `film`, `studio`, `pendapatan`) VALUES
('A3', 'Maze Runner 3', 'Studio 1', '25.000'),
('A4', 'Maze Runner 3', 'Studio 1', '25.000'),
('A5', 'Maze Runner 3', 'Studio 1', '25.000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `inputan2`
--

CREATE TABLE `inputan2` (
  `kodekursi` varchar(50) NOT NULL,
  `film` varchar(50) NOT NULL,
  `studio` varchar(50) NOT NULL,
  `pendapatan` int(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `inputan3`
--

CREATE TABLE `inputan3` (
  `kodekursi` varchar(50) NOT NULL,
  `film` varchar(50) NOT NULL,
  `studio` varchar(50) NOT NULL,
  `pendapatan` int(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `inputan4`
--

CREATE TABLE `inputan4` (
  `kodekursi` varchar(50) NOT NULL,
  `film` varchar(50) NOT NULL,
  `studio` varchar(50) NOT NULL,
  `pendapatan` int(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `inputan`
--
ALTER TABLE `inputan`
  ADD PRIMARY KEY (`kodekursi`);

--
-- Indeks untuk tabel `inputan2`
--
ALTER TABLE `inputan2`
  ADD PRIMARY KEY (`kodekursi`),
  ADD KEY `film` (`film`);

--
-- Indeks untuk tabel `inputan3`
--
ALTER TABLE `inputan3`
  ADD PRIMARY KEY (`kodekursi`);

--
-- Indeks untuk tabel `inputan4`
--
ALTER TABLE `inputan4`
  ADD PRIMARY KEY (`kodekursi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
