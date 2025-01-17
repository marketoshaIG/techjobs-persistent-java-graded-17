-- Part 1
-- SELECT name FROM employer WHERE location = "St. Louis City";
-- The 'job' table has the following columns:
-- id - INT PRIMARY KEY AUTO_INCREMENT
-- title - VARCHAR(100)  
-- description - VARCHAR(500)
-- posted_date - DATE
-- location - VARCHAR(100)
-- company - VARCHAR(100) 
-- salary - INT
-- contact_email - VARCHAR(100)
-- contact_name - VARCHAR(100)
-- contact_phone - VARCHAR(20)
-- Part 2
-- SELECT name FROM employer WHERE location = 'St. Louis City';
-- Part 3
-- DROP TABLE job;
-- Part 4
SELECT * FROM skill LEFT JOIN job_skills ON job_skills.skills_id = skill.id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;