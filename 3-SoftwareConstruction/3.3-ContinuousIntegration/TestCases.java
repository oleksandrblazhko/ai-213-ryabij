    @Test
    void testGetAirStateInfoValidInput() {
        EFreshAir eFreshAir = new EFreshAir();
        String user = "John Doe";
        String location = "New York";

        String result = eFreshAir.getAirStateInfo(user, location);

        assertFalse(result.equals("-1"));
        assertTrue(result.contains("The city of New York today has excellent air quality."));
        assertTrue(result.contains("Temperature in the city is 24C"));
    }

    @Test
    void testGetAirStateInfoInvalidLocation() {
        EFreshAir eFreshAir = new EFreshAir();
        String user = "John Doe";
        // Location with length greater than 20 characters
        String location = "VeryLongLocationNameThatExceedsTwentyCharacters";

        String result = eFreshAir.getAirStateInfo(user, location);

        assertEquals("-1", result);
    }

    @Test
    void testGetAirStateInfoInvalidUser() {
        EFreshAir eFreshAir = new EFreshAir();
        // Invalid user name with special characters
        String user = "John@Doe";
        String location = "New York";

        String result = eFreshAir.getAirStateInfo(user, location);

        assertEquals("-1", result);
    }

    @Test
    void testGetAirStateInfoBlankUser() {
        EFreshAir eFreshAir = new EFreshAir();
        // Blank user name
        String user = "";
        String location = "New York";

        String result = eFreshAir.getAirStateInfo(user, location);

        assertEquals("-1", result);
    }
