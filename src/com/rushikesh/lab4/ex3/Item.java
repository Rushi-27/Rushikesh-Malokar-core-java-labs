package com.rushikesh.lab4.ex3;

public class Item {
	
	
	private String title;
	private int numberOfCopies;
	private int idNumber;
	
	public Item(int idNumber, String title, int numberOfCopies) {
        this.idNumber = idNumber;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }
	
	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	
	
	public Item() {
		
	}
	

    public void checkIn() {
        numberOfCopies++;
        System.out.println("Item checked in.");
    }

    public void checkOut() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
            System.out.println("Item checked out.");
        } else {
            System.out.println("No copies available.");
        }
    }

    public void addItem(int copies) {
        numberOfCopies += copies;
        System.out.println(copies + " copies added.");
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Item [idNumber=" + idNumber +
                ", title=" + title +
                ", numberOfCopies=" + numberOfCopies + "]";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Item other = (Item) obj;

        return idNumber == other.idNumber;
    }
}

