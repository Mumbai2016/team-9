CREATE SCHEMA `dad` ;

/*
UserDetails{

  userId
  firstName
  lastName
  dateOfBirth
  gender
  email
  mobileNo
  fatherMobile
  motherMobile
  currentStatus
  currentSevel
  currentLocation
  centre
  schoolOrCollege
  mediumOfEducation
  
}


ProfilePic{
	userId
	pictureUrl
}
*/


CREATE TABLE `dad`.`user_details` (
  `user_id` INT NOT NULL,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `date_of_birth` VARCHAR(45) NULL,
  `gender` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `mobile_no` VARCHAR(45) NULL,
  `father_mobile` VARCHAR(45) NULL,
  `mother_mobile` VARCHAR(45) NULL,
  `current_status` VARCHAR(45) NULL,
  `current_level` VARCHAR(45) NULL,
  `current_location` VARCHAR(45) NULL,
  `centre` VARCHAR(45) NULL,
  `school_or_college` VARCHAR(45) NULL,
  `medium_of_education` VARCHAR(45) NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC));

CREATE TABLE `dad`.`program_level` (
  `user_id` INT NOT NULL,
  `level` VARCHAR(45) NULL,
  `level_date_of_joining` VARCHAR(45) NULL,
  `level_end_date` VARCHAR(45) NULL,
  `ngo_comments` VARCHAR(45) NULL,
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC),
  PRIMARY KEY (`user_id`),
  CONSTRAINT `user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `dad`.`user_details` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE `dad`.`user_status` (
  `user_id` INT NOT NULL,
  `current_status` VARCHAR(45) NULL,
  `call_date` VARCHAR(45) NULL,
  `user_feedback` VARCHAR(45) NULL,
  `ngo_comments` VARCHAR(45) NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC),
  CONSTRAINT `user_id_FK`
    FOREIGN KEY (`user_id`)
    REFERENCES `dad`.`user_details` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
