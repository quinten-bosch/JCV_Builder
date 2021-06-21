package domain.model;

import domain.DomainException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSkill {

    private Level validLevel = new Level("Goed", false);

    @Test
    public void test_Skill_Valid() {
        Skill testSkillJuist = new Skill("HTML", validLevel);
        assertEquals(validLevel, testSkillJuist.getLevel());
        assertEquals("HTML", testSkillJuist.getNaam());
    }

    @Test(expected = DomainException.class)
    public void test_Skill_Invalid_Level() throws Exception {
        Level invalidLevel = new Level("Fout", false);
        Skill testSkillFout = new Skill("HTML", invalidLevel);
    }

    @Test(expected = DomainException.class)
    public void test_Skill_Invalid_Name() throws Exception {
        Skill testSkillFout = new Skill("   ", validLevel);
    }

}
