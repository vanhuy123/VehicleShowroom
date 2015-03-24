USE [master]
GO
/****** Object:  Database [Vehicleshowroom]    Script Date: 3/24/2015 10:30:55 AM ******/
CREATE DATABASE [Vehicleshowroom]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Vehicleshowroom', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\Vehicleshowroom.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Vehicleshowroom_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\Vehicleshowroom_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Vehicleshowroom] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Vehicleshowroom].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Vehicleshowroom] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET ARITHABORT OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [Vehicleshowroom] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Vehicleshowroom] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Vehicleshowroom] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET  DISABLE_BROKER 
GO
ALTER DATABASE [Vehicleshowroom] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Vehicleshowroom] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET RECOVERY FULL 
GO
ALTER DATABASE [Vehicleshowroom] SET  MULTI_USER 
GO
ALTER DATABASE [Vehicleshowroom] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Vehicleshowroom] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Vehicleshowroom] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Vehicleshowroom] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
EXEC sys.sp_db_vardecimal_storage_format N'Vehicleshowroom', N'ON'
GO
USE [Vehicleshowroom]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 3/24/2015 10:30:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[UserId] [int] IDENTITY(1,1) NOT NULL,
	[Username] [nvarchar](50) NOT NULL,
	[Password] [nvarchar](50) NOT NULL,
	[Fullname] [nvarchar](50) NOT NULL,
	[Birthday] [datetime] NULL,
	[Address] [nvarchar](50) NULL,
	[Phone] [nchar](15) NULL,
	[Gender] [bit] NULL,
	[LevelSystem] [bit] NOT NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[UserId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Brand]    Script Date: 3/24/2015 10:30:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Brand](
	[BrandId] [int] IDENTITY(1,1) NOT NULL,
	[BrandName] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Brand] PRIMARY KEY CLUSTERED 
(
	[BrandId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Customer]    Script Date: 3/24/2015 10:30:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[CustomerId] [int] IDENTITY(1,1) NOT NULL,
	[CustomerName] [nvarchar](50) NOT NULL,
	[CustomerBirthday] [date] NOT NULL,
	[CustomerPhone] [nvarchar](15) NULL,
	[CustomerEmail] [nvarchar](50) NULL,
	[CustomerGender] [bit] NULL,
	[CustomerAddress] [nvarchar](50) NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[CustomerId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[PurchaseOrder]    Script Date: 3/24/2015 10:30:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PurchaseOrder](
	[PurchaseId] [int] IDENTITY(1,1) NOT NULL,
	[UserId] [int] NOT NULL,
	[PurchaseDate] [datetime] NOT NULL,
	[Status] [bit] NOT NULL,
 CONSTRAINT [PK_PurchaseOrder] PRIMARY KEY CLUSTERED 
(
	[PurchaseId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[PurchaseOrderDetails]    Script Date: 3/24/2015 10:30:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PurchaseOrderDetails](
	[PurchaseId] [int] NOT NULL,
	[VehicleId] [int] NOT NULL,
	[PurchasePrice] [decimal](18, 0) NOT NULL,
	[Quantity] [int] NOT NULL,
 CONSTRAINT [PK_PurchaseOrderDetails] PRIMARY KEY CLUSTERED 
(
	[PurchaseId] ASC,
	[VehicleId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SalesOrder]    Script Date: 3/24/2015 10:30:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SalesOrder](
	[SalesId] [int] IDENTITY(1,1) NOT NULL,
	[CustomerId] [int] NOT NULL,
	[SalesDate] [date] NOT NULL,
	[Status] [int] NOT NULL,
 CONSTRAINT [PK_SalesOrder] PRIMARY KEY CLUSTERED 
(
	[SalesId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SalesOrderDetails]    Script Date: 3/24/2015 10:30:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SalesOrderDetails](
	[RegistrationId] [int] NOT NULL,
	[SalesId] [int] NOT NULL,
	[SalesPrice] [float] NOT NULL,
	[Quantity] [int] NOT NULL,
 CONSTRAINT [PK_SalesOrderDetails] PRIMARY KEY CLUSTERED 
(
	[RegistrationId] ASC,
	[SalesId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Vehicle]    Script Date: 3/24/2015 10:30:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Vehicle](
	[VehicleId] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
	[Image] [nvarchar](max) NOT NULL,
	[Model] [nvarchar](50) NOT NULL,
	[Speed] [int] NOT NULL,
	[Weight] [int] NOT NULL,
	[Description] [nvarchar](max) NULL,
	[OverallHeight] [int] NOT NULL,
	[OverallWidth] [int] NOT NULL,
	[OverallLength] [int] NOT NULL,
	[SeatingCapacity] [int] NOT NULL,
	[FuelTank] [float] NOT NULL,
 CONSTRAINT [PK_Vehicle] PRIMARY KEY CLUSTERED 
(
	[VehicleId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[VehicleRegistration]    Script Date: 3/24/2015 10:30:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[VehicleRegistration](
	[RegistrationId] [int] IDENTITY(1,1) NOT NULL,
	[PurchaseId] [int] NOT NULL,
	[VehicleId] [int] NOT NULL,
	[Price] [decimal](18, 0) NOT NULL,
	[Remarks] [nvarchar](200) NOT NULL,
	[Manufacturer] [nchar](10) NOT NULL,
	[Color] [nchar](20) NOT NULL,
	[Type] [nvarchar](20) NOT NULL,
 CONSTRAINT [PK_VehicleRegistration] PRIMARY KEY CLUSTERED 
(
	[RegistrationId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
ALTER TABLE [dbo].[PurchaseOrder]  WITH CHECK ADD  CONSTRAINT [FK_PurchaseOrder_Account] FOREIGN KEY([UserId])
REFERENCES [dbo].[Account] ([UserId])
GO
ALTER TABLE [dbo].[PurchaseOrder] CHECK CONSTRAINT [FK_PurchaseOrder_Account]
GO
ALTER TABLE [dbo].[PurchaseOrderDetails]  WITH CHECK ADD  CONSTRAINT [FK_PurchaseOrderDetails_PurchaseOrder] FOREIGN KEY([PurchaseId])
REFERENCES [dbo].[PurchaseOrder] ([PurchaseId])
GO
ALTER TABLE [dbo].[PurchaseOrderDetails] CHECK CONSTRAINT [FK_PurchaseOrderDetails_PurchaseOrder]
GO
ALTER TABLE [dbo].[PurchaseOrderDetails]  WITH CHECK ADD  CONSTRAINT [FK_PurchaseOrderDetails_Vehicle] FOREIGN KEY([VehicleId])
REFERENCES [dbo].[Vehicle] ([VehicleId])
GO
ALTER TABLE [dbo].[PurchaseOrderDetails] CHECK CONSTRAINT [FK_PurchaseOrderDetails_Vehicle]
GO
ALTER TABLE [dbo].[SalesOrder]  WITH CHECK ADD  CONSTRAINT [FK_SalesOrder_Customer] FOREIGN KEY([CustomerId])
REFERENCES [dbo].[Customer] ([CustomerId])
GO
ALTER TABLE [dbo].[SalesOrder] CHECK CONSTRAINT [FK_SalesOrder_Customer]
GO
ALTER TABLE [dbo].[SalesOrderDetails]  WITH CHECK ADD  CONSTRAINT [FK_SalesOrderDetails_SalesOrder] FOREIGN KEY([SalesId])
REFERENCES [dbo].[SalesOrder] ([SalesId])
GO
ALTER TABLE [dbo].[SalesOrderDetails] CHECK CONSTRAINT [FK_SalesOrderDetails_SalesOrder]
GO
ALTER TABLE [dbo].[SalesOrderDetails]  WITH CHECK ADD  CONSTRAINT [FK_SalesOrderDetails_VehicleRegistration] FOREIGN KEY([RegistrationId])
REFERENCES [dbo].[VehicleRegistration] ([RegistrationId])
GO
ALTER TABLE [dbo].[SalesOrderDetails] CHECK CONSTRAINT [FK_SalesOrderDetails_VehicleRegistration]
GO
ALTER TABLE [dbo].[Vehicle]  WITH CHECK ADD  CONSTRAINT [FK_Vehicle_Brand] FOREIGN KEY([OverallLength])
REFERENCES [dbo].[Brand] ([BrandId])
GO
ALTER TABLE [dbo].[Vehicle] CHECK CONSTRAINT [FK_Vehicle_Brand]
GO
ALTER TABLE [dbo].[VehicleRegistration]  WITH CHECK ADD  CONSTRAINT [FK_VehicleRegistration_PurchaseOrderDetails] FOREIGN KEY([PurchaseId], [VehicleId])
REFERENCES [dbo].[PurchaseOrderDetails] ([PurchaseId], [VehicleId])
GO
ALTER TABLE [dbo].[VehicleRegistration] CHECK CONSTRAINT [FK_VehicleRegistration_PurchaseOrderDetails]
GO
USE [master]
GO
ALTER DATABASE [Vehicleshowroom] SET  READ_WRITE 
GO
