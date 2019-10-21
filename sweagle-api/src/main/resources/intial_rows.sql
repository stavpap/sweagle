USE sweagle;

INSERT INTO dataset (name,description)
VALUES ("dataset1","this is dataset 1"),
	   ("dataset2","this is dataset 2"),
       ("dataset3","this is dataset 3"),
       ("dataset4","this is dataset 4");

INSERT INTO payload (data,dataset_id)
VALUES ("first payload",1),
       ("second payload",2),
       ("third payload",3),
       ("fourth payload",4);
