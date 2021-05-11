package in.ruchitha.leetcode.easy.linkedlist_arrays.simple_interpreter_part_two.Service;
import in.ruchitha.leetcode.easy.linkedlist_arrays.simple_interpreter_part_two.Model.Token;
import in.ruchitha.leetcode.easy.linkedlist_arrays.simple_interpreter_part_two.Model.TokenType;
import in.ruchitha.leetcode.easy.linkedlist_arrays.simple_interpreter_part_two.Service.LexicalAnalyzerV2;
import java.util.*;

public class Expr1 {
    private Map<Integer, Set<TokenType>>  structure;
    //private List<TokenType> list=new  ArrayList<TokenType>();
    /*
    index ->
    0 -> left
    1 -> middle
    2 -> right
     */
    public Expr1() {
       /* this.structure = new HashMap<>();
        this.structure.put(0, TokenType.INTEGER);
        this.structure.put(1,TokenType.INTEGER);
        this.structure.put(2, TokenType.PLUS);
        this.structure.put(3, TokenType.INTEGER);
        this.structure.put(4,TokenType.INTEGER);
    */
        this.structure = new HashMap<>();
        Set<TokenType> intOne = new HashSet<>();
        intOne.add(TokenType.INTEGER);
        this.structure.put(0,intOne);

        Set<TokenType> operators = new HashSet<>();
        operators.add(TokenType.PLUS);
        operators.add(TokenType.MINUS);
        operators.add(TokenType.MULTIPLICATION);
        operators.add(TokenType.DIVISION);
        this.structure.put(1,operators);

        Set<TokenType> intTwo = new HashSet<>();
        intTwo.add(TokenType.INTEGER);
        this.structure.put(2,intTwo);

       /*
         0->integer
         1->plus/minus
         2->integer
        */

    }

    private boolean validate(Token token, Set<TokenType> tokenType) {
        return ((token != null) && (tokenType.contains(token.getType())));
    }

    public int evaluate(String input) {
        if(input==null)
        {
            throw new IllegalArgumentException("Null value not allowed");
        }

        if(input.length()==0) {
            throw new IllegalArgumentException("Empty String not allowed");
        }
        Token[] tokens = new Token[3];
        /*
        structure of the language ->
        integer+integer and the integer are single digit
         */
        LexicalAnalyzerV2 analyzer = new LexicalAnalyzerV2(input);
        for (int i=0;i<3;i++){
            tokens[i]=analyzer.getNextToken();
            if (!validate(tokens[i], this.structure.get(i))) { //this.structure.get(0) -> o/p -> TokenType.INTEGER
                throw new IllegalArgumentException("The input is invalid : Valid is : <int>operator<int> where <int> cab be any digit " +
                        "and allowed operators are [+,-,*,/]");
            }
        }

        switch(tokens[1].getType()){
            case PLUS:
                return (Integer.parseInt(tokens[0].getValue())+Integer.parseInt(tokens[2].getValue()));
            case MINUS:
                return (Integer.parseInt(tokens[0].getValue())-Integer.parseInt(tokens[2].getValue()));
            case MULTIPLICATION:
                return (Integer.parseInt(tokens[0].getValue())*Integer.parseInt(tokens[2].getValue()));
            case DIVISION:
                if (tokens[2].getValue().equals("0")) {
                    throw new IllegalArgumentException("The input is invalid : Valid is : <int>/<int> where second <int> should be greater than 0");
                }
                return (Integer.parseInt(tokens[0].getValue())/Integer.parseInt(tokens[2].getValue()));

        }
        return 0;
    }
}

