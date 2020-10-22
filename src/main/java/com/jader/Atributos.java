package com.jader;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Atributos {
    private boolean desired_bed_cleanup;
    private boolean has_dry_leaves;
    private boolean has_wet_leaves;
    private boolean has_fallen_limbs;
    private boolean has_cut_limbs;
    private boolean has_rocks;
    private boolean has_mulch;
    private boolean has_pine;
    private boolean has_pet_waste;
    private boolean has_other;
    private boolean has_cement;
    private boolean has_acorns;
    private boolean has_pine_cones;
    private String other_debris;
    private String last_service;
    private boolean desired_haulaway;
    private String details;

    public Atributos(boolean desired_bed_cleanup, boolean has_dry_leaves, boolean has_wet_leaves, boolean has_fallen_limbs, boolean has_cut_limbs, boolean has_rocks, boolean has_mulch, boolean has_pine, boolean has_pet_waste, boolean has_other, boolean has_cement, boolean has_acorns, boolean has_pine_cones, String other_debris, String last_service, boolean desired_haulaway, String details) {
        this.desired_bed_cleanup = desired_bed_cleanup;
        this.has_dry_leaves = has_dry_leaves;
        this.has_wet_leaves = has_wet_leaves;
        this.has_fallen_limbs = has_fallen_limbs;
        this.has_cut_limbs = has_cut_limbs;
        this.has_rocks = has_rocks;
        this.has_mulch = has_mulch;
        this.has_pine = has_pine;
        this.has_pet_waste = has_pet_waste;
        this.has_other = has_other;
        this.has_cement = has_cement;
        this.has_acorns = has_acorns;
        this.has_pine_cones = has_pine_cones;
        this.other_debris = other_debris;
        this.last_service = last_service;
        this.desired_haulaway = desired_haulaway;
        this.details = details;
    }

    public String toCsv()  {
        StringBuilder stringBuilder = new StringBuilder();
        Field[] declaredFields = Atributos.class.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            try {
                stringBuilder.append(declaredField.get(this)).append(", ");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return stringBuilder.toString();
    }
}
