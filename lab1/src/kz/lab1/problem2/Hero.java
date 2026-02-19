package kz.lab1.problem2;

public class Hero {
	
	// static and final modifiers.
	private static final int MAX_LEVEL = 30;
	private static final double BASE_HEALTH = 100.0;
	private static final int MELEE_DAMAGE = 20;
	private static final int RANGED_DAMAGE = 15;
	private static final double MAGIC_DAMAGE_MULTIPLIER = 1.5;
	
	private static int totalHeroesCreated = 0;
	
	// read-only fields.
	private final String name;
	private final AttackType attackType;
	
	// instance fields.
	private int level;
	private double health;
	private HeroState state;
	private int killCount;
	private int deathCount;
	private int assistCount;
	
	// initialization block.
	{
		this.level = 1;
		this.health = BASE_HEALTH;
		this.state = HeroState.ALIVE;
	}
	
	// Constructors.
	public Hero(String name, AttackType attackType) {
		this.name = name;
		this.attackType = attackType;
		totalHeroesCreated++;
	}
	
	public Hero(String name) {
		this(name, AttackType.MELEE);
	}
	
	// core methods.
	public void levelUp() {
		if (this.level < MAX_LEVEL) {
			this.level++;
			System.out.println(name + " leveled up to " + level + " level.");
		} else {
			System.out.println(name + " is already at max level (" + MAX_LEVEL +").");
		}
	}
	
	public double getBaseDamage() {
		return attackType == AttackType.MELEE ? MELEE_DAMAGE : RANGED_DAMAGE;
	}
	
	public void takeDamage(double damage) {
		if (this.state == HeroState.DEAD) {
			System.out.println(name + " is already dead!");
			return;
		}
		this.health -= damage;
		System.out.println(name + " took " + damage + " damage. Health: " + health);
		if (this.health <= 0) {
			this.health = 0;
			this.state = HeroState.DEAD;
			this.deathCount++;
			System.out.println(name + " has died!");
		}
	}
	
	public void takeDamage(double damage, boolean isMagical) {
		if (isMagical) {
			damage *= MAGIC_DAMAGE_MULTIPLIER ;
		}
		takeDamage(damage);
	}
	
	public void addKill() {
		this.killCount++;
		System.out.println(name + " made a kill!");
	}
	
	public void addAssist() {
		this.assistCount++;
		System.out.println(name + " assisted in a kill!");
	}
	
	public String getKDA() {
		return killCount + "/" + deathCount + "/" + assistCount;
	}
	
	// getters.
	public String getName() { return name; }
	public AttackType getAttackType() {return attackType; }
	public int getLevel() { return level; }
	public double getHealth() { return health; }
	public HeroState getState() { return state; }
	public int getKillCount() { return killCount; }
	public int getDeathCount() { return deathCount; }
	public int getAssistCount() { return assistCount; }
	
	public static int getTotalHeroes() { return totalHeroesCreated; }
	
	public static void showHeroSystemInfo() {
		System.out.println("Hero System Statistics:");
		System.out.printf("Total heroes created: %d%n", totalHeroesCreated);
		System.out.printf("Max level: %d%n", MAX_LEVEL);
		System.out.printf("Base health: %1.f%n", BASE_HEALTH);
		System.out.printf("Melee damage: %d | Ranged damage: %d%n", MELEE_DAMAGE, RANGED_DAMAGE);
	}
	
	@Override
	public String toString() {
		return String.format("Hero{name = '%s', attack type = %s, level = %d, health = %.1f, state = %s, KDA = %d/%d/%d",
				name, attackType, level, health, state, killCount, deathCount, assistCount);
	}
	
}
