

table = [[1, 2, 3],
         [4, 5, 6],
         [7, 8, 9]]


         
ROWS = 3
COLUMNS = 3


def createTable():

    for row in range(ROWS):
        for column in range(COLUMNS):
            table[row][column] = "-"


def printTable():
    
    for row in range(ROWS):
        for column in range(COLUMNS):
            print(table[row][column], end='  ')
            
        print("\n", end='')

def takeUserInput():
    rowUser = 0
    columnUser = 0
    rangeOfValues = range(1,4)

    rowUser = input("Choose a number between 1 and 3 for the row to choose: ")
    while not rowUser.isdigit() or (int(rowUser) not in rangeOfValues):
        rowUser = input("Choose a number between 1 and 3 for the row to choose: ")

    columnUser = input("Choose a number between 1 and 3 for the column to choose: ")
    while not columnUser.isdigit() or (int(columnUser) not in rangeOfValues):
        columnUser = input("Choose a number between 1 and 3 for the column to choose: ")

    row = int(rowUser)-1
    column = int(columnUser)-1

    return (row,column)


def checkData(same):
    if same[0] == same[1]:
        if same[0] == same[2]:
            return True

    return False


def checkHorizontal(row):
    control = table[row][0]

    for column in range(COLUMNS):
        if(table[row][column]) == "-" or not (table[row][column] == control):
            return False
    return True


def checkVertical(column):
    control = table[0][column]

    for row in range(ROWS):
        if(table[row][column]) == "-" or not (table[row][column] == control):
            return False
    return True


def checkDiagonal():
    control = table[1][1]

    for row in range(ROWS):
        for column in range(COLUMNS):
            if(row == column):
                if(table[row][column]) == "-" or not (table[row][column] == control):
                    return False
    return True



def checkAntiDiagonal():
    control = table[1][1]

    for row in range(ROWS):
        for column in range(COLUMNS):
            if(row + column == COLUMNS-1):
                if(table[row][column]) == "-" or not (table[row][column] == control):
                    return False
    return True




def checkWinner():
    
    pivot = table[1][1]
    won = False
    passes = []

    #Check up and down of pivot                 x
    if(pivot == "-" ):
        passes.append(checkHorizontal(0))
        passes.append(checkVertical(0))
        passes.append(checkHorizontal(2))
        passes.append(checkVertical(2))
    else :
        passes.append(checkHorizontal(0))
        passes.append(checkHorizontal(1))
        passes.append(checkHorizontal(2))
        passes.append(checkVertical(0))
        passes.append(checkVertical(1))
        passes.append(checkVertical(2))
        passes.append(checkDiagonal())
        passes.append(checkAntiDiagonal())
        
        
    if True in passes:
        won = True
    return won    


def mainGame():

    times = 0

    player1 = ""
    player2 = ""
    player1Turn = True
    playerPlaying = ("Player 2", "Player 1")

    finish = False

    createTable()
    printTable()

    player1 = input("Player 1 choose between 'X' or 'O' ")
    if(player1 == "X"):
        player2 = "O"
    else:
        player2 = "X"

    while(not finish and times < 8):
        playerName = ""
        figure = ""

        if(player1Turn):
            player = playerPlaying[1]
            figure = player1
        else:
            player = playerPlaying[0]
            figure = player2
        

        print("{} Turn".format(player))
        pos = takeUserInput()

        while not table[pos[0]][pos[1]] ==  "-":
            print("Please choose a non taken position")
            pos = takeUserInput()

        table[pos[0]][pos[1]] = figure

        player1Turn = not player1Turn

        printTable()
        print("\n")

        finish = checkWinner()
        times += 1

        print(times)

    print("Has ganado {} !".format(player))


mainGame()


    





