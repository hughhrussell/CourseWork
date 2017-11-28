/*
Game Title: Hero Reborn
Course: SNHU IT-620
Author: Hugh Russell
Date: 10/22/2017 Last Modified

Summary: This game is a revision of Hero's 3.0 from Dawson's "Beginning C++ Through Game Programming"
(2015). The story has been changed along with the weapons. A function is being used to call the hero's inventory, pointers
and references were added, a Hero object class and health level was added, and we now can announce the hero's health
level during the game.

At various points, system("pause") is used to prevent the entirety of the program to execute at once.
This made it more easy to read on my computer; hopefully, it will work that way in the standard console.

*/

#include "stdafx.h"  //standard header inserted by Visual Studio

// Hero's Inventory 3.0
// Demonstrates iterators

#include <iostream>
#include <string>
#include <vector>

using namespace std;

//This class is going to produce our hero object
class Hero
{
public:
	const string s_heroName = "Leopold the Mighty"; //hero's formal name
	const string* Leopold = &s_heroName; //created a pointer to our hero's name
	void heroAnnounce(); //use to announce hero
	Hero(int health = 100); // initiating health to 100 for the hero
	void heroDamage(int damage = 25); //will use to make damage to hero's health
	void heroHealth(); //will use to state health level
	void guide();
	void addHealth(int modifier = 5); //use to add points to health

private:
	int m_healthLevel; //going to use to track health
	int choice;


};

//constructor for the hero
Hero::Hero(int health) :
	m_healthLevel(health) //getting the initial health level going
{}

//function to cause damage
//currently damage is set to a default of 25
void Hero::heroDamage(int damage)
{
	m_healthLevel -= damage; //decreasing health level to simulate damage from fights, etc.
	if (m_healthLevel < 1)
	{
		cout << "Sorry, your hero didn't make it. He lost too much health. Game over.\n";
		cout << "Please play again.\n\n";
		system("pause");
		exit(0); //throws exception to end program, call destructor, etc
	}
}

// The announcment of our here
// some print statementes are included to try and make it look like a title
void Hero::heroAnnounce()
{
	cout << "\n ####################################################################\n";
	cout << "\n Our hero's name is " << *Leopold << ". ";  //using the pointer which is clearly Leopold's name
	cout << "\n And we start with him having " << Hero::m_healthLevel << "% health. ";
	cout << "\n\n ####################################################################";
}

//function to state our hero's health
void Hero::heroHealth()
{
	cout << "\n Our hero is at " << Hero::m_healthLevel << "% health. \n\n";
}

// add health to our hero - m_healthLevel
void Hero::addHealth(int modifier)
{
	m_healthLevel += modifier;
	if (m_healthLevel > 100)  //decided not to allow greater that 100% health
	{
		m_healthLevel = 100;
	}
}

// lets players guide our hero character to recoup or continue onward

void Hero::guide()
{

	while (choice != 3)
	{

		// Menu for the player to use in manipulating our hero
		cout << "How will your hero proceed?\n\n";
		cout << "0 - Look for food\n";
		cout << "1 - Rest\n";
		cout << "2 - Check the hero's health\n";
		cout << "3 - Continue the journey\n\n";

		cout << "What is your choice?\n\n";
		cin >> choice;

		// Any time we continue we take some damage as a penalty for resting
		if (choice == 0 || choice == 1)
		{
			Hero::heroDamage(5); // just a little damage; nothing too much
		}

		// switch to decipher choices
		switch (choice)
		{
		case 0:
			cout << "Found food. Hero's health increases.\n";
			Hero::addHealth(20);
			break;
		case 1:
			cout << "Your Hero has rested and regained some strength.\n";
			Hero::addHealth(10);
			break;
		case 2:
			Hero::heroHealth();
			break;
		case 3:
			cout << "\nTime for your hero to continue his journey.\n";
			break;
		default:
			cout << "Sorry, but your choice was invalid. Please choose: 0, 1, or 2\n";
		}


	}
}

// This is the base enemy class from which the others are derived
class Enemy
{
public:
	Enemy(int number = 1);
	//~Enemy();
	void enemyAnnounce();
	void setAlive(int num = 1);
	void enemyAttack();
protected:
	int m_deadAlive;
	int m_numEnemies;
};

//constructor
Enemy::Enemy(int number) :
	m_numEnemies(number)
{

}

//Just to announce enemies
void Enemy::enemyAnnounce()
{
	cout << " An enemy appeared and he/she is " << m_deadAlive << "\n";
}

//For the initial attack
void Enemy::enemyAttack()
{
	cout << " An enemy attacks our fine here!\n";
}

//setting the number of enemies to alive or dead - assumed to be 1 or 0 here
void Enemy::setAlive(int num)
{
	m_deadAlive = num;
}

// Assassin class inherited from basic enemies
class Assassins :public Enemy
{
public:
	Assassins(int number = 3);
	void virtual enemyAnnounce();
	void virtual enemyAttack();
	void virtual setAlive(int num = 3);

protected:
	int m_numEnemies;
};

//assassin constructor
Assassins::Assassins(int number) :
	m_numEnemies(number)
{

}

// Announcment method override to be specific to the class
void Assassins::enemyAnnounce()
{
	cout << " There were " << m_numEnemies << " Assassins and " << m_deadAlive << " of them are alive\n";
}

//For the initial attack
void Assassins::enemyAttack()
{
	cout << "\n\n " << m_numEnemies << " Assassins attack our hero with silenced ray guns and are armored!\n";
}

//setting the number of enemies to alive or dead - assumed to be 1 or 0 here
void Assassins::setAlive(int num)
{
	m_deadAlive = num;
}

// Warlord class inherited from basic enemies
class Warlord :public Enemy
{
public:
	Warlord(int number = 1);
	void virtual enemyAnnounce();
	void virtual enemyAttack();
	//void virtual setAlive(int num = 1);

protected:
	int m_numEnemies;
	int m_deadAlive = 1;
};


// constructor for Warlord
Warlord::Warlord(int number) :
	m_numEnemies(number)
{

}

// overwritten method for announcing the enemy class
void Warlord::enemyAnnounce()
{
	cout << "\n The Warlord who was not killed in battle.\n";
}

//For the initial attack
void Warlord::enemyAttack()
{
	cout << "\n\n A warlord had led his Assassin army to attack the village of our hero!\n";
}

void storyContinues(); // short method to insert text used repeatedly


// Beginning of main
int main()
{

	Hero ourHero; //creating an object ourhero using the Hero class

	vector<string> inventory; // creating a vector for storing inventory

	void inventoryDisplay(vector<string>& vec);

	

	//inserting base inventory
	inventory.push_back("cycler pistol");
	inventory.push_back("plasma rifle");
	inventory.push_back("rocket boots");

	//sets up the iterator so we can move through the inventory
	vector<string>::iterator myIterator;
	vector<string>::const_iterator iter;

	//Call a function from our hero class via the object we created - ourHero
	ourHero.heroAnnounce();

	//announces hero's current inventory of items
	inventoryDisplay(inventory);

	//notes about the program for player
	cout << "\n Our game is story driven and gives you responsibility for the health";
	cout << "\n of our hero. Be careful because if he loses all his health, the game";
	cout << "\n and his story is over!\n";
	cout << "\n If you are successful, at the end a list of all your enemies and whether";
	cout << "\n they are dead are alive will be displayed - a roll call of sorts.\n\n";

	system("pause");

	//Story line ending with changing one inventory item
	cout << "\n ++++++ The story begins....";
	cout << "\n Our hero set out with his weapons only to stumble upon some Xeno armor.";
	cout << "\n Tired from his travels, he had to choose to leave the armor or trade it ";
	cout << "\n for his heaviest item - Rocket boots. ";
	cout << "\n He took the armor feeling that it was lighter and provided protection ";
	cout << "\n that he might need. It felt good in his hands.\n\n";

	//we said our hero is tired so let's reflect that in his health
	ourHero.heroDamage();

	//switching in xeno armor
	myIterator = inventory.begin();
	*myIterator = "xeno armor";

	system("pause");

	//announcing inventory for the hero
	inventoryDisplay(inventory);

	ourHero.guide(); // ask for guidance for the hero

	ourHero.heroHealth(); // tell the user the hero's health

						  //continue story line
	cout << "\n Continuing his journey home, he was ambushed by crossbow wielding enemies. ";
	cout << "\n Our hero suffered some blows from the first two assassins.";

	Assassins firstAssassins; // create our first set of enemies

	firstAssassins.enemyAttack(); // announce their attack
	firstAssassins.setAlive(2);


	ourHero.heroDamage(50); // taking some damage during the battle.

	cout << "\n He deflected their next attacks quickly surprising them with his resolve. ";
	cout << "\n One of the enemies fell under the Cycler pistol of our hero while the others ";
	cout << "\n Checking the slain ambusher over, no items of importance were found except one";
	cout << "\n fled. - a Polymorphic face shield which was light and seemed well made. ";
	cout << "\n He added it to his inventory and continued onwards. \n\n";

	system("pause");


	//adding the new item to inventory
	inventory.insert(inventory.begin(), "polymorphic face shield");
	inventoryDisplay(inventory);

	ourHero.guide(); // ask for guidance for the hero

	ourHero.heroHealth(); // tell the user the hero's health



						  //contine story which ends with an item being lost
	storyContinues();
	cout << "\n The next day, our hero could see his village as the sun rose. As he got ";
	cout << "\n closer, he realized the village had been set ablaze.";

	//create Warlord and assassins

	Warlord ourWarlord;
	ourWarlord.enemyAttack();

	Assassins armyOf(10);
	armyOf.setAlive(5);
	armyOf.enemyAttack();

	cout << "\n surrounded by a small army of assassins. Battling them with every breath ";
	cout << "\n had, he helped to drive them off. Unfortunately, in doing so, his armor was ";
	cout << "\n reduced to nothing. Luckily, his fellow villagers had survived with few ";
	cout << "\n casualties and would rebuild. He was hurt and lost part of his weapons ";
	cout << "\n inventory but life would go on.\n\n";

	system("pause");

	//roll call
	firstAssassins.enemyAnnounce();
	ourWarlord.enemyAnnounce();
	armyOf.enemyAnnounce();

	//remove item lost in inventory
	inventory.erase((inventory.begin() + 2));

	//announce inventory
	inventoryDisplay(inventory);

	// display our hero's health before the end of the game
	ourHero.heroDamage();
	ourHero.heroHealth();

	return 0;
}

// functions

//function to print out our inventory using references
void inventoryDisplay(vector<string>& vec)
{
	cout << "\n--------------------------------------------";
	cout << "\n\n The inventory of our Hero is currently: \n\n";
	cout << "----------\n";
	for (unsigned int i = 0; i < vec.size(); ++i)
	{
		cout << " " << vec[i] << "\n";
	}
	cout << "----------\n";
}

// just a line to add before each new set of text
void storyContinues()
{
	cout << "\n ++++++ The story continues....";
}


