package com.la.biblioteca.labibliotecadelplanoschooser.model;

public class ElPlan {
    private String category;
    private String elPlan;
    private String description;
    private Status status;

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getElPlan() {
        return elPlan;
    }

    public void setElPlan(String elPlan) {
        this.elPlan = elPlan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((elPlan == null) ? 0 : elPlan.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ElPlan other = (ElPlan) obj;
        if (category == null) {
            if (other.category != null)
                return false;
        } else if (!category.equals(other.category))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (elPlan == null) {
            if (other.elPlan != null)
                return false;
        } else if (!elPlan.equals(other.elPlan))
            return false;
        if (status != other.status)
            return false;
        return true;
    }

    
    
}